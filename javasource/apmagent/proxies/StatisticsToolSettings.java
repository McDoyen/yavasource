// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies;

public class StatisticsToolSettings
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject statisticsToolSettingsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "APMAgent.StatisticsToolSettings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HostName("HostName"),
		ImportPath("ImportPath"),
		Amount("Amount"),
		ExcludeMicroflows("ExcludeMicroflows"),
		StorageAmount("StorageAmount"),
		StorageFrequency("StorageFrequency"),
		StorageExcludeMicroflows("StorageExcludeMicroflows"),
		MaxLagDuration("MaxLagDuration"),
		FixedDuration("FixedDuration"),
		IsRunning("IsRunning"),
		IsRecording("IsRecording"),
		RuntimeAverageMessageDuration("RuntimeAverageMessageDuration"),
		RuntimeMessageCounter("RuntimeMessageCounter"),
		RuntimeMaxMessageDuration("RuntimeMaxMessageDuration"),
		RuntimeLagDuration("RuntimeLagDuration");

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

	public StatisticsToolSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "APMAgent.StatisticsToolSettings"));
	}

	protected StatisticsToolSettings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject statisticsToolSettingsMendixObject)
	{
		if (statisticsToolSettingsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("APMAgent.StatisticsToolSettings", statisticsToolSettingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a APMAgent.StatisticsToolSettings");

		this.statisticsToolSettingsMendixObject = statisticsToolSettingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'StatisticsToolSettings.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static apmagent.proxies.StatisticsToolSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return apmagent.proxies.StatisticsToolSettings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static apmagent.proxies.StatisticsToolSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new apmagent.proxies.StatisticsToolSettings(context, mendixObject);
	}

	public static apmagent.proxies.StatisticsToolSettings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return apmagent.proxies.StatisticsToolSettings.initialize(context, mendixObject);
	}

	public static java.util.List<apmagent.proxies.StatisticsToolSettings> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<apmagent.proxies.StatisticsToolSettings> result = new java.util.ArrayList<apmagent.proxies.StatisticsToolSettings>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//APMAgent.StatisticsToolSettings" + xpathConstraint))
			result.add(apmagent.proxies.StatisticsToolSettings.initialize(context, obj));
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
	 * @return value of HostName
	 */
	public final java.lang.String getHostName()
	{
		return getHostName(getContext());
	}

	/**
	 * @param context
	 * @return value of HostName
	 */
	public final java.lang.String getHostName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HostName.toString());
	}

	/**
	 * Set value of HostName
	 * @param hostname
	 */
	public final void setHostName(java.lang.String hostname)
	{
		setHostName(getContext(), hostname);
	}

	/**
	 * Set value of HostName
	 * @param context
	 * @param hostname
	 */
	public final void setHostName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hostname)
	{
		getMendixObject().setValue(context, MemberNames.HostName.toString(), hostname);
	}

	/**
	 * @return value of ImportPath
	 */
	public final java.lang.String getImportPath()
	{
		return getImportPath(getContext());
	}

	/**
	 * @param context
	 * @return value of ImportPath
	 */
	public final java.lang.String getImportPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ImportPath.toString());
	}

	/**
	 * Set value of ImportPath
	 * @param importpath
	 */
	public final void setImportPath(java.lang.String importpath)
	{
		setImportPath(getContext(), importpath);
	}

	/**
	 * Set value of ImportPath
	 * @param context
	 * @param importpath
	 */
	public final void setImportPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String importpath)
	{
		getMendixObject().setValue(context, MemberNames.ImportPath.toString(), importpath);
	}

	/**
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.lang.Integer amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of ExcludeMicroflows
	 */
	public final java.lang.String getExcludeMicroflows()
	{
		return getExcludeMicroflows(getContext());
	}

	/**
	 * @param context
	 * @return value of ExcludeMicroflows
	 */
	public final java.lang.String getExcludeMicroflows(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ExcludeMicroflows.toString());
	}

	/**
	 * Set value of ExcludeMicroflows
	 * @param excludemicroflows
	 */
	public final void setExcludeMicroflows(java.lang.String excludemicroflows)
	{
		setExcludeMicroflows(getContext(), excludemicroflows);
	}

	/**
	 * Set value of ExcludeMicroflows
	 * @param context
	 * @param excludemicroflows
	 */
	public final void setExcludeMicroflows(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String excludemicroflows)
	{
		getMendixObject().setValue(context, MemberNames.ExcludeMicroflows.toString(), excludemicroflows);
	}

	/**
	 * @return value of StorageAmount
	 */
	public final java.lang.Integer getStorageAmount()
	{
		return getStorageAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of StorageAmount
	 */
	public final java.lang.Integer getStorageAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.StorageAmount.toString());
	}

	/**
	 * Set value of StorageAmount
	 * @param storageamount
	 */
	public final void setStorageAmount(java.lang.Integer storageamount)
	{
		setStorageAmount(getContext(), storageamount);
	}

	/**
	 * Set value of StorageAmount
	 * @param context
	 * @param storageamount
	 */
	public final void setStorageAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer storageamount)
	{
		getMendixObject().setValue(context, MemberNames.StorageAmount.toString(), storageamount);
	}

	/**
	 * @return value of StorageFrequency
	 */
	public final java.lang.Long getStorageFrequency()
	{
		return getStorageFrequency(getContext());
	}

	/**
	 * @param context
	 * @return value of StorageFrequency
	 */
	public final java.lang.Long getStorageFrequency(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.StorageFrequency.toString());
	}

	/**
	 * Set value of StorageFrequency
	 * @param storagefrequency
	 */
	public final void setStorageFrequency(java.lang.Long storagefrequency)
	{
		setStorageFrequency(getContext(), storagefrequency);
	}

	/**
	 * Set value of StorageFrequency
	 * @param context
	 * @param storagefrequency
	 */
	public final void setStorageFrequency(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long storagefrequency)
	{
		getMendixObject().setValue(context, MemberNames.StorageFrequency.toString(), storagefrequency);
	}

	/**
	 * @return value of StorageExcludeMicroflows
	 */
	public final java.lang.String getStorageExcludeMicroflows()
	{
		return getStorageExcludeMicroflows(getContext());
	}

	/**
	 * @param context
	 * @return value of StorageExcludeMicroflows
	 */
	public final java.lang.String getStorageExcludeMicroflows(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StorageExcludeMicroflows.toString());
	}

	/**
	 * Set value of StorageExcludeMicroflows
	 * @param storageexcludemicroflows
	 */
	public final void setStorageExcludeMicroflows(java.lang.String storageexcludemicroflows)
	{
		setStorageExcludeMicroflows(getContext(), storageexcludemicroflows);
	}

	/**
	 * Set value of StorageExcludeMicroflows
	 * @param context
	 * @param storageexcludemicroflows
	 */
	public final void setStorageExcludeMicroflows(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String storageexcludemicroflows)
	{
		getMendixObject().setValue(context, MemberNames.StorageExcludeMicroflows.toString(), storageexcludemicroflows);
	}

	/**
	 * @return value of MaxLagDuration
	 */
	public final java.lang.Long getMaxLagDuration()
	{
		return getMaxLagDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxLagDuration
	 */
	public final java.lang.Long getMaxLagDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MaxLagDuration.toString());
	}

	/**
	 * Set value of MaxLagDuration
	 * @param maxlagduration
	 */
	public final void setMaxLagDuration(java.lang.Long maxlagduration)
	{
		setMaxLagDuration(getContext(), maxlagduration);
	}

	/**
	 * Set value of MaxLagDuration
	 * @param context
	 * @param maxlagduration
	 */
	public final void setMaxLagDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long maxlagduration)
	{
		getMendixObject().setValue(context, MemberNames.MaxLagDuration.toString(), maxlagduration);
	}

	/**
	 * @return value of FixedDuration
	 */
	public final java.lang.Integer getFixedDuration()
	{
		return getFixedDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of FixedDuration
	 */
	public final java.lang.Integer getFixedDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.FixedDuration.toString());
	}

	/**
	 * Set value of FixedDuration
	 * @param fixedduration
	 */
	public final void setFixedDuration(java.lang.Integer fixedduration)
	{
		setFixedDuration(getContext(), fixedduration);
	}

	/**
	 * Set value of FixedDuration
	 * @param context
	 * @param fixedduration
	 */
	public final void setFixedDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer fixedduration)
	{
		getMendixObject().setValue(context, MemberNames.FixedDuration.toString(), fixedduration);
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
	 * @return value of IsRecording
	 */
	public final java.lang.Boolean getIsRecording()
	{
		return getIsRecording(getContext());
	}

	/**
	 * @param context
	 * @return value of IsRecording
	 */
	public final java.lang.Boolean getIsRecording(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsRecording.toString());
	}

	/**
	 * Set value of IsRecording
	 * @param isrecording
	 */
	public final void setIsRecording(java.lang.Boolean isrecording)
	{
		setIsRecording(getContext(), isrecording);
	}

	/**
	 * Set value of IsRecording
	 * @param context
	 * @param isrecording
	 */
	public final void setIsRecording(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isrecording)
	{
		getMendixObject().setValue(context, MemberNames.IsRecording.toString(), isrecording);
	}

	/**
	 * @return value of RuntimeAverageMessageDuration
	 */
	public final java.lang.Double getRuntimeAverageMessageDuration()
	{
		return getRuntimeAverageMessageDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of RuntimeAverageMessageDuration
	 */
	public final java.lang.Double getRuntimeAverageMessageDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.RuntimeAverageMessageDuration.toString());
	}

	/**
	 * Set value of RuntimeAverageMessageDuration
	 * @param runtimeaveragemessageduration
	 */
	public final void setRuntimeAverageMessageDuration(java.lang.Double runtimeaveragemessageduration)
	{
		setRuntimeAverageMessageDuration(getContext(), runtimeaveragemessageduration);
	}

	/**
	 * Set value of RuntimeAverageMessageDuration
	 * @param context
	 * @param runtimeaveragemessageduration
	 */
	public final void setRuntimeAverageMessageDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double runtimeaveragemessageduration)
	{
		getMendixObject().setValue(context, MemberNames.RuntimeAverageMessageDuration.toString(), runtimeaveragemessageduration);
	}

	/**
	 * @return value of RuntimeMessageCounter
	 */
	public final java.lang.Integer getRuntimeMessageCounter()
	{
		return getRuntimeMessageCounter(getContext());
	}

	/**
	 * @param context
	 * @return value of RuntimeMessageCounter
	 */
	public final java.lang.Integer getRuntimeMessageCounter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RuntimeMessageCounter.toString());
	}

	/**
	 * Set value of RuntimeMessageCounter
	 * @param runtimemessagecounter
	 */
	public final void setRuntimeMessageCounter(java.lang.Integer runtimemessagecounter)
	{
		setRuntimeMessageCounter(getContext(), runtimemessagecounter);
	}

	/**
	 * Set value of RuntimeMessageCounter
	 * @param context
	 * @param runtimemessagecounter
	 */
	public final void setRuntimeMessageCounter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer runtimemessagecounter)
	{
		getMendixObject().setValue(context, MemberNames.RuntimeMessageCounter.toString(), runtimemessagecounter);
	}

	/**
	 * @return value of RuntimeMaxMessageDuration
	 */
	public final java.lang.Double getRuntimeMaxMessageDuration()
	{
		return getRuntimeMaxMessageDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of RuntimeMaxMessageDuration
	 */
	public final java.lang.Double getRuntimeMaxMessageDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.RuntimeMaxMessageDuration.toString());
	}

	/**
	 * Set value of RuntimeMaxMessageDuration
	 * @param runtimemaxmessageduration
	 */
	public final void setRuntimeMaxMessageDuration(java.lang.Double runtimemaxmessageduration)
	{
		setRuntimeMaxMessageDuration(getContext(), runtimemaxmessageduration);
	}

	/**
	 * Set value of RuntimeMaxMessageDuration
	 * @param context
	 * @param runtimemaxmessageduration
	 */
	public final void setRuntimeMaxMessageDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double runtimemaxmessageduration)
	{
		getMendixObject().setValue(context, MemberNames.RuntimeMaxMessageDuration.toString(), runtimemaxmessageduration);
	}

	/**
	 * @return value of RuntimeLagDuration
	 */
	public final java.lang.Long getRuntimeLagDuration()
	{
		return getRuntimeLagDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of RuntimeLagDuration
	 */
	public final java.lang.Long getRuntimeLagDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.RuntimeLagDuration.toString());
	}

	/**
	 * Set value of RuntimeLagDuration
	 * @param runtimelagduration
	 */
	public final void setRuntimeLagDuration(java.lang.Long runtimelagduration)
	{
		setRuntimeLagDuration(getContext(), runtimelagduration);
	}

	/**
	 * Set value of RuntimeLagDuration
	 * @param context
	 * @param runtimelagduration
	 */
	public final void setRuntimeLagDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long runtimelagduration)
	{
		getMendixObject().setValue(context, MemberNames.RuntimeLagDuration.toString(), runtimelagduration);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return statisticsToolSettingsMendixObject;
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
			final apmagent.proxies.StatisticsToolSettings that = (apmagent.proxies.StatisticsToolSettings) obj;
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
		return "APMAgent.StatisticsToolSettings";
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
