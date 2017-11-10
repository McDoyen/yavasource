// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacecontractaspectupdates.proxies;

public class OutgoingContractAspectUpdateExpertDesk extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MessageID("MessageID"),
		InterfaceName("InterfaceName"),
		ExternalReferenceID("ExternalReferenceID"),
		InternalReferenceID("InternalReferenceID"),
		Service("Service"),
		Impact("Impact"),
		Urgency("Urgency"),
		ContractEndTime("ContractEndTime"),
		OutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk"),
		CIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk("InterfaceAffectedCIs.CIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk");

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

	public OutgoingContractAspectUpdateExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateExpertDesk"));
	}

	protected OutgoingContractAspectUpdateExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingContractAspectUpdateExpertDeskMendixObject)
	{
		super(context, outgoingContractAspectUpdateExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateExpertDesk", outgoingContractAspectUpdateExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceContractAspectUpdates.OutgoingContractAspectUpdateExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingContractAspectUpdateExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk(context, mendixObject);
	}

	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk> result = new java.util.ArrayList<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceContractAspectUpdates.OutgoingContractAspectUpdateExpertDesk" + xpathConstraint))
			result.add(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk.initialize(context, obj));
		return result;
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
	 * @return value of ExternalReferenceID
	 */
	public final java.lang.String getExternalReferenceID()
	{
		return getExternalReferenceID(getContext());
	}

	/**
	 * @param context
	 * @return value of ExternalReferenceID
	 */
	public final java.lang.String getExternalReferenceID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ExternalReferenceID.toString());
	}

	/**
	 * Set value of ExternalReferenceID
	 * @param externalreferenceid
	 */
	public final void setExternalReferenceID(java.lang.String externalreferenceid)
	{
		setExternalReferenceID(getContext(), externalreferenceid);
	}

	/**
	 * Set value of ExternalReferenceID
	 * @param context
	 * @param externalreferenceid
	 */
	public final void setExternalReferenceID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String externalreferenceid)
	{
		getMendixObject().setValue(context, MemberNames.ExternalReferenceID.toString(), externalreferenceid);
	}

	/**
	 * @return value of InternalReferenceID
	 */
	public final java.lang.String getInternalReferenceID()
	{
		return getInternalReferenceID(getContext());
	}

	/**
	 * @param context
	 * @return value of InternalReferenceID
	 */
	public final java.lang.String getInternalReferenceID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InternalReferenceID.toString());
	}

	/**
	 * Set value of InternalReferenceID
	 * @param internalreferenceid
	 */
	public final void setInternalReferenceID(java.lang.String internalreferenceid)
	{
		setInternalReferenceID(getContext(), internalreferenceid);
	}

	/**
	 * Set value of InternalReferenceID
	 * @param context
	 * @param internalreferenceid
	 */
	public final void setInternalReferenceID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String internalreferenceid)
	{
		getMendixObject().setValue(context, MemberNames.InternalReferenceID.toString(), internalreferenceid);
	}

	/**
	 * @return value of Service
	 */
	public final java.lang.String getService()
	{
		return getService(getContext());
	}

	/**
	 * @param context
	 * @return value of Service
	 */
	public final java.lang.String getService(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Service.toString());
	}

	/**
	 * Set value of Service
	 * @param service
	 */
	public final void setService(java.lang.String service)
	{
		setService(getContext(), service);
	}

	/**
	 * Set value of Service
	 * @param context
	 * @param service
	 */
	public final void setService(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String service)
	{
		getMendixObject().setValue(context, MemberNames.Service.toString(), service);
	}

	/**
	 * @return value of Impact
	 */
	public final java.lang.String getImpact()
	{
		return getImpact(getContext());
	}

	/**
	 * @param context
	 * @return value of Impact
	 */
	public final java.lang.String getImpact(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Impact.toString());
	}

	/**
	 * Set value of Impact
	 * @param impact
	 */
	public final void setImpact(java.lang.String impact)
	{
		setImpact(getContext(), impact);
	}

	/**
	 * Set value of Impact
	 * @param context
	 * @param impact
	 */
	public final void setImpact(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String impact)
	{
		getMendixObject().setValue(context, MemberNames.Impact.toString(), impact);
	}

	/**
	 * @return value of Urgency
	 */
	public final java.lang.String getUrgency()
	{
		return getUrgency(getContext());
	}

	/**
	 * @param context
	 * @return value of Urgency
	 */
	public final java.lang.String getUrgency(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Urgency.toString());
	}

	/**
	 * Set value of Urgency
	 * @param urgency
	 */
	public final void setUrgency(java.lang.String urgency)
	{
		setUrgency(getContext(), urgency);
	}

	/**
	 * Set value of Urgency
	 * @param context
	 * @param urgency
	 */
	public final void setUrgency(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String urgency)
	{
		getMendixObject().setValue(context, MemberNames.Urgency.toString(), urgency);
	}

	/**
	 * @return value of ContractEndTime
	 */
	public final java.util.Date getContractEndTime()
	{
		return getContractEndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of ContractEndTime
	 */
	public final java.util.Date getContractEndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ContractEndTime.toString());
	}

	/**
	 * Set value of ContractEndTime
	 * @param contractendtime
	 */
	public final void setContractEndTime(java.util.Date contractendtime)
	{
		setContractEndTime(getContext(), contractendtime);
	}

	/**
	 * Set value of ContractEndTime
	 * @param context
	 * @param contractendtime
	 */
	public final void setContractEndTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date contractendtime)
	{
		getMendixObject().setValue(context, MemberNames.ContractEndTime.toString(), contractendtime);
	}

	/**
	 * @return value of OutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateMessageExpertDesk getOutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateMessageExpertDesk getOutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk
	 * @param outgoingcontractaspectupdateexpertdesk_outgoingcontractaspectupdatemessageexpertdesk
	 */
	public final void setOutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateMessageExpertDesk outgoingcontractaspectupdateexpertdesk_outgoingcontractaspectupdatemessageexpertdesk)
	{
		setOutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk(getContext(), outgoingcontractaspectupdateexpertdesk_outgoingcontractaspectupdatemessageexpertdesk);
	}

	/**
	 * Set value of OutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk
	 * @param context
	 * @param outgoingcontractaspectupdateexpertdesk_outgoingcontractaspectupdatemessageexpertdesk
	 */
	public final void setOutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateMessageExpertDesk outgoingcontractaspectupdateexpertdesk_outgoingcontractaspectupdatemessageexpertdesk)
	{
		if (outgoingcontractaspectupdateexpertdesk_outgoingcontractaspectupdatemessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingContractAspectUpdateExpertDesk_OutgoingContractAspectUpdateMessageExpertDesk.toString(), outgoingcontractaspectupdateexpertdesk_outgoingcontractaspectupdatemessageexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of CIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk getCIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk() throws com.mendix.core.CoreException
	{
		return getCIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of CIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk getCIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk
	 * @param cicontainerexpertdesk_outgoingcontractaspectupdateexpertdesk
	 */
	public final void setCIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk(interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk cicontainerexpertdesk_outgoingcontractaspectupdateexpertdesk)
	{
		setCIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk(getContext(), cicontainerexpertdesk_outgoingcontractaspectupdateexpertdesk);
	}

	/**
	 * Set value of CIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk
	 * @param context
	 * @param cicontainerexpertdesk_outgoingcontractaspectupdateexpertdesk
	 */
	public final void setCIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.AffectedCIsContainerExpertDesk cicontainerexpertdesk_outgoingcontractaspectupdateexpertdesk)
	{
		if (cicontainerexpertdesk_outgoingcontractaspectupdateexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.CIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CIContainerExpertDesk_OutgoingContractAspectUpdateExpertDesk.toString(), cicontainerexpertdesk_outgoingcontractaspectupdateexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk that = (interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateExpertDesk) obj;
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
		return "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateExpertDesk";
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
