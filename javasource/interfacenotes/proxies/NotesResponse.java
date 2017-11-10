// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacenotes.proxies;

public class NotesResponse extends interfaceshared.proxies.ResponseExpertDesk
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceNotes.NotesResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ResponseCode("ResponseCode"),
		ResponseMessage("ResponseMessage"),
		NotesResponse_IncomingNotesConfirmation("InterfaceNotes.NotesResponse_IncomingNotesConfirmation"),
		NotesResponse_NotesResponseContainerExpertDesk("InterfaceNotes.NotesResponse_NotesResponseContainerExpertDesk"),
		NoteResponsesContainerExpertDesk_NotesResponse("InterfaceNotes.NoteResponsesContainerExpertDesk_NotesResponse"),
		NotesResponse_OutgoingNotesResponseMessageExpertDesk("InterfaceNotes.NotesResponse_OutgoingNotesResponseMessageExpertDesk"),
		ProcessingAttempt_Response("InterfaceShared.ProcessingAttempt_Response"),
		IncomingMessage_SynchronousResponse("InterfaceShared.IncomingMessage_SynchronousResponse");

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

	public NotesResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceNotes.NotesResponse"));
	}

	protected NotesResponse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject notesResponseMendixObject)
	{
		super(context, notesResponseMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceNotes.NotesResponse", notesResponseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceNotes.NotesResponse");
	}

	/**
	 * @deprecated Use 'NotesResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacenotes.proxies.NotesResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacenotes.proxies.NotesResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacenotes.proxies.NotesResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacenotes.proxies.NotesResponse(context, mendixObject);
	}

	public static interfacenotes.proxies.NotesResponse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacenotes.proxies.NotesResponse.initialize(context, mendixObject);
	}

	public static java.util.List<interfacenotes.proxies.NotesResponse> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacenotes.proxies.NotesResponse> result = new java.util.ArrayList<interfacenotes.proxies.NotesResponse>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceNotes.NotesResponse" + xpathConstraint))
			result.add(interfacenotes.proxies.NotesResponse.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of NotesResponse_IncomingNotesConfirmation
	 */
	public final interfacenotes.proxies.IncomingNotesConfirmation getNotesResponse_IncomingNotesConfirmation() throws com.mendix.core.CoreException
	{
		return getNotesResponse_IncomingNotesConfirmation(getContext());
	}

	/**
	 * @param context
	 * @return value of NotesResponse_IncomingNotesConfirmation
	 */
	public final interfacenotes.proxies.IncomingNotesConfirmation getNotesResponse_IncomingNotesConfirmation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacenotes.proxies.IncomingNotesConfirmation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NotesResponse_IncomingNotesConfirmation.toString());
		if (identifier != null)
			result = interfacenotes.proxies.IncomingNotesConfirmation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NotesResponse_IncomingNotesConfirmation
	 * @param notesresponse_incomingnotesconfirmation
	 */
	public final void setNotesResponse_IncomingNotesConfirmation(interfacenotes.proxies.IncomingNotesConfirmation notesresponse_incomingnotesconfirmation)
	{
		setNotesResponse_IncomingNotesConfirmation(getContext(), notesresponse_incomingnotesconfirmation);
	}

	/**
	 * Set value of NotesResponse_IncomingNotesConfirmation
	 * @param context
	 * @param notesresponse_incomingnotesconfirmation
	 */
	public final void setNotesResponse_IncomingNotesConfirmation(com.mendix.systemwideinterfaces.core.IContext context, interfacenotes.proxies.IncomingNotesConfirmation notesresponse_incomingnotesconfirmation)
	{
		if (notesresponse_incomingnotesconfirmation == null)
			getMendixObject().setValue(context, MemberNames.NotesResponse_IncomingNotesConfirmation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NotesResponse_IncomingNotesConfirmation.toString(), notesresponse_incomingnotesconfirmation.getMendixObject().getId());
	}

	/**
	 * @return value of NotesResponse_NotesResponseContainerExpertDesk
	 */
	public final interfacenotes.proxies.NotesResponseContainerExpertDesk getNotesResponse_NotesResponseContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getNotesResponse_NotesResponseContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of NotesResponse_NotesResponseContainerExpertDesk
	 */
	public final interfacenotes.proxies.NotesResponseContainerExpertDesk getNotesResponse_NotesResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacenotes.proxies.NotesResponseContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NotesResponse_NotesResponseContainerExpertDesk.toString());
		if (identifier != null)
			result = interfacenotes.proxies.NotesResponseContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NotesResponse_NotesResponseContainerExpertDesk
	 * @param notesresponse_notesresponsecontainerexpertdesk
	 */
	public final void setNotesResponse_NotesResponseContainerExpertDesk(interfacenotes.proxies.NotesResponseContainerExpertDesk notesresponse_notesresponsecontainerexpertdesk)
	{
		setNotesResponse_NotesResponseContainerExpertDesk(getContext(), notesresponse_notesresponsecontainerexpertdesk);
	}

	/**
	 * Set value of NotesResponse_NotesResponseContainerExpertDesk
	 * @param context
	 * @param notesresponse_notesresponsecontainerexpertdesk
	 */
	public final void setNotesResponse_NotesResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacenotes.proxies.NotesResponseContainerExpertDesk notesresponse_notesresponsecontainerexpertdesk)
	{
		if (notesresponse_notesresponsecontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.NotesResponse_NotesResponseContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NotesResponse_NotesResponseContainerExpertDesk.toString(), notesresponse_notesresponsecontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of NoteResponsesContainerExpertDesk_NotesResponse
	 */
	public final interfacenotes.proxies.NoteResponsesContainerExpertDesk getNoteResponsesContainerExpertDesk_NotesResponse() throws com.mendix.core.CoreException
	{
		return getNoteResponsesContainerExpertDesk_NotesResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of NoteResponsesContainerExpertDesk_NotesResponse
	 */
	public final interfacenotes.proxies.NoteResponsesContainerExpertDesk getNoteResponsesContainerExpertDesk_NotesResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacenotes.proxies.NoteResponsesContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NoteResponsesContainerExpertDesk_NotesResponse.toString());
		if (identifier != null)
			result = interfacenotes.proxies.NoteResponsesContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NoteResponsesContainerExpertDesk_NotesResponse
	 * @param noteresponsescontainerexpertdesk_notesresponse
	 */
	public final void setNoteResponsesContainerExpertDesk_NotesResponse(interfacenotes.proxies.NoteResponsesContainerExpertDesk noteresponsescontainerexpertdesk_notesresponse)
	{
		setNoteResponsesContainerExpertDesk_NotesResponse(getContext(), noteresponsescontainerexpertdesk_notesresponse);
	}

	/**
	 * Set value of NoteResponsesContainerExpertDesk_NotesResponse
	 * @param context
	 * @param noteresponsescontainerexpertdesk_notesresponse
	 */
	public final void setNoteResponsesContainerExpertDesk_NotesResponse(com.mendix.systemwideinterfaces.core.IContext context, interfacenotes.proxies.NoteResponsesContainerExpertDesk noteresponsescontainerexpertdesk_notesresponse)
	{
		if (noteresponsescontainerexpertdesk_notesresponse == null)
			getMendixObject().setValue(context, MemberNames.NoteResponsesContainerExpertDesk_NotesResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NoteResponsesContainerExpertDesk_NotesResponse.toString(), noteresponsescontainerexpertdesk_notesresponse.getMendixObject().getId());
	}

	/**
	 * @return value of NotesResponse_OutgoingNotesResponseMessageExpertDesk
	 */
	public final interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk getNotesResponse_OutgoingNotesResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getNotesResponse_OutgoingNotesResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of NotesResponse_OutgoingNotesResponseMessageExpertDesk
	 */
	public final interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk getNotesResponse_OutgoingNotesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NotesResponse_OutgoingNotesResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NotesResponse_OutgoingNotesResponseMessageExpertDesk
	 * @param notesresponse_outgoingnotesresponsemessageexpertdesk
	 */
	public final void setNotesResponse_OutgoingNotesResponseMessageExpertDesk(interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk notesresponse_outgoingnotesresponsemessageexpertdesk)
	{
		setNotesResponse_OutgoingNotesResponseMessageExpertDesk(getContext(), notesresponse_outgoingnotesresponsemessageexpertdesk);
	}

	/**
	 * Set value of NotesResponse_OutgoingNotesResponseMessageExpertDesk
	 * @param context
	 * @param notesresponse_outgoingnotesresponsemessageexpertdesk
	 */
	public final void setNotesResponse_OutgoingNotesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk notesresponse_outgoingnotesresponsemessageexpertdesk)
	{
		if (notesresponse_outgoingnotesresponsemessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.NotesResponse_OutgoingNotesResponseMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NotesResponse_OutgoingNotesResponseMessageExpertDesk.toString(), notesresponse_outgoingnotesresponsemessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacenotes.proxies.NotesResponse that = (interfacenotes.proxies.NotesResponse) obj;
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
		return "InterfaceNotes.NotesResponse";
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