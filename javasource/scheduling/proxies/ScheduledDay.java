// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package scheduling.proxies;

public class ScheduledDay
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject scheduledDayMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Scheduling.ScheduledDay";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Day("Day"),
		AcceptDay("AcceptDay"),
		isTicket("isTicket"),
		ScheduleState("ScheduleState"),
		ScheduledDay_ScheduledTemplateRequest("Scheduling.ScheduledDay_ScheduledTemplateRequest"),
		Request_ScheduledDay("Process.Request_ScheduledDay");

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

	public ScheduledDay(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Scheduling.ScheduledDay"));
	}

	protected ScheduledDay(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject scheduledDayMendixObject)
	{
		if (scheduledDayMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Scheduling.ScheduledDay", scheduledDayMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Scheduling.ScheduledDay");

		this.scheduledDayMendixObject = scheduledDayMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ScheduledDay.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static scheduling.proxies.ScheduledDay initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return scheduling.proxies.ScheduledDay.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static scheduling.proxies.ScheduledDay initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new scheduling.proxies.ScheduledDay(context, mendixObject);
	}

	public static scheduling.proxies.ScheduledDay load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return scheduling.proxies.ScheduledDay.initialize(context, mendixObject);
	}

	public static java.util.List<scheduling.proxies.ScheduledDay> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<scheduling.proxies.ScheduledDay> result = new java.util.ArrayList<scheduling.proxies.ScheduledDay>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Scheduling.ScheduledDay" + xpathConstraint))
			result.add(scheduling.proxies.ScheduledDay.initialize(context, obj));
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
	 * @return value of Day
	 */
	public final java.util.Date getDay()
	{
		return getDay(getContext());
	}

	/**
	 * @param context
	 * @return value of Day
	 */
	public final java.util.Date getDay(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Day.toString());
	}

	/**
	 * Set value of Day
	 * @param day
	 */
	public final void setDay(java.util.Date day)
	{
		setDay(getContext(), day);
	}

	/**
	 * Set value of Day
	 * @param context
	 * @param day
	 */
	public final void setDay(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date day)
	{
		getMendixObject().setValue(context, MemberNames.Day.toString(), day);
	}

	/**
	 * @return value of AcceptDay
	 */
	public final java.util.Date getAcceptDay()
	{
		return getAcceptDay(getContext());
	}

	/**
	 * @param context
	 * @return value of AcceptDay
	 */
	public final java.util.Date getAcceptDay(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.AcceptDay.toString());
	}

	/**
	 * Set value of AcceptDay
	 * @param acceptday
	 */
	public final void setAcceptDay(java.util.Date acceptday)
	{
		setAcceptDay(getContext(), acceptday);
	}

	/**
	 * Set value of AcceptDay
	 * @param context
	 * @param acceptday
	 */
	public final void setAcceptDay(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date acceptday)
	{
		getMendixObject().setValue(context, MemberNames.AcceptDay.toString(), acceptday);
	}

	/**
	 * Set value of isTicket
	 * @param isticket
	 */
	public final scheduling.proxies.isTicket_Enum getisTicket()
	{
		return getisTicket(getContext());
	}

	/**
	 * @param context
	 * @return value of isTicket
	 */
	public final scheduling.proxies.isTicket_Enum getisTicket(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.isTicket.toString());
		if (obj == null)
			return null;

		return scheduling.proxies.isTicket_Enum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of isTicket
	 * @param isticket
	 */
	public final void setisTicket(scheduling.proxies.isTicket_Enum isticket)
	{
		setisTicket(getContext(), isticket);
	}

	/**
	 * Set value of isTicket
	 * @param context
	 * @param isticket
	 */
	public final void setisTicket(com.mendix.systemwideinterfaces.core.IContext context, scheduling.proxies.isTicket_Enum isticket)
	{
		if (isticket != null)
			getMendixObject().setValue(context, MemberNames.isTicket.toString(), isticket.toString());
		else
			getMendixObject().setValue(context, MemberNames.isTicket.toString(), null);
	}

	/**
	 * Set value of ScheduleState
	 * @param schedulestate
	 */
	public final scheduling.proxies.ScheduleState getScheduleState()
	{
		return getScheduleState(getContext());
	}

	/**
	 * @param context
	 * @return value of ScheduleState
	 */
	public final scheduling.proxies.ScheduleState getScheduleState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ScheduleState.toString());
		if (obj == null)
			return null;

		return scheduling.proxies.ScheduleState.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ScheduleState
	 * @param schedulestate
	 */
	public final void setScheduleState(scheduling.proxies.ScheduleState schedulestate)
	{
		setScheduleState(getContext(), schedulestate);
	}

	/**
	 * Set value of ScheduleState
	 * @param context
	 * @param schedulestate
	 */
	public final void setScheduleState(com.mendix.systemwideinterfaces.core.IContext context, scheduling.proxies.ScheduleState schedulestate)
	{
		if (schedulestate != null)
			getMendixObject().setValue(context, MemberNames.ScheduleState.toString(), schedulestate.toString());
		else
			getMendixObject().setValue(context, MemberNames.ScheduleState.toString(), null);
	}

	/**
	 * @return value of ScheduledDay_ScheduledTemplateRequest
	 */
	public final scheduling.proxies.ScheduledTemplateRequest getScheduledDay_ScheduledTemplateRequest() throws com.mendix.core.CoreException
	{
		return getScheduledDay_ScheduledTemplateRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of ScheduledDay_ScheduledTemplateRequest
	 */
	public final scheduling.proxies.ScheduledTemplateRequest getScheduledDay_ScheduledTemplateRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		scheduling.proxies.ScheduledTemplateRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ScheduledDay_ScheduledTemplateRequest.toString());
		if (identifier != null)
			result = scheduling.proxies.ScheduledTemplateRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ScheduledDay_ScheduledTemplateRequest
	 * @param scheduledday_scheduledtemplaterequest
	 */
	public final void setScheduledDay_ScheduledTemplateRequest(scheduling.proxies.ScheduledTemplateRequest scheduledday_scheduledtemplaterequest)
	{
		setScheduledDay_ScheduledTemplateRequest(getContext(), scheduledday_scheduledtemplaterequest);
	}

	/**
	 * Set value of ScheduledDay_ScheduledTemplateRequest
	 * @param context
	 * @param scheduledday_scheduledtemplaterequest
	 */
	public final void setScheduledDay_ScheduledTemplateRequest(com.mendix.systemwideinterfaces.core.IContext context, scheduling.proxies.ScheduledTemplateRequest scheduledday_scheduledtemplaterequest)
	{
		if (scheduledday_scheduledtemplaterequest == null)
			getMendixObject().setValue(context, MemberNames.ScheduledDay_ScheduledTemplateRequest.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ScheduledDay_ScheduledTemplateRequest.toString(), scheduledday_scheduledtemplaterequest.getMendixObject().getId());
	}

	/**
	 * @return value of Request_ScheduledDay
	 */
	public final process.proxies.Request getRequest_ScheduledDay() throws com.mendix.core.CoreException
	{
		return getRequest_ScheduledDay(getContext());
	}

	/**
	 * @param context
	 * @return value of Request_ScheduledDay
	 */
	public final process.proxies.Request getRequest_ScheduledDay(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Request_ScheduledDay.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Request_ScheduledDay
	 * @param request_scheduledday
	 */
	public final void setRequest_ScheduledDay(process.proxies.Request request_scheduledday)
	{
		setRequest_ScheduledDay(getContext(), request_scheduledday);
	}

	/**
	 * Set value of Request_ScheduledDay
	 * @param context
	 * @param request_scheduledday
	 */
	public final void setRequest_ScheduledDay(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request request_scheduledday)
	{
		if (request_scheduledday == null)
			getMendixObject().setValue(context, MemberNames.Request_ScheduledDay.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Request_ScheduledDay.toString(), request_scheduledday.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return scheduledDayMendixObject;
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
			final scheduling.proxies.ScheduledDay that = (scheduling.proxies.ScheduledDay) obj;
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
		return "Scheduling.ScheduledDay";
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