// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared.proxies;

public class OutgoingHeartBeatConfirmationExpertDesk extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceShared.OutgoingHeartBeatConfirmationExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConfirmationMessageID("ConfirmationMessageID"),
		MessageID("MessageID"),
		InterfaceName("InterfaceName"),
		OutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk("InterfaceShared.OutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk");

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

	public OutgoingHeartBeatConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceShared.OutgoingHeartBeatConfirmationExpertDesk"));
	}

	protected OutgoingHeartBeatConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingHeartBeatConfirmationExpertDeskMendixObject)
	{
		super(context, outgoingHeartBeatConfirmationExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceShared.OutgoingHeartBeatConfirmationExpertDesk", outgoingHeartBeatConfirmationExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceShared.OutgoingHeartBeatConfirmationExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingHeartBeatConfirmationExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk(context, mendixObject);
	}

	public static interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk> result = new java.util.ArrayList<interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceShared.OutgoingHeartBeatConfirmationExpertDesk" + xpathConstraint))
			result.add(interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk.initialize(context, obj));
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
	 * @return value of OutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk
	 */
	public final interfaceshared.proxies.OutgoingHeartBeatConfirmationMessageExpertDesk getOutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk
	 */
	public final interfaceshared.proxies.OutgoingHeartBeatConfirmationMessageExpertDesk getOutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.OutgoingHeartBeatConfirmationMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk.toString());
		if (identifier != null)
			result = interfaceshared.proxies.OutgoingHeartBeatConfirmationMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk
	 * @param outgoingheartbeatconfirmationexpertdesk_outgoingheartbeatconfirmationmessageexpertdesk
	 */
	public final void setOutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk(interfaceshared.proxies.OutgoingHeartBeatConfirmationMessageExpertDesk outgoingheartbeatconfirmationexpertdesk_outgoingheartbeatconfirmationmessageexpertdesk)
	{
		setOutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk(getContext(), outgoingheartbeatconfirmationexpertdesk_outgoingheartbeatconfirmationmessageexpertdesk);
	}

	/**
	 * Set value of OutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk
	 * @param context
	 * @param outgoingheartbeatconfirmationexpertdesk_outgoingheartbeatconfirmationmessageexpertdesk
	 */
	public final void setOutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.OutgoingHeartBeatConfirmationMessageExpertDesk outgoingheartbeatconfirmationexpertdesk_outgoingheartbeatconfirmationmessageexpertdesk)
	{
		if (outgoingheartbeatconfirmationexpertdesk_outgoingheartbeatconfirmationmessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingHeartBeatConfirmationExpertDesk_OutgoingHeartBeatConfirmationMessageExpertDesk.toString(), outgoingheartbeatconfirmationexpertdesk_outgoingheartbeatconfirmationmessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk that = (interfaceshared.proxies.OutgoingHeartBeatConfirmationExpertDesk) obj;
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
		return "InterfaceShared.OutgoingHeartBeatConfirmationExpertDesk";
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
