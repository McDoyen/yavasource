// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceexternalreferences.proxies;

public class OutgoingExternalReferencesConfirmationMessageExpertDesk extends interfacenotes.proxies.OutgoingNotesConfirmation
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceExternalReferences.OutgoingExternalReferencesConfirmationMessageExpertDesk";

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
		OutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk("InterfaceExternalReferences.OutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk"),
		OutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader("InterfaceExternalReferences.OutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader"),
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

	public OutgoingExternalReferencesConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceExternalReferences.OutgoingExternalReferencesConfirmationMessageExpertDesk"));
	}

	protected OutgoingExternalReferencesConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingExternalReferencesConfirmationMessageExpertDeskMendixObject)
	{
		super(context, outgoingExternalReferencesConfirmationMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceExternalReferences.OutgoingExternalReferencesConfirmationMessageExpertDesk", outgoingExternalReferencesConfirmationMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceExternalReferences.OutgoingExternalReferencesConfirmationMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingExternalReferencesConfirmationMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk(context, mendixObject);
	}

	public static interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk> result = new java.util.ArrayList<interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceExternalReferences.OutgoingExternalReferencesConfirmationMessageExpertDesk" + xpathConstraint))
			result.add(interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk
	 */
	public final interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk getOutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk
	 */
	public final interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk getOutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk.toString());
		if (identifier != null)
			result = interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk
	 * @param outgoingexternalreferencesconfirmationexpertdesk_outgoingexternalreferencesconfirmationmessageexpertdesk
	 */
	public final void setOutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk(interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk outgoingexternalreferencesconfirmationexpertdesk_outgoingexternalreferencesconfirmationmessageexpertdesk)
	{
		setOutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk(getContext(), outgoingexternalreferencesconfirmationexpertdesk_outgoingexternalreferencesconfirmationmessageexpertdesk);
	}

	/**
	 * Set value of OutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk
	 * @param context
	 * @param outgoingexternalreferencesconfirmationexpertdesk_outgoingexternalreferencesconfirmationmessageexpertdesk
	 */
	public final void setOutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk outgoingexternalreferencesconfirmationexpertdesk_outgoingexternalreferencesconfirmationmessageexpertdesk)
	{
		if (outgoingexternalreferencesconfirmationexpertdesk_outgoingexternalreferencesconfirmationmessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingExternalReferencesConfirmationExpertDesk_OutgoingExternalReferencesConfirmationMessageExpertDesk.toString(), outgoingexternalreferencesconfirmationexpertdesk_outgoingexternalreferencesconfirmationmessageexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of OutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader
	 */
	public final interfaceshared.proxies.MendixWebServiceHeader getOutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader() throws com.mendix.core.CoreException
	{
		return getOutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader
	 */
	public final interfaceshared.proxies.MendixWebServiceHeader getOutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.MendixWebServiceHeader result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader.toString());
		if (identifier != null)
			result = interfaceshared.proxies.MendixWebServiceHeader.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader
	 * @param outgoingexternalreferencesconfirmationmessageexpertdesk_mendixwebserviceheader
	 */
	public final void setOutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader(interfaceshared.proxies.MendixWebServiceHeader outgoingexternalreferencesconfirmationmessageexpertdesk_mendixwebserviceheader)
	{
		setOutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader(getContext(), outgoingexternalreferencesconfirmationmessageexpertdesk_mendixwebserviceheader);
	}

	/**
	 * Set value of OutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader
	 * @param context
	 * @param outgoingexternalreferencesconfirmationmessageexpertdesk_mendixwebserviceheader
	 */
	public final void setOutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.MendixWebServiceHeader outgoingexternalreferencesconfirmationmessageexpertdesk_mendixwebserviceheader)
	{
		if (outgoingexternalreferencesconfirmationmessageexpertdesk_mendixwebserviceheader == null)
			getMendixObject().setValue(context, MemberNames.OutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingExternalReferencesConfirmationMessageExpertDesk_MendixWebServiceHeader.toString(), outgoingexternalreferencesconfirmationmessageexpertdesk_mendixwebserviceheader.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk that = (interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationMessageExpertDesk) obj;
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
		return "InterfaceExternalReferences.OutgoingExternalReferencesConfirmationMessageExpertDesk";
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
