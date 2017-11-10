// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package scripting.proxies;

public class Question_Instance
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject question_InstanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Scripting.Question_Instance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Question("Question"),
		QuestionNumber("QuestionNumber"),
		Question_Instance_Answer_Instance("Scripting.Question_Instance_Answer_Instance"),
		Question_Instance_GivenAnswer_Instance("Scripting.Question_Instance_GivenAnswer_Instance"),
		Temp_Question_Instance_Question("Scripting.Temp_Question_Instance_Question");

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

	public Question_Instance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Scripting.Question_Instance"));
	}

	protected Question_Instance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject question_InstanceMendixObject)
	{
		if (question_InstanceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Scripting.Question_Instance", question_InstanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Scripting.Question_Instance");

		this.question_InstanceMendixObject = question_InstanceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Question_Instance.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static scripting.proxies.Question_Instance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return scripting.proxies.Question_Instance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static scripting.proxies.Question_Instance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new scripting.proxies.Question_Instance(context, mendixObject);
	}

	public static scripting.proxies.Question_Instance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return scripting.proxies.Question_Instance.initialize(context, mendixObject);
	}

	public static java.util.List<scripting.proxies.Question_Instance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<scripting.proxies.Question_Instance> result = new java.util.ArrayList<scripting.proxies.Question_Instance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Scripting.Question_Instance" + xpathConstraint))
			result.add(scripting.proxies.Question_Instance.initialize(context, obj));
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
	 * @return value of QuestionNumber
	 */
	public final java.lang.Long getQuestionNumber()
	{
		return getQuestionNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of QuestionNumber
	 */
	public final java.lang.Long getQuestionNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.QuestionNumber.toString());
	}

	/**
	 * Set value of QuestionNumber
	 * @param questionnumber
	 */
	public final void setQuestionNumber(java.lang.Long questionnumber)
	{
		setQuestionNumber(getContext(), questionnumber);
	}

	/**
	 * Set value of QuestionNumber
	 * @param context
	 * @param questionnumber
	 */
	public final void setQuestionNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long questionnumber)
	{
		getMendixObject().setValue(context, MemberNames.QuestionNumber.toString(), questionnumber);
	}

	/**
	 * @return value of Question_Instance_Answer_Instance
	 */
	public final java.util.List<scripting.proxies.Answer_Instance> getQuestion_Instance_Answer_Instance() throws com.mendix.core.CoreException
	{
		return getQuestion_Instance_Answer_Instance(getContext());
	}

	/**
	 * @param context
	 * @return value of Question_Instance_Answer_Instance
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<scripting.proxies.Answer_Instance> getQuestion_Instance_Answer_Instance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<scripting.proxies.Answer_Instance> result = new java.util.ArrayList<scripting.proxies.Answer_Instance>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Question_Instance_Answer_Instance.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(scripting.proxies.Answer_Instance.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Question_Instance_Answer_Instance
	 * @param question_instance_answer_instance
	 */
	public final void setQuestion_Instance_Answer_Instance(java.util.List<scripting.proxies.Answer_Instance> question_instance_answer_instance)
	{
		setQuestion_Instance_Answer_Instance(getContext(), question_instance_answer_instance);
	}

	/**
	 * Set value of Question_Instance_Answer_Instance
	 * @param context
	 * @param question_instance_answer_instance
	 */
	public final void setQuestion_Instance_Answer_Instance(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<scripting.proxies.Answer_Instance> question_instance_answer_instance)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (scripting.proxies.Answer_Instance proxyObject : question_instance_answer_instance)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Question_Instance_Answer_Instance.toString(), identifiers);
	}

	/**
	 * @return value of Question_Instance_GivenAnswer_Instance
	 */
	public final scripting.proxies.Answer_Instance getQuestion_Instance_GivenAnswer_Instance() throws com.mendix.core.CoreException
	{
		return getQuestion_Instance_GivenAnswer_Instance(getContext());
	}

	/**
	 * @param context
	 * @return value of Question_Instance_GivenAnswer_Instance
	 */
	public final scripting.proxies.Answer_Instance getQuestion_Instance_GivenAnswer_Instance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		scripting.proxies.Answer_Instance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Question_Instance_GivenAnswer_Instance.toString());
		if (identifier != null)
			result = scripting.proxies.Answer_Instance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Question_Instance_GivenAnswer_Instance
	 * @param question_instance_givenanswer_instance
	 */
	public final void setQuestion_Instance_GivenAnswer_Instance(scripting.proxies.Answer_Instance question_instance_givenanswer_instance)
	{
		setQuestion_Instance_GivenAnswer_Instance(getContext(), question_instance_givenanswer_instance);
	}

	/**
	 * Set value of Question_Instance_GivenAnswer_Instance
	 * @param context
	 * @param question_instance_givenanswer_instance
	 */
	public final void setQuestion_Instance_GivenAnswer_Instance(com.mendix.systemwideinterfaces.core.IContext context, scripting.proxies.Answer_Instance question_instance_givenanswer_instance)
	{
		if (question_instance_givenanswer_instance == null)
			getMendixObject().setValue(context, MemberNames.Question_Instance_GivenAnswer_Instance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Question_Instance_GivenAnswer_Instance.toString(), question_instance_givenanswer_instance.getMendixObject().getId());
	}

	/**
	 * @return value of Temp_Question_Instance_Question
	 */
	public final scripting.proxies.Question getTemp_Question_Instance_Question() throws com.mendix.core.CoreException
	{
		return getTemp_Question_Instance_Question(getContext());
	}

	/**
	 * @param context
	 * @return value of Temp_Question_Instance_Question
	 */
	public final scripting.proxies.Question getTemp_Question_Instance_Question(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		scripting.proxies.Question result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Temp_Question_Instance_Question.toString());
		if (identifier != null)
			result = scripting.proxies.Question.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Temp_Question_Instance_Question
	 * @param temp_question_instance_question
	 */
	public final void setTemp_Question_Instance_Question(scripting.proxies.Question temp_question_instance_question)
	{
		setTemp_Question_Instance_Question(getContext(), temp_question_instance_question);
	}

	/**
	 * Set value of Temp_Question_Instance_Question
	 * @param context
	 * @param temp_question_instance_question
	 */
	public final void setTemp_Question_Instance_Question(com.mendix.systemwideinterfaces.core.IContext context, scripting.proxies.Question temp_question_instance_question)
	{
		if (temp_question_instance_question == null)
			getMendixObject().setValue(context, MemberNames.Temp_Question_Instance_Question.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Temp_Question_Instance_Question.toString(), temp_question_instance_question.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return question_InstanceMendixObject;
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
			final scripting.proxies.Question_Instance that = (scripting.proxies.Question_Instance) obj;
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
		return "Scripting.Question_Instance";
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