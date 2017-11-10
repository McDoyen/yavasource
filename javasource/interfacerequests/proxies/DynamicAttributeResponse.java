// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerequests.proxies;

public class DynamicAttributeResponse extends interfaceshared.proxies.ResponseExpertDesk
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRequests.DynamicAttributeResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ResponseCode("ResponseCode"),
		ResponseMessage("ResponseMessage"),
		DynamicAttributeResponse_RequestResponse("InterfaceRequests.DynamicAttributeResponse_RequestResponse"),
		DynamicAttributeResponse_TaskResponse("InterfaceRequests.DynamicAttributeResponse_TaskResponse"),
		DynamicAttributeResponse_DynamicAttribute("InterfaceRequests.DynamicAttributeResponse_DynamicAttribute"),
		DynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk("InterfaceRequests.DynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk"),
		DynamicAttributesContainerExpertDesk_DynamicAttributeResponse("InterfaceRequests.DynamicAttributesContainerExpertDesk_DynamicAttributeResponse"),
		DynamicAttributeResponse_RequestUpdateResponse("InterfaceRequests.DynamicAttributeResponse_RequestUpdateResponse"),
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

	public DynamicAttributeResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRequests.DynamicAttributeResponse"));
	}

	protected DynamicAttributeResponse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dynamicAttributeResponseMendixObject)
	{
		super(context, dynamicAttributeResponseMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRequests.DynamicAttributeResponse", dynamicAttributeResponseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRequests.DynamicAttributeResponse");
	}

	/**
	 * @deprecated Use 'DynamicAttributeResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerequests.proxies.DynamicAttributeResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerequests.proxies.DynamicAttributeResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerequests.proxies.DynamicAttributeResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerequests.proxies.DynamicAttributeResponse(context, mendixObject);
	}

	public static interfacerequests.proxies.DynamicAttributeResponse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerequests.proxies.DynamicAttributeResponse.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerequests.proxies.DynamicAttributeResponse> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerequests.proxies.DynamicAttributeResponse> result = new java.util.ArrayList<interfacerequests.proxies.DynamicAttributeResponse>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRequests.DynamicAttributeResponse" + xpathConstraint))
			result.add(interfacerequests.proxies.DynamicAttributeResponse.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of DynamicAttributeResponse_RequestResponse
	 */
	public final interfacerequests.proxies.RequestResponse getDynamicAttributeResponse_RequestResponse() throws com.mendix.core.CoreException
	{
		return getDynamicAttributeResponse_RequestResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributeResponse_RequestResponse
	 */
	public final interfacerequests.proxies.RequestResponse getDynamicAttributeResponse_RequestResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.RequestResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributeResponse_RequestResponse.toString());
		if (identifier != null)
			result = interfacerequests.proxies.RequestResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributeResponse_RequestResponse
	 * @param dynamicattributeresponse_requestresponse
	 */
	public final void setDynamicAttributeResponse_RequestResponse(interfacerequests.proxies.RequestResponse dynamicattributeresponse_requestresponse)
	{
		setDynamicAttributeResponse_RequestResponse(getContext(), dynamicattributeresponse_requestresponse);
	}

	/**
	 * Set value of DynamicAttributeResponse_RequestResponse
	 * @param context
	 * @param dynamicattributeresponse_requestresponse
	 */
	public final void setDynamicAttributeResponse_RequestResponse(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.RequestResponse dynamicattributeresponse_requestresponse)
	{
		if (dynamicattributeresponse_requestresponse == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_RequestResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_RequestResponse.toString(), dynamicattributeresponse_requestresponse.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttributeResponse_TaskResponse
	 */
	public final interfacerequests.proxies.TaskResponse getDynamicAttributeResponse_TaskResponse() throws com.mendix.core.CoreException
	{
		return getDynamicAttributeResponse_TaskResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributeResponse_TaskResponse
	 */
	public final interfacerequests.proxies.TaskResponse getDynamicAttributeResponse_TaskResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.TaskResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributeResponse_TaskResponse.toString());
		if (identifier != null)
			result = interfacerequests.proxies.TaskResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributeResponse_TaskResponse
	 * @param dynamicattributeresponse_taskresponse
	 */
	public final void setDynamicAttributeResponse_TaskResponse(interfacerequests.proxies.TaskResponse dynamicattributeresponse_taskresponse)
	{
		setDynamicAttributeResponse_TaskResponse(getContext(), dynamicattributeresponse_taskresponse);
	}

	/**
	 * Set value of DynamicAttributeResponse_TaskResponse
	 * @param context
	 * @param dynamicattributeresponse_taskresponse
	 */
	public final void setDynamicAttributeResponse_TaskResponse(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.TaskResponse dynamicattributeresponse_taskresponse)
	{
		if (dynamicattributeresponse_taskresponse == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_TaskResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_TaskResponse.toString(), dynamicattributeresponse_taskresponse.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttributeResponse_DynamicAttribute
	 */
	public final interfacerequests.proxies.DynamicAttribute getDynamicAttributeResponse_DynamicAttribute() throws com.mendix.core.CoreException
	{
		return getDynamicAttributeResponse_DynamicAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributeResponse_DynamicAttribute
	 */
	public final interfacerequests.proxies.DynamicAttribute getDynamicAttributeResponse_DynamicAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.DynamicAttribute result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributeResponse_DynamicAttribute.toString());
		if (identifier != null)
			result = interfacerequests.proxies.DynamicAttribute.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributeResponse_DynamicAttribute
	 * @param dynamicattributeresponse_dynamicattribute
	 */
	public final void setDynamicAttributeResponse_DynamicAttribute(interfacerequests.proxies.DynamicAttribute dynamicattributeresponse_dynamicattribute)
	{
		setDynamicAttributeResponse_DynamicAttribute(getContext(), dynamicattributeresponse_dynamicattribute);
	}

	/**
	 * Set value of DynamicAttributeResponse_DynamicAttribute
	 * @param context
	 * @param dynamicattributeresponse_dynamicattribute
	 */
	public final void setDynamicAttributeResponse_DynamicAttribute(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.DynamicAttribute dynamicattributeresponse_dynamicattribute)
	{
		if (dynamicattributeresponse_dynamicattribute == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_DynamicAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_DynamicAttribute.toString(), dynamicattributeresponse_dynamicattribute.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk
	 */
	public final interfacerequests.proxies.DynamicAttributeResponsesContainerExpertDesk getDynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getDynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk
	 */
	public final interfacerequests.proxies.DynamicAttributeResponsesContainerExpertDesk getDynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.DynamicAttributeResponsesContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk.toString());
		if (identifier != null)
			result = interfacerequests.proxies.DynamicAttributeResponsesContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk
	 * @param dynamicattributeresponse_dynamicattributeresponsescontainerexpertdesk
	 */
	public final void setDynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk(interfacerequests.proxies.DynamicAttributeResponsesContainerExpertDesk dynamicattributeresponse_dynamicattributeresponsescontainerexpertdesk)
	{
		setDynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk(getContext(), dynamicattributeresponse_dynamicattributeresponsescontainerexpertdesk);
	}

	/**
	 * Set value of DynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk
	 * @param context
	 * @param dynamicattributeresponse_dynamicattributeresponsescontainerexpertdesk
	 */
	public final void setDynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.DynamicAttributeResponsesContainerExpertDesk dynamicattributeresponse_dynamicattributeresponsescontainerexpertdesk)
	{
		if (dynamicattributeresponse_dynamicattributeresponsescontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_DynamicAttributeResponsesContainerExpertDesk.toString(), dynamicattributeresponse_dynamicattributeresponsescontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttributesContainerExpertDesk_DynamicAttributeResponse
	 */
	public final interfacerequests.proxies.DynamicAttributesContainerExpertDesk getDynamicAttributesContainerExpertDesk_DynamicAttributeResponse() throws com.mendix.core.CoreException
	{
		return getDynamicAttributesContainerExpertDesk_DynamicAttributeResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributesContainerExpertDesk_DynamicAttributeResponse
	 */
	public final interfacerequests.proxies.DynamicAttributesContainerExpertDesk getDynamicAttributesContainerExpertDesk_DynamicAttributeResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.DynamicAttributesContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributesContainerExpertDesk_DynamicAttributeResponse.toString());
		if (identifier != null)
			result = interfacerequests.proxies.DynamicAttributesContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributesContainerExpertDesk_DynamicAttributeResponse
	 * @param dynamicattributescontainerexpertdesk_dynamicattributeresponse
	 */
	public final void setDynamicAttributesContainerExpertDesk_DynamicAttributeResponse(interfacerequests.proxies.DynamicAttributesContainerExpertDesk dynamicattributescontainerexpertdesk_dynamicattributeresponse)
	{
		setDynamicAttributesContainerExpertDesk_DynamicAttributeResponse(getContext(), dynamicattributescontainerexpertdesk_dynamicattributeresponse);
	}

	/**
	 * Set value of DynamicAttributesContainerExpertDesk_DynamicAttributeResponse
	 * @param context
	 * @param dynamicattributescontainerexpertdesk_dynamicattributeresponse
	 */
	public final void setDynamicAttributesContainerExpertDesk_DynamicAttributeResponse(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.DynamicAttributesContainerExpertDesk dynamicattributescontainerexpertdesk_dynamicattributeresponse)
	{
		if (dynamicattributescontainerexpertdesk_dynamicattributeresponse == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributesContainerExpertDesk_DynamicAttributeResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributesContainerExpertDesk_DynamicAttributeResponse.toString(), dynamicattributescontainerexpertdesk_dynamicattributeresponse.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttributeResponse_RequestUpdateResponse
	 */
	public final interfacerequestupdate.proxies.RequestUpdateResponse getDynamicAttributeResponse_RequestUpdateResponse() throws com.mendix.core.CoreException
	{
		return getDynamicAttributeResponse_RequestUpdateResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributeResponse_RequestUpdateResponse
	 */
	public final interfacerequestupdate.proxies.RequestUpdateResponse getDynamicAttributeResponse_RequestUpdateResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequestupdate.proxies.RequestUpdateResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributeResponse_RequestUpdateResponse.toString());
		if (identifier != null)
			result = interfacerequestupdate.proxies.RequestUpdateResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributeResponse_RequestUpdateResponse
	 * @param dynamicattributeresponse_requestupdateresponse
	 */
	public final void setDynamicAttributeResponse_RequestUpdateResponse(interfacerequestupdate.proxies.RequestUpdateResponse dynamicattributeresponse_requestupdateresponse)
	{
		setDynamicAttributeResponse_RequestUpdateResponse(getContext(), dynamicattributeresponse_requestupdateresponse);
	}

	/**
	 * Set value of DynamicAttributeResponse_RequestUpdateResponse
	 * @param context
	 * @param dynamicattributeresponse_requestupdateresponse
	 */
	public final void setDynamicAttributeResponse_RequestUpdateResponse(com.mendix.systemwideinterfaces.core.IContext context, interfacerequestupdate.proxies.RequestUpdateResponse dynamicattributeresponse_requestupdateresponse)
	{
		if (dynamicattributeresponse_requestupdateresponse == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_RequestUpdateResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_RequestUpdateResponse.toString(), dynamicattributeresponse_requestupdateresponse.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacerequests.proxies.DynamicAttributeResponse that = (interfacerequests.proxies.DynamicAttributeResponse) obj;
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
		return "InterfaceRequests.DynamicAttributeResponse";
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