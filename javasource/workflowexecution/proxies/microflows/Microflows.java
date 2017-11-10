// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowexecution.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the WorkflowExecution module
	public static void cancelNode_CoRecursive(IContext context, workflowexecution.proxies.WorkflowVisit _workflowVisit, workflowinstance.proxies.Node _node, workflowshared.proxies.WorkflowResult _workflowResult, java.lang.Long _level)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowVisit", _workflowVisit == null ? null : _workflowVisit.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			params.put("WorkflowResult", _workflowResult == null ? null : _workflowResult.getMendixObject());
			params.put("Level", _level);
			Core.execute(context, "WorkflowExecution.CancelNode_CoRecursive", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void cancelNodeVisit_CoRecursive(IContext context, workflowexecution.proxies.NodeVisit _nodeVisit, workflowshared.proxies.WorkflowResult _workflowResult, java.lang.Long _level)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NodeVisit", _nodeVisit == null ? null : _nodeVisit.getMendixObject());
			params.put("WorkflowResult", _workflowResult == null ? null : _workflowResult.getMendixObject());
			params.put("Level", _level);
			Core.execute(context, "WorkflowExecution.CancelNodeVisit_CoRecursive", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void cancelWorkflow(IContext context, workflowexecution.proxies.RequestWorkflowInstance _requestWorkflowInstance, process.proxies.Request _request)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RequestWorkflowInstance", _requestWorkflowInstance == null ? null : _requestWorkflowInstance.getMendixObject());
			params.put("Request", _request == null ? null : _request.getMendixObject());
			Core.execute(context, "WorkflowExecution.CancelWorkflow", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void cancelWorkflow_CoRecursive(IContext context, workflowexecution.proxies.WorkflowVisit _workflowVisit, java.lang.Long _level, workflowshared.proxies.WorkflowResult _workflowResult)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowVisit", _workflowVisit == null ? null : _workflowVisit.getMendixObject());
			params.put("Level", _level);
			params.put("WorkflowResult", _workflowResult == null ? null : _workflowResult.getMendixObject());
			Core.execute(context, "WorkflowExecution.CancelWorkflow_CoRecursive", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void cancelWorkflowButton(IContext context, workflowexecution.proxies.WorkflowVisit _workflowVisit)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowVisit", _workflowVisit == null ? null : _workflowVisit.getMendixObject());
			Core.execute(context, "WorkflowExecution.CancelWorkflowButton", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean checkCondition(IContext context, workflowinstance.proxies.Condition _condition, workflowexecution.proxies.NodeVisit _nodeVisit)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Condition", _condition == null ? null : _condition.getMendixObject());
			params.put("NodeVisit", _nodeVisit == null ? null : _nodeVisit.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowExecution.CheckCondition", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean checkMergeNode(IContext context, workflowexecution.proxies.MergeNodeVisit _mergeNodeVisit)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MergeNodeVisit", _mergeNodeVisit == null ? null : _mergeNodeVisit.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowExecution.CheckMergeNode", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean checkRequestCondition(IContext context, process.proxies.Request _request, workflowinstance.proxies.RequestCondition _requestCondition)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Request", _request == null ? null : _request.getMendixObject());
			params.put("RequestCondition", _requestCondition == null ? null : _requestCondition.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowExecution.CheckRequestCondition", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void checkTimerNodeVisits(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "WorkflowExecution.CheckTimerNodeVisits", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowinstance.proxies.Condition copyConditionFromTemplateToInstance(IContext context, workflowtemplate.proxies.Condition _oldCondition, workflowinstance.proxies.Workflow _newWorkflow)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("OldCondition", _oldCondition == null ? null : _oldCondition.getMendixObject());
			params.put("NewWorkflow", _newWorkflow == null ? null : _newWorkflow.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.CopyConditionFromTemplateToInstance", params);
			return result == null ? null : workflowinstance.proxies.Condition.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void copyFixNodesOnRequestInstance(IContext context, workflowtemplate.proxies.Workflow _oldWorkflow, workflowinstance.proxies.Workflow _newWorkflow)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("OldWorkflow", _oldWorkflow == null ? null : _oldWorkflow.getMendixObject());
			params.put("NewWorkflow", _newWorkflow == null ? null : _newWorkflow.getMendixObject());
			Core.execute(context, "WorkflowExecution.CopyFixNodesOnRequestInstance", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void copyLinkFromTemplateToInstance(IContext context, workflowinstance.proxies.Workflow _newWorkflow, workflowtemplate.proxies.Link _oldLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewWorkflow", _newWorkflow == null ? null : _newWorkflow.getMendixObject());
			params.put("OldLink", _oldLink == null ? null : _oldLink.getMendixObject());
			Core.execute(context, "WorkflowExecution.CopyLinkFromTemplateToInstance", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void copyNodeFromTemplateToRequestInstance(IContext context, workflowexecution.proxies.RequestWorkflowInstance _newRequestWorkflowInstance, process.proxies.Request _request, workflowtemplate.proxies.Node _oldNode)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewRequestWorkflowInstance", _newRequestWorkflowInstance == null ? null : _newRequestWorkflowInstance.getMendixObject());
			params.put("Request", _request == null ? null : _request.getMendixObject());
			params.put("OldNode", _oldNode == null ? null : _oldNode.getMendixObject());
			Core.execute(context, "WorkflowExecution.CopyNodeFromTemplateToRequestInstance", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void copyRequestWorkflowInstance(IContext context, workflowexecution.proxies.RequestWorkflowInstance _oldRequestWorkflowInstance)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("OldRequestWorkflowInstance", _oldRequestWorkflowInstance == null ? null : _oldRequestWorkflowInstance.getMendixObject());
			Core.execute(context, "WorkflowExecution.CopyRequestWorkflowInstance", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void copyResultNodeForEndNode(IContext context, workflowinstance.proxies.Workflow _oldWorkflow, workflowinstance.proxies.Workflow _newWorkflow)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("OldWorkflow", _oldWorkflow == null ? null : _oldWorkflow.getMendixObject());
			params.put("NewWorkflow", _newWorkflow == null ? null : _newWorkflow.getMendixObject());
			Core.execute(context, "WorkflowExecution.CopyResultNodeForEndNode", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean copyTemplateWorkflow_AndStartRequestWorkflowInstance(IContext context, workflowtemplate.proxies.Workflow _templateWorkflow, process.proxies.Request _request)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TemplateWorkflow", _templateWorkflow == null ? null : _templateWorkflow.getMendixObject());
			params.put("Request", _request == null ? null : _request.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowExecution.CopyTemplateWorkflow_AndStartRequestWorkflowInstance", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.RequestWorkflowInstance copyWorkflowFromTemplateToRequestInstance(IContext context, workflowtemplate.proxies.Workflow _workflowTemplate, process.proxies.Request _request)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowTemplate", _workflowTemplate == null ? null : _workflowTemplate.getMendixObject());
			params.put("Request", _request == null ? null : _request.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.CopyWorkflowFromTemplateToRequestInstance", params);
			return result == null ? null : workflowexecution.proxies.RequestWorkflowInstance.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.RequestWorkflowInstance copyWorkflowTemplateToInstance_ForChange(IContext context, workflowtemplate.proxies.Workflow _workflowTemplate, process.proxies.Change _change)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowTemplate", _workflowTemplate == null ? null : _workflowTemplate.getMendixObject());
			params.put("Change", _change == null ? null : _change.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.CopyWorkflowTemplateToInstance_ForChange", params);
			return result == null ? null : workflowexecution.proxies.RequestWorkflowInstance.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.RequestWorkflowInstance copyWorkflowTemplateToInstance_ForDelivery(IContext context, workflowtemplate.proxies.Workflow _workflowTemplate, process.proxies.Delivery _delivery)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowTemplate", _workflowTemplate == null ? null : _workflowTemplate.getMendixObject());
			params.put("Delivery", _delivery == null ? null : _delivery.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.CopyWorkflowTemplateToInstance_ForDelivery", params);
			return result == null ? null : workflowexecution.proxies.RequestWorkflowInstance.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.RequestWorkflowInstance copyWorkflowTemplateToInstance_ForIncident(IContext context, workflowtemplate.proxies.Workflow _workflowTemplate, process.proxies.Incident _incident)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowTemplate", _workflowTemplate == null ? null : _workflowTemplate.getMendixObject());
			params.put("Incident", _incident == null ? null : _incident.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.CopyWorkflowTemplateToInstance_ForIncident", params);
			return result == null ? null : workflowexecution.proxies.RequestWorkflowInstance.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.RequestWorkflowInstance copyWorkflowTemplateToInstance_ForOperation(IContext context, workflowtemplate.proxies.Workflow _workflowTemplate, process.proxies.Operation _operation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowTemplate", _workflowTemplate == null ? null : _workflowTemplate.getMendixObject());
			params.put("Operation", _operation == null ? null : _operation.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.CopyWorkflowTemplateToInstance_ForOperation", params);
			return result == null ? null : workflowexecution.proxies.RequestWorkflowInstance.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.RequestWorkflowInstance copyWorkflowTemplateToInstance_ForProblem(IContext context, workflowtemplate.proxies.Workflow _workflowTemplate, process.proxies.Problem _problem)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowTemplate", _workflowTemplate == null ? null : _workflowTemplate.getMendixObject());
			params.put("Problem", _problem == null ? null : _problem.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.CopyWorkflowTemplateToInstance_ForProblem", params);
			return result == null ? null : workflowexecution.proxies.RequestWorkflowInstance.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.RequestWorkflowInstance copyWorkflowTemplateToInstance_ForServiceRequest(IContext context, workflowtemplate.proxies.Workflow _workflowTemplate, process.proxies.ServiceRequest _serviceRequest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowTemplate", _workflowTemplate == null ? null : _workflowTemplate.getMendixObject());
			params.put("ServiceRequest", _serviceRequest == null ? null : _serviceRequest.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.CopyWorkflowTemplateToInstance_ForServiceRequest", params);
			return result == null ? null : workflowexecution.proxies.RequestWorkflowInstance.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.RequestWorkflowInstance copyWorkflowTemplateToInstance_ForTask(IContext context, workflowtemplate.proxies.Workflow _workflowTemplate, process.proxies.Task _task)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WorkflowTemplate", _workflowTemplate == null ? null : _workflowTemplate.getMendixObject());
			params.put("Task", _task == null ? null : _task.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.CopyWorkflowTemplateToInstance_ForTask", params);
			return result == null ? null : workflowexecution.proxies.RequestWorkflowInstance.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void deleteWorkflow(IContext context, workflowexecution.proxies.RequestWorkflowInstance _requestWorkflowInstance)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RequestWorkflowInstance", _requestWorkflowInstance == null ? null : _requestWorkflowInstance.getMendixObject());
			Core.execute(context, "WorkflowExecution.DeleteWorkflow", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void deleteWorkflowRec(IContext context, workflowexecution.proxies.RequestWorkflowInstance _requestWorkflowInstance, java.lang.Long _level)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RequestWorkflowInstance", _requestWorkflowInstance == null ? null : _requestWorkflowInstance.getMendixObject());
			params.put("Level", _level);
			Core.execute(context, "WorkflowExecution.DeleteWorkflowRec", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void editRequestWorkflowInstance(IContext context, workflowexecution.proxies.RequestWorkflowInstance _requestWorkflowInstance)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RequestWorkflowInstance", _requestWorkflowInstance == null ? null : _requestWorkflowInstance.getMendixObject());
			Core.execute(context, "WorkflowExecution.EditRequestWorkflowInstance", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<process.proxies.Request> getRelatedRequestsForSignalling(IContext context, process.proxies.Request _request, java.util.List<process.proxies.Request> _currentRequestList, java.lang.Long _order, java.lang.Long _maxOrder)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Request", _request == null ? null : _request.getMendixObject());
			java.util.ArrayList<IMendixObject> listparam_currentRequestList = null;
			if (_currentRequestList != null)
			{
				listparam_currentRequestList = new java.util.ArrayList<IMendixObject>();
				for (process.proxies.Request obj : _currentRequestList)
					listparam_currentRequestList.add(obj.getMendixObject());
			}
			params.put("CurrentRequestList", listparam_currentRequestList);
			params.put("Order", _order);
			params.put("MaxOrder", _maxOrder);
			java.util.List<IMendixObject> objs = Core.execute(context, "WorkflowExecution.GetRelatedRequestsForSignalling", params);
			java.util.List<process.proxies.Request> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<process.proxies.Request>();
				for (IMendixObject obj : objs)
					result.add(process.proxies.Request.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void markAsUsed(IContext context, workflowexecution.proxies.RequestWorkflowInstance _requestWorkflowInstance, java.lang.Long _level)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RequestWorkflowInstance", _requestWorkflowInstance == null ? null : _requestWorkflowInstance.getMendixObject());
			params.put("Level", _level);
			Core.execute(context, "WorkflowExecution.MarkAsUsed", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.NodeVisit newNodeVisit(IContext context, workflowexecution.proxies.NodeVisit _nodeVisit, workflowinstance.proxies.Link _link)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NodeVisit", _nodeVisit == null ? null : _nodeVisit.getMendixObject());
			params.put("Link", _link == null ? null : _link.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.NewNodeVisit", params);
			return result == null ? null : workflowexecution.proxies.NodeVisit.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void next_NodeVisit(IContext context, workflowexecution.proxies.NodeVisit _nodeVisit, workflowshared.proxies.WorkflowResult _workflowResult)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NodeVisit", _nodeVisit == null ? null : _nodeVisit.getMendixObject());
			params.put("WorkflowResult", _workflowResult == null ? null : _workflowResult.getMendixObject());
			Core.execute(context, "WorkflowExecution.Next_NodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean run_ActionNodeVisit(IContext context, workflowexecution.proxies.NodeVisit _newNodeVisit, workflowinstance.proxies.Node _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewNodeVisit", _newNodeVisit == null ? null : _newNodeVisit.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "WorkflowExecution.Run_ActionNodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void run_ApprovalNodeVisit(IContext context, workflowexecution.proxies.ApprovalNodeVisit _newApprovalNodeVisit, workflowinstance.proxies.Node _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewApprovalNodeVisit", _newApprovalNodeVisit == null ? null : _newApprovalNodeVisit.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "WorkflowExecution.Run_ApprovalNodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void run_CancelNodeVisit(IContext context, workflowexecution.proxies.NodeVisit _newCancelNodeVisit, workflowinstance.proxies.Node _node, workflowshared.proxies.WorkflowResult _workflowResult_Cancel)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewCancelNodeVisit", _newCancelNodeVisit == null ? null : _newCancelNodeVisit.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			params.put("WorkflowResult_Cancel", _workflowResult_Cancel == null ? null : _workflowResult_Cancel.getMendixObject());
			Core.execute(context, "WorkflowExecution.Run_CancelNodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void run_EndNodeVisit(IContext context, workflowexecution.proxies.NodeVisit _endNodeVisit)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EndNodeVisit", _endNodeVisit == null ? null : _endNodeVisit.getMendixObject());
			Core.execute(context, "WorkflowExecution.Run_EndNodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void run_MessageNodeVisit(IContext context, workflowexecution.proxies.NodeVisit _newNodeVisit, workflowinstance.proxies.Node _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewNodeVisit", _newNodeVisit == null ? null : _newNodeVisit.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "WorkflowExecution.Run_MessageNodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void run_NodeVisit(IContext context, workflowexecution.proxies.NodeVisit _newNodeVisit)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewNodeVisit", _newNodeVisit == null ? null : _newNodeVisit.getMendixObject());
			Core.execute(context, "WorkflowExecution.Run_NodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void run_RequestNodeVisit(IContext context, workflowexecution.proxies.RequestNodeVisit _newRequestNodeVisit, workflowinstance.proxies.Node _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewRequestNodeVisit", _newRequestNodeVisit == null ? null : _newRequestNodeVisit.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "WorkflowExecution.Run_RequestNodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void run_SignalNodeVisit(IContext context, workflowexecution.proxies.SignalNodeVisit _newSignalNodeVisit, workflowinstance.proxies.Node _node, workflowshared.proxies.WorkflowResult _workflowSuccesResult)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewSignalNodeVisit", _newSignalNodeVisit == null ? null : _newSignalNodeVisit.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			params.put("WorkflowSuccesResult", _workflowSuccesResult == null ? null : _workflowSuccesResult.getMendixObject());
			Core.execute(context, "WorkflowExecution.Run_SignalNodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void run_SubWorkflowNodeVisit(IContext context, workflowinstance.proxies.Node _node, workflowexecution.proxies.SubWorkflowNodeVisit _subWorkflowNodeVisit)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Node", _node == null ? null : _node.getMendixObject());
			params.put("SubWorkflowNodeVisit", _subWorkflowNodeVisit == null ? null : _subWorkflowNodeVisit.getMendixObject());
			Core.execute(context, "WorkflowExecution.Run_SubWorkflowNodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void run_TimerNodeVisit(IContext context, workflowexecution.proxies.TimerNodeVisit _newTimerNodeVisit, workflowinstance.proxies.Node _node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewTimerNodeVisit", _newTimerNodeVisit == null ? null : _newTimerNodeVisit.getMendixObject());
			params.put("Node", _node == null ? null : _node.getMendixObject());
			Core.execute(context, "WorkflowExecution.Run_TimerNodeVisit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sendSignalToRequestList(IContext context, java.util.List<process.proxies.Request> _requestList, workflowexecution.proxies.SignalNodeVisit _sourceSignalNodeVisit, workflowshared.proxies.WorkflowSignal _signal)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_requestList = null;
			if (_requestList != null)
			{
				listparam_requestList = new java.util.ArrayList<IMendixObject>();
				for (process.proxies.Request obj : _requestList)
					listparam_requestList.add(obj.getMendixObject());
			}
			params.put("RequestList", listparam_requestList);
			params.put("SourceSignalNodeVisit", _sourceSignalNodeVisit == null ? null : _sourceSignalNodeVisit.getMendixObject());
			params.put("Signal", _signal == null ? null : _signal.getMendixObject());
			Core.execute(context, "WorkflowExecution.SendSignalToRequestList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sendSignalToRequestTicketOrRelated(IContext context, boolean _inRequest, boolean _inTicket, boolean _inRelatedRequests, java.lang.Long _distanceRelatedRequests, process.proxies.Request _request, workflowexecution.proxies.SignalNodeVisit _sourceSignalNodeVisit, workflowshared.proxies.WorkflowSignal _signal)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InRequest", _inRequest);
			params.put("InTicket", _inTicket);
			params.put("InRelatedRequests", _inRelatedRequests);
			params.put("DistanceRelatedRequests", _distanceRelatedRequests);
			params.put("Request", _request == null ? null : _request.getMendixObject());
			params.put("SourceSignalNodeVisit", _sourceSignalNodeVisit == null ? null : _sourceSignalNodeVisit.getMendixObject());
			params.put("Signal", _signal == null ? null : _signal.getMendixObject());
			Core.execute(context, "WorkflowExecution.SendSignalToRequestTicketOrRelated", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sendSignalToSignalNodeVisitList(IContext context, java.util.List<workflowexecution.proxies.SignalNodeVisit> _signalNodeVisitList, workflowexecution.proxies.SignalNodeVisit _sourceSignalNodeVisit)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_signalNodeVisitList = null;
			if (_signalNodeVisitList != null)
			{
				listparam_signalNodeVisitList = new java.util.ArrayList<IMendixObject>();
				for (workflowexecution.proxies.SignalNodeVisit obj : _signalNodeVisitList)
					listparam_signalNodeVisitList.add(obj.getMendixObject());
			}
			params.put("SignalNodeVisitList", listparam_signalNodeVisitList);
			params.put("SourceSignalNodeVisit", _sourceSignalNodeVisit == null ? null : _sourceSignalNodeVisit.getMendixObject());
			Core.execute(context, "WorkflowExecution.SendSignalToSignalNodeVisitList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static workflowexecution.proxies.WorkflowVisit startWorkflow_InitialNodeVisit(IContext context, workflowexecution.proxies.RequestWorkflowInstance _requestWorkflowInstance)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RequestWorkflowInstance", _requestWorkflowInstance == null ? null : _requestWorkflowInstance.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "WorkflowExecution.StartWorkflow_InitialNodeVisit", params);
			return result == null ? null : workflowexecution.proxies.WorkflowVisit.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}