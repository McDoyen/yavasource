// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowtemplate.proxies;

public class SignalNode extends workflowtemplate.proxies.Node
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowTemplate.SignalNode";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SendOrWait("SendOrWait"),
		InWorkflow("InWorkflow"),
		InRequest("InRequest"),
		InTicket("InTicket"),
		InRelatedRequests("InRelatedRequests"),
		DistanceRelatedRequests("DistanceRelatedRequests"),
		InstanceID("InstanceID"),
		Order("Order"),
		Name("Name"),
		NodeType("NodeType"),
		TempInsertType("TempInsertType"),
		HasFromNodes("HasFromNodes"),
		HasToNodes("HasToNodes"),
		ValidationText("ValidationText"),
		Valid("Valid"),
		ResetChart("ResetChart"),
		SignalNode_WorkflowSignal("WorkflowTemplate.SignalNode_WorkflowSignal"),
		Node_Workflow("WorkflowTemplate.Node_Workflow"),
		TempInsertAfterNodeTemplate("WorkflowTemplate.TempInsertAfterNodeTemplate"),
		EndNode_WorkflowResult("WorkflowTemplate.EndNode_WorkflowResult");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SignalNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowTemplate.SignalNode"));
	}

	protected SignalNode(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject signalNodeMendixObject)
	{
		super(context, signalNodeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowTemplate.SignalNode", signalNodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowTemplate.SignalNode");
	}

	/**
	 * @deprecated Use 'SignalNode.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowtemplate.proxies.SignalNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowtemplate.proxies.SignalNode.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowtemplate.proxies.SignalNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowtemplate.proxies.SignalNode(context, mendixObject);
	}

	public static workflowtemplate.proxies.SignalNode load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowtemplate.proxies.SignalNode.initialize(context, mendixObject);
	}

	public static java.util.List<workflowtemplate.proxies.SignalNode> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowtemplate.proxies.SignalNode> result = new java.util.ArrayList<workflowtemplate.proxies.SignalNode>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowTemplate.SignalNode" + xpathConstraint))
			result.add(workflowtemplate.proxies.SignalNode.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of SendOrWait
	 * @param sendorwait
	 */
	public final workflowshared.proxies.SignalEnum getSendOrWait()
	{
		return getSendOrWait(getContext());
	}

	/**
	 * @param context
	 * @return value of SendOrWait
	 */
	public final workflowshared.proxies.SignalEnum getSendOrWait(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.SendOrWait.toString());
		if (obj == null)
			return null;

		return workflowshared.proxies.SignalEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of SendOrWait
	 * @param sendorwait
	 */
	public final void setSendOrWait(workflowshared.proxies.SignalEnum sendorwait)
	{
		setSendOrWait(getContext(), sendorwait);
	}

	/**
	 * Set value of SendOrWait
	 * @param context
	 * @param sendorwait
	 */
	public final void setSendOrWait(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.SignalEnum sendorwait)
	{
		if (sendorwait != null)
			getMendixObject().setValue(context, MemberNames.SendOrWait.toString(), sendorwait.toString());
		else
			getMendixObject().setValue(context, MemberNames.SendOrWait.toString(), null);
	}

	/**
	 * @return value of InWorkflow
	 */
	public final java.lang.Boolean getInWorkflow()
	{
		return getInWorkflow(getContext());
	}

	/**
	 * @param context
	 * @return value of InWorkflow
	 */
	public final java.lang.Boolean getInWorkflow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.InWorkflow.toString());
	}

	/**
	 * Set value of InWorkflow
	 * @param inworkflow
	 */
	public final void setInWorkflow(java.lang.Boolean inworkflow)
	{
		setInWorkflow(getContext(), inworkflow);
	}

	/**
	 * Set value of InWorkflow
	 * @param context
	 * @param inworkflow
	 */
	public final void setInWorkflow(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean inworkflow)
	{
		getMendixObject().setValue(context, MemberNames.InWorkflow.toString(), inworkflow);
	}

	/**
	 * @return value of InRequest
	 */
	public final java.lang.Boolean getInRequest()
	{
		return getInRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of InRequest
	 */
	public final java.lang.Boolean getInRequest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.InRequest.toString());
	}

	/**
	 * Set value of InRequest
	 * @param inrequest
	 */
	public final void setInRequest(java.lang.Boolean inrequest)
	{
		setInRequest(getContext(), inrequest);
	}

	/**
	 * Set value of InRequest
	 * @param context
	 * @param inrequest
	 */
	public final void setInRequest(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean inrequest)
	{
		getMendixObject().setValue(context, MemberNames.InRequest.toString(), inrequest);
	}

	/**
	 * @return value of InTicket
	 */
	public final java.lang.Boolean getInTicket()
	{
		return getInTicket(getContext());
	}

	/**
	 * @param context
	 * @return value of InTicket
	 */
	public final java.lang.Boolean getInTicket(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.InTicket.toString());
	}

	/**
	 * Set value of InTicket
	 * @param inticket
	 */
	public final void setInTicket(java.lang.Boolean inticket)
	{
		setInTicket(getContext(), inticket);
	}

	/**
	 * Set value of InTicket
	 * @param context
	 * @param inticket
	 */
	public final void setInTicket(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean inticket)
	{
		getMendixObject().setValue(context, MemberNames.InTicket.toString(), inticket);
	}

	/**
	 * @return value of InRelatedRequests
	 */
	public final java.lang.Boolean getInRelatedRequests()
	{
		return getInRelatedRequests(getContext());
	}

	/**
	 * @param context
	 * @return value of InRelatedRequests
	 */
	public final java.lang.Boolean getInRelatedRequests(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.InRelatedRequests.toString());
	}

	/**
	 * Set value of InRelatedRequests
	 * @param inrelatedrequests
	 */
	public final void setInRelatedRequests(java.lang.Boolean inrelatedrequests)
	{
		setInRelatedRequests(getContext(), inrelatedrequests);
	}

	/**
	 * Set value of InRelatedRequests
	 * @param context
	 * @param inrelatedrequests
	 */
	public final void setInRelatedRequests(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean inrelatedrequests)
	{
		getMendixObject().setValue(context, MemberNames.InRelatedRequests.toString(), inrelatedrequests);
	}

	/**
	 * @return value of DistanceRelatedRequests
	 */
	public final java.lang.Integer getDistanceRelatedRequests()
	{
		return getDistanceRelatedRequests(getContext());
	}

	/**
	 * @param context
	 * @return value of DistanceRelatedRequests
	 */
	public final java.lang.Integer getDistanceRelatedRequests(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.DistanceRelatedRequests.toString());
	}

	/**
	 * Set value of DistanceRelatedRequests
	 * @param distancerelatedrequests
	 */
	public final void setDistanceRelatedRequests(java.lang.Integer distancerelatedrequests)
	{
		setDistanceRelatedRequests(getContext(), distancerelatedrequests);
	}

	/**
	 * Set value of DistanceRelatedRequests
	 * @param context
	 * @param distancerelatedrequests
	 */
	public final void setDistanceRelatedRequests(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer distancerelatedrequests)
	{
		getMendixObject().setValue(context, MemberNames.DistanceRelatedRequests.toString(), distancerelatedrequests);
	}

	/**
	 * @return value of SignalNode_WorkflowSignal
	 */
	public final workflowshared.proxies.WorkflowSignal getSignalNode_WorkflowSignal() throws com.mendix.core.CoreException
	{
		return getSignalNode_WorkflowSignal(getContext());
	}

	/**
	 * @param context
	 * @return value of SignalNode_WorkflowSignal
	 */
	public final workflowshared.proxies.WorkflowSignal getSignalNode_WorkflowSignal(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowshared.proxies.WorkflowSignal result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SignalNode_WorkflowSignal.toString());
		if (identifier != null)
			result = workflowshared.proxies.WorkflowSignal.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SignalNode_WorkflowSignal
	 * @param signalnode_workflowsignal
	 */
	public final void setSignalNode_WorkflowSignal(workflowshared.proxies.WorkflowSignal signalnode_workflowsignal)
	{
		setSignalNode_WorkflowSignal(getContext(), signalnode_workflowsignal);
	}

	/**
	 * Set value of SignalNode_WorkflowSignal
	 * @param context
	 * @param signalnode_workflowsignal
	 */
	public final void setSignalNode_WorkflowSignal(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.WorkflowSignal signalnode_workflowsignal)
	{
		if (signalnode_workflowsignal == null)
			getMendixObject().setValue(context, MemberNames.SignalNode_WorkflowSignal.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SignalNode_WorkflowSignal.toString(), signalnode_workflowsignal.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowtemplate.proxies.SignalNode that = (workflowtemplate.proxies.SignalNode) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "WorkflowTemplate.SignalNode";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
