// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class TaskCounter
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject taskCounterMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.TaskCounter";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OpenTasks("OpenTasks"),
		Tasks("Tasks"),
		TasksString("TasksString"),
		Request_TaskCounter("Process.Request_TaskCounter");

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

	public TaskCounter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.TaskCounter"));
	}

	protected TaskCounter(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject taskCounterMendixObject)
	{
		if (taskCounterMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Process.TaskCounter", taskCounterMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.TaskCounter");

		this.taskCounterMendixObject = taskCounterMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TaskCounter.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.TaskCounter initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.TaskCounter.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.TaskCounter initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.TaskCounter(context, mendixObject);
	}

	public static process.proxies.TaskCounter load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.TaskCounter.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.TaskCounter> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.TaskCounter> result = new java.util.ArrayList<process.proxies.TaskCounter>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.TaskCounter" + xpathConstraint))
			result.add(process.proxies.TaskCounter.initialize(context, obj));
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
	 * @return value of OpenTasks
	 */
	public final java.lang.Integer getOpenTasks()
	{
		return getOpenTasks(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenTasks
	 */
	public final java.lang.Integer getOpenTasks(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OpenTasks.toString());
	}

	/**
	 * Set value of OpenTasks
	 * @param opentasks
	 */
	public final void setOpenTasks(java.lang.Integer opentasks)
	{
		setOpenTasks(getContext(), opentasks);
	}

	/**
	 * Set value of OpenTasks
	 * @param context
	 * @param opentasks
	 */
	public final void setOpenTasks(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer opentasks)
	{
		getMendixObject().setValue(context, MemberNames.OpenTasks.toString(), opentasks);
	}

	/**
	 * @return value of Tasks
	 */
	public final java.lang.Integer getTasks()
	{
		return getTasks(getContext());
	}

	/**
	 * @param context
	 * @return value of Tasks
	 */
	public final java.lang.Integer getTasks(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Tasks.toString());
	}

	/**
	 * Set value of Tasks
	 * @param tasks
	 */
	public final void setTasks(java.lang.Integer tasks)
	{
		setTasks(getContext(), tasks);
	}

	/**
	 * Set value of Tasks
	 * @param context
	 * @param tasks
	 */
	public final void setTasks(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer tasks)
	{
		getMendixObject().setValue(context, MemberNames.Tasks.toString(), tasks);
	}

	/**
	 * @return value of TasksString
	 */
	public final java.lang.String getTasksString()
	{
		return getTasksString(getContext());
	}

	/**
	 * @param context
	 * @return value of TasksString
	 */
	public final java.lang.String getTasksString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TasksString.toString());
	}

	/**
	 * Set value of TasksString
	 * @param tasksstring
	 */
	public final void setTasksString(java.lang.String tasksstring)
	{
		setTasksString(getContext(), tasksstring);
	}

	/**
	 * Set value of TasksString
	 * @param context
	 * @param tasksstring
	 */
	public final void setTasksString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tasksstring)
	{
		getMendixObject().setValue(context, MemberNames.TasksString.toString(), tasksstring);
	}

	/**
	 * @return value of Request_TaskCounter
	 */
	public final process.proxies.Request getRequest_TaskCounter() throws com.mendix.core.CoreException
	{
		return getRequest_TaskCounter(getContext());
	}

	/**
	 * @param context
	 * @return value of Request_TaskCounter
	 */
	public final process.proxies.Request getRequest_TaskCounter(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Request_TaskCounter.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Request_TaskCounter
	 * @param request_taskcounter
	 */
	public final void setRequest_TaskCounter(process.proxies.Request request_taskcounter)
	{
		setRequest_TaskCounter(getContext(), request_taskcounter);
	}

	/**
	 * Set value of Request_TaskCounter
	 * @param context
	 * @param request_taskcounter
	 */
	public final void setRequest_TaskCounter(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request request_taskcounter)
	{
		if (request_taskcounter == null)
			getMendixObject().setValue(context, MemberNames.Request_TaskCounter.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Request_TaskCounter.toString(), request_taskcounter.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return taskCounterMendixObject;
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
			final process.proxies.TaskCounter that = (process.proxies.TaskCounter) obj;
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
		return "Process.TaskCounter";
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
