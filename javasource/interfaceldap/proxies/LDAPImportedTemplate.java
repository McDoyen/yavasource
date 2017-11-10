// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceldap.proxies;

public class LDAPImportedTemplate
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject lDAPImportedTemplateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceLDAP.LDAPImportedTemplate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		LDAPImportedTemplates_Account("InterfaceLDAP.LDAPImportedTemplates_Account"),
		LDAPImportedTemplates_Template("InterfaceLDAP.LDAPImportedTemplates_Template");

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

	public LDAPImportedTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceLDAP.LDAPImportedTemplate"));
	}

	protected LDAPImportedTemplate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject lDAPImportedTemplateMendixObject)
	{
		if (lDAPImportedTemplateMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceLDAP.LDAPImportedTemplate", lDAPImportedTemplateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceLDAP.LDAPImportedTemplate");

		this.lDAPImportedTemplateMendixObject = lDAPImportedTemplateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LDAPImportedTemplate.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceldap.proxies.LDAPImportedTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceldap.proxies.LDAPImportedTemplate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceldap.proxies.LDAPImportedTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceldap.proxies.LDAPImportedTemplate(context, mendixObject);
	}

	public static interfaceldap.proxies.LDAPImportedTemplate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceldap.proxies.LDAPImportedTemplate.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceldap.proxies.LDAPImportedTemplate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceldap.proxies.LDAPImportedTemplate> result = new java.util.ArrayList<interfaceldap.proxies.LDAPImportedTemplate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceLDAP.LDAPImportedTemplate" + xpathConstraint))
			result.add(interfaceldap.proxies.LDAPImportedTemplate.initialize(context, obj));
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
	 * @return value of LDAPImportedTemplates_Account
	 */
	public final mendix.proxies.Account getLDAPImportedTemplates_Account() throws com.mendix.core.CoreException
	{
		return getLDAPImportedTemplates_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPImportedTemplates_Account
	 */
	public final mendix.proxies.Account getLDAPImportedTemplates_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendix.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LDAPImportedTemplates_Account.toString());
		if (identifier != null)
			result = mendix.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LDAPImportedTemplates_Account
	 * @param ldapimportedtemplates_account
	 */
	public final void setLDAPImportedTemplates_Account(mendix.proxies.Account ldapimportedtemplates_account)
	{
		setLDAPImportedTemplates_Account(getContext(), ldapimportedtemplates_account);
	}

	/**
	 * Set value of LDAPImportedTemplates_Account
	 * @param context
	 * @param ldapimportedtemplates_account
	 */
	public final void setLDAPImportedTemplates_Account(com.mendix.systemwideinterfaces.core.IContext context, mendix.proxies.Account ldapimportedtemplates_account)
	{
		if (ldapimportedtemplates_account == null)
			getMendixObject().setValue(context, MemberNames.LDAPImportedTemplates_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LDAPImportedTemplates_Account.toString(), ldapimportedtemplates_account.getMendixObject().getId());
	}

	/**
	 * @return value of LDAPImportedTemplates_Template
	 */
	public final roletemplates.proxies.Template getLDAPImportedTemplates_Template() throws com.mendix.core.CoreException
	{
		return getLDAPImportedTemplates_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPImportedTemplates_Template
	 */
	public final roletemplates.proxies.Template getLDAPImportedTemplates_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		roletemplates.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LDAPImportedTemplates_Template.toString());
		if (identifier != null)
			result = roletemplates.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LDAPImportedTemplates_Template
	 * @param ldapimportedtemplates_template
	 */
	public final void setLDAPImportedTemplates_Template(roletemplates.proxies.Template ldapimportedtemplates_template)
	{
		setLDAPImportedTemplates_Template(getContext(), ldapimportedtemplates_template);
	}

	/**
	 * Set value of LDAPImportedTemplates_Template
	 * @param context
	 * @param ldapimportedtemplates_template
	 */
	public final void setLDAPImportedTemplates_Template(com.mendix.systemwideinterfaces.core.IContext context, roletemplates.proxies.Template ldapimportedtemplates_template)
	{
		if (ldapimportedtemplates_template == null)
			getMendixObject().setValue(context, MemberNames.LDAPImportedTemplates_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LDAPImportedTemplates_Template.toString(), ldapimportedtemplates_template.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return lDAPImportedTemplateMendixObject;
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
			final interfaceldap.proxies.LDAPImportedTemplate that = (interfaceldap.proxies.LDAPImportedTemplate) obj;
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
		return "InterfaceLDAP.LDAPImportedTemplate";
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
