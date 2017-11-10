// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnairev2.proxies;

public class Question
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject questionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QuestionnaireV2.Question";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Order("Order"),
		Question("Question"),
		Answer("Answer"),
		HelpText("HelpText"),
		ShowHelpText("ShowHelpText"),
		QuestionType("QuestionType"),
		IsVisible("IsVisible"),
		IsRequired("IsRequired"),
		IsAswered("IsAswered"),
		IsCustomized("IsCustomized"),
		ShowQuestion("ShowQuestion"),
		IsCoordinatorOnly("IsCoordinatorOnly"),
		Question_Questionnaire_Active("QuestionnaireV2.Question_Questionnaire_Active"),
		Option_Question_MutiSelect("QuestionnaireV2.Option_Question_MutiSelect"),
		Option_Question_SingleSelect("QuestionnaireV2.Option_Question_SingleSelect"),
		Question_Questionnaire("QuestionnaireV2.Question_Questionnaire"),
		Question_QuestionSetup("QuestionnaireV2.Question_QuestionSetup");

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

	public Question(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "QuestionnaireV2.Question"));
	}

	protected Question(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject questionMendixObject)
	{
		if (questionMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("QuestionnaireV2.Question", questionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a QuestionnaireV2.Question");

		this.questionMendixObject = questionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Question.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnairev2.proxies.Question initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnairev2.proxies.Question.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnairev2.proxies.Question initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new questionnairev2.proxies.Question(context, mendixObject);
	}

	public static questionnairev2.proxies.Question load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnairev2.proxies.Question.initialize(context, mendixObject);
	}

	public static java.util.List<questionnairev2.proxies.Question> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnairev2.proxies.Question> result = new java.util.ArrayList<questionnairev2.proxies.Question>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//QuestionnaireV2.Question" + xpathConstraint))
			result.add(questionnairev2.proxies.Question.initialize(context, obj));
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
	 * @return value of Answer
	 */
	public final java.lang.String getAnswer()
	{
		return getAnswer(getContext());
	}

	/**
	 * @param context
	 * @return value of Answer
	 */
	public final java.lang.String getAnswer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Answer.toString());
	}

	/**
	 * Set value of Answer
	 * @param answer
	 */
	public final void setAnswer(java.lang.String answer)
	{
		setAnswer(getContext(), answer);
	}

	/**
	 * Set value of Answer
	 * @param context
	 * @param answer
	 */
	public final void setAnswer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String answer)
	{
		getMendixObject().setValue(context, MemberNames.Answer.toString(), answer);
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
	 * @return value of ShowHelpText
	 */
	public final java.lang.Boolean getShowHelpText()
	{
		return getShowHelpText(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowHelpText
	 */
	public final java.lang.Boolean getShowHelpText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowHelpText.toString());
	}

	/**
	 * Set value of ShowHelpText
	 * @param showhelptext
	 */
	public final void setShowHelpText(java.lang.Boolean showhelptext)
	{
		setShowHelpText(getContext(), showhelptext);
	}

	/**
	 * Set value of ShowHelpText
	 * @param context
	 * @param showhelptext
	 */
	public final void setShowHelpText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showhelptext)
	{
		getMendixObject().setValue(context, MemberNames.ShowHelpText.toString(), showhelptext);
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
	 * @return value of IsVisible
	 */
	public final java.lang.Boolean getIsVisible()
	{
		return getIsVisible(getContext());
	}

	/**
	 * @param context
	 * @return value of IsVisible
	 */
	public final java.lang.Boolean getIsVisible(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsVisible.toString());
	}

	/**
	 * Set value of IsVisible
	 * @param isvisible
	 */
	public final void setIsVisible(java.lang.Boolean isvisible)
	{
		setIsVisible(getContext(), isvisible);
	}

	/**
	 * Set value of IsVisible
	 * @param context
	 * @param isvisible
	 */
	public final void setIsVisible(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isvisible)
	{
		getMendixObject().setValue(context, MemberNames.IsVisible.toString(), isvisible);
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
	 * @return value of IsAswered
	 */
	public final java.lang.Boolean getIsAswered()
	{
		return getIsAswered(getContext());
	}

	/**
	 * @param context
	 * @return value of IsAswered
	 */
	public final java.lang.Boolean getIsAswered(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsAswered.toString());
	}

	/**
	 * Set value of IsAswered
	 * @param isaswered
	 */
	public final void setIsAswered(java.lang.Boolean isaswered)
	{
		setIsAswered(getContext(), isaswered);
	}

	/**
	 * Set value of IsAswered
	 * @param context
	 * @param isaswered
	 */
	public final void setIsAswered(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isaswered)
	{
		getMendixObject().setValue(context, MemberNames.IsAswered.toString(), isaswered);
	}

	/**
	 * @return value of IsCustomized
	 */
	public final java.lang.Boolean getIsCustomized()
	{
		return getIsCustomized(getContext());
	}

	/**
	 * @param context
	 * @return value of IsCustomized
	 */
	public final java.lang.Boolean getIsCustomized(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsCustomized.toString());
	}

	/**
	 * Set value of IsCustomized
	 * @param iscustomized
	 */
	public final void setIsCustomized(java.lang.Boolean iscustomized)
	{
		setIsCustomized(getContext(), iscustomized);
	}

	/**
	 * Set value of IsCustomized
	 * @param context
	 * @param iscustomized
	 */
	public final void setIsCustomized(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean iscustomized)
	{
		getMendixObject().setValue(context, MemberNames.IsCustomized.toString(), iscustomized);
	}

	/**
	 * @return value of ShowQuestion
	 */
	public final java.lang.Boolean getShowQuestion()
	{
		return getShowQuestion(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowQuestion
	 */
	public final java.lang.Boolean getShowQuestion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowQuestion.toString());
	}

	/**
	 * Set value of ShowQuestion
	 * @param showquestion
	 */
	public final void setShowQuestion(java.lang.Boolean showquestion)
	{
		setShowQuestion(getContext(), showquestion);
	}

	/**
	 * Set value of ShowQuestion
	 * @param context
	 * @param showquestion
	 */
	public final void setShowQuestion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showquestion)
	{
		getMendixObject().setValue(context, MemberNames.ShowQuestion.toString(), showquestion);
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
	 * @return value of Question_Questionnaire_Active
	 */
	public final questionnairev2.proxies.Questionnaire getQuestion_Questionnaire_Active() throws com.mendix.core.CoreException
	{
		return getQuestion_Questionnaire_Active(getContext());
	}

	/**
	 * @param context
	 * @return value of Question_Questionnaire_Active
	 */
	public final questionnairev2.proxies.Questionnaire getQuestion_Questionnaire_Active(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.Questionnaire result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Question_Questionnaire_Active.toString());
		if (identifier != null)
			result = questionnairev2.proxies.Questionnaire.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Question_Questionnaire_Active
	 * @param question_questionnaire_active
	 */
	public final void setQuestion_Questionnaire_Active(questionnairev2.proxies.Questionnaire question_questionnaire_active)
	{
		setQuestion_Questionnaire_Active(getContext(), question_questionnaire_active);
	}

	/**
	 * Set value of Question_Questionnaire_Active
	 * @param context
	 * @param question_questionnaire_active
	 */
	public final void setQuestion_Questionnaire_Active(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.Questionnaire question_questionnaire_active)
	{
		if (question_questionnaire_active == null)
			getMendixObject().setValue(context, MemberNames.Question_Questionnaire_Active.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Question_Questionnaire_Active.toString(), question_questionnaire_active.getMendixObject().getId());
	}

	/**
	 * @return value of Option_Question_MutiSelect
	 */
	public final java.util.List<questionnairev2.proxies.Option> getOption_Question_MutiSelect() throws com.mendix.core.CoreException
	{
		return getOption_Question_MutiSelect(getContext());
	}

	/**
	 * @param context
	 * @return value of Option_Question_MutiSelect
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<questionnairev2.proxies.Option> getOption_Question_MutiSelect(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<questionnairev2.proxies.Option> result = new java.util.ArrayList<questionnairev2.proxies.Option>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Option_Question_MutiSelect.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(questionnairev2.proxies.Option.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Option_Question_MutiSelect
	 * @param option_question_mutiselect
	 */
	public final void setOption_Question_MutiSelect(java.util.List<questionnairev2.proxies.Option> option_question_mutiselect)
	{
		setOption_Question_MutiSelect(getContext(), option_question_mutiselect);
	}

	/**
	 * Set value of Option_Question_MutiSelect
	 * @param context
	 * @param option_question_mutiselect
	 */
	public final void setOption_Question_MutiSelect(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<questionnairev2.proxies.Option> option_question_mutiselect)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (questionnairev2.proxies.Option proxyObject : option_question_mutiselect)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Option_Question_MutiSelect.toString(), identifiers);
	}

	/**
	 * @return value of Option_Question_SingleSelect
	 */
	public final questionnairev2.proxies.Option getOption_Question_SingleSelect() throws com.mendix.core.CoreException
	{
		return getOption_Question_SingleSelect(getContext());
	}

	/**
	 * @param context
	 * @return value of Option_Question_SingleSelect
	 */
	public final questionnairev2.proxies.Option getOption_Question_SingleSelect(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.Option result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Option_Question_SingleSelect.toString());
		if (identifier != null)
			result = questionnairev2.proxies.Option.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Option_Question_SingleSelect
	 * @param option_question_singleselect
	 */
	public final void setOption_Question_SingleSelect(questionnairev2.proxies.Option option_question_singleselect)
	{
		setOption_Question_SingleSelect(getContext(), option_question_singleselect);
	}

	/**
	 * Set value of Option_Question_SingleSelect
	 * @param context
	 * @param option_question_singleselect
	 */
	public final void setOption_Question_SingleSelect(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.Option option_question_singleselect)
	{
		if (option_question_singleselect == null)
			getMendixObject().setValue(context, MemberNames.Option_Question_SingleSelect.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Option_Question_SingleSelect.toString(), option_question_singleselect.getMendixObject().getId());
	}

	/**
	 * @return value of Question_Questionnaire
	 */
	public final questionnairev2.proxies.Questionnaire getQuestion_Questionnaire() throws com.mendix.core.CoreException
	{
		return getQuestion_Questionnaire(getContext());
	}

	/**
	 * @param context
	 * @return value of Question_Questionnaire
	 */
	public final questionnairev2.proxies.Questionnaire getQuestion_Questionnaire(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.Questionnaire result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Question_Questionnaire.toString());
		if (identifier != null)
			result = questionnairev2.proxies.Questionnaire.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Question_Questionnaire
	 * @param question_questionnaire
	 */
	public final void setQuestion_Questionnaire(questionnairev2.proxies.Questionnaire question_questionnaire)
	{
		setQuestion_Questionnaire(getContext(), question_questionnaire);
	}

	/**
	 * Set value of Question_Questionnaire
	 * @param context
	 * @param question_questionnaire
	 */
	public final void setQuestion_Questionnaire(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.Questionnaire question_questionnaire)
	{
		if (question_questionnaire == null)
			getMendixObject().setValue(context, MemberNames.Question_Questionnaire.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Question_Questionnaire.toString(), question_questionnaire.getMendixObject().getId());
	}

	/**
	 * @return value of Question_QuestionSetup
	 */
	public final questionnairev2.proxies.QuestionTemplate getQuestion_QuestionSetup() throws com.mendix.core.CoreException
	{
		return getQuestion_QuestionSetup(getContext());
	}

	/**
	 * @param context
	 * @return value of Question_QuestionSetup
	 */
	public final questionnairev2.proxies.QuestionTemplate getQuestion_QuestionSetup(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.QuestionTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Question_QuestionSetup.toString());
		if (identifier != null)
			result = questionnairev2.proxies.QuestionTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Question_QuestionSetup
	 * @param question_questionsetup
	 */
	public final void setQuestion_QuestionSetup(questionnairev2.proxies.QuestionTemplate question_questionsetup)
	{
		setQuestion_QuestionSetup(getContext(), question_questionsetup);
	}

	/**
	 * Set value of Question_QuestionSetup
	 * @param context
	 * @param question_questionsetup
	 */
	public final void setQuestion_QuestionSetup(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.QuestionTemplate question_questionsetup)
	{
		if (question_questionsetup == null)
			getMendixObject().setValue(context, MemberNames.Question_QuestionSetup.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Question_QuestionSetup.toString(), question_questionsetup.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return questionMendixObject;
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
			final questionnairev2.proxies.Question that = (questionnairev2.proxies.Question) obj;
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
		return "QuestionnaireV2.Question";
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
