// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class MigrationJobItem_Microflow extends sdemigration.proxies.MigrationJobItem
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.MigrationJobItem_Microflow";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UpdateObjects("UpdateObjects"),
		Description("Description"),
		Order("Order"),
		MigrationJobItemType("MigrationJobItemType"),
		MigrationJobItem_Microflow_Microflows("SDEMigration.MigrationJobItem_Microflow_Microflows"),
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

	public MigrationJobItem_Microflow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.MigrationJobItem_Microflow"));
	}

	protected MigrationJobItem_Microflow(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject migrationJobItem_MicroflowMendixObject)
	{
		super(context, migrationJobItem_MicroflowMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.MigrationJobItem_Microflow", migrationJobItem_MicroflowMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.MigrationJobItem_Microflow");
	}

	/**
	 * @deprecated Use 'MigrationJobItem_Microflow.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.MigrationJobItem_Microflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.MigrationJobItem_Microflow.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.MigrationJobItem_Microflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.MigrationJobItem_Microflow(context, mendixObject);
	}

	public static sdemigration.proxies.MigrationJobItem_Microflow load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.MigrationJobItem_Microflow.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.MigrationJobItem_Microflow> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.MigrationJobItem_Microflow> result = new java.util.ArrayList<sdemigration.proxies.MigrationJobItem_Microflow>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.MigrationJobItem_Microflow" + xpathConstraint))
			result.add(sdemigration.proxies.MigrationJobItem_Microflow.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of UpdateObjects
	 */
	public final java.lang.Boolean getUpdateObjects()
	{
		return getUpdateObjects(getContext());
	}

	/**
	 * @param context
	 * @return value of UpdateObjects
	 */
	public final java.lang.Boolean getUpdateObjects(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UpdateObjects.toString());
	}

	/**
	 * Set value of UpdateObjects
	 * @param updateobjects
	 */
	public final void setUpdateObjects(java.lang.Boolean updateobjects)
	{
		setUpdateObjects(getContext(), updateobjects);
	}

	/**
	 * Set value of UpdateObjects
	 * @param context
	 * @param updateobjects
	 */
	public final void setUpdateObjects(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean updateobjects)
	{
		getMendixObject().setValue(context, MemberNames.UpdateObjects.toString(), updateobjects);
	}

	/**
	 * @return value of MigrationJobItem_Microflow_Microflows
	 */
	public final mxmodelreflection.proxies.Microflows getMigrationJobItem_Microflow_Microflows() throws com.mendix.core.CoreException
	{
		return getMigrationJobItem_Microflow_Microflows(getContext());
	}

	/**
	 * @param context
	 * @return value of MigrationJobItem_Microflow_Microflows
	 */
	public final mxmodelreflection.proxies.Microflows getMigrationJobItem_Microflow_Microflows(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.Microflows result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MigrationJobItem_Microflow_Microflows.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.Microflows.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MigrationJobItem_Microflow_Microflows
	 * @param migrationjobitem_microflow_microflows
	 */
	public final void setMigrationJobItem_Microflow_Microflows(mxmodelreflection.proxies.Microflows migrationjobitem_microflow_microflows)
	{
		setMigrationJobItem_Microflow_Microflows(getContext(), migrationjobitem_microflow_microflows);
	}

	/**
	 * Set value of MigrationJobItem_Microflow_Microflows
	 * @param context
	 * @param migrationjobitem_microflow_microflows
	 */
	public final void setMigrationJobItem_Microflow_Microflows(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.Microflows migrationjobitem_microflow_microflows)
	{
		if (migrationjobitem_microflow_microflows == null)
			getMendixObject().setValue(context, MemberNames.MigrationJobItem_Microflow_Microflows.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MigrationJobItem_Microflow_Microflows.toString(), migrationjobitem_microflow_microflows.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sdemigration.proxies.MigrationJobItem_Microflow that = (sdemigration.proxies.MigrationJobItem_Microflow) obj;
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
		return "SDEMigration.MigrationJobItem_Microflow";
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