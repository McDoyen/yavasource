package interfaceldap;

import interfaceconfiguration.proxies.AuthenticationBehaviour;
import interfaceconfiguration.proxies.LDAPInterfaceConfiguration;
import interfaceshared.InterfaceSingle;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import mendix.proxies.Account;

import org.springframework.ldap.CommunicationException;

import system.proxies.User;
import system.proxies.UserRole;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.AuthenticationRuntimeException;
import com.mendix.systemwideinterfaces.core.ISession;
import com.mendix.systemwideinterfaces.core.IUser;
import com.mendix.systemwideinterfaces.core.UserAction;

import communitycommons.XPath;

public class LDAPLoginAction extends UserAction<ISession> {

	private ReentrantLock lock = new ReentrantLock();
	
	private final String username;
	private final String password;
	
	public final static String SESSION_MANAGER_PARAM = "sessionManager";
	public final static String USER_NAME_PARAM = "userName";
	public final static String PASSWORD_PARAM = "password";
	public final static String LOCALE_PARAM = "locale";
	public final static String CURRENT_SESSION_ID_PARAM = "currentSessionId";
	
	public LDAPLoginAction(Map<String,? extends Object> params) {
		super(Core.createSystemContext());
		this.username = (String)params.get(USER_NAME_PARAM);
		this.password = (String)params.get(PASSWORD_PARAM);
	}


	@Override
	public ISession executeAction() throws Exception {
		//Check if LDAP authentication is enabled for this server, if so authenticate the user against the AD, if not, authenticate the user against the local credentials.
		IUser IUser = Core.getUser(this.getContext(), username);
		if (IUser == null){
			throw new AuthenticationRuntimeException("Login FAILED: unknown local user " + username + " , is the userbase in sync?");
		}
		User user = User.initialize(this.getContext(), IUser.getMendixObject());
		ISession result = null;	
		try {
		    if (username == null || username.isEmpty()){
		    	throw new AuthenticationRuntimeException("LdapLogin FAILED: empty usernames are not allowed");
		    }
		    if (password == null || password.isEmpty()){
		    	throw new AuthenticationRuntimeException("LdapLogin FAILED: user " + username + " attempted to login with an empty password");
		    }
		    if(!user.getActive()){
		    	throw new AuthenticationRuntimeException("LdapLogin FAILED: user " + username + " is not active in ExpertDesk");
		    }
    		if(user.getBlocked()){
    			throw new AuthenticationRuntimeException("LdapLogin FAILED: user " + username + " is blocked in ExpertDesk");
    		}
			if(ldapAuthenticationEnabled() && !useLocalAuthentication(username)){
				if (LDAPModule.getInstance().authenticateUser(this.getContext(), username, password)) {
					result = initializeUser(user, IUser, result);					
				}
			}
			else{
				if(Core.authenticate(this.getContext(), IUser, password)){
					result = initializeUser(user, IUser, result);
				}
			}
			if (result == null){
				setLoginFailed(user);
				throw new AuthenticationRuntimeException("LdapLogin FAILED: invalid credentials for user " + username);
			}
			else{
				setLoginSuccess(user);
			}
			return result;			
		}
		catch (CommunicationException ce){
			//When the AD cannot be reached, check to see if the user is allowed to authenticate against local credentials.
			if(allowFallbackLocalAuthentication(username)){
				if(Core.authenticate(this.getContext(), IUser, password)){
					String errorMessage = "There was a problem connecting to the authentication server, local authentication successful.";
					Core.getLogger("LDAP").error(errorMessage);
					setLoginSuccess(user);
					return initializeUser(user, IUser, result);
				}
				else{
					String errorMessage = "LdapLogin FAILED: there was a problem connecting to the authentication server, local authentication failed with provided credentials.";
					Core.getLogger("LDAP").error(errorMessage);
					setLoginFailed(user);
					throw new AuthenticationRuntimeException(errorMessage);
				}
			}
			String errorMessage = "there was a problem connecting to the authentication server, this account is not allowed to log in using local credentials";
			//An error message is also shown in the console because the AuthenticationRuntimeException will only create an info message in the console (the seriousness of the issue deserves an error).
			Core.getLogger("LDAP").error(errorMessage);
			throw new AuthenticationRuntimeException(errorMessage);
		}
		catch(CoreException ce) {
			throw new AuthenticationRuntimeException("LdapLogin FAILED: error while checking login, could not initialize user: " + ce.getMessage());
		}
	}

	private ISession initializeUser(User user, IUser IUser, ISession result)	throws CoreException {
		if (user.getUserRoles().size() > 0) {
			lock.lock();
			try
			{
				result = Core.initializeSession(IUser, this.getContext().getSession().getId().toString());
			}	
			finally
			{
				lock.unlock();	
			}
		}
		else
			throw new AuthenticationRuntimeException("Login FAILED: user " + username + " has no userroles");
		return result;
	}
	
