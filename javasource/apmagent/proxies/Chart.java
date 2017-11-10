// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies;

public class Chart
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject chartMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "APMAgent.Chart";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		YMin("YMin"),
		YMax("YMax"),
		Chart_DataSet("APMAgent.Chart_DataSet"),
		Chart_MetricCollectorItem("APMAgent.Chart_MetricCollectorItem");

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

	public Chart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "APMAgent.Chart"));
	}

	protected Chart(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject chartMendixObject)
	{
		if (chartMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("APMAgent.Chart", chartMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a APMAgent.Chart");

		this.chartMendixObject = chartMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Chart.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static apmagent.proxies.Chart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return apmagent.proxies.Chart.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static apmagent.proxies.Chart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new apmagent.proxies.Chart(context, mendixObject);
	}

	public static apmagent.proxies.Chart load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return apmagent.proxies.Chart.initialize(context, mendixObject);
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
	 * @return value of YMin
	 */
	public final java.lang.Integer getYMin()
	{
		return getYMin(getContext());
	}

	/**
	 * @param context
	 * @return value of YMin
	 */
	public final java.lang.Integer getYMin(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.YMin.toString());
	}

	/**
	 * Set value of YMin
	 * @param ymin
	 */
	public final void setYMin(java.lang.Integer ymin)
	{
		setYMin(getContext(), ymin);
	}

	/**
	 * Set value of YMin
	 * @param context
	 * @param ymin
	 */
	public final void setYMin(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer ymin)
	{
		getMendixObject().setValue(context, MemberNames.YMin.toString(), ymin);
	}

	/**
	 * @return value of YMax
	 */
	public final java.lang.Integer getYMax()
	{
		return getYMax(getContext());
	}

	/**
	 * @param context
	 * @return value of YMax
	 */
	public final java.lang.Integer getYMax(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.YMax.toString());
	}

	/**
	 * Set value of YMax
	 * @param ymax
	 */
	public final void setYMax(java.lang.Integer ymax)
	{
		setYMax(getContext(), ymax);
	}

	/**
	 * Set value of YMax
	 * @param context
	 * @param ymax
	 */
	public final void setYMax(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer ymax)
	{
		getMendixObject().setValue(context, MemberNames.YMax.toString(), ymax);
	}

	/**
	 * @return value of Chart_DataSet
	 */
	public final java.util.List<apmagent.proxies.DataSet> getChart_DataSet() throws com.mendix.core.CoreException
	{
		return getChart_DataSet(getContext());
	}

	/**
	 * @param context
	 * @return value of Chart_DataSet
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<apmagent.proxies.DataSet> getChart_DataSet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<apmagent.proxies.DataSet> result = new java.util.ArrayList<apmagent.proxies.DataSet>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Chart_DataSet.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(apmagent.proxies.DataSet.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Chart_DataSet
	 * @param chart_dataset
	 */
	public final void setChart_DataSet(java.util.List<apmagent.proxies.DataSet> chart_dataset)
	{
		setChart_DataSet(getContext(), chart_dataset);
	}

	/**
	 * Set value of Chart_DataSet
	 * @param context
	 * @param chart_dataset
	 */
	public final void setChart_DataSet(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<apmagent.proxies.DataSet> chart_dataset)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (apmagent.proxies.DataSet proxyObject : chart_dataset)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Chart_DataSet.toString(), identifiers);
	}

	/**
	 * @return value of Chart_MetricCollectorItem
	 */
	public final apmagent.proxies.MetricCollectorItem getChart_MetricCollectorItem() throws com.mendix.core.CoreException
	{
		return getChart_MetricCollectorItem(getContext());
	}

	/**
	 * @param context
	 * @return value of Chart_MetricCollectorItem
	 */
	public final apmagent.proxies.MetricCollectorItem getChart_MetricCollectorItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		apmagent.proxies.MetricCollectorItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Chart_MetricCollectorItem.toString());
		if (identifier != null)
			result = apmagent.proxies.MetricCollectorItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Chart_MetricCollectorItem
	 * @param chart_metriccollectoritem
	 */
	public final void setChart_MetricCollectorItem(apmagent.proxies.MetricCollectorItem chart_metriccollectoritem)
	{
		setChart_MetricCollectorItem(getContext(), chart_metriccollectoritem);
	}

	/**
	 * Set value of Chart_MetricCollectorItem
	 * @param context
	 * @param chart_metriccollectoritem
	 */
	public final void setChart_MetricCollectorItem(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.MetricCollectorItem chart_metriccollectoritem)
	{
		if (chart_metriccollectoritem == null)
			getMendixObject().setValue(context, MemberNames.Chart_MetricCollectorItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Chart_MetricCollectorItem.toString(), chart_metriccollectoritem.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return chartMendixObject;
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
			final apmagent.proxies.Chart that = (apmagent.proxies.Chart) obj;
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
		return "APMAgent.Chart";
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