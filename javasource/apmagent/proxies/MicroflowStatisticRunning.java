// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies;

public class MicroflowStatisticRunning
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject microflowStatisticRunningMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "APMAgent.MicroflowStatisticRunning";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		MeasurementStart("MeasurementStart"),
		MeasurementEnd("MeasurementEnd"),
		Count("Count"),
		MinDuration("MinDuration"),
		MaxDuration("MaxDuration"),
		TotalDuration("TotalDuration"),
		AvgDuration("AvgDuration"),
		hostname("hostname"),
		PerformanceType("PerformanceType"),
		LastExecutionTime("LastExecutionTime"),
		IsSnapshot("IsSnapshot"),
		MicroflowStatisticRunning_User("APMAgent.MicroflowStatisticRunning_User");

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

	public MicroflowStatisticRunning(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "APMAgent.MicroflowStatisticRunning"));
	}

	protected MicroflowStatisticRunning(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject microflowStatisticRunningMendixObject)
	{
		if (microflowStatisticRunningMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("APMAgent.MicroflowStatisticRunning", microflowStatisticRunningMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a APMAgent.MicroflowStatisticRunning");

		this.microflowStatisticRunningMendixObject = microflowStatisticRunningMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MicroflowStatisticRunning.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static apmagent.proxies.MicroflowStatisticRunning initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return apmagent.proxies.MicroflowStatisticRunning.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static apmagent.proxies.MicroflowStatisticRunning initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new apmagent.proxies.MicroflowStatisticRunning(context, mendixObject);
	}

	public static apmagent.proxies.MicroflowStatisticRunning load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return apmagent.proxies.MicroflowStatisticRunning.initialize(context, mendixObject);
	}

	public static java.util.List<apmagent.proxies.MicroflowStatisticRunning> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<apmagent.proxies.MicroflowStatisticRunning> result = new java.util.ArrayList<apmagent.proxies.MicroflowStatisticRunning>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//APMAgent.MicroflowStatisticRunning" + xpathConstraint))
			result.add(apmagent.proxies.MicroflowStatisticRunning.initialize(context, obj));
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of MeasurementStart
	 */
	public final java.util.Date getMeasurementStart()
	{
		return getMeasurementStart(getContext());
	}

	/**
	 * @param context
	 * @return value of MeasurementStart
	 */
	public final java.util.Date getMeasurementStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.MeasurementStart.toString());
	}

	/**
	 * Set value of MeasurementStart
	 * @param measurementstart
	 */
	public final void setMeasurementStart(java.util.Date measurementstart)
	{
		setMeasurementStart(getContext(), measurementstart);
	}

	/**
	 * Set value of MeasurementStart
	 * @param context
	 * @param measurementstart
	 */
	public final void setMeasurementStart(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date measurementstart)
	{
		getMendixObject().setValue(context, MemberNames.MeasurementStart.toString(), measurementstart);
	}

	/**
	 * @return value of MeasurementEnd
	 */
	public final java.util.Date getMeasurementEnd()
	{
		return getMeasurementEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of MeasurementEnd
	 */
	public final java.util.Date getMeasurementEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.MeasurementEnd.toString());
	}

	/**
	 * Set value of MeasurementEnd
	 * @param measurementend
	 */
	public final void setMeasurementEnd(java.util.Date measurementend)
	{
		setMeasurementEnd(getContext(), measurementend);
	}

	/**
	 * Set value of MeasurementEnd
	 * @param context
	 * @param measurementend
	 */
	public final void setMeasurementEnd(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date measurementend)
	{
		getMendixObject().setValue(context, MemberNames.MeasurementEnd.toString(), measurementend);
	}

	/**
	 * @return value of Count
	 */
	public final java.lang.Long getCount()
	{
		return getCount(getContext());
	}

	/**
	 * @param context
	 * @return value of Count
	 */
	public final java.lang.Long getCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Count.toString());
	}

	/**
	 * Set value of Count
	 * @param count
	 */
	public final void setCount(java.lang.Long count)
	{
		setCount(getContext(), count);
	}

	/**
	 * Set value of Count
	 * @param context
	 * @param count
	 */
	public final void setCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long count)
	{
		getMendixObject().setValue(context, MemberNames.Count.toString(), count);
	}

	/**
	 * @return value of MinDuration
	 */
	public final java.lang.Long getMinDuration()
	{
		return getMinDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of MinDuration
	 */
	public final java.lang.Long getMinDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MinDuration.toString());
	}

	/**
	 * Set value of MinDuration
	 * @param minduration
	 */
	public final void setMinDuration(java.lang.Long minduration)
	{
		setMinDuration(getContext(), minduration);
	}

	/**
	 * Set value of MinDuration
	 * @param context
	 * @param minduration
	 */
	public final void setMinDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long minduration)
	{
		getMendixObject().setValue(context, MemberNames.MinDuration.toString(), minduration);
	}

	/**
	 * @return value of MaxDuration
	 */
	public final java.lang.Long getMaxDuration()
	{
		return getMaxDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxDuration
	 */
	public final java.lang.Long getMaxDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MaxDuration.toString());
	}

	/**
	 * Set value of MaxDuration
	 * @param maxduration
	 */
	public final void setMaxDuration(java.lang.Long maxduration)
	{
		setMaxDuration(getContext(), maxduration);
	}

	/**
	 * Set value of MaxDuration
	 * @param context
	 * @param maxduration
	 */
	public final void setMaxDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long maxduration)
	{
		getMendixObject().setValue(context, MemberNames.MaxDuration.toString(), maxduration);
	}

	/**
	 * @return value of TotalDuration
	 */
	public final java.lang.Long getTotalDuration()
	{
		return getTotalDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalDuration
	 */
	public final java.lang.Long getTotalDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.TotalDuration.toString());
	}

	/**
	 * Set value of TotalDuration
	 * @param totalduration
	 */
	public final void setTotalDuration(java.lang.Long totalduration)
	{
		setTotalDuration(getContext(), totalduration);
	}

	/**
	 * Set value of TotalDuration
	 * @param context
	 * @param totalduration
	 */
	public final void setTotalDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long totalduration)
	{
		getMendixObject().setValue(context, MemberNames.TotalDuration.toString(), totalduration);
	}

	/**
	 * @return value of AvgDuration
	 */
	public final java.lang.Long getAvgDuration()
	{
		return getAvgDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of AvgDuration
	 */
	public final java.lang.Long getAvgDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.AvgDuration.toString());
	}

	/**
	 * Set value of AvgDuration
	 * @param avgduration
	 */
	public final void setAvgDuration(java.lang.Long avgduration)
	{
		setAvgDuration(getContext(), avgduration);
	}

	/**
	 * Set value of AvgDuration
	 * @param context
	 * @param avgduration
	 */
	public final void setAvgDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long avgduration)
	{
		getMendixObject().setValue(context, MemberNames.AvgDuration.toString(), avgduration);
	}

	/**
	 * @return value of hostname
	 */
	public final java.lang.String gethostname()
	{
		return gethostname(getContext());
	}

	/**
	 * @param context
	 * @return value of hostname
	 */
	public final java.lang.String gethostname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.hostname.toString());
	}

	/**
	 * Set value of hostname
	 * @param hostname
	 */
	public final void sethostname(java.lang.String hostname)
	{
		sethostname(getContext(), hostname);
	}

	/**
	 * Set value of hostname
	 * @param context
	 * @param hostname
	 */
	public final void sethostname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hostname)
	{
		getMendixObject().setValue(context, MemberNames.hostname.toString(), hostname);
	}

	/**
	 * Set value of PerformanceType
	 * @param performancetype
	 */
	public final apmagent.proxies.PerformanceTypeEnum getPerformanceType()
	{
		return getPerformanceType(getContext());
	}

	/**
	 * @param context
	 * @return value of PerformanceType
	 */
	public final apmagent.proxies.PerformanceTypeEnum getPerformanceType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.PerformanceType.toString());
		if (obj == null)
			return null;

		return apmagent.proxies.PerformanceTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of PerformanceType
	 * @param performancetype
	 */
	public final void setPerformanceType(apmagent.proxies.PerformanceTypeEnum performancetype)
	{
		setPerformanceType(getContext(), performancetype);
	}

	/**
	 * Set value of PerformanceType
	 * @param context
	 * @param performancetype
	 */
	public final void setPerformanceType(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.PerformanceTypeEnum performancetype)
	{
		if (performancetype != null)
			getMendixObject().setValue(context, MemberNames.PerformanceType.toString(), performancetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.PerformanceType.toString(), null);
	}

	/**
	 * @return value of LastExecutionTime
	 */
	public final java.util.Date getLastExecutionTime()
	{
		return getLastExecutionTime(getContext());
	}

	/**
	 * @param context
	 * @return value of LastExecutionTime
	 */
	public final java.util.Date getLastExecutionTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastExecutionTime.toString());
	}

	/**
	 * Set value of LastExecutionTime
	 * @param lastexecutiontime
	 */
	public final void setLastExecutionTime(java.util.Date lastexecutiontime)
	{
		setLastExecutionTime(getContext(), lastexecutiontime);
	}

	/**
	 * Set value of LastExecutionTime
	 * @param context
	 * @param lastexecutiontime
	 */
	public final void setLastExecutionTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastexecutiontime)
	{
		getMendixObject().setValue(context, MemberNames.LastExecutionTime.toString(), lastexecutiontime);
	}

	/**
	 * @return value of IsSnapshot
	 */
	public final java.lang.Boolean getIsSnapshot()
	{
		return getIsSnapshot(getContext());
	}

	/**
	 * @param context
	 * @return value of IsSnapshot
	 */
	public final java.lang.Boolean getIsSnapshot(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsSnapshot.toString());
	}

	/**
	 * Set value of IsSnapshot
	 * @param issnapshot
	 */
	public final void setIsSnapshot(java.lang.Boolean issnapshot)
	{
		setIsSnapshot(getContext(), issnapshot);
	}

	/**
	 * Set value of IsSnapshot
	 * @param context
	 * @param issnapshot
	 */
	public final void setIsSnapshot(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean issnapshot)
	{
		getMendixObject().setValue(context, MemberNames.IsSnapshot.toString(), issnapshot);
	}

	/**
	 * @return value of MicroflowStatisticRunning_User
	 */
	public final system.proxies.User getMicroflowStatisticRunning_User() throws com.mendix.core.CoreException
	{
		return getMicroflowStatisticRunning_User(getContext());
	}

	/**
	 * @param context
	 * @return value of MicroflowStatisticRunning_User
	 */
	public final system.proxies.User getMicroflowStatisticRunning_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MicroflowStatisticRunning_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MicroflowStatisticRunning_User
	 * @param microflowstatisticrunning_user
	 */
	public final void setMicroflowStatisticRunning_User(system.proxies.User microflowstatisticrunning_user)
	{
		setMicroflowStatisticRunning_User(getContext(), microflowstatisticrunning_user);
	}

	/**
	 * Set value of MicroflowStatisticRunning_User
	 * @param context
	 * @param microflowstatisticrunning_user
	 */
	public final void setMicroflowStatisticRunning_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User microflowstatisticrunning_user)
	{
		if (microflowstatisticrunning_user == null)
			getMendixObject().setValue(context, MemberNames.MicroflowStatisticRunning_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MicroflowStatisticRunning_User.toString(), microflowstatisticrunning_user.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return microflowStatisticRunningMendixObject;
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
			final apmagent.proxies.MicroflowStatisticRunning that = (apmagent.proxies.MicroflowStatisticRunning) obj;
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
		return "APMAgent.MicroflowStatisticRunning";
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
