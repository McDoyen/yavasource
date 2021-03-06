// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendix.proxies;

public class Week
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject weekMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Mendix.Week";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		WeekStart("WeekStart"),
		WeekEnd("WeekEnd"),
		WeekString("WeekString"),
		WeekNumber("WeekNumber"),
		YearString("YearString");

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

	public Week(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Mendix.Week"));
	}

	protected Week(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject weekMendixObject)
	{
		if (weekMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Mendix.Week", weekMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Mendix.Week");

		this.weekMendixObject = weekMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Week.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mendix.proxies.Week initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendix.proxies.Week.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mendix.proxies.Week initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendix.proxies.Week(context, mendixObject);
	}

	public static mendix.proxies.Week load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendix.proxies.Week.initialize(context, mendixObject);
	}

	public static java.util.List<mendix.proxies.Week> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mendix.proxies.Week> result = new java.util.ArrayList<mendix.proxies.Week>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Mendix.Week" + xpathConstraint))
			result.add(mendix.proxies.Week.initialize(context, obj));
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
	 * @return value of WeekStart
	 */
	public final java.util.Date getWeekStart()
	{
		return getWeekStart(getContext());
	}

	/**
	 * @param context
	 * @return value of WeekStart
	 */
	public final java.util.Date getWeekStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.WeekStart.toString());
	}

	/**
	 * Set value of WeekStart
	 * @param weekstart
	 */
	public final void setWeekStart(java.util.Date weekstart)
	{
		setWeekStart(getContext(), weekstart);
	}

	/**
	 * Set value of WeekStart
	 * @param context
	 * @param weekstart
	 */
	public final void setWeekStart(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date weekstart)
	{
		getMendixObject().setValue(context, MemberNames.WeekStart.toString(), weekstart);
	}

	/**
	 * @return value of WeekEnd
	 */
	public final java.util.Date getWeekEnd()
	{
		return getWeekEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of WeekEnd
	 */
	public final java.util.Date getWeekEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.WeekEnd.toString());
	}

	/**
	 * Set value of WeekEnd
	 * @param weekend
	 */
	public final void setWeekEnd(java.util.Date weekend)
	{
		setWeekEnd(getContext(), weekend);
	}

	/**
	 * Set value of WeekEnd
	 * @param context
	 * @param weekend
	 */
	public final void setWeekEnd(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date weekend)
	{
		getMendixObject().setValue(context, MemberNames.WeekEnd.toString(), weekend);
	}

	/**
	 * @return value of WeekString
	 */
	public final java.lang.String getWeekString()
	{
		return getWeekString(getContext());
	}

	/**
	 * @param context
	 * @return value of WeekString
	 */
	public final java.lang.String getWeekString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.WeekString.toString());
	}

	/**
	 * Set value of WeekString
	 * @param weekstring
	 */
	public final void setWeekString(java.lang.String weekstring)
	{
		setWeekString(getContext(), weekstring);
	}

	/**
	 * Set value of WeekString
	 * @param context
	 * @param weekstring
	 */
	public final void setWeekString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String weekstring)
	{
		getMendixObject().setValue(context, MemberNames.WeekString.toString(), weekstring);
	}

	/**
	 * @return value of WeekNumber
	 */
	public final java.lang.Integer getWeekNumber()
	{
		return getWeekNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of WeekNumber
	 */
	public final java.lang.Integer getWeekNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.WeekNumber.toString());
	}

	/**
	 * Set value of WeekNumber
	 * @param weeknumber
	 */
	public final void setWeekNumber(java.lang.Integer weeknumber)
	{
		setWeekNumber(getContext(), weeknumber);
	}

	/**
	 * Set value of WeekNumber
	 * @param context
	 * @param weeknumber
	 */
	public final void setWeekNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer weeknumber)
	{
		getMendixObject().setValue(context, MemberNames.WeekNumber.toString(), weeknumber);
	}

	/**
	 * @return value of YearString
	 */
	public final java.lang.String getYearString()
	{
		return getYearString(getContext());
	}

	/**
	 * @param context
	 * @return value of YearString
	 */
	public final java.lang.String getYearString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.YearString.toString());
	}

	/**
	 * Set value of YearString
	 * @param yearstring
	 */
	public final void setYearString(java.lang.String yearstring)
	{
		setYearString(getContext(), yearstring);
	}

	/**
	 * Set value of YearString
	 * @param context
	 * @param yearstring
	 */
	public final void setYearString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String yearstring)
	{
		getMendixObject().setValue(context, MemberNames.YearString.toString(), yearstring);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return weekMendixObject;
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
			final mendix.proxies.Week that = (mendix.proxies.Week) obj;
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
		return "Mendix.Week";
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
