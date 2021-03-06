// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package billing.proxies;

public class TotalRequestCost
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject totalRequestCostMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Billing.TotalRequestCost";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		InvoiceableCostTotal("InvoiceableCostTotal"),
		NonInvoiceableCostTotal("NonInvoiceableCostTotal"),
		PercentageInvoiceableCostTotal("PercentageInvoiceableCostTotal"),
		PercentageNonInvoiceableCostTotal("PercentageNonInvoiceableCostTotal"),
		TotalRequestCost("TotalRequestCost"),
		TotalRequestCost_Request("Billing.TotalRequestCost_Request");

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

	public TotalRequestCost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Billing.TotalRequestCost"));
	}

	protected TotalRequestCost(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject totalRequestCostMendixObject)
	{
		if (totalRequestCostMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Billing.TotalRequestCost", totalRequestCostMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Billing.TotalRequestCost");

		this.totalRequestCostMendixObject = totalRequestCostMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TotalRequestCost.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static billing.proxies.TotalRequestCost initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return billing.proxies.TotalRequestCost.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static billing.proxies.TotalRequestCost initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new billing.proxies.TotalRequestCost(context, mendixObject);
	}

	public static billing.proxies.TotalRequestCost load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return billing.proxies.TotalRequestCost.initialize(context, mendixObject);
	}

	public static java.util.List<billing.proxies.TotalRequestCost> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<billing.proxies.TotalRequestCost> result = new java.util.ArrayList<billing.proxies.TotalRequestCost>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Billing.TotalRequestCost" + xpathConstraint))
			result.add(billing.proxies.TotalRequestCost.initialize(context, obj));
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
	 * @return value of InvoiceableCostTotal
	 */
	public final java.math.BigDecimal getInvoiceableCostTotal()
	{
		return getInvoiceableCostTotal(getContext());
	}

	/**
	 * @param context
	 * @return value of InvoiceableCostTotal
	 */
	public final java.math.BigDecimal getInvoiceableCostTotal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.InvoiceableCostTotal.toString());
	}

	/**
	 * Set value of InvoiceableCostTotal
	 * @param invoiceablecosttotal
	 */
	public final void setInvoiceableCostTotal(java.math.BigDecimal invoiceablecosttotal)
	{
		setInvoiceableCostTotal(getContext(), invoiceablecosttotal);
	}

	/**
	 * Set value of InvoiceableCostTotal
	 * @param context
	 * @param invoiceablecosttotal
	 */
	public final void setInvoiceableCostTotal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal invoiceablecosttotal)
	{
		getMendixObject().setValue(context, MemberNames.InvoiceableCostTotal.toString(), invoiceablecosttotal);
	}

	/**
	 * @return value of NonInvoiceableCostTotal
	 */
	public final java.math.BigDecimal getNonInvoiceableCostTotal()
	{
		return getNonInvoiceableCostTotal(getContext());
	}

	/**
	 * @param context
	 * @return value of NonInvoiceableCostTotal
	 */
	public final java.math.BigDecimal getNonInvoiceableCostTotal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.NonInvoiceableCostTotal.toString());
	}

	/**
	 * Set value of NonInvoiceableCostTotal
	 * @param noninvoiceablecosttotal
	 */
	public final void setNonInvoiceableCostTotal(java.math.BigDecimal noninvoiceablecosttotal)
	{
		setNonInvoiceableCostTotal(getContext(), noninvoiceablecosttotal);
	}

	/**
	 * Set value of NonInvoiceableCostTotal
	 * @param context
	 * @param noninvoiceablecosttotal
	 */
	public final void setNonInvoiceableCostTotal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal noninvoiceablecosttotal)
	{
		getMendixObject().setValue(context, MemberNames.NonInvoiceableCostTotal.toString(), noninvoiceablecosttotal);
	}

	/**
	 * @return value of PercentageInvoiceableCostTotal
	 */
	public final java.lang.String getPercentageInvoiceableCostTotal()
	{
		return getPercentageInvoiceableCostTotal(getContext());
	}

	/**
	 * @param context
	 * @return value of PercentageInvoiceableCostTotal
	 */
	public final java.lang.String getPercentageInvoiceableCostTotal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PercentageInvoiceableCostTotal.toString());
	}

	/**
	 * Set value of PercentageInvoiceableCostTotal
	 * @param percentageinvoiceablecosttotal
	 */
	public final void setPercentageInvoiceableCostTotal(java.lang.String percentageinvoiceablecosttotal)
	{
		setPercentageInvoiceableCostTotal(getContext(), percentageinvoiceablecosttotal);
	}

	/**
	 * Set value of PercentageInvoiceableCostTotal
	 * @param context
	 * @param percentageinvoiceablecosttotal
	 */
	public final void setPercentageInvoiceableCostTotal(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String percentageinvoiceablecosttotal)
	{
		getMendixObject().setValue(context, MemberNames.PercentageInvoiceableCostTotal.toString(), percentageinvoiceablecosttotal);
	}

	/**
	 * @return value of PercentageNonInvoiceableCostTotal
	 */
	public final java.lang.String getPercentageNonInvoiceableCostTotal()
	{
		return getPercentageNonInvoiceableCostTotal(getContext());
	}

	/**
	 * @param context
	 * @return value of PercentageNonInvoiceableCostTotal
	 */
	public final java.lang.String getPercentageNonInvoiceableCostTotal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PercentageNonInvoiceableCostTotal.toString());
	}

	/**
	 * Set value of PercentageNonInvoiceableCostTotal
	 * @param percentagenoninvoiceablecosttotal
	 */
	public final void setPercentageNonInvoiceableCostTotal(java.lang.String percentagenoninvoiceablecosttotal)
	{
		setPercentageNonInvoiceableCostTotal(getContext(), percentagenoninvoiceablecosttotal);
	}

	/**
	 * Set value of PercentageNonInvoiceableCostTotal
	 * @param context
	 * @param percentagenoninvoiceablecosttotal
	 */
	public final void setPercentageNonInvoiceableCostTotal(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String percentagenoninvoiceablecosttotal)
	{
		getMendixObject().setValue(context, MemberNames.PercentageNonInvoiceableCostTotal.toString(), percentagenoninvoiceablecosttotal);
	}

	/**
	 * @return value of TotalRequestCost
	 */
	public final java.math.BigDecimal getTotalRequestCost()
	{
		return getTotalRequestCost(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalRequestCost
	 */
	public final java.math.BigDecimal getTotalRequestCost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TotalRequestCost.toString());
	}

	/**
	 * Set value of TotalRequestCost
	 * @param totalrequestcost
	 */
	public final void setTotalRequestCost(java.math.BigDecimal totalrequestcost)
	{
		setTotalRequestCost(getContext(), totalrequestcost);
	}

	/**
	 * Set value of TotalRequestCost
	 * @param context
	 * @param totalrequestcost
	 */
	public final void setTotalRequestCost(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal totalrequestcost)
	{
		getMendixObject().setValue(context, MemberNames.TotalRequestCost.toString(), totalrequestcost);
	}

	/**
	 * @return value of TotalRequestCost_Request
	 */
	public final process.proxies.Request getTotalRequestCost_Request() throws com.mendix.core.CoreException
	{
		return getTotalRequestCost_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalRequestCost_Request
	 */
	public final process.proxies.Request getTotalRequestCost_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TotalRequestCost_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TotalRequestCost_Request
	 * @param totalrequestcost_request
	 */
	public final void setTotalRequestCost_Request(process.proxies.Request totalrequestcost_request)
	{
		setTotalRequestCost_Request(getContext(), totalrequestcost_request);
	}

	/**
	 * Set value of TotalRequestCost_Request
	 * @param context
	 * @param totalrequestcost_request
	 */
	public final void setTotalRequestCost_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request totalrequestcost_request)
	{
		if (totalrequestcost_request == null)
			getMendixObject().setValue(context, MemberNames.TotalRequestCost_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TotalRequestCost_Request.toString(), totalrequestcost_request.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return totalRequestCostMendixObject;
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
			final billing.proxies.TotalRequestCost that = (billing.proxies.TotalRequestCost) obj;
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
		return "Billing.TotalRequestCost";
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
