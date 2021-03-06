// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package genericuserfunctions.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the GenericUserFunctions module
	public static mendix.proxies.Account canUseLuceneSearch(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GenericUserFunctions.canUseLuceneSearch", params);
			return result == null ? null : mendix.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mendix.proxies.Account canUseMyExports(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GenericUserFunctions.canUseMyExports", params);
			return result == null ? null : mendix.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mendix.proxies.Account canUseNewPortalRequestFunction(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GenericUserFunctions.canUseNewPortalRequestFunction", params);
			return result == null ? null : mendix.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mendix.proxies.Account canUseNewRequestFunction(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GenericUserFunctions.canUseNewRequestFunction", params);
			return result == null ? null : mendix.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mendix.proxies.Account canUseNotificationCenter(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GenericUserFunctions.canUseNotificationCenter", params);
			return result == null ? null : mendix.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean checkAccountPassword(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.CheckAccountPassword", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean checkChosenPortalLandingPage(IContext context, mendix.proxies.AccountPreferences _accountPreferences)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AccountPreferences", _accountPreferences == null ? null : _accountPreferences.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.CheckChosenPortalLandingPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean checkChosenProcessLandingPage(IContext context, mendix.proxies.AccountPreferences _accountPreferences)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AccountPreferences", _accountPreferences == null ? null : _accountPreferences.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.CheckChosenProcessLandingPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static genericuserfunctions.proxies.UserProfile createUserProfileObject(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GenericUserFunctions.CreateUserProfileObject", params);
			return result == null ? null : genericuserfunctions.proxies.UserProfile.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String getAccountPersonEmail(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.String)Core.execute(context, "GenericUserFunctions.GetAccountPersonEmail", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String getAccountPersonFullName(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.String)Core.execute(context, "GenericUserFunctions.GetAccountPersonFullName", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static genericuserfunctions.proxies.UserSessionObject getUserSessionObject(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GenericUserFunctions.GetUserSessionObject", params);
			return result == null ? null : genericuserfunctions.proxies.UserSessionObject.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void gotoAdminNextAccessibleLandingPage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "GenericUserFunctions.GotoAdminNextAccessibleLandingPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	/**
	 * [#189073] New microflow to be used as that 'homepage' when users login via a mobile client
	 * Microflow checks if the user is a Portal User, Process User, and/or Data Admin. If any, it performs a check if passwords needs to be reset.
	 * Afterwards it opens the actual home page based on the user role. Order of check (Process User, Portal User, Data Admin)
	 */
	public static void gotoMobileLandingPage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "GenericUserFunctions.GotoMobileLandingPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void gotoPortalLandingPage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "GenericUserFunctions.GotoPortalLandingPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void gotoPortalNextAccessibleLandingPage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "GenericUserFunctions.GotoPortalNextAccessibleLandingPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void gotoProcessLandingPage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "GenericUserFunctions.GotoProcessLandingPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void gotoProcessNextAccessibleLandingPage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "GenericUserFunctions.GotoProcessNextAccessibleLandingPage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isAccountAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isAccountAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isAndOtherThanPortalUser_MEM(IContext context, mendix.proxies.Account _account)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isAndOtherThanPortalUser_MEM", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isAnyAdminUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isAnyAdminUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isApplicationAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isApplicationAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isCMDBAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isCMDBAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isCMDBUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isCMDBUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isCurrentPortalUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isCurrentPortalUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isDataAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isDataAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isDebugUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isDebugUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isInterfaceAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isInterfaceAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isLDAPAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isLDAPAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isLVNLAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isLVNLAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isMxAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isMxAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isOnlyPortalUser_MEM(IContext context, mendix.proxies.Account _account)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isOnlyPortalUser_MEM", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mendix.proxies.Account isPortalAccount(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GenericUserFunctions.isPortalAccount", params);
			return result == null ? null : mendix.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isPortalOrProcessUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isPortalOrProcessUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isPortalOrProcessUser_MEM(IContext context, mendix.proxies.Account _account)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isPortalOrProcessUser_MEM", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isPortalUser(IContext context, system.proxies.User _user)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("User", _user == null ? null : _user.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isPortalUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isPortalUser_MEM(IContext context, mendix.proxies.Account _account)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isPortalUser_MEM", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mendix.proxies.Account isProcessAccount(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "GenericUserFunctions.isProcessAccount", params);
			return result == null ? null : mendix.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isProcessUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isProcessUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isSystemAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isSystemAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean isWebshopUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.isWebshopUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void openMyExports(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "GenericUserFunctions.openMyExports", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void refreshUserSessionObject(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "GenericUserFunctions.RefreshUserSessionObject", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean userProfileCalculated_isAdminOrDebugUser(IContext context, genericuserfunctions.proxies.UserProfile _userProfile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.UserProfileCalculated_isAdminOrDebugUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean userProfileCalculated_isAnyAdminUser(IContext context, genericuserfunctions.proxies.UserProfile _userProfile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.UserProfileCalculated_isAnyAdminUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean userProfileCalculated_isDebugUser(IContext context, genericuserfunctions.proxies.UserProfile _userProfile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GenericUserFunctions.UserProfileCalculated_isDebugUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}