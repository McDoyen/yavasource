// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package businesshours.proxies;

public class Business_Time
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject business_TimeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BusinessHours.Business_Time";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Start("Start"),
		End("End"),
		BusinessTimeName("BusinessTimeName"),
		Monday("Monday"),
		Tuesday("Tuesday"),
		Wednesday("Wednesday"),
		Thursday("Thursday"),
		Friday("Friday"),
		Saturday("Saturday"),
		Sunday("Sunday"),
		StartStr("StartStr"),
		EndStr("EndStr");

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

	public Business_Time(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BusinessHours.Business_Time"));
	}

	protected Business_Time(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject business_TimeMendixObject)
	{
		if (business_TimeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BusinessHours.Business_Time", business_TimeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BusinessHours.Business_Time");

		this.business_TimeMendixObject = business_TimeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Business_Time.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static businesshours.proxies.Business_Time initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return businesshours.proxies.Business_Time.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static businesshours.proxies.Business_Time initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new businesshours.proxies.Business_Time(context, mendixObject);
	}

	public static businesshours.proxies.Business_Time load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return businesshours.proxies.Business_Time.initialize(context, mendixObject);
	}

	public static java.util.List<businesshours.proxies.Business_Time> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<businesshours.proxies.Business_Time> result = new java.util.ArrayList<businesshours.proxies.Business_Time>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//BusinessHours.Business_Time" + xpathConstraint))
			result.add(businesshours.proxies.Business_Time.initialize(context, obj));
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
	public final java.lang.Integer getStart()
	{
		return getStart(getContext());
	}

	/**
	 * @param context
	 * @return value of Start
	 */
	public final java.lang.Integer getStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Start.toString());
	}

	/**
	 * Set value of Start
	 * @param start
	 */
	public final void setStart(java.lang.Integer start)
	{
		setStart(getContext(), start);
	}

	/**
	 * Set value of Start
	 * @param context
	 * @param start
	 */
	public final void setStart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer start)
	{
		getMendixObject().setValue(context, MemberNames.Start.toString(), start);
	}

	/**
	 * @return value of End
	 */
	public final java.lang.Integer getEnd()
	{
		return getEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of End
	 */
	public final java.lang.Integer getEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.End.toString());
	}

	/**
	 * Set value of End
	 * @param end
	 */
	public final void setEnd(java.lang.Integer end)
	{
		setEnd(getContext(), end);
	}

	/**
	 * Set value of End
	 * @param context
	 * @param end
	 */
	public final void setEnd(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer end)
	{
		getMendixObject().setValue(context, MemberNames.End.toString(), end);
	}

	/**
	 * @return value of BusinessTimeName
	 */
	public final java.lang.String getBusinessTimeName()
	{
		return getBusinessTimeName(getContext());
	}

	/**
	 * @param context
	 * @return value of BusinessTimeName
	 */
	public final java.lang.String getBusinessTimeName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BusinessTimeName.toString());
	}

	/**
	 * Set value of BusinessTimeName
	 * @param businesstimename
	 */
	public final void setBusinessTimeName(java.lang.String businesstimename)
	{
		setBusinessTimeName(getContext(), businesstimename);
	}

	/**
	 * Set value of BusinessTimeName
	 * @param context
	 * @param businesstimename
	 */
	public final void setBusinessTimeName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String businesstimename)
	{
		getMendixObject().setValue(context, MemberNames.BusinessTimeName.toString(), businesstimename);
	}

	/**
	 * @return value of Monday
	 */
	public final java.lang.Boolean getMonday()
	{
		return getMonday(getContext());
	}

	/**
	 * @param context
	 * @return value of Monday
	 */
	public final java.lang.Boolean getMonday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Monday.toString());
	}

	/**
	 * Set value of Monday
	 * @param monday
	 */
	public final void setMonday(java.lang.Boolean monday)
	{
		setMonday(getContext(), monday);
	}

	/**
	 * Set value of Monday
	 * @param context
	 * @param monday
	 */
	public final void setMonday(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean monday)
	{
		getMendixObject().setValue(context, MemberNames.Monday.toString(), monday);
	}

	/**
	 * @return value of Tuesday
	 */
	public final java.lang.Boolean getTuesday()
	{
		return getTuesday(getContext());
	}

	/**
	 * @param context
	 * @return value of Tuesday
	 */
	public final java.lang.Boolean getTuesday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Tuesday.toString());
	}

	/**
	 * Set value of Tuesday
	 * @param tuesday
	 */
	public final void setTuesday(java.lang.Boolean tuesday)
	{
		setTuesday(getContext(), tuesday);
	}

	/**
	 * Set value of Tuesday
	 * @param context
	 * @param tuesday
	 */
	public final void setTuesday(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean tuesday)
	{
		getMendixObject().setValue(context, MemberNames.Tuesday.toString(), tuesday);
	}

	/**
	 * @return value of Wednesday
	 */
	public final java.lang.Boolean getWednesday()
	{
		return getWednesday(getContext());
	}

	/**
	 * @param context
	 * @return value of Wednesday
	 */
	public final java.lang.Boolean getWednesday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Wednesday.toString());
	}

	/**
	 * Set value of Wednesday
	 * @param wednesday
	 */
	public final void setWednesday(java.lang.Boolean wednesday)
	{
		setWednesday(getContext(), wednesday);
	}

	/**
	 * Set value of Wednesday
	 * @param context
	 * @param wednesday
	 */
	public final void setWednesday(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean wednesday)
	{
		getMendixObject().setValue(context, MemberNames.Wednesday.toString(), wednesday);
	}

	/**
	 * @return value of Thursday
	 */
	public final java.lang.Boolean getThursday()
	{
		return getThursday(getContext());
	}

	/**
	 * @param context
	 * @return value of Thursday
	 */
	public final java.lang.Boolean getThursday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Thursday.toString());
	}

	/**
	 * Set value of Thursday
	 * @param thursday
	 */
	public final void setThursday(java.lang.Boolean thursday)
	{
		setThursday(getContext(), thursday);
	}

	/**
	 * Set value of Thursday
	 * @param context
	 * @param thursday
	 */
	public final void setThursday(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean thursday)
	{
		getMendixObject().setValue(context, MemberNames.Thursday.toString(), thursday);
	}

	/**
	 * @return value of Friday
	 */
	public final java.lang.Boolean getFriday()
	{
		return getFriday(getContext());
	}

	/**
	 * @param context
	 * @return value of Friday
	 */
	public final java.lang.Boolean getFriday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Friday.toString());
	}

	/**
	 * Set value of Friday
	 * @param friday
	 */
	public final void setFriday(java.lang.Boolean friday)
	{
		setFriday(getContext(), friday);
	}

	/**
	 * Set value of Friday
	 * @param context
	 * @param friday
	 */
	public final void setFriday(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean friday)
	{
		getMendixObject().setValue(context, MemberNames.Friday.toString(), friday);
	}

	/**
	 * @return value of Saturday
	 */
	public final java.lang.Boolean getSaturday()
	{
		return getSaturday(getContext());
	}

	/**
	 * @param context
	 * @return value of Saturday
	 */
	public final java.lang.Boolean getSaturday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Saturday.toString());
	}

	/**
	 * Set value of Saturday
	 * @param saturday
	 */
	public final void setSaturday(java.lang.Boolean saturday)
	{
		setSaturday(getContext(), saturday);
	}

	/**
	 * Set value of Saturday
	 * @param context
	 * @param saturday
	 */
	public final void setSaturday(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean saturday)
	{
		getMendixObject().setValue(context, MemberNames.Saturday.toString(), saturday);
	}

	/**
	 * @return value of Sunday
	 */
	public final java.lang.Boolean getSunday()
	{
		return getSunday(getContext());
	}

	/**
	 * @param context
	 * @return value of Sunday
	 */
	public final java.lang.Boolean getSunday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Sunday.toString());
	}

	/**
	 * Set value of Sunday
	 * @param sunday
	 */
	public final void setSunday(java.lang.Boolean sunday)
	{
		setSunday(getContext(), sunday);
	}

	/**
	 * Set value of Sunday
	 * @param context
	 * @param sunday
	 */
	public final void setSunday(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean sunday)
	{
		getMendixObject().setValue(context, MemberNames.Sunday.toString(), sunday);
	}

	/**
	 * @return value of StartStr
	 */
	public final java.lang.String getStartStr()
	{
		return getStartStr(getContext());
	}

	/**
	 * @param context
	 * @return value of StartStr
	 */
	public final java.lang.String getStartStr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StartStr.toString());
	}

	/**
	 * Set value of StartStr
	 * @param startstr
	 */
	public final void setStartStr(java.lang.String startstr)
	{
		setStartStr(getContext(), startstr);
	}

	/**
	 * Set value of StartStr
	 * @param context
	 * @param startstr
	 */
	public final void setStartStr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String startstr)
	{
		getMendixObject().setValue(context, MemberNames.StartStr.toString(), startstr);
	}

	/**
	 * @return value of EndStr
	 */
	public final java.lang.String getEndStr()
	{
		return getEndStr(getContext());
	}

	/**
	 * @param context
	 * @return value of EndStr
	 */
	public final java.lang.String getEndStr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EndStr.toString());
	}

	/**
	 * Set value of EndStr
	 * @param endstr
	 */
	public final void setEndStr(java.lang.String endstr)
	{
		setEndStr(getContext(), endstr);
	}

	/**
	 * Set value of EndStr
	 * @param context
	 * @param endstr
	 */
	public final void setEndStr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String endstr)
	{
		getMendixObject().setValue(context, MemberNames.EndStr.toString(), endstr);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return business_TimeMendixObject;
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
			final businesshours.proxies.Business_Time that = (businesshours.proxies.Business_Time) obj;
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
		return "BusinessHours.Business_Time";
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