// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fusionchartsplus.proxies;

public class GanttDataTable
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject ganttDataTableMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FusionChartsPlus.GanttDataTable";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		bgColor("bgColor"),
		bgAlpha("bgAlpha"),
		font("font"),
		fontsize("fontsize"),
		fontColor("fontColor"),
		isBold("isBold"),
		headeralign("headeralign"),
		align("align"),
		headerVAlign("headerVAlign"),
		headerFontSize("headerFontSize"),
		headerFontColor("headerFontColor"),
		GanttDataTable_GanttDataColumn("FusionChartsPlus.GanttDataTable_GanttDataColumn");

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

	public GanttDataTable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FusionChartsPlus.GanttDataTable"));
	}

	protected GanttDataTable(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject ganttDataTableMendixObject)
	{
		if (ganttDataTableMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FusionChartsPlus.GanttDataTable", ganttDataTableMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FusionChartsPlus.GanttDataTable");

		this.ganttDataTableMendixObject = ganttDataTableMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'GanttDataTable.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static fusionchartsplus.proxies.GanttDataTable initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fusionchartsplus.proxies.GanttDataTable.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fusionchartsplus.proxies.GanttDataTable initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fusionchartsplus.proxies.GanttDataTable(context, mendixObject);
	}

	public static fusionchartsplus.proxies.GanttDataTable load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fusionchartsplus.proxies.GanttDataTable.initialize(context, mendixObject);
	}

	public static java.util.List<fusionchartsplus.proxies.GanttDataTable> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.GanttDataTable> result = new java.util.ArrayList<fusionchartsplus.proxies.GanttDataTable>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FusionChartsPlus.GanttDataTable" + xpathConstraint))
			result.add(fusionchartsplus.proxies.GanttDataTable.initialize(context, obj));
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
	 * @return value of bgColor
	 */
	public final java.lang.String getbgColor()
	{
		return getbgColor(getContext());
	}

	/**
	 * @param context
	 * @return value of bgColor
	 */
	public final java.lang.String getbgColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.bgColor.toString());
	}

	/**
	 * Set value of bgColor
	 * @param bgcolor
	 */
	public final void setbgColor(java.lang.String bgcolor)
	{
		setbgColor(getContext(), bgcolor);
	}

	/**
	 * Set value of bgColor
	 * @param context
	 * @param bgcolor
	 */
	public final void setbgColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bgcolor)
	{
		getMendixObject().setValue(context, MemberNames.bgColor.toString(), bgcolor);
	}

	/**
	 * @return value of bgAlpha
	 */
	public final java.lang.String getbgAlpha()
	{
		return getbgAlpha(getContext());
	}

	/**
	 * @param context
	 * @return value of bgAlpha
	 */
	public final java.lang.String getbgAlpha(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.bgAlpha.toString());
	}

	/**
	 * Set value of bgAlpha
	 * @param bgalpha
	 */
	public final void setbgAlpha(java.lang.String bgalpha)
	{
		setbgAlpha(getContext(), bgalpha);
	}

	/**
	 * Set value of bgAlpha
	 * @param context
	 * @param bgalpha
	 */
	public final void setbgAlpha(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bgalpha)
	{
		getMendixObject().setValue(context, MemberNames.bgAlpha.toString(), bgalpha);
	}

	/**
	 * @return value of font
	 */
	public final java.lang.String getfont()
	{
		return getfont(getContext());
	}

	/**
	 * @param context
	 * @return value of font
	 */
	public final java.lang.String getfont(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.font.toString());
	}

	/**
	 * Set value of font
	 * @param font
	 */
	public final void setfont(java.lang.String font)
	{
		setfont(getContext(), font);
	}

	/**
	 * Set value of font
	 * @param context
	 * @param font
	 */
	public final void setfont(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String font)
	{
		getMendixObject().setValue(context, MemberNames.font.toString(), font);
	}

	/**
	 * @return value of fontsize
	 */
	public final java.lang.String getfontsize()
	{
		return getfontsize(getContext());
	}

	/**
	 * @param context
	 * @return value of fontsize
	 */
	public final java.lang.String getfontsize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.fontsize.toString());
	}

	/**
	 * Set value of fontsize
	 * @param fontsize
	 */
	public final void setfontsize(java.lang.String fontsize)
	{
		setfontsize(getContext(), fontsize);
	}

	/**
	 * Set value of fontsize
	 * @param context
	 * @param fontsize
	 */
	public final void setfontsize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fontsize)
	{
		getMendixObject().setValue(context, MemberNames.fontsize.toString(), fontsize);
	}

	/**
	 * @return value of fontColor
	 */
	public final java.lang.String getfontColor()
	{
		return getfontColor(getContext());
	}

	/**
	 * @param context
	 * @return value of fontColor
	 */
	public final java.lang.String getfontColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.fontColor.toString());
	}

	/**
	 * Set value of fontColor
	 * @param fontcolor
	 */
	public final void setfontColor(java.lang.String fontcolor)
	{
		setfontColor(getContext(), fontcolor);
	}

	/**
	 * Set value of fontColor
	 * @param context
	 * @param fontcolor
	 */
	public final void setfontColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fontcolor)
	{
		getMendixObject().setValue(context, MemberNames.fontColor.toString(), fontcolor);
	}

	/**
	 * @return value of isBold
	 */
	public final java.lang.Boolean getisBold()
	{
		return getisBold(getContext());
	}

	/**
	 * @param context
	 * @return value of isBold
	 */
	public final java.lang.Boolean getisBold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.isBold.toString());
	}

	/**
	 * Set value of isBold
	 * @param isbold
	 */
	public final void setisBold(java.lang.Boolean isbold)
	{
		setisBold(getContext(), isbold);
	}

	/**
	 * Set value of isBold
	 * @param context
	 * @param isbold
	 */
	public final void setisBold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isbold)
	{
		getMendixObject().setValue(context, MemberNames.isBold.toString(), isbold);
	}

	/**
	 * Set value of headeralign
	 * @param headeralign
	 */
	public final fusionchartsplus.proxies.Alignment getheaderalign()
	{
		return getheaderalign(getContext());
	}

	/**
	 * @param context
	 * @return value of headeralign
	 */
	public final fusionchartsplus.proxies.Alignment getheaderalign(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.headeralign.toString());
		if (obj == null)
			return null;

		return fusionchartsplus.proxies.Alignment.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of headeralign
	 * @param headeralign
	 */
	public final void setheaderalign(fusionchartsplus.proxies.Alignment headeralign)
	{
		setheaderalign(getContext(), headeralign);
	}

	/**
	 * Set value of headeralign
	 * @param context
	 * @param headeralign
	 */
	public final void setheaderalign(com.mendix.systemwideinterfaces.core.IContext context, fusionchartsplus.proxies.Alignment headeralign)
	{
		if (headeralign != null)
			getMendixObject().setValue(context, MemberNames.headeralign.toString(), headeralign.toString());
		else
			getMendixObject().setValue(context, MemberNames.headeralign.toString(), null);
	}

	/**
	 * Set value of align
	 * @param align
	 */
	public final fusionchartsplus.proxies.Alignment getalign()
	{
		return getalign(getContext());
	}

	/**
	 * @param context
	 * @return value of align
	 */
	public final fusionchartsplus.proxies.Alignment getalign(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.align.toString());
		if (obj == null)
			return null;

		return fusionchartsplus.proxies.Alignment.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of align
	 * @param align
	 */
	public final void setalign(fusionchartsplus.proxies.Alignment align)
	{
		setalign(getContext(), align);
	}

	/**
	 * Set value of align
	 * @param context
	 * @param align
	 */
	public final void setalign(com.mendix.systemwideinterfaces.core.IContext context, fusionchartsplus.proxies.Alignment align)
	{
		if (align != null)
			getMendixObject().setValue(context, MemberNames.align.toString(), align.toString());
		else
			getMendixObject().setValue(context, MemberNames.align.toString(), null);
	}

	/**
	 * Set value of headerVAlign
	 * @param headervalign
	 */
	public final fusionchartsplus.proxies.Alignment getheaderVAlign()
	{
		return getheaderVAlign(getContext());
	}

	/**
	 * @param context
	 * @return value of headerVAlign
	 */
	public final fusionchartsplus.proxies.Alignment getheaderVAlign(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.headerVAlign.toString());
		if (obj == null)
			return null;

		return fusionchartsplus.proxies.Alignment.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of headerVAlign
	 * @param headervalign
	 */
	public final void setheaderVAlign(fusionchartsplus.proxies.Alignment headervalign)
	{
		setheaderVAlign(getContext(), headervalign);
	}

	/**
	 * Set value of headerVAlign
	 * @param context
	 * @param headervalign
	 */
	public final void setheaderVAlign(com.mendix.systemwideinterfaces.core.IContext context, fusionchartsplus.proxies.Alignment headervalign)
	{
		if (headervalign != null)
			getMendixObject().setValue(context, MemberNames.headerVAlign.toString(), headervalign.toString());
		else
			getMendixObject().setValue(context, MemberNames.headerVAlign.toString(), null);
	}

	/**
	 * @return value of headerFontSize
	 */
	public final java.lang.String getheaderFontSize()
	{
		return getheaderFontSize(getContext());
	}

	/**
	 * @param context
	 * @return value of headerFontSize
	 */
	public final java.lang.String getheaderFontSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.headerFontSize.toString());
	}

	/**
	 * Set value of headerFontSize
	 * @param headerfontsize
	 */
	public final void setheaderFontSize(java.lang.String headerfontsize)
	{
		setheaderFontSize(getContext(), headerfontsize);
	}

	/**
	 * Set value of headerFontSize
	 * @param context
	 * @param headerfontsize
	 */
	public final void setheaderFontSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String headerfontsize)
	{
		getMendixObject().setValue(context, MemberNames.headerFontSize.toString(), headerfontsize);
	}

	/**
	 * @return value of headerFontColor
	 */
	public final java.lang.String getheaderFontColor()
	{
		return getheaderFontColor(getContext());
	}

	/**
	 * @param context
	 * @return value of headerFontColor
	 */
	public final java.lang.String getheaderFontColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.headerFontColor.toString());
	}

	/**
	 * Set value of headerFontColor
	 * @param headerfontcolor
	 */
	public final void setheaderFontColor(java.lang.String headerfontcolor)
	{
		setheaderFontColor(getContext(), headerfontcolor);
	}

	/**
	 * Set value of headerFontColor
	 * @param context
	 * @param headerfontcolor
	 */
	public final void setheaderFontColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String headerfontcolor)
	{
		getMendixObject().setValue(context, MemberNames.headerFontColor.toString(), headerfontcolor);
	}

	/**
	 * @return value of GanttDataTable_GanttDataColumn
	 */
	public final java.util.List<fusionchartsplus.proxies.GanttDataColumn> getGanttDataTable_GanttDataColumn() throws com.mendix.core.CoreException
	{
		return getGanttDataTable_GanttDataColumn(getContext());
	}

	/**
	 * @param context
	 * @return value of GanttDataTable_GanttDataColumn
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<fusionchartsplus.proxies.GanttDataColumn> getGanttDataTable_GanttDataColumn(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.GanttDataColumn> result = new java.util.ArrayList<fusionchartsplus.proxies.GanttDataColumn>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.GanttDataTable_GanttDataColumn.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(fusionchartsplus.proxies.GanttDataColumn.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of GanttDataTable_GanttDataColumn
	 * @param ganttdatatable_ganttdatacolumn
	 */
	public final void setGanttDataTable_GanttDataColumn(java.util.List<fusionchartsplus.proxies.GanttDataColumn> ganttdatatable_ganttdatacolumn)
	{
		setGanttDataTable_GanttDataColumn(getContext(), ganttdatatable_ganttdatacolumn);
	}

	/**
	 * Set value of GanttDataTable_GanttDataColumn
	 * @param context
	 * @param ganttdatatable_ganttdatacolumn
	 */
	public final void setGanttDataTable_GanttDataColumn(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<fusionchartsplus.proxies.GanttDataColumn> ganttdatatable_ganttdatacolumn)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (fusionchartsplus.proxies.GanttDataColumn proxyObject : ganttdatatable_ganttdatacolumn)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.GanttDataTable_GanttDataColumn.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return ganttDataTableMendixObject;
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
			final fusionchartsplus.proxies.GanttDataTable that = (fusionchartsplus.proxies.GanttDataTable) obj;
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
		return "FusionChartsPlus.GanttDataTable";
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
