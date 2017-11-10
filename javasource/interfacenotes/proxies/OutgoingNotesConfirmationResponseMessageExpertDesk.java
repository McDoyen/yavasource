// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacenotes.proxies;

public class OutgoingNotesConfirmationResponseMessageExpertDesk extends interfaceshared.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceNotes.OutgoingNotesConfirmationResponseMessageExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk("InterfaceNotes.OutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk"),
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

	public OutgoingNotesConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceNotes.OutgoingNotesConfirmationResponseMessageExpertDesk"));
	}

	protected OutgoingNotesConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingNotesConfirmationResponseMessageExpertDeskMendixObject)
	{
		super(context, outgoingNotesConfirmationResponseMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceNotes.OutgoingNotesConfirmationResponseMessageExpertDesk", outgoingNotesConfirmationResponseMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceNotes.OutgoingNotesConfirmationResponseMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingNotesConfirmationResponseMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk(context, mendixObject);
	}

	public static interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk> result = new java.util.ArrayList<interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceNotes.OutgoingNotesConfirmationResponseMessageExpertDesk" + xpathConstraint))
			result.add(interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk
	 */
	public final interfacenotes.proxies.OutgoingNotesConfirmationResponseExpertDesk getOutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk
	 */
	public final interfacenotes.proxies.OutgoingNotesConfirmationResponseExpertDesk getOutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacenotes.proxies.OutgoingNotesConfirmationResponseExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacenotes.proxies.OutgoingNotesConfirmationResponseExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk
	 * @param outgoingnotesconfirmationresponseexpertdesk_outgoingnotesconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk(interfacenotes.proxies.OutgoingNotesConfirmationResponseExpertDesk outgoingnotesconfirmationresponseexpertdesk_outgoingnotesconfirmationresponsemessageexpertdesk)
	{
		setOutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk(getContext(), outgoingnotesconfirmationresponseexpertdesk_outgoingnotesconfirmationresponsemessageexpertdesk);
	}

	/**
	 * Set value of OutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk
	 * @param context
	 * @param outgoingnotesconfirmationresponseexpertdesk_outgoingnotesconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacenotes.proxies.OutgoingNotesConfirmationResponseExpertDesk outgoingnotesconfirmationresponseexpertdesk_outgoingnotesconfirmationresponsemessageexpertdesk)
	{
		if (outgoingnotesconfirmationresponseexpertdesk_outgoingnotesconfirmationresponsemessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingNotesConfirmationResponseExpertDesk_OutgoingNotesConfirmationResponseMessageExpertDesk.toString(), outgoingnotesconfirmationresponseexpertdesk_outgoingnotesconfirmationresponsemessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk that = (interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk) obj;
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
		return "InterfaceNotes.OutgoingNotesConfirmationResponseMessageExpertDesk";
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
