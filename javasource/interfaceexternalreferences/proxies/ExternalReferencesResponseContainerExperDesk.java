// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceexternalreferences.proxies;

public class ExternalReferencesResponseContainerExperDesk
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject externalReferencesResponseContainerExperDeskMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceExternalReferences.ExternalReferencesResponseContainerExperDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk("InterfaceExternalReferences.ExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk"),
		ExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk("InterfaceExternalReferences.ExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk");

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

	public ExternalReferencesResponseContainerExperDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceExternalReferences.ExternalReferencesResponseContainerExperDesk"));
	}

	protected ExternalReferencesResponseContainerExperDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject externalReferencesResponseContainerExperDeskMendixObject)
	{
		if (externalReferencesResponseContainerExperDeskMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceExternalReferences.ExternalReferencesResponseContainerExperDesk", externalReferencesResponseContainerExperDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceExternalReferences.ExternalReferencesResponseContainerExperDesk");

		this.externalReferencesResponseContainerExperDeskMendixObject = externalReferencesResponseContainerExperDeskMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ExternalReferencesResponseContainerExperDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk(context, mendixObject);
	}

	public static interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk> result = new java.util.ArrayList<interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceExternalReferences.ExternalReferencesResponseContainerExperDesk" + xpathConstraint))
			result.add(interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk.initialize(context, obj));
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
	 * @return value of ExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk
	 */
	public final interfaceexternalreferences.proxies.ExternalReferencesResponse getExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk() throws com.mendix.core.CoreException
	{
		return getExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of ExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk
	 */
	public final interfaceexternalreferences.proxies.ExternalReferencesResponse getExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceexternalreferences.proxies.ExternalReferencesResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk.toString());
		if (identifier != null)
			result = interfaceexternalreferences.proxies.ExternalReferencesResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk
	 * @param externalreferencesresponse_externalreferencesresponsecontainerexperdesk
	 */
	public final void setExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk(interfaceexternalreferences.proxies.ExternalReferencesResponse externalreferencesresponse_externalreferencesresponsecontainerexperdesk)
	{
		setExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk(getContext(), externalreferencesresponse_externalreferencesresponsecontainerexperdesk);
	}

	/**
	 * Set value of ExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk
	 * @param context
	 * @param externalreferencesresponse_externalreferencesresponsecontainerexperdesk
	 */
	public final void setExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceexternalreferences.proxies.ExternalReferencesResponse externalreferencesresponse_externalreferencesresponsecontainerexperdesk)
	{
		if (externalreferencesresponse_externalreferencesresponsecontainerexperdesk == null)
			getMendixObject().setValue(context, MemberNames.ExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExternalReferencesResponse_ExternalReferencesResponseContainerExperDesk.toString(), externalreferencesresponse_externalreferencesresponsecontainerexperdesk.getMendixObject().getId());
	}

	/**
	 * @return value of ExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk
	 */
	public final interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk getExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk() throws com.mendix.core.CoreException
	{
		return getExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of ExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk
	 */
	public final interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk getExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk.toString());
		if (identifier != null)
			result = interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk
	 * @param externalreferencesresponsecontainerexperdesk_outgoingexternalreferencesconfirmationexpertdesk
	 */
	public final void setExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk(interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk externalreferencesresponsecontainerexperdesk_outgoingexternalreferencesconfirmationexpertdesk)
	{
		setExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk(getContext(), externalreferencesresponsecontainerexperdesk_outgoingexternalreferencesconfirmationexpertdesk);
	}

	/**
	 * Set value of ExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk
	 * @param context
	 * @param externalreferencesresponsecontainerexperdesk_outgoingexternalreferencesconfirmationexpertdesk
	 */
	public final void setExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmationExpertDesk externalreferencesresponsecontainerexperdesk_outgoingexternalreferencesconfirmationexpertdesk)
	{
		if (externalreferencesresponsecontainerexperdesk_outgoingexternalreferencesconfirmationexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.ExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExternalReferencesResponseContainerExperDesk_OutgoingExternalReferencesConfirmationExpertDesk.toString(), externalreferencesresponsecontainerexperdesk_outgoingexternalreferencesconfirmationexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return externalReferencesResponseContainerExperDeskMendixObject;
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
			final interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk that = (interfaceexternalreferences.proxies.ExternalReferencesResponseContainerExperDesk) obj;
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
		return "InterfaceExternalReferences.ExternalReferencesResponseContainerExperDesk";
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
