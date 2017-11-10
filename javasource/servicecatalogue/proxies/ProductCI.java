// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class ProductCI
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productCIMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.ProductCI";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CILinkedToProduct_Attribute_Item("CILinkedToProduct_Attribute_Item"),
		IsCatalog("IsCatalog"),
		Instantiate("Instantiate"),
		IsMainCI("IsMainCI"),
		RelateToMainCI("RelateToMainCI"),
		ProductCI_Product("ServiceCatalogue.ProductCI_Product"),
		ProductCI_ProductAttributeItem("ServiceCatalogue.ProductCI_ProductAttributeItem"),
		ProductCI_ConfigurationItem("ServiceCatalogue.ProductCI_ConfigurationItem"),
		ProductCI_CMDBAllowedRelation("ServiceCatalogue.ProductCI_CMDBAllowedRelation");

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

	public ProductCI(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.ProductCI"));
	}

	protected ProductCI(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productCIMendixObject)
	{
		if (productCIMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.ProductCI", productCIMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.ProductCI");

		this.productCIMendixObject = productCIMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProductCI.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.ProductCI initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.ProductCI.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.ProductCI initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.ProductCI(context, mendixObject);
	}

	public static servicecatalogue.proxies.ProductCI load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.ProductCI.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.ProductCI> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductCI> result = new java.util.ArrayList<servicecatalogue.proxies.ProductCI>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.ProductCI" + xpathConstraint))
			result.add(servicecatalogue.proxies.ProductCI.initialize(context, obj));
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
	 * Set value of CILinkedToProduct_Attribute_Item
	 * @param cilinkedtoproduct_attribute_item
	 */
	public final servicecatalogue.proxies.ProductCILevelEnum getCILinkedToProduct_Attribute_Item()
	{
		return getCILinkedToProduct_Attribute_Item(getContext());
	}

	/**
	 * @param context
	 * @return value of CILinkedToProduct_Attribute_Item
	 */
	public final servicecatalogue.proxies.ProductCILevelEnum getCILinkedToProduct_Attribute_Item(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.CILinkedToProduct_Attribute_Item.toString());
		if (obj == null)
			return null;

		return servicecatalogue.proxies.ProductCILevelEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of CILinkedToProduct_Attribute_Item
	 * @param cilinkedtoproduct_attribute_item
	 */
	public final void setCILinkedToProduct_Attribute_Item(servicecatalogue.proxies.ProductCILevelEnum cilinkedtoproduct_attribute_item)
	{
		setCILinkedToProduct_Attribute_Item(getContext(), cilinkedtoproduct_attribute_item);
	}

	/**
	 * Set value of CILinkedToProduct_Attribute_Item
	 * @param context
	 * @param cilinkedtoproduct_attribute_item
	 */
	public final void setCILinkedToProduct_Attribute_Item(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ProductCILevelEnum cilinkedtoproduct_attribute_item)
	{
		if (cilinkedtoproduct_attribute_item != null)
			getMendixObject().setValue(context, MemberNames.CILinkedToProduct_Attribute_Item.toString(), cilinkedtoproduct_attribute_item.toString());
		else
			getMendixObject().setValue(context, MemberNames.CILinkedToProduct_Attribute_Item.toString(), null);
	}

	/**
	 * @return value of IsCatalog
	 */
	public final java.lang.Boolean getIsCatalog()
	{
		return getIsCatalog(getContext());
	}

	/**
	 * @param context
	 * @return value of IsCatalog
	 */
	public final java.lang.Boolean getIsCatalog(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsCatalog.toString());
	}

	/**
	 * Set value of IsCatalog
	 * @param iscatalog
	 */
	public final void setIsCatalog(java.lang.Boolean iscatalog)
	{
		setIsCatalog(getContext(), iscatalog);
	}

	/**
	 * Set value of IsCatalog
	 * @param context
	 * @param iscatalog
	 */
	public final void setIsCatalog(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean iscatalog)
	{
		getMendixObject().setValue(context, MemberNames.IsCatalog.toString(), iscatalog);
	}

	/**
	 * @return value of Instantiate
	 */
	public final java.lang.Boolean getInstantiate()
	{
		return getInstantiate(getContext());
	}

	/**
	 * @param context
	 * @return value of Instantiate
	 */
	public final java.lang.Boolean getInstantiate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Instantiate.toString());
	}

	/**
	 * Set value of Instantiate
	 * @param instantiate
	 */
	public final void setInstantiate(java.lang.Boolean instantiate)
	{
		setInstantiate(getContext(), instantiate);
	}

	/**
	 * Set value of Instantiate
	 * @param context
	 * @param instantiate
	 */
	public final void setInstantiate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean instantiate)
	{
		getMendixObject().setValue(context, MemberNames.Instantiate.toString(), instantiate);
	}

	/**
	 * @return value of IsMainCI
	 */
	public final java.lang.Boolean getIsMainCI()
	{
		return getIsMainCI(getContext());
	}

	/**
	 * @param context
	 * @return value of IsMainCI
	 */
	public final java.lang.Boolean getIsMainCI(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsMainCI.toString());
	}

	/**
	 * Set value of IsMainCI
	 * @param ismainci
	 */
	public final void setIsMainCI(java.lang.Boolean ismainci)
	{
		setIsMainCI(getContext(), ismainci);
	}

	/**
	 * Set value of IsMainCI
	 * @param context
	 * @param ismainci
	 */
	public final void setIsMainCI(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ismainci)
	{
		getMendixObject().setValue(context, MemberNames.IsMainCI.toString(), ismainci);
	}

	/**
	 * @return value of RelateToMainCI
	 */
	public final java.lang.Boolean getRelateToMainCI()
	{
		return getRelateToMainCI(getContext());
	}

	/**
	 * @param context
	 * @return value of RelateToMainCI
	 */
	public final java.lang.Boolean getRelateToMainCI(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.RelateToMainCI.toString());
	}

	/**
	 * Set value of RelateToMainCI
	 * @param relatetomainci
	 */
	public final void setRelateToMainCI(java.lang.Boolean relatetomainci)
	{
		setRelateToMainCI(getContext(), relatetomainci);
	}

	/**
	 * Set value of RelateToMainCI
	 * @param context
	 * @param relatetomainci
	 */
	public final void setRelateToMainCI(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean relatetomainci)
	{
		getMendixObject().setValue(context, MemberNames.RelateToMainCI.toString(), relatetomainci);
	}

	/**
	 * @return value of ProductCI_Product
	 */
	public final servicecatalogue.proxies.Product getProductCI_Product() throws com.mendix.core.CoreException
	{
		return getProductCI_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductCI_Product
	 */
	public final servicecatalogue.proxies.Product getProductCI_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductCI_Product.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductCI_Product
	 * @param productci_product
	 */
	public final void setProductCI_Product(servicecatalogue.proxies.Product productci_product)
	{
		setProductCI_Product(getContext(), productci_product);
	}

	/**
	 * Set value of ProductCI_Product
	 * @param context
	 * @param productci_product
	 */
	public final void setProductCI_Product(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.Product productci_product)
	{
		if (productci_product == null)
			getMendixObject().setValue(context, MemberNames.ProductCI_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductCI_Product.toString(), productci_product.getMendixObject().getId());
	}

	/**
	 * @return value of ProductCI_ProductAttributeItem
	 */
	public final servicecatalogue.proxies.ProductAttributeItem getProductCI_ProductAttributeItem() throws com.mendix.core.CoreException
	{
		return getProductCI_ProductAttributeItem(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductCI_ProductAttributeItem
	 */
	public final servicecatalogue.proxies.ProductAttributeItem getProductCI_ProductAttributeItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ProductAttributeItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductCI_ProductAttributeItem.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ProductAttributeItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductCI_ProductAttributeItem
	 * @param productci_productattributeitem
	 */
	public final void setProductCI_ProductAttributeItem(servicecatalogue.proxies.ProductAttributeItem productci_productattributeitem)
	{
		setProductCI_ProductAttributeItem(getContext(), productci_productattributeitem);
	}

	/**
	 * Set value of ProductCI_ProductAttributeItem
	 * @param context
	 * @param productci_productattributeitem
	 */
	public final void setProductCI_ProductAttributeItem(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ProductAttributeItem productci_productattributeitem)
	{
		if (productci_productattributeitem == null)
			getMendixObject().setValue(context, MemberNames.ProductCI_ProductAttributeItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductCI_ProductAttributeItem.toString(), productci_productattributeitem.getMendixObject().getId());
	}

	/**
	 * @return value of ProductCI_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getProductCI_ConfigurationItem() throws com.mendix.core.CoreException
	{
		return getProductCI_ConfigurationItem(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductCI_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getProductCI_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.ConfigurationItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductCI_ConfigurationItem.toString());
		if (identifier != null)
			result = cmdb.proxies.ConfigurationItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductCI_ConfigurationItem
	 * @param productci_configurationitem
	 */
	public final void setProductCI_ConfigurationItem(cmdb.proxies.ConfigurationItem productci_configurationitem)
	{
		setProductCI_ConfigurationItem(getContext(), productci_configurationitem);
	}

	/**
	 * Set value of ProductCI_ConfigurationItem
	 * @param context
	 * @param productci_configurationitem
	 */
	public final void setProductCI_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.ConfigurationItem productci_configurationitem)
	{
		if (productci_configurationitem == null)
			getMendixObject().setValue(context, MemberNames.ProductCI_ConfigurationItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductCI_ConfigurationItem.toString(), productci_configurationitem.getMendixObject().getId());
	}

	/**
	 * @return value of ProductCI_CMDBAllowedRelation
	 */
	public final cmdb.proxies.CMDBAllowedRelation getProductCI_CMDBAllowedRelation() throws com.mendix.core.CoreException
	{
		return getProductCI_CMDBAllowedRelation(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductCI_CMDBAllowedRelation
	 */
	public final cmdb.proxies.CMDBAllowedRelation getProductCI_CMDBAllowedRelation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.CMDBAllowedRelation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductCI_CMDBAllowedRelation.toString());
		if (identifier != null)
			result = cmdb.proxies.CMDBAllowedRelation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductCI_CMDBAllowedRelation
	 * @param productci_cmdballowedrelation
	 */
	public final void setProductCI_CMDBAllowedRelation(cmdb.proxies.CMDBAllowedRelation productci_cmdballowedrelation)
	{
		setProductCI_CMDBAllowedRelation(getContext(), productci_cmdballowedrelation);
	}

	/**
	 * Set value of ProductCI_CMDBAllowedRelation
	 * @param context
	 * @param productci_cmdballowedrelation
	 */
	public final void setProductCI_CMDBAllowedRelation(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.CMDBAllowedRelation productci_cmdballowedrelation)
	{
		if (productci_cmdballowedrelation == null)
			getMendixObject().setValue(context, MemberNames.ProductCI_CMDBAllowedRelation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductCI_CMDBAllowedRelation.toString(), productci_cmdballowedrelation.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productCIMendixObject;
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
			final servicecatalogue.proxies.ProductCI that = (servicecatalogue.proxies.ProductCI) obj;
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
		return "ServiceCatalogue.ProductCI";
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