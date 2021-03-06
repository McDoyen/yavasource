// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceconfiguration.proxies;

public class Account
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject accountMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceConfiguration.Account";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		LocalLoginAccount_LDAPInterfaceConfiguration("InterfaceConfiguration.LocalLoginAccount_LDAPInterfaceConfiguration"),
		LocalFallbackAccount_LDAPInterfaceConfiguration("InterfaceConfiguration.LocalFallbackAccount_LDAPInterfaceConfiguration");

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

	public Account(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceConfiguration.Account"));
	}

	protected Account(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject accountMendixObject)
	{
		if (accountMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceConfiguration.Account", accountMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceConfiguration.Account");

		this.accountMendixObject = accountMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Account.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceconfiguration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceconfiguration.proxies.Account.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceconfiguration.proxies.Account initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceconfiguration.proxies.Account(context, mendixObject);
	}

	public static interfaceconfiguration.proxies.Account load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceconfiguration.proxies.Account.initialize(context, mendixObject);
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of LocalLoginAccount_LDAPInterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.LDAPInterfaceConfiguration getLocalLoginAccount_LDAPInterfaceConfiguration() throws com.mendix.core.CoreException
	{
		return getLocalLoginAccount_LDAPInterfaceConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of LocalLoginAccount_LDAPInterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.LDAPInterfaceConfiguration getLocalLoginAccount_LDAPInterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.LDAPInterfaceConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LocalLoginAccount_LDAPInterfaceConfiguration.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.LDAPInterfaceConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LocalLoginAccount_LDAPInterfaceConfiguration
	 * @param localloginaccount_ldapinterfaceconfiguration
	 */
	public final void setLocalLoginAccount_LDAPInterfaceConfiguration(interfaceconfiguration.proxies.LDAPInterfaceConfiguration localloginaccount_ldapinterfaceconfiguration)
	{
		setLocalLoginAccount_LDAPInterfaceConfiguration(getContext(), localloginaccount_ldapinterfaceconfiguration);
	}

	/**
	 * Set value of LocalLoginAccount_LDAPInterfaceConfiguration
	 * @param context
	 * @param localloginaccount_ldapinterfaceconfiguration
	 */
	public final void setLocalLoginAccount_LDAPInterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.LDAPInterfaceConfiguration localloginaccount_ldapinterfaceconfiguration)
	{
		if (localloginaccount_ldapinterfaceconfiguration == null)
			getMendixObject().setValue(context, MemberNames.LocalLoginAccount_LDAPInterfaceConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LocalLoginAccount_LDAPInterfaceConfiguration.toString(), localloginaccount_ldapinterfaceconfiguration.getMendixObject().getId());
	}

	/**
	 * @return value of LocalFallbackAccount_LDAPInterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.LDAPInterfaceConfiguration getLocalFallbackAccount_LDAPInterfaceConfiguration() throws com.mendix.core.CoreException
	{
		return getLocalFallbackAccount_LDAPInterfaceConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of LocalFallbackAccount_LDAPInterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.LDAPInterfaceConfiguration getLocalFallbackAccount_LDAPInterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.LDAPInterfaceConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LocalFallbackAccount_LDAPInterfaceConfiguration.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.LDAPInterfaceConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LocalFallbackAccount_LDAPInterfaceConfiguration
	 * @param localfallbackaccount_ldapinterfaceconfiguration
	 */
	public final void setLocalFallbackAccount_LDAPInterfaceConfiguration(interfaceconfiguration.proxies.LDAPInterfaceConfiguration localfallbackaccount_ldapinterfaceconfiguration)
	{
		setLocalFallbackAccount_LDAPInterfaceConfiguration(getContext(), localfallbackaccount_ldapinterfaceconfiguration);
	}

	/**
	 * Set value of LocalFallbackAccount_LDAPInterfaceConfiguration
	 * @param context
	 * @param localfallbackaccount_ldapinterfaceconfiguration
	 */
	public final void setLocalFallbackAccount_LDAPInterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.LDAPInterfaceConfiguration localfallbackaccount_ldapinterfaceconfiguration)
	{
		if (localfallbackaccount_ldapinterfaceconfiguration == null)
			getMendixObject().setValue(context, MemberNames.LocalFallbackAccount_LDAPInterfaceConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LocalFallbackAccount_LDAPInterfaceConfiguration.toString(), localfallbackaccount_ldapinterfaceconfiguration.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return accountMendixObject;
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
			final interfaceconfiguration.proxies.Account that = (interfaceconfiguration.proxies.Account) obj;
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
		return "InterfaceConfiguration.Account";
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
