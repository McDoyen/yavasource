// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowexecution.proxies;

public class RequestWorkflowInstance extends workflowinstance.proxies.Workflow
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowExecution.RequestWorkflowInstance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Editable("Editable"),
		UU95_Manual("UU95_Manual"),
		InstanceID("InstanceID"),
		Name("Name"),
		ProcessType("ProcessType"),
		Description("Description"),
		ValidationText("ValidationText"),
		Valid("Valid"),
		RequestWorkflowInstance_Request("WorkflowExecution.RequestWorkflowInstance_Request"),
		RequestWorkflowInstance_RequestEvent("WorkflowExecution.RequestWorkflowInstance_RequestEvent"),
		RequestWorkflowInstance_TriggerSetup("WorkflowExecution.RequestWorkflowInstance_TriggerSetup"),
		ChartXML_InstanceWorkflow("FusionChartsPlus.ChartXML_InstanceWorkflow"),
		Workflow_BusinessGroups("WorkflowInstance.Workflow_BusinessGroups"),
		Workflow_Matrix("WorkflowInstance.Workflow_Matrix");

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

	public RequestWorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowExecution.RequestWorkflowInstance"));
	}

	protected RequestWorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestWorkflowInstanceMendixObject)
	{
		super(context, requestWorkflowInstanceMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowExecution.RequestWorkflowInstance", requestWorkflowInstanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowExecution.RequestWorkflowInstance");
	}

	/**
	 * @deprecated Use 'RequestWorkflowInstance.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowexecution.proxies.RequestWorkflowInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowexecution.proxies.RequestWorkflowInstance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowexecution.proxies.RequestWorkflowInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowexecution.proxies.RequestWorkflowInstance(context, mendixObject);
	}

	public static workflowexecution.proxies.RequestWorkflowInstance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowexecution.proxies.RequestWorkflowInstance.initialize(context, mendixObject);
	}

	public static java.util.List<workflowexecution.proxies.RequestWorkflowInstance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowexecution.proxies.RequestWorkflowInstance> result = new java.util.ArrayList<workflowexecution.proxies.RequestWorkflowInstance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowExecution.RequestWorkflowInstance" + xpathConstraint))
			result.add(workflowexecution.proxies.RequestWorkflowInstance.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of Editable
	 * @param editable
	 */
	public final workflowshared.proxies.RequestWorkflowInstanceStatus getEditable()
	{
		return getEditable(getContext());
	}

	/**
	 * @param context
	 * @return value of Editable
	 */
	public final workflowshared.proxies.RequestWorkflowInstanceStatus getEditable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Editable.toString());
		if (obj == null)
			return null;

		return workflowshared.proxies.RequestWorkflowInstanceStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Editable
	 * @param editable
	 */
	public final void setEditable(workflowshared.proxies.RequestWorkflowInstanceStatus editable)
	{
		setEditable(getContext(), editable);
	}

	/**
	 * Set value of Editable
	 * @param context
	 * @param editable
	 */
	public final void setEditable(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.RequestWorkflowInstanceStatus editable)
	{
		if (editable != null)
			getMendixObject().setValue(context, MemberNames.Editable.toString(), editable.toString());
		else
			getMendixObject().setValue(context, MemberNames.Editable.toString(), null);
	}

	/**
	 * @return value of UU95_Manual
	 */
	public final java.lang.Boolean getUU95_Manual()
	{
		return getUU95_Manual(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_Manual
	 */
	public final java.lang.Boolean getUU95_Manual(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UU95_Manual.toString());
	}

	/**
	 * Set value of UU95_Manual
	 * @param uu95_manual
	 */
	public final void setUU95_Manual(java.lang.Boolean uu95_manual)
	{
		setUU95_Manual(getContext(), uu95_manual);
	}

	/**
	 * Set value of UU95_Manual
	 * @param context
	 * @param uu95_manual
	 */
	public final void setUU95_Manual(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean uu95_manual)
	{
		getMendixObject().setValue(context, MemberNames.UU95_Manual.toString(), uu95_manual);
	}

	/**
	 * @return value of RequestWorkflowInstance_Request
	 */
	public final process.proxies.Request getRequestWorkflowInstance_Request() throws com.mendix.core.CoreException
	{
		return getRequestWorkflowInstance_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestWorkflowInstance_Request
	 */
	public final process.proxies.Request getRequestWorkflowInstance_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RequestWorkflowInstance_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RequestWorkflowInstance_Request
	 * @param requestworkflowinstance_request
	 */
	public final void setRequestWorkflowInstance_Request(process.proxies.Request requestworkflowinstance_request)
	{
		setRequestWorkflowInstance_Request(getContext(), requestworkflowinstance_request);
	}

	/**
	 * Set value of RequestWorkflowInstance_Request
	 * @param context
	 * @param requestworkflowinstance_request
	 */
	public final void setRequestWorkflowInstance_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request requestworkflowinstance_request)
	{
		if (requestworkflowinstance_request == null)
			getMendixObject().setValue(context, MemberNames.RequestWorkflowInstance_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RequestWorkflowInstance_Request.toString(), requestworkflowinstance_request.getMendixObject().getId());
	}

	/**
	 * @return value of RequestWorkflowInstance_RequestEvent
	 */
	public final process.proxies.RequestEvent getRequestWorkflowInstance_RequestEvent() throws com.mendix.core.CoreException
	{
		return getRequestWorkflowInstance_RequestEvent(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestWorkflowInstance_RequestEvent
	 */
	public final process.proxies.RequestEvent getRequestWorkflowInstance_RequestEvent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.RequestEvent result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RequestWorkflowInstance_RequestEvent.toString());
		if (identifier != null)
			result = process.proxies.RequestEvent.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RequestWorkflowInstance_RequestEvent
	 * @param requestworkflowinstance_requestevent
	 */
	public final void setRequestWorkflowInstance_RequestEvent(process.proxies.RequestEvent requestworkflowinstance_requestevent)
	{
		setRequestWorkflowInstance_RequestEvent(getContext(), requestworkflowinstance_requestevent);
	}

	/**
	 * Set value of RequestWorkflowInstance_RequestEvent
	 * @param context
	 * @param requestworkflowinstance_requestevent
	 */
	public final void setRequestWorkflowInstance_RequestEvent(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.RequestEvent requestworkflowinstance_requestevent)
	{
		if (requestworkflowinstance_requestevent == null)
			getMendixObject().setValue(context, MemberNames.RequestWorkflowInstance_RequestEvent.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RequestWorkflowInstance_RequestEvent.toString(), requestworkflowinstance_requestevent.getMendixObject().getId());
	}

	/**
	 * @return value of RequestWorkflowInstance_TriggerSetup
	 */
	public final trigger.proxies.TriggerSetup getRequestWorkflowInstance_TriggerSetup() throws com.mendix.core.CoreException
	{
		return getRequestWorkflowInstance_TriggerSetup(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestWorkflowInstance_TriggerSetup
	 */
	public final trigger.proxies.TriggerSetup getRequestWorkflowInstance_TriggerSetup(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		trigger.proxies.TriggerSetup result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RequestWorkflowInstance_TriggerSetup.toString());
		if (identifier != null)
			result = trigger.proxies.TriggerSetup.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RequestWorkflowInstance_TriggerSetup
	 * @param requestworkflowinstance_triggersetup
	 */
	public final void setRequestWorkflowInstance_TriggerSetup(trigger.proxies.TriggerSetup requestworkflowinstance_triggersetup)
	{
		setRequestWorkflowInstance_TriggerSetup(getContext(), requestworkflowinstance_triggersetup);
	}

	/**
	 * Set value of RequestWorkflowInstance_TriggerSetup
	 * @param context
	 * @param requestworkflowinstance_triggersetup
	 */
	public final void setRequestWorkflowInstance_TriggerSetup(com.mendix.systemwideinterfaces.core.IContext context, trigger.proxies.TriggerSetup requestworkflowinstance_triggersetup)
	{
		if (requestworkflowinstance_triggersetup == null)
			getMendixObject().setValue(context, MemberNames.RequestWorkflowInstance_TriggerSetup.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RequestWorkflowInstance_TriggerSetup.toString(), requestworkflowinstance_triggersetup.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowexecution.proxies.RequestWorkflowInstance that = (workflowexecution.proxies.RequestWorkflowInstance) obj;
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
		return "WorkflowExecution.RequestWorkflowInstance";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
