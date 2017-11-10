// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class ProductToBeAddedAttributeItem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productToBeAddedAttributeItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.ProductToBeAddedAttributeItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ItemName("ItemName"),
		ItemPrice("ItemPrice"),
		ItemNameAndPrice("ItemNameAndPrice"),
		ProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn("ServiceCatalogue.ProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn"),
		ProductToBeAddedAttributeItem_ProductToBeAddedAttribute("ServiceCatalogue.ProductToBeAddedAttributeItem_ProductToBeAddedAttribute"),
		ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn("ServiceCatalogue.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn");

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

	public ProductToBeAddedAttributeItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.ProductToBeAddedAttributeItem"));
	}

	protected ProductToBeAddedAttributeItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productToBeAddedAttributeItemMendixObject)
	{
		if (productToBeAddedAttributeItemMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.ProductToBeAddedAttributeItem", productToBeAddedAttributeItemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.ProductToBeAddedAttributeItem");

		this.productToBeAddedAttributeItemMendixObject = productToBeAddedAttributeItemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProductToBeAddedAttributeItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.ProductToBeAddedAttributeItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.ProductToBeAddedAttributeItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.ProductToBeAddedAttributeItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.ProductToBeAddedAttributeItem(context, mendixObject);
	}

	public static servicecatalogue.proxies.ProductToBeAddedAttributeItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.ProductToBeAddedAttributeItem.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.ProductToBeAddedAttributeItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductToBeAddedAttributeItem> result = new java.util.ArrayList<servicecatalogue.proxies.ProductToBeAddedAttributeItem>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.ProductToBeAddedAttributeItem" + xpathConstraint))
			result.add(servicecatalogue.proxies.ProductToBeAddedAttributeItem.initialize(context, obj));
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
	 * @return value of ItemName
	 */
	public final java.lang.String getItemName()
	{
		return getItemName(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemName
	 */
	public final java.lang.String getItemName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemName.toString());
	}

	/**
	 * Set value of ItemName
	 * @param itemname
	 */
	public final void setItemName(java.lang.String itemname)
	{
		setItemName(getContext(), itemname);
	}

	/**
	 * Set value of ItemName
	 * @param context
	 * @param itemname
	 */
	public final void setItemName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itemname)
	{
		getMendixObject().setValue(context, MemberNames.ItemName.toString(), itemname);
	}

	/**
	 * @return value of ItemPrice
	 */
	public final java.math.BigDecimal getItemPrice()
	{
		return getItemPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemPrice
	 */
	public final java.math.BigDecimal getItemPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.ItemPrice.toString());
	}

	/**
	 * Set value of ItemPrice
	 * @param itemprice
	 */
	public final void setItemPrice(java.math.BigDecimal itemprice)
	{
		setItemPrice(getContext(), itemprice);
	}

	/**
	 * Set value of ItemPrice
	 * @param context
	 * @param itemprice
	 */
	public final void setItemPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal itemprice)
	{
		getMendixObject().setValue(context, MemberNames.ItemPrice.toString(), itemprice);
	}

	/**
	 * @return value of ItemNameAndPrice
	 */
	public final java.lang.String getItemNameAndPrice()
	{
		return getItemNameAndPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemNameAndPrice
	 */
	public final java.lang.String getItemNameAndPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemNameAndPrice.toString());
	}

	/**
	 * Set value of ItemNameAndPrice
	 * @param itemnameandprice
	 */
	public final void setItemNameAndPrice(java.lang.String itemnameandprice)
	{
		setItemNameAndPrice(getContext(), itemnameandprice);
	}

	/**
	 * Set value of ItemNameAndPrice
	 * @param context
	 * @param itemnameandprice
	 */
	public final void setItemNameAndPrice(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itemnameandprice)
	{
		getMendixObject().setValue(context, MemberNames.ItemNameAndPrice.toString(), itemnameandprice);
	}

	/**
	 * @return value of ProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttribute getProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn() throws com.mendix.core.CoreException
	{
		return getProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttribute getProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ProductToBeAddedAttribute result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ProductToBeAddedAttribute.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn
	 * @param producttobeaddedattributeitem_producttobeaddedattribute_radiobtn
	 */
	public final void setProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn(servicecatalogue.proxies.ProductToBeAddedAttribute producttobeaddedattributeitem_producttobeaddedattribute_radiobtn)
	{
		setProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn(getContext(), producttobeaddedattributeitem_producttobeaddedattribute_radiobtn);
	}

	/**
	 * Set value of ProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn
	 * @param context
	 * @param producttobeaddedattributeitem_producttobeaddedattribute_radiobtn
	 */
	public final void setProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ProductToBeAddedAttribute producttobeaddedattributeitem_producttobeaddedattribute_radiobtn)
	{
		if (producttobeaddedattributeitem_producttobeaddedattribute_radiobtn == null)
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttributeItem_ProductToBeAddedAttribute_RadioBtn.toString(), producttobeaddedattributeitem_producttobeaddedattribute_radiobtn.getMendixObject().getId());
	}

	/**
	 * @return value of ProductToBeAddedAttributeItem_ProductToBeAddedAttribute
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttribute getProductToBeAddedAttributeItem_ProductToBeAddedAttribute() throws com.mendix.core.CoreException
	{
		return getProductToBeAddedAttributeItem_ProductToBeAddedAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductToBeAddedAttributeItem_ProductToBeAddedAttribute
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttribute getProductToBeAddedAttributeItem_ProductToBeAddedAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ProductToBeAddedAttribute result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductToBeAddedAttributeItem_ProductToBeAddedAttribute.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ProductToBeAddedAttribute.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductToBeAddedAttributeItem_ProductToBeAddedAttribute
	 * @param producttobeaddedattributeitem_producttobeaddedattribute
	 */
	public final void setProductToBeAddedAttributeItem_ProductToBeAddedAttribute(servicecatalogue.proxies.ProductToBeAddedAttribute producttobeaddedattributeitem_producttobeaddedattribute)
	{
		setProductToBeAddedAttributeItem_ProductToBeAddedAttribute(getContext(), producttobeaddedattributeitem_producttobeaddedattribute);
	}

	/**
	 * Set value of ProductToBeAddedAttributeItem_ProductToBeAddedAttribute
	 * @param context
	 * @param producttobeaddedattributeitem_producttobeaddedattribute
	 */
	public final void setProductToBeAddedAttributeItem_ProductToBeAddedAttribute(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ProductToBeAddedAttribute producttobeaddedattributeitem_producttobeaddedattribute)
	{
		if (producttobeaddedattributeitem_producttobeaddedattribute == null)
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttributeItem_ProductToBeAddedAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttributeItem_ProductToBeAddedAttribute.toString(), producttobeaddedattributeitem_producttobeaddedattribute.getMendixObject().getId());
	}

	/**
	 * @return value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttribute getProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn() throws com.mendix.core.CoreException
	{
		return getProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttribute getProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ProductToBeAddedAttribute result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ProductToBeAddedAttribute.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn
	 * @param producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn
	 */
	public final void setProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(servicecatalogue.proxies.ProductToBeAddedAttribute producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn)
	{
		setProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(getContext(), producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn);
	}

	/**
	 * Set value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn
	 * @param context
	 * @param producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn
	 */
	public final void setProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ProductToBeAddedAttribute producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn)
	{
		if (producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn == null)
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn.toString(), producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productToBeAddedAttributeItemMendixObject;
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
			final servicecatalogue.proxies.ProductToBeAddedAttributeItem that = (servicecatalogue.proxies.ProductToBeAddedAttributeItem) obj;
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
		return "ServiceCatalogue.ProductToBeAddedAttributeItem";
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
