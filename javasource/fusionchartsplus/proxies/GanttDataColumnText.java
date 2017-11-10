// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fusionchartsplus.proxies;

public class GanttDataColumnText
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject ganttDataColumnTextMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FusionChartsPlus.GanttDataColumnText";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		label("label");

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

	public GanttDataColumnText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FusionChartsPlus.GanttDataColumnText"));
	}

	protected GanttDataColumnText(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject ganttDataColumnTextMendixObject)
	{
		if (ganttDataColumnTextMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FusionChartsPlus.GanttDataColumnText", ganttDataColumnTextMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FusionChartsPlus.GanttDataColumnText");

		this.ganttDataColumnTextMendixObject = ganttDataColumnTextMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'GanttDataColumnText.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static fusionchartsplus.proxies.GanttDataColumnText initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fusionchartsplus.proxies.GanttDataColumnText.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fusionchartsplus.proxies.GanttDataColumnText initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fusionchartsplus.proxies.GanttDataColumnText(context, mendixObject);
	}

	public static fusionchartsplus.proxies.GanttDataColumnText load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fusionchartsplus.proxies.GanttDataColumnText.initialize(context, mendixObject);
	}

	public static java.util.List<fusionchartsplus.proxies.GanttDataColumnText> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.GanttDataColumnText> result = new java.util.ArrayList<fusionchartsplus.proxies.GanttDataColumnText>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FusionChartsPlus.GanttDataColumnText" + xpathConstraint))
			result.add(fusionchartsplus.proxies.GanttDataColumnText.initialize(context, obj));
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
	 * @return value of label
	 */
	public final java.lang.String getlabel()
	{
		return getlabel(getContext());
	}

	/**
	 * @param context
	 * @return value of label
	 */
	public final java.lang.String getlabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.label.toString());
	}

	/**
	 * Set value of label
	 * @param label
	 */
	public final void setlabel(java.lang.String label)
	{
		setlabel(getContext(), label);
	}

	/**
	 * Set value of label
	 * @param context
	 * @param label
	 */
	public final void setlabel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String label)
	{
		getMendixObject().setValue(context, MemberNames.label.toString(), label);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return ganttDataColumnTextMendixObject;
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
			final fusionchartsplus.proxies.GanttDataColumnText that = (fusionchartsplus.proxies.GanttDataColumnText) obj;
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
		return "FusionChartsPlus.GanttDataColumnText";
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
