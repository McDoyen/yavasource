// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class ShoppingCartProductAttributeAttachment extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.ShoppingCartProductAttributeAttachment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		ShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute("ServiceCatalogue.ShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute");

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

	public ShoppingCartProductAttributeAttachment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.ShoppingCartProductAttributeAttachment"));
	}

	protected ShoppingCartProductAttributeAttachment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject shoppingCartProductAttributeAttachmentMendixObject)
	{
		super(context, shoppingCartProductAttributeAttachmentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.ShoppingCartProductAttributeAttachment", shoppingCartProductAttributeAttachmentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.ShoppingCartProductAttributeAttachment");
	}

	/**
	 * @deprecated Use 'ShoppingCartProductAttributeAttachment.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.ShoppingCartProductAttributeAttachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.ShoppingCartProductAttributeAttachment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.ShoppingCartProductAttributeAttachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.ShoppingCartProductAttributeAttachment(context, mendixObject);
	}

	public static servicecatalogue.proxies.ShoppingCartProductAttributeAttachment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.ShoppingCartProductAttributeAttachment.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.ShoppingCartProductAttributeAttachment> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ShoppingCartProductAttributeAttachment> result = new java.util.ArrayList<servicecatalogue.proxies.ShoppingCartProductAttributeAttachment>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.ShoppingCartProductAttributeAttachment" + xpathConstraint))
			result.add(servicecatalogue.proxies.ShoppingCartProductAttributeAttachment.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute
	 */
	public final servicecatalogue.proxies.ShoppingCartProductAttribute getShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute() throws com.mendix.core.CoreException
	{
		return getShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of ShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute
	 */
	public final servicecatalogue.proxies.ShoppingCartProductAttribute getShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ShoppingCartProductAttribute result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ShoppingCartProductAttribute.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute
	 * @param shoppingcartproductattributeattachment_shoppingcartproductattribute
	 */
	public final void setShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute(servicecatalogue.proxies.ShoppingCartProductAttribute shoppingcartproductattributeattachment_shoppingcartproductattribute)
	{
		setShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute(getContext(), shoppingcartproductattributeattachment_shoppingcartproductattribute);
	}

	/**
	 * Set value of ShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute
	 * @param context
	 * @param shoppingcartproductattributeattachment_shoppingcartproductattribute
	 */
	public final void setShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ShoppingCartProductAttribute shoppingcartproductattributeattachment_shoppingcartproductattribute)
	{
		if (shoppingcartproductattributeattachment_shoppingcartproductattribute == null)
			getMendixObject().setValue(context, MemberNames.ShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ShoppingCartProductAttributeAttachment_ShoppingCartProductAttribute.toString(), shoppingcartproductattributeattachment_shoppingcartproductattribute.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final servicecatalogue.proxies.ShoppingCartProductAttributeAttachment that = (servicecatalogue.proxies.ShoppingCartProductAttributeAttachment) obj;
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
		return "ServiceCatalogue.ShoppingCartProductAttributeAttachment";
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
