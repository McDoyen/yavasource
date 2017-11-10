// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package saml20_custom.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the SAML20_Custom module
	/**
	 * 5092 Microflow to open configuration pagefor SAML20
	 */
	public static void openConfiguration(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "SAML20_Custom.OpenConfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}