// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package changecalendar.proxies;

public class UU95_Day
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject uU95_DayMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ChangeCalendar.UU95_Day";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Day("Day");

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

	public UU95_Day(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ChangeCalendar.UU95_Day"));
	}

	protected UU95_Day(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject uU95_DayMendixObject)
	{
		if (uU95_DayMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ChangeCalendar.UU95_Day", uU95_DayMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ChangeCalendar.UU95_Day");

		this.uU95_DayMendixObject = uU95_DayMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'UU95_Day.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static changecalendar.proxies.UU95_Day initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return changecalendar.proxies.UU95_Day.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static changecalendar.proxies.UU95_Day initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new changecalendar.proxies.UU95_Day(context, mendixObject);
	}

	public static changecalendar.proxies.UU95_Day load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return changecalendar.proxies.UU95_Day.initialize(context, mendixObject);
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
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return uU95_DayMendixObject;
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
			final changecalendar.proxies.UU95_Day that = (changecalendar.proxies.UU95_Day) obj;
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
		return "ChangeCalendar.UU95_Day";
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