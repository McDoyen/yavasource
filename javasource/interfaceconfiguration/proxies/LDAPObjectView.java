// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceconfiguration.proxies;

public class LDAPObjectView
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject lDAPObjectViewMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceConfiguration.LDAPObjectView";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DistinguishedName("DistinguishedName"),
		IsRoot("IsRoot"),
		CommonName("CommonName"),
		IsImported("IsImported"),
		IsRecursiveImported("IsRecursiveImported"),
		ParentIsRecursiveImported("ParentIsRecursiveImported"),
		LDAPObjectView_LDAPImportType("InterfaceConfiguration.LDAPObjectView_LDAPImportType"),
		LDAPObjectView_LDAPObject("InterfaceConfiguration.LDAPObjectView_LDAPObject"),
		LDAPObjectView_ParentLDAPObject("InterfaceConfiguration.LDAPObjectView_ParentLDAPObject");

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

	public LDAPObjectView(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceConfiguration.LDAPObjectView"));
	}

	protected LDAPObjectView(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject lDAPObjectViewMendixObject)
	{
		if (lDAPObjectViewMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceConfiguration.LDAPObjectView", lDAPObjectViewMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceConfiguration.LDAPObjectView");

		this.lDAPObjectViewMendixObject = lDAPObjectViewMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LDAPObjectView.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceconfiguration.proxies.LDAPObjectView initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceconfiguration.proxies.LDAPObjectView.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceconfiguration.proxies.LDAPObjectView initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceconfiguration.proxies.LDAPObjectView(context, mendixObject);
	}

	public static interfaceconfiguration.proxies.LDAPObjectView load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceconfiguration.proxies.LDAPObjectView.initialize(context, mendixObject);
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
	 * @return value of DistinguishedName
	 */
	public final java.lang.String getDistinguishedName()
	{
		return getDistinguishedName(getContext());
	}

	/**
	 * @param context
	 * @return value of DistinguishedName
	 */
	public final java.lang.String getDistinguishedName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DistinguishedName.toString());
	}

	/**
	 * Set value of DistinguishedName
	 * @param distinguishedname
	 */
	public final void setDistinguishedName(java.lang.String distinguishedname)
	{
		setDistinguishedName(getContext(), distinguishedname);
	}

	/**
	 * Set value of DistinguishedName
	 * @param context
	 * @param distinguishedname
	 */
	public final void setDistinguishedName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String distinguishedname)
	{
		getMendixObject().setValue(context, MemberNames.DistinguishedName.toString(), distinguishedname);
	}

	/**
	 * @return value of IsRoot
	 */
	public final java.lang.Boolean getIsRoot()
	{
		return getIsRoot(getContext());
	}

	/**
	 * @param context
	 * @return value of IsRoot
	 */
	public final java.lang.Boolean getIsRoot(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsRoot.toString());
	}

	/**
	 * Set value of IsRoot
	 * @param isroot
	 */
	public final void setIsRoot(java.lang.Boolean isroot)
	{
		setIsRoot(getContext(), isroot);
	}

	/**
	 * Set value of IsRoot
	 * @param context
	 * @param isroot
	 */
	public final void setIsRoot(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isroot)
	{
		getMendixObject().setValue(context, MemberNames.IsRoot.toString(), isroot);
	}

	/**
	 * @return value of CommonName
	 */
	public final java.lang.String getCommonName()
	{
		return getCommonName(getContext());
	}

	/**
	 * @param context
	 * @return value of CommonName
	 */
	public final java.lang.String getCommonName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CommonName.toString());
	}

	/**
	 * Set value of CommonName
	 * @param commonname
	 */
	public final void setCommonName(java.lang.String commonname)
	{
		setCommonName(getContext(), commonname);
	}

	/**
	 * Set value of CommonName
	 * @param context
	 * @param commonname
	 */
	public final void setCommonName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String commonname)
	{
		getMendixObject().setValue(context, MemberNames.CommonName.toString(), commonname);
	}

	/**
	 * @return value of IsImported
	 */
	public final java.lang.Boolean getIsImported()
	{
		return getIsImported(getContext());
	}

	/**
	 * @param context
	 * @return value of IsImported
	 */
	public final java.lang.Boolean getIsImported(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsImported.toString());
	}

	/**
	 * Set value of IsImported
	 * @param isimported
	 */
	public final void setIsImported(java.lang.Boolean isimported)
	{
		setIsImported(getContext(), isimported);
	}

	/**
	 * Set value of IsImported
	 * @param context
	 * @param isimported
	 */
	public final void setIsImported(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isimported)
	{
		getMendixObject().setValue(context, MemberNames.IsImported.toString(), isimported);
	}

	/**
	 * @return value of IsRecursiveImported
	 */
	public final java.lang.Boolean getIsRecursiveImported()
	{
		return getIsRecursiveImported(getContext());
	}

	/**
	 * @param context
	 * @return value of IsRecursiveImported
	 */
	public final java.lang.Boolean getIsRecursiveImported(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsRecursiveImported.toString());
	}

	/**
	 * Set value of IsRecursiveImported
	 * @param isrecursiveimported
	 */
	public final void setIsRecursiveImported(java.lang.Boolean isrecursiveimported)
	{
		setIsRecursiveImported(getContext(), isrecursiveimported);
	}

	/**
	 * Set value of IsRecursiveImported
	 * @param context
	 * @param isrecursiveimported
	 */
	public final void setIsRecursiveImported(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isrecursiveimported)
	{
		getMendixObject().setValue(context, MemberNames.IsRecursiveImported.toString(), isrecursiveimported);
	}

	/**
	 * @return value of ParentIsRecursiveImported
	 */
	public final java.lang.Boolean getParentIsRecursiveImported()
	{
		return getParentIsRecursiveImported(getContext());
	}

	/**
	 * @param context
	 * @return value of ParentIsRecursiveImported
	 */
	public final java.lang.Boolean getParentIsRecursiveImported(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ParentIsRecursiveImported.toString());
	}

	/**
	 * Set value of ParentIsRecursiveImported
	 * @param parentisrecursiveimported
	 */
	public final void setParentIsRecursiveImported(java.lang.Boolean parentisrecursiveimported)
	{
		setParentIsRecursiveImported(getContext(), parentisrecursiveimported);
	}

	/**
	 * Set value of ParentIsRecursiveImported
	 * @param context
	 * @param parentisrecursiveimported
	 */
	public final void setParentIsRecursiveImported(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean parentisrecursiveimported)
	{
		getMendixObject().setValue(context, MemberNames.ParentIsRecursiveImported.toString(), parentisrecursiveimported);
	}

	/**
	 * @return value of LDAPObjectView_LDAPImportType
	 */
	public final interfaceconfiguration.proxies.LDAPImportType getLDAPObjectView_LDAPImportType() throws com.mendix.core.CoreException
	{
		return getLDAPObjectView_LDAPImportType(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPObjectView_LDAPImportType
	 */
	public final interfaceconfiguration.proxies.LDAPImportType getLDAPObjectView_LDAPImportType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.LDAPImportType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LDAPObjectView_LDAPImportType.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.LDAPImportType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LDAPObjectView_LDAPImportType
	 * @param ldapobjectview_ldapimporttype
	 */
	public final void setLDAPObjectView_LDAPImportType(interfaceconfiguration.proxies.LDAPImportType ldapobjectview_ldapimporttype)
	{
		setLDAPObjectView_LDAPImportType(getContext(), ldapobjectview_ldapimporttype);
	}

	/**
	 * Set value of LDAPObjectView_LDAPImportType
	 * @param context
	 * @param ldapobjectview_ldapimporttype
	 */
	public final void setLDAPObjectView_LDAPImportType(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.LDAPImportType ldapobjectview_ldapimporttype)
	{
		if (ldapobjectview_ldapimporttype == null)
			getMendixObject().setValue(context, MemberNames.LDAPObjectView_LDAPImportType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LDAPObjectView_LDAPImportType.toString(), ldapobjectview_ldapimporttype.getMendixObject().getId());
	}

	/**
	 * @return value of LDAPObjectView_LDAPObject
	 */
	public final interfaceconfiguration.proxies.LDAPObject getLDAPObjectView_LDAPObject() throws com.mendix.core.CoreException
	{
		return getLDAPObjectView_LDAPObject(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPObjectView_LDAPObject
	 */
	public final interfaceconfiguration.proxies.LDAPObject getLDAPObjectView_LDAPObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.LDAPObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LDAPObjectView_LDAPObject.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.LDAPObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LDAPObjectView_LDAPObject
	 * @param ldapobjectview_ldapobject
	 */
	public final void setLDAPObjectView_LDAPObject(interfaceconfiguration.proxies.LDAPObject ldapobjectview_ldapobject)
	{
		setLDAPObjectView_LDAPObject(getContext(), ldapobjectview_ldapobject);
	}

	/**
	 * Set value of LDAPObjectView_LDAPObject
	 * @param context
	 * @param ldapobjectview_ldapobject
	 */
	public final void setLDAPObjectView_LDAPObject(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.LDAPObject ldapobjectview_ldapobject)
	{
		if (ldapobjectview_ldapobject == null)
			getMendixObject().setValue(context, MemberNames.LDAPObjectView_LDAPObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LDAPObjectView_LDAPObject.toString(), ldapobjectview_ldapobject.getMendixObject().getId());
	}

	/**
	 * @return value of LDAPObjectView_ParentLDAPObject
	 */
	public final interfaceconfiguration.proxies.LDAPObject getLDAPObjectView_ParentLDAPObject() throws com.mendix.core.CoreException
	{
		return getLDAPObjectView_ParentLDAPObject(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPObjectView_ParentLDAPObject
	 */
	public final interfaceconfiguration.proxies.LDAPObject getLDAPObjectView_ParentLDAPObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.LDAPObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LDAPObjectView_ParentLDAPObject.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.LDAPObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LDAPObjectView_ParentLDAPObject
	 * @param ldapobjectview_parentldapobject
	 */
	public final void setLDAPObjectView_ParentLDAPObject(interfaceconfiguration.proxies.LDAPObject ldapobjectview_parentldapobject)
	{
		setLDAPObjectView_ParentLDAPObject(getContext(), ldapobjectview_parentldapobject);
	}

	/**
	 * Set value of LDAPObjectView_ParentLDAPObject
	 * @param context
	 * @param ldapobjectview_parentldapobject
	 */
	public final void setLDAPObjectView_ParentLDAPObject(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.LDAPObject ldapobjectview_parentldapobject)
	{
		if (ldapobjectview_parentldapobject == null)
			getMendixObject().setValue(context, MemberNames.LDAPObjectView_ParentLDAPObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LDAPObjectView_ParentLDAPObject.toString(), ldapobjectview_parentldapobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return lDAPObjectViewMendixObject;
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
			final interfaceconfiguration.proxies.LDAPObjectView that = (interfaceconfiguration.proxies.LDAPObjectView) obj;
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
		return "InterfaceConfiguration.LDAPObjectView";
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
