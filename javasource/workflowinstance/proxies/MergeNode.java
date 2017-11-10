// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowinstance.proxies;

public class MergeNode extends workflowinstance.proxies.Node
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowInstance.MergeNode";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MergeNodeConditionType("MergeNodeConditionType"),
		MergeNodeConditionNumber("MergeNodeConditionNumber"),
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

	public MergeNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowInstance.MergeNode"));
	}

	protected MergeNode(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mergeNodeMendixObject)
	{
		super(context, mergeNodeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowInstance.MergeNode", mergeNodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowInstance.MergeNode");
	}

	/**
	 * @deprecated Use 'MergeNode.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowinstance.proxies.MergeNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowinstance.proxies.MergeNode.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowinstance.proxies.MergeNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowinstance.proxies.MergeNode(context, mendixObject);
	}

	public static workflowinstance.proxies.MergeNode load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowinstance.proxies.MergeNode.initialize(context, mendixObject);
	}

	public static java.util.List<workflowinstance.proxies.MergeNode> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowinstance.proxies.MergeNode> result = new java.util.ArrayList<workflowinstance.proxies.MergeNode>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowInstance.MergeNode" + xpathConstraint))
			result.add(workflowinstance.proxies.MergeNode.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of MergeNodeConditionType
	 * @param mergenodeconditiontype
	 */
	public final workflowshared.proxies.MergeNodeConditionTypeEnum getMergeNodeConditionType()
	{
		return getMergeNodeConditionType(getContext());
	}

	/**
	 * @param context
	 * @return value of MergeNodeConditionType
	 */
	public final workflowshared.proxies.MergeNodeConditionTypeEnum getMergeNodeConditionType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.MergeNodeConditionType.toString());
		if (obj == null)
			return null;

		return workflowshared.proxies.MergeNodeConditionTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of MergeNodeConditionType
	 * @param mergenodeconditiontype
	 */
	public final void setMergeNodeConditionType(workflowshared.proxies.MergeNodeConditionTypeEnum mergenodeconditiontype)
	{
		setMergeNodeConditionType(getContext(), mergenodeconditiontype);
	}

	/**
	 * Set value of MergeNodeConditionType
	 * @param context
	 * @param mergenodeconditiontype
	 */
	public final void setMergeNodeConditionType(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.MergeNodeConditionTypeEnum mergenodeconditiontype)
	{
		if (mergenodeconditiontype != null)
			getMendixObject().setValue(context, MemberNames.MergeNodeConditionType.toString(), mergenodeconditiontype.toString());
		else
			getMendixObject().setValue(context, MemberNames.MergeNodeConditionType.toString(), null);
	}

	/**
	 * @return value of MergeNodeConditionNumber
	 */
	public final java.lang.Integer getMergeNodeConditionNumber()
	{
		return getMergeNodeConditionNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of MergeNodeConditionNumber
	 */
	public final java.lang.Integer getMergeNodeConditionNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MergeNodeConditionNumber.toString());
	}

	/**
	 * Set value of MergeNodeConditionNumber
	 * @param mergenodeconditionnumber
	 */
	public final void setMergeNodeConditionNumber(java.lang.Integer mergenodeconditionnumber)
	{
		setMergeNodeConditionNumber(getContext(), mergenodeconditionnumber);
	}

	/**
	 * Set value of MergeNodeConditionNumber
	 * @param context
	 * @param mergenodeconditionnumber
	 */
	public final void setMergeNodeConditionNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer mergenodeconditionnumber)
	{
		getMendixObject().setValue(context, MemberNames.MergeNodeConditionNumber.toString(), mergenodeconditionnumber);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowinstance.proxies.MergeNode that = (workflowinstance.proxies.MergeNode) obj;
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
		return "WorkflowInstance.MergeNode";
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
