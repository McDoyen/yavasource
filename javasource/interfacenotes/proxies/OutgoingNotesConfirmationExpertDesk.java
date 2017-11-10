// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacenotes.proxies;

public class OutgoingNotesConfirmationExpertDesk extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceNotes.OutgoingNotesConfirmationExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConfirmationMessageID("ConfirmationMessageID"),
		MessageID("MessageID"),
		InterfaceName("InterfaceName"),
		NotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk("InterfaceNotes.NotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk"),
		OutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk("InterfaceNotes.OutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk");

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

	public OutgoingNotesConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceNotes.OutgoingNotesConfirmationExpertDesk"));
	}

	protected OutgoingNotesConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingNotesConfirmationExpertDeskMendixObject)
	{
		super(context, outgoingNotesConfirmationExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceNotes.OutgoingNotesConfirmationExpertDesk", outgoingNotesConfirmationExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceNotes.OutgoingNotesConfirmationExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingNotesConfirmationExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk(context, mendixObject);
	}

	public static interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk> result = new java.util.ArrayList<interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceNotes.OutgoingNotesConfirmationExpertDesk" + xpathConstraint))
			result.add(interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ConfirmationMessageID
	 */
	public final java.lang.String getConfirmationMessageID()
	{
		return getConfirmationMessageID(getContext());
	}

	/**
	 * @param context
	 * @return value of ConfirmationMessageID
	 */
	public final java.lang.String getConfirmationMessageID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ConfirmationMessageID.toString());
	}

	/**
	 * Set value of ConfirmationMessageID
	 * @param confirmationmessageid
	 */
	public final void setConfirmationMessageID(java.lang.String confirmationmessageid)
	{
		setConfirmationMessageID(getContext(), confirmationmessageid);
	}

	/**
	 * Set value of ConfirmationMessageID
	 * @param context
	 * @param confirmationmessageid
	 */
	public final void setConfirmationMessageID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String confirmationmessageid)
	{
		getMendixObject().setValue(context, MemberNames.ConfirmationMessageID.toString(), confirmationmessageid);
	}

	/**
	 * @return value of MessageID
	 */
	public final java.lang.String getMessageID()
	{
		return getMessageID(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageID
	 */
	public final java.lang.String getMessageID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MessageID.toString());
	}

	/**
	 * Set value of MessageID
	 * @param messageid
	 */
	public final void setMessageID(java.lang.String messageid)
	{
		setMessageID(getContext(), messageid);
	}

	/**
	 * Set value of MessageID
	 * @param context
	 * @param messageid
	 */
	public final void setMessageID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String messageid)
	{
		getMendixObject().setValue(context, MemberNames.MessageID.toString(), messageid);
	}

	/**
	 * @return value of InterfaceName
	 */
	public final java.lang.String getInterfaceName()
	{
		return getInterfaceName(getContext());
	}

	/**
	 * @param context
	 * @return value of InterfaceName
	 */
	public final java.lang.String getInterfaceName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InterfaceName.toString());
	}

	/**
	 * Set value of InterfaceName
	 * @param interfacename
	 */
	public final void setInterfaceName(java.lang.String interfacename)
	{
		setInterfaceName(getContext(), interfacename);
	}

	/**
	 * Set value of InterfaceName
	 * @param context
	 * @param interfacename
	 */
	public final void setInterfaceName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String interfacename)
	{
		getMendixObject().setValue(context, MemberNames.InterfaceName.toString(), interfacename);
	}

	/**
	 * @return value of NotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk
	 */
	public final interfacenotes.proxies.NotesResponseContainerExpertDesk getNotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk() throws com.mendix.core.CoreException
	{
		return getNotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of NotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk
	 */
	public final interfacenotes.proxies.NotesResponseContainerExpertDesk getNotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacenotes.proxies.NotesResponseContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk.toString());
		if (identifier != null)
			result = interfacenotes.proxies.NotesResponseContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk
	 * @param notesresponsecontainerexpertdesk_outgoingnotesconfirmationexpertdesk
	 */
	public final void setNotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk(interfacenotes.proxies.NotesResponseContainerExpertDesk notesresponsecontainerexpertdesk_outgoingnotesconfirmationexpertdesk)
	{
		setNotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk(getContext(), notesresponsecontainerexpertdesk_outgoingnotesconfirmationexpertdesk);
	}

	/**
	 * Set value of NotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk
	 * @param context
	 * @param notesresponsecontainerexpertdesk_outgoingnotesconfirmationexpertdesk
	 */
	public final void setNotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacenotes.proxies.NotesResponseContainerExpertDesk notesresponsecontainerexpertdesk_outgoingnotesconfirmationexpertdesk)
	{
		if (notesresponsecontainerexpertdesk_outgoingnotesconfirmationexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.NotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NotesResponseContainerExpertDesk_OutgoingNotesConfirmationExpertDesk.toString(), notesresponsecontainerexpertdesk_outgoingnotesconfirmationexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of OutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk
	 */
	public final interfacenotes.proxies.OutgoingNotesConfirmationMessageExpertDesk getOutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk
	 */
	public final interfacenotes.proxies.OutgoingNotesConfirmationMessageExpertDesk getOutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacenotes.proxies.OutgoingNotesConfirmationMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacenotes.proxies.OutgoingNotesConfirmationMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk
	 * @param outgoingnotesconfirmationexpertdesk_outgoingnotesconfirmationmessageexpertdesk
	 */
	public final void setOutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk(interfacenotes.proxies.OutgoingNotesConfirmationMessageExpertDesk outgoingnotesconfirmationexpertdesk_outgoingnotesconfirmationmessageexpertdesk)
	{
		setOutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk(getContext(), outgoingnotesconfirmationexpertdesk_outgoingnotesconfirmationmessageexpertdesk);
	}

	/**
	 * Set value of OutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk
	 * @param context
	 * @param outgoingnotesconfirmationexpertdesk_outgoingnotesconfirmationmessageexpertdesk
	 */
	public final void setOutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacenotes.proxies.OutgoingNotesConfirmationMessageExpertDesk outgoingnotesconfirmationexpertdesk_outgoingnotesconfirmationmessageexpertdesk)
	{
		if (outgoingnotesconfirmationexpertdesk_outgoingnotesconfirmationmessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingNotesConfirmationExpertDesk_OutgoingNotesConfirmationMessageExpertDesk.toString(), outgoingnotesconfirmationexpertdesk_outgoingnotesconfirmationmessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk that = (interfacenotes.proxies.OutgoingNotesConfirmationExpertDesk) obj;
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
		return "InterfaceNotes.OutgoingNotesConfirmationExpertDesk";
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