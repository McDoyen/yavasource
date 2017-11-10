// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceexternalreferences.proxies;

public class OutgoingExternalReferencesResponseMessageExpertDesk extends interfaceshared.proxies.Response
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceExternalReferences.OutgoingExternalReferencesResponseMessageExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk("InterfaceExternalReferences.ExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk"),
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

	public OutgoingExternalReferencesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceExternalReferences.OutgoingExternalReferencesResponseMessageExpertDesk"));
	}

	protected OutgoingExternalReferencesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingExternalReferencesResponseMessageExpertDeskMendixObject)
	{
		super(context, outgoingExternalReferencesResponseMessageExpertDeskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceExternalReferences.OutgoingExternalReferencesResponseMessageExpertDesk", outgoingExternalReferencesResponseMessageExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceExternalReferences.OutgoingExternalReferencesResponseMessageExpertDesk");
	}

	/**
	 * @deprecated Use 'OutgoingExternalReferencesResponseMessageExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk(context, mendixObject);
	}

	public static interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk> result = new java.util.ArrayList<interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceExternalReferences.OutgoingExternalReferencesResponseMessageExpertDesk" + xpathConstraint))
			result.add(interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk
	 */
	public final interfaceexternalreferences.proxies.ExternalReferencesResponse getExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk() throws com.mendix.core.CoreException
	{
		return getExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of ExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk
	 */
	public final interfaceexternalreferences.proxies.ExternalReferencesResponse getExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceexternalreferences.proxies.ExternalReferencesResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk.toString());
		if (identifier != null)
			result = interfaceexternalreferences.proxies.ExternalReferencesResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk
	 * @param externalreferencesresponse_outgoingexternalreferencesresponsemessageexpertdesk
	 */
	public final void setExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk(interfaceexternalreferences.proxies.ExternalReferencesResponse externalreferencesresponse_outgoingexternalreferencesresponsemessageexpertdesk)
	{
		setExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk(getContext(), externalreferencesresponse_outgoingexternalreferencesresponsemessageexpertdesk);
	}

	/**
	 * Set value of ExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk
	 * @param context
	 * @param externalreferencesresponse_outgoingexternalreferencesresponsemessageexpertdesk
	 */
	public final void setExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceexternalreferences.proxies.ExternalReferencesResponse externalreferencesresponse_outgoingexternalreferencesresponsemessageexpertdesk)
	{
		if (externalreferencesresponse_outgoingexternalreferencesresponsemessageexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.ExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExternalReferencesResponse_OutgoingExternalReferencesResponseMessageExpertDesk.toString(), externalreferencesresponse_outgoingexternalreferencesresponsemessageexpertdesk.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk that = (interfaceexternalreferences.proxies.OutgoingExternalReferencesResponseMessageExpertDesk) obj;
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
		return "InterfaceExternalReferences.OutgoingExternalReferencesResponseMessageExpertDesk";
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
