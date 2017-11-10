// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package fusionchartsplus.proxies;

public class GanttTask
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject ganttTaskMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FusionChartsPlus.GanttTask";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		taskId("taskId"),
		start("start"),
		end("end"),
		showAsGroup("showAsGroup"),
		name("name"),
		showlabel("showlabel"),
		processId("processId"),
		color("color"),
		alpha("alpha"),
		hovertext("hovertext");

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

	public GanttTask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FusionChartsPlus.GanttTask"));
	}

	protected GanttTask(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject ganttTaskMendixObject)
	{
		if (ganttTaskMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FusionChartsPlus.GanttTask", ganttTaskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FusionChartsPlus.GanttTask");

		this.ganttTaskMendixObject = ganttTaskMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'GanttTask.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static fusionchartsplus.proxies.GanttTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return fusionchartsplus.proxies.GanttTask.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static fusionchartsplus.proxies.GanttTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new fusionchartsplus.proxies.GanttTask(context, mendixObject);
	}

	public static fusionchartsplus.proxies.GanttTask load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return fusionchartsplus.proxies.GanttTask.initialize(context, mendixObject);
	}

	public static java.util.List<fusionchartsplus.proxies.GanttTask> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<fusionchartsplus.proxies.GanttTask> result = new java.util.ArrayList<fusionchartsplus.proxies.GanttTask>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FusionChartsPlus.GanttTask" + xpathConstraint))
			result.add(fusionchartsplus.proxies.GanttTask.initialize(context, obj));
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
	 * @return value of taskId
	 */
	public final java.lang.String gettaskId()
	{
		return gettaskId(getContext());
	}

	/**
	 * @param context
	 * @return value of taskId
	 */
	public final java.lang.String gettaskId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.taskId.toString());
	}

	/**
	 * Set value of taskId
	 * @param taskid
	 */
	public final void settaskId(java.lang.String taskid)
	{
		settaskId(getContext(), taskid);
	}

	/**
	 * Set value of taskId
	 * @param context
	 * @param taskid
	 */
	public final void settaskId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String taskid)
	{
		getMendixObject().setValue(context, MemberNames.taskId.toString(), taskid);
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
	 * @return value of showAsGroup
	 */
	public final java.lang.Boolean getshowAsGroup()
	{
		return getshowAsGroup(getContext());
	}

	/**
	 * @param context
	 * @return value of showAsGroup
	 */
	public final java.lang.Boolean getshowAsGroup(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.showAsGroup.toString());
	}

	/**
	 * Set value of showAsGroup
	 * @param showasgroup
	 */
	public final void setshowAsGroup(java.lang.Boolean showasgroup)
	{
		setshowAsGroup(getContext(), showasgroup);
	}

	/**
	 * Set value of showAsGroup
	 * @param context
	 * @param showasgroup
	 */
	public final void setshowAsGroup(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showasgroup)
	{
		getMendixObject().setValue(context, MemberNames.showAsGroup.toString(), showasgroup);
	}

	/**
	 * @return value of name
	 */
	public final java.lang.String getname()
	{
		return getname(getContext());
	}

	/**
	 * @param context
	 * @return value of name
	 */
	public final java.lang.String getname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.name.toString());
	}

	/**
	 * Set value of name
	 * @param name
	 */
	public final void setname(java.lang.String name)
	{
		setname(getContext(), name);
	}

	/**
	 * Set value of name
	 * @param context
	 * @param name
	 */
	public final void setname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.name.toString(), name);
	}

	/**
	 * @return value of showlabel
	 */
	public final java.lang.Boolean getshowlabel()
	{
		return getshowlabel(getContext());
	}

	/**
	 * @param context
	 * @return value of showlabel
	 */
	public final java.lang.Boolean getshowlabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.showlabel.toString());
	}

	/**
	 * Set value of showlabel
	 * @param showlabel
	 */
	public final void setshowlabel(java.lang.Boolean showlabel)
	{
		setshowlabel(getContext(), showlabel);
	}

	/**
	 * Set value of showlabel
	 * @param context
	 * @param showlabel
	 */
	public final void setshowlabel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showlabel)
	{
		getMendixObject().setValue(context, MemberNames.showlabel.toString(), showlabel);
	}

	/**
	 * @return value of processId
	 */
	public final java.lang.String getprocessId()
	{
		return getprocessId(getContext());
	}

	/**
	 * @param context
	 * @return value of processId
	 */
	public final java.lang.String getprocessId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.processId.toString());
	}

	/**
	 * Set value of processId
	 * @param processid
	 */
	public final void setprocessId(java.lang.String processid)
	{
		setprocessId(getContext(), processid);
	}

	/**
	 * Set value of processId
	 * @param context
	 * @param processid
	 */
	public final void setprocessId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String processid)
	{
		getMendixObject().setValue(context, MemberNames.processId.toString(), processid);
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
	 * @return value of hovertext
	 */
	public final java.lang.String gethovertext()
	{
		return gethovertext(getContext());
	}

	/**
	 * @param context
	 * @return value of hovertext
	 */
	public final java.lang.String gethovertext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.hovertext.toString());
	}

	/**
	 * Set value of hovertext
	 * @param hovertext
	 */
	public final void sethovertext(java.lang.String hovertext)
	{
		sethovertext(getContext(), hovertext);
	}

	/**
	 * Set value of hovertext
	 * @param context
	 * @param hovertext
	 */
	public final void sethovertext(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hovertext)
	{
		getMendixObject().setValue(context, MemberNames.hovertext.toString(), hovertext);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return ganttTaskMendixObject;
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
			final fusionchartsplus.proxies.GanttTask that = (fusionchartsplus.proxies.GanttTask) obj;
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
		return "FusionChartsPlus.GanttTask";
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