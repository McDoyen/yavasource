// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package approval.proxies;

public class ApprovalInstancePerson
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject approvalInstancePersonMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Approval.ApprovalInstancePerson";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Approved("Approved"),
		DecisionDate("DecisionDate"),
		Token("Token"),
		HTMLCode("HTMLCode"),
		PasswordVerification("PasswordVerification"),
		ValidCaptcha("ValidCaptcha"),
		PasswordVerified("PasswordVerified"),
		Feedback("Feedback"),
		Subject("Subject"),
		ApprovalType("ApprovalType"),
		CheckForReset("CheckForReset"),
		ApprovalInstancePerson_ApprovalInstance("Approval.ApprovalInstancePerson_ApprovalInstance"),
		ApprovalInstancePerson_ApprovalInstancePersonBatch("Approval.ApprovalInstancePerson_ApprovalInstancePersonBatch"),
		ApprovalInstancePerson_Person("Approval.ApprovalInstancePerson_Person"),
		x_ApprovalInstancePerson_EmailMessage("Approval.x_ApprovalInstancePerson_EmailMessage"),
		ApprovalInstancePerson_Organisation("Approval.ApprovalInstancePerson_Organisation"),
		ApprovalInstancePerson_BusinessRole("Approval.ApprovalInstancePerson_BusinessRole"),
		ApprovalInstancePerson_Message("Approval.ApprovalInstancePerson_Message"),
		ApprovalInstancePerson_RequestedByPerson("Approval.ApprovalInstancePerson_RequestedByPerson");

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

	public ApprovalInstancePerson(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Approval.ApprovalInstancePerson"));
	}

	protected ApprovalInstancePerson(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject approvalInstancePersonMendixObject)
	{
		if (approvalInstancePersonMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Approval.ApprovalInstancePerson", approvalInstancePersonMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Approval.ApprovalInstancePerson");

		this.approvalInstancePersonMendixObject = approvalInstancePersonMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ApprovalInstancePerson.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static approval.proxies.ApprovalInstancePerson initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return approval.proxies.ApprovalInstancePerson.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static approval.proxies.ApprovalInstancePerson initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new approval.proxies.ApprovalInstancePerson(context, mendixObject);
	}

	public static approval.proxies.ApprovalInstancePerson load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return approval.proxies.ApprovalInstancePerson.initialize(context, mendixObject);
	}

	public static java.util.List<approval.proxies.ApprovalInstancePerson> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<approval.proxies.ApprovalInstancePerson> result = new java.util.ArrayList<approval.proxies.ApprovalInstancePerson>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Approval.ApprovalInstancePerson" + xpathConstraint))
			result.add(approval.proxies.ApprovalInstancePerson.initialize(context, obj));
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
	 * Set value of Approved
	 * @param approved
	 */
	public final approval.proxies.ApprovalResultEnum getApproved()
	{
		return getApproved(getContext());
	}

	/**
	 * @param context
	 * @return value of Approved
	 */
	public final approval.proxies.ApprovalResultEnum getApproved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Approved.toString());
		if (obj == null)
			return null;

		return approval.proxies.ApprovalResultEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Approved
	 * @param approved
	 */
	public final void setApproved(approval.proxies.ApprovalResultEnum approved)
	{
		setApproved(getContext(), approved);
	}

	/**
	 * Set value of Approved
	 * @param context
	 * @param approved
	 */
	public final void setApproved(com.mendix.systemwideinterfaces.core.IContext context, approval.proxies.ApprovalResultEnum approved)
	{
		if (approved != null)
			getMendixObject().setValue(context, MemberNames.Approved.toString(), approved.toString());
		else
			getMendixObject().setValue(context, MemberNames.Approved.toString(), null);
	}

	/**
	 * @return value of DecisionDate
	 */
	public final java.util.Date getDecisionDate()
	{
		return getDecisionDate(getContext());
	}

	/**
	 * @param context
	 * @return value of DecisionDate
	 */
	public final java.util.Date getDecisionDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DecisionDate.toString());
	}

	/**
	 * Set value of DecisionDate
	 * @param decisiondate
	 */
	public final void setDecisionDate(java.util.Date decisiondate)
	{
		setDecisionDate(getContext(), decisiondate);
	}

	/**
	 * Set value of DecisionDate
	 * @param context
	 * @param decisiondate
	 */
	public final void setDecisionDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date decisiondate)
	{
		getMendixObject().setValue(context, MemberNames.DecisionDate.toString(), decisiondate);
	}

	/**
	 * @return value of Token
	 */
	public final java.lang.String getToken()
	{
		return getToken(getContext());
	}

	/**
	 * @param context
	 * @return value of Token
	 */
	public final java.lang.String getToken(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Token.toString());
	}

	/**
	 * Set value of Token
	 * @param token
	 */
	public final void setToken(java.lang.String token)
	{
		setToken(getContext(), token);
	}

	/**
	 * Set value of Token
	 * @param context
	 * @param token
	 */
	public final void setToken(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String token)
	{
		getMendixObject().setValue(context, MemberNames.Token.toString(), token);
	}

	/**
	 * @return value of HTMLCode
	 */
	public final java.lang.String getHTMLCode()
	{
		return getHTMLCode(getContext());
	}

	/**
	 * @param context
	 * @return value of HTMLCode
	 */
	public final java.lang.String getHTMLCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HTMLCode.toString());
	}

	/**
	 * Set value of HTMLCode
	 * @param htmlcode
	 */
	public final void setHTMLCode(java.lang.String htmlcode)
	{
		setHTMLCode(getContext(), htmlcode);
	}

	/**
	 * Set value of HTMLCode
	 * @param context
	 * @param htmlcode
	 */
	public final void setHTMLCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String htmlcode)
	{
		getMendixObject().setValue(context, MemberNames.HTMLCode.toString(), htmlcode);
	}

	/**
	 * @return value of PasswordVerification
	 */
	public final java.lang.String getPasswordVerification()
	{
		return getPasswordVerification(getContext());
	}

	/**
	 * @param context
	 * @return value of PasswordVerification
	 */
	public final java.lang.String getPasswordVerification(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PasswordVerification.toString());
	}

	/**
	 * Set value of PasswordVerification
	 * @param passwordverification
	 */
	public final void setPasswordVerification(java.lang.String passwordverification)
	{
		setPasswordVerification(getContext(), passwordverification);
	}

	/**
	 * Set value of PasswordVerification
	 * @param context
	 * @param passwordverification
	 */
	public final void setPasswordVerification(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String passwordverification)
	{
		getMendixObject().setValue(context, MemberNames.PasswordVerification.toString(), passwordverification);
	}

	/**
	 * @return value of ValidCaptcha
	 */
	public final java.lang.Boolean getValidCaptcha()
	{
		return getValidCaptcha(getContext());
	}

	/**
	 * @param context
	 * @return value of ValidCaptcha
	 */
	public final java.lang.Boolean getValidCaptcha(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ValidCaptcha.toString());
	}

	/**
	 * Set value of ValidCaptcha
	 * @param validcaptcha
	 */
	public final void setValidCaptcha(java.lang.Boolean validcaptcha)
	{
		setValidCaptcha(getContext(), validcaptcha);
	}

	/**
	 * Set value of ValidCaptcha
	 * @param context
	 * @param validcaptcha
	 */
	public final void setValidCaptcha(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean validcaptcha)
	{
		getMendixObject().setValue(context, MemberNames.ValidCaptcha.toString(), validcaptcha);
	}

	/**
	 * @return value of PasswordVerified
	 */
	public final java.lang.Boolean getPasswordVerified()
	{
		return getPasswordVerified(getContext());
	}

	/**
	 * @param context
	 * @return value of PasswordVerified
	 */
	public final java.lang.Boolean getPasswordVerified(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.PasswordVerified.toString());
	}

	/**
	 * Set value of PasswordVerified
	 * @param passwordverified
	 */
	public final void setPasswordVerified(java.lang.Boolean passwordverified)
	{
		setPasswordVerified(getContext(), passwordverified);
	}

	/**
	 * Set value of PasswordVerified
	 * @param context
	 * @param passwordverified
	 */
	public final void setPasswordVerified(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean passwordverified)
	{
		getMendixObject().setValue(context, MemberNames.PasswordVerified.toString(), passwordverified);
	}

	/**
	 * @return value of Feedback
	 */
	public final java.lang.String getFeedback()
	{
		return getFeedback(getContext());
	}

	/**
	 * @param context
	 * @return value of Feedback
	 */
	public final java.lang.String getFeedback(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Feedback.toString());
	}

	/**
	 * Set value of Feedback
	 * @param feedback
	 */
	public final void setFeedback(java.lang.String feedback)
	{
		setFeedback(getContext(), feedback);
	}

	/**
	 * Set value of Feedback
	 * @param context
	 * @param feedback
	 */
	public final void setFeedback(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String feedback)
	{
		getMendixObject().setValue(context, MemberNames.Feedback.toString(), feedback);
	}

	/**
	 * @return value of Subject
	 */
	public final java.lang.String getSubject()
	{
		return getSubject(getContext());
	}

	/**
	 * @param context
	 * @return value of Subject
	 */
	public final java.lang.String getSubject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Subject.toString());
	}

	/**
	 * Set value of Subject
	 * @param subject
	 */
	public final void setSubject(java.lang.String subject)
	{
		setSubject(getContext(), subject);
	}

	/**
	 * Set value of Subject
	 * @param context
	 * @param subject
	 */
	public final void setSubject(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String subject)
	{
		getMendixObject().setValue(context, MemberNames.Subject.toString(), subject);
	}

	/**
	 * Set value of ApprovalType
	 * @param approvaltype
	 */
	public final approval.proxies.ApprovalTypeEnum getApprovalType()
	{
		return getApprovalType(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalType
	 */
	public final approval.proxies.ApprovalTypeEnum getApprovalType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ApprovalType.toString());
		if (obj == null)
			return null;

		return approval.proxies.ApprovalTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ApprovalType
	 * @param approvaltype
	 */
	public final void setApprovalType(approval.proxies.ApprovalTypeEnum approvaltype)
	{
		setApprovalType(getContext(), approvaltype);
	}

	/**
	 * Set value of ApprovalType
	 * @param context
	 * @param approvaltype
	 */
	public final void setApprovalType(com.mendix.systemwideinterfaces.core.IContext context, approval.proxies.ApprovalTypeEnum approvaltype)
	{
		if (approvaltype != null)
			getMendixObject().setValue(context, MemberNames.ApprovalType.toString(), approvaltype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ApprovalType.toString(), null);
	}

	/**
	 * @return value of CheckForReset
	 */
	public final java.lang.Boolean getCheckForReset()
	{
		return getCheckForReset(getContext());
	}

	/**
	 * @param context
	 * @return value of CheckForReset
	 */
	public final java.lang.Boolean getCheckForReset(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CheckForReset.toString());
	}

	/**
	 * Set value of CheckForReset
	 * @param checkforreset
	 */
	public final void setCheckForReset(java.lang.Boolean checkforreset)
	{
		setCheckForReset(getContext(), checkforreset);
	}

	/**
	 * Set value of CheckForReset
	 * @param context
	 * @param checkforreset
	 */
	public final void setCheckForReset(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean checkforreset)
	{
		getMendixObject().setValue(context, MemberNames.CheckForReset.toString(), checkforreset);
	}

	/**
	 * @return value of ApprovalInstancePerson_ApprovalInstance
	 */
	public final approval.proxies.ApprovalInstance getApprovalInstancePerson_ApprovalInstance() throws com.mendix.core.CoreException
	{
		return getApprovalInstancePerson_ApprovalInstance(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstancePerson_ApprovalInstance
	 */
	public final approval.proxies.ApprovalInstance getApprovalInstancePerson_ApprovalInstance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		approval.proxies.ApprovalInstance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstancePerson_ApprovalInstance.toString());
		if (identifier != null)
			result = approval.proxies.ApprovalInstance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstancePerson_ApprovalInstance
	 * @param approvalinstanceperson_approvalinstance
	 */
	public final void setApprovalInstancePerson_ApprovalInstance(approval.proxies.ApprovalInstance approvalinstanceperson_approvalinstance)
	{
		setApprovalInstancePerson_ApprovalInstance(getContext(), approvalinstanceperson_approvalinstance);
	}

	/**
	 * Set value of ApprovalInstancePerson_ApprovalInstance
	 * @param context
	 * @param approvalinstanceperson_approvalinstance
	 */
	public final void setApprovalInstancePerson_ApprovalInstance(com.mendix.systemwideinterfaces.core.IContext context, approval.proxies.ApprovalInstance approvalinstanceperson_approvalinstance)
	{
		if (approvalinstanceperson_approvalinstance == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_ApprovalInstance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_ApprovalInstance.toString(), approvalinstanceperson_approvalinstance.getMendixObject().getId());
	}

	/**
	 * @return value of ApprovalInstancePerson_ApprovalInstancePersonBatch
	 */
	public final approval.proxies.ApprovalInstancePersonBatch getApprovalInstancePerson_ApprovalInstancePersonBatch() throws com.mendix.core.CoreException
	{
		return getApprovalInstancePerson_ApprovalInstancePersonBatch(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstancePerson_ApprovalInstancePersonBatch
	 */
	public final approval.proxies.ApprovalInstancePersonBatch getApprovalInstancePerson_ApprovalInstancePersonBatch(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		approval.proxies.ApprovalInstancePersonBatch result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstancePerson_ApprovalInstancePersonBatch.toString());
		if (identifier != null)
			result = approval.proxies.ApprovalInstancePersonBatch.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstancePerson_ApprovalInstancePersonBatch
	 * @param approvalinstanceperson_approvalinstancepersonbatch
	 */
	public final void setApprovalInstancePerson_ApprovalInstancePersonBatch(approval.proxies.ApprovalInstancePersonBatch approvalinstanceperson_approvalinstancepersonbatch)
	{
		setApprovalInstancePerson_ApprovalInstancePersonBatch(getContext(), approvalinstanceperson_approvalinstancepersonbatch);
	}

	/**
	 * Set value of ApprovalInstancePerson_ApprovalInstancePersonBatch
	 * @param context
	 * @param approvalinstanceperson_approvalinstancepersonbatch
	 */
	public final void setApprovalInstancePerson_ApprovalInstancePersonBatch(com.mendix.systemwideinterfaces.core.IContext context, approval.proxies.ApprovalInstancePersonBatch approvalinstanceperson_approvalinstancepersonbatch)
	{
		if (approvalinstanceperson_approvalinstancepersonbatch == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_ApprovalInstancePersonBatch.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_ApprovalInstancePersonBatch.toString(), approvalinstanceperson_approvalinstancepersonbatch.getMendixObject().getId());
	}

	/**
	 * @return value of ApprovalInstancePerson_Person
	 */
	public final nap.proxies.Person getApprovalInstancePerson_Person() throws com.mendix.core.CoreException
	{
		return getApprovalInstancePerson_Person(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstancePerson_Person
	 */
	public final nap.proxies.Person getApprovalInstancePerson_Person(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstancePerson_Person.toString());
		if (identifier != null)
			result = nap.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstancePerson_Person
	 * @param approvalinstanceperson_person
	 */
	public final void setApprovalInstancePerson_Person(nap.proxies.Person approvalinstanceperson_person)
	{
		setApprovalInstancePerson_Person(getContext(), approvalinstanceperson_person);
	}

	/**
	 * Set value of ApprovalInstancePerson_Person
	 * @param context
	 * @param approvalinstanceperson_person
	 */
	public final void setApprovalInstancePerson_Person(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Person approvalinstanceperson_person)
	{
		if (approvalinstanceperson_person == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_Person.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_Person.toString(), approvalinstanceperson_person.getMendixObject().getId());
	}

	/**
	 * @return value of x_ApprovalInstancePerson_EmailMessage
	 */
	public final java.util.List<emailplus.proxies.EmailMessage> getx_ApprovalInstancePerson_EmailMessage() throws com.mendix.core.CoreException
	{
		return getx_ApprovalInstancePerson_EmailMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of x_ApprovalInstancePerson_EmailMessage
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<emailplus.proxies.EmailMessage> getx_ApprovalInstancePerson_EmailMessage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<emailplus.proxies.EmailMessage> result = new java.util.ArrayList<emailplus.proxies.EmailMessage>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.x_ApprovalInstancePerson_EmailMessage.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(emailplus.proxies.EmailMessage.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of x_ApprovalInstancePerson_EmailMessage
	 * @param x_approvalinstanceperson_emailmessage
	 */
	public final void setx_ApprovalInstancePerson_EmailMessage(java.util.List<emailplus.proxies.EmailMessage> x_approvalinstanceperson_emailmessage)
	{
		setx_ApprovalInstancePerson_EmailMessage(getContext(), x_approvalinstanceperson_emailmessage);
	}

	/**
	 * Set value of x_ApprovalInstancePerson_EmailMessage
	 * @param context
	 * @param x_approvalinstanceperson_emailmessage
	 */
	public final void setx_ApprovalInstancePerson_EmailMessage(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<emailplus.proxies.EmailMessage> x_approvalinstanceperson_emailmessage)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (emailplus.proxies.EmailMessage proxyObject : x_approvalinstanceperson_emailmessage)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.x_ApprovalInstancePerson_EmailMessage.toString(), identifiers);
	}

	/**
	 * @return value of ApprovalInstancePerson_Organisation
	 */
	public final nap.proxies.Organisation getApprovalInstancePerson_Organisation() throws com.mendix.core.CoreException
	{
		return getApprovalInstancePerson_Organisation(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstancePerson_Organisation
	 */
	public final nap.proxies.Organisation getApprovalInstancePerson_Organisation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Organisation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstancePerson_Organisation.toString());
		if (identifier != null)
			result = nap.proxies.Organisation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstancePerson_Organisation
	 * @param approvalinstanceperson_organisation
	 */
	public final void setApprovalInstancePerson_Organisation(nap.proxies.Organisation approvalinstanceperson_organisation)
	{
		setApprovalInstancePerson_Organisation(getContext(), approvalinstanceperson_organisation);
	}

	/**
	 * Set value of ApprovalInstancePerson_Organisation
	 * @param context
	 * @param approvalinstanceperson_organisation
	 */
	public final void setApprovalInstancePerson_Organisation(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Organisation approvalinstanceperson_organisation)
	{
		if (approvalinstanceperson_organisation == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_Organisation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_Organisation.toString(), approvalinstanceperson_organisation.getMendixObject().getId());
	}

	/**
	 * @return value of ApprovalInstancePerson_BusinessRole
	 */
	public final nap.proxies.BusinessRole getApprovalInstancePerson_BusinessRole() throws com.mendix.core.CoreException
	{
		return getApprovalInstancePerson_BusinessRole(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstancePerson_BusinessRole
	 */
	public final nap.proxies.BusinessRole getApprovalInstancePerson_BusinessRole(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.BusinessRole result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstancePerson_BusinessRole.toString());
		if (identifier != null)
			result = nap.proxies.BusinessRole.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstancePerson_BusinessRole
	 * @param approvalinstanceperson_businessrole
	 */
	public final void setApprovalInstancePerson_BusinessRole(nap.proxies.BusinessRole approvalinstanceperson_businessrole)
	{
		setApprovalInstancePerson_BusinessRole(getContext(), approvalinstanceperson_businessrole);
	}

	/**
	 * Set value of ApprovalInstancePerson_BusinessRole
	 * @param context
	 * @param approvalinstanceperson_businessrole
	 */
	public final void setApprovalInstancePerson_BusinessRole(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.BusinessRole approvalinstanceperson_businessrole)
	{
		if (approvalinstanceperson_businessrole == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_BusinessRole.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_BusinessRole.toString(), approvalinstanceperson_businessrole.getMendixObject().getId());
	}

	/**
	 * @return value of ApprovalInstancePerson_Message
	 */
	public final java.util.List<emailplus.proxies.Message> getApprovalInstancePerson_Message() throws com.mendix.core.CoreException
	{
		return getApprovalInstancePerson_Message(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstancePerson_Message
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<emailplus.proxies.Message> getApprovalInstancePerson_Message(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<emailplus.proxies.Message> result = new java.util.ArrayList<emailplus.proxies.Message>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ApprovalInstancePerson_Message.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(emailplus.proxies.Message.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ApprovalInstancePerson_Message
	 * @param approvalinstanceperson_message
	 */
	public final void setApprovalInstancePerson_Message(java.util.List<emailplus.proxies.Message> approvalinstanceperson_message)
	{
		setApprovalInstancePerson_Message(getContext(), approvalinstanceperson_message);
	}

	/**
	 * Set value of ApprovalInstancePerson_Message
	 * @param context
	 * @param approvalinstanceperson_message
	 */
	public final void setApprovalInstancePerson_Message(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<emailplus.proxies.Message> approvalinstanceperson_message)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (emailplus.proxies.Message proxyObject : approvalinstanceperson_message)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_Message.toString(), identifiers);
	}

	/**
	 * @return value of ApprovalInstancePerson_RequestedByPerson
	 */
	public final nap.proxies.Person getApprovalInstancePerson_RequestedByPerson() throws com.mendix.core.CoreException
	{
		return getApprovalInstancePerson_RequestedByPerson(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstancePerson_RequestedByPerson
	 */
	public final nap.proxies.Person getApprovalInstancePerson_RequestedByPerson(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstancePerson_RequestedByPerson.toString());
		if (identifier != null)
			result = nap.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstancePerson_RequestedByPerson
	 * @param approvalinstanceperson_requestedbyperson
	 */
	public final void setApprovalInstancePerson_RequestedByPerson(nap.proxies.Person approvalinstanceperson_requestedbyperson)
	{
		setApprovalInstancePerson_RequestedByPerson(getContext(), approvalinstanceperson_requestedbyperson);
	}

	/**
	 * Set value of ApprovalInstancePerson_RequestedByPerson
	 * @param context
	 * @param approvalinstanceperson_requestedbyperson
	 */
	public final void setApprovalInstancePerson_RequestedByPerson(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Person approvalinstanceperson_requestedbyperson)
	{
		if (approvalinstanceperson_requestedbyperson == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_RequestedByPerson.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstancePerson_RequestedByPerson.toString(), approvalinstanceperson_requestedbyperson.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return approvalInstancePersonMendixObject;
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
			final approval.proxies.ApprovalInstancePerson that = (approval.proxies.ApprovalInstancePerson) obj;
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
		return "Approval.ApprovalInstancePerson";
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
