// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fusionchartsplus.proxies;

public class AreaProperties
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject areaPropertiesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FusionChartsPlus.AreaProperties";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		showAreaBorder("showAreaBorder"),
		areaBorderThickness("areaBorderThickness"),
		areaBorderColor("areaBorderColor"),
		areaBgColor("areaBgColor"),
		areaAlpha("areaAlpha"),
		AreaProperties_Graph("FusionChartsPlus.AreaProperties_Graph");

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

	public AreaProperties(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FusionChartsPlus.AreaProperties"));
	}

	protected AreaProperties(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject areaPropertiesMendixObject)
	{
		if (areaPropertiesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FusionChartsPlus.AreaProperties", areaPropertiesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FusionChartsPlus.AreaProperties");

		this.areaPropertiesMendixObject = areaPropertiesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AreaProperties.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static fusionchartsplus.proxies.AreaProperties initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fusionchartsplus.proxies.AreaProperties.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fusionchartsplus.proxies.AreaProperties initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fusionchartsplus.proxies.AreaProperties(context, mendixObject);
	}

	public static fusionchartsplus.proxies.AreaProperties load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fusionchartsplus.proxies.AreaProperties.initialize(context, mendixObject);
	}

	public static java.util.List<fusionchartsplus.proxies.AreaProperties> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.AreaProperties> result = new java.util.ArrayList<fusionchartsplus.proxies.AreaProperties>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FusionChartsPlus.AreaProperties" + xpathConstraint))
			result.add(fusionchartsplus.proxies.AreaProperties.initialize(context, obj));
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
	 * @return value of showAreaBorder
	 */
	public final java.lang.Boolean getshowAreaBorder()
	{
		return getshowAreaBorder(getContext());
	}

	/**
	 * @param context
	 * @return value of showAreaBorder
	 */
	public final java.lang.Boolean getshowAreaBorder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.showAreaBorder.toString());
	}

	/**
	 * Set value of showAreaBorder
	 * @param showareaborder
	 */
	public final void setshowAreaBorder(java.lang.Boolean showareaborder)
	{
		setshowAreaBorder(getContext(), showareaborder);
	}

	/**
	 * Set value of showAreaBorder
	 * @param context
	 * @param showareaborder
	 */
	public final void setshowAreaBorder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showareaborder)
	{
		getMendixObject().setValue(context, MemberNames.showAreaBorder.toString(), showareaborder);
	}

	/**
	 * @return value of areaBorderThickness
	 */
	public final java.lang.Integer getareaBorderThickness()
	{
		return getareaBorderThickness(getContext());
	}

	/**
	 * @param context
	 * @return value of areaBorderThickness
	 */
	public final java.lang.Integer getareaBorderThickness(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.areaBorderThickness.toString());
	}

	/**
	 * Set value of areaBorderThickness
	 * @param areaborderthickness
	 */
	public final void setareaBorderThickness(java.lang.Integer areaborderthickness)
	{
		setareaBorderThickness(getContext(), areaborderthickness);
	}

	/**
	 * Set value of areaBorderThickness
	 * @param context
	 * @param areaborderthickness
	 */
	public final void setareaBorderThickness(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer areaborderthickness)
	{
		getMendixObject().setValue(context, MemberNames.areaBorderThickness.toString(), areaborderthickness);
	}

	/**
	 * @return value of areaBorderColor
	 */
	public final java.lang.String getareaBorderColor()
	{
		return getareaBorderColor(getContext());
	}

	/**
	 * @param context
	 * @return value of areaBorderColor
	 */
	public final java.lang.String getareaBorderColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.areaBorderColor.toString());
	}

	/**
	 * Set value of areaBorderColor
	 * @param areabordercolor
	 */
	public final void setareaBorderColor(java.lang.String areabordercolor)
	{
		setareaBorderColor(getContext(), areabordercolor);
	}

	/**
	 * Set value of areaBorderColor
	 * @param context
	 * @param areabordercolor
	 */
	public final void setareaBorderColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String areabordercolor)
	{
		getMendixObject().setValue(context, MemberNames.areaBorderColor.toString(), areabordercolor);
	}

	/**
	 * @return value of areaBgColor
	 */
	public final java.lang.String getareaBgColor()
	{
		return getareaBgColor(getContext());
	}

	/**
	 * @param context
	 * @return value of areaBgColor
	 */
	public final java.lang.String getareaBgColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.areaBgColor.toString());
	}

	/**
	 * Set value of areaBgColor
	 * @param areabgcolor
	 */
	public final void setareaBgColor(java.lang.String areabgcolor)
	{
		setareaBgColor(getContext(), areabgcolor);
	}

	/**
	 * Set value of areaBgColor
	 * @param context
	 * @param areabgcolor
	 */
	public final void setareaBgColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String areabgcolor)
	{
		getMendixObject().setValue(context, MemberNames.areaBgColor.toString(), areabgcolor);
	}

	/**
	 * @return value of areaAlpha
	 */
	public final java.lang.Integer getareaAlpha()
	{
		return getareaAlpha(getContext());
	}

	/**
	 * @param context
	 * @return value of areaAlpha
	 */
	public final java.lang.Integer getareaAlpha(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.areaAlpha.toString());
	}

	/**
	 * Set value of areaAlpha
	 * @param areaalpha
	 */
	public final void setareaAlpha(java.lang.Integer areaalpha)
	{
		setareaAlpha(getContext(), areaalpha);
	}

	/**
	 * Set value of areaAlpha
	 * @param context
	 * @param areaalpha
	 */
	public final void setareaAlpha(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer areaalpha)
	{
		getMendixObject().setValue(context, MemberNames.areaAlpha.toString(), areaalpha);
	}

	/**
	 * @return value of AreaProperties_Graph
	 */
	public final fusionchartsplus.proxies.Graph getAreaProperties_Graph() throws com.mendix.core.CoreException
	{
		return getAreaProperties_Graph(getContext());
	}

	/**
	 * @param context
	 * @return value of AreaProperties_Graph
	 */
	public final fusionchartsplus.proxies.Graph getAreaProperties_Graph(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		fusionchartsplus.proxies.Graph result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AreaProperties_Graph.toString());
		if (identifier != null)
			result = fusionchartsplus.proxies.Graph.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AreaProperties_Graph
	 * @param areaproperties_graph
	 */
	public final void setAreaProperties_Graph(fusionchartsplus.proxies.Graph areaproperties_graph)
	{
		setAreaProperties_Graph(getContext(), areaproperties_graph);
	}

	/**
	 * Set value of AreaProperties_Graph
	 * @param context
	 * @param areaproperties_graph
	 */
	public final void setAreaProperties_Graph(com.mendix.systemwideinterfaces.core.IContext context, fusionchartsplus.proxies.Graph areaproperties_graph)
	{
		if (areaproperties_graph == null)
			getMendixObject().setValue(context, MemberNames.AreaProperties_Graph.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AreaProperties_Graph.toString(), areaproperties_graph.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return areaPropertiesMendixObject;
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
			final fusionchartsplus.proxies.AreaProperties that = (fusionchartsplus.proxies.AreaProperties) obj;
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
		return "FusionChartsPlus.AreaProperties";
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