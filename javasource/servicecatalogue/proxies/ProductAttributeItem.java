// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class ProductAttributeItem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productAttributeItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.ProductAttributeItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ItemName("ItemName"),
		ItemPrice("ItemPrice"),
		Shared("Shared"),
		ProductAttributeItem_OptionalProduct("ServiceCatalogue.ProductAttributeItem_OptionalProduct");

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

	public ProductAttributeItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.ProductAttributeItem"));
	}

	protected ProductAttributeItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productAttributeItemMendixObject)
	{
		if (productAttributeItemMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.ProductAttributeItem", productAttributeItemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.ProductAttributeItem");

		this.productAttributeItemMendixObject = productAttributeItemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProductAttributeItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.ProductAttributeItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.ProductAttributeItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.ProductAttributeItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.ProductAttributeItem(context, mendixObject);
	}

	public static servicecatalogue.proxies.ProductAttributeItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.ProductAttributeItem.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.ProductAttributeItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductAttributeItem> result = new java.util.ArrayList<servicecatalogue.proxies.ProductAttributeItem>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.ProductAttributeItem" + xpathConstraint))
			result.add(servicecatalogue.proxies.ProductAttributeItem.initialize(context, obj));
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
	 * @return value of Shared
	 */
	public final java.lang.Boolean getShared()
	{
		return getShared(getContext());
	}

	/**
	 * @param context
	 * @return value of Shared
	 */
	public final java.lang.Boolean getShared(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Shared.toString());
	}

	/**
	 * Set value of Shared
	 * @param shared
	 */
	public final void setShared(java.lang.Boolean shared)
	{
		setShared(getContext(), shared);
	}

	/**
	 * Set value of Shared
	 * @param context
	 * @param shared
	 */
	public final void setShared(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean shared)
	{
		getMendixObject().setValue(context, MemberNames.Shared.toString(), shared);
	}

	/**
	 * @return value of ProductAttributeItem_OptionalProduct
	 */
	public final servicecatalogue.proxies.Product getProductAttributeItem_OptionalProduct() throws com.mendix.core.CoreException
	{
		return getProductAttributeItem_OptionalProduct(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductAttributeItem_OptionalProduct
	 */
	public final servicecatalogue.proxies.Product getProductAttributeItem_OptionalProduct(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductAttributeItem_OptionalProduct.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductAttributeItem_OptionalProduct
	 * @param productattributeitem_optionalproduct
	 */
	public final void setProductAttributeItem_OptionalProduct(servicecatalogue.proxies.Product productattributeitem_optionalproduct)
	{
		setProductAttributeItem_OptionalProduct(getContext(), productattributeitem_optionalproduct);
	}

	/**
	 * Set value of ProductAttributeItem_OptionalProduct
	 * @param context
	 * @param productattributeitem_optionalproduct
	 */
	public final void setProductAttributeItem_OptionalProduct(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.Product productattributeitem_optionalproduct)
	{
		if (productattributeitem_optionalproduct == null)
			getMendixObject().setValue(context, MemberNames.ProductAttributeItem_OptionalProduct.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductAttributeItem_OptionalProduct.toString(), productattributeitem_optionalproduct.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productAttributeItemMendixObject;
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
			final servicecatalogue.proxies.ProductAttributeItem that = (servicecatalogue.proxies.ProductAttributeItem) obj;
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
		return "ServiceCatalogue.ProductAttributeItem";
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
