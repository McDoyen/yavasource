// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class MigrationRun
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject migrationRunMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.MigrationRun";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DateStart("DateStart"),
		DateEnd("DateEnd"),
		MigrationRun_MigrationJob("SDEMigration.MigrationRun_MigrationJob");

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

	public MigrationRun(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.MigrationRun"));
	}

	protected MigrationRun(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject migrationRunMendixObject)
	{
		if (migrationRunMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.MigrationRun", migrationRunMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.MigrationRun");

		this.migrationRunMendixObject = migrationRunMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MigrationRun.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.MigrationRun initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.MigrationRun.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.MigrationRun initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.MigrationRun(context, mendixObject);
	}

	public static sdemigration.proxies.MigrationRun load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.MigrationRun.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.MigrationRun> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.MigrationRun> result = new java.util.ArrayList<sdemigration.proxies.MigrationRun>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.MigrationRun" + xpathConstraint))
			result.add(sdemigration.proxies.MigrationRun.initialize(context, obj));
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
	 * @return value of DateStart
	 */
	public final java.util.Date getDateStart()
	{
		return getDateStart(getContext());
	}

	/**
	 * @param context
	 * @return value of DateStart
	 */
	public final java.util.Date getDateStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateStart.toString());
	}

	/**
	 * Set value of DateStart
	 * @param datestart
	 */
	public final void setDateStart(java.util.Date datestart)
	{
		setDateStart(getContext(), datestart);
	}

	/**
	 * Set value of DateStart
	 * @param context
	 * @param datestart
	 */
	public final void setDateStart(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date datestart)
	{
		getMendixObject().setValue(context, MemberNames.DateStart.toString(), datestart);
	}

	/**
	 * @return value of DateEnd
	 */
	public final java.util.Date getDateEnd()
	{
		return getDateEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of DateEnd
	 */
	public final java.util.Date getDateEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateEnd.toString());
	}

	/**
	 * Set value of DateEnd
	 * @param dateend
	 */
	public final void setDateEnd(java.util.Date dateend)
	{
		setDateEnd(getContext(), dateend);
	}

	/**
	 * Set value of DateEnd
	 * @param context
	 * @param dateend
	 */
	public final void setDateEnd(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateend)
	{
		getMendixObject().setValue(context, MemberNames.DateEnd.toString(), dateend);
	}

	/**
	 * @return value of MigrationRun_MigrationJob
	 */
	public final sdemigration.proxies.MigrationJob getMigrationRun_MigrationJob() throws com.mendix.core.CoreException
	{
		return getMigrationRun_MigrationJob(getContext());
	}

	/**
	 * @param context
	 * @return value of MigrationRun_MigrationJob
	 */
	public final sdemigration.proxies.MigrationJob getMigrationRun_MigrationJob(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sdemigration.proxies.MigrationJob result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MigrationRun_MigrationJob.toString());
		if (identifier != null)
			result = sdemigration.proxies.MigrationJob.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MigrationRun_MigrationJob
	 * @param migrationrun_migrationjob
	 */
	public final void setMigrationRun_MigrationJob(sdemigration.proxies.MigrationJob migrationrun_migrationjob)
	{
		setMigrationRun_MigrationJob(getContext(), migrationrun_migrationjob);
	}

	/**
	 * Set value of MigrationRun_MigrationJob
	 * @param context
	 * @param migrationrun_migrationjob
	 */
	public final void setMigrationRun_MigrationJob(com.mendix.systemwideinterfaces.core.IContext context, sdemigration.proxies.MigrationJob migrationrun_migrationjob)
	{
		if (migrationrun_migrationjob == null)
			getMendixObject().setValue(context, MemberNames.MigrationRun_MigrationJob.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MigrationRun_MigrationJob.toString(), migrationrun_migrationjob.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return migrationRunMendixObject;
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
			final sdemigration.proxies.MigrationRun that = (sdemigration.proxies.MigrationRun) obj;
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
		return "SDEMigration.MigrationRun";
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