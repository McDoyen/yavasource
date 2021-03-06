// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowexecution.proxies;

public class WorkflowVisit
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowVisitMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowExecution.WorkflowVisit";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AutoID("AutoID"),
		StartDate("StartDate"),
		EndDate("EndDate"),
		Level("Level"),
		IsMain("IsMain"),
		IsCancelled("IsCancelled"),
		IsFinished("IsFinished"),
		WorkflowVisit_RequestWorkflowInstance("WorkflowExecution.WorkflowVisit_RequestWorkflowInstance"),
		WorkflowVisit_SubWorkflowNodeVisit("WorkflowExecution.WorkflowVisit_SubWorkflowNodeVisit"),
		WorkflowVisit_WorkflowResult("WorkflowExecution.WorkflowVisit_WorkflowResult");

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

	public WorkflowVisit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowExecution.WorkflowVisit"));
	}

	protected WorkflowVisit(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowVisitMendixObject)
	{
		if (workflowVisitMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("WorkflowExecution.WorkflowVisit", workflowVisitMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowExecution.WorkflowVisit");

		this.workflowVisitMendixObject = workflowVisitMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WorkflowVisit.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowexecution.proxies.WorkflowVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowexecution.proxies.WorkflowVisit.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowexecution.proxies.WorkflowVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowexecution.proxies.WorkflowVisit(context, mendixObject);
	}

	public static workflowexecution.proxies.WorkflowVisit load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowexecution.proxies.WorkflowVisit.initialize(context, mendixObject);
	}

	public static java.util.List<workflowexecution.proxies.WorkflowVisit> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowexecution.proxies.WorkflowVisit> result = new java.util.ArrayList<workflowexecution.proxies.WorkflowVisit>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowExecution.WorkflowVisit" + xpathConstraint))
			result.add(workflowexecution.proxies.WorkflowVisit.initialize(context, obj));
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
	 * @return value of AutoID
	 */
	public final java.lang.Long getAutoID()
	{
		return getAutoID(getContext());
	}

	/**
	 * @param context
	 * @return value of AutoID
	 */
	public final java.lang.Long getAutoID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.AutoID.toString());
	}

	/**
	 * Set value of AutoID
	 * @param autoid
	 */
	public final void setAutoID(java.lang.Long autoid)
	{
		setAutoID(getContext(), autoid);
	}

	/**
	 * Set value of AutoID
	 * @param context
	 * @param autoid
	 */
	public final void setAutoID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long autoid)
	{
		getMendixObject().setValue(context, MemberNames.AutoID.toString(), autoid);
	}

	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * @return value of Level
	 */
	public final java.lang.Integer getLevel()
	{
		return getLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of Level
	 */
	public final java.lang.Integer getLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Level.toString());
	}

	/**
	 * Set value of Level
	 * @param level
	 */
	public final void setLevel(java.lang.Integer level)
	{
		setLevel(getContext(), level);
	}

	/**
	 * Set value of Level
	 * @param context
	 * @param level
	 */
	public final void setLevel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer level)
	{
		getMendixObject().setValue(context, MemberNames.Level.toString(), level);
	}

	/**
	 * @return value of IsMain
	 */
	public final java.lang.Boolean getIsMain()
	{
		return getIsMain(getContext());
	}

	/**
	 * @param context
	 * @return value of IsMain
	 */
	public final java.lang.Boolean getIsMain(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsMain.toString());
	}

	/**
	 * Set value of IsMain
	 * @param ismain
	 */
	public final void setIsMain(java.lang.Boolean ismain)
	{
		setIsMain(getContext(), ismain);
	}

	/**
	 * Set value of IsMain
	 * @param context
	 * @param ismain
	 */
	public final void setIsMain(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ismain)
	{
		getMendixObject().setValue(context, MemberNames.IsMain.toString(), ismain);
	}

	/**
	 * @return value of IsCancelled
	 */
	public final java.lang.Boolean getIsCancelled()
	{
		return getIsCancelled(getContext());
	}

	/**
	 * @param context
	 * @return value of IsCancelled
	 */
	public final java.lang.Boolean getIsCancelled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsCancelled.toString());
	}

	/**
	 * Set value of IsCancelled
	 * @param iscancelled
	 */
	public final void setIsCancelled(java.lang.Boolean iscancelled)
	{
		setIsCancelled(getContext(), iscancelled);
	}

	/**
	 * Set value of IsCancelled
	 * @param context
	 * @param iscancelled
	 */
	public final void setIsCancelled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean iscancelled)
	{
		getMendixObject().setValue(context, MemberNames.IsCancelled.toString(), iscancelled);
	}

	/**
	 * @return value of IsFinished
	 */
	public final java.lang.Boolean getIsFinished()
	{
		return getIsFinished(getContext());
	}

	/**
	 * @param context
	 * @return value of IsFinished
	 */
	public final java.lang.Boolean getIsFinished(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsFinished.toString());
	}

	/**
	 * Set value of IsFinished
	 * @param isfinished
	 */
	public final void setIsFinished(java.lang.Boolean isfinished)
	{
		setIsFinished(getContext(), isfinished);
	}

	/**
	 * Set value of IsFinished
	 * @param context
	 * @param isfinished
	 */
	public final void setIsFinished(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isfinished)
	{
		getMendixObject().setValue(context, MemberNames.IsFinished.toString(), isfinished);
	}

	/**
	 * @return value of WorkflowVisit_RequestWorkflowInstance
	 */
	public final workflowexecution.proxies.RequestWorkflowInstance getWorkflowVisit_RequestWorkflowInstance() throws com.mendix.core.CoreException
	{
		return getWorkflowVisit_RequestWorkflowInstance(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowVisit_RequestWorkflowInstance
	 */
	public final workflowexecution.proxies.RequestWorkflowInstance getWorkflowVisit_RequestWorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowexecution.proxies.RequestWorkflowInstance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowVisit_RequestWorkflowInstance.toString());
		if (identifier != null)
			result = workflowexecution.proxies.RequestWorkflowInstance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowVisit_RequestWorkflowInstance
	 * @param workflowvisit_requestworkflowinstance
	 */
	public final void setWorkflowVisit_RequestWorkflowInstance(workflowexecution.proxies.RequestWorkflowInstance workflowvisit_requestworkflowinstance)
	{
		setWorkflowVisit_RequestWorkflowInstance(getContext(), workflowvisit_requestworkflowinstance);
	}

	/**
	 * Set value of WorkflowVisit_RequestWorkflowInstance
	 * @param context
	 * @param workflowvisit_requestworkflowinstance
	 */
	public final void setWorkflowVisit_RequestWorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context, workflowexecution.proxies.RequestWorkflowInstance workflowvisit_requestworkflowinstance)
	{
		if (workflowvisit_requestworkflowinstance == null)
			getMendixObject().setValue(context, MemberNames.WorkflowVisit_RequestWorkflowInstance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowVisit_RequestWorkflowInstance.toString(), workflowvisit_requestworkflowinstance.getMendixObject().getId());
	}

	/**
	 * @return value of WorkflowVisit_SubWorkflowNodeVisit
	 */
	public final workflowexecution.proxies.SubWorkflowNodeVisit getWorkflowVisit_SubWorkflowNodeVisit() throws com.mendix.core.CoreException
	{
		return getWorkflowVisit_SubWorkflowNodeVisit(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowVisit_SubWorkflowNodeVisit
	 */
	public final workflowexecution.proxies.SubWorkflowNodeVisit getWorkflowVisit_SubWorkflowNodeVisit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowexecution.proxies.SubWorkflowNodeVisit result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowVisit_SubWorkflowNodeVisit.toString());
		if (identifier != null)
			result = workflowexecution.proxies.SubWorkflowNodeVisit.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowVisit_SubWorkflowNodeVisit
	 * @param workflowvisit_subworkflownodevisit
	 */
	public final void setWorkflowVisit_SubWorkflowNodeVisit(workflowexecution.proxies.SubWorkflowNodeVisit workflowvisit_subworkflownodevisit)
	{
		setWorkflowVisit_SubWorkflowNodeVisit(getContext(), workflowvisit_subworkflownodevisit);
	}

	/**
	 * Set value of WorkflowVisit_SubWorkflowNodeVisit
	 * @param context
	 * @param workflowvisit_subworkflownodevisit
	 */
	public final void setWorkflowVisit_SubWorkflowNodeVisit(com.mendix.systemwideinterfaces.core.IContext context, workflowexecution.proxies.SubWorkflowNodeVisit workflowvisit_subworkflownodevisit)
	{
		if (workflowvisit_subworkflownodevisit == null)
			getMendixObject().setValue(context, MemberNames.WorkflowVisit_SubWorkflowNodeVisit.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowVisit_SubWorkflowNodeVisit.toString(), workflowvisit_subworkflownodevisit.getMendixObject().getId());
	}

	/**
	 * @return value of WorkflowVisit_WorkflowResult
	 */
	public final workflowshared.proxies.WorkflowResult getWorkflowVisit_WorkflowResult() throws com.mendix.core.CoreException
	{
		return getWorkflowVisit_WorkflowResult(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowVisit_WorkflowResult
	 */
	public final workflowshared.proxies.WorkflowResult getWorkflowVisit_WorkflowResult(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowshared.proxies.WorkflowResult result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowVisit_WorkflowResult.toString());
		if (identifier != null)
			result = workflowshared.proxies.WorkflowResult.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowVisit_WorkflowResult
	 * @param workflowvisit_workflowresult
	 */
	public final void setWorkflowVisit_WorkflowResult(workflowshared.proxies.WorkflowResult workflowvisit_workflowresult)
	{
		setWorkflowVisit_WorkflowResult(getContext(), workflowvisit_workflowresult);
	}

	/**
	 * Set value of WorkflowVisit_WorkflowResult
	 * @param context
	 * @param workflowvisit_workflowresult
	 */
	public final void setWorkflowVisit_WorkflowResult(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.WorkflowResult workflowvisit_workflowresult)
	{
		if (workflowvisit_workflowresult == null)
			getMendixObject().setValue(context, MemberNames.WorkflowVisit_WorkflowResult.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowVisit_WorkflowResult.toString(), workflowvisit_workflowresult.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowVisitMendixObject;
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
			final workflowexecution.proxies.WorkflowVisit that = (workflowexecution.proxies.WorkflowVisit) obj;
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
		return "WorkflowExecution.WorkflowVisit";
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
