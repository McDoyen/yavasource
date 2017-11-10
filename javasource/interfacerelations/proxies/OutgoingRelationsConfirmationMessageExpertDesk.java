// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerelations.proxies;

public class OutgoingRelationsConfirmationMessageExpertDesk extends interfacerelations.proxies.OutgoingRelationsConfirmation
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRelations.OutgoingRelationsConfirmationMessageExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NextRetry("NextRetry"),
		RetryByHeartBeat("RetryByHeartBeat"),
		MessageID("MessageID"),
		MessageType("MessageType"),
		MessageDirection("MessageDirection"),
		Status("Status"),
		RetrievedInterfaceName("RetrievedInterfaceName"),
		CreatedByCustomMessage("CreatedByCustomMessage"),
		OutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk("InterfaceRelations.OutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk"),
		OutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader("InterfaceRelations.OutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader"),
		ProcessingAttempt_OutgoingConfirmation("InterfaceShared.ProcessingAttempt_OutgoingConfirmation"),
		InterfaceEvent_OutgoingMessage("InterfaceShared.InterfaceEvent_OutgoingMessage"),
		IncomingConfirmation_OutgoingMessage("InterfaceShared.IncomingConfirmation_OutgoingMessage"),
		OutgoingMessage_QueuedByOutgoingMessage("InterfaceShared.OutgoingMessage_QueuedByOutgoingMessage"),
		BooleanWrapper_Message("InterfaceShared.BooleanWrapper_Message"),
		Message_IndexData("InterfaceShared.Message_IndexData"),
		Message_InterfaceMessageConfiguration("InterfaceShared.Message_InterfaceMessageConfiguration"),
		Message_InterfaceConfiguration("InterfaceShared.Message_InterfaceConfiguration");

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

	public OutgoingRelationsConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRelations.OutgoingRelationsConfirmationMessageExpertDesk"));
	}

	protected OutgoingRelationsConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingRelationsConfirmationMessageExpertDeskMendixObject)
	{
		super(context, outgoingRelationsConfirmationMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRelations.OutgoingRelationsConfirmationMessageExpertDesk", outgoingRelationsConfirmationMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRelations.OutgoingRelationsConfirmationMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingRelationsConfirmationMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk(context, mendixObject);
	}

	public static interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk> result = new java.util.ArrayList<interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRelations.OutgoingRelationsConfirmationMessageExpertDesk" + xpathConstraint))
			result.add(interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk
	 */
	public final interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk getOutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk
	 */
	public final interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk getOutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk
	 * @param outgoingrelationsconfirmationexpertdesk_outgoingrelationsconfirmationmessageexpertdesk
	 */
	public final void setOutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk(interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk outgoingrelationsconfirmationexpertdesk_outgoingrelationsconfirmationmessageexpertdesk)
	{
		setOutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk(getContext(), outgoingrelationsconfirmationexpertdesk_outgoingrelationsconfirmationmessageexpertdesk);
	}

	/**
	 * Set value of OutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk
	 * @param context
	 * @param outgoingrelationsconfirmationexpertdesk_outgoingrelationsconfirmationmessageexpertdesk
	 */
	public final void setOutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk outgoingrelationsconfirmationexpertdesk_outgoingrelationsconfirmationmessageexpertdesk)
	{
		if (outgoingrelationsconfirmationexpertdesk_outgoingrelationsconfirmationmessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingRelationsConfirmationExpertDesk_OutgoingRelationsConfirmationMessageExpertDesk.toString(), outgoingrelationsconfirmationexpertdesk_outgoingrelationsconfirmationmessageexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of OutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader
	 */
	public final interfaceshared.proxies.MendixWebServiceHeader getOutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader() throws com.mendix.core.CoreException
	{
		return getOutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader
	 */
	public final interfaceshared.proxies.MendixWebServiceHeader getOutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.MendixWebServiceHeader result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader.toString());
		if (identifier != null)
			result = interfaceshared.proxies.MendixWebServiceHeader.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader
	 * @param outgoingrelationsconfirmationmessageexpertdesk_mendixwebserviceheader
	 */
	public final void setOutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader(interfaceshared.proxies.MendixWebServiceHeader outgoingrelationsconfirmationmessageexpertdesk_mendixwebserviceheader)
	{
		setOutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader(getContext(), outgoingrelationsconfirmationmessageexpertdesk_mendixwebserviceheader);
	}

	/**
	 * Set value of OutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader
	 * @param context
	 * @param outgoingrelationsconfirmationmessageexpertdesk_mendixwebserviceheader
	 */
	public final void setOutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.MendixWebServiceHeader outgoingrelationsconfirmationmessageexpertdesk_mendixwebserviceheader)
	{
		if (outgoingrelationsconfirmationmessageexpertdesk_mendixwebserviceheader == null)
			getMendixObject().setValue(context, MemberNames.OutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingRelationsConfirmationMessageExpertDesk_MendixWebServiceHeader.toString(), outgoingrelationsconfirmationmessageexpertdesk_mendixwebserviceheader.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk that = (interfacerelations.proxies.OutgoingRelationsConfirmationMessageExpertDesk) obj;
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
		return "InterfaceRelations.OutgoingRelationsConfirmationMessageExpertDesk";
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
