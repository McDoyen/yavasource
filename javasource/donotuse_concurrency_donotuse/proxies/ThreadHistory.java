// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package donotuse_concurrency_donotuse.proxies;

public class ThreadHistory
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject threadHistoryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DoNotUse_Concurrency_DoNotUse.ThreadHistory";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Date("Date"),
		Result("Result"),
		Sequence("Sequence"),
		LastSequence("LastSequence"),
		Number("Number"),
		ExecutionTime("ExecutionTime"),
		DeltaTime("DeltaTime"),
		DeltaSequence("DeltaSequence"),
		ThreadHistory_Thread("DoNotUse_Concurrency_DoNotUse.ThreadHistory_Thread");

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

	public ThreadHistory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DoNotUse_Concurrency_DoNotUse.ThreadHistory"));
	}

	protected ThreadHistory(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject threadHistoryMendixObject)
	{
		if (threadHistoryMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DoNotUse_Concurrency_DoNotUse.ThreadHistory", threadHistoryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DoNotUse_Concurrency_DoNotUse.ThreadHistory");

		this.threadHistoryMendixObject = threadHistoryMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ThreadHistory.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static donotuse_concurrency_donotuse.proxies.ThreadHistory initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return donotuse_concurrency_donotuse.proxies.ThreadHistory.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static donotuse_concurrency_donotuse.proxies.ThreadHistory initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new donotuse_concurrency_donotuse.proxies.ThreadHistory(context, mendixObject);
	}

	public static donotuse_concurrency_donotuse.proxies.ThreadHistory load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return donotuse_concurrency_donotuse.proxies.ThreadHistory.initialize(context, mendixObject);
	}

	public static java.util.List<donotuse_concurrency_donotuse.proxies.ThreadHistory> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<donotuse_concurrency_donotuse.proxies.ThreadHistory> result = new java.util.ArrayList<donotuse_concurrency_donotuse.proxies.ThreadHistory>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DoNotUse_Concurrency_DoNotUse.ThreadHistory" + xpathConstraint))
			result.add(donotuse_concurrency_donotuse.proxies.ThreadHistory.initialize(context, obj));
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
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * Set value of Result
	 * @param result
	 */
	public final donotuse_concurrency_donotuse.proxies.ResultEnum getResult()
	{
		return getResult(getContext());
	}

	/**
	 * @param context
	 * @return value of Result
	 */
	public final donotuse_concurrency_donotuse.proxies.ResultEnum getResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Result.toString());
		if (obj == null)
			return null;

		return donotuse_concurrency_donotuse.proxies.ResultEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Result
	 * @param result
	 */
	public final void setResult(donotuse_concurrency_donotuse.proxies.ResultEnum result)
	{
		setResult(getContext(), result);
	}

	/**
	 * Set value of Result
	 * @param context
	 * @param result
	 */
	public final void setResult(com.mendix.systemwideinterfaces.core.IContext context, donotuse_concurrency_donotuse.proxies.ResultEnum result)
	{
		if (result != null)
			getMendixObject().setValue(context, MemberNames.Result.toString(), result.toString());
		else
			getMendixObject().setValue(context, MemberNames.Result.toString(), null);
	}

	/**
	 * @return value of Sequence
	 */
	public final java.lang.Long getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.Long getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.Long sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * @return value of LastSequence
	 */
	public final java.lang.Long getLastSequence()
	{
		return getLastSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of LastSequence
	 */
	public final java.lang.Long getLastSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.LastSequence.toString());
	}

	/**
	 * Set value of LastSequence
	 * @param lastsequence
	 */
	public final void setLastSequence(java.lang.Long lastsequence)
	{
		setLastSequence(getContext(), lastsequence);
	}

	/**
	 * Set value of LastSequence
	 * @param context
	 * @param lastsequence
	 */
	public final void setLastSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long lastsequence)
	{
		getMendixObject().setValue(context, MemberNames.LastSequence.toString(), lastsequence);
	}

	/**
	 * @return value of Number
	 */
	public final java.lang.Integer getNumber()
	{
		return getNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of Number
	 */
	public final java.lang.Integer getNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Number.toString());
	}

	/**
	 * Set value of Number
	 * @param number
	 */
	public final void setNumber(java.lang.Integer number)
	{
		setNumber(getContext(), number);
	}

	/**
	 * Set value of Number
	 * @param context
	 * @param number
	 */
	public final void setNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer number)
	{
		getMendixObject().setValue(context, MemberNames.Number.toString(), number);
	}

	/**
	 * @return value of ExecutionTime
	 */
	public final java.lang.Double getExecutionTime()
	{
		return getExecutionTime(getContext());
	}

	/**
	 * @param context
	 * @return value of ExecutionTime
	 */
	public final java.lang.Double getExecutionTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.ExecutionTime.toString());
	}

	/**
	 * Set value of ExecutionTime
	 * @param executiontime
	 */
	public final void setExecutionTime(java.lang.Double executiontime)
	{
		setExecutionTime(getContext(), executiontime);
	}

	/**
	 * Set value of ExecutionTime
	 * @param context
	 * @param executiontime
	 */
	public final void setExecutionTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double executiontime)
	{
		getMendixObject().setValue(context, MemberNames.ExecutionTime.toString(), executiontime);
	}

	/**
	 * @return value of DeltaTime
	 */
	public final java.lang.Double getDeltaTime()
	{
		return getDeltaTime(getContext());
	}

	/**
	 * @param context
	 * @return value of DeltaTime
	 */
	public final java.lang.Double getDeltaTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.DeltaTime.toString());
	}

	/**
	 * Set value of DeltaTime
	 * @param deltatime
	 */
	public final void setDeltaTime(java.lang.Double deltatime)
	{
		setDeltaTime(getContext(), deltatime);
	}

	/**
	 * Set value of DeltaTime
	 * @param context
	 * @param deltatime
	 */
	public final void setDeltaTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double deltatime)
	{
		getMendixObject().setValue(context, MemberNames.DeltaTime.toString(), deltatime);
	}

	/**
	 * @return value of DeltaSequence
	 */
	public final java.lang.Integer getDeltaSequence()
	{
		return getDeltaSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of DeltaSequence
	 */
	public final java.lang.Integer getDeltaSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.DeltaSequence.toString());
	}

	/**
	 * Set value of DeltaSequence
	 * @param deltasequence
	 */
	public final void setDeltaSequence(java.lang.Integer deltasequence)
	{
		setDeltaSequence(getContext(), deltasequence);
	}

	/**
	 * Set value of DeltaSequence
	 * @param context
	 * @param deltasequence
	 */
	public final void setDeltaSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer deltasequence)
	{
		getMendixObject().setValue(context, MemberNames.DeltaSequence.toString(), deltasequence);
	}

	/**
	 * @return value of ThreadHistory_Thread
	 */
	public final donotuse_concurrency_donotuse.proxies.Thread getThreadHistory_Thread() throws com.mendix.core.CoreException
	{
		return getThreadHistory_Thread(getContext());
	}

	/**
	 * @param context
	 * @return value of ThreadHistory_Thread
	 */
	public final donotuse_concurrency_donotuse.proxies.Thread getThreadHistory_Thread(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		donotuse_concurrency_donotuse.proxies.Thread result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ThreadHistory_Thread.toString());
		if (identifier != null)
			result = donotuse_concurrency_donotuse.proxies.Thread.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ThreadHistory_Thread
	 * @param threadhistory_thread
	 */
	public final void setThreadHistory_Thread(donotuse_concurrency_donotuse.proxies.Thread threadhistory_thread)
	{
		setThreadHistory_Thread(getContext(), threadhistory_thread);
	}

	/**
	 * Set value of ThreadHistory_Thread
	 * @param context
	 * @param threadhistory_thread
	 */
	public final void setThreadHistory_Thread(com.mendix.systemwideinterfaces.core.IContext context, donotuse_concurrency_donotuse.proxies.Thread threadhistory_thread)
	{
		if (threadhistory_thread == null)
			getMendixObject().setValue(context, MemberNames.ThreadHistory_Thread.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ThreadHistory_Thread.toString(), threadhistory_thread.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return threadHistoryMendixObject;
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
			final donotuse_concurrency_donotuse.proxies.ThreadHistory that = (donotuse_concurrency_donotuse.proxies.ThreadHistory) obj;
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
		return "DoNotUse_Concurrency_DoNotUse.ThreadHistory";
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
