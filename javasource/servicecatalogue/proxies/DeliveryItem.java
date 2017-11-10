// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class DeliveryItem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject deliveryItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.DeliveryItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Amount("Amount"),
		DeliveryItem_Delivery("ServiceCatalogue.DeliveryItem_Delivery"),
		DeliveryItem_ShoppingCartProduct("ServiceCatalogue.DeliveryItem_ShoppingCartProduct");

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

	public DeliveryItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.DeliveryItem"));
	}

	protected DeliveryItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject deliveryItemMendixObject)
	{
		if (deliveryItemMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.DeliveryItem", deliveryItemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.DeliveryItem");

		this.deliveryItemMendixObject = deliveryItemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DeliveryItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.DeliveryItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.DeliveryItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.DeliveryItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.DeliveryItem(context, mendixObject);
	}

	public static servicecatalogue.proxies.DeliveryItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.DeliveryItem.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.DeliveryItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.DeliveryItem> result = new java.util.ArrayList<servicecatalogue.proxies.DeliveryItem>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.DeliveryItem" + xpathConstraint))
			result.add(servicecatalogue.proxies.DeliveryItem.initialize(context, obj));
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
	public final java.lang.Integer getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.lang.Integer amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of DeliveryItem_Delivery
	 */
	public final servicecatalogue.proxies.Delivery getDeliveryItem_Delivery() throws com.mendix.core.CoreException
	{
		return getDeliveryItem_Delivery(getContext());
	}

	/**
	 * @param context
	 * @return value of DeliveryItem_Delivery
	 */
	public final servicecatalogue.proxies.Delivery getDeliveryItem_Delivery(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.Delivery result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DeliveryItem_Delivery.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.Delivery.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DeliveryItem_Delivery
	 * @param deliveryitem_delivery
	 */
	public final void setDeliveryItem_Delivery(servicecatalogue.proxies.Delivery deliveryitem_delivery)
	{
		setDeliveryItem_Delivery(getContext(), deliveryitem_delivery);
	}

	/**
	 * Set value of DeliveryItem_Delivery
	 * @param context
	 * @param deliveryitem_delivery
	 */
	public final void setDeliveryItem_Delivery(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.Delivery deliveryitem_delivery)
	{
		if (deliveryitem_delivery == null)
			getMendixObject().setValue(context, MemberNames.DeliveryItem_Delivery.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DeliveryItem_Delivery.toString(), deliveryitem_delivery.getMendixObject().getId());
	}

	/**
	 * @return value of DeliveryItem_ShoppingCartProduct
	 */
	public final servicecatalogue.proxies.ShoppingCartProduct getDeliveryItem_ShoppingCartProduct() throws com.mendix.core.CoreException
	{
		return getDeliveryItem_ShoppingCartProduct(getContext());
	}

	/**
	 * @param context
	 * @return value of DeliveryItem_ShoppingCartProduct
	 */
	public final servicecatalogue.proxies.ShoppingCartProduct getDeliveryItem_ShoppingCartProduct(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ShoppingCartProduct result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DeliveryItem_ShoppingCartProduct.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ShoppingCartProduct.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DeliveryItem_ShoppingCartProduct
	 * @param deliveryitem_shoppingcartproduct
	 */
	public final void setDeliveryItem_ShoppingCartProduct(servicecatalogue.proxies.ShoppingCartProduct deliveryitem_shoppingcartproduct)
	{
		setDeliveryItem_ShoppingCartProduct(getContext(), deliveryitem_shoppingcartproduct);
	}

	/**
	 * Set value of DeliveryItem_ShoppingCartProduct
	 * @param context
	 * @param deliveryitem_shoppingcartproduct
	 */
	public final void setDeliveryItem_ShoppingCartProduct(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ShoppingCartProduct deliveryitem_shoppingcartproduct)
	{
		if (deliveryitem_shoppingcartproduct == null)
			getMendixObject().setValue(context, MemberNames.DeliveryItem_ShoppingCartProduct.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DeliveryItem_ShoppingCartProduct.toString(), deliveryitem_shoppingcartproduct.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return deliveryItemMendixObject;
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
			final servicecatalogue.proxies.DeliveryItem that = (servicecatalogue.proxies.DeliveryItem) obj;
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
		return "ServiceCatalogue.DeliveryItem";
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
