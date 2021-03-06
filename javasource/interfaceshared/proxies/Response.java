// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared.proxies;

public class Response
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject responseMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceShared.Response";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public Response(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceShared.Response"));
	}

	protected Response(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject responseMendixObject)
	{
		if (responseMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceShared.Response", responseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceShared.Response");

		this.responseMendixObject = responseMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Response.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceshared.proxies.Response initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceshared.proxies.Response.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceshared.proxies.Response initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk", mendixObject.getType()))
			return interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceAffectedCIs.OutgoingAffectedCIsResponseMessageExpertDesk", mendixObject.getType()))
			return interfaceaffectedcis.proxies.OutgoingAffectedCIsResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceAttachments.OutgoingAttachmentsConfirmationResponseMessageExpertDesk", mendixObject.getType()))
			return interfaceattachments.proxies.OutgoingAttachmentsConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceAttachments.OutgoingAttachmentsResponseMessageExpertDesk", mendixObject.getType()))
			return interfaceattachments.proxies.OutgoingAttachmentsResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk", mendixObject.getType()))
			return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateResponseMessageExpertDesk", mendixObject.getType()))
			return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceExternalReferences.OutgoingExternalReferencesConfirmationResponseMessageExpertDesk", mendixObject.getType()))
			return interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceExternalReferences.OutgoingExternalReferencesResponseMessageExpertDesk", mendixObject.getType()))
			return interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceShared.OutgoingHeartBeatConfirmationResponseMessageExpertDesk", mendixObject.getType()))
			return interfaceshared.proxies.OutgoingHeartBeatConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceShared.OutgoingHeartBeatResponseMessageExpertDesk", mendixObject.getType()))
			return interfaceshared.proxies.OutgoingHeartBeatResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceNotes.OutgoingNotesConfirmationResponseMessageExpertDesk", mendixObject.getType()))
			return interfacenotes.proxies.OutgoingNotesConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceNotes.OutgoingNotesResponseMessageExpertDesk", mendixObject.getType()))
			return interfacenotes.proxies.OutgoingNotesResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceRelations.OutgoingRelationsConfirmationResponseMessageExpertDesk", mendixObject.getType()))
			return interfacerelations.proxies.OutgoingRelationsConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceRelations.OutgoingRelationsReponseMessageExpertDesk", mendixObject.getType()))
			return interfacerelations.proxies.OutgoingRelationsReponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceRequests.OutgoingRequestConfirmationResponseMessageExpertDesk", mendixObject.getType()))
			return interfacerequests.proxies.OutgoingRequestConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceRequests.OutgoingRequestResponseMessageExpertDesk", mendixObject.getType()))
			return interfacerequests.proxies.OutgoingRequestResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceRequestUpdate.OutgoingRequestUpdateConfirmationResponseMessageExpertDesk", mendixObject.getType()))
			return interfacerequestupdate.proxies.OutgoingRequestUpdateConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceRequestUpdate.OutgoingRequestUpdateResponseMessageExpertDesk", mendixObject.getType()))
			return interfacerequestupdate.proxies.OutgoingRequestUpdateResponseMessageExpertDesk.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceShared.ResponseExpertDesk", mendixObject.getType()))
			return interfaceshared.proxies.ResponseExpertDesk.initialize(context, mendixObject);

		return new interfaceshared.proxies.Response(context, mendixObject);
	}

	public static interfaceshared.proxies.Response load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceshared.proxies.Response.initialize(context, mendixObject);
	}

	public static java.util.List<? extends interfaceshared.proxies.Response> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceshared.proxies.Response> result = new java.util.ArrayList<interfaceshared.proxies.Response>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceShared.Response" + xpathConstraint))
			result.add(interfaceshared.proxies.Response.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ProcessingAttempt_Response
	 */
	public final interfaceshared.proxies.ProcessingAttempt getProcessingAttempt_Response() throws com.mendix.core.CoreException
	{
		return getProcessingAttempt_Response(getContext());
	}

	/**
	 * @param context
	 * @return value of ProcessingAttempt_Response
	 */
	public final interfaceshared.proxies.ProcessingAttempt getProcessingAttempt_Response(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.ProcessingAttempt result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProcessingAttempt_Response.toString());
		if (identifier != null)
			result = interfaceshared.proxies.ProcessingAttempt.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProcessingAttempt_Response
	 * @param processingattempt_response
	 */
	public final void setProcessingAttempt_Response(interfaceshared.proxies.ProcessingAttempt processingattempt_response)
	{
		setProcessingAttempt_Response(getContext(), processingattempt_response);
	}

	/**
	 * Set value of ProcessingAttempt_Response
	 * @param context
	 * @param processingattempt_response
	 */
	public final void setProcessingAttempt_Response(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.ProcessingAttempt processingattempt_response)
	{
		if (processingattempt_response == null)
			getMendixObject().setValue(context, MemberNames.ProcessingAttempt_Response.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProcessingAttempt_Response.toString(), processingattempt_response.getMendixObject().getId());
	}

	/**
	 * @return value of IncomingMessage_SynchronousResponse
	 */
	public final interfaceshared.proxies.IncomingMessage getIncomingMessage_SynchronousResponse() throws com.mendix.core.CoreException
	{
		return getIncomingMessage_SynchronousResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingMessage_SynchronousResponse
	 */
	public final interfaceshared.proxies.IncomingMessage getIncomingMessage_SynchronousResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.IncomingMessage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingMessage_SynchronousResponse.toString());
		if (identifier != null)
			result = interfaceshared.proxies.IncomingMessage.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingMessage_SynchronousResponse
	 * @param incomingmessage_synchronousresponse
	 */
	public final void setIncomingMessage_SynchronousResponse(interfaceshared.proxies.IncomingMessage incomingmessage_synchronousresponse)
	{
		setIncomingMessage_SynchronousResponse(getContext(), incomingmessage_synchronousresponse);
	}

	/**
	 * Set value of IncomingMessage_SynchronousResponse
	 * @param context
	 * @param incomingmessage_synchronousresponse
	 */
	public final void setIncomingMessage_SynchronousResponse(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.IncomingMessage incomingmessage_synchronousresponse)
	{
		if (incomingmessage_synchronousresponse == null)
			getMendixObject().setValue(context, MemberNames.IncomingMessage_SynchronousResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingMessage_SynchronousResponse.toString(), incomingmessage_synchronousresponse.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return responseMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceshared.proxies.Response that = (interfaceshared.proxies.Response) obj;
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
		return "InterfaceShared.Response";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
