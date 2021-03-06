// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowinstance.proxies;

public class ConditionalNode extends workflowinstance.proxies.Node
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowInstance.ConditionalNode";

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
		Node_Workflow("WorkflowInstance.Node_Workflow"),
		TempInsertAfterNodeTemplate("WorkflowInstance.TempInsertAfterNodeTemplate"),
		EndNode_WorkflowResult("WorkflowInstance.EndNode_WorkflowResult");

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

	public ConditionalNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowInstance.ConditionalNode"));
	}

	protected ConditionalNode(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject conditionalNodeMendixObject)
	{
		super(context, conditionalNodeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowInstance.ConditionalNode", conditionalNodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowInstance.ConditionalNode");
	}

	/**
	 * @deprecated Use 'ConditionalNode.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowinstance.proxies.ConditionalNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowinstance.proxies.ConditionalNode.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowinstance.proxies.ConditionalNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowinstance.proxies.ConditionalNode(context, mendixObject);
	}

	public static workflowinstance.proxies.ConditionalNode load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowinstance.proxies.ConditionalNode.initialize(context, mendixObject);
	}

	public static java.util.List<workflowinstance.proxies.ConditionalNode> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowinstance.proxies.ConditionalNode> result = new java.util.ArrayList<workflowinstance.proxies.ConditionalNode>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowInstance.ConditionalNode" + xpathConstraint))
			result.add(workflowinstance.proxies.ConditionalNode.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowinstance.proxies.ConditionalNode that = (workflowinstance.proxies.ConditionalNode) obj;
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
		return "WorkflowInstance.ConditionalNode";
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
