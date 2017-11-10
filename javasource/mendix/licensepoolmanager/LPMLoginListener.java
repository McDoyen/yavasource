package mendix.licensepoolmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import system.proxies.Session;

import system.proxies.User;

import mendix.proxies.Account;
import mendix.proxies.LicensePool;
import mendix.proxies.PoolType;
import mendix.proxies.UserLimit;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.core.action.user.LoginAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.ISession;
import com.mendix.systemwideinterfaces.core.UserActionListener;
import communitycommons.XPath;

public class LPMLoginListener extends UserActionListener<LoginAction> {

	public LPMLoginListener(Class<LoginAction> arg0) {
		super(arg0);
		this.addBeforeEvent(LPMLoginAction.class.getCanonicalName(), false);
	}

	@Override
	public boolean check(LoginAction action) {

		try {
			
			String checkValue = performCheck(action);
			if (checkValue==null) {
				return false;
			} else {
				//action.addTextMessageFeedback(MessageType.INFO, checkValue, false); // does not arrive at client due to exception
				return true;
			}
		} catch (Exception e) {
			throw new RuntimeException("Exception in LPMLoginListener:", e);
		}
	}

	private static synchronized String performCheck(LoginAction action) throws CoreException {
		/*
		 * Attempts to retrieve accounts matching the username which is trying
		 * to be logged in
		 */
		List<IMendixObject> userlist = Core.retrieveXPathQueryEscaped(
				action.getContext(), "//%s[%s='%s']", Account.entityName,
				User.MemberNames.Name.toString(), action.getUserName());

		/*
		 * If no matching username is found, returns false to continue login
		 * process which will reject the attempt.
		 */
		if (userlist.size() == 0) {
			return null;
		}

		/*
		 * Initialize account and licensepool objects for the user trying to log
		 * in
		 */
		Account account = Account.initialize(action.getContext(), userlist.get(0));
		LicensePool licensepool = account.getAccount_LicensePool();
		
		
		/*
		 * If account has no license pool then get the default pool
		 */
		if (licensepool==null) {
			XPath<LicensePool> xPath = XPath.create(action.getContext(), mendix.proxies.LicensePool.class);
	        xPath.eq(LicensePool.MemberNames.IsDefault, true);
	        if (xPath.count()>0) {
	        	licensepool = xPath.first();
	        } else {
	        	return null; // if no default license pool and user has no license pool then no pool check
	        }
		}
		
		/*
		 * If the licensepool has no concurrent user limit, returns false to let
		 * the user log in
		 */
		if (licensepool.getConcurrentUserLimit() == UserLimit.Unlimited) {
			return null;
		}

		/*
		 * Retrieves the online Accounts from the licensepool to which is being
		 * logged in
		 */
		List<Account> PoolUsersOnline = new ArrayList<Account>();
		List<Account> BufferUsersOnline = new ArrayList<Account>();
		
		if (Core.getConfiguration().enablePersistentSessions()) {
			Core.getLogger("LicensePoolManager").debug("Checking System.Session");
			Date now = new Date();
			Long active = now.getTime() - Core.getConfiguration().getSessionTimeout();
			List<IMendixObject> listIMendixObject = Core.retrieveXPathQuery(action.getContext(), "//System.Session");
			if (listIMendixObject!=null) for (IMendixObject iMendixObject:listIMendixObject) {
				Session session = Session.initialize(action.getContext(), iMendixObject);
				if (session.getLastActive().getTime()<active) continue;
				User user = session.getSession_User();
				if (Core.isSubClassOf(Account.getType(), user.getMendixObject().getType())) {
					Account loggedaccount = Account.initialize(action.getContext(),	user.getMendixObject());
					//Get if user is using a buffer license
					if(loggedaccount.getUseBufferLicense()){
						BufferUsersOnline.add(loggedaccount);
					}else if (loggedaccount.getAccount_LicensePool().equals(licensepool)) {
						PoolUsersOnline.add(loggedaccount);
					}
				}
			}
		} else {
			Core.getLogger("LicensePoolManager").debug("Checking memory");
			Collection<? extends ISession> activeSessions = Core.getActiveSessions();
			for (ISession i : activeSessions) {
				IMendixObject user = i.getUser().getMendixObject();
				if (Core.isSubClassOf(Account.getType(), user.getType())) {
					Account loggedaccount = Account.initialize(action.getContext(),	user);					
					//Get if user is using a buffer license
					if(loggedaccount.getUseBufferLicense()){
						BufferUsersOnline.add(loggedaccount);
					}else if (loggedaccount.getAccount_LicensePool().equals(licensepool)) {
						PoolUsersOnline.add(loggedaccount);
					}
				}
			}
		}
		
		Core.getLogger("LicensePoolManager").debug("User in "+licensepool.getName()+" is "+PoolUsersOnline.size());
		Core.getLogger("LicensePoolManager").debug("User in bufferpool is "+BufferUsersOnline.size());
		
		/*
		 * Returns false if the current number of concurrent users for the
		 * licensepool is not at the limit, allowing the login process to
		 * continue.
		 */
		if (licensepool.getMaxConcurrentUsersSpecified()
				- PoolUsersOnline.size() > 0) {
			Core.getLogger("LicensePoolManager").debug("Use LicensePool: "+licensepool.getName());
			account.setUseBufferLicense(false);			
			//account.commit();
			Core.commitWithoutEvents(action.getContext(), account.getMendixObject());
			return null;
		}

		/*
		 * If the user is already logged in, returns false to let the login
		 * procedure continue. This will create a new session for this user and
		 * kill the old session.
		 */
		if (PoolUsersOnline.contains(account)) {
			Core.getLogger("LicensePoolManager").debug("User already logged in with pool: "+licensepool.getName());
			return null;
		}
		
		/*
		 * If the user is already logged in with a buffer license, returns false to let the login
		 * procedure continue. This will create a new session for this user and
		 * kill the old session.
		 */
		if (BufferUsersOnline.contains(account)) {
			Core.getLogger("LicensePoolManager").debug("User already logged in with bufferpool");
			return null;
		}
		
		/*
		 * Check if a license is available in buffer pool.
		 * If so, let the users use a buffer license
		 */
		LicensePool bufferPool;
		XPath<LicensePool> xPath = XPath.create(action.getContext(), mendix.proxies.LicensePool.class);
        xPath.eq(LicensePool.MemberNames.PoolType, PoolType.Buffer);
        if (xPath.count()>0) {
        	bufferPool = xPath.first();
        	
        	if(bufferPool.getMaxConcurrentUsersSpecified() - BufferUsersOnline.size() > 0){
        		Core.getLogger("LicensePoolManager").debug("Use Bufferpool for user: "+account.getName());
        		account.setUseBufferLicense(true);
        		//account.commit();
        		Core.commitWithoutEvents(action.getContext(), account.getMendixObject());
        		return null;
        	}
        } 
		
		
		/*
		 * If all previous checks failed, the user is trying to log on while his
		 * licensepool is at its limit and he is not logged in yet. By returning
		 * true the login action is called which throws an exception and blocks
		 * the login attempt.
		 */
		String error = "Login failed for user "
				+ account.getName()
				+ " from licensepool "
				+ licensepool.getName()
				+ " as "
				+ PoolUsersOnline.size()
				+ " out of "
				+ licensepool.getMaxConcurrentUsersSpecified()
				+ " available concurrent user licenses are currently in use.";
		Core.getLogger("LicensePoolManager").info(error);

		return error;
	}
}