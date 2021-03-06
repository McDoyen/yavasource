// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowshared.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the WorkflowShared module
	public static void auditConditionType_AfterCommit(IContext context, workflowshared.proxies.ConditionType _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "WorkflowShared.AuditConditionType_AfterCommit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean auditConditionType_AfterDelete(IContext context, workflowshared.proxies.ConditionType _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowShared.AuditConditionType_AfterDelete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditConditionType_GetAuditRecord(IContext context, workflowshared.proxies.ConditionType _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "WorkflowShared.AuditConditionType_GetAuditRecord", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditNodeType_AfterCommit(IContext context, workflowshared.proxies.NodeType _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "WorkflowShared.AuditNodeType_AfterCommit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean auditNodeType_AfterDelete(IContext context, workflowshared.proxies.NodeType _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowShared.AuditNodeType_AfterDelete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditNodeType_GetAuditRecord(IContext context, workflowshared.proxies.NodeType _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "WorkflowShared.AuditNodeType_GetAuditRecord", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditWorkflowResult_AfterCommit(IContext context, workflowshared.proxies.WorkflowResult _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "WorkflowShared.AuditWorkflowResult_AfterCommit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean auditWorkflowResult_AfterDelete(IContext context, workflowshared.proxies.WorkflowResult _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowShared.AuditWorkflowResult_AfterDelete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditWorkflowResult_GetAuditRecord(IContext context, workflowshared.proxies.WorkflowResult _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "WorkflowShared.AuditWorkflowResult_GetAuditRecord", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditWorkflowSignal_AfterCommit(IContext context, workflowshared.proxies.WorkflowSignal _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "WorkflowShared.AuditWorkflowSignal_AfterCommit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean auditWorkflowSignal_AfterDelete(IContext context, workflowshared.proxies.WorkflowSignal _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowShared.AuditWorkflowSignal_AfterDelete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditWorkflowSignal_GetAuditRecord(IContext context, workflowshared.proxies.WorkflowSignal _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "WorkflowShared.AuditWorkflowSignal_GetAuditRecord", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean nodeTypeValidations_AC(IContext context, workflowshared.proxies.NodeType _nodeType)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NodeType", _nodeType == null ? null : _nodeType.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowShared.NodeTypeValidations_AC", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void workflowResult_OpenSelect(IContext context, workflowexecution.proxies.NodeVisit _nodeVisit)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NodeVisit", _nodeVisit == null ? null : _nodeVisit.getMendixObject());
			Core.execute(context, "WorkflowShared.WorkflowResult_OpenSelect", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}