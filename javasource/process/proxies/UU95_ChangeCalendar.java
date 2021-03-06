// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class UU95_ChangeCalendar
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject uU95_ChangeCalendarMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.UU95_ChangeCalendar";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UU95_TicketID("UU95_TicketID"),
		UU95_TaskId("UU95_TaskId"),
		UU95_CalendarLabel("UU95_CalendarLabel"),
		UU95_StartDateTime("UU95_StartDateTime"),
		UU95_EndDateTime("UU95_EndDateTime"),
		UU95_State("UU95_State"),
		UU95_Phase("UU95_Phase"),
		UU95_AgendaAllDay("UU95_AgendaAllDay"),
		UU95_CalenderType("UU95_CalenderType"),
		UU95_Status("UU95_Status"),
		UU95_CalendarSetting_ChangeCalendar("Process.UU95_CalendarSetting_ChangeCalendar");

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

	public UU95_ChangeCalendar(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.UU95_ChangeCalendar"));
	}

	protected UU95_ChangeCalendar(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject uU95_ChangeCalendarMendixObject)
	{
		if (uU95_ChangeCalendarMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Process.UU95_ChangeCalendar", uU95_ChangeCalendarMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.UU95_ChangeCalendar");

		this.uU95_ChangeCalendarMendixObject = uU95_ChangeCalendarMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'UU95_ChangeCalendar.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.UU95_ChangeCalendar initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.UU95_ChangeCalendar.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.UU95_ChangeCalendar initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.UU95_ChangeCalendar(context, mendixObject);
	}

	public static process.proxies.UU95_ChangeCalendar load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.UU95_ChangeCalendar.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.UU95_ChangeCalendar> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.UU95_ChangeCalendar> result = new java.util.ArrayList<process.proxies.UU95_ChangeCalendar>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.UU95_ChangeCalendar" + xpathConstraint))
			result.add(process.proxies.UU95_ChangeCalendar.initialize(context, obj));
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
	 * @return value of UU95_TicketID
	 */
	public final java.lang.String getUU95_TicketID()
	{
		return getUU95_TicketID(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_TicketID
	 */
	public final java.lang.String getUU95_TicketID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UU95_TicketID.toString());
	}

	/**
	 * Set value of UU95_TicketID
	 * @param uu95_ticketid
	 */
	public final void setUU95_TicketID(java.lang.String uu95_ticketid)
	{
		setUU95_TicketID(getContext(), uu95_ticketid);
	}

	/**
	 * Set value of UU95_TicketID
	 * @param context
	 * @param uu95_ticketid
	 */
	public final void setUU95_TicketID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uu95_ticketid)
	{
		getMendixObject().setValue(context, MemberNames.UU95_TicketID.toString(), uu95_ticketid);
	}

	/**
	 * @return value of UU95_TaskId
	 */
	public final java.lang.String getUU95_TaskId()
	{
		return getUU95_TaskId(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_TaskId
	 */
	public final java.lang.String getUU95_TaskId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UU95_TaskId.toString());
	}

	/**
	 * Set value of UU95_TaskId
	 * @param uu95_taskid
	 */
	public final void setUU95_TaskId(java.lang.String uu95_taskid)
	{
		setUU95_TaskId(getContext(), uu95_taskid);
	}

	/**
	 * Set value of UU95_TaskId
	 * @param context
	 * @param uu95_taskid
	 */
	public final void setUU95_TaskId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uu95_taskid)
	{
		getMendixObject().setValue(context, MemberNames.UU95_TaskId.toString(), uu95_taskid);
	}

	/**
	 * @return value of UU95_CalendarLabel
	 */
	public final java.lang.String getUU95_CalendarLabel()
	{
		return getUU95_CalendarLabel(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_CalendarLabel
	 */
	public final java.lang.String getUU95_CalendarLabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UU95_CalendarLabel.toString());
	}

	/**
	 * Set value of UU95_CalendarLabel
	 * @param uu95_calendarlabel
	 */
	public final void setUU95_CalendarLabel(java.lang.String uu95_calendarlabel)
	{
		setUU95_CalendarLabel(getContext(), uu95_calendarlabel);
	}

	/**
	 * Set value of UU95_CalendarLabel
	 * @param context
	 * @param uu95_calendarlabel
	 */
	public final void setUU95_CalendarLabel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uu95_calendarlabel)
	{
		getMendixObject().setValue(context, MemberNames.UU95_CalendarLabel.toString(), uu95_calendarlabel);
	}

	/**
	 * @return value of UU95_StartDateTime
	 */
	public final java.util.Date getUU95_StartDateTime()
	{
		return getUU95_StartDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_StartDateTime
	 */
	public final java.util.Date getUU95_StartDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.UU95_StartDateTime.toString());
	}

	/**
	 * Set value of UU95_StartDateTime
	 * @param uu95_startdatetime
	 */
	public final void setUU95_StartDateTime(java.util.Date uu95_startdatetime)
	{
		setUU95_StartDateTime(getContext(), uu95_startdatetime);
	}

	/**
	 * Set value of UU95_StartDateTime
	 * @param context
	 * @param uu95_startdatetime
	 */
	public final void setUU95_StartDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date uu95_startdatetime)
	{
		getMendixObject().setValue(context, MemberNames.UU95_StartDateTime.toString(), uu95_startdatetime);
	}

	/**
	 * @return value of UU95_EndDateTime
	 */
	public final java.util.Date getUU95_EndDateTime()
	{
		return getUU95_EndDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_EndDateTime
	 */
	public final java.util.Date getUU95_EndDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.UU95_EndDateTime.toString());
	}

	/**
	 * Set value of UU95_EndDateTime
	 * @param uu95_enddatetime
	 */
	public final void setUU95_EndDateTime(java.util.Date uu95_enddatetime)
	{
		setUU95_EndDateTime(getContext(), uu95_enddatetime);
	}

	/**
	 * Set value of UU95_EndDateTime
	 * @param context
	 * @param uu95_enddatetime
	 */
	public final void setUU95_EndDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date uu95_enddatetime)
	{
		getMendixObject().setValue(context, MemberNames.UU95_EndDateTime.toString(), uu95_enddatetime);
	}

	/**
	 * @return value of UU95_State
	 */
	public final java.lang.String getUU95_State()
	{
		return getUU95_State(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_State
	 */
	public final java.lang.String getUU95_State(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UU95_State.toString());
	}

	/**
	 * Set value of UU95_State
	 * @param uu95_state
	 */
	public final void setUU95_State(java.lang.String uu95_state)
	{
		setUU95_State(getContext(), uu95_state);
	}

	/**
	 * Set value of UU95_State
	 * @param context
	 * @param uu95_state
	 */
	public final void setUU95_State(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uu95_state)
	{
		getMendixObject().setValue(context, MemberNames.UU95_State.toString(), uu95_state);
	}

	/**
	 * @return value of UU95_Phase
	 */
	public final java.lang.String getUU95_Phase()
	{
		return getUU95_Phase(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_Phase
	 */
	public final java.lang.String getUU95_Phase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UU95_Phase.toString());
	}

	/**
	 * Set value of UU95_Phase
	 * @param uu95_phase
	 */
	public final void setUU95_Phase(java.lang.String uu95_phase)
	{
		setUU95_Phase(getContext(), uu95_phase);
	}

	/**
	 * Set value of UU95_Phase
	 * @param context
	 * @param uu95_phase
	 */
	public final void setUU95_Phase(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uu95_phase)
	{
		getMendixObject().setValue(context, MemberNames.UU95_Phase.toString(), uu95_phase);
	}

	/**
	 * @return value of UU95_AgendaAllDay
	 */
	public final java.lang.Boolean getUU95_AgendaAllDay()
	{
		return getUU95_AgendaAllDay(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_AgendaAllDay
	 */
	public final java.lang.Boolean getUU95_AgendaAllDay(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UU95_AgendaAllDay.toString());
	}

	/**
	 * Set value of UU95_AgendaAllDay
	 * @param uu95_agendaallday
	 */
	public final void setUU95_AgendaAllDay(java.lang.Boolean uu95_agendaallday)
	{
		setUU95_AgendaAllDay(getContext(), uu95_agendaallday);
	}

	/**
	 * Set value of UU95_AgendaAllDay
	 * @param context
	 * @param uu95_agendaallday
	 */
	public final void setUU95_AgendaAllDay(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean uu95_agendaallday)
	{
		getMendixObject().setValue(context, MemberNames.UU95_AgendaAllDay.toString(), uu95_agendaallday);
	}

	/**
	 * Set value of UU95_CalenderType
	 * @param uu95_calendertype
	 */
	public final process.proxies.ChangeCalendarType getUU95_CalenderType()
	{
		return getUU95_CalenderType(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_CalenderType
	 */
	public final process.proxies.ChangeCalendarType getUU95_CalenderType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.UU95_CalenderType.toString());
		if (obj == null)
			return null;

		return process.proxies.ChangeCalendarType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of UU95_CalenderType
	 * @param uu95_calendertype
	 */
	public final void setUU95_CalenderType(process.proxies.ChangeCalendarType uu95_calendertype)
	{
		setUU95_CalenderType(getContext(), uu95_calendertype);
	}

	/**
	 * Set value of UU95_CalenderType
	 * @param context
	 * @param uu95_calendertype
	 */
	public final void setUU95_CalenderType(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.ChangeCalendarType uu95_calendertype)
	{
		if (uu95_calendertype != null)
			getMendixObject().setValue(context, MemberNames.UU95_CalenderType.toString(), uu95_calendertype.toString());
		else
			getMendixObject().setValue(context, MemberNames.UU95_CalenderType.toString(), null);
	}

	/**
	 * Set value of UU95_Status
	 * @param uu95_status
	 */
	public final statetransition.proxies.TypeOfPhaseOrState getUU95_Status()
	{
		return getUU95_Status(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_Status
	 */
	public final statetransition.proxies.TypeOfPhaseOrState getUU95_Status(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.UU95_Status.toString());
		if (obj == null)
			return null;

		return statetransition.proxies.TypeOfPhaseOrState.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of UU95_Status
	 * @param uu95_status
	 */
	public final void setUU95_Status(statetransition.proxies.TypeOfPhaseOrState uu95_status)
	{
		setUU95_Status(getContext(), uu95_status);
	}

	/**
	 * Set value of UU95_Status
	 * @param context
	 * @param uu95_status
	 */
	public final void setUU95_Status(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.TypeOfPhaseOrState uu95_status)
	{
		if (uu95_status != null)
			getMendixObject().setValue(context, MemberNames.UU95_Status.toString(), uu95_status.toString());
		else
			getMendixObject().setValue(context, MemberNames.UU95_Status.toString(), null);
	}

	/**
	 * @return value of UU95_CalendarSetting_ChangeCalendar
	 */
	public final process.proxies.UU95_CalendarSetting getUU95_CalendarSetting_ChangeCalendar() throws com.mendix.core.CoreException
	{
		return getUU95_CalendarSetting_ChangeCalendar(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_CalendarSetting_ChangeCalendar
	 */
	public final process.proxies.UU95_CalendarSetting getUU95_CalendarSetting_ChangeCalendar(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.UU95_CalendarSetting result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.UU95_CalendarSetting_ChangeCalendar.toString());
		if (identifier != null)
			result = process.proxies.UU95_CalendarSetting.load(context, identifier);
		return result;
	}

	/**
	 * Set value of UU95_CalendarSetting_ChangeCalendar
	 * @param uu95_calendarsetting_changecalendar
	 */
	public final void setUU95_CalendarSetting_ChangeCalendar(process.proxies.UU95_CalendarSetting uu95_calendarsetting_changecalendar)
	{
		setUU95_CalendarSetting_ChangeCalendar(getContext(), uu95_calendarsetting_changecalendar);
	}

	/**
	 * Set value of UU95_CalendarSetting_ChangeCalendar
	 * @param context
	 * @param uu95_calendarsetting_changecalendar
	 */
	public final void setUU95_CalendarSetting_ChangeCalendar(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.UU95_CalendarSetting uu95_calendarsetting_changecalendar)
	{
		if (uu95_calendarsetting_changecalendar == null)
			getMendixObject().setValue(context, MemberNames.UU95_CalendarSetting_ChangeCalendar.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.UU95_CalendarSetting_ChangeCalendar.toString(), uu95_calendarsetting_changecalendar.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return uU95_ChangeCalendarMendixObject;
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
			final process.proxies.UU95_ChangeCalendar that = (process.proxies.UU95_ChangeCalendar) obj;
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
		return "Process.UU95_ChangeCalendar";
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
