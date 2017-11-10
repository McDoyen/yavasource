// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacecontractaspectupdates.proxies;

public class OutgoingContractAspectUpdateResponseMessageExpertDesk extends interfaceshared.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateResponseMessageExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public OutgoingContractAspectUpdateResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateResponseMessageExpertDesk"));
	}

	protected OutgoingContractAspectUpdateResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingContractAspectUpdateResponseMessageExpertDeskMendixObject)
	{
		super(context, outgoingContractAspectUpdateResponseMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateResponseMessageExpertDesk", outgoingContractAspectUpdateResponseMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceContractAspectUpdates.OutgoingContractAspectUpdateResponseMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingContractAspectUpdateResponseMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk(context, mendixObject);
	}

	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk> result = new java.util.ArrayList<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceContractAspectUpdates.OutgoingContractAspectUpdateResponseMessageExpertDesk" + xpathConstraint))
			result.add(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse getContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse getContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk
	 * @param contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk
	 */
	public final void setContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk)
	{
		setContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(getContext(), contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk);
	}

	/**
	 * Set value of ContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk
	 * @param context
	 * @param contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk
	 */
	public final void setContractAspectUpdateResponse_OutgoingContractAspectUpdateResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.ContractAspectUpdateResponse contractaspectupdateresponse_outgoingcontractaspectupdateresponsemessageexpertdesk)
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
			final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk that = (interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateResponseMessageExpertDesk) obj;
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
		return "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateResponseMessageExpertDesk";
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