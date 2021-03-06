// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowexecution.proxies;

public class SignalNodeVisit extends workflowexecution.proxies.NodeVisit
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowExecution.SignalNodeVisit";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ReceivedFromID("ReceivedFromID"),
		SendOrWait("SendOrWait"),
		AutoID("AutoID"),
		StartDate("StartDate"),
		EndDate("EndDate"),
		StepCounter("StepCounter"),
		SignalNodeVisit_NodeVisit("WorkflowExecution.SignalNodeVisit_NodeVisit"),
		SignalNodeVisit_WorkflowSignal("WorkflowExecution.SignalNodeVisit_WorkflowSignal"),
		NodeVisit_RequestWorkflowInstance("WorkflowExecution.NodeVisit_RequestWorkflowInstance"),
		NodeVisit_WorkflowVisit("WorkflowExecution.NodeVisit_WorkflowVisit"),
		NodeVisit_Node("WorkflowExecution.NodeVisit_Node"),
		NodeVisit_WorkflowResult("WorkflowExecution.NodeVisit_WorkflowResult");

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

	public SignalNodeVisit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowExecution.SignalNodeVisit"));
	}

	protected SignalNodeVisit(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject signalNodeVisitMendixObject)
	{
		super(context, signalNodeVisitMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowExecution.SignalNodeVisit", signalNodeVisitMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowExecution.SignalNodeVisit");
	}

	/**
	 * @deprecated Use 'SignalNodeVisit.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowexecution.proxies.SignalNodeVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowexecution.proxies.SignalNodeVisit.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowexecution.proxies.SignalNodeVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowexecution.proxies.SignalNodeVisit(context, mendixObject);
	}

	public static workflowexecution.proxies.SignalNodeVisit load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowexecution.proxies.SignalNodeVisit.initialize(context, mendixObject);
	}

	public static java.util.List<workflowexecution.proxies.SignalNodeVisit> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowexecution.proxies.SignalNodeVisit> result = new java.util.ArrayList<workflowexecution.proxies.SignalNodeVisit>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowExecution.SignalNodeVisit" + xpathConstraint))
			result.add(workflowexecution.proxies.SignalNodeVisit.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ReceivedFromID
	 */
	public final java.lang.Integer getReceivedFromID()
	{
		return getReceivedFromID(getContext());
	}

	/**
	 * @param context
	 * @return value of ReceivedFromID
	 */
	public final java.lang.Integer getReceivedFromID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ReceivedFromID.toString());
	}

	/**
	 * Set value of ReceivedFromID
	 * @param receivedfromid
	 */
	public final void setReceivedFromID(java.lang.Integer receivedfromid)
	{
		setReceivedFromID(getContext(), receivedfromid);
	}

	/**
	 * Set value of ReceivedFromID
	 * @param context
	 * @param receivedfromid
	 */
	public final void setReceivedFromID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer receivedfromid)
	{
		getMendixObject().setValue(context, MemberNames.ReceivedFromID.toString(), receivedfromid);
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
	 * @return value of SignalNodeVisit_NodeVisit
	 */
	public final workflowexecution.proxies.NodeVisit getSignalNodeVisit_NodeVisit() throws com.mendix.core.CoreException
	{
		return getSignalNodeVisit_NodeVisit(getContext());
	}

	/**
	 * @param context
	 * @return value of SignalNodeVisit_NodeVisit
	 */
	public final workflowexecution.proxies.NodeVisit getSignalNodeVisit_NodeVisit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowexecution.proxies.NodeVisit result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SignalNodeVisit_NodeVisit.toString());
		if (identifier != null)
			result = workflowexecution.proxies.NodeVisit.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SignalNodeVisit_NodeVisit
	 * @param signalnodevisit_nodevisit
	 */
	public final void setSignalNodeVisit_NodeVisit(workflowexecution.proxies.NodeVisit signalnodevisit_nodevisit)
	{
		setSignalNodeVisit_NodeVisit(getContext(), signalnodevisit_nodevisit);
	}

	/**
	 * Set value of SignalNodeVisit_NodeVisit
	 * @param context
	 * @param signalnodevisit_nodevisit
	 */
	public final void setSignalNodeVisit_NodeVisit(com.mendix.systemwideinterfaces.core.IContext context, workflowexecution.proxies.NodeVisit signalnodevisit_nodevisit)
	{
		if (signalnodevisit_nodevisit == null)
			getMendixObject().setValue(context, MemberNames.SignalNodeVisit_NodeVisit.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SignalNodeVisit_NodeVisit.toString(), signalnodevisit_nodevisit.getMendixObject().getId());
	}

	/**
	 * @return value of SignalNodeVisit_WorkflowSignal
	 */
	public final workflowshared.proxies.WorkflowSignal getSignalNodeVisit_WorkflowSignal() throws com.mendix.core.CoreException
	{
		return getSignalNodeVisit_WorkflowSignal(getContext());
	}

	/**
	 * @param context
	 * @return value of SignalNodeVisit_WorkflowSignal
	 */
	public final workflowshared.proxies.WorkflowSignal getSignalNodeVisit_WorkflowSignal(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowshared.proxies.WorkflowSignal result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SignalNodeVisit_WorkflowSignal.toString());
		if (identifier != null)
			result = workflowshared.proxies.WorkflowSignal.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SignalNodeVisit_WorkflowSignal
	 * @param signalnodevisit_workflowsignal
	 */
	public final void setSignalNodeVisit_WorkflowSignal(workflowshared.proxies.WorkflowSignal signalnodevisit_workflowsignal)
	{
		setSignalNodeVisit_WorkflowSignal(getContext(), signalnodevisit_workflowsignal);
	}

	/**
	 * Set value of SignalNodeVisit_WorkflowSignal
	 * @param context
	 * @param signalnodevisit_workflowsignal
	 */
	public final void setSignalNodeVisit_WorkflowSignal(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.WorkflowSignal signalnodevisit_workflowsignal)
	{
		if (signalnodevisit_workflowsignal == null)
			getMendixObject().setValue(context, MemberNames.SignalNodeVisit_WorkflowSignal.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SignalNodeVisit_WorkflowSignal.toString(), signalnodevisit_workflowsignal.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowexecution.proxies.SignalNodeVisit that = (workflowexecution.proxies.SignalNodeVisit) obj;
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
		return "WorkflowExecution.SignalNodeVisit";
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