	@Override
	public String toString() {
		return "[LdapLoginAction:: username: " + username + " password: " + "]";
	}
	
	private boolean allowFallbackLocalAuthentication(String username)  {
		boolean result = false;
		LDAPInterfaceConfiguration hostLDAPInterfaceConfiguration = getHostLDAPInterfaceConfiguration();
		if(hostLDAPInterfaceConfiguration == null){
			return true;
		}
		else{
			if(hostLDAPInterfaceConfiguration.getAllowFallbackLocalAuthentication() == AuthenticationBehaviour.Allow_Local_Authentication_For_Selected_Roles){
				try {			
					XPath<User> usersXPath = XPath.create(Core.createSystemContext(), User.class).eq(User.MemberNames.Name, username).and().subconstraint(User.MemberNames.UserRoles, UserRole.entityName).eq(UserRole.MemberNames.Name,InterfaceSingle.getInstance().getSA_LDAPAdminRole().getName()).or().subconstraint(interfaceconfiguration.proxies.UserRole.MemberNames.UserRole_UserRole, interfaceconfiguration.proxies.UserRole.entityName).eq(LDAPInterfaceConfiguration.MemberNames.LDAPInterfaceConfiguration_LdapServerByPassUserRole, hostLDAPInterfaceConfiguration).close().close();
					User user = usersXPath.first();
					if (user != null){
						Core.getLogger(LDAPModule.LDAP_LOG).info("Allow fallback local authentication for '" + username + "'");
						return true;
					}
					else{
						return false;
					}
				} catch (CoreException e) {
					Core.getLogger("LDAP").error("Could not retrieve userrole to determine whether to use LDAP authentication or not: " + e.getMessage(),e);
				}
			}
			else{
				result = true;
			}
			return result;
		}
	}
	
	public static boolean useLocalAuthentication(String username) {
		boolean result = false;
		//Use local authentication when this is the MxAdmin user
		if(username.equals(InterfaceSingle.getInstance().getUser())){
			Core.getLogger(LDAPModule.LDAP_LOG).info("Bypassing LDAP authentication for '" + username + "'");
			return true;
		}
		//Use local authentication when UseLocalAuthorization is true 
		XPath<Account> accountXPath = XPath.create(Core.createSystemContext(), Account.class).eq(User.MemberNames.Name, username).and().eq(Account.MemberNames.UseLocalAuthorization, true);
		try{
			Account account = accountXPath.first();
			if(account != null){
				Core.getLogger(LDAPModule.LDAP_LOG).info("Bypassing LDAP authentication for '" + username + "'");
				return true;
			}
			else{
				return false;
			}
		}
		catch(CoreException ce){
			return result;
		}
	}
	
	public static boolean ldapAuthenticationEnabled(){
		if(getHostLDAPInterfaceConfiguration() != null){
			return true;
		}
		return false;
	}
		
	public static LDAPInterfaceConfiguration getHostLDAPInterfaceConfiguration(){
		try{
			String hostName = InetAddress.getLocalHost().getHostName();
			XPath<LDAPInterfaceConfiguration> hostLDAPInterfaceConfigurationsXPath = XPath.create(Core.createSystemContext(), LDAPInterfaceConfiguration.class).eq(LDAPInterfaceConfiguration.MemberNames.HostName, hostName).and().eq(LDAPInterfaceConfiguration.MemberNames.UseLDAP, true);
			return hostLDAPInterfaceConfigurationsXPath.first();
		}
		catch(UnknownHostException uhe){
			Core.getLogger("LDAP").error("An error occured during host name resolution, this functionality is used in the interface to determine current host, which in turn is used to determine which ldap configuration entry to use.");
			return null;
		}
		catch (CoreException e) 
		{
			Core.getLogger("LDAP").error("Could not retrieve userrole to determine whether to use LDAP authentication or not: " + e.getMessage(),e);
			return null;
		}
	}
	
	private void setLoginSuccess(User user){
		user.setFailedLogins(0);
		try {
			//user.commit();
			Core.commitWithoutEvents(this.getContext(), user.getMendixObject());
		}
		catch(Throwable e) {
			Core.getLogger("LDAP").error("An error occured during commit of account failed logins for user " + user.getName() + " the error is: " + e.getMessage());
		}
	}
	
	private void setLoginFailed(User user){
		user.setFailedLogins(user.getFailedLogins() + 1);
		if(user.getFailedLogins() >= 3){
			user.setBlocked(true);
		}
		try {
			//user.commit();
			Core.commitWithoutEvents(this.getContext(), user.getMendixObject());
		}
		catch(Throwable e) {
			Core.getLogger("LDAP").error("An error occured during commit of account failed logins for user " + user.getName() + " the error is: " + e.getMessage());
		}		
	}
}
