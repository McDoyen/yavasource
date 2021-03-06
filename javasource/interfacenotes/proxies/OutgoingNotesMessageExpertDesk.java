// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacenotes.proxies;

public class OutgoingNotesMessageExpertDesk extends interfacenotes.proxies.OutgoingNotes
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceNotes.OutgoingNotesMessageExpertDesk";

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
		OutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk("InterfaceNotes.OutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk"),
		OutgoingNotesMessageExpertDesk_MendixWebServiceHeader("InterfaceNotes.OutgoingNotesMessageExpertDesk_MendixWebServiceHeader"),
		OutgoingNotes_Request("InterfaceNotes.OutgoingNotes_Request"),
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

	public OutgoingNotesMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceNotes.OutgoingNotesMessageExpertDesk"));
	}

	protected OutgoingNotesMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingNotesMessageExpertDeskMendixObject)
	{
		super(context, outgoingNotesMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceNotes.OutgoingNotesMessageExpertDesk", outgoingNotesMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceNotes.OutgoingNotesMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingNotesMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacenotes.proxies.OutgoingNotesMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacenotes.proxies.OutgoingNotesMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacenotes.proxies.OutgoingNotesMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacenotes.proxies.OutgoingNotesMessageExpertDesk(context, mendixObject);
	}

	public static interfacenotes.proxies.OutgoingNotesMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacenotes.proxies.OutgoingNotesMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacenotes.proxies.OutgoingNotesMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacenotes.proxies.OutgoingNotesMessageExpertDesk> result = new java.util.ArrayList<interfacenotes.proxies.OutgoingNotesMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceNotes.OutgoingNotesMessageExpertDesk" + xpathConstraint))
			result.add(interfacenotes.proxies.OutgoingNotesMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk
	 */
	public final interfacenotes.proxies.OutgoingNotesExpertDesk getOutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk
	 */
	public final interfacenotes.proxies.OutgoingNotesExpertDesk getOutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacenotes.proxies.OutgoingNotesExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacenotes.proxies.OutgoingNotesExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk
	 * @param outgoingnotesexpertdesk_outgoingnotesmessageexpertdesk
	 */
	public final void setOutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk(interfacenotes.proxies.OutgoingNotesExpertDesk outgoingnotesexpertdesk_outgoingnotesmessageexpertdesk)
	{
		setOutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk(getContext(), outgoingnotesexpertdesk_outgoingnotesmessageexpertdesk);
	}

	/**
	 * Set value of OutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk
	 * @param context
	 * @param outgoingnotesexpertdesk_outgoingnotesmessageexpertdesk
	 */
	public final void setOutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacenotes.proxies.OutgoingNotesExpertDesk outgoingnotesexpertdesk_outgoingnotesmessageexpertdesk)
	{
		if (outgoingnotesexpertdesk_outgoingnotesmessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingNotesExpertDesk_OutgoingNotesMessageExpertDesk.toString(), outgoingnotesexpertdesk_outgoingnotesmessageexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of OutgoingNotesMessageExpertDesk_MendixWebServiceHeader
	 */
	public final interfaceshared.proxies.MendixWebServiceHeader getOutgoingNotesMessageExpertDesk_MendixWebServiceHeader() throws com.mendix.core.CoreException
	{
		return getOutgoingNotesMessageExpertDesk_MendixWebServiceHeader(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingNotesMessageExpertDesk_MendixWebServiceHeader
	 */
	public final interfaceshared.proxies.MendixWebServiceHeader getOutgoingNotesMessageExpertDesk_MendixWebServiceHeader(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.MendixWebServiceHeader result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingNotesMessageExpertDesk_MendixWebServiceHeader.toString());
		if (identifier != null)
			result = interfaceshared.proxies.MendixWebServiceHeader.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingNotesMessageExpertDesk_MendixWebServiceHeader
	 * @param outgoingnotesmessageexpertdesk_mendixwebserviceheader
	 */
	public final void setOutgoingNotesMessageExpertDesk_MendixWebServiceHeader(interfaceshared.proxies.MendixWebServiceHeader outgoingnotesmessageexpertdesk_mendixwebserviceheader)
	{
		setOutgoingNotesMessageExpertDesk_MendixWebServiceHeader(getContext(), outgoingnotesmessageexpertdesk_mendixwebserviceheader);
	}

	/**
	 * Set value of OutgoingNotesMessageExpertDesk_MendixWebServiceHeader
	 * @param context
	 * @param outgoingnotesmessageexpertdesk_mendixwebserviceheader
	 */
	public final void setOutgoingNotesMessageExpertDesk_MendixWebServiceHeader(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.MendixWebServiceHeader outgoingnotesmessageexpertdesk_mendixwebserviceheader)
	{
		if (outgoingnotesmessageexpertdesk_mendixwebserviceheader == null)
			getMendixObject().setValue(context, MemberNames.OutgoingNotesMessageExpertDesk_MendixWebServiceHeader.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingNotesMessageExpertDesk_MendixWebServiceHeader.toString(), outgoingnotesmessageexpertdesk_mendixwebserviceheader.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacenotes.proxies.OutgoingNotesMessageExpertDesk that = (interfacenotes.proxies.OutgoingNotesMessageExpertDesk) obj;
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
		return "InterfaceNotes.OutgoingNotesMessageExpertDesk";
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
