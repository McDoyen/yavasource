// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package scheduling.proxies;

public class TemplateTask extends scheduling.proxies.TemplateRequest
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Scheduling.TemplateTask";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TemplateRequestID("TemplateRequestID"),
		ShortDescription("ShortDescription"),
		DetailDescription("DetailDescription"),
		DetailDescriptionNoHTML("DetailDescriptionNoHTML"),
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
		CommitmentResolveTimeBy("CommitmentResolveTimeBy"),
		TemplateRequestType("TemplateRequestType"),
		CopyCartItems("CopyCartItems"),
		CallingOnBehalfOf("CallingOnBehalfOf"),
		UseLocation("UseLocation"),
		UU95_CallerIsEmpty("UU95_CallerIsEmpty"),
		SelectCIUsingDropDown_2("SelectCIUsingDropDown_2"),
		SelectCIUsingDropDown_3("SelectCIUsingDropDown_3"),
		TemplateRequest_Service_Process("Scheduling.TemplateRequest_Service_Process"),
		TemplateRequest_Service("Scheduling.TemplateRequest_Service"),
		TemplateRequest_Contract("Scheduling.TemplateRequest_Contract"),
		TemplateRequest_Commitment("Scheduling.TemplateRequest_Commitment"),
		TemplateRequest_IUP_Combination("Scheduling.TemplateRequest_IUP_Combination"),
		TemplateRequest_Impact("Scheduling.TemplateRequest_Impact"),
		TemplateRequest_Urgency("Scheduling.TemplateRequest_Urgency"),
		TemplateRequest_Priority("Scheduling.TemplateRequest_Priority"),
		TemplateRequest_Person("Scheduling.TemplateRequest_Person"),
		TemplateRequest_Location("Scheduling.TemplateRequest_Location"),
		Receiving_Organisation_TR("Scheduling.Receiving_Organisation_TR"),
		Delivering_Organisation_TR("Scheduling.Delivering_Organisation_TR"),
		TemplateRequest_Location_Caller("Scheduling.TemplateRequest_Location_Caller"),
		TemplateRequest_Person_Caller("Scheduling.TemplateRequest_Person_Caller"),
		TemplateRequest_ConfigurationItem("Scheduling.TemplateRequest_ConfigurationItem"),
		TemplateRequests_Affected_Items("Scheduling.TemplateRequests_Affected_Items"),
		TemplateRequest_Organisation_Caller("Scheduling.TemplateRequest_Organisation_Caller"),
		TemplateRequest_Room("Scheduling.TemplateRequest_Room"),
		TemplateRequest_Category_Opening("Scheduling.TemplateRequest_Category_Opening"),
		TemplateRequest_ConfigurationItem_2("Scheduling.TemplateRequest_ConfigurationItem_2"),
		TemplateRequest_ConfigurationItem_3("Scheduling.TemplateRequest_ConfigurationItem_3"),
		TemplateRequest_AffectedUsers("Scheduling.TemplateRequest_AffectedUsers");

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

	public TemplateTask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Scheduling.TemplateTask"));
	}

	protected TemplateTask(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject templateTaskMendixObject)
	{
		super(context, templateTaskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Scheduling.TemplateTask", templateTaskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Scheduling.TemplateTask");
	}

	/**
	 * @deprecated Use 'TemplateTask.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static scheduling.proxies.TemplateTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return scheduling.proxies.TemplateTask.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static scheduling.proxies.TemplateTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new scheduling.proxies.TemplateTask(context, mendixObject);
	}

	public static scheduling.proxies.TemplateTask load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return scheduling.proxies.TemplateTask.initialize(context, mendixObject);
	}

	public static java.util.List<scheduling.proxies.TemplateTask> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<scheduling.proxies.TemplateTask> result = new java.util.ArrayList<scheduling.proxies.TemplateTask>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Scheduling.TemplateTask" + xpathConstraint))
			result.add(scheduling.proxies.TemplateTask.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final scheduling.proxies.TemplateTask that = (scheduling.proxies.TemplateTask) obj;
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
		return "Scheduling.TemplateTask";
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