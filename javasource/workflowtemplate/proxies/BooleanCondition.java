// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowtemplate.proxies;

public class BooleanCondition extends workflowtemplate.proxies.Condition
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowTemplate.BooleanCondition";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		BooleanConditionType("BooleanConditionType"),
		Description("Description"),
		ConditionType("ConditionType"),
		Order("Order"),
		IsSubCondition("IsSubCondition"),
		IsNot("IsNot"),
		ShowOrder("ShowOrder"),
		ConditionFor("ConditionFor"),
		BooleanCondition_Conditions("WorkflowTemplate.BooleanCondition_Conditions"),
		ConditionalLink_Condition("WorkflowTemplate.ConditionalLink_Condition"),
		Condition_Workflow("WorkflowTemplate.Condition_Workflow"),
		Condition_WorkflowResult("WorkflowTemplate.Condition_WorkflowResult"),
		Condition_TriggerSetup("WorkflowTemplate.Condition_TriggerSetup"),
		OutgoingRequestCondition_TriggerSetup("WorkflowTemplate.OutgoingRequestCondition_TriggerSetup");

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

	public BooleanCondition(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowTemplate.BooleanCondition"));
	}

	protected BooleanCondition(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject booleanConditionMendixObject)
	{
		super(context, booleanConditionMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowTemplate.BooleanCondition", booleanConditionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowTemplate.BooleanCondition");
	}

	/**
	 * @deprecated Use 'BooleanCondition.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowtemplate.proxies.BooleanCondition initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowtemplate.proxies.BooleanCondition.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowtemplate.proxies.BooleanCondition initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowtemplate.proxies.BooleanCondition(context, mendixObject);
	}

	public static workflowtemplate.proxies.BooleanCondition load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowtemplate.proxies.BooleanCondition.initialize(context, mendixObject);
	}

	public static java.util.List<workflowtemplate.proxies.BooleanCondition> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowtemplate.proxies.BooleanCondition> result = new java.util.ArrayList<workflowtemplate.proxies.BooleanCondition>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowTemplate.BooleanCondition" + xpathConstraint))
			result.add(workflowtemplate.proxies.BooleanCondition.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of BooleanConditionType
	 * @param booleanconditiontype
	 */
	public final workflowshared.proxies.BooleanConditionEnum getBooleanConditionType()
	{
		return getBooleanConditionType(getContext());
	}

	/**
	 * @param context
	 * @return value of BooleanConditionType
	 */
	public final workflowshared.proxies.BooleanConditionEnum getBooleanConditionType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.BooleanConditionType.toString());
		if (obj == null)
			return null;

		return workflowshared.proxies.BooleanConditionEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of BooleanConditionType
	 * @param booleanconditiontype
	 */
	public final void setBooleanConditionType(workflowshared.proxies.BooleanConditionEnum booleanconditiontype)
	{
		setBooleanConditionType(getContext(), booleanconditiontype);
	}

	/**
	 * Set value of BooleanConditionType
	 * @param context
	 * @param booleanconditiontype
	 */
	public final void setBooleanConditionType(com.mendix.systemwideinterfaces.core.IContext context, workflowshared.proxies.BooleanConditionEnum booleanconditiontype)
	{
		if (booleanconditiontype != null)
			getMendixObject().setValue(context, MemberNames.BooleanConditionType.toString(), booleanconditiontype.toString());
		else
			getMendixObject().setValue(context, MemberNames.BooleanConditionType.toString(), null);
	}

	/**
	 * @return value of BooleanCondition_Conditions
	 */
	public final java.util.List<workflowtemplate.proxies.Condition> getBooleanCondition_Conditions() throws com.mendix.core.CoreException
	{
		return getBooleanCondition_Conditions(getContext());
	}

	/**
	 * @param context
	 * @return value of BooleanCondition_Conditions
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<workflowtemplate.proxies.Condition> getBooleanCondition_Conditions(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<workflowtemplate.proxies.Condition> result = new java.util.ArrayList<workflowtemplate.proxies.Condition>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.BooleanCondition_Conditions.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(workflowtemplate.proxies.Condition.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of BooleanCondition_Conditions
	 * @param booleancondition_conditions
	 */
	public final void setBooleanCondition_Conditions(java.util.List<workflowtemplate.proxies.Condition> booleancondition_conditions)
	{
		setBooleanCondition_Conditions(getContext(), booleancondition_conditions);
	}

	/**
	 * Set value of BooleanCondition_Conditions
	 * @param context
	 * @param booleancondition_conditions
	 */
	public final void setBooleanCondition_Conditions(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<workflowtemplate.proxies.Condition> booleancondition_conditions)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (workflowtemplate.proxies.Condition proxyObject : booleancondition_conditions)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.BooleanCondition_Conditions.toString(), identifiers);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowtemplate.proxies.BooleanCondition that = (workflowtemplate.proxies.BooleanCondition) obj;
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
		return "WorkflowTemplate.BooleanCondition";
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
