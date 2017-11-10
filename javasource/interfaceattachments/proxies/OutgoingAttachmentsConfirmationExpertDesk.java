// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceattachments.proxies;

public class OutgoingAttachmentsConfirmationExpertDesk extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceAttachments.OutgoingAttachmentsConfirmationExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConfirmationMessageID("ConfirmationMessageID"),
		MessageID("MessageID"),
		InterfaceName("InterfaceName"),
		AttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk("InterfaceAttachments.AttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk"),
		OutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk("InterfaceAttachments.OutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk");

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

	public OutgoingAttachmentsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceAttachments.OutgoingAttachmentsConfirmationExpertDesk"));
	}

	protected OutgoingAttachmentsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingAttachmentsConfirmationExpertDeskMendixObject)
	{
		super(context, outgoingAttachmentsConfirmationExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceAttachments.OutgoingAttachmentsConfirmationExpertDesk", outgoingAttachmentsConfirmationExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceAttachments.OutgoingAttachmentsConfirmationExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingAttachmentsConfirmationExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk(context, mendixObject);
	}

	public static interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk> result = new java.util.ArrayList<interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceAttachments.OutgoingAttachmentsConfirmationExpertDesk" + xpathConstraint))
			result.add(interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk.initialize(context, obj));
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
	 * @return value of AttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk
	 */
	public final interfaceattachments.proxies.AttachmentsResponseContainerExperDesk getAttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk() throws com.mendix.core.CoreException
	{
		return getAttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of AttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk
	 */
	public final interfaceattachments.proxies.AttachmentsResponseContainerExperDesk getAttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceattachments.proxies.AttachmentsResponseContainerExperDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk.toString());
		if (identifier != null)
			result = interfaceattachments.proxies.AttachmentsResponseContainerExperDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk
	 * @param attachmentsresponsecontainerexperdesk_outgoingattachmentsconfirmationexpertdesk
	 */
	public final void setAttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk(interfaceattachments.proxies.AttachmentsResponseContainerExperDesk attachmentsresponsecontainerexperdesk_outgoingattachmentsconfirmationexpertdesk)
	{
		setAttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk(getContext(), attachmentsresponsecontainerexperdesk_outgoingattachmentsconfirmationexpertdesk);
	}

	/**
	 * Set value of AttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk
	 * @param context
	 * @param attachmentsresponsecontainerexperdesk_outgoingattachmentsconfirmationexpertdesk
	 */
	public final void setAttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceattachments.proxies.AttachmentsResponseContainerExperDesk attachmentsresponsecontainerexperdesk_outgoingattachmentsconfirmationexpertdesk)
	{
		if (attachmentsresponsecontainerexperdesk_outgoingattachmentsconfirmationexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.AttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AttachmentsResponseContainerExperDesk_OutgoingAttachmentsConfirmationExpertDesk.toString(), attachmentsresponsecontainerexperdesk_outgoingattachmentsconfirmationexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of OutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk
	 */
	public final interfaceattachments.proxies.OutgoingAttachmentsConfirmationMessageExpertDesk getOutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk
	 */
	public final interfaceattachments.proxies.OutgoingAttachmentsConfirmationMessageExpertDesk getOutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceattachments.proxies.OutgoingAttachmentsConfirmationMessageExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk.toString());
		if (identifier != null)
			result = interfaceattachments.proxies.OutgoingAttachmentsConfirmationMessageExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk
	 * @param outgoingattachmentsconfirmationexpertdesk_outgoingattachmentsconfirmationmessageexpertdesk
	 */
	public final void setOutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk(interfaceattachments.proxies.OutgoingAttachmentsConfirmationMessageExpertDesk outgoingattachmentsconfirmationexpertdesk_outgoingattachmentsconfirmationmessageexpertdesk)
	{
		setOutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk(getContext(), outgoingattachmentsconfirmationexpertdesk_outgoingattachmentsconfirmationmessageexpertdesk);
	}

	/**
	 * Set value of OutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk
	 * @param context
	 * @param outgoingattachmentsconfirmationexpertdesk_outgoingattachmentsconfirmationmessageexpertdesk
	 */
	public final void setOutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceattachments.proxies.OutgoingAttachmentsConfirmationMessageExpertDesk outgoingattachmentsconfirmationexpertdesk_outgoingattachmentsconfirmationmessageexpertdesk)
	{
		if (outgoingattachmentsconfirmationexpertdesk_outgoingattachmentsconfirmationmessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingAttachmentsConfirmationExpertDesk_OutgoingAttachmentsConfirmationMessageExpertDesk.toString(), outgoingattachmentsconfirmationexpertdesk_outgoingattachmentsconfirmationmessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk that = (interfaceattachments.proxies.OutgoingAttachmentsConfirmationExpertDesk) obj;
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
		return "InterfaceAttachments.OutgoingAttachmentsConfirmationExpertDesk";
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