// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package donotuse_concurrency_donotuse.proxies;

public class Thread
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject threadMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DoNotUse_Concurrency_DoNotUse.Thread";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ThreadID("ThreadID"),
		ThreadName("ThreadName"),
		Entering("Entering"),
		Number("Number"),
		LastSequence("LastSequence"),
		RequireWriteLock("RequireWriteLock"),
		Thread_LockObject("DoNotUse_Concurrency_DoNotUse.Thread_LockObject"),
		Thread_Server("DoNotUse_Concurrency_DoNotUse.Thread_Server");

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

	public Thread(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DoNotUse_Concurrency_DoNotUse.Thread"));
	}

	protected Thread(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject threadMendixObject)
	{
		if (threadMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DoNotUse_Concurrency_DoNotUse.Thread", threadMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DoNotUse_Concurrency_DoNotUse.Thread");

		this.threadMendixObject = threadMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Thread.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static donotuse_concurrency_donotuse.proxies.Thread initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return donotuse_concurrency_donotuse.proxies.Thread.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static donotuse_concurrency_donotuse.proxies.Thread initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new donotuse_concurrency_donotuse.proxies.Thread(context, mendixObject);
	}

	public static donotuse_concurrency_donotuse.proxies.Thread load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return donotuse_concurrency_donotuse.proxies.Thread.initialize(context, mendixObject);
	}

	public static java.util.List<donotuse_concurrency_donotuse.proxies.Thread> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<donotuse_concurrency_donotuse.proxies.Thread> result = new java.util.ArrayList<donotuse_concurrency_donotuse.proxies.Thread>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DoNotUse_Concurrency_DoNotUse.Thread" + xpathConstraint))
			result.add(donotuse_concurrency_donotuse.proxies.Thread.initialize(context, obj));
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
	 * @return value of ThreadID
	 */
	public final java.lang.Long getThreadID()
	{
		return getThreadID(getContext());
	}

	/**
	 * @param context
	 * @return value of ThreadID
	 */
	public final java.lang.Long getThreadID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ThreadID.toString());
	}

	/**
	 * Set value of ThreadID
	 * @param threadid
	 */
	public final void setThreadID(java.lang.Long threadid)
	{
		setThreadID(getContext(), threadid);
	}

	/**
	 * Set value of ThreadID
	 * @param context
	 * @param threadid
	 */
	public final void setThreadID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long threadid)
	{
		getMendixObject().setValue(context, MemberNames.ThreadID.toString(), threadid);
	}

	/**
	 * @return value of ThreadName
	 */
	public final java.lang.String getThreadName()
	{
		return getThreadName(getContext());
	}

	/**
	 * @param context
	 * @return value of ThreadName
	 */
	public final java.lang.String getThreadName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ThreadName.toString());
	}

	/**
	 * Set value of ThreadName
	 * @param threadname
	 */
	public final void setThreadName(java.lang.String threadname)
	{
		setThreadName(getContext(), threadname);
	}

	/**
	 * Set value of ThreadName
	 * @param context
	 * @param threadname
	 */
	public final void setThreadName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String threadname)
	{
		getMendixObject().setValue(context, MemberNames.ThreadName.toString(), threadname);
	}

	/**
	 * @return value of Entering
	 */
	public final java.lang.Boolean getEntering()
	{
		return getEntering(getContext());
	}

	/**
	 * @param context
	 * @return value of Entering
	 */
	public final java.lang.Boolean getEntering(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Entering.toString());
	}

	/**
	 * Set value of Entering
	 * @param entering
	 */
	public final void setEntering(java.lang.Boolean entering)
	{
		setEntering(getContext(), entering);
	}

	/**
	 * Set value of Entering
	 * @param context
	 * @param entering
	 */
	public final void setEntering(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean entering)
	{
		getMendixObject().setValue(context, MemberNames.Entering.toString(), entering);
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
	 * @return value of RequireWriteLock
	 */
	public final java.lang.Boolean getRequireWriteLock()
	{
		return getRequireWriteLock(getContext());
	}

	/**
	 * @param context
	 * @return value of RequireWriteLock
	 */
	public final java.lang.Boolean getRequireWriteLock(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.RequireWriteLock.toString());
	}

	/**
	 * Set value of RequireWriteLock
	 * @param requirewritelock
	 */
	public final void setRequireWriteLock(java.lang.Boolean requirewritelock)
	{
		setRequireWriteLock(getContext(), requirewritelock);
	}

	/**
	 * Set value of RequireWriteLock
	 * @param context
	 * @param requirewritelock
	 */
	public final void setRequireWriteLock(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean requirewritelock)
	{
		getMendixObject().setValue(context, MemberNames.RequireWriteLock.toString(), requirewritelock);
	}

	/**
	 * @return value of Thread_LockObject
	 */
	public final donotuse_concurrency_donotuse.proxies.LockObject getThread_LockObject() throws com.mendix.core.CoreException
	{
		return getThread_LockObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Thread_LockObject
	 */
	public final donotuse_concurrency_donotuse.proxies.LockObject getThread_LockObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		donotuse_concurrency_donotuse.proxies.LockObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Thread_LockObject.toString());
		if (identifier != null)
			result = donotuse_concurrency_donotuse.proxies.LockObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Thread_LockObject
	 * @param thread_lockobject
	 */
	public final void setThread_LockObject(donotuse_concurrency_donotuse.proxies.LockObject thread_lockobject)
	{
		setThread_LockObject(getContext(), thread_lockobject);
	}

	/**
	 * Set value of Thread_LockObject
	 * @param context
	 * @param thread_lockobject
	 */
	public final void setThread_LockObject(com.mendix.systemwideinterfaces.core.IContext context, donotuse_concurrency_donotuse.proxies.LockObject thread_lockobject)
	{
		if (thread_lockobject == null)
			getMendixObject().setValue(context, MemberNames.Thread_LockObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Thread_LockObject.toString(), thread_lockobject.getMendixObject().getId());
	}

	/**
	 * @return value of Thread_Server
	 */
	public final donotuse_concurrency_donotuse.proxies.Server getThread_Server() throws com.mendix.core.CoreException
	{
		return getThread_Server(getContext());
	}

	/**
	 * @param context
	 * @return value of Thread_Server
	 */
	public final donotuse_concurrency_donotuse.proxies.Server getThread_Server(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		donotuse_concurrency_donotuse.proxies.Server result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Thread_Server.toString());
		if (identifier != null)
			result = donotuse_concurrency_donotuse.proxies.Server.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Thread_Server
	 * @param thread_server
	 */
	public final void setThread_Server(donotuse_concurrency_donotuse.proxies.Server thread_server)
	{
		setThread_Server(getContext(), thread_server);
	}

	/**
	 * Set value of Thread_Server
	 * @param context
	 * @param thread_server
	 */
	public final void setThread_Server(com.mendix.systemwideinterfaces.core.IContext context, donotuse_concurrency_donotuse.proxies.Server thread_server)
	{
		if (thread_server == null)
			getMendixObject().setValue(context, MemberNames.Thread_Server.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Thread_Server.toString(), thread_server.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return threadMendixObject;
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
			final donotuse_concurrency_donotuse.proxies.Thread that = (donotuse_concurrency_donotuse.proxies.Thread) obj;
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
		return "DoNotUse_Concurrency_DoNotUse.Thread";
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
