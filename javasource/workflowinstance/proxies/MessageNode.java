// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowinstance.proxies;

public class MessageNode extends workflowinstance.proxies.Node
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowInstance.MessageNode";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MessageType("MessageType"),
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
		MessageNode_TransitionMessage("WorkflowInstance.MessageNode_TransitionMessage"),
		MessageNode_InterfaceMessageConfiguration("WorkflowInstance.MessageNode_InterfaceMessageConfiguration"),
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

	public MessageNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowInstance.MessageNode"));
	}

	protected MessageNode(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject messageNodeMendixObject)
	{
		super(context, messageNodeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowInstance.MessageNode", messageNodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowInstance.MessageNode");
	}

	/**
	 * @deprecated Use 'MessageNode.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowinstance.proxies.MessageNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowinstance.proxies.MessageNode.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowinstance.proxies.MessageNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowinstance.proxies.MessageNode(context, mendixObject);
	}

	public static workflowinstance.proxies.MessageNode load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowinstance.proxies.MessageNode.initialize(context, mendixObject);
	}

	public static java.util.List<workflowinstance.proxies.MessageNode> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowinstance.proxies.MessageNode> result = new java.util.ArrayList<workflowinstance.proxies.MessageNode>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowInstance.MessageNode" + xpathConstraint))
			result.add(workflowinstance.proxies.MessageNode.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of MessageType
	 * @param messagetype
	 */
	public final workflowshared.proxies.MessageNodeTypeEnum getMessageType()
	{
		return getMessageType(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageType
	 */
	public final workflowshared.proxies.MessageNodeTypeEnum getMessageType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.MessageType.toString());
		if (obj == null)
			return null;

		return workflowshared.proxies.MessageNodeTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of MessageType
	 * @param messagetype
	 */
	public final void setMessageType(workflowshared.proxies.MessageNodeTypeEnum messagetype)
	{
		setMessageType(getContext(), messagetype);
	}

	/**
	 * Set value of MessageType
	 * @param context
	 * @param messagetype
	 */
	public final void setMessageType(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.MessageNodeTypeEnum messagetype)
	{
		if (messagetype != null)
			getMendixObject().setValue(context, MemberNames.MessageType.toString(), messagetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.MessageType.toString(), null);
	}

	/**
	 * @return value of MessageNode_TransitionMessage
	 */
	public final statetransition.proxies.TransitionMessage getMessageNode_TransitionMessage() throws com.mendix.core.CoreException
	{
		return getMessageNode_TransitionMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageNode_TransitionMessage
	 */
	public final statetransition.proxies.TransitionMessage getMessageNode_TransitionMessage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		statetransition.proxies.TransitionMessage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MessageNode_TransitionMessage.toString());
		if (identifier != null)
			result = statetransition.proxies.TransitionMessage.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MessageNode_TransitionMessage
	 * @param messagenode_transitionmessage
	 */
	public final void setMessageNode_TransitionMessage(statetransition.proxies.TransitionMessage messagenode_transitionmessage)
	{
		setMessageNode_TransitionMessage(getContext(), messagenode_transitionmessage);
	}

	/**
	 * Set value of MessageNode_TransitionMessage
	 * @param context
	 * @param messagenode_transitionmessage
	 */
	public final void setMessageNode_TransitionMessage(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.TransitionMessage messagenode_transitionmessage)
	{
		if (messagenode_transitionmessage == null)
			getMendixObject().setValue(context, MemberNames.MessageNode_TransitionMessage.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MessageNode_TransitionMessage.toString(), messagenode_transitionmessage.getMendixObject().getId());
	}

	/**
	 * @return value of MessageNode_InterfaceMessageConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceMessageConfiguration getMessageNode_InterfaceMessageConfiguration() throws com.mendix.core.CoreException
	{
		return getMessageNode_InterfaceMessageConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageNode_InterfaceMessageConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceMessageConfiguration getMessageNode_InterfaceMessageConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.InterfaceMessageConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MessageNode_InterfaceMessageConfiguration.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.InterfaceMessageConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MessageNode_InterfaceMessageConfiguration
	 * @param messagenode_interfacemessageconfiguration
	 */
	public final void setMessageNode_InterfaceMessageConfiguration(interfaceconfiguration.proxies.InterfaceMessageConfiguration messagenode_interfacemessageconfiguration)
	{
		setMessageNode_InterfaceMessageConfiguration(getContext(), messagenode_interfacemessageconfiguration);
	}

	/**
	 * Set value of MessageNode_InterfaceMessageConfiguration
	 * @param context
	 * @param messagenode_interfacemessageconfiguration
	 */
	public final void setMessageNode_InterfaceMessageConfiguration(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.InterfaceMessageConfiguration messagenode_interfacemessageconfiguration)
	{
		if (messagenode_interfacemessageconfiguration == null)
			getMendixObject().setValue(context, MemberNames.MessageNode_InterfaceMessageConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MessageNode_InterfaceMessageConfiguration.toString(), messagenode_interfacemessageconfiguration.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowinstance.proxies.MessageNode that = (workflowinstance.proxies.MessageNode) obj;
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
		return "WorkflowInstance.MessageNode";
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
