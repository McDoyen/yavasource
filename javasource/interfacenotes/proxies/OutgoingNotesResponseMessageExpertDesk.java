// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacenotes.proxies;

public class OutgoingNotesResponseMessageExpertDesk extends interfaceshared.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceNotes.OutgoingNotesResponseMessageExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public OutgoingNotesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceNotes.OutgoingNotesResponseMessageExpertDesk"));
	}

	protected OutgoingNotesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingNotesResponseMessageExpertDeskMendixObject)
	{
		super(context, outgoingNotesResponseMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceNotes.OutgoingNotesResponseMessageExpertDesk", outgoingNotesResponseMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceNotes.OutgoingNotesResponseMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingNotesResponseMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk(context, mendixObject);
	}

	public static interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk> result = new java.util.ArrayList<interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceNotes.OutgoingNotesResponseMessageExpertDesk" + xpathConstraint))
			result.add(interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of NotesResponse_OutgoingNotesResponseMessageExpertDesk
	 */
	public final interfacenotes.proxies.NotesResponse getNotesResponse_OutgoingNotesResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getNotesResponse_OutgoingNotesResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of NotesResponse_OutgoingNotesResponseMessageExpertDesk
	 */
	public final interfacenotes.proxies.NotesResponse getNotesResponse_OutgoingNotesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacenotes.proxies.NotesResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NotesResponse_OutgoingNotesResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacenotes.proxies.NotesResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NotesResponse_OutgoingNotesResponseMessageExpertDesk
	 * @param notesresponse_outgoingnotesresponsemessageexpertdesk
	 */
	public final void setNotesResponse_OutgoingNotesResponseMessageExpertDesk(interfacenotes.proxies.NotesResponse notesresponse_outgoingnotesresponsemessageexpertdesk)
	{
		setNotesResponse_OutgoingNotesResponseMessageExpertDesk(getContext(), notesresponse_outgoingnotesresponsemessageexpertdesk);
	}

	/**
	 * Set value of NotesResponse_OutgoingNotesResponseMessageExpertDesk
	 * @param context
	 * @param notesresponse_outgoingnotesresponsemessageexpertdesk
	 */
	public final void setNotesResponse_OutgoingNotesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacenotes.proxies.NotesResponse notesresponse_outgoingnotesresponsemessageexpertdesk)
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
			final interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk that = (interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk) obj;
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
		return "InterfaceNotes.OutgoingNotesResponseMessageExpertDesk";
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
