// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies;

public class MetricCollector
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject metricCollectorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "APMAgent.MetricCollector";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Description("Description"),
		Frequency("Frequency"),
		Enabled("Enabled"),
		StoreInDatabase("StoreInDatabase"),
		LastRun("LastRun"),
		MetricCollectorType("MetricCollectorType"),
		IsRunning("IsRunning"),
		QueryMultipleValues("QueryMultipleValues");

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

	public MetricCollector(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "APMAgent.MetricCollector"));
	}

	protected MetricCollector(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject metricCollectorMendixObject)
	{
		if (metricCollectorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("APMAgent.MetricCollector", metricCollectorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a APMAgent.MetricCollector");

		this.metricCollectorMendixObject = metricCollectorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MetricCollector.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static apmagent.proxies.MetricCollector initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return apmagent.proxies.MetricCollector.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static apmagent.proxies.MetricCollector initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("APMAgent.MetricCollectorJMX", mendixObject.getType()))
			return apmagent.proxies.MetricCollectorJMX.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("APMAgent.MetricCollectorQuery", mendixObject.getType()))
			return apmagent.proxies.MetricCollectorQuery.initialize(context, mendixObject);

		return new apmagent.proxies.MetricCollector(context, mendixObject);
	}

	public static apmagent.proxies.MetricCollector load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return apmagent.proxies.MetricCollector.initialize(context, mendixObject);
	}

	public static java.util.List<? extends apmagent.proxies.MetricCollector> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<apmagent.proxies.MetricCollector> result = new java.util.ArrayList<apmagent.proxies.MetricCollector>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//APMAgent.MetricCollector" + xpathConstraint))
			result.add(apmagent.proxies.MetricCollector.initialize(context, obj));
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
	 * @return value of Frequency
	 */
	public final java.lang.Integer getFrequency()
	{
		return getFrequency(getContext());
	}

	/**
	 * @param context
	 * @return value of Frequency
	 */
	public final java.lang.Integer getFrequency(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Frequency.toString());
	}

	/**
	 * Set value of Frequency
	 * @param frequency
	 */
	public final void setFrequency(java.lang.Integer frequency)
	{
		setFrequency(getContext(), frequency);
	}

	/**
	 * Set value of Frequency
	 * @param context
	 * @param frequency
	 */
	public final void setFrequency(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer frequency)
	{
		getMendixObject().setValue(context, MemberNames.Frequency.toString(), frequency);
	}

	/**
	 * @return value of Enabled
	 */
	public final java.lang.Boolean getEnabled()
	{
		return getEnabled(getContext());
	}

	/**
	 * @param context
	 * @return value of Enabled
	 */
	public final java.lang.Boolean getEnabled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Enabled.toString());
	}

	/**
	 * Set value of Enabled
	 * @param enabled
	 */
	public final void setEnabled(java.lang.Boolean enabled)
	{
		setEnabled(getContext(), enabled);
	}

	/**
	 * Set value of Enabled
	 * @param context
	 * @param enabled
	 */
	public final void setEnabled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean enabled)
	{
		getMendixObject().setValue(context, MemberNames.Enabled.toString(), enabled);
	}

	/**
	 * @return value of StoreInDatabase
	 */
	public final java.lang.Boolean getStoreInDatabase()
	{
		return getStoreInDatabase(getContext());
	}

	/**
	 * @param context
	 * @return value of StoreInDatabase
	 */
	public final java.lang.Boolean getStoreInDatabase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.StoreInDatabase.toString());
	}

	/**
	 * Set value of StoreInDatabase
	 * @param storeindatabase
	 */
	public final void setStoreInDatabase(java.lang.Boolean storeindatabase)
	{
		setStoreInDatabase(getContext(), storeindatabase);
	}

	/**
	 * Set value of StoreInDatabase
	 * @param context
	 * @param storeindatabase
	 */
	public final void setStoreInDatabase(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean storeindatabase)
	{
		getMendixObject().setValue(context, MemberNames.StoreInDatabase.toString(), storeindatabase);
	}

	/**
	 * @return value of LastRun
	 */
	public final java.util.Date getLastRun()
	{
		return getLastRun(getContext());
	}

	/**
	 * @param context
	 * @return value of LastRun
	 */
	public final java.util.Date getLastRun(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastRun.toString());
	}

	/**
	 * Set value of LastRun
	 * @param lastrun
	 */
	public final void setLastRun(java.util.Date lastrun)
	{
		setLastRun(getContext(), lastrun);
	}

	/**
	 * Set value of LastRun
	 * @param context
	 * @param lastrun
	 */
	public final void setLastRun(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastrun)
	{
		getMendixObject().setValue(context, MemberNames.LastRun.toString(), lastrun);
	}

	/**
	 * Set value of MetricCollectorType
	 * @param metriccollectortype
	 */
	public final apmagent.proxies.MetricCollectorTypeEnum getMetricCollectorType()
	{
		return getMetricCollectorType(getContext());
	}

	/**
	 * @param context
	 * @return value of MetricCollectorType
	 */
	public final apmagent.proxies.MetricCollectorTypeEnum getMetricCollectorType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.MetricCollectorType.toString());
		if (obj == null)
			return null;

		return apmagent.proxies.MetricCollectorTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of MetricCollectorType
	 * @param metriccollectortype
	 */
	public final void setMetricCollectorType(apmagent.proxies.MetricCollectorTypeEnum metriccollectortype)
	{
		setMetricCollectorType(getContext(), metriccollectortype);
	}

	/**
	 * Set value of MetricCollectorType
	 * @param context
	 * @param metriccollectortype
	 */
	public final void setMetricCollectorType(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.MetricCollectorTypeEnum metriccollectortype)
	{
		if (metriccollectortype != null)
			getMendixObject().setValue(context, MemberNames.MetricCollectorType.toString(), metriccollectortype.toString());
		else
			getMendixObject().setValue(context, MemberNames.MetricCollectorType.toString(), null);
	}

	/**
	 * @return value of IsRunning
	 */
	public final java.lang.Boolean getIsRunning()
	{
		return getIsRunning(getContext());
	}

	/**
	 * @param context
	 * @return value of IsRunning
	 */
	public final java.lang.Boolean getIsRunning(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsRunning.toString());
	}

	/**
	 * Set value of IsRunning
	 * @param isrunning
	 */
	public final void setIsRunning(java.lang.Boolean isrunning)
	{
		setIsRunning(getContext(), isrunning);
	}

	/**
	 * Set value of IsRunning
	 * @param context
	 * @param isrunning
	 */
	public final void setIsRunning(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isrunning)
	{
		getMendixObject().setValue(context, MemberNames.IsRunning.toString(), isrunning);
	}

	/**
	 * @return value of QueryMultipleValues
	 */
	public final java.lang.Boolean getQueryMultipleValues()
	{
		return getQueryMultipleValues(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryMultipleValues
	 */
	public final java.lang.Boolean getQueryMultipleValues(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.QueryMultipleValues.toString());
	}

	/**
	 * Set value of QueryMultipleValues
	 * @param querymultiplevalues
	 */
	public final void setQueryMultipleValues(java.lang.Boolean querymultiplevalues)
	{
		setQueryMultipleValues(getContext(), querymultiplevalues);
	}

	/**
	 * Set value of QueryMultipleValues
	 * @param context
	 * @param querymultiplevalues
	 */
	public final void setQueryMultipleValues(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean querymultiplevalues)
	{
		getMendixObject().setValue(context, MemberNames.QueryMultipleValues.toString(), querymultiplevalues);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return metricCollectorMendixObject;
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
			final apmagent.proxies.MetricCollector that = (apmagent.proxies.MetricCollector) obj;
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
		return "APMAgent.MetricCollector";
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
