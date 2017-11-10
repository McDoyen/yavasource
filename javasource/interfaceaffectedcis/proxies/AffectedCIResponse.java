// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceaffectedcis.proxies;

public class AffectedCIResponse extends interfaceshared.proxies.ResponseExpertDesk
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceAffectedCIs.AffectedCIResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ResponseCode("ResponseCode"),
		ResponseMessage("ResponseMessage"),
		AffectedCIResponse_AffectedCI("InterfaceAffectedCIs.AffectedCIResponse_AffectedCI"),
		AffectedCIResponse_AffectedCIsResponse("InterfaceAffectedCIs.AffectedCIResponse_AffectedCIsResponse"),
		AffectedCIResponse_AffectedCIsResponsesContainerExpertDesk("InterfaceAffectedCIs.AffectedCIResponse_AffectedCIsResponsesContainerExpertDesk"),
		AffectedCIsContainerExpertDesk_AffectedCIResponse("InterfaceAffectedCIs.AffectedCIsContainerExpertDesk_AffectedCIResponse"),
		AffectedCIResponse_RequestResponse("InterfaceAffectedCIs.AffectedCIResponse_RequestResponse"),
		AffectedCIResponse_RequestResponseTask("InterfaceAffectedCIs.AffectedCIResponse_RequestResponseTask"),
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

	public AffectedCIResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceAffectedCIs.AffectedCIResponse"));
	}

	protected AffectedCIResponse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject affectedCIResponseMendixObject)
	{
		super(context, affectedCIResponseMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceAffectedCIs.AffectedCIResponse", affectedCIResponseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceAffectedCIs.AffectedCIResponse");
	}

	/**
	 * @deprecated Use 'AffectedCIResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceaffectedcis.proxies.AffectedCIResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceaffectedcis.proxies.AffectedCIResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceaffectedcis.proxies.AffectedCIResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceaffectedcis.proxies.AffectedCIResponse(context, mendixObject);
	}

	public static interfaceaffectedcis.proxies.AffectedCIResponse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceaffectedcis.proxies.AffectedCIResponse.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceaffectedcis.proxies.AffectedCIResponse> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceaffectedcis.proxies.AffectedCIResponse> result = new java.util.ArrayList<interfaceaffectedcis.proxies.AffectedCIResponse>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceAffectedCIs.AffectedCIResponse" + xpathConstraint))
			result.add(interfaceaffectedcis.proxies.AffectedCIResponse.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of AffectedCIResponse_AffectedCI
	 */
	public final interfaceaffectedcis.proxies.AffectedCI getAffectedCIResponse_AffectedCI() throws com.mendix.core.CoreException
	{
		return getAffectedCIResponse_AffectedCI(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIResponse_AffectedCI
	 */
	public final interfaceaffectedcis.proxies.AffectedCI getAffectedCIResponse_AffectedCI(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.AffectedCI result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIResponse_AffectedCI.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.AffectedCI.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIResponse_AffectedCI
	 * @param affectedciresponse_affectedci
	 */
	public final void setAffectedCIResponse_AffectedCI(interfaceaffectedcis.proxies.AffectedCI affectedciresponse_affectedci)
	{
		setAffectedCIResponse_AffectedCI(getContext(), affectedciresponse_affectedci);
	}

	/**
	 * Set value of AffectedCIResponse_AffectedCI
	 * @param context
	 * @param affectedciresponse_affectedci
	 */
	public final void setAffectedCIResponse_AffectedCI(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.AffectedCI affectedciresponse_affectedci)
	{
		if (affectedciresponse_affectedci == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_AffectedCI.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_AffectedCI.toString(), affectedciresponse_affectedci.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCIResponse_AffectedCIsResponse
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsResponse getAffectedCIResponse_AffectedCIsResponse() throws com.mendix.core.CoreException
	{
		return getAffectedCIResponse_AffectedCIsResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIResponse_AffectedCIsResponse
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsResponse getAffectedCIResponse_AffectedCIsResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.AffectedCIsResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIResponse_AffectedCIsResponse.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.AffectedCIsResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIResponse_AffectedCIsResponse
	 * @param affectedciresponse_affectedcisresponse
	 */
	public final void setAffectedCIResponse_AffectedCIsResponse(interfaceaffectedcis.proxies.AffectedCIsResponse affectedciresponse_affectedcisresponse)
	{
		setAffectedCIResponse_AffectedCIsResponse(getContext(), affectedciresponse_affectedcisresponse);
	}

	/**
	 * Set value of AffectedCIResponse_AffectedCIsResponse
	 * @param context
	 * @param affectedciresponse_affectedcisresponse
	 */
	public final void setAffectedCIResponse_AffectedCIsResponse(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.AffectedCIsResponse affectedciresponse_affectedcisresponse)
	{
		if (affectedciresponse_affectedcisresponse == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_AffectedCIsResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_AffectedCIsResponse.toString(), affectedciresponse_affectedcisresponse.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCIResponse_AffectedCIsResponsesContainerExpertDesk
	 */
	public final interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk getAffectedCIResponse_AffectedCIsResponsesContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getAffectedCIResponse_AffectedCIsResponsesContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIResponse_AffectedCIsResponsesContainerExpertDesk
	 */
	public final interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk getAffectedCIResponse_AffectedCIsResponsesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIResponse_AffectedCIsResponsesContainerExpertDesk.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIResponse_AffectedCIsResponsesContainerExpertDesk
	 * @param affectedciresponse_affectedcisresponsescontainerexpertdesk
	 */
	public final void setAffectedCIResponse_AffectedCIsResponsesContainerExpertDesk(interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk affectedciresponse_affectedcisresponsescontainerexpertdesk)
	{
		setAffectedCIResponse_AffectedCIsResponsesContainerExpertDesk(getContext(), affectedciresponse_affectedcisresponsescontainerexpertdesk);
	}

	/**
	 * Set value of AffectedCIResponse_AffectedCIsResponsesContainerExpertDesk
	 * @param context
	 * @param affectedciresponse_affectedcisresponsescontainerexpertdesk
	 */
	public final void setAffectedCIResponse_AffectedCIsResponsesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk affectedciresponse_affectedcisresponsescontainerexpertdesk)
	{
		if (affectedciresponse_affectedcisresponsescontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_AffectedCIsResponsesContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_AffectedCIsResponsesContainerExpertDesk.toString(), affectedciresponse_affectedcisresponsescontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCIsContainerExpertDesk_AffectedCIResponse
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk getAffectedCIsContainerExpertDesk_AffectedCIResponse() throws com.mendix.core.CoreException
	{
		return getAffectedCIsContainerExpertDesk_AffectedCIResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIsContainerExpertDesk_AffectedCIResponse
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk getAffectedCIsContainerExpertDesk_AffectedCIResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIsContainerExpertDesk_AffectedCIResponse.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIsContainerExpertDesk_AffectedCIResponse
	 * @param affectedciscontainerexpertdesk_affectedciresponse
	 */
	public final void setAffectedCIsContainerExpertDesk_AffectedCIResponse(interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk affectedciscontainerexpertdesk_affectedciresponse)
	{
		setAffectedCIsContainerExpertDesk_AffectedCIResponse(getContext(), affectedciscontainerexpertdesk_affectedciresponse);
	}

	/**
	 * Set value of AffectedCIsContainerExpertDesk_AffectedCIResponse
	 * @param context
	 * @param affectedciscontainerexpertdesk_affectedciresponse
	 */
	public final void setAffectedCIsContainerExpertDesk_AffectedCIResponse(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk affectedciscontainerexpertdesk_affectedciresponse)
	{
		if (affectedciscontainerexpertdesk_affectedciresponse == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIsContainerExpertDesk_AffectedCIResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIsContainerExpertDesk_AffectedCIResponse.toString(), affectedciscontainerexpertdesk_affectedciresponse.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCIResponse_RequestResponse
	 */
	public final interfacerequests.proxies.RequestResponse getAffectedCIResponse_RequestResponse() throws com.mendix.core.CoreException
	{
		return getAffectedCIResponse_RequestResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIResponse_RequestResponse
	 */
	public final interfacerequests.proxies.RequestResponse getAffectedCIResponse_RequestResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.RequestResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIResponse_RequestResponse.toString());
		if (identifier != null)
			result = interfacerequests.proxies.RequestResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIResponse_RequestResponse
	 * @param affectedciresponse_requestresponse
	 */
	public final void setAffectedCIResponse_RequestResponse(interfacerequests.proxies.RequestResponse affectedciresponse_requestresponse)
	{
		setAffectedCIResponse_RequestResponse(getContext(), affectedciresponse_requestresponse);
	}

	/**
	 * Set value of AffectedCIResponse_RequestResponse
	 * @param context
	 * @param affectedciresponse_requestresponse
	 */
	public final void setAffectedCIResponse_RequestResponse(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.RequestResponse affectedciresponse_requestresponse)
	{
		if (affectedciresponse_requestresponse == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_RequestResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_RequestResponse.toString(), affectedciresponse_requestresponse.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCIResponse_RequestResponseTask
	 */
	public final interfacerequests.proxies.TaskResponse getAffectedCIResponse_RequestResponseTask() throws com.mendix.core.CoreException
	{
		return getAffectedCIResponse_RequestResponseTask(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIResponse_RequestResponseTask
	 */
	public final interfacerequests.proxies.TaskResponse getAffectedCIResponse_RequestResponseTask(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.TaskResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIResponse_RequestResponseTask.toString());
		if (identifier != null)
			result = interfacerequests.proxies.TaskResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIResponse_RequestResponseTask
	 * @param affectedciresponse_requestresponsetask
	 */
	public final void setAffectedCIResponse_RequestResponseTask(interfacerequests.proxies.TaskResponse affectedciresponse_requestresponsetask)
	{
		setAffectedCIResponse_RequestResponseTask(getContext(), affectedciresponse_requestresponsetask);
	}

	/**
	 * Set value of AffectedCIResponse_RequestResponseTask
	 * @param context
	 * @param affectedciresponse_requestresponsetask
	 */
	public final void setAffectedCIResponse_RequestResponseTask(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.TaskResponse affectedciresponse_requestresponsetask)
	{
		if (affectedciresponse_requestresponsetask == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_RequestResponseTask.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIResponse_RequestResponseTask.toString(), affectedciresponse_requestresponsetask.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceaffectedcis.proxies.AffectedCIResponse that = (interfaceaffectedcis.proxies.AffectedCIResponse) obj;
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
		return "InterfaceAffectedCIs.AffectedCIResponse";
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