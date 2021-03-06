// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public class CIRoom
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject cIRoomMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CustomLVNL.CIRoom";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RoomName("RoomName");

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

	public CIRoom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CustomLVNL.CIRoom"));
	}

	protected CIRoom(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cIRoomMendixObject)
	{
		if (cIRoomMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CustomLVNL.CIRoom", cIRoomMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CustomLVNL.CIRoom");

		this.cIRoomMendixObject = cIRoomMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CIRoom.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static customlvnl.proxies.CIRoom initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return customlvnl.proxies.CIRoom.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static customlvnl.proxies.CIRoom initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new customlvnl.proxies.CIRoom(context, mendixObject);
	}

	public static customlvnl.proxies.CIRoom load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return customlvnl.proxies.CIRoom.initialize(context, mendixObject);
	}

	public static java.util.List<customlvnl.proxies.CIRoom> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<customlvnl.proxies.CIRoom> result = new java.util.ArrayList<customlvnl.proxies.CIRoom>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CustomLVNL.CIRoom" + xpathConstraint))
			result.add(customlvnl.proxies.CIRoom.initialize(context, obj));
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
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return cIRoomMendixObject;
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
			final customlvnl.proxies.CIRoom that = (customlvnl.proxies.CIRoom) obj;
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
		return "CustomLVNL.CIRoom";
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
