// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package approval.proxies;

public class CustomerApprovalTemplate extends approval.proxies.ApprovalTemplate
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Approval.CustomerApprovalTemplate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Level("Level"),
		CustomerApprovalType("CustomerApprovalType"),
		Name("Name"),
		ApprovalBy("ApprovalBy"),
		ApprovalByNumber("ApprovalByNumber"),
		Description("Description"),
		AutoApproveOnNoApprovers("AutoApproveOnNoApprovers"),
		IsEntity("IsEntity"),
		SubjectRequest("SubjectRequest"),
		SubjectConfirmation("SubjectConfirmation"),
		SubjectApproved("SubjectApproved"),
		SubjectRejected("SubjectRejected"),
		SubjectCancelled("SubjectCancelled"),
		ApprovalTemplate_ApproverMessageTemplate("Approval.ApprovalTemplate_ApproverMessageTemplate"),
		ApprovalTemplate_RequestConfirmationMessageTemplate("Approval.ApprovalTemplate_RequestConfirmationMessageTemplate"),
		ApprovalTemplate_ApprovedMessageTemplate("Approval.ApprovalTemplate_ApprovedMessageTemplate"),
		ApprovalTemplate_RejectedMessageTemplate("Approval.ApprovalTemplate_RejectedMessageTemplate"),
		ApprovalTemplate_CancelMessageTemplate("Approval.ApprovalTemplate_CancelMessageTemplate");

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

	public CustomerApprovalTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Approval.CustomerApprovalTemplate"));
	}

	protected CustomerApprovalTemplate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject customerApprovalTemplateMendixObject)
	{
		super(context, customerApprovalTemplateMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Approval.CustomerApprovalTemplate", customerApprovalTemplateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Approval.CustomerApprovalTemplate");
	}

	/**
	 * @deprecated Use 'CustomerApprovalTemplate.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static approval.proxies.CustomerApprovalTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return approval.proxies.CustomerApprovalTemplate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static approval.proxies.CustomerApprovalTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new approval.proxies.CustomerApprovalTemplate(context, mendixObject);
	}

	public static approval.proxies.CustomerApprovalTemplate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return approval.proxies.CustomerApprovalTemplate.initialize(context, mendixObject);
	}

	public static java.util.List<approval.proxies.CustomerApprovalTemplate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<approval.proxies.CustomerApprovalTemplate> result = new java.util.ArrayList<approval.proxies.CustomerApprovalTemplate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Approval.CustomerApprovalTemplate" + xpathConstraint))
			result.add(approval.proxies.CustomerApprovalTemplate.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Level
	 */
	public final java.lang.Integer getLevel()
	{
		return getLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of Level
	 */
	public final java.lang.Integer getLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Level.toString());
	}

	/**
	 * Set value of Level
	 * @param level
	 */
	public final void setLevel(java.lang.Integer level)
	{
		setLevel(getContext(), level);
	}

	/**
	 * Set value of Level
	 * @param context
	 * @param level
	 */
	public final void setLevel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer level)
	{
		getMendixObject().setValue(context, MemberNames.Level.toString(), level);
	}

	/**
	 * Set value of CustomerApprovalType
	 * @param customerapprovaltype
	 */
	public final approval.proxies.CustomerApprovalTypeEnum getCustomerApprovalType()
	{
		return getCustomerApprovalType(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerApprovalType
	 */
	public final approval.proxies.CustomerApprovalTypeEnum getCustomerApprovalType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.CustomerApprovalType.toString());
		if (obj == null)
			return null;

		return approval.proxies.CustomerApprovalTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of CustomerApprovalType
	 * @param customerapprovaltype
	 */
	public final void setCustomerApprovalType(approval.proxies.CustomerApprovalTypeEnum customerapprovaltype)
	{
		setCustomerApprovalType(getContext(), customerapprovaltype);
	}

	/**
	 * Set value of CustomerApprovalType
	 * @param context
	 * @param customerapprovaltype
	 */
	public final void setCustomerApprovalType(com.mendix.systemwideinterfaces.core.IContext context, approval.proxies.CustomerApprovalTypeEnum customerapprovaltype)
	{
		if (customerapprovaltype != null)
			getMendixObject().setValue(context, MemberNames.CustomerApprovalType.toString(), customerapprovaltype.toString());
		else
			getMendixObject().setValue(context, MemberNames.CustomerApprovalType.toString(), null);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final approval.proxies.CustomerApprovalTemplate that = (approval.proxies.CustomerApprovalTemplate) obj;
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
		return "Approval.CustomerApprovalTemplate";
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
