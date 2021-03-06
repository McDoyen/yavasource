// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package core_security.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the core_security module
	public static void cancelPasswordChange_Admin(IContext context, core_security.proxies.PasswordHelper _passwordHelper)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
			Core.execute(context, "core_security.cancelPasswordChange_Admin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void changePasswordHash(IContext context, mendix.proxies.Account _account, java.lang.Long _historyMax, java.lang.String _newHash)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			params.put("historyMax", _historyMax);
			params.put("newHash", _newHash);
			Core.execute(context, "core_security.changePasswordHash", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mendix.proxies.Account getCurrentAccountFromDatabase(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "core_security.getCurrentAccountFromDatabase", params);
			return result == null ? null : mendix.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static core_security.proxies.PasswordHelper getPasswordHelper(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "core_security.getPasswordHelper", params);
			return result == null ? null : core_security.proxies.PasswordHelper.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static core_security.proxies.PasswordHelper getPasswordHelperForAccount(IContext context, mendix.proxies.Account _account)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "core_security.getPasswordHelperForAccount", params);
			return result == null ? null : core_security.proxies.PasswordHelper.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static core_security.proxies.PasswordRuleConfig getSystemPasswordRuleConfig(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "core_security.getSystemPasswordRuleConfig", params);
			return result == null ? null : core_security.proxies.PasswordRuleConfig.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void initPasswordRules(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "core_security.initPasswordRules", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokeOpenPasswordRuleConfiguration(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "core_security.invokeOpenPasswordRuleConfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean invokePersistPassword(IContext context, core_security.proxies.PasswordHelper _passwordHelper)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "core_security.invokePersistPassword", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean invokePersistPasswordHomepage(IContext context, core_security.proxies.PasswordHelper _passwordHelper)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "core_security.invokePersistPasswordHomepage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokePersonAccountChangePassword(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "core_security.invokePersonAccountChangePassword", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokeSavePasswordRulesConfig(IContext context, core_security.proxies.PasswordRuleConfig _passwordRuleConfig)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PasswordRuleConfig", _passwordRuleConfig == null ? null : _passwordRuleConfig.getMendixObject());
			Core.execute(context, "core_security.invokeSavePasswordRulesConfig", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokeSkipChangePassword(IContext context, core_security.proxies.PasswordHelper _passwordHelper)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
			Core.execute(context, "core_security.invokeSkipChangePassword", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokeTestUpdateHashToMax(IContext context, mendix.proxies.Account _account)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			Core.execute(context, "core_security.invokeTestUpdateHashToMax", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean passwordRuleConfig_BeforeCommit(IContext context, core_security.proxies.PasswordRuleConfig _passwordRuleConfig)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PasswordRuleConfig", _passwordRuleConfig == null ? null : _passwordRuleConfig.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "core_security.PasswordRuleConfig_BeforeCommit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean persistPassword(IContext context, core_security.proxies.PasswordHelper _passwordHelper)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "core_security.persistPassword", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void shortenPasswordHash(IContext context, mendix.proxies.Account _account, java.lang.Long _historyMax)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Account", _account == null ? null : _account.getMendixObject());
			params.put("historyMax", _historyMax);
			Core.execute(context, "core_security.shortenPasswordHash", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void updatePasswordHistoryOnAccounts(IContext context, core_security.proxies.PasswordRuleConfig _passwordRuleConfig)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PasswordRuleConfig", _passwordRuleConfig == null ? null : _passwordRuleConfig.getMendixObject());
			Core.execute(context, "core_security.updatePasswordHistoryOnAccounts", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean validatePassword(IContext context, core_security.proxies.PasswordHelper _passwordHelper, mendix.proxies.Account _account, boolean _byUser)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
			params.put("Account", _account == null ? null : _account.getMendixObject());
			params.put("ByUser", _byUser);
			return (java.lang.Boolean)Core.execute(context, "core_security.validatePassword", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}