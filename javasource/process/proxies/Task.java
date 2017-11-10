// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class Task extends process.proxies.Request
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.Task";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TaskID("TaskID"),
		TaskIDShort("TaskIDShort"),
		TaskProcess("TaskProcess"),
		ParentTaskID("ParentTaskID"),
		SubTaskLevel("SubTaskLevel"),
		UU95_HasParentTask("UU95_HasParentTask"),
		HasTemplates("HasTemplates"),
		RequestID("RequestID"),
		TicketID("TicketID"),
		TicketIDShort("TicketIDShort"),
		RequestTicketIDShort("RequestTicketIDShort"),
		RequestTaskID("RequestTaskID"),
		RequestTaskIDShort("RequestTaskIDShort"),
		ShortDescription("ShortDescription"),
		DetailDescription("DetailDescription"),
		DetailDescriptionNoHTML("DetailDescriptionNoHTML"),
		CreateTime("CreateTime"),
		FoundContract("FoundContract"),
		SelectContractUsingDropDown("SelectContractUsingDropDown"),
		FoundServiceProcess("FoundServiceProcess"),
		SelectServiceProcessUsingDropDown("SelectServiceProcessUsingDropDown"),
		FoundCI("FoundCI"),
		SelectCIUsingDropDown("SelectCIUsingDropDown"),
		FoundService("FoundService"),
		SelectServiceUsingDropDown("SelectServiceUsingDropDown"),
		FoundUIP("FoundUIP"),
		FoundImpact("FoundImpact"),
		FoundEmptyImpact("FoundEmptyImpact"),
		SelectImpactUsingDropDown("SelectImpactUsingDropDown"),
		FoundUrgency("FoundUrgency"),
		FoundEmptyUrgency("FoundEmptyUrgency"),
		SelectUrgencyUsingDropDown("SelectUrgencyUsingDropDown"),
		FoundPriority("FoundPriority"),
		FoundEmptyPriority("FoundEmptyPriority"),
		SelectPriorityUsingDropDown("SelectPriorityUsingDropDown"),
		FoundDeliveringOrganisation("FoundDeliveringOrganisation"),
		SelectDeleveringOrganisationUsingDropDown("SelectDeleveringOrganisationUsingDropDown"),
		ProcessType("ProcessType"),
		ShowTasksPreference("ShowTasksPreference"),
		ShowProgressPreference("ShowProgressPreference"),
		ShowTasksFunction("ShowTasksFunction"),
		ChangeAspects("ChangeAspects"),
		ProgressNotes("ProgressNotes"),
		TempOrder("TempOrder"),
		DoGenerateNotifications("DoGenerateNotifications"),
		DoGenerateNotificationsDateTime("DoGenerateNotificationsDateTime"),
		SolutionDescription("SolutionDescription"),
		ActualEndTime("ActualEndTime"),
		ActualResponseTime("ActualResponseTime"),
		ContractEndTime("ContractEndTime"),
		ContractResponseTime("ContractResponseTime"),
		RequestCreation("RequestCreation"),
		RequestType("RequestType"),
		FirstLine("FirstLine"),
		FTR("FTR"),
		MasterTicket("MasterTicket"),
		IsQuickCall("IsQuickCall"),
		QuickCallShortDescription("QuickCallShortDescription"),
		QuickCallDetailDescription("QuickCallDetailDescription"),
		CommitmentResolveTimeBy("CommitmentResolveTimeBy"),
		UserHasWritePermissions("UserHasWritePermissions"),
		UserHasGroupWritePermissions("UserHasGroupWritePermissions"),
		UserHasNoteWritePermissions("UserHasNoteWritePermissions"),
		IsCreated("IsCreated"),
		RequestType_Enum("RequestType_Enum"),
		CombinedID("CombinedID"),
		Channel("Channel"),
		CustomerSatisfaction("CustomerSatisfaction"),
		AnyPortalActionAvailable("AnyPortalActionAvailable"),
		PortalCloseAvailable("PortalCloseAvailable"),
		PortalRejectAvailable("PortalRejectAvailable"),
		PortalCancelAvailable("PortalCancelAvailable"),
		ShowSolutionPortal("ShowSolutionPortal"),
		ScheduledStart("ScheduledStart"),
		ScheduledEnd("ScheduledEnd"),
		CreatePlannedRequest("CreatePlannedRequest"),
		AssigneeIsEmpty("AssigneeIsEmpty"),
		UU95_PersonIsEmpty("UU95_PersonIsEmpty"),
		UU95_CallerIsEmpty("UU95_CallerIsEmpty"),
		PortalUserHasWritePermissions("PortalUserHasWritePermissions"),
		WishDateStart("WishDateStart"),
		WishDateEnd("WishDateEnd"),
		UU95_UseDynamicAttributes("UU95_UseDynamicAttributes"),
		UU95_SolvedClosedMessage("UU95_SolvedClosedMessage"),
		TriggerLevel("TriggerLevel"),
		ShowCartTab("ShowCartTab"),
		EditSLAEndTime("EditSLAEndTime"),
		Token("Token"),
		UU95_AllowCreateTask("UU95_AllowCreateTask"),
		ChangedByMF("ChangedByMF"),
		PlannedOpenClosed("PlannedOpenClosed"),
		ActionSource("ActionSource"),
		AgendaAllDay("AgendaAllDay"),
		UseLocation("UseLocation"),
		CallingOnBehalfOf("CallingOnBehalfOf"),
		QuickRequestRelated("QuickRequestRelated"),
		ShowCallingOnBebehalfOF("ShowCallingOnBebehalfOF"),
		IsInterfaceCommit("IsInterfaceCommit"),
		QueuedRequest("QueuedRequest"),
		CreatedFromTemplate("CreatedFromTemplate"),
		UU95_PortalUserHasCIs("UU95_PortalUserHasCIs"),
		UU95_OpenTasksOfTotalTasks("UU95_OpenTasksOfTotalTasks"),
		SolveTime("SolveTime"),
		FunctionTime("FunctionTime"),
		UseAsTemplate("UseAsTemplate"),
		UU95_UpdateChangeCalendar("UU95_UpdateChangeCalendar"),
		AssignedTo("AssignedTo"),
		HasParentTask("HasParentTask"),
		MobileAssignToPerson("MobileAssignToPerson"),
		FoundScreenBlocks("FoundScreenBlocks"),
		CABDate("CABDate"),
		WorkAround("WorkAround"),
		HasPersonCaller("HasPersonCaller"),
		SelectCIUsingDropDown_2("SelectCIUsingDropDown_2"),
		SelectCIUsingDropDown_3("SelectCIUsingDropDown_3"),
		ProblemTypeInput("ProblemTypeInput"),
		ChangeTypeInput("ChangeTypeInput"),
		ReasonInput("ReasonInput"),
		CustomerWishDateInput("CustomerWishDateInput"),
		CustomerWishDateReasonInput("CustomerWishDateReasonInput"),
		HasLegislation("HasLegislation"),
		CreateTimeUTC("CreateTimeUTC"),
		ScheduledStartUTC("ScheduledStartUTC"),
		ScheduledEndUTC("ScheduledEndUTC"),
		ActualEndTimeUTC("ActualEndTimeUTC"),
		RootCause("RootCause"),
		Balkenplanning("Balkenplanning"),
		IsNotam("IsNotam"),
		NotDisturbant("NotDisturbant"),
		BPType("BPType"),
		HideBlocksOnCreate("HideBlocksOnCreate"),
		ContractEndTimeUTC("ContractEndTimeUTC"),
		SolutionDescriptionForMail("SolutionDescriptionForMail"),
		FirstCallResolution("FirstCallResolution"),
		ReleaseDate("ReleaseDate"),
		SelectAssignedPersonUsingDropDown("SelectAssignedPersonUsingDropDown"),
		TaskID_Task("Process.TaskID_Task"),
		Task_Request("Process.Task_Request"),
		Task_Task("Process.Task_Task"),
		Task_OwnerGroup("Process.Task_OwnerGroup"),
		Task_TemplateTask("Process.Task_TemplateTask"),
		TicketIDs_Request("Process.TicketIDs_Request"),
		Request_PausedTime("Process.Request_PausedTime"),
		Request_QuickCallDescription("Process.Request_QuickCallDescription"),
		XX_Request_ExternalReference("Process.XX_Request_ExternalReference"),
		Request_DynamicAttributeGroup("Process.Request_DynamicAttributeGroup"),
		RequestOpeningCategory_Request("Process.RequestOpeningCategory_Request"),
		RequestClosureCategory_Request("Process.RequestClosureCategory_Request"),
		RequestRemainingTime_Request("Process.RequestRemainingTime_Request"),
		ExternalReference_Request("Process.ExternalReference_Request"),
		CalculatedAdditionalInfo_Request("Process.CalculatedAdditionalInfo_Request"),
		Request_TaskCounter("Process.Request_TaskCounter"),
		TicketRelations_TempUpdateInitiatingRequest("Process.TicketRelations_TempUpdateInitiatingRequest"),
		OverviewRequest_Request("Process.OverviewRequest_Request"),
		Request_LabelEntity("Process.Request_LabelEntity"),
		SLACI_Select_Request("Process.SLACI_Select_Request"),
		Billingsheet_Request("Billing.Billingsheet_Request"),
		TotalRequestCost_Request("Billing.TotalRequestCost_Request"),
		IncomingRequest_Request("InterfaceRequests.IncomingRequest_Request"),
		Knowledge_Request("KnowledgeManagement.Knowledge_Request"),
		Request_Service_Process("Process.Request_Service_Process"),
		Request_Service("Process.Request_Service"),
		Request_Contract("Process.Request_Contract"),
		Request_Commitment("Process.Request_Commitment"),
		Request_IUP_Combination("Process.Request_IUP_Combination"),
		Request_Impact("Process.Request_Impact"),
		Request_Urgency("Process.Request_Urgency"),
		Request_Priority("Process.Request_Priority"),
		Request_Person("Process.Request_Person"),
		Request_Location("Process.Request_Location"),
		Receiving_Organisation("Process.Receiving_Organisation"),
		Delivering_Organisation("Process.Delivering_Organisation"),
		Request_Location_Caller("Process.Request_Location_Caller"),
		Request_Person_Caller("Process.Request_Person_Caller"),
		Request_ConfigurationItem("Process.Request_ConfigurationItem"),
		Request_Matrix("Process.Request_Matrix"),
		Request_Phase("Process.Request_Phase"),
		Request_State("Process.Request_State"),
		Request_Transition("Process.Request_Transition"),
		Temp_Request_Transition("Process.Temp_Request_Transition"),
		Request_SLMPortalQuickCall("Process.Request_SLMPortalQuickCall"),
		Request_AssignedPerson("Process.Request_AssignedPerson"),
		Request_ScheduledDay("Process.Request_ScheduledDay"),
		Request_Analysis("Process.Request_Analysis"),
		Request_Script_Instance("Process.Request_Script_Instance"),
		Request_Script("Process.Request_Script"),
		Request_ShoppingCartProducts_Temp("Process.Request_ShoppingCartProducts_Temp"),
		Request_ShoppingCartProduct_Temp("Process.Request_ShoppingCartProduct_Temp"),
		Request_DataAccess("Process.Request_DataAccess"),
		Request_Room("Process.Request_Room"),
		Request_Organisation_Caller("Process.Request_Organisation_Caller"),
		Request_ParentInterfaceProcessingPart("Process.Request_ParentInterfaceProcessingPart"),
		Request_InitiatingInterfaceConfiguration("Process.Request_InitiatingInterfaceConfiguration"),
		Request_TempEventInitiatingProcessingAttempt("Process.Request_TempEventInitiatingProcessingAttempt"),
		Request_Category_Closure("Process.Request_Category_Closure"),
		Request_Category_Opening("Process.Request_Category_Opening"),
		Request_ChangeCalendar("Process.Request_ChangeCalendar"),
		Request_SyncDelayedFunction("Process.Request_SyncDelayedFunction"),
		Request_SPAllowedRelation("Process.Request_SPAllowedRelation"),
		Request_QuestionnaireTemplateSelect("Process.Request_QuestionnaireTemplateSelect"),
		Request_AutoComplete_ConfigurationItem("Process.Request_AutoComplete_ConfigurationItem"),
		Request_AutoComplete_Organisation("Process.Request_AutoComplete_Organisation"),
		Request_AutoComplete_Person("Process.Request_AutoComplete_Person"),
		Request_AutoComplete_Location("Process.Request_AutoComplete_Location"),
		Request_Project("Process.Request_Project"),
		Request_Legislation("Process.Request_Legislation"),
		Request_Department("Process.Request_Department"),
		Request_ConfigurationItem_2("Process.Request_ConfigurationItem_2"),
		Request_ConfigurationItem_3("Process.Request_ConfigurationItem_3"),
		Request_RelationMandatory_ServiceProcess("Process.Request_RelationMandatory_ServiceProcess"),
		Request_AffectedUsers("Process.Request_AffectedUsers"),
		Request_SelectedKnowledge("Process.Request_SelectedKnowledge"),
		ShoppingCart_Request("ServiceCatalogue.ShoppingCart_Request"),
		ShoppingCartProduct_Request("ServiceCatalogue.ShoppingCartProduct_Request"),
		QuestionnaireActive_Request("QuestionnaireV2.QuestionnaireActive_Request");

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

	public Task(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.Task"));
	}

	protected Task(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject taskMendixObject)
	{
		super(context, taskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Process.Task", taskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.Task");
	}

	/**
	 * @deprecated Use 'Task.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.Task initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.Task.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.Task initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.Task(context, mendixObject);
	}

	public static process.proxies.Task load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.Task.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.Task> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.Task> result = new java.util.ArrayList<process.proxies.Task>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.Task" + xpathConstraint))
			result.add(process.proxies.Task.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of TaskID
	 */
	public final java.lang.String getTaskID()
	{
		return getTaskID(getContext());
	}

	/**
	 * @param context
	 * @return value of TaskID
	 */
	public final java.lang.String getTaskID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TaskID.toString());
	}

	/**
	 * Set value of TaskID
	 * @param taskid
	 */
	public final void setTaskID(java.lang.String taskid)
	{
		setTaskID(getContext(), taskid);
	}

	/**
	 * Set value of TaskID
	 * @param context
	 * @param taskid
	 */
	public final void setTaskID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String taskid)
	{
		getMendixObject().setValue(context, MemberNames.TaskID.toString(), taskid);
	}

	/**
	 * @return value of TaskIDShort
	 */
	public final java.lang.String getTaskIDShort()
	{
		return getTaskIDShort(getContext());
	}

	/**
	 * @param context
	 * @return value of TaskIDShort
	 */
	public final java.lang.String getTaskIDShort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TaskIDShort.toString());
	}

	/**
	 * Set value of TaskIDShort
	 * @param taskidshort
	 */
	public final void setTaskIDShort(java.lang.String taskidshort)
	{
		setTaskIDShort(getContext(), taskidshort);
	}

	/**
	 * Set value of TaskIDShort
	 * @param context
	 * @param taskidshort
	 */
	public final void setTaskIDShort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String taskidshort)
	{
		getMendixObject().setValue(context, MemberNames.TaskIDShort.toString(), taskidshort);
	}

	/**
	 * Set value of TaskProcess
	 * @param taskprocess
	 */
	public final slm.proxies.ProcessType getTaskProcess()
	{
		return getTaskProcess(getContext());
	}

	/**
	 * @param context
	 * @return value of TaskProcess
	 */
	public final slm.proxies.ProcessType getTaskProcess(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TaskProcess.toString());
		if (obj == null)
			return null;

		return slm.proxies.ProcessType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TaskProcess
	 * @param taskprocess
	 */
	public final void setTaskProcess(slm.proxies.ProcessType taskprocess)
	{
		setTaskProcess(getContext(), taskprocess);
	}

	/**
	 * Set value of TaskProcess
	 * @param context
	 * @param taskprocess
	 */
	public final void setTaskProcess(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.ProcessType taskprocess)
	{
		if (taskprocess != null)
			getMendixObject().setValue(context, MemberNames.TaskProcess.toString(), taskprocess.toString());
		else
			getMendixObject().setValue(context, MemberNames.TaskProcess.toString(), null);
	}

	/**
	 * @return value of ParentTaskID
	 */
	public final java.lang.String getParentTaskID()
	{
		return getParentTaskID(getContext());
	}

	/**
	 * @param context
	 * @return value of ParentTaskID
	 */
	public final java.lang.String getParentTaskID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ParentTaskID.toString());
	}

	/**
	 * Set value of ParentTaskID
	 * @param parenttaskid
	 */
	public final void setParentTaskID(java.lang.String parenttaskid)
	{
		setParentTaskID(getContext(), parenttaskid);
	}

	/**
	 * Set value of ParentTaskID
	 * @param context
	 * @param parenttaskid
	 */
	public final void setParentTaskID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String parenttaskid)
	{
		getMendixObject().setValue(context, MemberNames.ParentTaskID.toString(), parenttaskid);
	}

	/**
	 * @return value of SubTaskLevel
	 */
	public final java.lang.Integer getSubTaskLevel()
	{
		return getSubTaskLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of SubTaskLevel
	 */
	public final java.lang.Integer getSubTaskLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.SubTaskLevel.toString());
	}

	/**
	 * Set value of SubTaskLevel
	 * @param subtasklevel
	 */
	public final void setSubTaskLevel(java.lang.Integer subtasklevel)
	{
		setSubTaskLevel(getContext(), subtasklevel);
	}

	/**
	 * Set value of SubTaskLevel
	 * @param context
	 * @param subtasklevel
	 */
	public final void setSubTaskLevel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer subtasklevel)
	{
		getMendixObject().setValue(context, MemberNames.SubTaskLevel.toString(), subtasklevel);
	}

	/**
	 * @return value of UU95_HasParentTask
	 */
	public final java.lang.Boolean getUU95_HasParentTask()
	{
		return getUU95_HasParentTask(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_HasParentTask
	 */
	public final java.lang.Boolean getUU95_HasParentTask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UU95_HasParentTask.toString());
	}

	/**
	 * Set value of UU95_HasParentTask
	 * @param uu95_hasparenttask
	 */
	public final void setUU95_HasParentTask(java.lang.Boolean uu95_hasparenttask)
	{
		setUU95_HasParentTask(getContext(), uu95_hasparenttask);
	}

	/**
	 * Set value of UU95_HasParentTask
	 * @param context
	 * @param uu95_hasparenttask
	 */
	public final void setUU95_HasParentTask(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean uu95_hasparenttask)
	{
		getMendixObject().setValue(context, MemberNames.UU95_HasParentTask.toString(), uu95_hasparenttask);
	}

	/**
	 * @return value of HasTemplates
	 */
	public final java.lang.Boolean getHasTemplates()
	{
		return getHasTemplates(getContext());
	}

	/**
	 * @param context
	 * @return value of HasTemplates
	 */
	public final java.lang.Boolean getHasTemplates(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasTemplates.toString());
	}

	/**
	 * Set value of HasTemplates
	 * @param hastemplates
	 */
	public final void setHasTemplates(java.lang.Boolean hastemplates)
	{
		setHasTemplates(getContext(), hastemplates);
	}

	/**
	 * Set value of HasTemplates
	 * @param context
	 * @param hastemplates
	 */
	public final void setHasTemplates(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hastemplates)
	{
		getMendixObject().setValue(context, MemberNames.HasTemplates.toString(), hastemplates);
	}

	/**
	 * @return value of TaskID_Task
	 */
	public final process.proxies.TaskID getTaskID_Task() throws com.mendix.core.CoreException
	{
		return getTaskID_Task(getContext());
	}

	/**
	 * @param context
	 * @return value of TaskID_Task
	 */
	public final process.proxies.TaskID getTaskID_Task(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.TaskID result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TaskID_Task.toString());
		if (identifier != null)
			result = process.proxies.TaskID.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TaskID_Task
	 * @param taskid_task
	 */
	public final void setTaskID_Task(process.proxies.TaskID taskid_task)
	{
		setTaskID_Task(getContext(), taskid_task);
	}

	/**
	 * Set value of TaskID_Task
	 * @param context
	 * @param taskid_task
	 */
	public final void setTaskID_Task(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.TaskID taskid_task)
	{
		if (taskid_task == null)
			getMendixObject().setValue(context, MemberNames.TaskID_Task.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TaskID_Task.toString(), taskid_task.getMendixObject().getId());
	}

	/**
	 * @return value of Task_Request
	 */
	public final process.proxies.Request getTask_Request() throws com.mendix.core.CoreException
	{
		return getTask_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of Task_Request
	 */
	public final process.proxies.Request getTask_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Task_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Task_Request
	 * @param task_request
	 */
	public final void setTask_Request(process.proxies.Request task_request)
	{
		setTask_Request(getContext(), task_request);
	}

	/**
	 * Set value of Task_Request
	 * @param context
	 * @param task_request
	 */
	public final void setTask_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request task_request)
	{
		if (task_request == null)
			getMendixObject().setValue(context, MemberNames.Task_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Task_Request.toString(), task_request.getMendixObject().getId());
	}

	/**
	 * @return value of Task_Task
	 */
	public final process.proxies.Task getTask_Task() throws com.mendix.core.CoreException
	{
		return getTask_Task(getContext());
	}

	/**
	 * @param context
	 * @return value of Task_Task
	 */
	public final process.proxies.Task getTask_Task(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Task result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Task_Task.toString());
		if (identifier != null)
			result = process.proxies.Task.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Task_Task
	 * @param task_task
	 */
	public final void setTask_Task(process.proxies.Task task_task)
	{
		setTask_Task(getContext(), task_task);
	}

	/**
	 * Set value of Task_Task
	 * @param context
	 * @param task_task
	 */
	public final void setTask_Task(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Task task_task)
	{
		if (task_task == null)
			getMendixObject().setValue(context, MemberNames.Task_Task.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Task_Task.toString(), task_task.getMendixObject().getId());
	}

	/**
	 * @return value of Task_OwnerGroup
	 */
	public final nap.proxies.Organisation getTask_OwnerGroup() throws com.mendix.core.CoreException
	{
		return getTask_OwnerGroup(getContext());
	}

	/**
	 * @param context
	 * @return value of Task_OwnerGroup
	 */
	public final nap.proxies.Organisation getTask_OwnerGroup(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Organisation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Task_OwnerGroup.toString());
		if (identifier != null)
			result = nap.proxies.Organisation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Task_OwnerGroup
	 * @param task_ownergroup
	 */
	public final void setTask_OwnerGroup(nap.proxies.Organisation task_ownergroup)
	{
		setTask_OwnerGroup(getContext(), task_ownergroup);
	}

	/**
	 * Set value of Task_OwnerGroup
	 * @param context
	 * @param task_ownergroup
	 */
	public final void setTask_OwnerGroup(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Organisation task_ownergroup)
	{
		if (task_ownergroup == null)
			getMendixObject().setValue(context, MemberNames.Task_OwnerGroup.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Task_OwnerGroup.toString(), task_ownergroup.getMendixObject().getId());
	}

	/**
	 * @return value of Task_TemplateTask
	 */
	public final scheduling.proxies.TemplateTask getTask_TemplateTask() throws com.mendix.core.CoreException
	{
		return getTask_TemplateTask(getContext());
	}

	/**
	 * @param context
	 * @return value of Task_TemplateTask
	 */
	public final scheduling.proxies.TemplateTask getTask_TemplateTask(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		scheduling.proxies.TemplateTask result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Task_TemplateTask.toString());
		if (identifier != null)
			result = scheduling.proxies.TemplateTask.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Task_TemplateTask
	 * @param task_templatetask
	 */
	public final void setTask_TemplateTask(scheduling.proxies.TemplateTask task_templatetask)
	{
		setTask_TemplateTask(getContext(), task_templatetask);
	}

	/**
	 * Set value of Task_TemplateTask
	 * @param context
	 * @param task_templatetask
	 */
	public final void setTask_TemplateTask(com.mendix.systemwideinterfaces.core.IContext context, scheduling.proxies.TemplateTask task_templatetask)
	{
		if (task_templatetask == null)
			getMendixObject().setValue(context, MemberNames.Task_TemplateTask.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Task_TemplateTask.toString(), task_templatetask.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final process.proxies.Task that = (process.proxies.Task) obj;
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
		return "Process.Task";
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
