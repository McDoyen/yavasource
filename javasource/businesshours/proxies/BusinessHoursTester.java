// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package businesshours.proxies;

public class BusinessHoursTester
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject businessHoursTesterMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BusinessHours.BusinessHoursTester";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Start("Start"),
		Stop("Stop"),
		Duration("Duration"),
		DurationInput("DurationInput"),
		Days("Days"),
		BusinessHoursTest_Business_Time_Group("BusinessHours.BusinessHoursTest_Business_Time_Group"),
		BusinessHoursTest_Holiday_Group("BusinessHours.BusinessHoursTest_Holiday_Group");

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

	public BusinessHoursTester(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BusinessHours.BusinessHoursTester"));
	}

	protected BusinessHoursTester(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject businessHoursTesterMendixObject)
	{
		if (businessHoursTesterMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BusinessHours.BusinessHoursTester", businessHoursTesterMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BusinessHours.BusinessHoursTester");

		this.businessHoursTesterMendixObject = businessHoursTesterMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'BusinessHoursTester.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static businesshours.proxies.BusinessHoursTester initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return businesshours.proxies.BusinessHoursTester.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static businesshours.proxies.BusinessHoursTester initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new businesshours.proxies.BusinessHoursTester(context, mendixObject);
	}

	public static businesshours.proxies.BusinessHoursTester load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return businesshours.proxies.BusinessHoursTester.initialize(context, mendixObject);
	}

	public static java.util.List<businesshours.proxies.BusinessHoursTester> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<businesshours.proxies.BusinessHoursTester> result = new java.util.ArrayList<businesshours.proxies.BusinessHoursTester>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//BusinessHours.BusinessHoursTester" + xpathConstraint))
			result.add(businesshours.proxies.BusinessHoursTester.initialize(context, obj));
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
	 * @return value of Start
	 */
	public final java.util.Date getStart()
	{
		return getStart(getContext());
	}

	/**
	 * @param context
	 * @return value of Start
	 */
	public final java.util.Date getStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Start.toString());
	}

	/**
	 * Set value of Start
	 * @param start
	 */
	public final void setStart(java.util.Date start)
	{
		setStart(getContext(), start);
	}

	/**
	 * Set value of Start
	 * @param context
	 * @param start
	 */
	public final void setStart(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date start)
	{
		getMendixObject().setValue(context, MemberNames.Start.toString(), start);
	}

	/**
	 * @return value of Stop
	 */
	public final java.util.Date getStop()
	{
		return getStop(getContext());
	}

	/**
	 * @param context
	 * @return value of Stop
	 */
	public final java.util.Date getStop(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Stop.toString());
	}

	/**
	 * Set value of Stop
	 * @param stop
	 */
	public final void setStop(java.util.Date stop)
	{
		setStop(getContext(), stop);
	}

	/**
	 * Set value of Stop
	 * @param context
	 * @param stop
	 */
	public final void setStop(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date stop)
	{
		getMendixObject().setValue(context, MemberNames.Stop.toString(), stop);
	}

	/**
	 * @return value of Duration
	 */
	public final java.lang.Long getDuration()
	{
		return getDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of Duration
	 */
	public final java.lang.Long getDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Duration.toString());
	}

	/**
	 * Set value of Duration
	 * @param duration
	 */
	public final void setDuration(java.lang.Long duration)
	{
		setDuration(getContext(), duration);
	}

	/**
	 * Set value of Duration
	 * @param context
	 * @param duration
	 */
	public final void setDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long duration)
	{
		getMendixObject().setValue(context, MemberNames.Duration.toString(), duration);
	}

	/**
	 * @return value of DurationInput
	 */
	public final java.lang.String getDurationInput()
	{
		return getDurationInput(getContext());
	}

	/**
	 * @param context
	 * @return value of DurationInput
	 */
	public final java.lang.String getDurationInput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DurationInput.toString());
	}

	/**
	 * Set value of DurationInput
	 * @param durationinput
	 */
	public final void setDurationInput(java.lang.String durationinput)
	{
		setDurationInput(getContext(), durationinput);
	}

	/**
	 * Set value of DurationInput
	 * @param context
	 * @param durationinput
	 */
	public final void setDurationInput(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String durationinput)
	{
		getMendixObject().setValue(context, MemberNames.DurationInput.toString(), durationinput);
	}

	/**
	 * @return value of Days
	 */
	public final java.lang.Integer getDays()
	{
		return getDays(getContext());
	}

	/**
	 * @param context
	 * @return value of Days
	 */
	public final java.lang.Integer getDays(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Days.toString());
	}

	/**
	 * Set value of Days
	 * @param days
	 */
	public final void setDays(java.lang.Integer days)
	{
		setDays(getContext(), days);
	}

	/**
	 * Set value of Days
	 * @param context
	 * @param days
	 */
	public final void setDays(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer days)
	{
		getMendixObject().setValue(context, MemberNames.Days.toString(), days);
	}

	/**
	 * @return value of BusinessHoursTest_Business_Time_Group
	 */
	public final businesshours.proxies.Business_Time_Group getBusinessHoursTest_Business_Time_Group() throws com.mendix.core.CoreException
	{
		return getBusinessHoursTest_Business_Time_Group(getContext());
	}

	/**
	 * @param context
	 * @return value of BusinessHoursTest_Business_Time_Group
	 */
	public final businesshours.proxies.Business_Time_Group getBusinessHoursTest_Business_Time_Group(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		businesshours.proxies.Business_Time_Group result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BusinessHoursTest_Business_Time_Group.toString());
		if (identifier != null)
			result = businesshours.proxies.Business_Time_Group.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BusinessHoursTest_Business_Time_Group
	 * @param businesshourstest_business_time_group
	 */
	public final void setBusinessHoursTest_Business_Time_Group(businesshours.proxies.Business_Time_Group businesshourstest_business_time_group)
	{
		setBusinessHoursTest_Business_Time_Group(getContext(), businesshourstest_business_time_group);
	}

	/**
	 * Set value of BusinessHoursTest_Business_Time_Group
	 * @param context
	 * @param businesshourstest_business_time_group
	 */
	public final void setBusinessHoursTest_Business_Time_Group(com.mendix.systemwideinterfaces.core.IContext context, businesshours.proxies.Business_Time_Group businesshourstest_business_time_group)
	{
		if (businesshourstest_business_time_group == null)
			getMendixObject().setValue(context, MemberNames.BusinessHoursTest_Business_Time_Group.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BusinessHoursTest_Business_Time_Group.toString(), businesshourstest_business_time_group.getMendixObject().getId());
	}

	/**
	 * @return value of BusinessHoursTest_Holiday_Group
	 */
	public final businesshours.proxies.Holidays_Group getBusinessHoursTest_Holiday_Group() throws com.mendix.core.CoreException
	{
		return getBusinessHoursTest_Holiday_Group(getContext());
	}

	/**
	 * @param context
	 * @return value of BusinessHoursTest_Holiday_Group
	 */
	public final businesshours.proxies.Holidays_Group getBusinessHoursTest_Holiday_Group(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		businesshours.proxies.Holidays_Group result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BusinessHoursTest_Holiday_Group.toString());
		if (identifier != null)
			result = businesshours.proxies.Holidays_Group.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BusinessHoursTest_Holiday_Group
	 * @param businesshourstest_holiday_group
	 */
	public final void setBusinessHoursTest_Holiday_Group(businesshours.proxies.Holidays_Group businesshourstest_holiday_group)
	{
		setBusinessHoursTest_Holiday_Group(getContext(), businesshourstest_holiday_group);
	}

	/**
	 * Set value of BusinessHoursTest_Holiday_Group
	 * @param context
	 * @param businesshourstest_holiday_group
	 */
	public final void setBusinessHoursTest_Holiday_Group(com.mendix.systemwideinterfaces.core.IContext context, businesshours.proxies.Holidays_Group businesshourstest_holiday_group)
	{
		if (businesshourstest_holiday_group == null)
			getMendixObject().setValue(context, MemberNames.BusinessHoursTest_Holiday_Group.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BusinessHoursTest_Holiday_Group.toString(), businesshourstest_holiday_group.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return businessHoursTesterMendixObject;
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
			final businesshours.proxies.BusinessHoursTester that = (businesshours.proxies.BusinessHoursTester) obj;
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
		return "BusinessHours.BusinessHoursTester";
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
