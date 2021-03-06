// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fusionchartsplus.proxies;

public class TrendLine
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject trendLineMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FusionChartsPlus.TrendLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		start("start"),
		end("end"),
		displayValue("displayValue"),
		color("color"),
		thickness("thickness"),
		alpha("alpha"),
		isTrendZone("isTrendZone");

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

	public TrendLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FusionChartsPlus.TrendLine"));
	}

	protected TrendLine(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject trendLineMendixObject)
	{
		if (trendLineMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FusionChartsPlus.TrendLine", trendLineMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FusionChartsPlus.TrendLine");

		this.trendLineMendixObject = trendLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TrendLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static fusionchartsplus.proxies.TrendLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fusionchartsplus.proxies.TrendLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fusionchartsplus.proxies.TrendLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fusionchartsplus.proxies.TrendLine(context, mendixObject);
	}

	public static fusionchartsplus.proxies.TrendLine load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fusionchartsplus.proxies.TrendLine.initialize(context, mendixObject);
	}

	public static java.util.List<fusionchartsplus.proxies.TrendLine> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.TrendLine> result = new java.util.ArrayList<fusionchartsplus.proxies.TrendLine>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FusionChartsPlus.TrendLine" + xpathConstraint))
			result.add(fusionchartsplus.proxies.TrendLine.initialize(context, obj));
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
	 * @return value of start
	 */
	public final java.util.Date getstart()
	{
		return getstart(getContext());
	}

	/**
	 * @param context
	 * @return value of start
	 */
	public final java.util.Date getstart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.start.toString());
	}

	/**
	 * Set value of start
	 * @param start
	 */
	public final void setstart(java.util.Date start)
	{
		setstart(getContext(), start);
	}

	/**
	 * Set value of start
	 * @param context
	 * @param start
	 */
	public final void setstart(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date start)
	{
		getMendixObject().setValue(context, MemberNames.start.toString(), start);
	}

	/**
	 * @return value of end
	 */
	public final java.util.Date getend()
	{
		return getend(getContext());
	}

	/**
	 * @param context
	 * @return value of end
	 */
	public final java.util.Date getend(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.end.toString());
	}

	/**
	 * Set value of end
	 * @param end
	 */
	public final void setend(java.util.Date end)
	{
		setend(getContext(), end);
	}

	/**
	 * Set value of end
	 * @param context
	 * @param end
	 */
	public final void setend(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date end)
	{
		getMendixObject().setValue(context, MemberNames.end.toString(), end);
	}

	/**
	 * @return value of displayValue
	 */
	public final java.lang.String getdisplayValue()
	{
		return getdisplayValue(getContext());
	}

	/**
	 * @param context
	 * @return value of displayValue
	 */
	public final java.lang.String getdisplayValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.displayValue.toString());
	}

	/**
	 * Set value of displayValue
	 * @param displayvalue
	 */
	public final void setdisplayValue(java.lang.String displayvalue)
	{
		setdisplayValue(getContext(), displayvalue);
	}

	/**
	 * Set value of displayValue
	 * @param context
	 * @param displayvalue
	 */
	public final void setdisplayValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String displayvalue)
	{
		getMendixObject().setValue(context, MemberNames.displayValue.toString(), displayvalue);
	}

	/**
	 * @return value of color
	 */
	public final java.lang.String getcolor()
	{
		return getcolor(getContext());
	}

	/**
	 * @param context
	 * @return value of color
	 */
	public final java.lang.String getcolor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.color.toString());
	}

	/**
	 * Set value of color
	 * @param color
	 */
	public final void setcolor(java.lang.String color)
	{
		setcolor(getContext(), color);
	}

	/**
	 * Set value of color
	 * @param context
	 * @param color
	 */
	public final void setcolor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String color)
	{
		getMendixObject().setValue(context, MemberNames.color.toString(), color);
	}

	/**
	 * @return value of thickness
	 */
	public final java.lang.String getthickness()
	{
		return getthickness(getContext());
	}

	/**
	 * @param context
	 * @return value of thickness
	 */
	public final java.lang.String getthickness(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.thickness.toString());
	}

	/**
	 * Set value of thickness
	 * @param thickness
	 */
	public final void setthickness(java.lang.String thickness)
	{
		setthickness(getContext(), thickness);
	}

	/**
	 * Set value of thickness
	 * @param context
	 * @param thickness
	 */
	public final void setthickness(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String thickness)
	{
		getMendixObject().setValue(context, MemberNames.thickness.toString(), thickness);
	}

	/**
	 * @return value of alpha
	 */
	public final java.lang.String getalpha()
	{
		return getalpha(getContext());
	}

	/**
	 * @param context
	 * @return value of alpha
	 */
	public final java.lang.String getalpha(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.alpha.toString());
	}

	/**
	 * Set value of alpha
	 * @param alpha
	 */
	public final void setalpha(java.lang.String alpha)
	{
		setalpha(getContext(), alpha);
	}

	/**
	 * Set value of alpha
	 * @param context
	 * @param alpha
	 */
	public final void setalpha(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String alpha)
	{
		getMendixObject().setValue(context, MemberNames.alpha.toString(), alpha);
	}

	/**
	 * @return value of isTrendZone
	 */
	public final java.lang.Boolean getisTrendZone()
	{
		return getisTrendZone(getContext());
	}

	/**
	 * @param context
	 * @return value of isTrendZone
	 */
	public final java.lang.Boolean getisTrendZone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.isTrendZone.toString());
	}

	/**
	 * Set value of isTrendZone
	 * @param istrendzone
	 */
	public final void setisTrendZone(java.lang.Boolean istrendzone)
	{
		setisTrendZone(getContext(), istrendzone);
	}

	/**
	 * Set value of isTrendZone
	 * @param context
	 * @param istrendzone
	 */
	public final void setisTrendZone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean istrendzone)
	{
		getMendixObject().setValue(context, MemberNames.isTrendZone.toString(), istrendzone);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return trendLineMendixObject;
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
			final fusionchartsplus.proxies.TrendLine that = (fusionchartsplus.proxies.TrendLine) obj;
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
		return "FusionChartsPlus.TrendLine";
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
