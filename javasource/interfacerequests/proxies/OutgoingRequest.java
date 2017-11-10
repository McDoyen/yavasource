// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerequests.proxies;

public class OutgoingRequest extends interfaceshared.proxies.OutgoingMessage
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRequests.OutgoingRequest";

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
		OutgoingRequest_Request("InterfaceRequests.OutgoingRequest_Request"),
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

	public OutgoingRequest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRequests.OutgoingRequest"));
	}

	protected OutgoingRequest(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingRequestMendixObject)
	{
		super(context, outgoingRequestMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRequests.OutgoingRequest", outgoingRequestMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRequests.OutgoingRequest");
	}

	/**
	 * @deprecated Use 'OutgoingRequest.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerequests.proxies.OutgoingRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerequests.proxies.OutgoingRequest.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerequests.proxies.OutgoingRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("InterfaceRequests.OutgoingRequestMessageExpertDesk", mendixObject.getType()))
			return interfacerequests.proxies.OutgoingRequestMessageExpertDesk.initialize(context, mendixObject);

		return new interfacerequests.proxies.OutgoingRequest(context, mendixObject);
	}

	public static interfacerequests.proxies.OutgoingRequest load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerequests.proxies.OutgoingRequest.initialize(context, mendixObject);
	}

	public static java.util.List<? extends interfacerequests.proxies.OutgoingRequest> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerequests.proxies.OutgoingRequest> result = new java.util.ArrayList<interfacerequests.proxies.OutgoingRequest>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRequests.OutgoingRequest" + xpathConstraint))
			result.add(interfacerequests.proxies.OutgoingRequest.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OutgoingRequest_Request
	 */
	public final process.proxies.Request getOutgoingRequest_Request() throws com.mendix.core.CoreException
	{
		return getOutgoingRequest_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingRequest_Request
	 */
	public final process.proxies.Request getOutgoingRequest_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingRequest_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingRequest_Request
	 * @param outgoingrequest_request
	 */
	public final void setOutgoingRequest_Request(process.proxies.Request outgoingrequest_request)
	{
		setOutgoingRequest_Request(getContext(), outgoingrequest_request);
	}

	/**
	 * Set value of OutgoingRequest_Request
	 * @param context
	 * @param outgoingrequest_request
	 */
	public final void setOutgoingRequest_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request outgoingrequest_request)
	{
		if (outgoingrequest_request == null)
			getMendixObject().setValue(context, MemberNames.OutgoingRequest_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingRequest_Request.toString(), outgoingrequest_request.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacerequests.proxies.OutgoingRequest that = (interfacerequests.proxies.OutgoingRequest) obj;
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
		return "InterfaceRequests.OutgoingRequest";
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