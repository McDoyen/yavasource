// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies;

public class TrapToolSettings
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject trapToolSettingsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "APMAgent.TrapToolSettings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HostName("HostName"),
		TrapQueues("TrapQueues"),
		TrapRecordDuration("TrapRecordDuration"),
		TrapRecordRecords("TrapRecordRecords"),
		TrapOnWarnings("TrapOnWarnings"),
		MaxMessagesToStore("MaxMessagesToStore"),
		OnMaxMessagesStopTrueOrCleanupFalse("OnMaxMessagesStopTrueOrCleanupFalse"),
		MaxLagDuration("MaxLagDuration"),
		FixedDuration("FixedDuration"),
		IsRunning("IsRunning"),
		RuntimeAverageMessageDuration("RuntimeAverageMessageDuration"),
		RuntimeMessageCounter("RuntimeMessageCounter"),
		RuntimeMaxMessageDuration("RuntimeMaxMessageDuration"),
		RuntimeOutputQueueSize("RuntimeOutputQueueSize"),
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

	public TrapToolSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "APMAgent.TrapToolSettings"));
	}

	protected TrapToolSettings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject trapToolSettingsMendixObject)
	{
		if (trapToolSettingsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("APMAgent.TrapToolSettings", trapToolSettingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a APMAgent.TrapToolSettings");

		this.trapToolSettingsMendixObject = trapToolSettingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TrapToolSettings.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static apmagent.proxies.TrapToolSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return apmagent.proxies.TrapToolSettings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static apmagent.proxies.TrapToolSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new apmagent.proxies.TrapToolSettings(context, mendixObject);
	}

	public static apmagent.proxies.TrapToolSettings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return apmagent.proxies.TrapToolSettings.initialize(context, mendixObject);
	}

	public static java.util.List<apmagent.proxies.TrapToolSettings> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<apmagent.proxies.TrapToolSettings> result = new java.util.ArrayList<apmagent.proxies.TrapToolSettings>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//APMAgent.TrapToolSettings" + xpathConstraint))
			result.add(apmagent.proxies.TrapToolSettings.initialize(context, obj));
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
	 * @return value of TrapQueues
	 */
	public final java.lang.Integer getTrapQueues()
	{
		return getTrapQueues(getContext());
	}

	/**
	 * @param context
	 * @return value of TrapQueues
	 */
	public final java.lang.Integer getTrapQueues(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TrapQueues.toString());
	}

	/**
	 * Set value of TrapQueues
	 * @param trapqueues
	 */
	public final void setTrapQueues(java.lang.Integer trapqueues)
	{
		setTrapQueues(getContext(), trapqueues);
	}

	/**
	 * Set value of TrapQueues
	 * @param context
	 * @param trapqueues
	 */
	public final void setTrapQueues(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer trapqueues)
	{
		getMendixObject().setValue(context, MemberNames.TrapQueues.toString(), trapqueues);
	}

	/**
	 * @return value of TrapRecordDuration
	 */
	public final java.lang.Integer getTrapRecordDuration()
	{
		return getTrapRecordDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of TrapRecordDuration
	 */
	public final java.lang.Integer getTrapRecordDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TrapRecordDuration.toString());
	}

	/**
	 * Set value of TrapRecordDuration
	 * @param traprecordduration
	 */
	public final void setTrapRecordDuration(java.lang.Integer traprecordduration)
	{
		setTrapRecordDuration(getContext(), traprecordduration);
	}

	/**
	 * Set value of TrapRecordDuration
	 * @param context
	 * @param traprecordduration
	 */
	public final void setTrapRecordDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer traprecordduration)
	{
		getMendixObject().setValue(context, MemberNames.TrapRecordDuration.toString(), traprecordduration);
	}

	/**
	 * @return value of TrapRecordRecords
	 */
	public final java.lang.Integer getTrapRecordRecords()
	{
		return getTrapRecordRecords(getContext());
	}

	/**
	 * @param context
	 * @return value of TrapRecordRecords
	 */
	public final java.lang.Integer getTrapRecordRecords(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TrapRecordRecords.toString());
	}

	/**
	 * Set value of TrapRecordRecords
	 * @param traprecordrecords
	 */
	public final void setTrapRecordRecords(java.lang.Integer traprecordrecords)
	{
		setTrapRecordRecords(getContext(), traprecordrecords);
	}

	/**
	 * Set value of TrapRecordRecords
	 * @param context
	 * @param traprecordrecords
	 */
	public final void setTrapRecordRecords(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer traprecordrecords)
	{
		getMendixObject().setValue(context, MemberNames.TrapRecordRecords.toString(), traprecordrecords);
	}

	/**
	 * @return value of TrapOnWarnings
	 */
	public final java.lang.Boolean getTrapOnWarnings()
	{
		return getTrapOnWarnings(getContext());
	}

	/**
	 * @param context
	 * @return value of TrapOnWarnings
	 */
	public final java.lang.Boolean getTrapOnWarnings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.TrapOnWarnings.toString());
	}

	/**
	 * Set value of TrapOnWarnings
	 * @param traponwarnings
	 */
	public final void setTrapOnWarnings(java.lang.Boolean traponwarnings)
	{
		setTrapOnWarnings(getContext(), traponwarnings);
	}

	/**
	 * Set value of TrapOnWarnings
	 * @param context
	 * @param traponwarnings
	 */
	public final void setTrapOnWarnings(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean traponwarnings)
	{
		getMendixObject().setValue(context, MemberNames.TrapOnWarnings.toString(), traponwarnings);
	}

	/**
	 * @return value of MaxMessagesToStore
	 */
	public final java.lang.Long getMaxMessagesToStore()
	{
		return getMaxMessagesToStore(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxMessagesToStore
	 */
	public final java.lang.Long getMaxMessagesToStore(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MaxMessagesToStore.toString());
	}

	/**
	 * Set value of MaxMessagesToStore
	 * @param maxmessagestostore
	 */
	public final void setMaxMessagesToStore(java.lang.Long maxmessagestostore)
	{
		setMaxMessagesToStore(getContext(), maxmessagestostore);
	}

	/**
	 * Set value of MaxMessagesToStore
	 * @param context
	 * @param maxmessagestostore
	 */
	public final void setMaxMessagesToStore(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long maxmessagestostore)
	{
		getMendixObject().setValue(context, MemberNames.MaxMessagesToStore.toString(), maxmessagestostore);
	}

	/**
	 * @return value of OnMaxMessagesStopTrueOrCleanupFalse
	 */
	public final java.lang.Boolean getOnMaxMessagesStopTrueOrCleanupFalse()
	{
		return getOnMaxMessagesStopTrueOrCleanupFalse(getContext());
	}

	/**
	 * @param context
	 * @return value of OnMaxMessagesStopTrueOrCleanupFalse
	 */
	public final java.lang.Boolean getOnMaxMessagesStopTrueOrCleanupFalse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.OnMaxMessagesStopTrueOrCleanupFalse.toString());
	}

	/**
	 * Set value of OnMaxMessagesStopTrueOrCleanupFalse
	 * @param onmaxmessagesstoptrueorcleanupfalse
	 */
	public final void setOnMaxMessagesStopTrueOrCleanupFalse(java.lang.Boolean onmaxmessagesstoptrueorcleanupfalse)
	{
		setOnMaxMessagesStopTrueOrCleanupFalse(getContext(), onmaxmessagesstoptrueorcleanupfalse);
	}

	/**
	 * Set value of OnMaxMessagesStopTrueOrCleanupFalse
	 * @param context
	 * @param onmaxmessagesstoptrueorcleanupfalse
	 */
	public final void setOnMaxMessagesStopTrueOrCleanupFalse(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean onmaxmessagesstoptrueorcleanupfalse)
	{
		getMendixObject().setValue(context, MemberNames.OnMaxMessagesStopTrueOrCleanupFalse.toString(), onmaxmessagesstoptrueorcleanupfalse);
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
	 * @return value of RuntimeOutputQueueSize
	 */
	public final java.lang.Integer getRuntimeOutputQueueSize()
	{
		return getRuntimeOutputQueueSize(getContext());
	}

	/**
	 * @param context
	 * @return value of RuntimeOutputQueueSize
	 */
	public final java.lang.Integer getRuntimeOutputQueueSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RuntimeOutputQueueSize.toString());
	}

	/**
	 * Set value of RuntimeOutputQueueSize
	 * @param runtimeoutputqueuesize
	 */
	public final void setRuntimeOutputQueueSize(java.lang.Integer runtimeoutputqueuesize)
	{
		setRuntimeOutputQueueSize(getContext(), runtimeoutputqueuesize);
	}

	/**
	 * Set value of RuntimeOutputQueueSize
	 * @param context
	 * @param runtimeoutputqueuesize
	 */
	public final void setRuntimeOutputQueueSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer runtimeoutputqueuesize)
	{
		getMendixObject().setValue(context, MemberNames.RuntimeOutputQueueSize.toString(), runtimeoutputqueuesize);
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
		return trapToolSettingsMendixObject;
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
			final apmagent.proxies.TrapToolSettings that = (apmagent.proxies.TrapToolSettings) obj;
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
		return "APMAgent.TrapToolSettings";
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
