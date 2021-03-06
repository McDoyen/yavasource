// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerequests.proxies;

public class OutgoingRequestConfirmationResponseExpertDesk extends interfaceshared.proxies.ResponseExpertDesk
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRequests.OutgoingRequestConfirmationResponseExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ResponseCode("ResponseCode"),
		ResponseMessage("ResponseMessage"),
		OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk("InterfaceRequests.OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk"),
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

	public OutgoingRequestConfirmationResponseExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRequests.OutgoingRequestConfirmationResponseExpertDesk"));
	}

	protected OutgoingRequestConfirmationResponseExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingRequestConfirmationResponseExpertDeskMendixObject)
	{
		super(context, outgoingRequestConfirmationResponseExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRequests.OutgoingRequestConfirmationResponseExpertDesk", outgoingRequestConfirmationResponseExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRequests.OutgoingRequestConfirmationResponseExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingRequestConfirmationResponseExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk(context, mendixObject);
	}

	public static interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk> result = new java.util.ArrayList<interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRequests.OutgoingRequestConfirmationResponseExpertDesk" + xpathConstraint))
			result.add(interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk
	 */
	public final interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk getOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk
	 */
	public final interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk getOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk
	 * @param outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk)
	{
		setOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(getContext(), outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk);
	}

	/**
	 * Set value of OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk
	 * @param context
	 * @param outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk)
	{
		if (outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk.toString(), outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk that = (interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk) obj;
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
		return "InterfaceRequests.OutgoingRequestConfirmationResponseExpertDesk";
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
