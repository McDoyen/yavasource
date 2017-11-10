// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class ProductFiles extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.ProductFiles";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		IsImage("IsImage"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		ProductFiles_Product("ServiceCatalogue.ProductFiles_Product");

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

	public ProductFiles(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.ProductFiles"));
	}

	protected ProductFiles(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productFilesMendixObject)
	{
		super(context, productFilesMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.ProductFiles", productFilesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.ProductFiles");
	}

	/**
	 * @deprecated Use 'ProductFiles.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.ProductFiles initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.ProductFiles.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.ProductFiles initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.ProductFiles(context, mendixObject);
	}

	public static servicecatalogue.proxies.ProductFiles load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.ProductFiles.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.ProductFiles> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductFiles> result = new java.util.ArrayList<servicecatalogue.proxies.ProductFiles>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.ProductFiles" + xpathConstraint))
			result.add(servicecatalogue.proxies.ProductFiles.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of IsImage
	 */
	public final java.lang.Boolean getIsImage()
	{
		return getIsImage(getContext());
	}

	/**
	 * @param context
	 * @return value of IsImage
	 */
	public final java.lang.Boolean getIsImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsImage.toString());
	}

	/**
	 * Set value of IsImage
	 * @param isimage
	 */
	public final void setIsImage(java.lang.Boolean isimage)
	{
		setIsImage(getContext(), isimage);
	}

	/**
	 * Set value of IsImage
	 * @param context
	 * @param isimage
	 */
	public final void setIsImage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isimage)
	{
		getMendixObject().setValue(context, MemberNames.IsImage.toString(), isimage);
	}

	/**
	 * @return value of ProductFiles_Product
	 */
	public final servicecatalogue.proxies.Product getProductFiles_Product() throws com.mendix.core.CoreException
	{
		return getProductFiles_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductFiles_Product
	 */
	public final servicecatalogue.proxies.Product getProductFiles_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductFiles_Product.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductFiles_Product
	 * @param productfiles_product
	 */
	public final void setProductFiles_Product(servicecatalogue.proxies.Product productfiles_product)
	{
		setProductFiles_Product(getContext(), productfiles_product);
	}

	/**
	 * Set value of ProductFiles_Product
	 * @param context
	 * @param productfiles_product
	 */
	public final void setProductFiles_Product(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.Product productfiles_product)
	{
		if (productfiles_product == null)
			getMendixObject().setValue(context, MemberNames.ProductFiles_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductFiles_Product.toString(), productfiles_product.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final servicecatalogue.proxies.ProductFiles that = (servicecatalogue.proxies.ProductFiles) obj;
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
		return "ServiceCatalogue.ProductFiles";
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
