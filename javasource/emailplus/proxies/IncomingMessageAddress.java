// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailplus.proxies;

public class IncomingMessageAddress
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject incomingMessageAddressMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EmailPlus.IncomingMessageAddress";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Address("Address"),
		IncomingMessageAddress_IncomingMessageTrigger("EmailPlus.IncomingMessageAddress_IncomingMessageTrigger");

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

	public IncomingMessageAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EmailPlus.IncomingMessageAddress"));
	}

	protected IncomingMessageAddress(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject incomingMessageAddressMendixObject)
	{
		if (incomingMessageAddressMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("EmailPlus.IncomingMessageAddress", incomingMessageAddressMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EmailPlus.IncomingMessageAddress");

		this.incomingMessageAddressMendixObject = incomingMessageAddressMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'IncomingMessageAddress.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static emailplus.proxies.IncomingMessageAddress initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emailplus.proxies.IncomingMessageAddress.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emailplus.proxies.IncomingMessageAddress initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emailplus.proxies.IncomingMessageAddress(context, mendixObject);
	}

	public static emailplus.proxies.IncomingMessageAddress load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emailplus.proxies.IncomingMessageAddress.initialize(context, mendixObject);
	}

	public static java.util.List<emailplus.proxies.IncomingMessageAddress> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<emailplus.proxies.IncomingMessageAddress> result = new java.util.ArrayList<emailplus.proxies.IncomingMessageAddress>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//EmailPlus.IncomingMessageAddress" + xpathConstraint))
			result.add(emailplus.proxies.IncomingMessageAddress.initialize(context, obj));
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
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @return value of IncomingMessageAddress_IncomingMessageTrigger
	 */
	public final emailplus.proxies.IncomingMessageTrigger getIncomingMessageAddress_IncomingMessageTrigger() throws com.mendix.core.CoreException
	{
		return getIncomingMessageAddress_IncomingMessageTrigger(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingMessageAddress_IncomingMessageTrigger
	 */
	public final emailplus.proxies.IncomingMessageTrigger getIncomingMessageAddress_IncomingMessageTrigger(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emailplus.proxies.IncomingMessageTrigger result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingMessageAddress_IncomingMessageTrigger.toString());
		if (identifier != null)
			result = emailplus.proxies.IncomingMessageTrigger.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingMessageAddress_IncomingMessageTrigger
	 * @param incomingmessageaddress_incomingmessagetrigger
	 */
	public final void setIncomingMessageAddress_IncomingMessageTrigger(emailplus.proxies.IncomingMessageTrigger incomingmessageaddress_incomingmessagetrigger)
	{
		setIncomingMessageAddress_IncomingMessageTrigger(getContext(), incomingmessageaddress_incomingmessagetrigger);
	}

	/**
	 * Set value of IncomingMessageAddress_IncomingMessageTrigger
	 * @param context
	 * @param incomingmessageaddress_incomingmessagetrigger
	 */
	public final void setIncomingMessageAddress_IncomingMessageTrigger(com.mendix.systemwideinterfaces.core.IContext context, emailplus.proxies.IncomingMessageTrigger incomingmessageaddress_incomingmessagetrigger)
	{
		if (incomingmessageaddress_incomingmessagetrigger == null)
			getMendixObject().setValue(context, MemberNames.IncomingMessageAddress_IncomingMessageTrigger.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingMessageAddress_IncomingMessageTrigger.toString(), incomingmessageaddress_incomingmessagetrigger.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return incomingMessageAddressMendixObject;
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
			final emailplus.proxies.IncomingMessageAddress that = (emailplus.proxies.IncomingMessageAddress) obj;
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
		return "EmailPlus.IncomingMessageAddress";
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