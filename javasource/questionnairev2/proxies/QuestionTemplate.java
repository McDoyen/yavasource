// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnairev2.proxies;

public class QuestionTemplate
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject questionTemplateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QuestionnaireV2.QuestionTemplate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Order("Order"),
		Question("Question"),
		HelpText("HelpText"),
		QuestionType("QuestionType"),
		IsRequired("IsRequired"),
		RequiredMsg("RequiredMsg"),
		InEditMode("InEditMode"),
		HasOther("HasOther"),
		DummyOption("DummyOption"),
		HasHelpText("HasHelpText"),
		HasCondition("HasCondition"),
		TemplateText("TemplateText"),
		InResult("InResult"),
		TemplateDefaultAnswer("TemplateDefaultAnswer"),
		IsCoordinatorOnly("IsCoordinatorOnly"),
		QuestionTemplate_QuestionnaireTemplate("QuestionnaireV2.QuestionTemplate_QuestionnaireTemplate"),
		ConditionVisablity_QuestionTemplate_Related("QuestionnaireV2.ConditionVisablity_QuestionTemplate_Related");

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

	public QuestionTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "QuestionnaireV2.QuestionTemplate"));
	}

	protected QuestionTemplate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject questionTemplateMendixObject)
	{
		if (questionTemplateMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("QuestionnaireV2.QuestionTemplate", questionTemplateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a QuestionnaireV2.QuestionTemplate");

		this.questionTemplateMendixObject = questionTemplateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'QuestionTemplate.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnairev2.proxies.QuestionTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnairev2.proxies.QuestionTemplate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnairev2.proxies.QuestionTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new questionnairev2.proxies.QuestionTemplate(context, mendixObject);
	}

	public static questionnairev2.proxies.QuestionTemplate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnairev2.proxies.QuestionTemplate.initialize(context, mendixObject);
	}

	public static java.util.List<questionnairev2.proxies.QuestionTemplate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnairev2.proxies.QuestionTemplate> result = new java.util.ArrayList<questionnairev2.proxies.QuestionTemplate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//QuestionnaireV2.QuestionTemplate" + xpathConstraint))
			result.add(questionnairev2.proxies.QuestionTemplate.initialize(context, obj));
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
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder()
	{
		return getOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Order.toString());
	}

	/**
	 * Set value of Order
	 * @param order
	 */
	public final void setOrder(java.lang.Integer order)
	{
		setOrder(getContext(), order);
	}

	/**
	 * Set value of Order
	 * @param context
	 * @param order
	 */
	public final void setOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer order)
	{
		getMendixObject().setValue(context, MemberNames.Order.toString(), order);
	}

	/**
	 * @return value of Question
	 */
	public final java.lang.String getQuestion()
	{
		return getQuestion(getContext());
	}

	/**
	 * @param context
	 * @return value of Question
	 */
	public final java.lang.String getQuestion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Question.toString());
	}

	/**
	 * Set value of Question
	 * @param question
	 */
	public final void setQuestion(java.lang.String question)
	{
		setQuestion(getContext(), question);
	}

	/**
	 * Set value of Question
	 * @param context
	 * @param question
	 */
	public final void setQuestion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String question)
	{
		getMendixObject().setValue(context, MemberNames.Question.toString(), question);
	}

	/**
	 * @return value of HelpText
	 */
	public final java.lang.String getHelpText()
	{
		return getHelpText(getContext());
	}

	/**
	 * @param context
	 * @return value of HelpText
	 */
	public final java.lang.String getHelpText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HelpText.toString());
	}

	/**
	 * Set value of HelpText
	 * @param helptext
	 */
	public final void setHelpText(java.lang.String helptext)
	{
		setHelpText(getContext(), helptext);
	}

	/**
	 * Set value of HelpText
	 * @param context
	 * @param helptext
	 */
	public final void setHelpText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String helptext)
	{
		getMendixObject().setValue(context, MemberNames.HelpText.toString(), helptext);
	}

	/**
	 * Set value of QuestionType
	 * @param questiontype
	 */
	public final questionnairev2.proxies.QuestionType getQuestionType()
	{
		return getQuestionType(getContext());
	}

	/**
	 * @param context
	 * @return value of QuestionType
	 */
	public final questionnairev2.proxies.QuestionType getQuestionType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.QuestionType.toString());
		if (obj == null)
			return null;

		return questionnairev2.proxies.QuestionType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of QuestionType
	 * @param questiontype
	 */
	public final void setQuestionType(questionnairev2.proxies.QuestionType questiontype)
	{
		setQuestionType(getContext(), questiontype);
	}

	/**
	 * Set value of QuestionType
	 * @param context
	 * @param questiontype
	 */
	public final void setQuestionType(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.QuestionType questiontype)
	{
		if (questiontype != null)
			getMendixObject().setValue(context, MemberNames.QuestionType.toString(), questiontype.toString());
		else
			getMendixObject().setValue(context, MemberNames.QuestionType.toString(), null);
	}

	/**
	 * @return value of IsRequired
	 */
	public final java.lang.Boolean getIsRequired()
	{
		return getIsRequired(getContext());
	}

	/**
	 * @param context
	 * @return value of IsRequired
	 */
	public final java.lang.Boolean getIsRequired(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsRequired.toString());
	}

	/**
	 * Set value of IsRequired
	 * @param isrequired
	 */
	public final void setIsRequired(java.lang.Boolean isrequired)
	{
		setIsRequired(getContext(), isrequired);
	}

	/**
	 * Set value of IsRequired
	 * @param context
	 * @param isrequired
	 */
	public final void setIsRequired(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isrequired)
	{
		getMendixObject().setValue(context, MemberNames.IsRequired.toString(), isrequired);
	}

	/**
	 * @return value of RequiredMsg
	 */
	public final java.lang.String getRequiredMsg()
	{
		return getRequiredMsg(getContext());
	}

	/**
	 * @param context
	 * @return value of RequiredMsg
	 */
	public final java.lang.String getRequiredMsg(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RequiredMsg.toString());
	}

	/**
	 * Set value of RequiredMsg
	 * @param requiredmsg
	 */
	public final void setRequiredMsg(java.lang.String requiredmsg)
	{
		setRequiredMsg(getContext(), requiredmsg);
	}

	/**
	 * Set value of RequiredMsg
	 * @param context
	 * @param requiredmsg
	 */
	public final void setRequiredMsg(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String requiredmsg)
	{
		getMendixObject().setValue(context, MemberNames.RequiredMsg.toString(), requiredmsg);
	}

	/**
	 * @return value of InEditMode
	 */
	public final java.lang.Boolean getInEditMode()
	{
		return getInEditMode(getContext());
	}

	/**
	 * @param context
	 * @return value of InEditMode
	 */
	public final java.lang.Boolean getInEditMode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.InEditMode.toString());
	}

	/**
	 * Set value of InEditMode
	 * @param ineditmode
	 */
	public final void setInEditMode(java.lang.Boolean ineditmode)
	{
		setInEditMode(getContext(), ineditmode);
	}

	/**
	 * Set value of InEditMode
	 * @param context
	 * @param ineditmode
	 */
	public final void setInEditMode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ineditmode)
	{
		getMendixObject().setValue(context, MemberNames.InEditMode.toString(), ineditmode);
	}

	/**
	 * @return value of HasOther
	 */
	public final java.lang.Boolean getHasOther()
	{
		return getHasOther(getContext());
	}

	/**
	 * @param context
	 * @return value of HasOther
	 */
	public final java.lang.Boolean getHasOther(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasOther.toString());
	}

	/**
	 * Set value of HasOther
	 * @param hasother
	 */
	public final void setHasOther(java.lang.Boolean hasother)
	{
		setHasOther(getContext(), hasother);
	}

	/**
	 * Set value of HasOther
	 * @param context
	 * @param hasother
	 */
	public final void setHasOther(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hasother)
	{
		getMendixObject().setValue(context, MemberNames.HasOther.toString(), hasother);
	}

	/**
	 * @return value of DummyOption
	 */
	public final java.lang.String getDummyOption()
	{
		return getDummyOption(getContext());
	}

	/**
	 * @param context
	 * @return value of DummyOption
	 */
	public final java.lang.String getDummyOption(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DummyOption.toString());
	}

	/**
	 * Set value of DummyOption
	 * @param dummyoption
	 */
	public final void setDummyOption(java.lang.String dummyoption)
	{
		setDummyOption(getContext(), dummyoption);
	}

	/**
	 * Set value of DummyOption
	 * @param context
	 * @param dummyoption
	 */
	public final void setDummyOption(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dummyoption)
	{
		getMendixObject().setValue(context, MemberNames.DummyOption.toString(), dummyoption);
	}

	/**
	 * @return value of HasHelpText
	 */
	public final java.lang.Boolean getHasHelpText()
	{
		return getHasHelpText(getContext());
	}

	/**
	 * @param context
	 * @return value of HasHelpText
	 */
	public final java.lang.Boolean getHasHelpText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasHelpText.toString());
	}

	/**
	 * Set value of HasHelpText
	 * @param hashelptext
	 */
	public final void setHasHelpText(java.lang.Boolean hashelptext)
	{
		setHasHelpText(getContext(), hashelptext);
	}

	/**
	 * Set value of HasHelpText
	 * @param context
	 * @param hashelptext
	 */
	public final void setHasHelpText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hashelptext)
	{
		getMendixObject().setValue(context, MemberNames.HasHelpText.toString(), hashelptext);
	}

	/**
	 * @return value of HasCondition
	 */
	public final java.lang.Boolean getHasCondition()
	{
		return getHasCondition(getContext());
	}

	/**
	 * @param context
	 * @return value of HasCondition
	 */
	public final java.lang.Boolean getHasCondition(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasCondition.toString());
	}

	/**
	 * Set value of HasCondition
	 * @param hascondition
	 */
	public final void setHasCondition(java.lang.Boolean hascondition)
	{
		setHasCondition(getContext(), hascondition);
	}

	/**
	 * Set value of HasCondition
	 * @param context
	 * @param hascondition
	 */
	public final void setHasCondition(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hascondition)
	{
		getMendixObject().setValue(context, MemberNames.HasCondition.toString(), hascondition);
	}

	/**
	 * @return value of TemplateText
	 */
	public final java.lang.String getTemplateText()
	{
		return getTemplateText(getContext());
	}

	/**
	 * @param context
	 * @return value of TemplateText
	 */
	public final java.lang.String getTemplateText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TemplateText.toString());
	}

	/**
	 * Set value of TemplateText
	 * @param templatetext
	 */
	public final void setTemplateText(java.lang.String templatetext)
	{
		setTemplateText(getContext(), templatetext);
	}

	/**
	 * Set value of TemplateText
	 * @param context
	 * @param templatetext
	 */
	public final void setTemplateText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String templatetext)
	{
		getMendixObject().setValue(context, MemberNames.TemplateText.toString(), templatetext);
	}

	/**
	 * @return value of InResult
	 */
	public final java.lang.Boolean getInResult()
	{
		return getInResult(getContext());
	}

	/**
	 * @param context
	 * @return value of InResult
	 */
	public final java.lang.Boolean getInResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.InResult.toString());
	}

	/**
	 * Set value of InResult
	 * @param inresult
	 */
	public final void setInResult(java.lang.Boolean inresult)
	{
		setInResult(getContext(), inresult);
	}

	/**
	 * Set value of InResult
	 * @param context
	 * @param inresult
	 */
	public final void setInResult(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean inresult)
	{
		getMendixObject().setValue(context, MemberNames.InResult.toString(), inresult);
	}

	/**
	 * @return value of TemplateDefaultAnswer
	 */
	public final java.lang.String getTemplateDefaultAnswer()
	{
		return getTemplateDefaultAnswer(getContext());
	}

	/**
	 * @param context
	 * @return value of TemplateDefaultAnswer
	 */
	public final java.lang.String getTemplateDefaultAnswer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TemplateDefaultAnswer.toString());
	}

	/**
	 * Set value of TemplateDefaultAnswer
	 * @param templatedefaultanswer
	 */
	public final void setTemplateDefaultAnswer(java.lang.String templatedefaultanswer)
	{
		setTemplateDefaultAnswer(getContext(), templatedefaultanswer);
	}

	/**
	 * Set value of TemplateDefaultAnswer
	 * @param context
	 * @param templatedefaultanswer
	 */
	public final void setTemplateDefaultAnswer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String templatedefaultanswer)
	{
		getMendixObject().setValue(context, MemberNames.TemplateDefaultAnswer.toString(), templatedefaultanswer);
	}

	/**
	 * @return value of IsCoordinatorOnly
	 */
	public final java.lang.Boolean getIsCoordinatorOnly()
	{
		return getIsCoordinatorOnly(getContext());
	}

	/**
	 * @param context
	 * @return value of IsCoordinatorOnly
	 */
	public final java.lang.Boolean getIsCoordinatorOnly(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsCoordinatorOnly.toString());
	}

	/**
	 * Set value of IsCoordinatorOnly
	 * @param iscoordinatoronly
	 */
	public final void setIsCoordinatorOnly(java.lang.Boolean iscoordinatoronly)
	{
		setIsCoordinatorOnly(getContext(), iscoordinatoronly);
	}

	/**
	 * Set value of IsCoordinatorOnly
	 * @param context
	 * @param iscoordinatoronly
	 */
	public final void setIsCoordinatorOnly(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean iscoordinatoronly)
	{
		getMendixObject().setValue(context, MemberNames.IsCoordinatorOnly.toString(), iscoordinatoronly);
	}

	/**
	 * @return value of QuestionTemplate_QuestionnaireTemplate
	 */
	public final questionnairev2.proxies.QuestionnaireTemplate getQuestionTemplate_QuestionnaireTemplate() throws com.mendix.core.CoreException
	{
		return getQuestionTemplate_QuestionnaireTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of QuestionTemplate_QuestionnaireTemplate
	 */
	public final questionnairev2.proxies.QuestionnaireTemplate getQuestionTemplate_QuestionnaireTemplate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.QuestionnaireTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QuestionTemplate_QuestionnaireTemplate.toString());
		if (identifier != null)
			result = questionnairev2.proxies.QuestionnaireTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of QuestionTemplate_QuestionnaireTemplate
	 * @param questiontemplate_questionnairetemplate
	 */
	public final void setQuestionTemplate_QuestionnaireTemplate(questionnairev2.proxies.QuestionnaireTemplate questiontemplate_questionnairetemplate)
	{
		setQuestionTemplate_QuestionnaireTemplate(getContext(), questiontemplate_questionnairetemplate);
	}

	/**
	 * Set value of QuestionTemplate_QuestionnaireTemplate
	 * @param context
	 * @param questiontemplate_questionnairetemplate
	 */
	public final void setQuestionTemplate_QuestionnaireTemplate(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.QuestionnaireTemplate questiontemplate_questionnairetemplate)
	{
		if (questiontemplate_questionnairetemplate == null)
			getMendixObject().setValue(context, MemberNames.QuestionTemplate_QuestionnaireTemplate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.QuestionTemplate_QuestionnaireTemplate.toString(), questiontemplate_questionnairetemplate.getMendixObject().getId());
	}

	/**
	 * @return value of ConditionVisablity_QuestionTemplate_Related
	 */
	public final questionnairev2.proxies.ConditionVisablity getConditionVisablity_QuestionTemplate_Related() throws com.mendix.core.CoreException
	{
		return getConditionVisablity_QuestionTemplate_Related(getContext());
	}

	/**
	 * @param context
	 * @return value of ConditionVisablity_QuestionTemplate_Related
	 */
	public final questionnairev2.proxies.ConditionVisablity getConditionVisablity_QuestionTemplate_Related(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.ConditionVisablity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ConditionVisablity_QuestionTemplate_Related.toString());
		if (identifier != null)
			result = questionnairev2.proxies.ConditionVisablity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ConditionVisablity_QuestionTemplate_Related
	 * @param conditionvisablity_questiontemplate_related
	 */
	public final void setConditionVisablity_QuestionTemplate_Related(questionnairev2.proxies.ConditionVisablity conditionvisablity_questiontemplate_related)
	{
		setConditionVisablity_QuestionTemplate_Related(getContext(), conditionvisablity_questiontemplate_related);
	}

	/**
	 * Set value of ConditionVisablity_QuestionTemplate_Related
	 * @param context
	 * @param conditionvisablity_questiontemplate_related
	 */
	public final void setConditionVisablity_QuestionTemplate_Related(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.ConditionVisablity conditionvisablity_questiontemplate_related)
	{
		if (conditionvisablity_questiontemplate_related == null)
			getMendixObject().setValue(context, MemberNames.ConditionVisablity_QuestionTemplate_Related.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ConditionVisablity_QuestionTemplate_Related.toString(), conditionvisablity_questiontemplate_related.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return questionTemplateMendixObject;
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
			final questionnairev2.proxies.QuestionTemplate that = (questionnairev2.proxies.QuestionTemplate) obj;
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
		return "QuestionnaireV2.QuestionTemplate";
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
