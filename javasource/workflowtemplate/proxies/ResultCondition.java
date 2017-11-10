// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowtemplate.proxies;

public class ResultCondition extends workflowtemplate.proxies.Condition
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowTemplate.ResultCondition";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Description("Description"),
		ConditionType("ConditionType"),
		Order("Order"),
		IsSubCondition("IsSubCondition"),
		IsNot("IsNot"),
		ShowOrder("ShowOrder"),
		ConditionFor("ConditionFor"),
		ResultCondition_Node("WorkflowTemplate.ResultCondition_Node"),
		ResultCondition_WorkflowResult("WorkflowTemplate.ResultCondition_WorkflowResult"),
		ConditionalLink_Condition("WorkflowTemplate.ConditionalLink_Condition"),
		Condition_Workflow("WorkflowTemplate.Condition_Workflow"),
		Condition_WorkflowResult("WorkflowTemplate.Condition_WorkflowResult"),
		Condition_TriggerSetup("WorkflowTemplate.Condition_TriggerSetup"),
		OutgoingRequestCondition_TriggerSetup("WorkflowTemplate.OutgoingRequestCondition_TriggerSetup");

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

	public ResultCondition(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowTemplate.ResultCondition"));
	}

	protected ResultCondition(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject resultConditionMendixObject)
	{
		super(context, resultConditionMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowTemplate.ResultCondition", resultConditionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowTemplate.ResultCondition");
	}

	/**
	 * @deprecated Use 'ResultCondition.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowtemplate.proxies.ResultCondition initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowtemplate.proxies.ResultCondition.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowtemplate.proxies.ResultCondition initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowtemplate.proxies.ResultCondition(context, mendixObject);
	}

	public static workflowtemplate.proxies.ResultCondition load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowtemplate.proxies.ResultCondition.initialize(context, mendixObject);
	}

	public static java.util.List<workflowtemplate.proxies.ResultCondition> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowtemplate.proxies.ResultCondition> result = new java.util.ArrayList<workflowtemplate.proxies.ResultCondition>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowTemplate.ResultCondition" + xpathConstraint))
			result.add(workflowtemplate.proxies.ResultCondition.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ResultCondition_Node
	 */
	public final workflowtemplate.proxies.Node getResultCondition_Node() throws com.mendix.core.CoreException
	{
		return getResultCondition_Node(getContext());
	}

	/**
	 * @param context
	 * @return value of ResultCondition_Node
	 */
	public final workflowtemplate.proxies.Node getResultCondition_Node(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowtemplate.proxies.Node result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ResultCondition_Node.toString());
		if (identifier != null)
			result = workflowtemplate.proxies.Node.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ResultCondition_Node
	 * @param resultcondition_node
	 */
	public final void setResultCondition_Node(workflowtemplate.proxies.Node resultcondition_node)
	{
		setResultCondition_Node(getContext(), resultcondition_node);
	}

	/**
	 * Set value of ResultCondition_Node
	 * @param context
	 * @param resultcondition_node
	 */
	public final void setResultCondition_Node(com.mendix.systemwideinterfaces.core.IContext context, workflowtemplate.proxies.Node resultcondition_node)
	{
		if (resultcondition_node == null)
			getMendixObject().setValue(context, MemberNames.ResultCondition_Node.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ResultCondition_Node.toString(), resultcondition_node.getMendixObject().getId());
	}

	/**
	 * @return value of ResultCondition_WorkflowResult
	 */
	public final workflowshared.proxies.WorkflowResult getResultCondition_WorkflowResult() throws com.mendix.core.CoreException
	{
		return getResultCondition_WorkflowResult(getContext());
	}

	/**
	 * @param context
	 * @return value of ResultCondition_WorkflowResult
	 */
	public final workflowshared.proxies.WorkflowResult getResultCondition_WorkflowResult(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowshared.proxies.WorkflowResult result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ResultCondition_WorkflowResult.toString());
		if (identifier != null)
			result = workflowshared.proxies.WorkflowResult.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ResultCondition_WorkflowResult
	 * @param resultcondition_workflowresult
	 */
	public final void setResultCondition_WorkflowResult(workflowshared.proxies.WorkflowResult resultcondition_workflowresult)
	{
		setResultCondition_WorkflowResult(getContext(), resultcondition_workflowresult);
	}

	/**
	 * Set value of ResultCondition_WorkflowResult
	 * @param context
	 * @param resultcondition_workflowresult
	 */
	public final void setResultCondition_WorkflowResult(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.WorkflowResult resultcondition_workflowresult)
	{
		if (resultcondition_workflowresult == null)
			getMendixObject().setValue(context, MemberNames.ResultCondition_WorkflowResult.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ResultCondition_WorkflowResult.toString(), resultcondition_workflowresult.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowtemplate.proxies.ResultCondition that = (workflowtemplate.proxies.ResultCondition) obj;
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
		return "WorkflowTemplate.ResultCondition";
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
