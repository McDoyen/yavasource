// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowexecution.proxies;

public class NodeVisit
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject nodeVisitMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowExecution.NodeVisit";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AutoID("AutoID"),
		StartDate("StartDate"),
		EndDate("EndDate"),
		StepCounter("StepCounter"),
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

	public NodeVisit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowExecution.NodeVisit"));
	}

	protected NodeVisit(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject nodeVisitMendixObject)
	{
		if (nodeVisitMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("WorkflowExecution.NodeVisit", nodeVisitMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowExecution.NodeVisit");

		this.nodeVisitMendixObject = nodeVisitMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'NodeVisit.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowexecution.proxies.NodeVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowexecution.proxies.NodeVisit.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowexecution.proxies.NodeVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("WorkflowExecution.ApprovalNodeVisit", mendixObject.getType()))
			return workflowexecution.proxies.ApprovalNodeVisit.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowExecution.MergeNodeVisit", mendixObject.getType()))
			return workflowexecution.proxies.MergeNodeVisit.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowExecution.RequestNodeVisit", mendixObject.getType()))
			return workflowexecution.proxies.RequestNodeVisit.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowExecution.SignalNodeVisit", mendixObject.getType()))
			return workflowexecution.proxies.SignalNodeVisit.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowExecution.SubWorkflowNodeVisit", mendixObject.getType()))
			return workflowexecution.proxies.SubWorkflowNodeVisit.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowExecution.TimerNodeVisit", mendixObject.getType()))
			return workflowexecution.proxies.TimerNodeVisit.initialize(context, mendixObject);

		return new workflowexecution.proxies.NodeVisit(context, mendixObject);
	}

	public static workflowexecution.proxies.NodeVisit load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowexecution.proxies.NodeVisit.initialize(context, mendixObject);
	}

	public static java.util.List<? extends workflowexecution.proxies.NodeVisit> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowexecution.proxies.NodeVisit> result = new java.util.ArrayList<workflowexecution.proxies.NodeVisit>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowExecution.NodeVisit" + xpathConstraint))
			result.add(workflowexecution.proxies.NodeVisit.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of AutoID
	 */
	public final java.lang.Long getAutoID()
	{
		return getAutoID(getContext());
	}

	/**
	 * @param context
	 * @return value of AutoID
	 */
	public final java.lang.Long getAutoID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.AutoID.toString());
	}

	/**
	 * Set value of AutoID
	 * @param autoid
	 */
	public final void setAutoID(java.lang.Long autoid)
	{
		setAutoID(getContext(), autoid);
	}

	/**
	 * Set value of AutoID
	 * @param context
	 * @param autoid
	 */
	public final void setAutoID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long autoid)
	{
		getMendixObject().setValue(context, MemberNames.AutoID.toString(), autoid);
	}

	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * @return value of StepCounter
	 */
	public final java.lang.Integer getStepCounter()
	{
		return getStepCounter(getContext());
	}

	/**
	 * @param context
	 * @return value of StepCounter
	 */
	public final java.lang.Integer getStepCounter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.StepCounter.toString());
	}

	/**
	 * Set value of StepCounter
	 * @param stepcounter
	 */
	public final void setStepCounter(java.lang.Integer stepcounter)
	{
		setStepCounter(getContext(), stepcounter);
	}

	/**
	 * Set value of StepCounter
	 * @param context
	 * @param stepcounter
	 */
	public final void setStepCounter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer stepcounter)
	{
		getMendixObject().setValue(context, MemberNames.StepCounter.toString(), stepcounter);
	}

	/**
	 * @return value of NodeVisit_RequestWorkflowInstance
	 */
	public final workflowexecution.proxies.RequestWorkflowInstance getNodeVisit_RequestWorkflowInstance() throws com.mendix.core.CoreException
	{
		return getNodeVisit_RequestWorkflowInstance(getContext());
	}

	/**
	 * @param context
	 * @return value of NodeVisit_RequestWorkflowInstance
	 */
	public final workflowexecution.proxies.RequestWorkflowInstance getNodeVisit_RequestWorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowexecution.proxies.RequestWorkflowInstance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NodeVisit_RequestWorkflowInstance.toString());
		if (identifier != null)
			result = workflowexecution.proxies.RequestWorkflowInstance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NodeVisit_RequestWorkflowInstance
	 * @param nodevisit_requestworkflowinstance
	 */
	public final void setNodeVisit_RequestWorkflowInstance(workflowexecution.proxies.RequestWorkflowInstance nodevisit_requestworkflowinstance)
	{
		setNodeVisit_RequestWorkflowInstance(getContext(), nodevisit_requestworkflowinstance);
	}

	/**
	 * Set value of NodeVisit_RequestWorkflowInstance
	 * @param context
	 * @param nodevisit_requestworkflowinstance
	 */
	public final void setNodeVisit_RequestWorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context, workflowexecution.proxies.RequestWorkflowInstance nodevisit_requestworkflowinstance)
	{
		if (nodevisit_requestworkflowinstance == null)
			getMendixObject().setValue(context, MemberNames.NodeVisit_RequestWorkflowInstance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NodeVisit_RequestWorkflowInstance.toString(), nodevisit_requestworkflowinstance.getMendixObject().getId());
	}

	/**
	 * @return value of NodeVisit_WorkflowVisit
	 */
	public final workflowexecution.proxies.WorkflowVisit getNodeVisit_WorkflowVisit() throws com.mendix.core.CoreException
	{
		return getNodeVisit_WorkflowVisit(getContext());
	}

	/**
	 * @param context
	 * @return value of NodeVisit_WorkflowVisit
	 */
	public final workflowexecution.proxies.WorkflowVisit getNodeVisit_WorkflowVisit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowexecution.proxies.WorkflowVisit result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NodeVisit_WorkflowVisit.toString());
		if (identifier != null)
			result = workflowexecution.proxies.WorkflowVisit.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NodeVisit_WorkflowVisit
	 * @param nodevisit_workflowvisit
	 */
	public final void setNodeVisit_WorkflowVisit(workflowexecution.proxies.WorkflowVisit nodevisit_workflowvisit)
	{
		setNodeVisit_WorkflowVisit(getContext(), nodevisit_workflowvisit);
	}

	/**
	 * Set value of NodeVisit_WorkflowVisit
	 * @param context
	 * @param nodevisit_workflowvisit
	 */
	public final void setNodeVisit_WorkflowVisit(com.mendix.systemwideinterfaces.core.IContext context, workflowexecution.proxies.WorkflowVisit nodevisit_workflowvisit)
	{
		if (nodevisit_workflowvisit == null)
			getMendixObject().setValue(context, MemberNames.NodeVisit_WorkflowVisit.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NodeVisit_WorkflowVisit.toString(), nodevisit_workflowvisit.getMendixObject().getId());
	}

	/**
	 * @return value of NodeVisit_Node
	 */
	public final workflowinstance.proxies.Node getNodeVisit_Node() throws com.mendix.core.CoreException
	{
		return getNodeVisit_Node(getContext());
	}

	/**
	 * @param context
	 * @return value of NodeVisit_Node
	 */
	public final workflowinstance.proxies.Node getNodeVisit_Node(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowinstance.proxies.Node result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NodeVisit_Node.toString());
		if (identifier != null)
			result = workflowinstance.proxies.Node.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NodeVisit_Node
	 * @param nodevisit_node
	 */
	public final void setNodeVisit_Node(workflowinstance.proxies.Node nodevisit_node)
	{
		setNodeVisit_Node(getContext(), nodevisit_node);
	}

	/**
	 * Set value of NodeVisit_Node
	 * @param context
	 * @param nodevisit_node
	 */
	public final void setNodeVisit_Node(com.mendix.systemwideinterfaces.core.IContext context, workflowinstance.proxies.Node nodevisit_node)
	{
		if (nodevisit_node == null)
			getMendixObject().setValue(context, MemberNames.NodeVisit_Node.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NodeVisit_Node.toString(), nodevisit_node.getMendixObject().getId());
	}

	/**
	 * @return value of NodeVisit_WorkflowResult
	 */
	public final workflowshared.proxies.WorkflowResult getNodeVisit_WorkflowResult() throws com.mendix.core.CoreException
	{
		return getNodeVisit_WorkflowResult(getContext());
	}

	/**
	 * @param context
	 * @return value of NodeVisit_WorkflowResult
	 */
	public final workflowshared.proxies.WorkflowResult getNodeVisit_WorkflowResult(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowshared.proxies.WorkflowResult result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NodeVisit_WorkflowResult.toString());
		if (identifier != null)
			result = workflowshared.proxies.WorkflowResult.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NodeVisit_WorkflowResult
	 * @param nodevisit_workflowresult
	 */
	public final void setNodeVisit_WorkflowResult(workflowshared.proxies.WorkflowResult nodevisit_workflowresult)
	{
		setNodeVisit_WorkflowResult(getContext(), nodevisit_workflowresult);
	}

	/**
	 * Set value of NodeVisit_WorkflowResult
	 * @param context
	 * @param nodevisit_workflowresult
	 */
	public final void setNodeVisit_WorkflowResult(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.WorkflowResult nodevisit_workflowresult)
	{
		if (nodevisit_workflowresult == null)
			getMendixObject().setValue(context, MemberNames.NodeVisit_WorkflowResult.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NodeVisit_WorkflowResult.toString(), nodevisit_workflowresult.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return nodeVisitMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowexecution.proxies.NodeVisit that = (workflowexecution.proxies.NodeVisit) obj;
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
		return "WorkflowExecution.NodeVisit";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
