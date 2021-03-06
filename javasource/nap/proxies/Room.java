// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nap.proxies;

public class Room
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject roomMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NAP.Room";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RoomName("RoomName"),
		FloorName("FloorName"),
		InterfaceGUID("InterfaceGUID"),
		Room_Location("NAP.Room_Location");

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

	public Room(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "NAP.Room"));
	}

	protected Room(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject roomMendixObject)
	{
		if (roomMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("NAP.Room", roomMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a NAP.Room");

		this.roomMendixObject = roomMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Room.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static nap.proxies.Room initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nap.proxies.Room.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static nap.proxies.Room initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nap.proxies.Room(context, mendixObject);
	}

	public static nap.proxies.Room load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nap.proxies.Room.initialize(context, mendixObject);
	}

	public static java.util.List<nap.proxies.Room> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<nap.proxies.Room> result = new java.util.ArrayList<nap.proxies.Room>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//NAP.Room" + xpathConstraint))
			result.add(nap.proxies.Room.initialize(context, obj));
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
	 * @return value of RoomName
	 */
	public final java.lang.String getRoomName()
	{
		return getRoomName(getContext());
	}

	/**
	 * @param context
	 * @return value of RoomName
	 */
	public final java.lang.String getRoomName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RoomName.toString());
	}

	/**
	 * Set value of RoomName
	 * @param roomname
	 */
	public final void setRoomName(java.lang.String roomname)
	{
		setRoomName(getContext(), roomname);
	}

	/**
	 * Set value of RoomName
	 * @param context
	 * @param roomname
	 */
	public final void setRoomName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String roomname)
	{
		getMendixObject().setValue(context, MemberNames.RoomName.toString(), roomname);
	}

	/**
	 * @return value of FloorName
	 */
	public final java.lang.String getFloorName()
	{
		return getFloorName(getContext());
	}

	/**
	 * @param context
	 * @return value of FloorName
	 */
	public final java.lang.String getFloorName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FloorName.toString());
	}

	/**
	 * Set value of FloorName
	 * @param floorname
	 */
	public final void setFloorName(java.lang.String floorname)
	{
		setFloorName(getContext(), floorname);
	}

	/**
	 * Set value of FloorName
	 * @param context
	 * @param floorname
	 */
	public final void setFloorName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String floorname)
	{
		getMendixObject().setValue(context, MemberNames.FloorName.toString(), floorname);
	}

	/**
	 * @return value of InterfaceGUID
	 */
	public final java.lang.String getInterfaceGUID()
	{
		return getInterfaceGUID(getContext());
	}

	/**
	 * @param context
	 * @return value of InterfaceGUID
	 */
	public final java.lang.String getInterfaceGUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InterfaceGUID.toString());
	}

	/**
	 * Set value of InterfaceGUID
	 * @param interfaceguid
	 */
	public final void setInterfaceGUID(java.lang.String interfaceguid)
	{
		setInterfaceGUID(getContext(), interfaceguid);
	}

	/**
	 * Set value of InterfaceGUID
	 * @param context
	 * @param interfaceguid
	 */
	public final void setInterfaceGUID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String interfaceguid)
	{
		getMendixObject().setValue(context, MemberNames.InterfaceGUID.toString(), interfaceguid);
	}

	/**
	 * @return value of Room_Location
	 */
	public final nap.proxies.Location getRoom_Location() throws com.mendix.core.CoreException
	{
		return getRoom_Location(getContext());
	}

	/**
	 * @param context
	 * @return value of Room_Location
	 */
	public final nap.proxies.Location getRoom_Location(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Location result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Room_Location.toString());
		if (identifier != null)
			result = nap.proxies.Location.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Room_Location
	 * @param room_location
	 */
	public final void setRoom_Location(nap.proxies.Location room_location)
	{
		setRoom_Location(getContext(), room_location);
	}

	/**
	 * Set value of Room_Location
	 * @param context
	 * @param room_location
	 */
	public final void setRoom_Location(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Location room_location)
	{
		if (room_location == null)
			getMendixObject().setValue(context, MemberNames.Room_Location.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Room_Location.toString(), room_location.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return roomMendixObject;
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
			final nap.proxies.Room that = (nap.proxies.Room) obj;
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
		return "NAP.Room";
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
