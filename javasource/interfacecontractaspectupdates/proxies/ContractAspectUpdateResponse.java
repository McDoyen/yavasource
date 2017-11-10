// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacecontractaspectupdates.proxies;

public class ContractAspectUpdateResponse extends interfaceshared.proxies.ResponseExpertDesk
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceContractAspectUpdates.ContractAspectUpdateResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ResponseCode("ResponseCode"),
		ResponseMessage("ResponseMessage"),
		UU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate("InterfaceContractAspectUpdates.UU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate"),
		ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer("InterfaceContractAspectUpdates.ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer"),
		ContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation("InterfaceContractAspectUpdates.ContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation"),
		ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk("InterfaceContractAspectUpdates.ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk"),
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

	public ContractAspectUpdateResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceContractAspectUpdates.ContractAspectUpdateResponse"));
	}

	protected ContractAspectUpdateResponse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject contractAspectUpdateResponseMendixObject)
	{
		super(context, contractAspectUpdateResponseMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.ContractAspectUpdateResponse", contractAspectUpdateResponseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceContractAspectUpdates.ContractAspectUpdateResponse");
	}

	/**
	 * @deprecated Use 'ContractAspectUpdateResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse(context, mendixObject);
	}

	public static interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse.initialize(context, mendixObject);
	}

	public static java.util.List<interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse> result = new java.util.ArrayList<interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceContractAspectUpdates.ContractAspectUpdateResponse" + xpathConstraint))
			result.add(interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of UU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate
	 */
	public final interfacecontractaspectupdates.proxies.IncomingContractAspectUpdate getUU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate() throws com.mendix.core.CoreException
	{
		return getUU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate
	 */
	public final interfacecontractaspectupdates.proxies.IncomingContractAspectUpdate getUU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.IncomingContractAspectUpdate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.UU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.IncomingContractAspectUpdate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of UU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate
	 * @param uu95_incomingcontractaspectupdateresponse_incomingcontractaspectupdate
	 */
	public final void setUU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate(interfacecontractaspectupdates.proxies.IncomingContractAspectUpdate uu95_incomingcontractaspectupdateresponse_incomingcontractaspectupdate)
	{
		setUU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate(getContext(), uu95_incomingcontractaspectupdateresponse_incomingcontractaspectupdate);
	}

	/**
	 * Set value of UU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate
	 * @param context
	 * @param uu95_incomingcontractaspectupdateresponse_incomingcontractaspectupdate
	 */
	public final void setUU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.IncomingContractAspectUpdate uu95_incomingcontractaspectupdateresponse_incomingcontractaspectupdate)
	{
		if (uu95_incomingcontractaspectupdateresponse_incomingcontractaspectupdate == null)
			getMendixObject().setValue(context, MemberNames.UU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.UU95_IncomingContractAspectUpdateResponse_IncomingContractAspectUpdate.toString(), uu95_incomingcontractaspectupdateresponse_incomingcontractaspectupdate.getMendixObject().getId());
	}

	/**
	 * @return value of ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer
	 */
	public final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk getContractAspectUpdateResponse_ContractAspectUpdateResponseContainer() throws com.mendix.core.CoreException
	{
		return getContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(getContext());
	}

	/**
	 * @param context
	 * @return value of ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer
	 */
	public final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk getContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer
	 * @param contractaspectupdateresponse_contractaspectupdateresponsecontainer
	 */
	public final void setContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk contractaspectupdateresponse_contractaspectupdateresponsecontainer)
	{
		setContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(getContext(), contractaspectupdateresponse_contractaspectupdateresponsecontainer);
	}

	/**
	 * Set value of ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer
	 * @param context
	 * @param contractaspectupdateresponse_contractaspectupdateresponsecontainer
	 */
	public final void setContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk contractaspectupdateresponse_contractaspectupdateresponsecontainer)
	{
		if (contractaspectupdateresponse_contractaspectupdateresponsecontainer == null)
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer.toString(), contractaspectupdateresponse_contractaspectupdateresponsecontainer.getMendixObject().getId());
	}

	/**
	 * @return value of ContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation
	 */
	public final interfacecontractaspectupdates.proxies.IncomingContractAspectUpdateConfirmation getContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation() throws com.mendix.core.CoreException
	{
		return getContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation(getContext());
	}

	/**
	 * @param context
	 * @return value of ContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation
	 */
	public final interfacecontractaspectupdates.proxies.IncomingContractAspectUpdateConfirmation getContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.IncomingContractAspectUpdateConfirmation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.IncomingContractAspectUpdateConfirmation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation
	 * @param contractaspectupdateresponse_incomingcontractaspectupdateconfirmation
	 */
	public final void setContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation(interfacecontractaspectupdates.proxies.IncomingContractAspectUpdateConfirmation contractaspectupdateresponse_incomingcontractaspectupdateconfirmation)
	{
		setContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation(getContext(), contractaspectupdateresponse_incomingcontractaspectupdateconfirmation);
	}

	/**
	 * Set value of ContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation
	 * @param context
	 * @param contractaspectupdateresponse_incomingcontractaspectupdateconfirmation
	 */
	public final void setContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.IncomingContractAspectUpdateConfirmation contractaspectupdateresponse_incomingcontractaspectupdateconfirmation)
	{
		if (contractaspectupdateresponse_incomingcontractaspectupdateconfirmation == null)
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponse_IncomingContractAspectUpdateConfirmation.toString(), contractaspectupdateresponse_incomingcontractaspectupdateconfirmation.getMendixObject().getId());
	}

	/**
	 * @return value of ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk getContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk getContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk
	 * @param contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk
	 */
	public final void setContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk)
	{
		setContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(getContext(), contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk);
	}

	/**
	 * Set value of ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk
	 * @param context
	 * @param contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk
	 */
	public final void setContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk)
	{
		if (contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk.toString(), contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse that = (interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse) obj;
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
		return "InterfaceContractAspectUpdates.ContractAspectUpdateResponse";
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
