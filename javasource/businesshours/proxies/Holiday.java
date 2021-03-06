// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package businesshours.proxies;

public class Holiday
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject holidayMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BusinessHours.Holiday";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HolidayName("HolidayName"),
		HolidayDate("HolidayDate");

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

	public Holiday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BusinessHours.Holiday"));
	}

	protected Holiday(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject holidayMendixObject)
	{
		if (holidayMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BusinessHours.Holiday", holidayMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BusinessHours.Holiday");

		this.holidayMendixObject = holidayMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Holiday.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static businesshours.proxies.Holiday initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return businesshours.proxies.Holiday.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static businesshours.proxies.Holiday initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new businesshours.proxies.Holiday(context, mendixObject);
	}

	public static businesshours.proxies.Holiday load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return businesshours.proxies.Holiday.initialize(context, mendixObject);
	}

	public static java.util.List<businesshours.proxies.Holiday> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<businesshours.proxies.Holiday> result = new java.util.ArrayList<businesshours.proxies.Holiday>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//BusinessHours.Holiday" + xpathConstraint))
			result.add(businesshours.proxies.Holiday.initialize(context, obj));
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
	 * @return value of HolidayName
	 */
	public final java.lang.String getHolidayName()
	{
		return getHolidayName(getContext());
	}

	/**
	 * @param context
	 * @return value of HolidayName
	 */
	public final java.lang.String getHolidayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HolidayName.toString());
	}

	/**
	 * Set value of HolidayName
	 * @param holidayname
	 */
	public final void setHolidayName(java.lang.String holidayname)
	{
		setHolidayName(getContext(), holidayname);
	}

	/**
	 * Set value of HolidayName
	 * @param context
	 * @param holidayname
	 */
	public final void setHolidayName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String holidayname)
	{
		getMendixObject().setValue(context, MemberNames.HolidayName.toString(), holidayname);
	}

	/**
	 * @return value of HolidayDate
	 */
	public final java.util.Date getHolidayDate()
	{
		return getHolidayDate(getContext());
	}

	/**
	 * @param context
	 * @return value of HolidayDate
	 */
	public final java.util.Date getHolidayDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.HolidayDate.toString());
	}

	/**
	 * Set value of HolidayDate
	 * @param holidaydate
	 */
	public final void setHolidayDate(java.util.Date holidaydate)
	{
		setHolidayDate(getContext(), holidaydate);
	}

	/**
	 * Set value of HolidayDate
	 * @param context
	 * @param holidaydate
	 */
	public final void setHolidayDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date holidaydate)
	{
		getMendixObject().setValue(context, MemberNames.HolidayDate.toString(), holidaydate);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return holidayMendixObject;
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
			final businesshours.proxies.Holiday that = (businesshours.proxies.Holiday) obj;
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
		return "BusinessHours.Holiday";
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
