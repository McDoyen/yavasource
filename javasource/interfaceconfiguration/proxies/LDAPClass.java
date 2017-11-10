// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceconfiguration.proxies;

public class LDAPClass
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject lDAPClassMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceConfiguration.LDAPClass";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ClassName("ClassName"),
		LDAPClass_LDAPObject("InterfaceConfiguration.LDAPClass_LDAPObject");

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

	public LDAPClass(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceConfiguration.LDAPClass"));
	}

	protected LDAPClass(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject lDAPClassMendixObject)
	{
		if (lDAPClassMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceConfiguration.LDAPClass", lDAPClassMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceConfiguration.LDAPClass");

		this.lDAPClassMendixObject = lDAPClassMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LDAPClass.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceconfiguration.proxies.LDAPClass initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceconfiguration.proxies.LDAPClass.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceconfiguration.proxies.LDAPClass initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceconfiguration.proxies.LDAPClass(context, mendixObject);
	}

	public static interfaceconfiguration.proxies.LDAPClass load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceconfiguration.proxies.LDAPClass.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceconfiguration.proxies.LDAPClass> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceconfiguration.proxies.LDAPClass> result = new java.util.ArrayList<interfaceconfiguration.proxies.LDAPClass>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceConfiguration.LDAPClass" + xpathConstraint))
			result.add(interfaceconfiguration.proxies.LDAPClass.initialize(context, obj));
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
	 * @return value of ClassName
	 */
	public final java.lang.String getClassName()
	{
		return getClassName(getContext());
	}

	/**
	 * @param context
	 * @return value of ClassName
	 */
	public final java.lang.String getClassName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ClassName.toString());
	}

	/**
	 * Set value of ClassName
	 * @param classname
	 */
	public final void setClassName(java.lang.String classname)
	{
		setClassName(getContext(), classname);
	}

	/**
	 * Set value of ClassName
	 * @param context
	 * @param classname
	 */
	public final void setClassName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String classname)
	{
		getMendixObject().setValue(context, MemberNames.ClassName.toString(), classname);
	}

	/**
	 * @return value of LDAPClass_LDAPObject
	 */
	public final interfaceconfiguration.proxies.LDAPObject getLDAPClass_LDAPObject() throws com.mendix.core.CoreException
	{
		return getLDAPClass_LDAPObject(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPClass_LDAPObject
	 */
	public final interfaceconfiguration.proxies.LDAPObject getLDAPClass_LDAPObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.LDAPObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LDAPClass_LDAPObject.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.LDAPObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LDAPClass_LDAPObject
	 * @param ldapclass_ldapobject
	 */
	public final void setLDAPClass_LDAPObject(interfaceconfiguration.proxies.LDAPObject ldapclass_ldapobject)
	{
		setLDAPClass_LDAPObject(getContext(), ldapclass_ldapobject);
	}

	/**
	 * Set value of LDAPClass_LDAPObject
	 * @param context
	 * @param ldapclass_ldapobject
	 */
	public final void setLDAPClass_LDAPObject(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.LDAPObject ldapclass_ldapobject)
	{
		if (ldapclass_ldapobject == null)
			getMendixObject().setValue(context, MemberNames.LDAPClass_LDAPObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LDAPClass_LDAPObject.toString(), ldapclass_ldapobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return lDAPClassMendixObject;
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
			final interfaceconfiguration.proxies.LDAPClass that = (interfaceconfiguration.proxies.LDAPClass) obj;
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
		return "InterfaceConfiguration.LDAPClass";
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
