// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendix.proxies;

public class DayWeekMonthSettings
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dayWeekMonthSettingsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Mendix.DayWeekMonthSettings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		StartYear("StartYear"),
		EndYear("EndYear");

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

	public DayWeekMonthSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Mendix.DayWeekMonthSettings"));
	}

	protected DayWeekMonthSettings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dayWeekMonthSettingsMendixObject)
	{
		if (dayWeekMonthSettingsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Mendix.DayWeekMonthSettings", dayWeekMonthSettingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Mendix.DayWeekMonthSettings");

		this.dayWeekMonthSettingsMendixObject = dayWeekMonthSettingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DayWeekMonthSettings.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mendix.proxies.DayWeekMonthSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendix.proxies.DayWeekMonthSettings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mendix.proxies.DayWeekMonthSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendix.proxies.DayWeekMonthSettings(context, mendixObject);
	}

	public static mendix.proxies.DayWeekMonthSettings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendix.proxies.DayWeekMonthSettings.initialize(context, mendixObject);
	}

	public static java.util.List<mendix.proxies.DayWeekMonthSettings> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mendix.proxies.DayWeekMonthSettings> result = new java.util.ArrayList<mendix.proxies.DayWeekMonthSettings>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Mendix.DayWeekMonthSettings" + xpathConstraint))
			result.add(mendix.proxies.DayWeekMonthSettings.initialize(context, obj));
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
	 * @return value of StartYear
	 */
	public final java.lang.Integer getStartYear()
	{
		return getStartYear(getContext());
	}

	/**
	 * @param context
	 * @return value of StartYear
	 */
	public final java.lang.Integer getStartYear(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.StartYear.toString());
	}

	/**
	 * Set value of StartYear
	 * @param startyear
	 */
	public final void setStartYear(java.lang.Integer startyear)
	{
		setStartYear(getContext(), startyear);
	}

	/**
	 * Set value of StartYear
	 * @param context
	 * @param startyear
	 */
	public final void setStartYear(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer startyear)
	{
		getMendixObject().setValue(context, MemberNames.StartYear.toString(), startyear);
	}

	/**
	 * @return value of EndYear
	 */
	public final java.lang.Integer getEndYear()
	{
		return getEndYear(getContext());
	}

	/**
	 * @param context
	 * @return value of EndYear
	 */
	public final java.lang.Integer getEndYear(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.EndYear.toString());
	}

	/**
	 * Set value of EndYear
	 * @param endyear
	 */
	public final void setEndYear(java.lang.Integer endyear)
	{
		setEndYear(getContext(), endyear);
	}

	/**
	 * Set value of EndYear
	 * @param context
	 * @param endyear
	 */
	public final void setEndYear(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer endyear)
	{
		getMendixObject().setValue(context, MemberNames.EndYear.toString(), endyear);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dayWeekMonthSettingsMendixObject;
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
			final mendix.proxies.DayWeekMonthSettings that = (mendix.proxies.DayWeekMonthSettings) obj;
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
		return "Mendix.DayWeekMonthSettings";
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
