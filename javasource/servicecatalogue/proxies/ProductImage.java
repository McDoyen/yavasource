// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class ProductImage extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.ProductImage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		ProductImage_Product("ServiceCatalogue.ProductImage_Product");

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

	public ProductImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.ProductImage"));
	}

	protected ProductImage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productImageMendixObject)
	{
		super(context, productImageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.ProductImage", productImageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.ProductImage");
	}

	/**
	 * @deprecated Use 'ProductImage.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.ProductImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.ProductImage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.ProductImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.ProductImage(context, mendixObject);
	}

	public static servicecatalogue.proxies.ProductImage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.ProductImage.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.ProductImage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductImage> result = new java.util.ArrayList<servicecatalogue.proxies.ProductImage>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.ProductImage" + xpathConstraint))
			result.add(servicecatalogue.proxies.ProductImage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ProductImage_Product
	 */
	public final servicecatalogue.proxies.Product getProductImage_Product() throws com.mendix.core.CoreException
	{
		return getProductImage_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductImage_Product
	 */
	public final servicecatalogue.proxies.Product getProductImage_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductImage_Product.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductImage_Product
	 * @param productimage_product
	 */
	public final void setProductImage_Product(servicecatalogue.proxies.Product productimage_product)
	{
		setProductImage_Product(getContext(), productimage_product);
	}

	/**
	 * Set value of ProductImage_Product
	 * @param context
	 * @param productimage_product
	 */
	public final void setProductImage_Product(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.Product productimage_product)
	{
		if (productimage_product == null)
			getMendixObject().setValue(context, MemberNames.ProductImage_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductImage_Product.toString(), productimage_product.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final servicecatalogue.proxies.ProductImage that = (servicecatalogue.proxies.ProductImage) obj;
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
		return "ServiceCatalogue.ProductImage";
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
