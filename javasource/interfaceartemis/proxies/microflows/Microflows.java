// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceartemis.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the InterfaceArtemis module
	public static void iVK_ReProcessProject(IContext context, interfaceartemis.proxies.Project _project)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Project", _project == null ? null : _project.getMendixObject());
			Core.execute(context, "InterfaceArtemis.IVK_ReProcessProject", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void processProject(IContext context, interfaceartemis.proxies.Project _project)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Project", _project == null ? null : _project.getMendixObject());
			Core.execute(context, "InterfaceArtemis.ProcessProject", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sE_ImportArtemis(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "InterfaceArtemis.SE_ImportArtemis", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}