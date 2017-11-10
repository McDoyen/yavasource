// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerequests.proxies;

public class LocationContainerExpertDesk
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject locationContainerExpertDeskMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRequests.LocationContainerExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Location_LocationContainerExpertDesk("InterfaceRequests.Location_LocationContainerExpertDesk"),
		LocationContainerExpertDesk_OutgoingRequestExpertDesk("InterfaceRequests.LocationContainerExpertDesk_OutgoingRequestExpertDesk");

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

	public LocationContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRequests.LocationContainerExpertDesk"));
	}

	protected LocationContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject locationContainerExpertDeskMendixObject)
	{
		if (locationContainerExpertDeskMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRequests.LocationContainerExpertDesk", locationContainerExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRequests.LocationContainerExpertDesk");

		this.locationContainerExpertDeskMendixObject = locationContainerExpertDeskMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LocationContainerExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerequests.proxies.LocationContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerequests.proxies.LocationContainerExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerequests.proxies.LocationContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerequests.proxies.LocationContainerExpertDesk(context, mendixObject);
	}

	public static interfacerequests.proxies.LocationContainerExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerequests.proxies.LocationContainerExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerequests.proxies.LocationContainerExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerequests.proxies.LocationContainerExpertDesk> result = new java.util.ArrayList<interfacerequests.proxies.LocationContainerExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRequests.LocationContainerExpertDesk" + xpathConstraint))
			result.add(interfacerequests.proxies.LocationContainerExpertDesk.initialize(context, obj));
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
	 * @return value of Location_LocationContainerExpertDesk
	 */
	public final interfacerequests.proxies.Location getLocation_LocationContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getLocation_LocationContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of Location_LocationContainerExpertDesk
	 */
	public final interfacerequests.proxies.Location getLocation_LocationContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.Location result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Location_LocationContainerExpertDesk.toString());
		if (identifier != null)
			result = interfacerequests.proxies.Location.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Location_LocationContainerExpertDesk
	 * @param location_locationcontainerexpertdesk
	 */
	public final void setLocation_LocationContainerExpertDesk(interfacerequests.proxies.Location location_locationcontainerexpertdesk)
	{
		setLocation_LocationContainerExpertDesk(getContext(), location_locationcontainerexpertdesk);
	}

	/**
	 * Set value of Location_LocationContainerExpertDesk
	 * @param context
	 * @param location_locationcontainerexpertdesk
	 */
	public final void setLocation_LocationContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.Location location_locationcontainerexpertdesk)
	{
		if (location_locationcontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.Location_LocationContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Location_LocationContainerExpertDesk.toString(), location_locationcontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of LocationContainerExpertDesk_OutgoingRequestExpertDesk
	 */
	public final interfacerequests.proxies.OutgoingRequestExpertDesk getLocationContainerExpertDesk_OutgoingRequestExpertDesk() throws com.mendix.core.CoreException
	{
		return getLocationContainerExpertDesk_OutgoingRequestExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of LocationContainerExpertDesk_OutgoingRequestExpertDesk
	 */
	public final interfacerequests.proxies.OutgoingRequestExpertDesk getLocationContainerExpertDesk_OutgoingRequestExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.OutgoingRequestExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LocationContainerExpertDesk_OutgoingRequestExpertDesk.toString());
		if (identifier != null)
			result = interfacerequests.proxies.OutgoingRequestExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LocationContainerExpertDesk_OutgoingRequestExpertDesk
	 * @param locationcontainerexpertdesk_outgoingrequestexpertdesk
	 */
	public final void setLocationContainerExpertDesk_OutgoingRequestExpertDesk(interfacerequests.proxies.OutgoingRequestExpertDesk locationcontainerexpertdesk_outgoingrequestexpertdesk)
	{
		setLocationContainerExpertDesk_OutgoingRequestExpertDesk(getContext(), locationcontainerexpertdesk_outgoingrequestexpertdesk);
	}

	/**
	 * Set value of LocationContainerExpertDesk_OutgoingRequestExpertDesk
	 * @param context
	 * @param locationcontainerexpertdesk_outgoingrequestexpertdesk
	 */
	public final void setLocationContainerExpertDesk_OutgoingRequestExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.OutgoingRequestExpertDesk locationcontainerexpertdesk_outgoingrequestexpertdesk)
	{
		if (locationcontainerexpertdesk_outgoingrequestexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.LocationContainerExpertDesk_OutgoingRequestExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LocationContainerExpertDesk_OutgoingRequestExpertDesk.toString(), locationcontainerexpertdesk_outgoingrequestexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return locationContainerExpertDeskMendixObject;
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
			final interfacerequests.proxies.LocationContainerExpertDesk that = (interfacerequests.proxies.LocationContainerExpertDesk) obj;
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
		return "InterfaceRequests.LocationContainerExpertDesk";
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