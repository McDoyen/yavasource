// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacecontractaspectupdates.proxies;

public class OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk extends interfaceshared.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk"),
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

	public OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk"));
	}

	protected OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingContractAspectUpdateConfirmationResponseMessageExpertDeskMendixObject)
	{
		super(context, outgoingContractAspectUpdateConfirmationResponseMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk", outgoingContractAspectUpdateConfirmationResponseMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk(context, mendixObject);
	}

	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk> result = new java.util.ArrayList<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk" + xpathConstraint))
			result.add(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseExpertDesk getOutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk
	 */
	public final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseExpertDesk getOutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk
	 * @param outgoingcontractaspectupdateconfirmationresponseexpertdesk_outgoingcontractaspectupdateconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseExpertDesk outgoingcontractaspectupdateconfirmationresponseexpertdesk_outgoingcontractaspectupdateconfirmationresponsemessageexpertdesk)
	{
		setOutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk(getContext(), outgoingcontractaspectupdateconfirmationresponseexpertdesk_outgoingcontractaspectupdateconfirmationresponsemessageexpertdesk);
	}

	/**
	 * Set value of OutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk
	 * @param context
	 * @param outgoingcontractaspectupdateconfirmationresponseexpertdesk_outgoingcontractaspectupdateconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseExpertDesk outgoingcontractaspectupdateconfirmationresponseexpertdesk_outgoingcontractaspectupdateconfirmationresponsemessageexpertdesk)
	{
		if (outgoingcontractaspectupdateconfirmationresponseexpertdesk_outgoingcontractaspectupdateconfirmationresponsemessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingContractAspectUpdateConfirmationResponseExpertDesk_OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk.toString(), outgoingcontractaspectupdateconfirmationresponseexpertdesk_outgoingcontractaspectupdateconfirmationresponsemessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk that = (interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk) obj;
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
		return "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationResponseMessageExpertDesk";
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
