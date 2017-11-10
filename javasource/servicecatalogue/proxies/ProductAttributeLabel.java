// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class ProductAttributeLabel
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productAttributeLabelMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.ProductAttributeLabel";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Label("Label"),
		LabelType("LabelType"),
		RequiredField("RequiredField"),
		AttributeType("AttributeType"),
		SelectionSingleSelect("SelectionSingleSelect"),
		ProductAttributeLabel_ProductLabelItem("ServiceCatalogue.ProductAttributeLabel_ProductLabelItem"),
		ProductAttributeLabel_ProductLabelItem_RadioBtn("ServiceCatalogue.ProductAttributeLabel_ProductLabelItem_RadioBtn");

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

	public ProductAttributeLabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.ProductAttributeLabel"));
	}

	protected ProductAttributeLabel(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productAttributeLabelMendixObject)
	{
		if (productAttributeLabelMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.ProductAttributeLabel", productAttributeLabelMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.ProductAttributeLabel");

		this.productAttributeLabelMendixObject = productAttributeLabelMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProductAttributeLabel.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.ProductAttributeLabel initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.ProductAttributeLabel.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.ProductAttributeLabel initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.ProductAttributeLabel(context, mendixObject);
	}

	public static servicecatalogue.proxies.ProductAttributeLabel load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.ProductAttributeLabel.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.ProductAttributeLabel> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductAttributeLabel> result = new java.util.ArrayList<servicecatalogue.proxies.ProductAttributeLabel>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.ProductAttributeLabel" + xpathConstraint))
			result.add(servicecatalogue.proxies.ProductAttributeLabel.initialize(context, obj));
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
	 * @return value of Label
	 */
	public final java.lang.String getLabel()
	{
		return getLabel(getContext());
	}

	/**
	 * @param context
	 * @return value of Label
	 */
	public final java.lang.String getLabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Label.toString());
	}

	/**
	 * Set value of Label
	 * @param label
	 */
	public final void setLabel(java.lang.String label)
	{
		setLabel(getContext(), label);
	}

	/**
	 * Set value of Label
	 * @param context
	 * @param label
	 */
	public final void setLabel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String label)
	{
		getMendixObject().setValue(context, MemberNames.Label.toString(), label);
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
	 * @return value of ProductAttributeLabel_ProductLabelItem
	 */
	public final java.util.List<servicecatalogue.proxies.ProductLabelItem> getProductAttributeLabel_ProductLabelItem() throws com.mendix.core.CoreException
	{
		return getProductAttributeLabel_ProductLabelItem(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductAttributeLabel_ProductLabelItem
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<servicecatalogue.proxies.ProductLabelItem> getProductAttributeLabel_ProductLabelItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductLabelItem> result = new java.util.ArrayList<servicecatalogue.proxies.ProductLabelItem>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ProductAttributeLabel_ProductLabelItem.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(servicecatalogue.proxies.ProductLabelItem.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ProductAttributeLabel_ProductLabelItem
	 * @param productattributelabel_productlabelitem
	 */
	public final void setProductAttributeLabel_ProductLabelItem(java.util.List<servicecatalogue.proxies.ProductLabelItem> productattributelabel_productlabelitem)
	{
		setProductAttributeLabel_ProductLabelItem(getContext(), productattributelabel_productlabelitem);
	}

	/**
	 * Set value of ProductAttributeLabel_ProductLabelItem
	 * @param context
	 * @param productattributelabel_productlabelitem
	 */
	public final void setProductAttributeLabel_ProductLabelItem(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<servicecatalogue.proxies.ProductLabelItem> productattributelabel_productlabelitem)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (servicecatalogue.proxies.ProductLabelItem proxyObject : productattributelabel_productlabelitem)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ProductAttributeLabel_ProductLabelItem.toString(), identifiers);
	}

	/**
	 * @return value of ProductAttributeLabel_ProductLabelItem_RadioBtn
	 */
	public final java.util.List<servicecatalogue.proxies.ProductLabelItem> getProductAttributeLabel_ProductLabelItem_RadioBtn() throws com.mendix.core.CoreException
	{
		return getProductAttributeLabel_ProductLabelItem_RadioBtn(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductAttributeLabel_ProductLabelItem_RadioBtn
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<servicecatalogue.proxies.ProductLabelItem> getProductAttributeLabel_ProductLabelItem_RadioBtn(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductLabelItem> result = new java.util.ArrayList<servicecatalogue.proxies.ProductLabelItem>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ProductAttributeLabel_ProductLabelItem_RadioBtn.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(servicecatalogue.proxies.ProductLabelItem.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ProductAttributeLabel_ProductLabelItem_RadioBtn
	 * @param productattributelabel_productlabelitem_radiobtn
	 */
	public final void setProductAttributeLabel_ProductLabelItem_RadioBtn(java.util.List<servicecatalogue.proxies.ProductLabelItem> productattributelabel_productlabelitem_radiobtn)
	{
		setProductAttributeLabel_ProductLabelItem_RadioBtn(getContext(), productattributelabel_productlabelitem_radiobtn);
	}

	/**
	 * Set value of ProductAttributeLabel_ProductLabelItem_RadioBtn
	 * @param context
	 * @param productattributelabel_productlabelitem_radiobtn
	 */
	public final void setProductAttributeLabel_ProductLabelItem_RadioBtn(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<servicecatalogue.proxies.ProductLabelItem> productattributelabel_productlabelitem_radiobtn)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (servicecatalogue.proxies.ProductLabelItem proxyObject : productattributelabel_productlabelitem_radiobtn)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ProductAttributeLabel_ProductLabelItem_RadioBtn.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productAttributeLabelMendixObject;
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
			final servicecatalogue.proxies.ProductAttributeLabel that = (servicecatalogue.proxies.ProductAttributeLabel) obj;
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
		return "ServiceCatalogue.ProductAttributeLabel";
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
