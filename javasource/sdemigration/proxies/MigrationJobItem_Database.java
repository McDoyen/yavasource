// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class MigrationJobItem_Database extends sdemigration.proxies.MigrationJobItem
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.MigrationJobItem_Database";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ClearInbox("ClearInbox"),
		ImportAfterDate("ImportAfterDate"),
		Description("Description"),
		Order("Order"),
		MigrationJobItemType("MigrationJobItemType"),
		MigrationJobItem_Database_ImportCall("SDEMigration.MigrationJobItem_Database_ImportCall"),
		MigrationJobItem_MigrationJob("SDEMigration.MigrationJobItem_MigrationJob");

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

	public MigrationJobItem_Database(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.MigrationJobItem_Database"));
	}

	protected MigrationJobItem_Database(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject migrationJobItem_DatabaseMendixObject)
	{
		super(context, migrationJobItem_DatabaseMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.MigrationJobItem_Database", migrationJobItem_DatabaseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.MigrationJobItem_Database");
	}

	/**
	 * @deprecated Use 'MigrationJobItem_Database.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.MigrationJobItem_Database initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.MigrationJobItem_Database.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.MigrationJobItem_Database initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.MigrationJobItem_Database(context, mendixObject);
	}

	public static sdemigration.proxies.MigrationJobItem_Database load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.MigrationJobItem_Database.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.MigrationJobItem_Database> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.MigrationJobItem_Database> result = new java.util.ArrayList<sdemigration.proxies.MigrationJobItem_Database>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.MigrationJobItem_Database" + xpathConstraint))
			result.add(sdemigration.proxies.MigrationJobItem_Database.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ClearInbox
	 */
	public final java.lang.Boolean getClearInbox()
	{
		return getClearInbox(getContext());
	}

	/**
	 * @param context
	 * @return value of ClearInbox
	 */
	public final java.lang.Boolean getClearInbox(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ClearInbox.toString());
	}

	/**
	 * Set value of ClearInbox
	 * @param clearinbox
	 */
	public final void setClearInbox(java.lang.Boolean clearinbox)
	{
		setClearInbox(getContext(), clearinbox);
	}

	/**
	 * Set value of ClearInbox
	 * @param context
	 * @param clearinbox
	 */
	public final void setClearInbox(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean clearinbox)
	{
		getMendixObject().setValue(context, MemberNames.ClearInbox.toString(), clearinbox);
	}

	/**
	 * @return value of ImportAfterDate
	 */
	public final java.util.Date getImportAfterDate()
	{
		return getImportAfterDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ImportAfterDate
	 */
	public final java.util.Date getImportAfterDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ImportAfterDate.toString());
	}

	/**
	 * Set value of ImportAfterDate
	 * @param importafterdate
	 */
	public final void setImportAfterDate(java.util.Date importafterdate)
	{
		setImportAfterDate(getContext(), importafterdate);
	}

	/**
	 * Set value of ImportAfterDate
	 * @param context
	 * @param importafterdate
	 */
	public final void setImportAfterDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date importafterdate)
	{
		getMendixObject().setValue(context, MemberNames.ImportAfterDate.toString(), importafterdate);
	}

	/**
	 * @return value of MigrationJobItem_Database_ImportCall
	 */
	public final databasereplication.proxies.ImportCall getMigrationJobItem_Database_ImportCall() throws com.mendix.core.CoreException
	{
		return getMigrationJobItem_Database_ImportCall(getContext());
	}

	/**
	 * @param context
	 * @return value of MigrationJobItem_Database_ImportCall
	 */
	public final databasereplication.proxies.ImportCall getMigrationJobItem_Database_ImportCall(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.ImportCall result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MigrationJobItem_Database_ImportCall.toString());
		if (identifier != null)
			result = databasereplication.proxies.ImportCall.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MigrationJobItem_Database_ImportCall
	 * @param migrationjobitem_database_importcall
	 */
	public final void setMigrationJobItem_Database_ImportCall(databasereplication.proxies.ImportCall migrationjobitem_database_importcall)
	{
		setMigrationJobItem_Database_ImportCall(getContext(), migrationjobitem_database_importcall);
	}

	/**
	 * Set value of MigrationJobItem_Database_ImportCall
	 * @param context
	 * @param migrationjobitem_database_importcall
	 */
	public final void setMigrationJobItem_Database_ImportCall(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.ImportCall migrationjobitem_database_importcall)
	{
		if (migrationjobitem_database_importcall == null)
			getMendixObject().setValue(context, MemberNames.MigrationJobItem_Database_ImportCall.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MigrationJobItem_Database_ImportCall.toString(), migrationjobitem_database_importcall.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sdemigration.proxies.MigrationJobItem_Database that = (sdemigration.proxies.MigrationJobItem_Database) obj;
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
		return "SDEMigration.MigrationJobItem_Database";
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
