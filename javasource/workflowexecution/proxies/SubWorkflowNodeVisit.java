// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowexecution.proxies;

public class SubWorkflowNodeVisit extends workflowexecution.proxies.NodeVisit
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowExecution.SubWorkflowNodeVisit";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Iteration("Iteration"),
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

	public SubWorkflowNodeVisit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowExecution.SubWorkflowNodeVisit"));
	}

	protected SubWorkflowNodeVisit(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject subWorkflowNodeVisitMendixObject)
	{
		super(context, subWorkflowNodeVisitMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowExecution.SubWorkflowNodeVisit", subWorkflowNodeVisitMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowExecution.SubWorkflowNodeVisit");
	}

	/**
	 * @deprecated Use 'SubWorkflowNodeVisit.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowexecution.proxies.SubWorkflowNodeVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowexecution.proxies.SubWorkflowNodeVisit.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowexecution.proxies.SubWorkflowNodeVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowexecution.proxies.SubWorkflowNodeVisit(context, mendixObject);
	}

	public static workflowexecution.proxies.SubWorkflowNodeVisit load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowexecution.proxies.SubWorkflowNodeVisit.initialize(context, mendixObject);
	}

	public static java.util.List<workflowexecution.proxies.SubWorkflowNodeVisit> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowexecution.proxies.SubWorkflowNodeVisit> result = new java.util.ArrayList<workflowexecution.proxies.SubWorkflowNodeVisit>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowExecution.SubWorkflowNodeVisit" + xpathConstraint))
			result.add(workflowexecution.proxies.SubWorkflowNodeVisit.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Iteration
	 */
	public final java.lang.Integer getIteration()
	{
		return getIteration(getContext());
	}

	/**
	 * @param context
	 * @return value of Iteration
	 */
	public final java.lang.Integer getIteration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Iteration.toString());
	}

	/**
	 * Set value of Iteration
	 * @param iteration
	 */
	public final void setIteration(java.lang.Integer iteration)
	{
		setIteration(getContext(), iteration);
	}

	/**
	 * Set value of Iteration
	 * @param context
	 * @param iteration
	 */
	public final void setIteration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer iteration)
	{
		getMendixObject().setValue(context, MemberNames.Iteration.toString(), iteration);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowexecution.proxies.SubWorkflowNodeVisit that = (workflowexecution.proxies.SubWorkflowNodeVisit) obj;
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
		return "WorkflowExecution.SubWorkflowNodeVisit";
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
