// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerelations.proxies;

public class RelationsResponse extends interfaceshared.proxies.ResponseExpertDesk
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRelations.RelationsResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ResponseCode("ResponseCode"),
		ResponseMessage("ResponseMessage"),
		RelationResponsesContainerExpertDesk_RelationsResponse("InterfaceRelations.RelationResponsesContainerExpertDesk_RelationsResponse"),
		RelationsResponse_IncomingRelationsConfirmation("InterfaceRelations.RelationsResponse_IncomingRelationsConfirmation"),
		RelationsResponse_RelationsResponseContainerExpertDesk("InterfaceRelations.RelationsResponse_RelationsResponseContainerExpertDesk"),
		RelationsResponse_OutgoingRelationsReponseMessageExpertDesk("InterfaceRelations.RelationsResponse_OutgoingRelationsReponseMessageExpertDesk"),
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

	public RelationsResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRelations.RelationsResponse"));
	}

	protected RelationsResponse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject relationsResponseMendixObject)
	{
		super(context, relationsResponseMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRelations.RelationsResponse", relationsResponseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRelations.RelationsResponse");
	}

	/**
	 * @deprecated Use 'RelationsResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerelations.proxies.RelationsResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerelations.proxies.RelationsResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerelations.proxies.RelationsResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerelations.proxies.RelationsResponse(context, mendixObject);
	}

	public static interfacerelations.proxies.RelationsResponse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerelations.proxies.RelationsResponse.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerelations.proxies.RelationsResponse> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerelations.proxies.RelationsResponse> result = new java.util.ArrayList<interfacerelations.proxies.RelationsResponse>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRelations.RelationsResponse" + xpathConstraint))
			result.add(interfacerelations.proxies.RelationsResponse.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of RelationResponsesContainerExpertDesk_RelationsResponse
	 */
	public final interfacerelations.proxies.RelationResponsesContainerExpertDesk getRelationResponsesContainerExpertDesk_RelationsResponse() throws com.mendix.core.CoreException
	{
		return getRelationResponsesContainerExpertDesk_RelationsResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of RelationResponsesContainerExpertDesk_RelationsResponse
	 */
	public final interfacerelations.proxies.RelationResponsesContainerExpertDesk getRelationResponsesContainerExpertDesk_RelationsResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerelations.proxies.RelationResponsesContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RelationResponsesContainerExpertDesk_RelationsResponse.toString());
		if (identifier != null)
			result = interfacerelations.proxies.RelationResponsesContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RelationResponsesContainerExpertDesk_RelationsResponse
	 * @param relationresponsescontainerexpertdesk_relationsresponse
	 */
	public final void setRelationResponsesContainerExpertDesk_RelationsResponse(interfacerelations.proxies.RelationResponsesContainerExpertDesk relationresponsescontainerexpertdesk_relationsresponse)
	{
		setRelationResponsesContainerExpertDesk_RelationsResponse(getContext(), relationresponsescontainerexpertdesk_relationsresponse);
	}

	/**
	 * Set value of RelationResponsesContainerExpertDesk_RelationsResponse
	 * @param context
	 * @param relationresponsescontainerexpertdesk_relationsresponse
	 */
	public final void setRelationResponsesContainerExpertDesk_RelationsResponse(com.mendix.systemwideinterfaces.core.IContext context, interfacerelations.proxies.RelationResponsesContainerExpertDesk relationresponsescontainerexpertdesk_relationsresponse)
	{
		if (relationresponsescontainerexpertdesk_relationsresponse == null)
			getMendixObject().setValue(context, MemberNames.RelationResponsesContainerExpertDesk_RelationsResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RelationResponsesContainerExpertDesk_RelationsResponse.toString(), relationresponsescontainerexpertdesk_relationsresponse.getMendixObject().getId());
	}

	/**
	 * @return value of RelationsResponse_IncomingRelationsConfirmation
	 */
	public final interfacerelations.proxies.IncomingRelationsConfirmation getRelationsResponse_IncomingRelationsConfirmation() throws com.mendix.core.CoreException
	{
		return getRelationsResponse_IncomingRelationsConfirmation(getContext());
	}

	/**
	 * @param context
	 * @return value of RelationsResponse_IncomingRelationsConfirmation
	 */
	public final interfacerelations.proxies.IncomingRelationsConfirmation getRelationsResponse_IncomingRelationsConfirmation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerelations.proxies.IncomingRelationsConfirmation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RelationsResponse_IncomingRelationsConfirmation.toString());
		if (identifier != null)
			result = interfacerelations.proxies.IncomingRelationsConfirmation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RelationsResponse_IncomingRelationsConfirmation
	 * @param relationsresponse_incomingrelationsconfirmation
	 */
	public final void setRelationsResponse_IncomingRelationsConfirmation(interfacerelations.proxies.IncomingRelationsConfirmation relationsresponse_incomingrelationsconfirmation)
	{
		setRelationsResponse_IncomingRelationsConfirmation(getContext(), relationsresponse_incomingrelationsconfirmation);
	}

	/**
	 * Set value of RelationsResponse_IncomingRelationsConfirmation
	 * @param context
	 * @param relationsresponse_incomingrelationsconfirmation
	 */
	public final void setRelationsResponse_IncomingRelationsConfirmation(com.mendix.systemwideinterfaces.core.IContext context, interfacerelations.proxies.IncomingRelationsConfirmation relationsresponse_incomingrelationsconfirmation)
	{
		if (relationsresponse_incomingrelationsconfirmation == null)
			getMendixObject().setValue(context, MemberNames.RelationsResponse_IncomingRelationsConfirmation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RelationsResponse_IncomingRelationsConfirmation.toString(), relationsresponse_incomingrelationsconfirmation.getMendixObject().getId());
	}

	/**
	 * @return value of RelationsResponse_RelationsResponseContainerExpertDesk
	 */
	public final interfacerelations.proxies.RelationsResponseContainerExpertDesk getRelationsResponse_RelationsResponseContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getRelationsResponse_RelationsResponseContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of RelationsResponse_RelationsResponseContainerExpertDesk
	 */
	public final interfacerelations.proxies.RelationsResponseContainerExpertDesk getRelationsResponse_RelationsResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerelations.proxies.RelationsResponseContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RelationsResponse_RelationsResponseContainerExpertDesk.toString());
		if (identifier != null)
			result = interfacerelations.proxies.RelationsResponseContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RelationsResponse_RelationsResponseContainerExpertDesk
	 * @param relationsresponse_relationsresponsecontainerexpertdesk
	 */
	public final void setRelationsResponse_RelationsResponseContainerExpertDesk(interfacerelations.proxies.RelationsResponseContainerExpertDesk relationsresponse_relationsresponsecontainerexpertdesk)
	{
		setRelationsResponse_RelationsResponseContainerExpertDesk(getContext(), relationsresponse_relationsresponsecontainerexpertdesk);
	}

	/**
	 * Set value of RelationsResponse_RelationsResponseContainerExpertDesk
	 * @param context
	 * @param relationsresponse_relationsresponsecontainerexpertdesk
	 */
	public final void setRelationsResponse_RelationsResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerelations.proxies.RelationsResponseContainerExpertDesk relationsresponse_relationsresponsecontainerexpertdesk)
	{
		if (relationsresponse_relationsresponsecontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.RelationsResponse_RelationsResponseContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RelationsResponse_RelationsResponseContainerExpertDesk.toString(), relationsresponse_relationsresponsecontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of RelationsResponse_OutgoingRelationsReponseMessageExpertDesk
	 */
	public final interfacerelations.proxies.OutgoingRelationsReponseMessageExpertDesk getRelationsResponse_OutgoingRelationsReponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getRelationsResponse_OutgoingRelationsReponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of RelationsResponse_OutgoingRelationsReponseMessageExpertDesk
	 */
	public final interfacerelations.proxies.OutgoingRelationsReponseMessageExpertDesk getRelationsResponse_OutgoingRelationsReponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerelations.proxies.OutgoingRelationsReponseMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RelationsResponse_OutgoingRelationsReponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacerelations.proxies.OutgoingRelationsReponseMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RelationsResponse_OutgoingRelationsReponseMessageExpertDesk
	 * @param relationsresponse_outgoingrelationsreponsemessageexpertdesk
	 */
	public final void setRelationsResponse_OutgoingRelationsReponseMessageExpertDesk(interfacerelations.proxies.OutgoingRelationsReponseMessageExpertDesk relationsresponse_outgoingrelationsreponsemessageexpertdesk)
	{
		setRelationsResponse_OutgoingRelationsReponseMessageExpertDesk(getContext(), relationsresponse_outgoingrelationsreponsemessageexpertdesk);
	}

	/**
	 * Set value of RelationsResponse_OutgoingRelationsReponseMessageExpertDesk
	 * @param context
	 * @param relationsresponse_outgoingrelationsreponsemessageexpertdesk
	 */
	public final void setRelationsResponse_OutgoingRelationsReponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerelations.proxies.OutgoingRelationsReponseMessageExpertDesk relationsresponse_outgoingrelationsreponsemessageexpertdesk)
	{
		if (relationsresponse_outgoingrelationsreponsemessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.RelationsResponse_OutgoingRelationsReponseMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RelationsResponse_OutgoingRelationsReponseMessageExpertDesk.toString(), relationsresponse_outgoingrelationsreponsemessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacerelations.proxies.RelationsResponse that = (interfacerelations.proxies.RelationsResponse) obj;
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
		return "InterfaceRelations.RelationsResponse";
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
