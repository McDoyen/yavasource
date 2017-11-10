// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class ProductToBeAddedAttribute
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productToBeAddedAttributeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.ProductToBeAddedAttribute";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AttributeLabel("AttributeLabel"),
		AttributeType("AttributeType"),
		StringAttribute("StringAttribute"),
		IntegerAttribute("IntegerAttribute"),
		FloatAttribute("FloatAttribute"),
		LabelType("LabelType"),
		RequiredField("RequiredField"),
		SelectionSingleSelect("SelectionSingleSelect"),
		Order("Order"),
		ProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute("ServiceCatalogue.ProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute"),
		ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems("ServiceCatalogue.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems"),
		ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn("ServiceCatalogue.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn"),
		ProductToBeAddedAttribute_OptionalShoppingcartProduct("ServiceCatalogue.ProductToBeAddedAttribute_OptionalShoppingcartProduct");

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

	public ProductToBeAddedAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.ProductToBeAddedAttribute"));
	}

	protected ProductToBeAddedAttribute(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productToBeAddedAttributeMendixObject)
	{
		if (productToBeAddedAttributeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.ProductToBeAddedAttribute", productToBeAddedAttributeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.ProductToBeAddedAttribute");

		this.productToBeAddedAttributeMendixObject = productToBeAddedAttributeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProductToBeAddedAttribute.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.ProductToBeAddedAttribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.ProductToBeAddedAttribute.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.ProductToBeAddedAttribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.ProductToBeAddedAttribute(context, mendixObject);
	}

	public static servicecatalogue.proxies.ProductToBeAddedAttribute load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.ProductToBeAddedAttribute.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.ProductToBeAddedAttribute> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductToBeAddedAttribute> result = new java.util.ArrayList<servicecatalogue.proxies.ProductToBeAddedAttribute>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.ProductToBeAddedAttribute" + xpathConstraint))
			result.add(servicecatalogue.proxies.ProductToBeAddedAttribute.initialize(context, obj));
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
	 * @return value of AttributeLabel
	 */
	public final java.lang.String getAttributeLabel()
	{
		return getAttributeLabel(getContext());
	}

	/**
	 * @param context
	 * @return value of AttributeLabel
	 */
	public final java.lang.String getAttributeLabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AttributeLabel.toString());
	}

	/**
	 * Set value of AttributeLabel
	 * @param attributelabel
	 */
	public final void setAttributeLabel(java.lang.String attributelabel)
	{
		setAttributeLabel(getContext(), attributelabel);
	}

	/**
	 * Set value of AttributeLabel
	 * @param context
	 * @param attributelabel
	 */
	public final void setAttributeLabel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attributelabel)
	{
		getMendixObject().setValue(context, MemberNames.AttributeLabel.toString(), attributelabel);
	}

	/**
	 * Set value of AttributeType
	 * @param attributetype
	 */
	public final servicecatalogue.proxies.AttributeType getAttributeType()
	{
		return getAttributeType(getContext());
	}

	/**
	 * @param context
	 * @return value of AttributeType
	 */
	public final servicecatalogue.proxies.AttributeType getAttributeType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AttributeType.toString());
		if (obj == null)
			return null;

		return servicecatalogue.proxies.AttributeType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AttributeType
	 * @param attributetype
	 */
	public final void setAttributeType(servicecatalogue.proxies.AttributeType attributetype)
	{
		setAttributeType(getContext(), attributetype);
	}

	/**
	 * Set value of AttributeType
	 * @param context
	 * @param attributetype
	 */
	public final void setAttributeType(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.AttributeType attributetype)
	{
		if (attributetype != null)
			getMendixObject().setValue(context, MemberNames.AttributeType.toString(), attributetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.AttributeType.toString(), null);
	}

	/**
	 * @return value of StringAttribute
	 */
	public final java.lang.String getStringAttribute()
	{
		return getStringAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of StringAttribute
	 */
	public final java.lang.String getStringAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StringAttribute.toString());
	}

	/**
	 * Set value of StringAttribute
	 * @param stringattribute
	 */
	public final void setStringAttribute(java.lang.String stringattribute)
	{
		setStringAttribute(getContext(), stringattribute);
	}

	/**
	 * Set value of StringAttribute
	 * @param context
	 * @param stringattribute
	 */
	public final void setStringAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String stringattribute)
	{
		getMendixObject().setValue(context, MemberNames.StringAttribute.toString(), stringattribute);
	}

	/**
	 * @return value of IntegerAttribute
	 */
	public final java.lang.Integer getIntegerAttribute()
	{
		return getIntegerAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of IntegerAttribute
	 */
	public final java.lang.Integer getIntegerAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.IntegerAttribute.toString());
	}

	/**
	 * Set value of IntegerAttribute
	 * @param integerattribute
	 */
	public final void setIntegerAttribute(java.lang.Integer integerattribute)
	{
		setIntegerAttribute(getContext(), integerattribute);
	}

	/**
	 * Set value of IntegerAttribute
	 * @param context
	 * @param integerattribute
	 */
	public final void setIntegerAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer integerattribute)
	{
		getMendixObject().setValue(context, MemberNames.IntegerAttribute.toString(), integerattribute);
	}

	/**
	 * @return value of FloatAttribute
	 */
	public final java.lang.Double getFloatAttribute()
	{
		return getFloatAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of FloatAttribute
	 */
	public final java.lang.Double getFloatAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.FloatAttribute.toString());
	}

	/**
	 * Set value of FloatAttribute
	 * @param floatattribute
	 */
	public final void setFloatAttribute(java.lang.Double floatattribute)
	{
		setFloatAttribute(getContext(), floatattribute);
	}

	/**
	 * Set value of FloatAttribute
	 * @param context
	 * @param floatattribute
	 */
	public final void setFloatAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double floatattribute)
	{
		getMendixObject().setValue(context, MemberNames.FloatAttribute.toString(), floatattribute);
	}

	/**
	 * Set value of LabelType
	 * @param labeltype
	 */
	public final process.proxies.DynamicLabelType getLabelType()
	{
		return getLabelType(getContext());
	}

	/**
	 * @param context
	 * @return value of LabelType
	 */
	public final process.proxies.DynamicLabelType getLabelType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.LabelType.toString());
		if (obj == null)
			return null;

		return process.proxies.DynamicLabelType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of LabelType
	 * @param labeltype
	 */
	public final void setLabelType(process.proxies.DynamicLabelType labeltype)
	{
		setLabelType(getContext(), labeltype);
	}

	/**
	 * Set value of LabelType
	 * @param context
	 * @param labeltype
	 */
	public final void setLabelType(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.DynamicLabelType labeltype)
	{
		if (labeltype != null)
			getMendixObject().setValue(context, MemberNames.LabelType.toString(), labeltype.toString());
		else
			getMendixObject().setValue(context, MemberNames.LabelType.toString(), null);
	}

	/**
	 * @return value of RequiredField
	 */
	public final java.lang.Boolean getRequiredField()
	{
		return getRequiredField(getContext());
	}

	/**
	 * @param context
	 * @return value of RequiredField
	 */
	public final java.lang.Boolean getRequiredField(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.RequiredField.toString());
	}

	/**
	 * Set value of RequiredField
	 * @param requiredfield
	 */
	public final void setRequiredField(java.lang.Boolean requiredfield)
	{
		setRequiredField(getContext(), requiredfield);
	}

	/**
	 * Set value of RequiredField
	 * @param context
	 * @param requiredfield
	 */
	public final void setRequiredField(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean requiredfield)
	{
		getMendixObject().setValue(context, MemberNames.RequiredField.toString(), requiredfield);
	}

	/**
	 * @return value of SelectionSingleSelect
	 */
	public final java.lang.Boolean getSelectionSingleSelect()
	{
		return getSelectionSingleSelect(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectionSingleSelect
	 */
	public final java.lang.Boolean getSelectionSingleSelect(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SelectionSingleSelect.toString());
	}

	/**
	 * Set value of SelectionSingleSelect
	 * @param selectionsingleselect
	 */
	public final void setSelectionSingleSelect(java.lang.Boolean selectionsingleselect)
	{
		setSelectionSingleSelect(getContext(), selectionsingleselect);
	}

	/**
	 * Set value of SelectionSingleSelect
	 * @param context
	 * @param selectionsingleselect
	 */
	public final void setSelectionSingleSelect(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean selectionsingleselect)
	{
		getMendixObject().setValue(context, MemberNames.SelectionSingleSelect.toString(), selectionsingleselect);
	}

	/**
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder()
	{
		return getOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Order.toString());
	}

	/**
	 * Set value of Order
	 * @param order
	 */
	public final void setOrder(java.lang.Integer order)
	{
		setOrder(getContext(), order);
	}

	/**
	 * Set value of Order
	 * @param context
	 * @param order
	 */
	public final void setOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer order)
	{
		getMendixObject().setValue(context, MemberNames.Order.toString(), order);
	}

	/**
	 * @return value of ProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttributeAttachment getProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute() throws com.mendix.core.CoreException
	{
		return getProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttributeAttachment getProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ProductToBeAddedAttributeAttachment result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ProductToBeAddedAttributeAttachment.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute
	 * @param producttobeaddedattributeattachment_producttobeaddedattribute
	 */
	public final void setProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute(servicecatalogue.proxies.ProductToBeAddedAttributeAttachment producttobeaddedattributeattachment_producttobeaddedattribute)
	{
		setProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute(getContext(), producttobeaddedattributeattachment_producttobeaddedattribute);
	}

	/**
	 * Set value of ProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute
	 * @param context
	 * @param producttobeaddedattributeattachment_producttobeaddedattribute
	 */
	public final void setProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ProductToBeAddedAttributeAttachment producttobeaddedattributeattachment_producttobeaddedattribute)
	{
		if (producttobeaddedattributeattachment_producttobeaddedattribute == null)
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttributeAttachment_ProductToBeAddedAttribute.toString(), producttobeaddedattributeattachment_producttobeaddedattribute.getMendixObject().getId());
	}

	/**
	 * @return value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems
	 */
	public final java.util.List<servicecatalogue.proxies.ProductToBeAddedAttributeItem> getProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems() throws com.mendix.core.CoreException
	{
		return getProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<servicecatalogue.proxies.ProductToBeAddedAttributeItem> getProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductToBeAddedAttributeItem> result = new java.util.ArrayList<servicecatalogue.proxies.ProductToBeAddedAttributeItem>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(servicecatalogue.proxies.ProductToBeAddedAttributeItem.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems
	 * @param producttobeaddedattribute_selectedproducttobeaddedattributeitems
	 */
	public final void setProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems(java.util.List<servicecatalogue.proxies.ProductToBeAddedAttributeItem> producttobeaddedattribute_selectedproducttobeaddedattributeitems)
	{
		setProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems(getContext(), producttobeaddedattribute_selectedproducttobeaddedattributeitems);
	}

	/**
	 * Set value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems
	 * @param context
	 * @param producttobeaddedattribute_selectedproducttobeaddedattributeitems
	 */
	public final void setProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<servicecatalogue.proxies.ProductToBeAddedAttributeItem> producttobeaddedattribute_selectedproducttobeaddedattributeitems)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (servicecatalogue.proxies.ProductToBeAddedAttributeItem proxyObject : producttobeaddedattribute_selectedproducttobeaddedattributeitems)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItems.toString(), identifiers);
	}

	/**
	 * @return value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttributeItem getProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn() throws com.mendix.core.CoreException
	{
		return getProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn
	 */
	public final servicecatalogue.proxies.ProductToBeAddedAttributeItem getProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ProductToBeAddedAttributeItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ProductToBeAddedAttributeItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn
	 * @param producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn
	 */
	public final void setProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(servicecatalogue.proxies.ProductToBeAddedAttributeItem producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn)
	{
		setProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(getContext(), producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn);
	}

	/**
	 * Set value of ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn
	 * @param context
	 * @param producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn
	 */
	public final void setProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ProductToBeAddedAttributeItem producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn)
	{
		if (producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn == null)
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttribute_SelectedProductToBeAddedAttributeItem_RadioBtn.toString(), producttobeaddedattribute_selectedproducttobeaddedattributeitem_radiobtn.getMendixObject().getId());
	}

	/**
	 * @return value of ProductToBeAddedAttribute_OptionalShoppingcartProduct
	 */
	public final servicecatalogue.proxies.OptionalShoppingcartProduct getProductToBeAddedAttribute_OptionalShoppingcartProduct() throws com.mendix.core.CoreException
	{
		return getProductToBeAddedAttribute_OptionalShoppingcartProduct(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductToBeAddedAttribute_OptionalShoppingcartProduct
	 */
	public final servicecatalogue.proxies.OptionalShoppingcartProduct getProductToBeAddedAttribute_OptionalShoppingcartProduct(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.OptionalShoppingcartProduct result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductToBeAddedAttribute_OptionalShoppingcartProduct.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.OptionalShoppingcartProduct.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductToBeAddedAttribute_OptionalShoppingcartProduct
	 * @param producttobeaddedattribute_optionalshoppingcartproduct
	 */
	public final void setProductToBeAddedAttribute_OptionalShoppingcartProduct(servicecatalogue.proxies.OptionalShoppingcartProduct producttobeaddedattribute_optionalshoppingcartproduct)
	{
		setProductToBeAddedAttribute_OptionalShoppingcartProduct(getContext(), producttobeaddedattribute_optionalshoppingcartproduct);
	}

	/**
	 * Set value of ProductToBeAddedAttribute_OptionalShoppingcartProduct
	 * @param context
	 * @param producttobeaddedattribute_optionalshoppingcartproduct
	 */
	public final void setProductToBeAddedAttribute_OptionalShoppingcartProduct(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.OptionalShoppingcartProduct producttobeaddedattribute_optionalshoppingcartproduct)
	{
		if (producttobeaddedattribute_optionalshoppingcartproduct == null)
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttribute_OptionalShoppingcartProduct.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductToBeAddedAttribute_OptionalShoppingcartProduct.toString(), producttobeaddedattribute_optionalshoppingcartproduct.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productToBeAddedAttributeMendixObject;
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
			final servicecatalogue.proxies.ProductToBeAddedAttribute that = (servicecatalogue.proxies.ProductToBeAddedAttribute) obj;
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
		return "ServiceCatalogue.ProductToBeAddedAttribute";
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