// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnairev2.proxies;

public class Questionnaire
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject questionnaireMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QuestionnaireV2.Questionnaire";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IsCompleted("IsCompleted"),
		IsCustomized("IsCustomized"),
		Summary("Summary"),
		TotalScore("TotalScore"),
		ShowScoring("ShowScoring"),
		Risk("Risk"),
		Preparation("Preparation"),
		ScoreText("ScoreText"),
		LastModifiedBy("LastModifiedBy"),
		Question_Questionnaire_Active("QuestionnaireV2.Question_Questionnaire_Active"),
		Questionnaire_QuestionnaireTemplate("QuestionnaireV2.Questionnaire_QuestionnaireTemplate"),
		Questionnaire_BasedOnDefaultAnswerSet("QuestionnaireV2.Questionnaire_BasedOnDefaultAnswerSet"),
		QuestionnaireList_Request("QuestionnaireV2.QuestionnaireList_Request"),
		QuestionnaireActive_Request("QuestionnaireV2.QuestionnaireActive_Request"),
		Questionnaire_MitigationPlan("QuestionnaireV2.Questionnaire_MitigationPlan");

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

	public Questionnaire(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "QuestionnaireV2.Questionnaire"));
	}

	protected Questionnaire(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject questionnaireMendixObject)
	{
		if (questionnaireMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("QuestionnaireV2.Questionnaire", questionnaireMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a QuestionnaireV2.Questionnaire");

		this.questionnaireMendixObject = questionnaireMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Questionnaire.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static questionnairev2.proxies.Questionnaire initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return questionnairev2.proxies.Questionnaire.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static questionnairev2.proxies.Questionnaire initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new questionnairev2.proxies.Questionnaire(context, mendixObject);
	}

	public static questionnairev2.proxies.Questionnaire load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return questionnairev2.proxies.Questionnaire.initialize(context, mendixObject);
	}

	public static java.util.List<questionnairev2.proxies.Questionnaire> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<questionnairev2.proxies.Questionnaire> result = new java.util.ArrayList<questionnairev2.proxies.Questionnaire>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//QuestionnaireV2.Questionnaire" + xpathConstraint))
			result.add(questionnairev2.proxies.Questionnaire.initialize(context, obj));
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
	 * @return value of IsCompleted
	 */
	public final java.lang.Boolean getIsCompleted()
	{
		return getIsCompleted(getContext());
	}

	/**
	 * @param context
	 * @return value of IsCompleted
	 */
	public final java.lang.Boolean getIsCompleted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsCompleted.toString());
	}

	/**
	 * Set value of IsCompleted
	 * @param iscompleted
	 */
	public final void setIsCompleted(java.lang.Boolean iscompleted)
	{
		setIsCompleted(getContext(), iscompleted);
	}

	/**
	 * Set value of IsCompleted
	 * @param context
	 * @param iscompleted
	 */
	public final void setIsCompleted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean iscompleted)
	{
		getMendixObject().setValue(context, MemberNames.IsCompleted.toString(), iscompleted);
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
	 * @return value of Summary
	 */
	public final java.lang.String getSummary()
	{
		return getSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of Summary
	 */
	public final java.lang.String getSummary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Summary.toString());
	}

	/**
	 * Set value of Summary
	 * @param summary
	 */
	public final void setSummary(java.lang.String summary)
	{
		setSummary(getContext(), summary);
	}

	/**
	 * Set value of Summary
	 * @param context
	 * @param summary
	 */
	public final void setSummary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String summary)
	{
		getMendixObject().setValue(context, MemberNames.Summary.toString(), summary);
	}

	/**
	 * @return value of TotalScore
	 */
	public final java.lang.Double getTotalScore()
	{
		return getTotalScore(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalScore
	 */
	public final java.lang.Double getTotalScore(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.TotalScore.toString());
	}

	/**
	 * Set value of TotalScore
	 * @param totalscore
	 */
	public final void setTotalScore(java.lang.Double totalscore)
	{
		setTotalScore(getContext(), totalscore);
	}

	/**
	 * Set value of TotalScore
	 * @param context
	 * @param totalscore
	 */
	public final void setTotalScore(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double totalscore)
	{
		getMendixObject().setValue(context, MemberNames.TotalScore.toString(), totalscore);
	}

	/**
	 * @return value of ShowScoring
	 */
	public final java.lang.Boolean getShowScoring()
	{
		return getShowScoring(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowScoring
	 */
	public final java.lang.Boolean getShowScoring(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowScoring.toString());
	}

	/**
	 * Set value of ShowScoring
	 * @param showscoring
	 */
	public final void setShowScoring(java.lang.Boolean showscoring)
	{
		setShowScoring(getContext(), showscoring);
	}

	/**
	 * Set value of ShowScoring
	 * @param context
	 * @param showscoring
	 */
	public final void setShowScoring(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showscoring)
	{
		getMendixObject().setValue(context, MemberNames.ShowScoring.toString(), showscoring);
	}

	/**
	 * @return value of Risk
	 */
	public final java.lang.String getRisk()
	{
		return getRisk(getContext());
	}

	/**
	 * @param context
	 * @return value of Risk
	 */
	public final java.lang.String getRisk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Risk.toString());
	}

	/**
	 * Set value of Risk
	 * @param risk
	 */
	public final void setRisk(java.lang.String risk)
	{
		setRisk(getContext(), risk);
	}

	/**
	 * Set value of Risk
	 * @param context
	 * @param risk
	 */
	public final void setRisk(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String risk)
	{
		getMendixObject().setValue(context, MemberNames.Risk.toString(), risk);
	}

	/**
	 * @return value of Preparation
	 */
	public final java.lang.String getPreparation()
	{
		return getPreparation(getContext());
	}

	/**
	 * @param context
	 * @return value of Preparation
	 */
	public final java.lang.String getPreparation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Preparation.toString());
	}

	/**
	 * Set value of Preparation
	 * @param preparation
	 */
	public final void setPreparation(java.lang.String preparation)
	{
		setPreparation(getContext(), preparation);
	}

	/**
	 * Set value of Preparation
	 * @param context
	 * @param preparation
	 */
	public final void setPreparation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String preparation)
	{
		getMendixObject().setValue(context, MemberNames.Preparation.toString(), preparation);
	}

	/**
	 * @return value of ScoreText
	 */
	public final java.lang.String getScoreText()
	{
		return getScoreText(getContext());
	}

	/**
	 * @param context
	 * @return value of ScoreText
	 */
	public final java.lang.String getScoreText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ScoreText.toString());
	}

	/**
	 * Set value of ScoreText
	 * @param scoretext
	 */
	public final void setScoreText(java.lang.String scoretext)
	{
		setScoreText(getContext(), scoretext);
	}

	/**
	 * Set value of ScoreText
	 * @param context
	 * @param scoretext
	 */
	public final void setScoreText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String scoretext)
	{
		getMendixObject().setValue(context, MemberNames.ScoreText.toString(), scoretext);
	}

	/**
	 * @return value of LastModifiedBy
	 */
	public final java.lang.String getLastModifiedBy()
	{
		return getLastModifiedBy(getContext());
	}

	/**
	 * @param context
	 * @return value of LastModifiedBy
	 */
	public final java.lang.String getLastModifiedBy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastModifiedBy.toString());
	}

	/**
	 * Set value of LastModifiedBy
	 * @param lastmodifiedby
	 */
	public final void setLastModifiedBy(java.lang.String lastmodifiedby)
	{
		setLastModifiedBy(getContext(), lastmodifiedby);
	}

	/**
	 * Set value of LastModifiedBy
	 * @param context
	 * @param lastmodifiedby
	 */
	public final void setLastModifiedBy(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastmodifiedby)
	{
		getMendixObject().setValue(context, MemberNames.LastModifiedBy.toString(), lastmodifiedby);
	}

	/**
	 * @return value of Question_Questionnaire_Active
	 */
	public final questionnairev2.proxies.Question getQuestion_Questionnaire_Active() throws com.mendix.core.CoreException
	{
		return getQuestion_Questionnaire_Active(getContext());
	}

	/**
	 * @param context
	 * @return value of Question_Questionnaire_Active
	 */
	public final questionnairev2.proxies.Question getQuestion_Questionnaire_Active(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.Question result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Question_Questionnaire_Active.toString());
		if (identifier != null)
			result = questionnairev2.proxies.Question.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Question_Questionnaire_Active
	 * @param question_questionnaire_active
	 */
	public final void setQuestion_Questionnaire_Active(questionnairev2.proxies.Question question_questionnaire_active)
	{
		setQuestion_Questionnaire_Active(getContext(), question_questionnaire_active);
	}

	/**
	 * Set value of Question_Questionnaire_Active
	 * @param context
	 * @param question_questionnaire_active
	 */
	public final void setQuestion_Questionnaire_Active(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.Question question_questionnaire_active)
	{
		if (question_questionnaire_active == null)
			getMendixObject().setValue(context, MemberNames.Question_Questionnaire_Active.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Question_Questionnaire_Active.toString(), question_questionnaire_active.getMendixObject().getId());
	}

	/**
	 * @return value of Questionnaire_QuestionnaireTemplate
	 */
	public final questionnairev2.proxies.QuestionnaireTemplate getQuestionnaire_QuestionnaireTemplate() throws com.mendix.core.CoreException
	{
		return getQuestionnaire_QuestionnaireTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of Questionnaire_QuestionnaireTemplate
	 */
	public final questionnairev2.proxies.QuestionnaireTemplate getQuestionnaire_QuestionnaireTemplate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.QuestionnaireTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Questionnaire_QuestionnaireTemplate.toString());
		if (identifier != null)
			result = questionnairev2.proxies.QuestionnaireTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Questionnaire_QuestionnaireTemplate
	 * @param questionnaire_questionnairetemplate
	 */
	public final void setQuestionnaire_QuestionnaireTemplate(questionnairev2.proxies.QuestionnaireTemplate questionnaire_questionnairetemplate)
	{
		setQuestionnaire_QuestionnaireTemplate(getContext(), questionnaire_questionnairetemplate);
	}

	/**
	 * Set value of Questionnaire_QuestionnaireTemplate
	 * @param context
	 * @param questionnaire_questionnairetemplate
	 */
	public final void setQuestionnaire_QuestionnaireTemplate(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.QuestionnaireTemplate questionnaire_questionnairetemplate)
	{
		if (questionnaire_questionnairetemplate == null)
			getMendixObject().setValue(context, MemberNames.Questionnaire_QuestionnaireTemplate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Questionnaire_QuestionnaireTemplate.toString(), questionnaire_questionnairetemplate.getMendixObject().getId());
	}

	/**
	 * @return value of Questionnaire_BasedOnDefaultAnswerSet
	 */
	public final questionnairev2.proxies.DefaultAnswerSet getQuestionnaire_BasedOnDefaultAnswerSet() throws com.mendix.core.CoreException
	{
		return getQuestionnaire_BasedOnDefaultAnswerSet(getContext());
	}

	/**
	 * @param context
	 * @return value of Questionnaire_BasedOnDefaultAnswerSet
	 */
	public final questionnairev2.proxies.DefaultAnswerSet getQuestionnaire_BasedOnDefaultAnswerSet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		questionnairev2.proxies.DefaultAnswerSet result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Questionnaire_BasedOnDefaultAnswerSet.toString());
		if (identifier != null)
			result = questionnairev2.proxies.DefaultAnswerSet.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Questionnaire_BasedOnDefaultAnswerSet
	 * @param questionnaire_basedondefaultanswerset
	 */
	public final void setQuestionnaire_BasedOnDefaultAnswerSet(questionnairev2.proxies.DefaultAnswerSet questionnaire_basedondefaultanswerset)
	{
		setQuestionnaire_BasedOnDefaultAnswerSet(getContext(), questionnaire_basedondefaultanswerset);
	}

	/**
	 * Set value of Questionnaire_BasedOnDefaultAnswerSet
	 * @param context
	 * @param questionnaire_basedondefaultanswerset
	 */
	public final void setQuestionnaire_BasedOnDefaultAnswerSet(com.mendix.systemwideinterfaces.core.IContext context, questionnairev2.proxies.DefaultAnswerSet questionnaire_basedondefaultanswerset)
	{
		if (questionnaire_basedondefaultanswerset == null)
			getMendixObject().setValue(context, MemberNames.Questionnaire_BasedOnDefaultAnswerSet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Questionnaire_BasedOnDefaultAnswerSet.toString(), questionnaire_basedondefaultanswerset.getMendixObject().getId());
	}

	/**
	 * @return value of QuestionnaireList_Request
	 */
	public final process.proxies.Request getQuestionnaireList_Request() throws com.mendix.core.CoreException
	{
		return getQuestionnaireList_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of QuestionnaireList_Request
	 */
	public final process.proxies.Request getQuestionnaireList_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QuestionnaireList_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of QuestionnaireList_Request
	 * @param questionnairelist_request
	 */
	public final void setQuestionnaireList_Request(process.proxies.Request questionnairelist_request)
	{
		setQuestionnaireList_Request(getContext(), questionnairelist_request);
	}

	/**
	 * Set value of QuestionnaireList_Request
	 * @param context
	 * @param questionnairelist_request
	 */
	public final void setQuestionnaireList_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request questionnairelist_request)
	{
		if (questionnairelist_request == null)
			getMendixObject().setValue(context, MemberNames.QuestionnaireList_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.QuestionnaireList_Request.toString(), questionnairelist_request.getMendixObject().getId());
	}

	/**
	 * @return value of QuestionnaireActive_Request
	 */
	public final process.proxies.Request getQuestionnaireActive_Request() throws com.mendix.core.CoreException
	{
		return getQuestionnaireActive_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of QuestionnaireActive_Request
	 */
	public final process.proxies.Request getQuestionnaireActive_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QuestionnaireActive_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of QuestionnaireActive_Request
	 * @param questionnaireactive_request
	 */
	public final void setQuestionnaireActive_Request(process.proxies.Request questionnaireactive_request)
	{
		setQuestionnaireActive_Request(getContext(), questionnaireactive_request);
	}

	/**
	 * Set value of QuestionnaireActive_Request
	 * @param context
	 * @param questionnaireactive_request
	 */
	public final void setQuestionnaireActive_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request questionnaireactive_request)
	{
		if (questionnaireactive_request == null)
			getMendixObject().setValue(context, MemberNames.QuestionnaireActive_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.QuestionnaireActive_Request.toString(), questionnaireactive_request.getMendixObject().getId());
	}

	/**
	 * @return value of Questionnaire_MitigationPlan
	 */
	public final customlvnl.proxies.MitigationPlan getQuestionnaire_MitigationPlan() throws com.mendix.core.CoreException
	{
		return getQuestionnaire_MitigationPlan(getContext());
	}

	/**
	 * @param context
	 * @return value of Questionnaire_MitigationPlan
	 */
	public final customlvnl.proxies.MitigationPlan getQuestionnaire_MitigationPlan(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		customlvnl.proxies.MitigationPlan result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Questionnaire_MitigationPlan.toString());
		if (identifier != null)
			result = customlvnl.proxies.MitigationPlan.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Questionnaire_MitigationPlan
	 * @param questionnaire_mitigationplan
	 */
	public final void setQuestionnaire_MitigationPlan(customlvnl.proxies.MitigationPlan questionnaire_mitigationplan)
	{
		setQuestionnaire_MitigationPlan(getContext(), questionnaire_mitigationplan);
	}

	/**
	 * Set value of Questionnaire_MitigationPlan
	 * @param context
	 * @param questionnaire_mitigationplan
	 */
	public final void setQuestionnaire_MitigationPlan(com.mendix.systemwideinterfaces.core.IContext context, customlvnl.proxies.MitigationPlan questionnaire_mitigationplan)
	{
		if (questionnaire_mitigationplan == null)
			getMendixObject().setValue(context, MemberNames.Questionnaire_MitigationPlan.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Questionnaire_MitigationPlan.toString(), questionnaire_mitigationplan.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return questionnaireMendixObject;
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
			final questionnairev2.proxies.Questionnaire that = (questionnairev2.proxies.Questionnaire) obj;
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
		return "QuestionnaireV2.Questionnaire";
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
