// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerelations.proxies;

public class RelationsResponseContainerExpertDesk
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject relationsResponseContainerExpertDeskMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRelations.RelationsResponseContainerExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RelationsResponse_RelationsResponseContainerExpertDesk("InterfaceRelations.RelationsResponse_RelationsResponseContainerExpertDesk"),
		RelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk("InterfaceRelations.RelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk");

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

	public RelationsResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRelations.RelationsResponseContainerExpertDesk"));
	}

	protected RelationsResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject relationsResponseContainerExpertDeskMendixObject)
	{
		if (relationsResponseContainerExpertDeskMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRelations.RelationsResponseContainerExpertDesk", relationsResponseContainerExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRelations.RelationsResponseContainerExpertDesk");

		this.relationsResponseContainerExpertDeskMendixObject = relationsResponseContainerExpertDeskMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RelationsResponseContainerExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerelations.proxies.RelationsResponseContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerelations.proxies.RelationsResponseContainerExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerelations.proxies.RelationsResponseContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerelations.proxies.RelationsResponseContainerExpertDesk(context, mendixObject);
	}

	public static interfacerelations.proxies.RelationsResponseContainerExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerelations.proxies.RelationsResponseContainerExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerelations.proxies.RelationsResponseContainerExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerelations.proxies.RelationsResponseContainerExpertDesk> result = new java.util.ArrayList<interfacerelations.proxies.RelationsResponseContainerExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRelations.RelationsResponseContainerExpertDesk" + xpathConstraint))
			result.add(interfacerelations.proxies.RelationsResponseContainerExpertDesk.initialize(context, obj));
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
	 * @return value of RelationsResponse_RelationsResponseContainerExpertDesk
	 */
	public final interfacerelations.proxies.RelationsResponse getRelationsResponse_RelationsResponseContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getRelationsResponse_RelationsResponseContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of RelationsResponse_RelationsResponseContainerExpertDesk
	 */
	public final interfacerelations.proxies.RelationsResponse getRelationsResponse_RelationsResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerelations.proxies.RelationsResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RelationsResponse_RelationsResponseContainerExpertDesk.toString());
		if (identifier != null)
			result = interfacerelations.proxies.RelationsResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RelationsResponse_RelationsResponseContainerExpertDesk
	 * @param relationsresponse_relationsresponsecontainerexpertdesk
	 */
	public final void setRelationsResponse_RelationsResponseContainerExpertDesk(interfacerelations.proxies.RelationsResponse relationsresponse_relationsresponsecontainerexpertdesk)
	{
		setRelationsResponse_RelationsResponseContainerExpertDesk(getContext(), relationsresponse_relationsresponsecontainerexpertdesk);
	}

	/**
	 * Set value of RelationsResponse_RelationsResponseContainerExpertDesk
	 * @param context
	 * @param relationsresponse_relationsresponsecontainerexpertdesk
	 */
	public final void setRelationsResponse_RelationsResponseContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerelations.proxies.RelationsResponse relationsresponse_relationsresponsecontainerexpertdesk)
	{
		if (relationsresponse_relationsresponsecontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.RelationsResponse_RelationsResponseContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RelationsResponse_RelationsResponseContainerExpertDesk.toString(), relationsresponse_relationsresponsecontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of RelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk
	 */
	public final interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk getRelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk() throws com.mendix.core.CoreException
	{
		return getRelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of RelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk
	 */
	public final interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk getRelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk.toString());
		if (identifier != null)
			result = interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk
	 * @param relationsresponsecontainerexpertdesk_outgoingrelationsconfirmationexpertdesk
	 */
	public final void setRelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk(interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk relationsresponsecontainerexpertdesk_outgoingrelationsconfirmationexpertdesk)
	{
		setRelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk(getContext(), relationsresponsecontainerexpertdesk_outgoingrelationsconfirmationexpertdesk);
	}

	/**
	 * Set value of RelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk
	 * @param context
	 * @param relationsresponsecontainerexpertdesk_outgoingrelationsconfirmationexpertdesk
	 */
	public final void setRelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerelations.proxies.OutgoingRelationsConfirmationExpertDesk relationsresponsecontainerexpertdesk_outgoingrelationsconfirmationexpertdesk)
	{
		if (relationsresponsecontainerexpertdesk_outgoingrelationsconfirmationexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.RelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RelationsResponseContainerExpertDesk_OutgoingRelationsConfirmationExpertDesk.toString(), relationsresponsecontainerexpertdesk_outgoingrelationsconfirmationexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return relationsResponseContainerExpertDeskMendixObject;
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
			final interfacerelations.proxies.RelationsResponseContainerExpertDesk that = (interfacerelations.proxies.RelationsResponseContainerExpertDesk) obj;
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
		return "InterfaceRelations.RelationsResponseContainerExpertDesk";
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
