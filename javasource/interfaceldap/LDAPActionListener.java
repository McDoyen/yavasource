package interfaceldap;

import interfaceconfiguration.proxies.LDAPInterfaceConfiguration;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.core.action.user.LoginAction;
import com.mendix.systemwideinterfaces.core.UserActionListener;

/**
 * Standard Commit listener
 * 
 * @author J. den Haan
 */
public class LDAPActionListener extends UserActionListener<LoginAction>
{

	/**
	 * @param targetClass
	 */
	public LDAPActionListener()
	{
		super(LoginAction.class);
	}

	/* (non-Javadoc)
	 * @see com.mendix.systemwideinterfaces.core.UserActionListener#check(com.mendix.systemwideinterfaces.core.UserAction)
	 */
	@Override
	public boolean check(LoginAction action)
	{
		if (action == null)
			throw new IllegalArgumentException("Action should not be null");
		try {
			long count = Core.retrieveXPathQueryAggregate(Core.createSystemContext(), String.format("count(//%s[%s = true()])",LDAPInterfaceConfiguration.getType(), LDAPInterfaceConfiguration.MemberNames.UseLDAP.toString()));
			return count > 0;
		} catch (CoreException e) {
			Core.getLogger(LDAPModule.LDAP_LOG).error("Error while counting number of LDAP servers");
			return false; //do not replace
		}
	}
}
