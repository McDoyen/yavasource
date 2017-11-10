// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceaffectedcis.proxies;

public class OutgoingAffectedCIsConfirmationExpertDesk extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConfirmationMessageID("ConfirmationMessageID"),
		MessageID("MessageID"),
		InterfaceName("InterfaceName"),
		OutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk("InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk"),
		AffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk("InterfaceAffectedCIs.AffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk");

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

	public OutgoingAffectedCIsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationExpertDesk"));
	}

	protected OutgoingAffectedCIsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingAffectedCIsConfirmationExpertDeskMendixObject)
	{
		super(context, outgoingAffectedCIsConfirmationExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationExpertDesk", outgoingAffectedCIsConfirmationExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingAffectedCIsConfirmationExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk(context, mendixObject);
	}

	public static interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk> result = new java.util.ArrayList<interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationExpertDesk" + xpathConstraint))
			result.add(interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk.initialize(context, obj));
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
	 * @return value of OutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk
	 */
	public final interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationMessageExpertDesk getOutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk
	 */
	public final interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationMessageExpertDesk getOutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk
	 * @param outgoingaffectedcisconfirmationexpertdesk_outgoingaddaffectedcisconfirmationmessageexpertdesk
	 */
	public final void setOutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk(interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationMessageExpertDesk outgoingaffectedcisconfirmationexpertdesk_outgoingaddaffectedcisconfirmationmessageexpertdesk)
	{
		setOutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk(getContext(), outgoingaffectedcisconfirmationexpertdesk_outgoingaddaffectedcisconfirmationmessageexpertdesk);
	}

	/**
	 * Set value of OutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk
	 * @param context
	 * @param outgoingaffectedcisconfirmationexpertdesk_outgoingaddaffectedcisconfirmationmessageexpertdesk
	 */
	public final void setOutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationMessageExpertDesk outgoingaffectedcisconfirmationexpertdesk_outgoingaddaffectedcisconfirmationmessageexpertdesk)
	{
		if (outgoingaffectedcisconfirmationexpertdesk_outgoingaddaffectedcisconfirmationmessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingAffectedCIsConfirmationExpertDesk_OutgoingAddAffectedCIsConfirmationMessageExpertDesk.toString(), outgoingaffectedcisconfirmationexpertdesk_outgoingaddaffectedcisconfirmationmessageexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsResponseContainerExpertDesk getAffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk() throws com.mendix.core.CoreException
	{
		return getAffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsResponseContainerExpertDesk getAffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.AffectedCIsResponseContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.AffectedCIsResponseContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk
	 * @param affectedcisresponsecontainerexperdesk_outgoingaffectedcisconfirmationexpertdesk
	 */
	public final void setAffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk(interfaceaffectedcis.proxies.AffectedCIsResponseContainerExpertDesk affectedcisresponsecontainerexperdesk_outgoingaffectedcisconfirmationexpertdesk)
	{
		setAffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk(getContext(), affectedcisresponsecontainerexperdesk_outgoingaffectedcisconfirmationexpertdesk);
	}

	/**
	 * Set value of AffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk
	 * @param context
	 * @param affectedcisresponsecontainerexperdesk_outgoingaffectedcisconfirmationexpertdesk
	 */
	public final void setAffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.AffectedCIsResponseContainerExpertDesk affectedcisresponsecontainerexperdesk_outgoingaffectedcisconfirmationexpertdesk)
	{
		if (affectedcisresponsecontainerexperdesk_outgoingaffectedcisconfirmationexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIsResponseContainerExperDesk_OutgoingAffectedCIsConfirmationExpertDesk.toString(), affectedcisresponsecontainerexperdesk_outgoingaffectedcisconfirmationexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk that = (interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationExpertDesk) obj;
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
		return "InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationExpertDesk";
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
