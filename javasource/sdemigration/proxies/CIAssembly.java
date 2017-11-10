// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class CIAssembly extends sdemigration.proxies.SDEObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.CIAssembly";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		LocationID("LocationID"),
		LocationDescription("LocationDescription"),
		Room("Room"),
		Building("Building"),
		SystemID("SystemID"),
		Description("Description"),
		EnvironmentCode("EnvironmentCode"),
		EnvironmentDescription("EnvironmentDescription"),
		Version("Version"),
		CIAssemblyID("CIAssemblyID"),
		Note("Note"),
		Inactive("Inactive"),
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

	public CIAssembly(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.CIAssembly"));
	}

	protected CIAssembly(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cIAssemblyMendixObject)
	{
		super(context, cIAssemblyMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.CIAssembly", cIAssemblyMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.CIAssembly");
	}

	/**
	 * @deprecated Use 'CIAssembly.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.CIAssembly initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.CIAssembly.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.CIAssembly initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.CIAssembly(context, mendixObject);
	}

	public static sdemigration.proxies.CIAssembly load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.CIAssembly.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.CIAssembly> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.CIAssembly> result = new java.util.ArrayList<sdemigration.proxies.CIAssembly>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.CIAssembly" + xpathConstraint))
			result.add(sdemigration.proxies.CIAssembly.initialize(context, obj));
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
	 * @return value of LocationDescription
	 */
	public final java.lang.String getLocationDescription()
	{
		return getLocationDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of LocationDescription
	 */
	public final java.lang.String getLocationDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LocationDescription.toString());
	}

	/**
	 * Set value of LocationDescription
	 * @param locationdescription
	 */
	public final void setLocationDescription(java.lang.String locationdescription)
	{
		setLocationDescription(getContext(), locationdescription);
	}

	/**
	 * Set value of LocationDescription
	 * @param context
	 * @param locationdescription
	 */
	public final void setLocationDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String locationdescription)
	{
		getMendixObject().setValue(context, MemberNames.LocationDescription.toString(), locationdescription);
	}

	/**
	 * @return value of Room
	 */
	public final java.lang.String getRoom()
	{
		return getRoom(getContext());
	}

	/**
	 * @param context
	 * @return value of Room
	 */
	public final java.lang.String getRoom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Room.toString());
	}

	/**
	 * Set value of Room
	 * @param room
	 */
	public final void setRoom(java.lang.String room)
	{
		setRoom(getContext(), room);
	}

	/**
	 * Set value of Room
	 * @param context
	 * @param room
	 */
	public final void setRoom(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String room)
	{
		getMendixObject().setValue(context, MemberNames.Room.toString(), room);
	}

	/**
	 * @return value of Building
	 */
	public final java.lang.String getBuilding()
	{
		return getBuilding(getContext());
	}

	/**
	 * @param context
	 * @return value of Building
	 */
	public final java.lang.String getBuilding(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Building.toString());
	}

	/**
	 * Set value of Building
	 * @param building
	 */
	public final void setBuilding(java.lang.String building)
	{
		setBuilding(getContext(), building);
	}

	/**
	 * Set value of Building
	 * @param context
	 * @param building
	 */
	public final void setBuilding(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String building)
	{
		getMendixObject().setValue(context, MemberNames.Building.toString(), building);
	}

	/**
	 * @return value of SystemID
	 */
	public final java.lang.String getSystemID()
	{
		return getSystemID(getContext());
	}

	/**
	 * @param context
	 * @return value of SystemID
	 */
	public final java.lang.String getSystemID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SystemID.toString());
	}

	/**
	 * Set value of SystemID
	 * @param systemid
	 */
	public final void setSystemID(java.lang.String systemid)
	{
		setSystemID(getContext(), systemid);
	}

	/**
	 * Set value of SystemID
	 * @param context
	 * @param systemid
	 */
	public final void setSystemID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String systemid)
	{
		getMendixObject().setValue(context, MemberNames.SystemID.toString(), systemid);
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
	 * @return value of EnvironmentCode
	 */
	public final java.lang.String getEnvironmentCode()
	{
		return getEnvironmentCode(getContext());
	}

	/**
	 * @param context
	 * @return value of EnvironmentCode
	 */
	public final java.lang.String getEnvironmentCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EnvironmentCode.toString());
	}

	/**
	 * Set value of EnvironmentCode
	 * @param environmentcode
	 */
	public final void setEnvironmentCode(java.lang.String environmentcode)
	{
		setEnvironmentCode(getContext(), environmentcode);
	}

	/**
	 * Set value of EnvironmentCode
	 * @param context
	 * @param environmentcode
	 */
	public final void setEnvironmentCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String environmentcode)
	{
		getMendixObject().setValue(context, MemberNames.EnvironmentCode.toString(), environmentcode);
	}

	/**
	 * @return value of EnvironmentDescription
	 */
	public final java.lang.String getEnvironmentDescription()
	{
		return getEnvironmentDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of EnvironmentDescription
	 */
	public final java.lang.String getEnvironmentDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EnvironmentDescription.toString());
	}

	/**
	 * Set value of EnvironmentDescription
	 * @param environmentdescription
	 */
	public final void setEnvironmentDescription(java.lang.String environmentdescription)
	{
		setEnvironmentDescription(getContext(), environmentdescription);
	}

	/**
	 * Set value of EnvironmentDescription
	 * @param context
	 * @param environmentdescription
	 */
	public final void setEnvironmentDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String environmentdescription)
	{
		getMendixObject().setValue(context, MemberNames.EnvironmentDescription.toString(), environmentdescription);
	}

	/**
	 * @return value of Version
	 */
	public final java.lang.String getVersion()
	{
		return getVersion(getContext());
	}

	/**
	 * @param context
	 * @return value of Version
	 */
	public final java.lang.String getVersion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Version.toString());
	}

	/**
	 * Set value of Version
	 * @param version
	 */
	public final void setVersion(java.lang.String version)
	{
		setVersion(getContext(), version);
	}

	/**
	 * Set value of Version
	 * @param context
	 * @param version
	 */
	public final void setVersion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String version)
	{
		getMendixObject().setValue(context, MemberNames.Version.toString(), version);
	}

	/**
	 * @return value of CIAssemblyID
	 */
	public final java.lang.String getCIAssemblyID()
	{
		return getCIAssemblyID(getContext());
	}

	/**
	 * @param context
	 * @return value of CIAssemblyID
	 */
	public final java.lang.String getCIAssemblyID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CIAssemblyID.toString());
	}

	/**
	 * Set value of CIAssemblyID
	 * @param ciassemblyid
	 */
	public final void setCIAssemblyID(java.lang.String ciassemblyid)
	{
		setCIAssemblyID(getContext(), ciassemblyid);
	}

	/**
	 * Set value of CIAssemblyID
	 * @param context
	 * @param ciassemblyid
	 */
	public final void setCIAssemblyID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ciassemblyid)
	{
		getMendixObject().setValue(context, MemberNames.CIAssemblyID.toString(), ciassemblyid);
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

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sdemigration.proxies.CIAssembly that = (sdemigration.proxies.CIAssembly) obj;
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
		return "SDEMigration.CIAssembly";
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