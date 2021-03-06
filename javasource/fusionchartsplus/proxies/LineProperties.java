// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fusionchartsplus.proxies;

public class LineProperties
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject linePropertiesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FusionChartsPlus.LineProperties";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		lineColor("lineColor"),
		lineThickness("lineThickness"),
		lineAlpha("lineAlpha"),
		showShadow("showShadow"),
		shadowColor("shadowColor"),
		shadowThickness("shadowThickness"),
		shadowAlpha("shadowAlpha"),
		LineProperties_Graph("FusionChartsPlus.LineProperties_Graph");

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

	public LineProperties(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FusionChartsPlus.LineProperties"));
	}

	protected LineProperties(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject linePropertiesMendixObject)
	{
		if (linePropertiesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FusionChartsPlus.LineProperties", linePropertiesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FusionChartsPlus.LineProperties");

		this.linePropertiesMendixObject = linePropertiesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LineProperties.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static fusionchartsplus.proxies.LineProperties initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fusionchartsplus.proxies.LineProperties.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fusionchartsplus.proxies.LineProperties initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fusionchartsplus.proxies.LineProperties(context, mendixObject);
	}

	public static fusionchartsplus.proxies.LineProperties load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fusionchartsplus.proxies.LineProperties.initialize(context, mendixObject);
	}

	public static java.util.List<fusionchartsplus.proxies.LineProperties> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.LineProperties> result = new java.util.ArrayList<fusionchartsplus.proxies.LineProperties>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FusionChartsPlus.LineProperties" + xpathConstraint))
			result.add(fusionchartsplus.proxies.LineProperties.initialize(context, obj));
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
	 * @return value of lineColor
	 */
	public final java.lang.String getlineColor()
	{
		return getlineColor(getContext());
	}

	/**
	 * @param context
	 * @return value of lineColor
	 */
	public final java.lang.String getlineColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.lineColor.toString());
	}

	/**
	 * Set value of lineColor
	 * @param linecolor
	 */
	public final void setlineColor(java.lang.String linecolor)
	{
		setlineColor(getContext(), linecolor);
	}

	/**
	 * Set value of lineColor
	 * @param context
	 * @param linecolor
	 */
	public final void setlineColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linecolor)
	{
		getMendixObject().setValue(context, MemberNames.lineColor.toString(), linecolor);
	}

	/**
	 * @return value of lineThickness
	 */
	public final java.lang.Integer getlineThickness()
	{
		return getlineThickness(getContext());
	}

	/**
	 * @param context
	 * @return value of lineThickness
	 */
	public final java.lang.Integer getlineThickness(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.lineThickness.toString());
	}

	/**
	 * Set value of lineThickness
	 * @param linethickness
	 */
	public final void setlineThickness(java.lang.Integer linethickness)
	{
		setlineThickness(getContext(), linethickness);
	}

	/**
	 * Set value of lineThickness
	 * @param context
	 * @param linethickness
	 */
	public final void setlineThickness(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer linethickness)
	{
		getMendixObject().setValue(context, MemberNames.lineThickness.toString(), linethickness);
	}

	/**
	 * @return value of lineAlpha
	 */
	public final java.lang.Integer getlineAlpha()
	{
		return getlineAlpha(getContext());
	}

	/**
	 * @param context
	 * @return value of lineAlpha
	 */
	public final java.lang.Integer getlineAlpha(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.lineAlpha.toString());
	}

	/**
	 * Set value of lineAlpha
	 * @param linealpha
	 */
	public final void setlineAlpha(java.lang.Integer linealpha)
	{
		setlineAlpha(getContext(), linealpha);
	}

	/**
	 * Set value of lineAlpha
	 * @param context
	 * @param linealpha
	 */
	public final void setlineAlpha(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer linealpha)
	{
		getMendixObject().setValue(context, MemberNames.lineAlpha.toString(), linealpha);
	}

	/**
	 * @return value of showShadow
	 */
	public final java.lang.Boolean getshowShadow()
	{
		return getshowShadow(getContext());
	}

	/**
	 * @param context
	 * @return value of showShadow
	 */
	public final java.lang.Boolean getshowShadow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.showShadow.toString());
	}

	/**
	 * Set value of showShadow
	 * @param showshadow
	 */
	public final void setshowShadow(java.lang.Boolean showshadow)
	{
		setshowShadow(getContext(), showshadow);
	}

	/**
	 * Set value of showShadow
	 * @param context
	 * @param showshadow
	 */
	public final void setshowShadow(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showshadow)
	{
		getMendixObject().setValue(context, MemberNames.showShadow.toString(), showshadow);
	}

	/**
	 * @return value of shadowColor
	 */
	public final java.lang.String getshadowColor()
	{
		return getshadowColor(getContext());
	}

	/**
	 * @param context
	 * @return value of shadowColor
	 */
	public final java.lang.String getshadowColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.shadowColor.toString());
	}

	/**
	 * Set value of shadowColor
	 * @param shadowcolor
	 */
	public final void setshadowColor(java.lang.String shadowcolor)
	{
		setshadowColor(getContext(), shadowcolor);
	}

	/**
	 * Set value of shadowColor
	 * @param context
	 * @param shadowcolor
	 */
	public final void setshadowColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String shadowcolor)
	{
		getMendixObject().setValue(context, MemberNames.shadowColor.toString(), shadowcolor);
	}

	/**
	 * @return value of shadowThickness
	 */
	public final java.lang.String getshadowThickness()
	{
		return getshadowThickness(getContext());
	}

	/**
	 * @param context
	 * @return value of shadowThickness
	 */
	public final java.lang.String getshadowThickness(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.shadowThickness.toString());
	}

	/**
	 * Set value of shadowThickness
	 * @param shadowthickness
	 */
	public final void setshadowThickness(java.lang.String shadowthickness)
	{
		setshadowThickness(getContext(), shadowthickness);
	}

	/**
	 * Set value of shadowThickness
	 * @param context
	 * @param shadowthickness
	 */
	public final void setshadowThickness(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String shadowthickness)
	{
		getMendixObject().setValue(context, MemberNames.shadowThickness.toString(), shadowthickness);
	}

	/**
	 * @return value of shadowAlpha
	 */
	public final java.lang.Integer getshadowAlpha()
	{
		return getshadowAlpha(getContext());
	}

	/**
	 * @param context
	 * @return value of shadowAlpha
	 */
	public final java.lang.Integer getshadowAlpha(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.shadowAlpha.toString());
	}

	/**
	 * Set value of shadowAlpha
	 * @param shadowalpha
	 */
	public final void setshadowAlpha(java.lang.Integer shadowalpha)
	{
		setshadowAlpha(getContext(), shadowalpha);
	}

	/**
	 * Set value of shadowAlpha
	 * @param context
	 * @param shadowalpha
	 */
	public final void setshadowAlpha(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer shadowalpha)
	{
		getMendixObject().setValue(context, MemberNames.shadowAlpha.toString(), shadowalpha);
	}

	/**
	 * @return value of LineProperties_Graph
	 */
	public final fusionchartsplus.proxies.Graph getLineProperties_Graph() throws com.mendix.core.CoreException
	{
		return getLineProperties_Graph(getContext());
	}

	/**
	 * @param context
	 * @return value of LineProperties_Graph
	 */
	public final fusionchartsplus.proxies.Graph getLineProperties_Graph(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		fusionchartsplus.proxies.Graph result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LineProperties_Graph.toString());
		if (identifier != null)
			result = fusionchartsplus.proxies.Graph.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LineProperties_Graph
	 * @param lineproperties_graph
	 */
	public final void setLineProperties_Graph(fusionchartsplus.proxies.Graph lineproperties_graph)
	{
		setLineProperties_Graph(getContext(), lineproperties_graph);
	}

	/**
	 * Set value of LineProperties_Graph
	 * @param context
	 * @param lineproperties_graph
	 */
	public final void setLineProperties_Graph(com.mendix.systemwideinterfaces.core.IContext context, fusionchartsplus.proxies.Graph lineproperties_graph)
	{
		if (lineproperties_graph == null)
			getMendixObject().setValue(context, MemberNames.LineProperties_Graph.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LineProperties_Graph.toString(), lineproperties_graph.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return linePropertiesMendixObject;
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
			final fusionchartsplus.proxies.LineProperties that = (fusionchartsplus.proxies.LineProperties) obj;
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
		return "FusionChartsPlus.LineProperties";
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
