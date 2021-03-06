// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendix.proxies;

public class Year
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject yearMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Mendix.Year";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		YearStart("YearStart"),
		YearEnd("YearEnd"),
		YearString("YearString"),
		YearNumber("YearNumber");

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

	public Year(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Mendix.Year"));
	}

	protected Year(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject yearMendixObject)
	{
		if (yearMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Mendix.Year", yearMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Mendix.Year");

		this.yearMendixObject = yearMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Year.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mendix.proxies.Year initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendix.proxies.Year.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mendix.proxies.Year initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendix.proxies.Year(context, mendixObject);
	}

	public static mendix.proxies.Year load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendix.proxies.Year.initialize(context, mendixObject);
	}

	public static java.util.List<mendix.proxies.Year> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mendix.proxies.Year> result = new java.util.ArrayList<mendix.proxies.Year>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Mendix.Year" + xpathConstraint))
			result.add(mendix.proxies.Year.initialize(context, obj));
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
	 * @return value of YearStart
	 */
	public final java.util.Date getYearStart()
	{
		return getYearStart(getContext());
	}

	/**
	 * @param context
	 * @return value of YearStart
	 */
	public final java.util.Date getYearStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.YearStart.toString());
	}

	/**
	 * Set value of YearStart
	 * @param yearstart
	 */
	public final void setYearStart(java.util.Date yearstart)
	{
		setYearStart(getContext(), yearstart);
	}

	/**
	 * Set value of YearStart
	 * @param context
	 * @param yearstart
	 */
	public final void setYearStart(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date yearstart)
	{
		getMendixObject().setValue(context, MemberNames.YearStart.toString(), yearstart);
	}

	/**
	 * @return value of YearEnd
	 */
	public final java.util.Date getYearEnd()
	{
		return getYearEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of YearEnd
	 */
	public final java.util.Date getYearEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.YearEnd.toString());
	}

	/**
	 * Set value of YearEnd
	 * @param yearend
	 */
	public final void setYearEnd(java.util.Date yearend)
	{
		setYearEnd(getContext(), yearend);
	}

	/**
	 * Set value of YearEnd
	 * @param context
	 * @param yearend
	 */
	public final void setYearEnd(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date yearend)
	{
		getMendixObject().setValue(context, MemberNames.YearEnd.toString(), yearend);
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
	 * @return value of YearNumber
	 */
	public final java.lang.Integer getYearNumber()
	{
		return getYearNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of YearNumber
	 */
	public final java.lang.Integer getYearNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.YearNumber.toString());
	}

	/**
	 * Set value of YearNumber
	 * @param yearnumber
	 */
	public final void setYearNumber(java.lang.Integer yearnumber)
	{
		setYearNumber(getContext(), yearnumber);
	}

	/**
	 * Set value of YearNumber
	 * @param context
	 * @param yearnumber
	 */
	public final void setYearNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer yearnumber)
	{
		getMendixObject().setValue(context, MemberNames.YearNumber.toString(), yearnumber);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return yearMendixObject;
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
			final mendix.proxies.Year that = (mendix.proxies.Year) obj;
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
		return "Mendix.Year";
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
