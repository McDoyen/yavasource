// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacecontractaspectupdates.proxies;

public class ContractAspectUpdateResponseContainerExpertDesk
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject contractAspectUpdateResponseContainerExpertDeskMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceContractAspectUpdates.ContractAspectUpdateResponseContainerExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk("InterfaceContractAspectUpdates.ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk"),
		ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer("InterfaceContractAspectUpdates.ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer");

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

	public ContractAspectUpdateResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceContractAspectUpdates.ContractAspectUpdateResponseContainerExpertDesk"));
	}

	protected ContractAspectUpdateResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject contractAspectUpdateResponseContainerExpertDeskMendixObject)
	{
		if (contractAspectUpdateResponseContainerExpertDeskMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.ContractAspectUpdateResponseContainerExpertDesk", contractAspectUpdateResponseContainerExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceContractAspectUpdates.ContractAspectUpdateResponseContainerExpertDesk");

		this.contractAspectUpdateResponseContainerExpertDeskMendixObject = contractAspectUpdateResponseContainerExpertDeskMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ContractAspectUpdateResponseContainerExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk(context, mendixObject);
	}

	public static interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk> result = new java.util.ArrayList<interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceContractAspectUpdates.ContractAspectUpdateResponseContainerExpertDesk" + xpathConstraint))
			result.add(interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk.initialize(context, obj));
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
	 * @return value of ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk getContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk() throws com.mendix.core.CoreException
	{
		return getContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk getContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk
	 * @param contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk
	 */
	public final void setContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk)
	{
		setContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(getContext(), contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk);
	}

	/**
	 * Set value of ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk
	 * @param context
	 * @param contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk
	 */
	public final void setContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk)
	{
		if (contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk.toString(), contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer
	 */
	public final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse getContractAspectUpdateResponse_ContractAspectUpdateResponseContainer() throws com.mendix.core.CoreException
	{
		return getContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(getContext());
	}

	/**
	 * @param context
	 * @return value of ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer
	 */
	public final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse getContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer
	 * @param contractaspectupdateresponse_contractaspectupdateresponsecontainer
	 */
	public final void setContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse contractaspectupdateresponse_contractaspectupdateresponsecontainer)
	{
		setContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(getContext(), contractaspectupdateresponse_contractaspectupdateresponsecontainer);
	}

	/**
	 * Set value of ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer
	 * @param context
	 * @param contractaspectupdateresponse_contractaspectupdateresponsecontainer
	 */
	public final void setContractAspectUpdateResponse_ContractAspectUpdateResponseContainer(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse contractaspectupdateresponse_contractaspectupdateresponsecontainer)
	{
		if (contractaspectupdateresponse_contractaspectupdateresponsecontainer == null)
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponse_ContractAspectUpdateResponseContainer.toString(), contractaspectupdateresponse_contractaspectupdateresponsecontainer.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return contractAspectUpdateResponseContainerExpertDeskMendixObject;
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
			final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk that = (interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk) obj;
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
		return "InterfaceContractAspectUpdates.ContractAspectUpdateResponseContainerExpertDesk";
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
