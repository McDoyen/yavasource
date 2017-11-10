// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fusionchartsplus.proxies;

public class ChartConfiguration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject chartConfigurationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FusionChartsPlus.ChartConfiguration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Startdate("Startdate"),
		Period("Period"),
		ChartConfiguration_KPIConfiguration("FusionChartsPlus.ChartConfiguration_KPIConfiguration");

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

	public ChartConfiguration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FusionChartsPlus.ChartConfiguration"));
	}

	protected ChartConfiguration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject chartConfigurationMendixObject)
	{
		if (chartConfigurationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FusionChartsPlus.ChartConfiguration", chartConfigurationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FusionChartsPlus.ChartConfiguration");

		this.chartConfigurationMendixObject = chartConfigurationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ChartConfiguration.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static fusionchartsplus.proxies.ChartConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fusionchartsplus.proxies.ChartConfiguration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fusionchartsplus.proxies.ChartConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fusionchartsplus.proxies.ChartConfiguration(context, mendixObject);
	}

	public static fusionchartsplus.proxies.ChartConfiguration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fusionchartsplus.proxies.ChartConfiguration.initialize(context, mendixObject);
	}

	public static java.util.List<fusionchartsplus.proxies.ChartConfiguration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.ChartConfiguration> result = new java.util.ArrayList<fusionchartsplus.proxies.ChartConfiguration>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FusionChartsPlus.ChartConfiguration" + xpathConstraint))
			result.add(fusionchartsplus.proxies.ChartConfiguration.initialize(context, obj));
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
	 * @return value of Startdate
	 */
	public final java.util.Date getStartdate()
	{
		return getStartdate(getContext());
	}

	/**
	 * @param context
	 * @return value of Startdate
	 */
	public final java.util.Date getStartdate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Startdate.toString());
	}

	/**
	 * Set value of Startdate
	 * @param startdate
	 */
	public final void setStartdate(java.util.Date startdate)
	{
		setStartdate(getContext(), startdate);
	}

	/**
	 * Set value of Startdate
	 * @param context
	 * @param startdate
	 */
	public final void setStartdate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.Startdate.toString(), startdate);
	}

	/**
	 * Set value of Period
	 * @param period
	 */
	public final fusionchartsplus.proxies.Period getPeriod()
	{
		return getPeriod(getContext());
	}

	/**
	 * @param context
	 * @return value of Period
	 */
	public final fusionchartsplus.proxies.Period getPeriod(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Period.toString());
		if (obj == null)
			return null;

		return fusionchartsplus.proxies.Period.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Period
	 * @param period
	 */
	public final void setPeriod(fusionchartsplus.proxies.Period period)
	{
		setPeriod(getContext(), period);
	}

	/**
	 * Set value of Period
	 * @param context
	 * @param period
	 */
	public final void setPeriod(com.mendix.systemwideinterfaces.core.IContext context, fusionchartsplus.proxies.Period period)
	{
		if (period != null)
			getMendixObject().setValue(context, MemberNames.Period.toString(), period.toString());
		else
			getMendixObject().setValue(context, MemberNames.Period.toString(), null);
	}

	/**
	 * @return value of ChartConfiguration_KPIConfiguration
	 */
	public final process.proxies.KPIConfiguration getChartConfiguration_KPIConfiguration() throws com.mendix.core.CoreException
	{
		return getChartConfiguration_KPIConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of ChartConfiguration_KPIConfiguration
	 */
	public final process.proxies.KPIConfiguration getChartConfiguration_KPIConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.KPIConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ChartConfiguration_KPIConfiguration.toString());
		if (identifier != null)
			result = process.proxies.KPIConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ChartConfiguration_KPIConfiguration
	 * @param chartconfiguration_kpiconfiguration
	 */
	public final void setChartConfiguration_KPIConfiguration(process.proxies.KPIConfiguration chartconfiguration_kpiconfiguration)
	{
		setChartConfiguration_KPIConfiguration(getContext(), chartconfiguration_kpiconfiguration);
	}

	/**
	 * Set value of ChartConfiguration_KPIConfiguration
	 * @param context
	 * @param chartconfiguration_kpiconfiguration
	 */
	public final void setChartConfiguration_KPIConfiguration(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.KPIConfiguration chartconfiguration_kpiconfiguration)
	{
		if (chartconfiguration_kpiconfiguration == null)
			getMendixObject().setValue(context, MemberNames.ChartConfiguration_KPIConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ChartConfiguration_KPIConfiguration.toString(), chartconfiguration_kpiconfiguration.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return chartConfigurationMendixObject;
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
			final fusionchartsplus.proxies.ChartConfiguration that = (fusionchartsplus.proxies.ChartConfiguration) obj;
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
		return "FusionChartsPlus.ChartConfiguration";
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