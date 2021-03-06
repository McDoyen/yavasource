// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package billing.proxies;

public class Billingsheet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject billingsheetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Billing.Billingsheet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		BillingsheetNumber("BillingsheetNumber"),
		TotalPrice("TotalPrice"),
		ToBeInvoiced("ToBeInvoiced"),
		NonInvoiceableCosts("NonInvoiceableCosts"),
		PercentageInvoiceable("PercentageInvoiceable"),
		PercentageNonInvoiceable("PercentageNonInvoiceable"),
		IsTicket("IsTicket"),
		Billingsheet_Request("Billing.Billingsheet_Request");

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

	public Billingsheet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Billing.Billingsheet"));
	}

	protected Billingsheet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject billingsheetMendixObject)
	{
		if (billingsheetMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Billing.Billingsheet", billingsheetMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Billing.Billingsheet");

		this.billingsheetMendixObject = billingsheetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Billingsheet.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static billing.proxies.Billingsheet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return billing.proxies.Billingsheet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static billing.proxies.Billingsheet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new billing.proxies.Billingsheet(context, mendixObject);
	}

	public static billing.proxies.Billingsheet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return billing.proxies.Billingsheet.initialize(context, mendixObject);
	}

	public static java.util.List<billing.proxies.Billingsheet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<billing.proxies.Billingsheet> result = new java.util.ArrayList<billing.proxies.Billingsheet>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Billing.Billingsheet" + xpathConstraint))
			result.add(billing.proxies.Billingsheet.initialize(context, obj));
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
	 * @return value of BillingsheetNumber
	 */
	public final java.lang.Long getBillingsheetNumber()
	{
		return getBillingsheetNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of BillingsheetNumber
	 */
	public final java.lang.Long getBillingsheetNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.BillingsheetNumber.toString());
	}

	/**
	 * Set value of BillingsheetNumber
	 * @param billingsheetnumber
	 */
	public final void setBillingsheetNumber(java.lang.Long billingsheetnumber)
	{
		setBillingsheetNumber(getContext(), billingsheetnumber);
	}

	/**
	 * Set value of BillingsheetNumber
	 * @param context
	 * @param billingsheetnumber
	 */
	public final void setBillingsheetNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long billingsheetnumber)
	{
		getMendixObject().setValue(context, MemberNames.BillingsheetNumber.toString(), billingsheetnumber);
	}

	/**
	 * @return value of TotalPrice
	 */
	public final java.math.BigDecimal getTotalPrice()
	{
		return getTotalPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalPrice
	 */
	public final java.math.BigDecimal getTotalPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TotalPrice.toString());
	}

	/**
	 * Set value of TotalPrice
	 * @param totalprice
	 */
	public final void setTotalPrice(java.math.BigDecimal totalprice)
	{
		setTotalPrice(getContext(), totalprice);
	}

	/**
	 * Set value of TotalPrice
	 * @param context
	 * @param totalprice
	 */
	public final void setTotalPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal totalprice)
	{
		getMendixObject().setValue(context, MemberNames.TotalPrice.toString(), totalprice);
	}

	/**
	 * @return value of ToBeInvoiced
	 */
	public final java.math.BigDecimal getToBeInvoiced()
	{
		return getToBeInvoiced(getContext());
	}

	/**
	 * @param context
	 * @return value of ToBeInvoiced
	 */
	public final java.math.BigDecimal getToBeInvoiced(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.ToBeInvoiced.toString());
	}

	/**
	 * Set value of ToBeInvoiced
	 * @param tobeinvoiced
	 */
	public final void setToBeInvoiced(java.math.BigDecimal tobeinvoiced)
	{
		setToBeInvoiced(getContext(), tobeinvoiced);
	}

	/**
	 * Set value of ToBeInvoiced
	 * @param context
	 * @param tobeinvoiced
	 */
	public final void setToBeInvoiced(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal tobeinvoiced)
	{
		getMendixObject().setValue(context, MemberNames.ToBeInvoiced.toString(), tobeinvoiced);
	}

	/**
	 * @return value of NonInvoiceableCosts
	 */
	public final java.math.BigDecimal getNonInvoiceableCosts()
	{
		return getNonInvoiceableCosts(getContext());
	}

	/**
	 * @param context
	 * @return value of NonInvoiceableCosts
	 */
	public final java.math.BigDecimal getNonInvoiceableCosts(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.NonInvoiceableCosts.toString());
	}

	/**
	 * Set value of NonInvoiceableCosts
	 * @param noninvoiceablecosts
	 */
	public final void setNonInvoiceableCosts(java.math.BigDecimal noninvoiceablecosts)
	{
		setNonInvoiceableCosts(getContext(), noninvoiceablecosts);
	}

	/**
	 * Set value of NonInvoiceableCosts
	 * @param context
	 * @param noninvoiceablecosts
	 */
	public final void setNonInvoiceableCosts(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal noninvoiceablecosts)
	{
		getMendixObject().setValue(context, MemberNames.NonInvoiceableCosts.toString(), noninvoiceablecosts);
	}

	/**
	 * @return value of PercentageInvoiceable
	 */
	public final java.lang.String getPercentageInvoiceable()
	{
		return getPercentageInvoiceable(getContext());
	}

	/**
	 * @param context
	 * @return value of PercentageInvoiceable
	 */
	public final java.lang.String getPercentageInvoiceable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PercentageInvoiceable.toString());
	}

	/**
	 * Set value of PercentageInvoiceable
	 * @param percentageinvoiceable
	 */
	public final void setPercentageInvoiceable(java.lang.String percentageinvoiceable)
	{
		setPercentageInvoiceable(getContext(), percentageinvoiceable);
	}

	/**
	 * Set value of PercentageInvoiceable
	 * @param context
	 * @param percentageinvoiceable
	 */
	public final void setPercentageInvoiceable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String percentageinvoiceable)
	{
		getMendixObject().setValue(context, MemberNames.PercentageInvoiceable.toString(), percentageinvoiceable);
	}

	/**
	 * @return value of PercentageNonInvoiceable
	 */
	public final java.lang.String getPercentageNonInvoiceable()
	{
		return getPercentageNonInvoiceable(getContext());
	}

	/**
	 * @param context
	 * @return value of PercentageNonInvoiceable
	 */
	public final java.lang.String getPercentageNonInvoiceable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PercentageNonInvoiceable.toString());
	}

	/**
	 * Set value of PercentageNonInvoiceable
	 * @param percentagenoninvoiceable
	 */
	public final void setPercentageNonInvoiceable(java.lang.String percentagenoninvoiceable)
	{
		setPercentageNonInvoiceable(getContext(), percentagenoninvoiceable);
	}

	/**
	 * Set value of PercentageNonInvoiceable
	 * @param context
	 * @param percentagenoninvoiceable
	 */
	public final void setPercentageNonInvoiceable(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String percentagenoninvoiceable)
	{
		getMendixObject().setValue(context, MemberNames.PercentageNonInvoiceable.toString(), percentagenoninvoiceable);
	}

	/**
	 * @return value of IsTicket
	 */
	public final java.lang.Boolean getIsTicket()
	{
		return getIsTicket(getContext());
	}

	/**
	 * @param context
	 * @return value of IsTicket
	 */
	public final java.lang.Boolean getIsTicket(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsTicket.toString());
	}

	/**
	 * Set value of IsTicket
	 * @param isticket
	 */
	public final void setIsTicket(java.lang.Boolean isticket)
	{
		setIsTicket(getContext(), isticket);
	}

	/**
	 * Set value of IsTicket
	 * @param context
	 * @param isticket
	 */
	public final void setIsTicket(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isticket)
	{
		getMendixObject().setValue(context, MemberNames.IsTicket.toString(), isticket);
	}

	/**
	 * @return value of Billingsheet_Request
	 */
	public final process.proxies.Request getBillingsheet_Request() throws com.mendix.core.CoreException
	{
		return getBillingsheet_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of Billingsheet_Request
	 */
	public final process.proxies.Request getBillingsheet_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Billingsheet_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Billingsheet_Request
	 * @param billingsheet_request
	 */
	public final void setBillingsheet_Request(process.proxies.Request billingsheet_request)
	{
		setBillingsheet_Request(getContext(), billingsheet_request);
	}

	/**
	 * Set value of Billingsheet_Request
	 * @param context
	 * @param billingsheet_request
	 */
	public final void setBillingsheet_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request billingsheet_request)
	{
		if (billingsheet_request == null)
			getMendixObject().setValue(context, MemberNames.Billingsheet_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Billingsheet_Request.toString(), billingsheet_request.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return billingsheetMendixObject;
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
			final billing.proxies.Billingsheet that = (billing.proxies.Billingsheet) obj;
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
		return "Billing.Billingsheet";
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
