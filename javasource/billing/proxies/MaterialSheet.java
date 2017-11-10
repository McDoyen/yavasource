// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package billing.proxies;

public class MaterialSheet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject materialSheetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Billing.MaterialSheet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Amount("Amount"),
		Price("Price"),
		TotalPriceSheet("TotalPriceSheet"),
		PricePer("PricePer"),
		Invoice("Invoice"),
		Discount("Discount"),
		EnableDiscount("EnableDiscount"),
		CostCenterCode("CostCenterCode"),
		CostCenterName("CostCenterName"),
		MaterialSheet_Billingsheet("Billing.MaterialSheet_Billingsheet"),
		MaterialSheet_Material("Billing.MaterialSheet_Material"),
		MaterialSheet_CostCenter("Billing.MaterialSheet_CostCenter");

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

	public MaterialSheet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Billing.MaterialSheet"));
	}

	protected MaterialSheet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject materialSheetMendixObject)
	{
		if (materialSheetMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Billing.MaterialSheet", materialSheetMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Billing.MaterialSheet");

		this.materialSheetMendixObject = materialSheetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MaterialSheet.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static billing.proxies.MaterialSheet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return billing.proxies.MaterialSheet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static billing.proxies.MaterialSheet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new billing.proxies.MaterialSheet(context, mendixObject);
	}

	public static billing.proxies.MaterialSheet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return billing.proxies.MaterialSheet.initialize(context, mendixObject);
	}

	public static java.util.List<billing.proxies.MaterialSheet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<billing.proxies.MaterialSheet> result = new java.util.ArrayList<billing.proxies.MaterialSheet>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Billing.MaterialSheet" + xpathConstraint))
			result.add(billing.proxies.MaterialSheet.initialize(context, obj));
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
	 * @return value of Amount
	 */
	public final java.lang.Double getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.lang.Double getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.lang.Double amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice()
	{
		return getPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Price.toString());
	}

	/**
	 * Set value of Price
	 * @param price
	 */
	public final void setPrice(java.math.BigDecimal price)
	{
		setPrice(getContext(), price);
	}

	/**
	 * Set value of Price
	 * @param context
	 * @param price
	 */
	public final void setPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal price)
	{
		getMendixObject().setValue(context, MemberNames.Price.toString(), price);
	}

	/**
	 * @return value of TotalPriceSheet
	 */
	public final java.math.BigDecimal getTotalPriceSheet()
	{
		return getTotalPriceSheet(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalPriceSheet
	 */
	public final java.math.BigDecimal getTotalPriceSheet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TotalPriceSheet.toString());
	}

	/**
	 * Set value of TotalPriceSheet
	 * @param totalpricesheet
	 */
	public final void setTotalPriceSheet(java.math.BigDecimal totalpricesheet)
	{
		setTotalPriceSheet(getContext(), totalpricesheet);
	}

	/**
	 * Set value of TotalPriceSheet
	 * @param context
	 * @param totalpricesheet
	 */
	public final void setTotalPriceSheet(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal totalpricesheet)
	{
		getMendixObject().setValue(context, MemberNames.TotalPriceSheet.toString(), totalpricesheet);
	}

	/**
	 * Set value of PricePer
	 * @param priceper
	 */
	public final billing.proxies.PricePer getPricePer()
	{
		return getPricePer(getContext());
	}

	/**
	 * @param context
	 * @return value of PricePer
	 */
	public final billing.proxies.PricePer getPricePer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.PricePer.toString());
		if (obj == null)
			return null;

		return billing.proxies.PricePer.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of PricePer
	 * @param priceper
	 */
	public final void setPricePer(billing.proxies.PricePer priceper)
	{
		setPricePer(getContext(), priceper);
	}

	/**
	 * Set value of PricePer
	 * @param context
	 * @param priceper
	 */
	public final void setPricePer(com.mendix.systemwideinterfaces.core.IContext context, billing.proxies.PricePer priceper)
	{
		if (priceper != null)
			getMendixObject().setValue(context, MemberNames.PricePer.toString(), priceper.toString());
		else
			getMendixObject().setValue(context, MemberNames.PricePer.toString(), null);
	}

	/**
	 * @return value of Invoice
	 */
	public final java.lang.Boolean getInvoice()
	{
		return getInvoice(getContext());
	}

	/**
	 * @param context
	 * @return value of Invoice
	 */
	public final java.lang.Boolean getInvoice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Invoice.toString());
	}

	/**
	 * Set value of Invoice
	 * @param invoice
	 */
	public final void setInvoice(java.lang.Boolean invoice)
	{
		setInvoice(getContext(), invoice);
	}

	/**
	 * Set value of Invoice
	 * @param context
	 * @param invoice
	 */
	public final void setInvoice(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean invoice)
	{
		getMendixObject().setValue(context, MemberNames.Invoice.toString(), invoice);
	}

	/**
	 * @return value of Discount
	 */
	public final java.lang.Double getDiscount()
	{
		return getDiscount(getContext());
	}

	/**
	 * @param context
	 * @return value of Discount
	 */
	public final java.lang.Double getDiscount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.Discount.toString());
	}

	/**
	 * Set value of Discount
	 * @param discount
	 */
	public final void setDiscount(java.lang.Double discount)
	{
		setDiscount(getContext(), discount);
	}

	/**
	 * Set value of Discount
	 * @param context
	 * @param discount
	 */
	public final void setDiscount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double discount)
	{
		getMendixObject().setValue(context, MemberNames.Discount.toString(), discount);
	}

	/**
	 * @return value of EnableDiscount
	 */
	public final java.lang.Boolean getEnableDiscount()
	{
		return getEnableDiscount(getContext());
	}

	/**
	 * @param context
	 * @return value of EnableDiscount
	 */
	public final java.lang.Boolean getEnableDiscount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.EnableDiscount.toString());
	}

	/**
	 * Set value of EnableDiscount
	 * @param enablediscount
	 */
	public final void setEnableDiscount(java.lang.Boolean enablediscount)
	{
		setEnableDiscount(getContext(), enablediscount);
	}

	/**
	 * Set value of EnableDiscount
	 * @param context
	 * @param enablediscount
	 */
	public final void setEnableDiscount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean enablediscount)
	{
		getMendixObject().setValue(context, MemberNames.EnableDiscount.toString(), enablediscount);
	}

	/**
	 * @return value of CostCenterCode
	 */
	public final java.lang.String getCostCenterCode()
	{
		return getCostCenterCode(getContext());
	}

	/**
	 * @param context
	 * @return value of CostCenterCode
	 */
	public final java.lang.String getCostCenterCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CostCenterCode.toString());
	}

	/**
	 * Set value of CostCenterCode
	 * @param costcentercode
	 */
	public final void setCostCenterCode(java.lang.String costcentercode)
	{
		setCostCenterCode(getContext(), costcentercode);
	}

	/**
	 * Set value of CostCenterCode
	 * @param context
	 * @param costcentercode
	 */
	public final void setCostCenterCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String costcentercode)
	{
		getMendixObject().setValue(context, MemberNames.CostCenterCode.toString(), costcentercode);
	}

	/**
	 * @return value of CostCenterName
	 */
	public final java.lang.String getCostCenterName()
	{
		return getCostCenterName(getContext());
	}

	/**
	 * @param context
	 * @return value of CostCenterName
	 */
	public final java.lang.String getCostCenterName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CostCenterName.toString());
	}

	/**
	 * Set value of CostCenterName
	 * @param costcentername
	 */
	public final void setCostCenterName(java.lang.String costcentername)
	{
		setCostCenterName(getContext(), costcentername);
	}

	/**
	 * Set value of CostCenterName
	 * @param context
	 * @param costcentername
	 */
	public final void setCostCenterName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String costcentername)
	{
		getMendixObject().setValue(context, MemberNames.CostCenterName.toString(), costcentername);
	}

	/**
	 * @return value of MaterialSheet_Billingsheet
	 */
	public final billing.proxies.Billingsheet getMaterialSheet_Billingsheet() throws com.mendix.core.CoreException
	{
		return getMaterialSheet_Billingsheet(getContext());
	}

	/**
	 * @param context
	 * @return value of MaterialSheet_Billingsheet
	 */
	public final billing.proxies.Billingsheet getMaterialSheet_Billingsheet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		billing.proxies.Billingsheet result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MaterialSheet_Billingsheet.toString());
		if (identifier != null)
			result = billing.proxies.Billingsheet.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MaterialSheet_Billingsheet
	 * @param materialsheet_billingsheet
	 */
	public final void setMaterialSheet_Billingsheet(billing.proxies.Billingsheet materialsheet_billingsheet)
	{
		setMaterialSheet_Billingsheet(getContext(), materialsheet_billingsheet);
	}

	/**
	 * Set value of MaterialSheet_Billingsheet
	 * @param context
	 * @param materialsheet_billingsheet
	 */
	public final void setMaterialSheet_Billingsheet(com.mendix.systemwideinterfaces.core.IContext context, billing.proxies.Billingsheet materialsheet_billingsheet)
	{
		if (materialsheet_billingsheet == null)
			getMendixObject().setValue(context, MemberNames.MaterialSheet_Billingsheet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MaterialSheet_Billingsheet.toString(), materialsheet_billingsheet.getMendixObject().getId());
	}

	/**
	 * @return value of MaterialSheet_Material
	 */
	public final billing.proxies.Material getMaterialSheet_Material() throws com.mendix.core.CoreException
	{
		return getMaterialSheet_Material(getContext());
	}

	/**
	 * @param context
	 * @return value of MaterialSheet_Material
	 */
	public final billing.proxies.Material getMaterialSheet_Material(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		billing.proxies.Material result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MaterialSheet_Material.toString());
		if (identifier != null)
			result = billing.proxies.Material.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MaterialSheet_Material
	 * @param materialsheet_material
	 */
	public final void setMaterialSheet_Material(billing.proxies.Material materialsheet_material)
	{
		setMaterialSheet_Material(getContext(), materialsheet_material);
	}

	/**
	 * Set value of MaterialSheet_Material
	 * @param context
	 * @param materialsheet_material
	 */
	public final void setMaterialSheet_Material(com.mendix.systemwideinterfaces.core.IContext context, billing.proxies.Material materialsheet_material)
	{
		if (materialsheet_material == null)
			getMendixObject().setValue(context, MemberNames.MaterialSheet_Material.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MaterialSheet_Material.toString(), materialsheet_material.getMendixObject().getId());
	}

	/**
	 * @return value of MaterialSheet_CostCenter
	 */
	public final billing.proxies.CostCenter getMaterialSheet_CostCenter() throws com.mendix.core.CoreException
	{
		return getMaterialSheet_CostCenter(getContext());
	}

	/**
	 * @param context
	 * @return value of MaterialSheet_CostCenter
	 */
	public final billing.proxies.CostCenter getMaterialSheet_CostCenter(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		billing.proxies.CostCenter result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MaterialSheet_CostCenter.toString());
		if (identifier != null)
			result = billing.proxies.CostCenter.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MaterialSheet_CostCenter
	 * @param materialsheet_costcenter
	 */
	public final void setMaterialSheet_CostCenter(billing.proxies.CostCenter materialsheet_costcenter)
	{
		setMaterialSheet_CostCenter(getContext(), materialsheet_costcenter);
	}

	/**
	 * Set value of MaterialSheet_CostCenter
	 * @param context
	 * @param materialsheet_costcenter
	 */
	public final void setMaterialSheet_CostCenter(com.mendix.systemwideinterfaces.core.IContext context, billing.proxies.CostCenter materialsheet_costcenter)
	{
		if (materialsheet_costcenter == null)
			getMendixObject().setValue(context, MemberNames.MaterialSheet_CostCenter.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MaterialSheet_CostCenter.toString(), materialsheet_costcenter.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return materialSheetMendixObject;
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
			final billing.proxies.MaterialSheet that = (billing.proxies.MaterialSheet) obj;
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
		return "Billing.MaterialSheet";
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
