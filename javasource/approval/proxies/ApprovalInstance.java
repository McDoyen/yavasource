// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package approval.proxies;

public class ApprovalInstance
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject approvalInstanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Approval.ApprovalInstance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Approved("Approved"),
		DecisionDate("DecisionDate"),
		ApprovalActionResult("ApprovalActionResult"),
		ApprovalHandled("ApprovalHandled"),
		ApprovalType("ApprovalType"),
		ApprovalActionSucceeded("ApprovalActionSucceeded"),
		ErrorNoMailAddress("ErrorNoMailAddress"),
		Decriptor("Decriptor"),
		Error("Error"),
		ApprovalInstance_ApprovalTemplate("Approval.ApprovalInstance_ApprovalTemplate"),
		ApprovalInstance_Request("Approval.ApprovalInstance_Request"),
		ApprovalInstance_ShoppingCart("Approval.ApprovalInstance_ShoppingCart"),
		ApprovalInstance_ShoppingCartProduct("Approval.ApprovalInstance_ShoppingCartProduct");

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

	public ApprovalInstance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Approval.ApprovalInstance"));
	}

	protected ApprovalInstance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject approvalInstanceMendixObject)
	{
		if (approvalInstanceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Approval.ApprovalInstance", approvalInstanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Approval.ApprovalInstance");

		this.approvalInstanceMendixObject = approvalInstanceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ApprovalInstance.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static approval.proxies.ApprovalInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return approval.proxies.ApprovalInstance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static approval.proxies.ApprovalInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new approval.proxies.ApprovalInstance(context, mendixObject);
	}

	public static approval.proxies.ApprovalInstance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return approval.proxies.ApprovalInstance.initialize(context, mendixObject);
	}

	public static java.util.List<approval.proxies.ApprovalInstance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<approval.proxies.ApprovalInstance> result = new java.util.ArrayList<approval.proxies.ApprovalInstance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Approval.ApprovalInstance" + xpathConstraint))
			result.add(approval.proxies.ApprovalInstance.initialize(context, obj));
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
	 * Set value of ApprovalActionResult
	 * @param approvalactionresult
	 */
	public final approval.proxies.ApprovalActionResultEnum getApprovalActionResult()
	{
		return getApprovalActionResult(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalActionResult
	 */
	public final approval.proxies.ApprovalActionResultEnum getApprovalActionResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ApprovalActionResult.toString());
		if (obj == null)
			return null;

		return approval.proxies.ApprovalActionResultEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ApprovalActionResult
	 * @param approvalactionresult
	 */
	public final void setApprovalActionResult(approval.proxies.ApprovalActionResultEnum approvalactionresult)
	{
		setApprovalActionResult(getContext(), approvalactionresult);
	}

	/**
	 * Set value of ApprovalActionResult
	 * @param context
	 * @param approvalactionresult
	 */
	public final void setApprovalActionResult(com.mendix.systemwideinterfaces.core.IContext context, approval.proxies.ApprovalActionResultEnum approvalactionresult)
	{
		if (approvalactionresult != null)
			getMendixObject().setValue(context, MemberNames.ApprovalActionResult.toString(), approvalactionresult.toString());
		else
			getMendixObject().setValue(context, MemberNames.ApprovalActionResult.toString(), null);
	}

	/**
	 * @return value of ApprovalHandled
	 */
	public final java.lang.Boolean getApprovalHandled()
	{
		return getApprovalHandled(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalHandled
	 */
	public final java.lang.Boolean getApprovalHandled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ApprovalHandled.toString());
	}

	/**
	 * Set value of ApprovalHandled
	 * @param approvalhandled
	 */
	public final void setApprovalHandled(java.lang.Boolean approvalhandled)
	{
		setApprovalHandled(getContext(), approvalhandled);
	}

	/**
	 * Set value of ApprovalHandled
	 * @param context
	 * @param approvalhandled
	 */
	public final void setApprovalHandled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean approvalhandled)
	{
		getMendixObject().setValue(context, MemberNames.ApprovalHandled.toString(), approvalhandled);
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
	 * @return value of ApprovalActionSucceeded
	 */
	public final java.lang.Boolean getApprovalActionSucceeded()
	{
		return getApprovalActionSucceeded(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalActionSucceeded
	 */
	public final java.lang.Boolean getApprovalActionSucceeded(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ApprovalActionSucceeded.toString());
	}

	/**
	 * Set value of ApprovalActionSucceeded
	 * @param approvalactionsucceeded
	 */
	public final void setApprovalActionSucceeded(java.lang.Boolean approvalactionsucceeded)
	{
		setApprovalActionSucceeded(getContext(), approvalactionsucceeded);
	}

	/**
	 * Set value of ApprovalActionSucceeded
	 * @param context
	 * @param approvalactionsucceeded
	 */
	public final void setApprovalActionSucceeded(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean approvalactionsucceeded)
	{
		getMendixObject().setValue(context, MemberNames.ApprovalActionSucceeded.toString(), approvalactionsucceeded);
	}

	/**
	 * @return value of ErrorNoMailAddress
	 */
	public final java.lang.String getErrorNoMailAddress()
	{
		return getErrorNoMailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of ErrorNoMailAddress
	 */
	public final java.lang.String getErrorNoMailAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ErrorNoMailAddress.toString());
	}

	/**
	 * Set value of ErrorNoMailAddress
	 * @param errornomailaddress
	 */
	public final void setErrorNoMailAddress(java.lang.String errornomailaddress)
	{
		setErrorNoMailAddress(getContext(), errornomailaddress);
	}

	/**
	 * Set value of ErrorNoMailAddress
	 * @param context
	 * @param errornomailaddress
	 */
	public final void setErrorNoMailAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String errornomailaddress)
	{
		getMendixObject().setValue(context, MemberNames.ErrorNoMailAddress.toString(), errornomailaddress);
	}

	/**
	 * @return value of Decriptor
	 */
	public final java.lang.String getDecriptor()
	{
		return getDecriptor(getContext());
	}

	/**
	 * @param context
	 * @return value of Decriptor
	 */
	public final java.lang.String getDecriptor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Decriptor.toString());
	}

	/**
	 * Set value of Decriptor
	 * @param decriptor
	 */
	public final void setDecriptor(java.lang.String decriptor)
	{
		setDecriptor(getContext(), decriptor);
	}

	/**
	 * Set value of Decriptor
	 * @param context
	 * @param decriptor
	 */
	public final void setDecriptor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String decriptor)
	{
		getMendixObject().setValue(context, MemberNames.Decriptor.toString(), decriptor);
	}

	/**
	 * @return value of Error
	 */
	public final java.lang.Boolean getError()
	{
		return getError(getContext());
	}

	/**
	 * @param context
	 * @return value of Error
	 */
	public final java.lang.Boolean getError(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Error.toString());
	}

	/**
	 * Set value of Error
	 * @param error
	 */
	public final void setError(java.lang.Boolean error)
	{
		setError(getContext(), error);
	}

	/**
	 * Set value of Error
	 * @param context
	 * @param error
	 */
	public final void setError(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean error)
	{
		getMendixObject().setValue(context, MemberNames.Error.toString(), error);
	}

	/**
	 * @return value of ApprovalInstance_ApprovalTemplate
	 */
	public final approval.proxies.ApprovalTemplate getApprovalInstance_ApprovalTemplate() throws com.mendix.core.CoreException
	{
		return getApprovalInstance_ApprovalTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstance_ApprovalTemplate
	 */
	public final approval.proxies.ApprovalTemplate getApprovalInstance_ApprovalTemplate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		approval.proxies.ApprovalTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstance_ApprovalTemplate.toString());
		if (identifier != null)
			result = approval.proxies.ApprovalTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstance_ApprovalTemplate
	 * @param approvalinstance_approvaltemplate
	 */
	public final void setApprovalInstance_ApprovalTemplate(approval.proxies.ApprovalTemplate approvalinstance_approvaltemplate)
	{
		setApprovalInstance_ApprovalTemplate(getContext(), approvalinstance_approvaltemplate);
	}

	/**
	 * Set value of ApprovalInstance_ApprovalTemplate
	 * @param context
	 * @param approvalinstance_approvaltemplate
	 */
	public final void setApprovalInstance_ApprovalTemplate(com.mendix.systemwideinterfaces.core.IContext context, approval.proxies.ApprovalTemplate approvalinstance_approvaltemplate)
	{
		if (approvalinstance_approvaltemplate == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstance_ApprovalTemplate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstance_ApprovalTemplate.toString(), approvalinstance_approvaltemplate.getMendixObject().getId());
	}

	/**
	 * @return value of ApprovalInstance_Request
	 */
	public final process.proxies.Request getApprovalInstance_Request() throws com.mendix.core.CoreException
	{
		return getApprovalInstance_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstance_Request
	 */
	public final process.proxies.Request getApprovalInstance_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstance_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstance_Request
	 * @param approvalinstance_request
	 */
	public final void setApprovalInstance_Request(process.proxies.Request approvalinstance_request)
	{
		setApprovalInstance_Request(getContext(), approvalinstance_request);
	}

	/**
	 * Set value of ApprovalInstance_Request
	 * @param context
	 * @param approvalinstance_request
	 */
	public final void setApprovalInstance_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request approvalinstance_request)
	{
		if (approvalinstance_request == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstance_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstance_Request.toString(), approvalinstance_request.getMendixObject().getId());
	}

	/**
	 * @return value of ApprovalInstance_ShoppingCart
	 */
	public final servicecatalogue.proxies.ShoppingCart getApprovalInstance_ShoppingCart() throws com.mendix.core.CoreException
	{
		return getApprovalInstance_ShoppingCart(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstance_ShoppingCart
	 */
	public final servicecatalogue.proxies.ShoppingCart getApprovalInstance_ShoppingCart(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ShoppingCart result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstance_ShoppingCart.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ShoppingCart.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstance_ShoppingCart
	 * @param approvalinstance_shoppingcart
	 */
	public final void setApprovalInstance_ShoppingCart(servicecatalogue.proxies.ShoppingCart approvalinstance_shoppingcart)
	{
		setApprovalInstance_ShoppingCart(getContext(), approvalinstance_shoppingcart);
	}

	/**
	 * Set value of ApprovalInstance_ShoppingCart
	 * @param context
	 * @param approvalinstance_shoppingcart
	 */
	public final void setApprovalInstance_ShoppingCart(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ShoppingCart approvalinstance_shoppingcart)
	{
		if (approvalinstance_shoppingcart == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstance_ShoppingCart.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstance_ShoppingCart.toString(), approvalinstance_shoppingcart.getMendixObject().getId());
	}

	/**
	 * @return value of ApprovalInstance_ShoppingCartProduct
	 */
	public final servicecatalogue.proxies.ShoppingCartProduct getApprovalInstance_ShoppingCartProduct() throws com.mendix.core.CoreException
	{
		return getApprovalInstance_ShoppingCartProduct(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovalInstance_ShoppingCartProduct
	 */
	public final servicecatalogue.proxies.ShoppingCartProduct getApprovalInstance_ShoppingCartProduct(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ShoppingCartProduct result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ApprovalInstance_ShoppingCartProduct.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ShoppingCartProduct.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ApprovalInstance_ShoppingCartProduct
	 * @param approvalinstance_shoppingcartproduct
	 */
	public final void setApprovalInstance_ShoppingCartProduct(servicecatalogue.proxies.ShoppingCartProduct approvalinstance_shoppingcartproduct)
	{
		setApprovalInstance_ShoppingCartProduct(getContext(), approvalinstance_shoppingcartproduct);
	}

	/**
	 * Set value of ApprovalInstance_ShoppingCartProduct
	 * @param context
	 * @param approvalinstance_shoppingcartproduct
	 */
	public final void setApprovalInstance_ShoppingCartProduct(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ShoppingCartProduct approvalinstance_shoppingcartproduct)
	{
		if (approvalinstance_shoppingcartproduct == null)
			getMendixObject().setValue(context, MemberNames.ApprovalInstance_ShoppingCartProduct.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ApprovalInstance_ShoppingCartProduct.toString(), approvalinstance_shoppingcartproduct.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return approvalInstanceMendixObject;
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
			final approval.proxies.ApprovalInstance that = (approval.proxies.ApprovalInstance) obj;
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
		return "Approval.ApprovalInstance";
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
