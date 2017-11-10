// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class Change extends process.proxies.Request
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.Change";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Reason("Reason"),
		ChangeType("ChangeType"),
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

	public Change(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.Change"));
	}

	protected Change(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject changeMendixObject)
	{
		super(context, changeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Process.Change", changeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.Change");
	}

	/**
	 * @deprecated Use 'Change.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.Change initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.Change.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.Change initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.Change(context, mendixObject);
	}

	public static process.proxies.Change load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.Change.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.Change> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.Change> result = new java.util.ArrayList<process.proxies.Change>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.Change" + xpathConstraint))
			result.add(process.proxies.Change.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Reason
	 */
	public final java.lang.String getReason()
	{
		return getReason(getContext());
	}

	/**
	 * @param context
	 * @return value of Reason
	 */
	public final java.lang.String getReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Reason.toString());
	}

	/**
	 * Set value of Reason
	 * @param reason
	 */
	public final void setReason(java.lang.String reason)
	{
		setReason(getContext(), reason);
	}

	/**
	 * Set value of Reason
	 * @param context
	 * @param reason
	 */
	public final void setReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reason)
	{
		getMendixObject().setValue(context, MemberNames.Reason.toString(), reason);
	}

	/**
	 * Set value of ChangeType
	 * @param changetype
	 */
	public final process.proxies.ChangeType getChangeType()
	{
		return getChangeType(getContext());
	}

	/**
	 * @param context
	 * @return value of ChangeType
	 */
	public final process.proxies.ChangeType getChangeType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ChangeType.toString());
		if (obj == null)
			return null;

		return process.proxies.ChangeType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ChangeType
	 * @param changetype
	 */
	public final void setChangeType(process.proxies.ChangeType changetype)
	{
		setChangeType(getContext(), changetype);
	}

	/**
	 * Set value of ChangeType
	 * @param context
	 * @param changetype
	 */
	public final void setChangeType(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.ChangeType changetype)
	{
		if (changetype != null)
			getMendixObject().setValue(context, MemberNames.ChangeType.toString(), changetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ChangeType.toString(), null);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final process.proxies.Change that = (process.proxies.Change) obj;
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
		return "Process.Change";
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
