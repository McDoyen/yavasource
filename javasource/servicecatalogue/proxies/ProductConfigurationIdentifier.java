// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class ProductConfigurationIdentifier
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productConfigurationIdentifierMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.ProductConfigurationIdentifier";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConfigID("ConfigID"),
		ProductConfigurationIdentifier_Account("ServiceCatalogue.ProductConfigurationIdentifier_Account");

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

	public ProductConfigurationIdentifier(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.ProductConfigurationIdentifier"));
	}

	protected ProductConfigurationIdentifier(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productConfigurationIdentifierMendixObject)
	{
		if (productConfigurationIdentifierMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.ProductConfigurationIdentifier", productConfigurationIdentifierMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.ProductConfigurationIdentifier");

		this.productConfigurationIdentifierMendixObject = productConfigurationIdentifierMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProductConfigurationIdentifier.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.ProductConfigurationIdentifier initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.ProductConfigurationIdentifier.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.ProductConfigurationIdentifier initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.ProductConfigurationIdentifier(context, mendixObject);
	}

	public static servicecatalogue.proxies.ProductConfigurationIdentifier load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.ProductConfigurationIdentifier.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.ProductConfigurationIdentifier> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.ProductConfigurationIdentifier> result = new java.util.ArrayList<servicecatalogue.proxies.ProductConfigurationIdentifier>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.ProductConfigurationIdentifier" + xpathConstraint))
			result.add(servicecatalogue.proxies.ProductConfigurationIdentifier.initialize(context, obj));
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
	 * @return value of ConfigID
	 */
	public final java.lang.String getConfigID()
	{
		return getConfigID(getContext());
	}

	/**
	 * @param context
	 * @return value of ConfigID
	 */
	public final java.lang.String getConfigID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ConfigID.toString());
	}

	/**
	 * Set value of ConfigID
	 * @param configid
	 */
	public final void setConfigID(java.lang.String configid)
	{
		setConfigID(getContext(), configid);
	}

	/**
	 * Set value of ConfigID
	 * @param context
	 * @param configid
	 */
	public final void setConfigID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String configid)
	{
		getMendixObject().setValue(context, MemberNames.ConfigID.toString(), configid);
	}

	/**
	 * @return value of ProductConfigurationIdentifier_Account
	 */
	public final mendix.proxies.Account getProductConfigurationIdentifier_Account() throws com.mendix.core.CoreException
	{
		return getProductConfigurationIdentifier_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductConfigurationIdentifier_Account
	 */
	public final mendix.proxies.Account getProductConfigurationIdentifier_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendix.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProductConfigurationIdentifier_Account.toString());
		if (identifier != null)
			result = mendix.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProductConfigurationIdentifier_Account
	 * @param productconfigurationidentifier_account
	 */
	public final void setProductConfigurationIdentifier_Account(mendix.proxies.Account productconfigurationidentifier_account)
	{
		setProductConfigurationIdentifier_Account(getContext(), productconfigurationidentifier_account);
	}

	/**
	 * Set value of ProductConfigurationIdentifier_Account
	 * @param context
	 * @param productconfigurationidentifier_account
	 */
	public final void setProductConfigurationIdentifier_Account(com.mendix.systemwideinterfaces.core.IContext context, mendix.proxies.Account productconfigurationidentifier_account)
	{
		if (productconfigurationidentifier_account == null)
			getMendixObject().setValue(context, MemberNames.ProductConfigurationIdentifier_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProductConfigurationIdentifier_Account.toString(), productconfigurationidentifier_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productConfigurationIdentifierMendixObject;
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
			final servicecatalogue.proxies.ProductConfigurationIdentifier that = (servicecatalogue.proxies.ProductConfigurationIdentifier) obj;
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
		return "ServiceCatalogue.ProductConfigurationIdentifier";
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
