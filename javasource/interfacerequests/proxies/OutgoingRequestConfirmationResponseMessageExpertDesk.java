// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerequests.proxies;

public class OutgoingRequestConfirmationResponseMessageExpertDesk extends interfaceshared.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRequests.OutgoingRequestConfirmationResponseMessageExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public OutgoingRequestConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRequests.OutgoingRequestConfirmationResponseMessageExpertDesk"));
	}

	protected OutgoingRequestConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingRequestConfirmationResponseMessageExpertDeskMendixObject)
	{
		super(context, outgoingRequestConfirmationResponseMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRequests.OutgoingRequestConfirmationResponseMessageExpertDesk", outgoingRequestConfirmationResponseMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRequests.OutgoingRequestConfirmationResponseMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingRequestConfirmationResponseMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk(context, mendixObject);
	}

	public static interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk> result = new java.util.ArrayList<interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRequests.OutgoingRequestConfirmationResponseMessageExpertDesk" + xpathConstraint))
			result.add(interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk
	 */
	public final interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk getOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk
	 */
	public final interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk getOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk
	 * @param outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk)
	{
		setOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(getContext(), outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk);
	}

	/**
	 * Set value of OutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk
	 * @param context
	 * @param outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingRequestConfirmationResponseExpertDesk_OutgoingRequestConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.OutgoingRequestConfirmationResponseExpertDesk outgoingrequestconfirmationresponseexpertdesk_outgoingrequestconfirmationresponsemessageexpertdesk)
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
			final interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk that = (interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk) obj;
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
		return "InterfaceRequests.OutgoingRequestConfirmationResponseMessageExpertDesk";
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
