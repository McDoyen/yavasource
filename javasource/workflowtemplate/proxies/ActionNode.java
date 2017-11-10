// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowtemplate.proxies;

public class ActionNode extends workflowtemplate.proxies.Node
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowTemplate.ActionNode";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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
		ActionNode_Transition("WorkflowTemplate.ActionNode_Transition"),
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

	public ActionNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowTemplate.ActionNode"));
	}

	protected ActionNode(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject actionNodeMendixObject)
	{
		super(context, actionNodeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowTemplate.ActionNode", actionNodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowTemplate.ActionNode");
	}

	/**
	 * @deprecated Use 'ActionNode.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowtemplate.proxies.ActionNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowtemplate.proxies.ActionNode.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowtemplate.proxies.ActionNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowtemplate.proxies.ActionNode(context, mendixObject);
	}

	public static workflowtemplate.proxies.ActionNode load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowtemplate.proxies.ActionNode.initialize(context, mendixObject);
	}

	public static java.util.List<workflowtemplate.proxies.ActionNode> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowtemplate.proxies.ActionNode> result = new java.util.ArrayList<workflowtemplate.proxies.ActionNode>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowTemplate.ActionNode" + xpathConstraint))
			result.add(workflowtemplate.proxies.ActionNode.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ActionNode_Transition
	 */
	public final statetransition.proxies.Transition getActionNode_Transition() throws com.mendix.core.CoreException
	{
		return getActionNode_Transition(getContext());
	}

	/**
	 * @param context
	 * @return value of ActionNode_Transition
	 */
	public final statetransition.proxies.Transition getActionNode_Transition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		statetransition.proxies.Transition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ActionNode_Transition.toString());
		if (identifier != null)
			result = statetransition.proxies.Transition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ActionNode_Transition
	 * @param actionnode_transition
	 */
	public final void setActionNode_Transition(statetransition.proxies.Transition actionnode_transition)
	{
		setActionNode_Transition(getContext(), actionnode_transition);
	}

	/**
	 * Set value of ActionNode_Transition
	 * @param context
	 * @param actionnode_transition
	 */
	public final void setActionNode_Transition(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.Transition actionnode_transition)
	{
		if (actionnode_transition == null)
			getMendixObject().setValue(context, MemberNames.ActionNode_Transition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ActionNode_Transition.toString(), actionnode_transition.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowtemplate.proxies.ActionNode that = (workflowtemplate.proxies.ActionNode) obj;
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
		return "WorkflowTemplate.ActionNode";
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
