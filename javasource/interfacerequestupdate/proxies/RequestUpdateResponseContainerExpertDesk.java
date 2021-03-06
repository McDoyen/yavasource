// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerequestupdate.proxies;

public class RequestUpdateResponseContainerExpertDesk
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject requestUpdateResponseContainerExpertDeskMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRequestUpdate.RequestUpdateResponseContainerExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk("InterfaceRequestUpdate.RequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk"),
		RequestUpdateResponseExpertDesk_RequestUpdateResponseContainer("InterfaceRequestUpdate.RequestUpdateResponseExpertDesk_RequestUpdateResponseContainer");

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

	public RequestUpdateResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRequestUpdate.RequestUpdateResponseContainerExpertDesk"));
	}

	protected RequestUpdateResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestUpdateResponseContainerExpertDeskMendixObject)
	{
		if (requestUpdateResponseContainerExpertDeskMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRequestUpdate.RequestUpdateResponseContainerExpertDesk", requestUpdateResponseContainerExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRequestUpdate.RequestUpdateResponseContainerExpertDesk");

		this.requestUpdateResponseContainerExpertDeskMendixObject = requestUpdateResponseContainerExpertDeskMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RequestUpdateResponseContainerExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk(context, mendixObject);
	}

	public static interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk> result = new java.util.ArrayList<interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRequestUpdate.RequestUpdateResponseContainerExpertDesk" + xpathConstraint))
			result.add(interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk.initialize(context, obj));
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
	 * @return value of RequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk
	 */
	public final interfacerequestupdate.proxies.OutgoingRequestUpdateConfirmationExpertDesk getRequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk() throws com.mendix.core.CoreException
	{
		return getRequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk
	 */
	public final interfacerequestupdate.proxies.OutgoingRequestUpdateConfirmationExpertDesk getRequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequestupdate.proxies.OutgoingRequestUpdateConfirmationExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk.toString());
		if (identifier != null)
			result = interfacerequestupdate.proxies.OutgoingRequestUpdateConfirmationExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk
	 * @param requestupdateresponsecontainerexpertdesk_outgoingrequestupdateconfirmationexpertdesk
	 */
	public final void setRequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk(interfacerequestupdate.proxies.OutgoingRequestUpdateConfirmationExpertDesk requestupdateresponsecontainerexpertdesk_outgoingrequestupdateconfirmationexpertdesk)
	{
		setRequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk(getContext(), requestupdateresponsecontainerexpertdesk_outgoingrequestupdateconfirmationexpertdesk);
	}

	/**
	 * Set value of RequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk
	 * @param context
	 * @param requestupdateresponsecontainerexpertdesk_outgoingrequestupdateconfirmationexpertdesk
	 */
	public final void setRequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequestupdate.proxies.OutgoingRequestUpdateConfirmationExpertDesk requestupdateresponsecontainerexpertdesk_outgoingrequestupdateconfirmationexpertdesk)
	{
		if (requestupdateresponsecontainerexpertdesk_outgoingrequestupdateconfirmationexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.RequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RequestUpdateResponseContainerExpertDesk_OutgoingRequestUpdateConfirmationExpertDesk.toString(), requestupdateresponsecontainerexpertdesk_outgoingrequestupdateconfirmationexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of RequestUpdateResponseExpertDesk_RequestUpdateResponseContainer
	 */
	public final interfacerequestupdate.proxies.RequestUpdateResponse getRequestUpdateResponseExpertDesk_RequestUpdateResponseContainer() throws com.mendix.core.CoreException
	{
		return getRequestUpdateResponseExpertDesk_RequestUpdateResponseContainer(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestUpdateResponseExpertDesk_RequestUpdateResponseContainer
	 */
	public final interfacerequestupdate.proxies.RequestUpdateResponse getRequestUpdateResponseExpertDesk_RequestUpdateResponseContainer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequestupdate.proxies.RequestUpdateResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RequestUpdateResponseExpertDesk_RequestUpdateResponseContainer.toString());
		if (identifier != null)
			result = interfacerequestupdate.proxies.RequestUpdateResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RequestUpdateResponseExpertDesk_RequestUpdateResponseContainer
	 * @param requestupdateresponseexpertdesk_requestupdateresponsecontainer
	 */
	public final void setRequestUpdateResponseExpertDesk_RequestUpdateResponseContainer(interfacerequestupdate.proxies.RequestUpdateResponse requestupdateresponseexpertdesk_requestupdateresponsecontainer)
	{
		setRequestUpdateResponseExpertDesk_RequestUpdateResponseContainer(getContext(), requestupdateresponseexpertdesk_requestupdateresponsecontainer);
	}

	/**
	 * Set value of RequestUpdateResponseExpertDesk_RequestUpdateResponseContainer
	 * @param context
	 * @param requestupdateresponseexpertdesk_requestupdateresponsecontainer
	 */
	public final void setRequestUpdateResponseExpertDesk_RequestUpdateResponseContainer(com.mendix.systemwideinterfaces.core.IContext context, interfacerequestupdate.proxies.RequestUpdateResponse requestupdateresponseexpertdesk_requestupdateresponsecontainer)
	{
		if (requestupdateresponseexpertdesk_requestupdateresponsecontainer == null)
			getMendixObject().setValue(context, MemberNames.RequestUpdateResponseExpertDesk_RequestUpdateResponseContainer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RequestUpdateResponseExpertDesk_RequestUpdateResponseContainer.toString(), requestupdateresponseexpertdesk_requestupdateresponsecontainer.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return requestUpdateResponseContainerExpertDeskMendixObject;
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
			final interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk that = (interfacerequestupdate.proxies.RequestUpdateResponseContainerExpertDesk) obj;
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
		return "InterfaceRequestUpdate.RequestUpdateResponseContainerExpertDesk";
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
