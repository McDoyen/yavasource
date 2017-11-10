// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package businesshours.proxies;

public class Holidays_Group
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject holidays_GroupMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BusinessHours.Holidays_Group";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HolidaysGroupName("HolidaysGroupName"),
		Holiday_Group_Holidays("BusinessHours.Holiday_Group_Holidays"),
		Holidays_Group_DataAccess("BusinessHours.Holidays_Group_DataAccess");

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

	public Holidays_Group(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BusinessHours.Holidays_Group"));
	}

	protected Holidays_Group(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject holidays_GroupMendixObject)
	{
		if (holidays_GroupMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BusinessHours.Holidays_Group", holidays_GroupMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BusinessHours.Holidays_Group");

		this.holidays_GroupMendixObject = holidays_GroupMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Holidays_Group.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static businesshours.proxies.Holidays_Group initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return businesshours.proxies.Holidays_Group.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static businesshours.proxies.Holidays_Group initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new businesshours.proxies.Holidays_Group(context, mendixObject);
	}

	public static businesshours.proxies.Holidays_Group load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return businesshours.proxies.Holidays_Group.initialize(context, mendixObject);
	}

	public static java.util.List<businesshours.proxies.Holidays_Group> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<businesshours.proxies.Holidays_Group> result = new java.util.ArrayList<businesshours.proxies.Holidays_Group>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//BusinessHours.Holidays_Group" + xpathConstraint))
			result.add(businesshours.proxies.Holidays_Group.initialize(context, obj));
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
	 * @return value of HolidaysGroupName
	 */
	public final java.lang.String getHolidaysGroupName()
	{
		return getHolidaysGroupName(getContext());
	}

	/**
	 * @param context
	 * @return value of HolidaysGroupName
	 */
	public final java.lang.String getHolidaysGroupName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HolidaysGroupName.toString());
	}

	/**
	 * Set value of HolidaysGroupName
	 * @param holidaysgroupname
	 */
	public final void setHolidaysGroupName(java.lang.String holidaysgroupname)
	{
		setHolidaysGroupName(getContext(), holidaysgroupname);
	}

	/**
	 * Set value of HolidaysGroupName
	 * @param context
	 * @param holidaysgroupname
	 */
	public final void setHolidaysGroupName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String holidaysgroupname)
	{
		getMendixObject().setValue(context, MemberNames.HolidaysGroupName.toString(), holidaysgroupname);
	}

	/**
	 * @return value of Holiday_Group_Holidays
	 */
	public final java.util.List<businesshours.proxies.Holiday> getHoliday_Group_Holidays() throws com.mendix.core.CoreException
	{
		return getHoliday_Group_Holidays(getContext());
	}

	/**
	 * @param context
	 * @return value of Holiday_Group_Holidays
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<businesshours.proxies.Holiday> getHoliday_Group_Holidays(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<businesshours.proxies.Holiday> result = new java.util.ArrayList<businesshours.proxies.Holiday>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Holiday_Group_Holidays.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(businesshours.proxies.Holiday.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Holiday_Group_Holidays
	 * @param holiday_group_holidays
	 */
	public final void setHoliday_Group_Holidays(java.util.List<businesshours.proxies.Holiday> holiday_group_holidays)
	{
		setHoliday_Group_Holidays(getContext(), holiday_group_holidays);
	}

	/**
	 * Set value of Holiday_Group_Holidays
	 * @param context
	 * @param holiday_group_holidays
	 */
	public final void setHoliday_Group_Holidays(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<businesshours.proxies.Holiday> holiday_group_holidays)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (businesshours.proxies.Holiday proxyObject : holiday_group_holidays)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Holiday_Group_Holidays.toString(), identifiers);
	}

	/**
	 * @return value of Holidays_Group_DataAccess
	 */
	public final java.util.List<da.proxies.Label> getHolidays_Group_DataAccess() throws com.mendix.core.CoreException
	{
		return getHolidays_Group_DataAccess(getContext());
	}

	/**
	 * @param context
	 * @return value of Holidays_Group_DataAccess
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<da.proxies.Label> getHolidays_Group_DataAccess(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<da.proxies.Label> result = new java.util.ArrayList<da.proxies.Label>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Holidays_Group_DataAccess.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(da.proxies.Label.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Holidays_Group_DataAccess
	 * @param holidays_group_dataaccess
	 */
	public final void setHolidays_Group_DataAccess(java.util.List<da.proxies.Label> holidays_group_dataaccess)
	{
		setHolidays_Group_DataAccess(getContext(), holidays_group_dataaccess);
	}

	/**
	 * Set value of Holidays_Group_DataAccess
	 * @param context
	 * @param holidays_group_dataaccess
	 */
	public final void setHolidays_Group_DataAccess(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<da.proxies.Label> holidays_group_dataaccess)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (da.proxies.Label proxyObject : holidays_group_dataaccess)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Holidays_Group_DataAccess.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return holidays_GroupMendixObject;
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
			final businesshours.proxies.Holidays_Group that = (businesshours.proxies.Holidays_Group) obj;
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
		return "BusinessHours.Holidays_Group";
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
