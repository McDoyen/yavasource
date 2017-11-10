// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowinstance.proxies;

public class EndNode extends workflowinstance.proxies.Node
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowInstance.EndNode";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		EndNodeResult("EndNodeResult"),
		CancelAllOpenNodes("CancelAllOpenNodes"),
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
		EndNode_ResultNode("WorkflowInstance.EndNode_ResultNode"),
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

	public EndNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowInstance.EndNode"));
	}

	protected EndNode(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject endNodeMendixObject)
	{
		super(context, endNodeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowInstance.EndNode", endNodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowInstance.EndNode");
	}

	/**
	 * @deprecated Use 'EndNode.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowinstance.proxies.EndNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowinstance.proxies.EndNode.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowinstance.proxies.EndNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowinstance.proxies.EndNode(context, mendixObject);
	}

	public static workflowinstance.proxies.EndNode load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowinstance.proxies.EndNode.initialize(context, mendixObject);
	}

	public static java.util.List<workflowinstance.proxies.EndNode> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowinstance.proxies.EndNode> result = new java.util.ArrayList<workflowinstance.proxies.EndNode>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowInstance.EndNode" + xpathConstraint))
			result.add(workflowinstance.proxies.EndNode.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of EndNodeResult
	 * @param endnoderesult
	 */
	public final workflowshared.proxies.EndNodeResultEnum getEndNodeResult()
	{
		return getEndNodeResult(getContext());
	}

	/**
	 * @param context
	 * @return value of EndNodeResult
	 */
	public final workflowshared.proxies.EndNodeResultEnum getEndNodeResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.EndNodeResult.toString());
		if (obj == null)
			return null;

		return workflowshared.proxies.EndNodeResultEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of EndNodeResult
	 * @param endnoderesult
	 */
	public final void setEndNodeResult(workflowshared.proxies.EndNodeResultEnum endnoderesult)
	{
		setEndNodeResult(getContext(), endnoderesult);
	}

	/**
	 * Set value of EndNodeResult
	 * @param context
	 * @param endnoderesult
	 */
	public final void setEndNodeResult(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.EndNodeResultEnum endnoderesult)
	{
		if (endnoderesult != null)
			getMendixObject().setValue(context, MemberNames.EndNodeResult.toString(), endnoderesult.toString());
		else
			getMendixObject().setValue(context, MemberNames.EndNodeResult.toString(), null);
	}

	/**
	 * @return value of CancelAllOpenNodes
	 */
	public final java.lang.Boolean getCancelAllOpenNodes()
	{
		return getCancelAllOpenNodes(getContext());
	}

	/**
	 * @param context
	 * @return value of CancelAllOpenNodes
	 */
	public final java.lang.Boolean getCancelAllOpenNodes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CancelAllOpenNodes.toString());
	}

	/**
	 * Set value of CancelAllOpenNodes
	 * @param cancelallopennodes
	 */
	public final void setCancelAllOpenNodes(java.lang.Boolean cancelallopennodes)
	{
		setCancelAllOpenNodes(getContext(), cancelallopennodes);
	}

	/**
	 * Set value of CancelAllOpenNodes
	 * @param context
	 * @param cancelallopennodes
	 */
	public final void setCancelAllOpenNodes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean cancelallopennodes)
	{
		getMendixObject().setValue(context, MemberNames.CancelAllOpenNodes.toString(), cancelallopennodes);
	}

	/**
	 * @return value of EndNode_ResultNode
	 */
	public final workflowinstance.proxies.Node getEndNode_ResultNode() throws com.mendix.core.CoreException
	{
		return getEndNode_ResultNode(getContext());
	}

	/**
	 * @param context
	 * @return value of EndNode_ResultNode
	 */
	public final workflowinstance.proxies.Node getEndNode_ResultNode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowinstance.proxies.Node result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.EndNode_ResultNode.toString());
		if (identifier != null)
			result = workflowinstance.proxies.Node.load(context, identifier);
		return result;
	}

	/**
	 * Set value of EndNode_ResultNode
	 * @param endnode_resultnode
	 */
	public final void setEndNode_ResultNode(workflowinstance.proxies.Node endnode_resultnode)
	{
		setEndNode_ResultNode(getContext(), endnode_resultnode);
	}

	/**
	 * Set value of EndNode_ResultNode
	 * @param context
	 * @param endnode_resultnode
	 */
	public final void setEndNode_ResultNode(com.mendix.systemwideinterfaces.core.IContext context, workflowinstance.proxies.Node endnode_resultnode)
	{
		if (endnode_resultnode == null)
			getMendixObject().setValue(context, MemberNames.EndNode_ResultNode.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.EndNode_ResultNode.toString(), endnode_resultnode.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowinstance.proxies.EndNode that = (workflowinstance.proxies.EndNode) obj;
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
		return "WorkflowInstance.EndNode";
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
