// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowtemplate.proxies;

public class Node
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject nodeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowTemplate.Node";

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

	public Node(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowTemplate.Node"));
	}

	protected Node(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject nodeMendixObject)
	{
		if (nodeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("WorkflowTemplate.Node", nodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowTemplate.Node");

		this.nodeMendixObject = nodeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Node.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowtemplate.proxies.Node initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowtemplate.proxies.Node.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowtemplate.proxies.Node initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.ActionNode", mendixObject.getType()))
			return workflowtemplate.proxies.ActionNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.ApprovalNode", mendixObject.getType()))
			return workflowtemplate.proxies.ApprovalNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.CancelNode", mendixObject.getType()))
			return workflowtemplate.proxies.CancelNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.ConditionalNode", mendixObject.getType()))
			return workflowtemplate.proxies.ConditionalNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.EndNode", mendixObject.getType()))
			return workflowtemplate.proxies.EndNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.MergeNode", mendixObject.getType()))
			return workflowtemplate.proxies.MergeNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.MessageNode", mendixObject.getType()))
			return workflowtemplate.proxies.MessageNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.ParallelNode", mendixObject.getType()))
			return workflowtemplate.proxies.ParallelNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.RequestNode", mendixObject.getType()))
			return workflowtemplate.proxies.RequestNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.SignalNode", mendixObject.getType()))
			return workflowtemplate.proxies.SignalNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.StartNode", mendixObject.getType()))
			return workflowtemplate.proxies.StartNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.SubWorkflowNode", mendixObject.getType()))
			return workflowtemplate.proxies.SubWorkflowNode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("WorkflowTemplate.TimerNode", mendixObject.getType()))
			return workflowtemplate.proxies.TimerNode.initialize(context, mendixObject);

		return new workflowtemplate.proxies.Node(context, mendixObject);
	}

	public static workflowtemplate.proxies.Node load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowtemplate.proxies.Node.initialize(context, mendixObject);
	}

	public static java.util.List<? extends workflowtemplate.proxies.Node> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowtemplate.proxies.Node> result = new java.util.ArrayList<workflowtemplate.proxies.Node>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowTemplate.Node" + xpathConstraint))
			result.add(workflowtemplate.proxies.Node.initialize(context, obj));
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
	 * @return value of InstanceID
	 */
	public final java.lang.Long getInstanceID()
	{
		return getInstanceID(getContext());
	}

	/**
	 * @param context
	 * @return value of InstanceID
	 */
	public final java.lang.Long getInstanceID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.InstanceID.toString());
	}

	/**
	 * Set value of InstanceID
	 * @param instanceid
	 */
	public final void setInstanceID(java.lang.Long instanceid)
	{
		setInstanceID(getContext(), instanceid);
	}

	/**
	 * Set value of InstanceID
	 * @param context
	 * @param instanceid
	 */
	public final void setInstanceID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long instanceid)
	{
		getMendixObject().setValue(context, MemberNames.InstanceID.toString(), instanceid);
	}

	/**
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder()
	{
		return getOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Order.toString());
	}

	/**
	 * Set value of Order
	 * @param order
	 */
	public final void setOrder(java.lang.Integer order)
	{
		setOrder(getContext(), order);
	}

	/**
	 * Set value of Order
	 * @param context
	 * @param order
	 */
	public final void setOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer order)
	{
		getMendixObject().setValue(context, MemberNames.Order.toString(), order);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * Set value of NodeType
	 * @param nodetype
	 */
	public final workflowshared.proxies.NodeTypeEnum getNodeType()
	{
		return getNodeType(getContext());
	}

	/**
	 * @param context
	 * @return value of NodeType
	 */
	public final workflowshared.proxies.NodeTypeEnum getNodeType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.NodeType.toString());
		if (obj == null)
			return null;

		return workflowshared.proxies.NodeTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of NodeType
	 * @param nodetype
	 */
	public final void setNodeType(workflowshared.proxies.NodeTypeEnum nodetype)
	{
		setNodeType(getContext(), nodetype);
	}

	/**
	 * Set value of NodeType
	 * @param context
	 * @param nodetype
	 */
	public final void setNodeType(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.NodeTypeEnum nodetype)
	{
		if (nodetype != null)
			getMendixObject().setValue(context, MemberNames.NodeType.toString(), nodetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.NodeType.toString(), null);
	}

	/**
	 * Set value of TempInsertType
	 * @param tempinserttype
	 */
	public final workflowshared.proxies.InsertTypeEnum getTempInsertType()
	{
		return getTempInsertType(getContext());
	}

	/**
	 * @param context
	 * @return value of TempInsertType
	 */
	public final workflowshared.proxies.InsertTypeEnum getTempInsertType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TempInsertType.toString());
		if (obj == null)
			return null;

		return workflowshared.proxies.InsertTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TempInsertType
	 * @param tempinserttype
	 */
	public final void setTempInsertType(workflowshared.proxies.InsertTypeEnum tempinserttype)
	{
		setTempInsertType(getContext(), tempinserttype);
	}

	/**
	 * Set value of TempInsertType
	 * @param context
	 * @param tempinserttype
	 */
	public final void setTempInsertType(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.InsertTypeEnum tempinserttype)
	{
		if (tempinserttype != null)
			getMendixObject().setValue(context, MemberNames.TempInsertType.toString(), tempinserttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.TempInsertType.toString(), null);
	}

	/**
	 * @return value of HasFromNodes
	 */
	public final java.lang.Boolean getHasFromNodes()
	{
		return getHasFromNodes(getContext());
	}

	/**
	 * @param context
	 * @return value of HasFromNodes
	 */
	public final java.lang.Boolean getHasFromNodes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasFromNodes.toString());
	}

	/**
	 * Set value of HasFromNodes
	 * @param hasfromnodes
	 */
	public final void setHasFromNodes(java.lang.Boolean hasfromnodes)
	{
		setHasFromNodes(getContext(), hasfromnodes);
	}

	/**
	 * Set value of HasFromNodes
	 * @param context
	 * @param hasfromnodes
	 */
	public final void setHasFromNodes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hasfromnodes)
	{
		getMendixObject().setValue(context, MemberNames.HasFromNodes.toString(), hasfromnodes);
	}

	/**
	 * @return value of HasToNodes
	 */
	public final java.lang.Boolean getHasToNodes()
	{
		return getHasToNodes(getContext());
	}

	/**
	 * @param context
	 * @return value of HasToNodes
	 */
	public final java.lang.Boolean getHasToNodes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasToNodes.toString());
	}

	/**
	 * Set value of HasToNodes
	 * @param hastonodes
	 */
	public final void setHasToNodes(java.lang.Boolean hastonodes)
	{
		setHasToNodes(getContext(), hastonodes);
	}

	/**
	 * Set value of HasToNodes
	 * @param context
	 * @param hastonodes
	 */
	public final void setHasToNodes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hastonodes)
	{
		getMendixObject().setValue(context, MemberNames.HasToNodes.toString(), hastonodes);
	}

	/**
	 * @return value of ValidationText
	 */
	public final java.lang.String getValidationText()
	{
		return getValidationText(getContext());
	}

	/**
	 * @param context
	 * @return value of ValidationText
	 */
	public final java.lang.String getValidationText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ValidationText.toString());
	}

	/**
	 * Set value of ValidationText
	 * @param validationtext
	 */
	public final void setValidationText(java.lang.String validationtext)
	{
		setValidationText(getContext(), validationtext);
	}

	/**
	 * Set value of ValidationText
	 * @param context
	 * @param validationtext
	 */
	public final void setValidationText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String validationtext)
	{
		getMendixObject().setValue(context, MemberNames.ValidationText.toString(), validationtext);
	}

	/**
	 * Set value of Valid
	 * @param valid
	 */
	public final workflowshared.proxies.ValidEnum getValid()
	{
		return getValid(getContext());
	}

	/**
	 * @param context
	 * @return value of Valid
	 */
	public final workflowshared.proxies.ValidEnum getValid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Valid.toString());
		if (obj == null)
			return null;

		return workflowshared.proxies.ValidEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Valid
	 * @param valid
	 */
	public final void setValid(workflowshared.proxies.ValidEnum valid)
	{
		setValid(getContext(), valid);
	}

	/**
	 * Set value of Valid
	 * @param context
	 * @param valid
	 */
	public final void setValid(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.ValidEnum valid)
	{
		if (valid != null)
			getMendixObject().setValue(context, MemberNames.Valid.toString(), valid.toString());
		else
			getMendixObject().setValue(context, MemberNames.Valid.toString(), null);
	}

	/**
	 * @return value of ResetChart
	 */
	public final java.lang.Boolean getResetChart()
	{
		return getResetChart(getContext());
	}

	/**
	 * @param context
	 * @return value of ResetChart
	 */
	public final java.lang.Boolean getResetChart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ResetChart.toString());
	}

	/**
	 * Set value of ResetChart
	 * @param resetchart
	 */
	public final void setResetChart(java.lang.Boolean resetchart)
	{
		setResetChart(getContext(), resetchart);
	}

	/**
	 * Set value of ResetChart
	 * @param context
	 * @param resetchart
	 */
	public final void setResetChart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean resetchart)
	{
		getMendixObject().setValue(context, MemberNames.ResetChart.toString(), resetchart);
	}

	/**
	 * @return value of Node_Workflow
	 */
	public final workflowtemplate.proxies.Workflow getNode_Workflow() throws com.mendix.core.CoreException
	{
		return getNode_Workflow(getContext());
	}

	/**
	 * @param context
	 * @return value of Node_Workflow
	 */
	public final workflowtemplate.proxies.Workflow getNode_Workflow(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowtemplate.proxies.Workflow result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Node_Workflow.toString());
		if (identifier != null)
			result = workflowtemplate.proxies.Workflow.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Node_Workflow
	 * @param node_workflow
	 */
	public final void setNode_Workflow(workflowtemplate.proxies.Workflow node_workflow)
	{
		setNode_Workflow(getContext(), node_workflow);
	}

	/**
	 * Set value of Node_Workflow
	 * @param context
	 * @param node_workflow
	 */
	public final void setNode_Workflow(com.mendix.systemwideinterfaces.core.IContext context, workflowtemplate.proxies.Workflow node_workflow)
	{
		if (node_workflow == null)
			getMendixObject().setValue(context, MemberNames.Node_Workflow.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Node_Workflow.toString(), node_workflow.getMendixObject().getId());
	}

	/**
	 * @return value of TempInsertAfterNodeTemplate
	 */
	public final workflowtemplate.proxies.Node getTempInsertAfterNodeTemplate() throws com.mendix.core.CoreException
	{
		return getTempInsertAfterNodeTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of TempInsertAfterNodeTemplate
	 */
	public final workflowtemplate.proxies.Node getTempInsertAfterNodeTemplate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowtemplate.proxies.Node result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TempInsertAfterNodeTemplate.toString());
		if (identifier != null)
			result = workflowtemplate.proxies.Node.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TempInsertAfterNodeTemplate
	 * @param tempinsertafternodetemplate
	 */
	public final void setTempInsertAfterNodeTemplate(workflowtemplate.proxies.Node tempinsertafternodetemplate)
	{
		setTempInsertAfterNodeTemplate(getContext(), tempinsertafternodetemplate);
	}

	/**
	 * Set value of TempInsertAfterNodeTemplate
	 * @param context
	 * @param tempinsertafternodetemplate
	 */
	public final void setTempInsertAfterNodeTemplate(com.mendix.systemwideinterfaces.core.IContext context, workflowtemplate.proxies.Node tempinsertafternodetemplate)
	{
		if (tempinsertafternodetemplate == null)
			getMendixObject().setValue(context, MemberNames.TempInsertAfterNodeTemplate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TempInsertAfterNodeTemplate.toString(), tempinsertafternodetemplate.getMendixObject().getId());
	}

	/**
	 * @return value of EndNode_WorkflowResult
	 */
	public final workflowshared.proxies.WorkflowResult getEndNode_WorkflowResult() throws com.mendix.core.CoreException
	{
		return getEndNode_WorkflowResult(getContext());
	}

	/**
	 * @param context
	 * @return value of EndNode_WorkflowResult
	 */
	public final workflowshared.proxies.WorkflowResult getEndNode_WorkflowResult(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowshared.proxies.WorkflowResult result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.EndNode_WorkflowResult.toString());
		if (identifier != null)
			result = workflowshared.proxies.WorkflowResult.load(context, identifier);
		return result;
	}

	/**
	 * Set value of EndNode_WorkflowResult
	 * @param endnode_workflowresult
	 */
	public final void setEndNode_WorkflowResult(workflowshared.proxies.WorkflowResult endnode_workflowresult)
	{
		setEndNode_WorkflowResult(getContext(), endnode_workflowresult);
	}

	/**
	 * Set value of EndNode_WorkflowResult
	 * @param context
	 * @param endnode_workflowresult
	 */
	public final void setEndNode_WorkflowResult(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.WorkflowResult endnode_workflowresult)
	{
		if (endnode_workflowresult == null)
			getMendixObject().setValue(context, MemberNames.EndNode_WorkflowResult.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.EndNode_WorkflowResult.toString(), endnode_workflowresult.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return nodeMendixObject;
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
			final workflowtemplate.proxies.Node that = (workflowtemplate.proxies.Node) obj;
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
		return "WorkflowTemplate.Node";
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
