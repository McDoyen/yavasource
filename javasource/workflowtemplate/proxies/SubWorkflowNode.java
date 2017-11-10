// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowtemplate.proxies;

public class SubWorkflowNode extends workflowtemplate.proxies.Node
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowTemplate.SubWorkflowNode";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Iterations("Iterations"),
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
		SubWorkflowNode_Workflow("WorkflowTemplate.SubWorkflowNode_Workflow"),
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

	public SubWorkflowNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowTemplate.SubWorkflowNode"));
	}

	protected SubWorkflowNode(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject subWorkflowNodeMendixObject)
	{
		super(context, subWorkflowNodeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowTemplate.SubWorkflowNode", subWorkflowNodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowTemplate.SubWorkflowNode");
	}

	/**
	 * @deprecated Use 'SubWorkflowNode.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowtemplate.proxies.SubWorkflowNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowtemplate.proxies.SubWorkflowNode.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowtemplate.proxies.SubWorkflowNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowtemplate.proxies.SubWorkflowNode(context, mendixObject);
	}

	public static workflowtemplate.proxies.SubWorkflowNode load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowtemplate.proxies.SubWorkflowNode.initialize(context, mendixObject);
	}

	public static java.util.List<workflowtemplate.proxies.SubWorkflowNode> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowtemplate.proxies.SubWorkflowNode> result = new java.util.ArrayList<workflowtemplate.proxies.SubWorkflowNode>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowTemplate.SubWorkflowNode" + xpathConstraint))
			result.add(workflowtemplate.proxies.SubWorkflowNode.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Iterations
	 */
	public final java.lang.Integer getIterations()
	{
		return getIterations(getContext());
	}

	/**
	 * @param context
	 * @return value of Iterations
	 */
	public final java.lang.Integer getIterations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Iterations.toString());
	}

	/**
	 * Set value of Iterations
	 * @param iterations
	 */
	public final void setIterations(java.lang.Integer iterations)
	{
		setIterations(getContext(), iterations);
	}

	/**
	 * Set value of Iterations
	 * @param context
	 * @param iterations
	 */
	public final void setIterations(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer iterations)
	{
		getMendixObject().setValue(context, MemberNames.Iterations.toString(), iterations);
	}

	/**
	 * @return value of SubWorkflowNode_Workflow
	 */
	public final workflowtemplate.proxies.Workflow getSubWorkflowNode_Workflow() throws com.mendix.core.CoreException
	{
		return getSubWorkflowNode_Workflow(getContext());
	}

	/**
	 * @param context
	 * @return value of SubWorkflowNode_Workflow
	 */
	public final workflowtemplate.proxies.Workflow getSubWorkflowNode_Workflow(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowtemplate.proxies.Workflow result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SubWorkflowNode_Workflow.toString());
		if (identifier != null)
			result = workflowtemplate.proxies.Workflow.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SubWorkflowNode_Workflow
	 * @param subworkflownode_workflow
	 */
	public final void setSubWorkflowNode_Workflow(workflowtemplate.proxies.Workflow subworkflownode_workflow)
	{
		setSubWorkflowNode_Workflow(getContext(), subworkflownode_workflow);
	}

	/**
	 * Set value of SubWorkflowNode_Workflow
	 * @param context
	 * @param subworkflownode_workflow
	 */
	public final void setSubWorkflowNode_Workflow(com.mendix.systemwideinterfaces.core.IContext context, workflowtemplate.proxies.Workflow subworkflownode_workflow)
	{
		if (subworkflownode_workflow == null)
			getMendixObject().setValue(context, MemberNames.SubWorkflowNode_Workflow.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SubWorkflowNode_Workflow.toString(), subworkflownode_workflow.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowtemplate.proxies.SubWorkflowNode that = (workflowtemplate.proxies.SubWorkflowNode) obj;
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
		return "WorkflowTemplate.SubWorkflowNode";
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