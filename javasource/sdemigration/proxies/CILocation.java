// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class CILocation extends sdemigration.proxies.SDEObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.CILocation";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		LocationID("LocationID"),
		Description("Description"),
		BuildingDescription("BuildingDescription"),
		RoomDescription("RoomDescription"),
		Note("Note"),
		Inactive("Inactive"),
		StockLocation("StockLocation"),
		processed("processed"),
		SDEObject_MigrationItemRun("SDEMigration.SDEObject_MigrationItemRun"),
		IncomingRequest_SDEObject("InterfaceRequests.IncomingRequest_SDEObject");

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

	public CILocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.CILocation"));
	}

	protected CILocation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cILocationMendixObject)
	{
		super(context, cILocationMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.CILocation", cILocationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.CILocation");
	}

	/**
	 * @deprecated Use 'CILocation.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.CILocation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.CILocation.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.CILocation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.CILocation(context, mendixObject);
	}

	public static sdemigration.proxies.CILocation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.CILocation.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.CILocation> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.CILocation> result = new java.util.ArrayList<sdemigration.proxies.CILocation>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.CILocation" + xpathConstraint))
			result.add(sdemigration.proxies.CILocation.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Sequence
	 */
	public final java.lang.String getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.String getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.String sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * @return value of LocationID
	 */
	public final java.lang.String getLocationID()
	{
		return getLocationID(getContext());
	}

	/**
	 * @param context
	 * @return value of LocationID
	 */
	public final java.lang.String getLocationID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LocationID.toString());
	}

	/**
	 * Set value of LocationID
	 * @param locationid
	 */
	public final void setLocationID(java.lang.String locationid)
	{
		setLocationID(getContext(), locationid);
	}

	/**
	 * Set value of LocationID
	 * @param context
	 * @param locationid
	 */
	public final void setLocationID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String locationid)
	{
		getMendixObject().setValue(context, MemberNames.LocationID.toString(), locationid);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of BuildingDescription
	 */
	public final java.lang.String getBuildingDescription()
	{
		return getBuildingDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of BuildingDescription
	 */
	public final java.lang.String getBuildingDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BuildingDescription.toString());
	}

	/**
	 * Set value of BuildingDescription
	 * @param buildingdescription
	 */
	public final void setBuildingDescription(java.lang.String buildingdescription)
	{
		setBuildingDescription(getContext(), buildingdescription);
	}

	/**
	 * Set value of BuildingDescription
	 * @param context
	 * @param buildingdescription
	 */
	public final void setBuildingDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String buildingdescription)
	{
		getMendixObject().setValue(context, MemberNames.BuildingDescription.toString(), buildingdescription);
	}

	/**
	 * @return value of RoomDescription
	 */
	public final java.lang.String getRoomDescription()
	{
		return getRoomDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of RoomDescription
	 */
	public final java.lang.String getRoomDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RoomDescription.toString());
	}

	/**
	 * Set value of RoomDescription
	 * @param roomdescription
	 */
	public final void setRoomDescription(java.lang.String roomdescription)
	{
		setRoomDescription(getContext(), roomdescription);
	}

	/**
	 * Set value of RoomDescription
	 * @param context
	 * @param roomdescription
	 */
	public final void setRoomDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String roomdescription)
	{
		getMendixObject().setValue(context, MemberNames.RoomDescription.toString(), roomdescription);
	}

	/**
	 * @return value of Note
	 */
	public final java.lang.String getNote()
	{
		return getNote(getContext());
	}

	/**
	 * @param context
	 * @return value of Note
	 */
	public final java.lang.String getNote(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Note.toString());
	}

	/**
	 * Set value of Note
	 * @param note
	 */
	public final void setNote(java.lang.String note)
	{
		setNote(getContext(), note);
	}

	/**
	 * Set value of Note
	 * @param context
	 * @param note
	 */
	public final void setNote(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String note)
	{
		getMendixObject().setValue(context, MemberNames.Note.toString(), note);
	}

	/**
	 * @return value of Inactive
	 */
	public final java.lang.Boolean getInactive()
	{
		return getInactive(getContext());
	}

	/**
	 * @param context
	 * @return value of Inactive
	 */
	public final java.lang.Boolean getInactive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Inactive.toString());
	}

	/**
	 * Set value of Inactive
	 * @param inactive
	 */
	public final void setInactive(java.lang.Boolean inactive)
	{
		setInactive(getContext(), inactive);
	}

	/**
	 * Set value of Inactive
	 * @param context
	 * @param inactive
	 */
	public final void setInactive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean inactive)
	{
		getMendixObject().setValue(context, MemberNames.Inactive.toString(), inactive);
	}

	/**
	 * @return value of StockLocation
	 */
	public final java.lang.String getStockLocation()
	{
		return getStockLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of StockLocation
	 */
	public final java.lang.String getStockLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StockLocation.toString());
	}

	/**
	 * Set value of StockLocation
	 * @param stocklocation
	 */
	public final void setStockLocation(java.lang.String stocklocation)
	{
		setStockLocation(getContext(), stocklocation);
	}

	/**
	 * Set value of StockLocation
	 * @param context
	 * @param stocklocation
	 */
	public final void setStockLocation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String stocklocation)
	{
		getMendixObject().setValue(context, MemberNames.StockLocation.toString(), stocklocation);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sdemigration.proxies.CILocation that = (sdemigration.proxies.CILocation) obj;
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
		return "SDEMigration.CILocation";
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
