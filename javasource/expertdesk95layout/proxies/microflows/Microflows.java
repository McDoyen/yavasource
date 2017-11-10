// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package expertdesk95layout.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the ExpertDesk95Layout module
	public static void iVK_ClosePage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "ExpertDesk95Layout.IVK_ClosePage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DoNothing(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "ExpertDesk95Layout.IVK_DoNothing", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ExpertDeskExample_SelectCancel(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "ExpertDesk95Layout.IVK_ExpertDeskExample_SelectCancel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ExpertDeskExample_SelectWithObjectCancel(IContext context, expertdesk95layout.proxies.ExampleEntity _exampleEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ExampleEntity", _exampleEntity == null ? null : _exampleEntity.getMendixObject());
			Core.execute(context, "ExpertDesk95Layout.IVK_ExpertDeskExample_SelectWithObjectCancel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ExpertDeskExampleConfigPageCancel(IContext context, expertdesk95layout.proxies.ExampleEntity _exampleEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ExampleEntity", _exampleEntity == null ? null : _exampleEntity.getMendixObject());
			Core.execute(context, "ExpertDesk95Layout.IVK_ExpertDeskExampleConfigPageCancel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ExpertDeskExampleConfigPageSave(IContext context, expertdesk95layout.proxies.ExampleEntity _exampleEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ExampleEntity", _exampleEntity == null ? null : _exampleEntity.getMendixObject());
			Core.execute(context, "ExpertDesk95Layout.IVK_ExpertDeskExampleConfigPageSave", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ExpertDeskExampleConfigPageSaveAndClose(IContext context, expertdesk95layout.proxies.ExampleEntity _exampleEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ExampleEntity", _exampleEntity == null ? null : _exampleEntity.getMendixObject());
			Core.execute(context, "ExpertDesk95Layout.IVK_ExpertDeskExampleConfigPageSaveAndClose", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ExpertDeskExampleConfigPageSaveAndNewContent(IContext context, expertdesk95layout.proxies.ExampleEntity _exampleEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ExampleEntity", _exampleEntity == null ? null : _exampleEntity.getMendixObject());
			Core.execute(context, "ExpertDesk95Layout.IVK_ExpertDeskExampleConfigPageSaveAndNewContent", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenPopup(IContext context, expertdesk95layout.proxies.ExampleEntity _exampleEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ExampleEntity", _exampleEntity == null ? null : _exampleEntity.getMendixObject());
			Core.execute(context, "ExpertDesk95Layout.IVK_OpenPopup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean mCa_ShowExamplePage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "ExpertDesk95Layout.MCa_ShowExamplePage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}