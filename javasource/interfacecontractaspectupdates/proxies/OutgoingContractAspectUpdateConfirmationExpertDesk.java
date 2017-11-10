// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacecontractaspectupdates.proxies;

public class OutgoingContractAspectUpdateConfirmationExpertDesk extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConfirmationMessageID("ConfirmationMessageID"),
		MessageID("MessageID"),
		InterfaceName("InterfaceName"),
		OutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk"),
		ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk("InterfaceContractAspectUpdates.ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk");

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

	public OutgoingContractAspectUpdateConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationExpertDesk"));
	}

	protected OutgoingContractAspectUpdateConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingContractAspectUpdateConfirmationExpertDeskMendixObject)
	{
		super(context, outgoingContractAspectUpdateConfirmationExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationExpertDesk", outgoingContractAspectUpdateConfirmationExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingContractAspectUpdateConfirmationExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk(context, mendixObject);
	}

	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk> result = new java.util.ArrayList<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationExpertDesk" + xpathConstraint))
			result.add(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ConfirmationMessageID
	 */
	public final java.lang.String getConfirmationMessageID()
	{
		return getConfirmationMessageID(getContext());
	}

	/**
	 * @param context
	 * @return value of ConfirmationMessageID
	 */
	public final java.lang.String getConfirmationMessageID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ConfirmationMessageID.toString());
	}

	/**
	 * Set value of ConfirmationMessageID
	 * @param confirmationmessageid
	 */
	public final void setConfirmationMessageID(java.lang.String confirmationmessageid)
	{
		setConfirmationMessageID(getContext(), confirmationmessageid);
	}

	/**
	 * Set value of ConfirmationMessageID
	 * @param context
	 * @param confirmationmessageid
	 */
	public final void setConfirmationMessageID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String confirmationmessageid)
	{
		getMendixObject().setValue(context, MemberNames.ConfirmationMessageID.toString(), confirmationmessageid);
	}

	/**
	 * @return value of MessageID
	 */
	public final java.lang.String getMessageID()
	{
		return getMessageID(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageID
	 */
	public final java.lang.String getMessageID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MessageID.toString());
	}

	/**
	 * Set value of MessageID
	 * @param messageid
	 */
	public final void setMessageID(java.lang.String messageid)
	{
		setMessageID(getContext(), messageid);
	}

	/**
	 * Set value of MessageID
	 * @param context
	 * @param messageid
	 */
	public final void setMessageID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String messageid)
	{
		getMendixObject().setValue(context, MemberNames.MessageID.toString(), messageid);
	}

	/**
	 * @return value of InterfaceName
	 */
	public final java.lang.String getInterfaceName()
	{
		return getInterfaceName(getContext());
	}

	/**
	 * @param context
	 * @return value of InterfaceName
	 */
	public final java.lang.String getInterfaceName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InterfaceName.toString());
	}

	/**
	 * Set value of InterfaceName
	 * @param interfacename
	 */
	public final void setInterfaceName(java.lang.String interfacename)
	{
		setInterfaceName(getContext(), interfacename);
	}

	/**
	 * Set value of InterfaceName
	 * @param context
	 * @param interfacename
	 */
	public final void setInterfaceName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String interfacename)
	{
		getMendixObject().setValue(context, MemberNames.InterfaceName.toString(), interfacename);
	}

	/**
	 * @return value of OutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationMessageExpertDesk getOutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationMessageExpertDesk getOutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk
	 * @param outgoingcontractaspectupdateconfirmationexpertdesk_outgoingcontractaspectupdateconfirmationmessageexpertdesk
	 */
	public final void setOutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationMessageExpertDesk outgoingcontractaspectupdateconfirmationexpertdesk_outgoingcontractaspectupdateconfirmationmessageexpertdesk)
	{
		setOutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk(getContext(), outgoingcontractaspectupdateconfirmationexpertdesk_outgoingcontractaspectupdateconfirmationmessageexpertdesk);
	}

	/**
	 * Set value of OutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk
	 * @param context
	 * @param outgoingcontractaspectupdateconfirmationexpertdesk_outgoingcontractaspectupdateconfirmationmessageexpertdesk
	 */
	public final void setOutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationMessageExpertDesk outgoingcontractaspectupdateconfirmationexpertdesk_outgoingcontractaspectupdateconfirmationmessageexpertdesk)
	{
		if (outgoingcontractaspectupdateconfirmationexpertdesk_outgoingcontractaspectupdateconfirmationmessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingContractAspectUpdateConfirmationExpertDesk_OutgoingContractAspectUpdateConfirmationMessageExpertDesk.toString(), outgoingcontractaspectupdateconfirmationexpertdesk_outgoingcontractaspectupdateconfirmationmessageexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk getContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk() throws com.mendix.core.CoreException
	{
		return getContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk getContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk
	 * @param contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk
	 */
	public final void setContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk)
	{
		setContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(getContext(), contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk);
	}

	/**
	 * Set value of ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk
	 * @param context
	 * @param contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk
	 */
	public final void setContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.ContractAspectUpdateResponseContainerExpertDesk contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk)
	{
		if (contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ContractAspectUpdateResponseContainer_OutgoingContractAspectUpdateConfirmationExpertDesk.toString(), contractaspectupdateresponsecontainer_outgoingcontractaspectupdateconfirmationexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk that = (interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationExpertDesk) obj;
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
		return "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationExpertDesk";
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