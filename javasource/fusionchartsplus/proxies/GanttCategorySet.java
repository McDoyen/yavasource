// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fusionchartsplus.proxies;

/**
 * *  bgColor='Hex Color': Defines the background color for the same.
 * * bgAlpha='Numeric Value 0-100': Define the background transparency level for the same.
 * * font='Font Face': Defines the font face in which text will be rendered.
 * * fontSize='Numeric Value': Defines the font size in which text will be rendered.
 * * fontColor='Hex Color': Defines the color in which text will be rendered.
 * * isBold='1/0': Sets whether the text will be shown as bold or not.
 * * isUnderLine='1/0': Sets whether the text will be shown as underline.
 * * verticalPadding='Numeric Value': Specifies the top margin.
 * * align='left/center/right': Specifies the horizontal alignment of text.
 * * vAlign='left/center/right': Specifies the vertical alignment of text.
 * 
 */
public class GanttCategorySet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject ganttCategorySetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FusionChartsPlus.GanttCategorySet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		bgcolor("bgcolor"),
		bgAlpha("bgAlpha"),
		font("font"),
		fontSize("fontSize"),
		fontColor("fontColor"),
		isBold("isBold"),
		isUnderline("isUnderline"),
		verticalPadding("verticalPadding"),
		alignment("alignment"),
		GanttCategorySet_GanttCategory("FusionChartsPlus.GanttCategorySet_GanttCategory");

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

	public GanttCategorySet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FusionChartsPlus.GanttCategorySet"));
	}

	protected GanttCategorySet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject ganttCategorySetMendixObject)
	{
		if (ganttCategorySetMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FusionChartsPlus.GanttCategorySet", ganttCategorySetMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FusionChartsPlus.GanttCategorySet");

		this.ganttCategorySetMendixObject = ganttCategorySetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'GanttCategorySet.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static fusionchartsplus.proxies.GanttCategorySet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fusionchartsplus.proxies.GanttCategorySet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fusionchartsplus.proxies.GanttCategorySet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fusionchartsplus.proxies.GanttCategorySet(context, mendixObject);
	}

	public static fusionchartsplus.proxies.GanttCategorySet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fusionchartsplus.proxies.GanttCategorySet.initialize(context, mendixObject);
	}

	public static java.util.List<fusionchartsplus.proxies.GanttCategorySet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.GanttCategorySet> result = new java.util.ArrayList<fusionchartsplus.proxies.GanttCategorySet>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FusionChartsPlus.GanttCategorySet" + xpathConstraint))
			result.add(fusionchartsplus.proxies.GanttCategorySet.initialize(context, obj));
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
	 * @return value of bgcolor
	 */
	public final java.lang.String getbgcolor()
	{
		return getbgcolor(getContext());
	}

	/**
	 * @param context
	 * @return value of bgcolor
	 */
	public final java.lang.String getbgcolor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.bgcolor.toString());
	}

	/**
	 * Set value of bgcolor
	 * @param bgcolor
	 */
	public final void setbgcolor(java.lang.String bgcolor)
	{
		setbgcolor(getContext(), bgcolor);
	}

	/**
	 * Set value of bgcolor
	 * @param context
	 * @param bgcolor
	 */
	public final void setbgcolor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bgcolor)
	{
		getMendixObject().setValue(context, MemberNames.bgcolor.toString(), bgcolor);
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
	 * @return value of fontSize
	 */
	public final java.lang.String getfontSize()
	{
		return getfontSize(getContext());
	}

	/**
	 * @param context
	 * @return value of fontSize
	 */
	public final java.lang.String getfontSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.fontSize.toString());
	}

	/**
	 * Set value of fontSize
	 * @param fontsize
	 */
	public final void setfontSize(java.lang.String fontsize)
	{
		setfontSize(getContext(), fontsize);
	}

	/**
	 * Set value of fontSize
	 * @param context
	 * @param fontsize
	 */
	public final void setfontSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fontsize)
	{
		getMendixObject().setValue(context, MemberNames.fontSize.toString(), fontsize);
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
	 * @return value of isUnderline
	 */
	public final java.lang.Boolean getisUnderline()
	{
		return getisUnderline(getContext());
	}

	/**
	 * @param context
	 * @return value of isUnderline
	 */
	public final java.lang.Boolean getisUnderline(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.isUnderline.toString());
	}

	/**
	 * Set value of isUnderline
	 * @param isunderline
	 */
	public final void setisUnderline(java.lang.Boolean isunderline)
	{
		setisUnderline(getContext(), isunderline);
	}

	/**
	 * Set value of isUnderline
	 * @param context
	 * @param isunderline
	 */
	public final void setisUnderline(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isunderline)
	{
		getMendixObject().setValue(context, MemberNames.isUnderline.toString(), isunderline);
	}

	/**
	 * @return value of verticalPadding
	 */
	public final java.lang.String getverticalPadding()
	{
		return getverticalPadding(getContext());
	}

	/**
	 * @param context
	 * @return value of verticalPadding
	 */
	public final java.lang.String getverticalPadding(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.verticalPadding.toString());
	}

	/**
	 * Set value of verticalPadding
	 * @param verticalpadding
	 */
	public final void setverticalPadding(java.lang.String verticalpadding)
	{
		setverticalPadding(getContext(), verticalpadding);
	}

	/**
	 * Set value of verticalPadding
	 * @param context
	 * @param verticalpadding
	 */
	public final void setverticalPadding(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String verticalpadding)
	{
		getMendixObject().setValue(context, MemberNames.verticalPadding.toString(), verticalpadding);
	}

	/**
	 * Set value of alignment
	 * @param alignment
	 */
	public final fusionchartsplus.proxies.Alignment getalignment()
	{
		return getalignment(getContext());
	}

	/**
	 * @param context
	 * @return value of alignment
	 */
	public final fusionchartsplus.proxies.Alignment getalignment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.alignment.toString());
		if (obj == null)
			return null;

		return fusionchartsplus.proxies.Alignment.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of alignment
	 * @param alignment
	 */
	public final void setalignment(fusionchartsplus.proxies.Alignment alignment)
	{
		setalignment(getContext(), alignment);
	}

	/**
	 * Set value of alignment
	 * @param context
	 * @param alignment
	 */
	public final void setalignment(com.mendix.systemwideinterfaces.core.IContext context, fusionchartsplus.proxies.Alignment alignment)
	{
		if (alignment != null)
			getMendixObject().setValue(context, MemberNames.alignment.toString(), alignment.toString());
		else
			getMendixObject().setValue(context, MemberNames.alignment.toString(), null);
	}

	/**
	 * @return value of GanttCategorySet_GanttCategory
	 */
	public final java.util.List<fusionchartsplus.proxies.GanttCategory> getGanttCategorySet_GanttCategory() throws com.mendix.core.CoreException
	{
		return getGanttCategorySet_GanttCategory(getContext());
	}

	/**
	 * @param context
	 * @return value of GanttCategorySet_GanttCategory
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<fusionchartsplus.proxies.GanttCategory> getGanttCategorySet_GanttCategory(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.GanttCategory> result = new java.util.ArrayList<fusionchartsplus.proxies.GanttCategory>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.GanttCategorySet_GanttCategory.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(fusionchartsplus.proxies.GanttCategory.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of GanttCategorySet_GanttCategory
	 * @param ganttcategoryset_ganttcategory
	 */
	public final void setGanttCategorySet_GanttCategory(java.util.List<fusionchartsplus.proxies.GanttCategory> ganttcategoryset_ganttcategory)
	{
		setGanttCategorySet_GanttCategory(getContext(), ganttcategoryset_ganttcategory);
	}

	/**
	 * Set value of GanttCategorySet_GanttCategory
	 * @param context
	 * @param ganttcategoryset_ganttcategory
	 */
	public final void setGanttCategorySet_GanttCategory(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<fusionchartsplus.proxies.GanttCategory> ganttcategoryset_ganttcategory)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (fusionchartsplus.proxies.GanttCategory proxyObject : ganttcategoryset_ganttcategory)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.GanttCategorySet_GanttCategory.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return ganttCategorySetMendixObject;
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
			final fusionchartsplus.proxies.GanttCategorySet that = (fusionchartsplus.proxies.GanttCategorySet) obj;
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
		return "FusionChartsPlus.GanttCategorySet";
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
