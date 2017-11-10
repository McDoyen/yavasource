// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceattachments.proxies;

public class IncomingAttachmentsConfirmation extends interfaceshared.proxies.IncomingConfirmation
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceAttachments.IncomingAttachmentsConfirmation";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConfirmationMessageID("ConfirmationMessageID"),
		InterfaceName("InterfaceName"),
		ExternalReferenceID("ExternalReferenceID"),
		InternalReferenceID("InternalReferenceID"),
		SuccessfullyProcessed("SuccessfullyProcessed"),
		MessageID("MessageID"),
		MessageType("MessageType"),
		MessageDirection("MessageDirection"),
		Status("Status"),
		RetrievedInterfaceName("RetrievedInterfaceName"),
		CreatedByCustomMessage("CreatedByCustomMessage"),
		AttachmentsResponse_IncomingAttachmentsConfirmation("InterfaceAttachments.AttachmentsResponse_IncomingAttachmentsConfirmation"),
		IncomingConfirmation_OutgoingMessage("InterfaceShared.IncomingConfirmation_OutgoingMessage"),
		IncomingMessage_SynchronousResponse("InterfaceShared.IncomingMessage_SynchronousResponse"),
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

	public IncomingAttachmentsConfirmation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceAttachments.IncomingAttachmentsConfirmation"));
	}

	protected IncomingAttachmentsConfirmation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject incomingAttachmentsConfirmationMendixObject)
	{
		super(context, incomingAttachmentsConfirmationMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceAttachments.IncomingAttachmentsConfirmation", incomingAttachmentsConfirmationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceAttachments.IncomingAttachmentsConfirmation");
	}

	/**
	 * @deprecated Use 'IncomingAttachmentsConfirmation.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceattachments.proxies.IncomingAttachmentsConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceattachments.proxies.IncomingAttachmentsConfirmation.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceattachments.proxies.IncomingAttachmentsConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceattachments.proxies.IncomingAttachmentsConfirmation(context, mendixObject);
	}

	public static interfaceattachments.proxies.IncomingAttachmentsConfirmation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceattachments.proxies.IncomingAttachmentsConfirmation.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceattachments.proxies.IncomingAttachmentsConfirmation> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceattachments.proxies.IncomingAttachmentsConfirmation> result = new java.util.ArrayList<interfaceattachments.proxies.IncomingAttachmentsConfirmation>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceAttachments.IncomingAttachmentsConfirmation" + xpathConstraint))
			result.add(interfaceattachments.proxies.IncomingAttachmentsConfirmation.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of AttachmentsResponse_IncomingAttachmentsConfirmation
	 */
	public final interfaceattachments.proxies.AttachmentsResponse getAttachmentsResponse_IncomingAttachmentsConfirmation() throws com.mendix.core.CoreException
	{
		return getAttachmentsResponse_IncomingAttachmentsConfirmation(getContext());
	}

	/**
	 * @param context
	 * @return value of AttachmentsResponse_IncomingAttachmentsConfirmation
	 */
	public final interfaceattachments.proxies.AttachmentsResponse getAttachmentsResponse_IncomingAttachmentsConfirmation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceattachments.proxies.AttachmentsResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AttachmentsResponse_IncomingAttachmentsConfirmation.toString());
		if (identifier != null)
			result = interfaceattachments.proxies.AttachmentsResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AttachmentsResponse_IncomingAttachmentsConfirmation
	 * @param attachmentsresponse_incomingattachmentsconfirmation
	 */
	public final void setAttachmentsResponse_IncomingAttachmentsConfirmation(interfaceattachments.proxies.AttachmentsResponse attachmentsresponse_incomingattachmentsconfirmation)
	{
		setAttachmentsResponse_IncomingAttachmentsConfirmation(getContext(), attachmentsresponse_incomingattachmentsconfirmation);
	}

	/**
	 * Set value of AttachmentsResponse_IncomingAttachmentsConfirmation
	 * @param context
	 * @param attachmentsresponse_incomingattachmentsconfirmation
	 */
	public final void setAttachmentsResponse_IncomingAttachmentsConfirmation(com.mendix.systemwideinterfaces.core.IContext context, interfaceattachments.proxies.AttachmentsResponse attachmentsresponse_incomingattachmentsconfirmation)
	{
		if (attachmentsresponse_incomingattachmentsconfirmation == null)
			getMendixObject().setValue(context, MemberNames.AttachmentsResponse_IncomingAttachmentsConfirmation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AttachmentsResponse_IncomingAttachmentsConfirmation.toString(), attachmentsresponse_incomingattachmentsconfirmation.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceattachments.proxies.IncomingAttachmentsConfirmation that = (interfaceattachments.proxies.IncomingAttachmentsConfirmation) obj;
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
		return "InterfaceAttachments.IncomingAttachmentsConfirmation";
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
