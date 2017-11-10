// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceaffectedcis.proxies;

public class OutgoingAffectedCIsConfirmationResponseMessageExpertDesk extends interfaceshared.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk("InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk"),
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

	public OutgoingAffectedCIsConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk"));
	}

	protected OutgoingAffectedCIsConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingAffectedCIsConfirmationResponseMessageExpertDeskMendixObject)
	{
		super(context, outgoingAffectedCIsConfirmationResponseMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk", outgoingAffectedCIsConfirmationResponseMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingAffectedCIsConfirmationResponseMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk(context, mendixObject);
	}

	public static interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk> result = new java.util.ArrayList<interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk" + xpathConstraint))
			result.add(interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of OutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk
	 */
	public final interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseExpertDesk getOutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getOutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of OutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk
	 */
	public final interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseExpertDesk getOutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk
	 * @param outgoingaffectedcisconfirmationresponseexpertdesk_outgoingaffectedcisconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk(interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseExpertDesk outgoingaffectedcisconfirmationresponseexpertdesk_outgoingaffectedcisconfirmationresponsemessageexpertdesk)
	{
		setOutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk(getContext(), outgoingaffectedcisconfirmationresponseexpertdesk_outgoingaffectedcisconfirmationresponsemessageexpertdesk);
	}

	/**
	 * Set value of OutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk
	 * @param context
	 * @param outgoingaffectedcisconfirmationresponseexpertdesk_outgoingaffectedcisconfirmationresponsemessageexpertdesk
	 */
	public final void setOutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseExpertDesk outgoingaffectedcisconfirmationresponseexpertdesk_outgoingaffectedcisconfirmationresponsemessageexpertdesk)
	{
		if (outgoingaffectedcisconfirmationresponseexpertdesk_outgoingaffectedcisconfirmationresponsemessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.OutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OutgoingAffectedCIsConfirmationResponseExpertDesk_OutgoingAffectedCIsConfirmationResponseMessageExpertDesk.toString(), outgoingaffectedcisconfirmationresponseexpertdesk_outgoingaffectedcisconfirmationresponsemessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk that = (interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk) obj;
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
		return "InterfaceAffectedCIs.OutgoingAffectedCIsConfirmationResponseMessageExpertDesk";
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