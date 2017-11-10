// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies;

public class Metric
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject metricMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "APMAgent.Metric";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Description("Description"),
		Column("Column"),
		TimeStamp("TimeStamp"),
		ValueString("ValueString"),
		ValueLong("ValueLong"),
		ValueFloat("ValueFloat"),
		ValueType("ValueType"),
		ValueBoolean("ValueBoolean"),
		ValueDate("ValueDate"),
		Metric_MetricCollectorItem("APMAgent.Metric_MetricCollectorItem");

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

	public Metric(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "APMAgent.Metric"));
	}

	protected Metric(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject metricMendixObject)
	{
		if (metricMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("APMAgent.Metric", metricMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a APMAgent.Metric");

		this.metricMendixObject = metricMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Metric.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static apmagent.proxies.Metric initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return apmagent.proxies.Metric.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static apmagent.proxies.Metric initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new apmagent.proxies.Metric(context, mendixObject);
	}

	public static apmagent.proxies.Metric load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return apmagent.proxies.Metric.initialize(context, mendixObject);
	}

	public static java.util.List<apmagent.proxies.Metric> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<apmagent.proxies.Metric> result = new java.util.ArrayList<apmagent.proxies.Metric>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//APMAgent.Metric" + xpathConstraint))
			result.add(apmagent.proxies.Metric.initialize(context, obj));
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
	 * @return value of Column
	 */
	public final java.lang.String getColumn()
	{
		return getColumn(getContext());
	}

	/**
	 * @param context
	 * @return value of Column
	 */
	public final java.lang.String getColumn(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Column.toString());
	}

	/**
	 * Set value of Column
	 * @param column
	 */
	public final void setColumn(java.lang.String column)
	{
		setColumn(getContext(), column);
	}

	/**
	 * Set value of Column
	 * @param context
	 * @param column
	 */
	public final void setColumn(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String column)
	{
		getMendixObject().setValue(context, MemberNames.Column.toString(), column);
	}

	/**
	 * @return value of TimeStamp
	 */
	public final java.util.Date getTimeStamp()
	{
		return getTimeStamp(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeStamp
	 */
	public final java.util.Date getTimeStamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.TimeStamp.toString());
	}

	/**
	 * Set value of TimeStamp
	 * @param timestamp
	 */
	public final void setTimeStamp(java.util.Date timestamp)
	{
		setTimeStamp(getContext(), timestamp);
	}

	/**
	 * Set value of TimeStamp
	 * @param context
	 * @param timestamp
	 */
	public final void setTimeStamp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timestamp)
	{
		getMendixObject().setValue(context, MemberNames.TimeStamp.toString(), timestamp);
	}

	/**
	 * @return value of ValueString
	 */
	public final java.lang.String getValueString()
	{
		return getValueString(getContext());
	}

	/**
	 * @param context
	 * @return value of ValueString
	 */
	public final java.lang.String getValueString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ValueString.toString());
	}

	/**
	 * Set value of ValueString
	 * @param valuestring
	 */
	public final void setValueString(java.lang.String valuestring)
	{
		setValueString(getContext(), valuestring);
	}

	/**
	 * Set value of ValueString
	 * @param context
	 * @param valuestring
	 */
	public final void setValueString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String valuestring)
	{
		getMendixObject().setValue(context, MemberNames.ValueString.toString(), valuestring);
	}

	/**
	 * @return value of ValueLong
	 */
	public final java.lang.Long getValueLong()
	{
		return getValueLong(getContext());
	}

	/**
	 * @param context
	 * @return value of ValueLong
	 */
	public final java.lang.Long getValueLong(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ValueLong.toString());
	}

	/**
	 * Set value of ValueLong
	 * @param valuelong
	 */
	public final void setValueLong(java.lang.Long valuelong)
	{
		setValueLong(getContext(), valuelong);
	}

	/**
	 * Set value of ValueLong
	 * @param context
	 * @param valuelong
	 */
	public final void setValueLong(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long valuelong)
	{
		getMendixObject().setValue(context, MemberNames.ValueLong.toString(), valuelong);
	}

	/**
	 * @return value of ValueFloat
	 */
	public final java.lang.Double getValueFloat()
	{
		return getValueFloat(getContext());
	}

	/**
	 * @param context
	 * @return value of ValueFloat
	 */
	public final java.lang.Double getValueFloat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.ValueFloat.toString());
	}

	/**
	 * Set value of ValueFloat
	 * @param valuefloat
	 */
	public final void setValueFloat(java.lang.Double valuefloat)
	{
		setValueFloat(getContext(), valuefloat);
	}

	/**
	 * Set value of ValueFloat
	 * @param context
	 * @param valuefloat
	 */
	public final void setValueFloat(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double valuefloat)
	{
		getMendixObject().setValue(context, MemberNames.ValueFloat.toString(), valuefloat);
	}

	/**
	 * Set value of ValueType
	 * @param valuetype
	 */
	public final apmagent.proxies.MetricTypeEnum getValueType()
	{
		return getValueType(getContext());
	}

	/**
	 * @param context
	 * @return value of ValueType
	 */
	public final apmagent.proxies.MetricTypeEnum getValueType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ValueType.toString());
		if (obj == null)
			return null;

		return apmagent.proxies.MetricTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ValueType
	 * @param valuetype
	 */
	public final void setValueType(apmagent.proxies.MetricTypeEnum valuetype)
	{
		setValueType(getContext(), valuetype);
	}

	/**
	 * Set value of ValueType
	 * @param context
	 * @param valuetype
	 */
	public final void setValueType(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.MetricTypeEnum valuetype)
	{
		if (valuetype != null)
			getMendixObject().setValue(context, MemberNames.ValueType.toString(), valuetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ValueType.toString(), null);
	}

	/**
	 * @return value of ValueBoolean
	 */
	public final java.lang.Boolean getValueBoolean()
	{
		return getValueBoolean(getContext());
	}

	/**
	 * @param context
	 * @return value of ValueBoolean
	 */
	public final java.lang.Boolean getValueBoolean(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ValueBoolean.toString());
	}

	/**
	 * Set value of ValueBoolean
	 * @param valueboolean
	 */
	public final void setValueBoolean(java.lang.Boolean valueboolean)
	{
		setValueBoolean(getContext(), valueboolean);
	}

	/**
	 * Set value of ValueBoolean
	 * @param context
	 * @param valueboolean
	 */
	public final void setValueBoolean(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean valueboolean)
	{
		getMendixObject().setValue(context, MemberNames.ValueBoolean.toString(), valueboolean);
	}

	/**
	 * @return value of ValueDate
	 */
	public final java.util.Date getValueDate()
	{
		return getValueDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ValueDate
	 */
	public final java.util.Date getValueDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ValueDate.toString());
	}

	/**
	 * Set value of ValueDate
	 * @param valuedate
	 */
	public final void setValueDate(java.util.Date valuedate)
	{
		setValueDate(getContext(), valuedate);
	}

	/**
	 * Set value of ValueDate
	 * @param context
	 * @param valuedate
	 */
	public final void setValueDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date valuedate)
	{
		getMendixObject().setValue(context, MemberNames.ValueDate.toString(), valuedate);
	}

	/**
	 * @return value of Metric_MetricCollectorItem
	 */
	public final apmagent.proxies.MetricCollectorItem getMetric_MetricCollectorItem() throws com.mendix.core.CoreException
	{
		return getMetric_MetricCollectorItem(getContext());
	}

	/**
	 * @param context
	 * @return value of Metric_MetricCollectorItem
	 */
	public final apmagent.proxies.MetricCollectorItem getMetric_MetricCollectorItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		apmagent.proxies.MetricCollectorItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Metric_MetricCollectorItem.toString());
		if (identifier != null)
			result = apmagent.proxies.MetricCollectorItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Metric_MetricCollectorItem
	 * @param metric_metriccollectoritem
	 */
	public final void setMetric_MetricCollectorItem(apmagent.proxies.MetricCollectorItem metric_metriccollectoritem)
	{
		setMetric_MetricCollectorItem(getContext(), metric_metriccollectoritem);
	}

	/**
	 * Set value of Metric_MetricCollectorItem
	 * @param context
	 * @param metric_metriccollectoritem
	 */
	public final void setMetric_MetricCollectorItem(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.MetricCollectorItem metric_metriccollectoritem)
	{
		if (metric_metriccollectoritem == null)
			getMendixObject().setValue(context, MemberNames.Metric_MetricCollectorItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Metric_MetricCollectorItem.toString(), metric_metriccollectoritem.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return metricMendixObject;
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
			final apmagent.proxies.Metric that = (apmagent.proxies.Metric) obj;
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
		return "APMAgent.Metric";
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
