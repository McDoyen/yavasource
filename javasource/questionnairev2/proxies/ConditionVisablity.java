// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnairev2.proxies;

public class ConditionVisablity
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject conditionVisablityMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QuestionnaireV2.ConditionVisablity";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Condition("Condition"),
		ConditionVisablity_QuestionTemplate_has("QuestionnaireV2.ConditionVisablity_QuestionTemplate_has"),
		ConditionVisablity_QuestionTemplate_Related("QuestionnaireV2.ConditionVisablity_QuestionTemplate_Related"),
		ConditionVisablity_OptionSetup_Value("QuestionnaireV2.ConditionVisablity_OptionSetup_Value");

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

	public ConditionVisablity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "QuestionnaireV2.ConditionVisablity"));
	}

	protected ConditionVisablity(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject conditionVisablityMendixObject)
	{
		if (conditionVisablityMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("QuestionnaireV2.ConditionVisablity", conditionVisablityMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a QuestionnaireV2.ConditionVisablity");

		this.conditionVisablityMendixObject = conditionVisablityMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ConditionVisablity.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnairev2.proxies.ConditionVisablity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnairev2.proxies.ConditionVisablity.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnairev2.proxies.ConditionVisablity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new questionnairev2.proxies.ConditionVisablity(context, mendixObject);
	}

	public static questionnairev2.proxies.ConditionVisablity load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnairev2.proxies.ConditionVisablity.initialize(context, mendixObject);
	}

	public static java.util.List<questionnairev2.proxies.ConditionVisablity> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnairev2.proxies.ConditionVisablity> result = new java.util.ArrayList<questionnairev2.proxies.ConditionVisablity>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//QuestionnaireV2.ConditionVisablity" + xpathConstraint))
			result.add(questionnairev2.proxies.ConditionVisablity.initialize(context, obj));
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
	 * Set value of Condition
	 * @param condition
	 */
	public final questionnairev2.proxies.VisibleCondition getCondition()
	{
		return getCondition(getContext());
	}

	/**
	 * @param context
	 * @return value of Condition
	 */
	public final questionnairev2.proxies.VisibleCondition getCondition(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Condition.toString());
		if (obj == null)
			return null;

		return questionnairev2.proxies.VisibleCondition.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Condition
	 * @param condition
	 */
	public final void setCondition(questionnairev2.proxies.VisibleCondition condition)
	{
		setCondition(getContext(), condition);
	}

	/**
	 * Set value of Condition
	 * @param context
	 * @param condition
	 */
	public final void setCondition(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.VisibleCondition condition)
	{
		if (condition != null)
			getMendixObject().setValue(context, MemberNames.Condition.toString(), condition.toString());
		else
			getMendixObject().setValue(context, MemberNames.Condition.toString(), null);
	}

	/**
	 * @return value of ConditionVisablity_QuestionTemplate_has
	 */
	public final questionnairev2.proxies.QuestionTemplate getConditionVisablity_QuestionTemplate_has() throws com.mendix.core.CoreException
	{
		return getConditionVisablity_QuestionTemplate_has(getContext());
	}

	/**
	 * @param context
	 * @return value of ConditionVisablity_QuestionTemplate_has
	 */
	public final questionnairev2.proxies.QuestionTemplate getConditionVisablity_QuestionTemplate_has(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.QuestionTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ConditionVisablity_QuestionTemplate_has.toString());
		if (identifier != null)
			result = questionnairev2.proxies.QuestionTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ConditionVisablity_QuestionTemplate_has
	 * @param conditionvisablity_questiontemplate_has
	 */
	public final void setConditionVisablity_QuestionTemplate_has(questionnairev2.proxies.QuestionTemplate conditionvisablity_questiontemplate_has)
	{
		setConditionVisablity_QuestionTemplate_has(getContext(), conditionvisablity_questiontemplate_has);
	}

	/**
	 * Set value of ConditionVisablity_QuestionTemplate_has
	 * @param context
	 * @param conditionvisablity_questiontemplate_has
	 */
	public final void setConditionVisablity_QuestionTemplate_has(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.QuestionTemplate conditionvisablity_questiontemplate_has)
	{
		if (conditionvisablity_questiontemplate_has == null)
			getMendixObject().setValue(context, MemberNames.ConditionVisablity_QuestionTemplate_has.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ConditionVisablity_QuestionTemplate_has.toString(), conditionvisablity_questiontemplate_has.getMendixObject().getId());
	}

	/**
	 * @return value of ConditionVisablity_QuestionTemplate_Related
	 */
	public final questionnairev2.proxies.QuestionTemplate getConditionVisablity_QuestionTemplate_Related() throws com.mendix.core.CoreException
	{
		return getConditionVisablity_QuestionTemplate_Related(getContext());
	}

	/**
	 * @param context
	 * @return value of ConditionVisablity_QuestionTemplate_Related
	 */
	public final questionnairev2.proxies.QuestionTemplate getConditionVisablity_QuestionTemplate_Related(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.QuestionTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ConditionVisablity_QuestionTemplate_Related.toString());
		if (identifier != null)
			result = questionnairev2.proxies.QuestionTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ConditionVisablity_QuestionTemplate_Related
	 * @param conditionvisablity_questiontemplate_related
	 */
	public final void setConditionVisablity_QuestionTemplate_Related(questionnairev2.proxies.QuestionTemplate conditionvisablity_questiontemplate_related)
	{
		setConditionVisablity_QuestionTemplate_Related(getContext(), conditionvisablity_questiontemplate_related);
	}

	/**
	 * Set value of ConditionVisablity_QuestionTemplate_Related
	 * @param context
	 * @param conditionvisablity_questiontemplate_related
	 */
	public final void setConditionVisablity_QuestionTemplate_Related(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.QuestionTemplate conditionvisablity_questiontemplate_related)
	{
		if (conditionvisablity_questiontemplate_related == null)
			getMendixObject().setValue(context, MemberNames.ConditionVisablity_QuestionTemplate_Related.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ConditionVisablity_QuestionTemplate_Related.toString(), conditionvisablity_questiontemplate_related.getMendixObject().getId());
	}

	/**
	 * @return value of ConditionVisablity_OptionSetup_Value
	 */
	public final java.util.List<questionnairev2.proxies.OptionSetup> getConditionVisablity_OptionSetup_Value() throws com.mendix.core.CoreException
	{
		return getConditionVisablity_OptionSetup_Value(getContext());
	}

	/**
	 * @param context
	 * @return value of ConditionVisablity_OptionSetup_Value
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<questionnairev2.proxies.OptionSetup> getConditionVisablity_OptionSetup_Value(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<questionnairev2.proxies.OptionSetup> result = new java.util.ArrayList<questionnairev2.proxies.OptionSetup>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ConditionVisablity_OptionSetup_Value.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(questionnairev2.proxies.OptionSetup.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ConditionVisablity_OptionSetup_Value
	 * @param conditionvisablity_optionsetup_value
	 */
	public final void setConditionVisablity_OptionSetup_Value(java.util.List<questionnairev2.proxies.OptionSetup> conditionvisablity_optionsetup_value)
	{
		setConditionVisablity_OptionSetup_Value(getContext(), conditionvisablity_optionsetup_value);
	}

	/**
	 * Set value of ConditionVisablity_OptionSetup_Value
	 * @param context
	 * @param conditionvisablity_optionsetup_value
	 */
	public final void setConditionVisablity_OptionSetup_Value(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<questionnairev2.proxies.OptionSetup> conditionvisablity_optionsetup_value)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (questionnairev2.proxies.OptionSetup proxyObject : conditionvisablity_optionsetup_value)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ConditionVisablity_OptionSetup_Value.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return conditionVisablityMendixObject;
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
			final questionnairev2.proxies.ConditionVisablity that = (questionnairev2.proxies.ConditionVisablity) obj;
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
		return "QuestionnaireV2.ConditionVisablity";
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