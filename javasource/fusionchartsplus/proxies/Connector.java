// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fusionchartsplus.proxies;

public class Connector
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject connectorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FusionChartsPlus.Connector";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		fromTaskId("fromTaskId"),
		toTaskId("toTaskId"),
		color("color"),
		thickness("thickness"),
		fromTaskConnectStart("fromTaskConnectStart"),
		toTaskConnectStart("toTaskConnectStart"),
		isDashed("isDashed"),
		alpha("alpha");

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

	public Connector(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FusionChartsPlus.Connector"));
	}

	protected Connector(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject connectorMendixObject)
	{
		if (connectorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FusionChartsPlus.Connector", connectorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FusionChartsPlus.Connector");

		this.connectorMendixObject = connectorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Connector.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static fusionchartsplus.proxies.Connector initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fusionchartsplus.proxies.Connector.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fusionchartsplus.proxies.Connector initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fusionchartsplus.proxies.Connector(context, mendixObject);
	}

	public static fusionchartsplus.proxies.Connector load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fusionchartsplus.proxies.Connector.initialize(context, mendixObject);
	}

	public static java.util.List<fusionchartsplus.proxies.Connector> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.Connector> result = new java.util.ArrayList<fusionchartsplus.proxies.Connector>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FusionChartsPlus.Connector" + xpathConstraint))
			result.add(fusionchartsplus.proxies.Connector.initialize(context, obj));
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
	 * @return value of fromTaskId
	 */
	public final java.lang.String getfromTaskId()
	{
		return getfromTaskId(getContext());
	}

	/**
	 * @param context
	 * @return value of fromTaskId
	 */
	public final java.lang.String getfromTaskId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.fromTaskId.toString());
	}

	/**
	 * Set value of fromTaskId
	 * @param fromtaskid
	 */
	public final void setfromTaskId(java.lang.String fromtaskid)
	{
		setfromTaskId(getContext(), fromtaskid);
	}

	/**
	 * Set value of fromTaskId
	 * @param context
	 * @param fromtaskid
	 */
	public final void setfromTaskId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fromtaskid)
	{
		getMendixObject().setValue(context, MemberNames.fromTaskId.toString(), fromtaskid);
	}

	/**
	 * @return value of toTaskId
	 */
	public final java.lang.String gettoTaskId()
	{
		return gettoTaskId(getContext());
	}

	/**
	 * @param context
	 * @return value of toTaskId
	 */
	public final java.lang.String gettoTaskId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.toTaskId.toString());
	}

	/**
	 * Set value of toTaskId
	 * @param totaskid
	 */
	public final void settoTaskId(java.lang.String totaskid)
	{
		settoTaskId(getContext(), totaskid);
	}

	/**
	 * Set value of toTaskId
	 * @param context
	 * @param totaskid
	 */
	public final void settoTaskId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String totaskid)
	{
		getMendixObject().setValue(context, MemberNames.toTaskId.toString(), totaskid);
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
	 * @return value of fromTaskConnectStart
	 */
	public final java.lang.Boolean getfromTaskConnectStart()
	{
		return getfromTaskConnectStart(getContext());
	}

	/**
	 * @param context
	 * @return value of fromTaskConnectStart
	 */
	public final java.lang.Boolean getfromTaskConnectStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.fromTaskConnectStart.toString());
	}

	/**
	 * Set value of fromTaskConnectStart
	 * @param fromtaskconnectstart
	 */
	public final void setfromTaskConnectStart(java.lang.Boolean fromtaskconnectstart)
	{
		setfromTaskConnectStart(getContext(), fromtaskconnectstart);
	}

	/**
	 * Set value of fromTaskConnectStart
	 * @param context
	 * @param fromtaskconnectstart
	 */
	public final void setfromTaskConnectStart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean fromtaskconnectstart)
	{
		getMendixObject().setValue(context, MemberNames.fromTaskConnectStart.toString(), fromtaskconnectstart);
	}

	/**
	 * @return value of toTaskConnectStart
	 */
	public final java.lang.Boolean gettoTaskConnectStart()
	{
		return gettoTaskConnectStart(getContext());
	}

	/**
	 * @param context
	 * @return value of toTaskConnectStart
	 */
	public final java.lang.Boolean gettoTaskConnectStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.toTaskConnectStart.toString());
	}

	/**
	 * Set value of toTaskConnectStart
	 * @param totaskconnectstart
	 */
	public final void settoTaskConnectStart(java.lang.Boolean totaskconnectstart)
	{
		settoTaskConnectStart(getContext(), totaskconnectstart);
	}

	/**
	 * Set value of toTaskConnectStart
	 * @param context
	 * @param totaskconnectstart
	 */
	public final void settoTaskConnectStart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean totaskconnectstart)
	{
		getMendixObject().setValue(context, MemberNames.toTaskConnectStart.toString(), totaskconnectstart);
	}

	/**
	 * @return value of isDashed
	 */
	public final java.lang.Boolean getisDashed()
	{
		return getisDashed(getContext());
	}

	/**
	 * @param context
	 * @return value of isDashed
	 */
	public final java.lang.Boolean getisDashed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.isDashed.toString());
	}

	/**
	 * Set value of isDashed
	 * @param isdashed
	 */
	public final void setisDashed(java.lang.Boolean isdashed)
	{
		setisDashed(getContext(), isdashed);
	}

	/**
	 * Set value of isDashed
	 * @param context
	 * @param isdashed
	 */
	public final void setisDashed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdashed)
	{
		getMendixObject().setValue(context, MemberNames.isDashed.toString(), isdashed);
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
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return connectorMendixObject;
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
			final fusionchartsplus.proxies.Connector that = (fusionchartsplus.proxies.Connector) obj;
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
		return "FusionChartsPlus.Connector";
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