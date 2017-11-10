// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package changecalendar.proxies;

public class UU95_ChangeCalendarColor
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject uU95_ChangeCalendarColorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ChangeCalendar.UU95_ChangeCalendarColor";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ColorCode("ColorCode"),
		UU95_ColorDN("UU95_ColorDN"),
		UU95_UsedFor("UU95_UsedFor"),
		ProcessType("ProcessType"),
		RequestType("RequestType"),
		UU95_WeightLow("UU95_WeightLow"),
		UU95_WeightHigh("UU95_WeightHigh");

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

	public UU95_ChangeCalendarColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ChangeCalendar.UU95_ChangeCalendarColor"));
	}

	protected UU95_ChangeCalendarColor(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject uU95_ChangeCalendarColorMendixObject)
	{
		if (uU95_ChangeCalendarColorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ChangeCalendar.UU95_ChangeCalendarColor", uU95_ChangeCalendarColorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ChangeCalendar.UU95_ChangeCalendarColor");

		this.uU95_ChangeCalendarColorMendixObject = uU95_ChangeCalendarColorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'UU95_ChangeCalendarColor.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static changecalendar.proxies.UU95_ChangeCalendarColor initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return changecalendar.proxies.UU95_ChangeCalendarColor.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static changecalendar.proxies.UU95_ChangeCalendarColor initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new changecalendar.proxies.UU95_ChangeCalendarColor(context, mendixObject);
	}

	public static changecalendar.proxies.UU95_ChangeCalendarColor load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return changecalendar.proxies.UU95_ChangeCalendarColor.initialize(context, mendixObject);
	}

	public static java.util.List<changecalendar.proxies.UU95_ChangeCalendarColor> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<changecalendar.proxies.UU95_ChangeCalendarColor> result = new java.util.ArrayList<changecalendar.proxies.UU95_ChangeCalendarColor>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ChangeCalendar.UU95_ChangeCalendarColor" + xpathConstraint))
			result.add(changecalendar.proxies.UU95_ChangeCalendarColor.initialize(context, obj));
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
	 * Set value of ColorCode
	 * @param colorcode
	 */
	public final changecalendar.proxies.ChangeCalendarColorCode getColorCode()
	{
		return getColorCode(getContext());
	}

	/**
	 * @param context
	 * @return value of ColorCode
	 */
	public final changecalendar.proxies.ChangeCalendarColorCode getColorCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ColorCode.toString());
		if (obj == null)
			return null;

		return changecalendar.proxies.ChangeCalendarColorCode.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ColorCode
	 * @param colorcode
	 */
	public final void setColorCode(changecalendar.proxies.ChangeCalendarColorCode colorcode)
	{
		setColorCode(getContext(), colorcode);
	}

	/**
	 * Set value of ColorCode
	 * @param context
	 * @param colorcode
	 */
	public final void setColorCode(com.mendix.systemwideinterfaces.core.IContext context, changecalendar.proxies.ChangeCalendarColorCode colorcode)
	{
		if (colorcode != null)
			getMendixObject().setValue(context, MemberNames.ColorCode.toString(), colorcode.toString());
		else
			getMendixObject().setValue(context, MemberNames.ColorCode.toString(), null);
	}

	/**
	 * @return value of UU95_ColorDN
	 */
	public final java.lang.String getUU95_ColorDN()
	{
		return getUU95_ColorDN(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_ColorDN
	 */
	public final java.lang.String getUU95_ColorDN(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UU95_ColorDN.toString());
	}

	/**
	 * Set value of UU95_ColorDN
	 * @param uu95_colordn
	 */
	public final void setUU95_ColorDN(java.lang.String uu95_colordn)
	{
		setUU95_ColorDN(getContext(), uu95_colordn);
	}

	/**
	 * Set value of UU95_ColorDN
	 * @param context
	 * @param uu95_colordn
	 */
	public final void setUU95_ColorDN(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uu95_colordn)
	{
		getMendixObject().setValue(context, MemberNames.UU95_ColorDN.toString(), uu95_colordn);
	}

	/**
	 * Set value of UU95_UsedFor
	 * @param uu95_usedfor
	 */
	public final changecalendar.proxies.ChangeCalendarColorUsedFor getUU95_UsedFor()
	{
		return getUU95_UsedFor(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_UsedFor
	 */
	public final changecalendar.proxies.ChangeCalendarColorUsedFor getUU95_UsedFor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.UU95_UsedFor.toString());
		if (obj == null)
			return null;

		return changecalendar.proxies.ChangeCalendarColorUsedFor.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of UU95_UsedFor
	 * @param uu95_usedfor
	 */
	public final void setUU95_UsedFor(changecalendar.proxies.ChangeCalendarColorUsedFor uu95_usedfor)
	{
		setUU95_UsedFor(getContext(), uu95_usedfor);
	}

	/**
	 * Set value of UU95_UsedFor
	 * @param context
	 * @param uu95_usedfor
	 */
	public final void setUU95_UsedFor(com.mendix.systemwideinterfaces.core.IContext context, changecalendar.proxies.ChangeCalendarColorUsedFor uu95_usedfor)
	{
		if (uu95_usedfor != null)
			getMendixObject().setValue(context, MemberNames.UU95_UsedFor.toString(), uu95_usedfor.toString());
		else
			getMendixObject().setValue(context, MemberNames.UU95_UsedFor.toString(), null);
	}

	/**
	 * Set value of ProcessType
	 * @param processtype
	 */
	public final slm.proxies.ProcessType getProcessType()
	{
		return getProcessType(getContext());
	}

	/**
	 * @param context
	 * @return value of ProcessType
	 */
	public final slm.proxies.ProcessType getProcessType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProcessType.toString());
		if (obj == null)
			return null;

		return slm.proxies.ProcessType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProcessType
	 * @param processtype
	 */
	public final void setProcessType(slm.proxies.ProcessType processtype)
	{
		setProcessType(getContext(), processtype);
	}

	/**
	 * Set value of ProcessType
	 * @param context
	 * @param processtype
	 */
	public final void setProcessType(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.ProcessType processtype)
	{
		if (processtype != null)
			getMendixObject().setValue(context, MemberNames.ProcessType.toString(), processtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProcessType.toString(), null);
	}

	/**
	 * Set value of RequestType
	 * @param requesttype
	 */
	public final process.proxies.Task_Ticket_Request getRequestType()
	{
		return getRequestType(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestType
	 */
	public final process.proxies.Task_Ticket_Request getRequestType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.RequestType.toString());
		if (obj == null)
			return null;

		return process.proxies.Task_Ticket_Request.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of RequestType
	 * @param requesttype
	 */
	public final void setRequestType(process.proxies.Task_Ticket_Request requesttype)
	{
		setRequestType(getContext(), requesttype);
	}

	/**
	 * Set value of RequestType
	 * @param context
	 * @param requesttype
	 */
	public final void setRequestType(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Task_Ticket_Request requesttype)
	{
		if (requesttype != null)
			getMendixObject().setValue(context, MemberNames.RequestType.toString(), requesttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.RequestType.toString(), null);
	}

	/**
	 * @return value of UU95_WeightLow
	 */
	public final java.lang.Integer getUU95_WeightLow()
	{
		return getUU95_WeightLow(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_WeightLow
	 */
	public final java.lang.Integer getUU95_WeightLow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.UU95_WeightLow.toString());
	}

	/**
	 * Set value of UU95_WeightLow
	 * @param uu95_weightlow
	 */
	public final void setUU95_WeightLow(java.lang.Integer uu95_weightlow)
	{
		setUU95_WeightLow(getContext(), uu95_weightlow);
	}

	/**
	 * Set value of UU95_WeightLow
	 * @param context
	 * @param uu95_weightlow
	 */
	public final void setUU95_WeightLow(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer uu95_weightlow)
	{
		getMendixObject().setValue(context, MemberNames.UU95_WeightLow.toString(), uu95_weightlow);
	}

	/**
	 * @return value of UU95_WeightHigh
	 */
	public final java.lang.Integer getUU95_WeightHigh()
	{
		return getUU95_WeightHigh(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_WeightHigh
	 */
	public final java.lang.Integer getUU95_WeightHigh(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.UU95_WeightHigh.toString());
	}

	/**
	 * Set value of UU95_WeightHigh
	 * @param uu95_weighthigh
	 */
	public final void setUU95_WeightHigh(java.lang.Integer uu95_weighthigh)
	{
		setUU95_WeightHigh(getContext(), uu95_weighthigh);
	}

	/**
	 * Set value of UU95_WeightHigh
	 * @param context
	 * @param uu95_weighthigh
	 */
	public final void setUU95_WeightHigh(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer uu95_weighthigh)
	{
		getMendixObject().setValue(context, MemberNames.UU95_WeightHigh.toString(), uu95_weighthigh);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return uU95_ChangeCalendarColorMendixObject;
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
			final changecalendar.proxies.UU95_ChangeCalendarColor that = (changecalendar.proxies.UU95_ChangeCalendarColor) obj;
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
		return "ChangeCalendar.UU95_ChangeCalendarColor";
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