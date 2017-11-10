// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package saml20.proxies;

public class OrganizationProperty
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject organizationPropertyMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAML20.OrganizationProperty";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_content_("_content_"),
		lang("lang"),
		Organization_OrganizationName("SAML20.Organization_OrganizationName"),
		Organization_OrganizationDisplayName("SAML20.Organization_OrganizationDisplayName"),
		Organization_OrganizationURL("SAML20.Organization_OrganizationURL");

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

	public OrganizationProperty(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAML20.OrganizationProperty"));
	}

	protected OrganizationProperty(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject organizationPropertyMendixObject)
	{
		if (organizationPropertyMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAML20.OrganizationProperty", organizationPropertyMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAML20.OrganizationProperty");

		this.organizationPropertyMendixObject = organizationPropertyMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'OrganizationProperty.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static saml20.proxies.OrganizationProperty initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return saml20.proxies.OrganizationProperty.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static saml20.proxies.OrganizationProperty initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new saml20.proxies.OrganizationProperty(context, mendixObject);
	}

	public static saml20.proxies.OrganizationProperty load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return saml20.proxies.OrganizationProperty.initialize(context, mendixObject);
	}

	public static java.util.List<saml20.proxies.OrganizationProperty> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<saml20.proxies.OrganizationProperty> result = new java.util.ArrayList<saml20.proxies.OrganizationProperty>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SAML20.OrganizationProperty" + xpathConstraint))
			result.add(saml20.proxies.OrganizationProperty.initialize(context, obj));
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
	 * @return value of _content_
	 */
	public final java.lang.String get_content_()
	{
		return get_content_(getContext());
	}

	/**
	 * @param context
	 * @return value of _content_
	 */
	public final java.lang.String get_content_(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._content_.toString());
	}

	/**
	 * Set value of _content_
	 * @param _content_
	 */
	public final void set_content_(java.lang.String _content_)
	{
		set_content_(getContext(), _content_);
	}

	/**
	 * Set value of _content_
	 * @param context
	 * @param _content_
	 */
	public final void set_content_(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _content_)
	{
		getMendixObject().setValue(context, MemberNames._content_.toString(), _content_);
	}

	/**
	 * @return value of lang
	 */
	public final java.lang.String getlang()
	{
		return getlang(getContext());
	}

	/**
	 * @param context
	 * @return value of lang
	 */
	public final java.lang.String getlang(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.lang.toString());
	}

	/**
	 * Set value of lang
	 * @param lang
	 */
	public final void setlang(java.lang.String lang)
	{
		setlang(getContext(), lang);
	}

	/**
	 * Set value of lang
	 * @param context
	 * @param lang
	 */
	public final void setlang(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lang)
	{
		getMendixObject().setValue(context, MemberNames.lang.toString(), lang);
	}

	/**
	 * @return value of Organization_OrganizationName
	 */
	public final saml20.proxies.Organization getOrganization_OrganizationName() throws com.mendix.core.CoreException
	{
		return getOrganization_OrganizationName(getContext());
	}

	/**
	 * @param context
	 * @return value of Organization_OrganizationName
	 */
	public final saml20.proxies.Organization getOrganization_OrganizationName(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		saml20.proxies.Organization result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Organization_OrganizationName.toString());
		if (identifier != null)
			result = saml20.proxies.Organization.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Organization_OrganizationName
	 * @param organization_organizationname
	 */
	public final void setOrganization_OrganizationName(saml20.proxies.Organization organization_organizationname)
	{
		setOrganization_OrganizationName(getContext(), organization_organizationname);
	}

	/**
	 * Set value of Organization_OrganizationName
	 * @param context
	 * @param organization_organizationname
	 */
	public final void setOrganization_OrganizationName(com.mendix.systemwideinterfaces.core.IContext context, saml20.proxies.Organization organization_organizationname)
	{
		if (organization_organizationname == null)
			getMendixObject().setValue(context, MemberNames.Organization_OrganizationName.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Organization_OrganizationName.toString(), organization_organizationname.getMendixObject().getId());
	}

	/**
	 * @return value of Organization_OrganizationDisplayName
	 */
	public final saml20.proxies.Organization getOrganization_OrganizationDisplayName() throws com.mendix.core.CoreException
	{
		return getOrganization_OrganizationDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of Organization_OrganizationDisplayName
	 */
	public final saml20.proxies.Organization getOrganization_OrganizationDisplayName(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		saml20.proxies.Organization result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Organization_OrganizationDisplayName.toString());
		if (identifier != null)
			result = saml20.proxies.Organization.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Organization_OrganizationDisplayName
	 * @param organization_organizationdisplayname
	 */
	public final void setOrganization_OrganizationDisplayName(saml20.proxies.Organization organization_organizationdisplayname)
	{
		setOrganization_OrganizationDisplayName(getContext(), organization_organizationdisplayname);
	}

	/**
	 * Set value of Organization_OrganizationDisplayName
	 * @param context
	 * @param organization_organizationdisplayname
	 */
	public final void setOrganization_OrganizationDisplayName(com.mendix.systemwideinterfaces.core.IContext context, saml20.proxies.Organization organization_organizationdisplayname)
	{
		if (organization_organizationdisplayname == null)
			getMendixObject().setValue(context, MemberNames.Organization_OrganizationDisplayName.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Organization_OrganizationDisplayName.toString(), organization_organizationdisplayname.getMendixObject().getId());
	}

	/**
	 * @return value of Organization_OrganizationURL
	 */
	public final saml20.proxies.Organization getOrganization_OrganizationURL() throws com.mendix.core.CoreException
	{
		return getOrganization_OrganizationURL(getContext());
	}

	/**
	 * @param context
	 * @return value of Organization_OrganizationURL
	 */
	public final saml20.proxies.Organization getOrganization_OrganizationURL(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		saml20.proxies.Organization result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Organization_OrganizationURL.toString());
		if (identifier != null)
			result = saml20.proxies.Organization.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Organization_OrganizationURL
	 * @param organization_organizationurl
	 */
	public final void setOrganization_OrganizationURL(saml20.proxies.Organization organization_organizationurl)
	{
		setOrganization_OrganizationURL(getContext(), organization_organizationurl);
	}

	/**
	 * Set value of Organization_OrganizationURL
	 * @param context
	 * @param organization_organizationurl
	 */
	public final void setOrganization_OrganizationURL(com.mendix.systemwideinterfaces.core.IContext context, saml20.proxies.Organization organization_organizationurl)
	{
		if (organization_organizationurl == null)
			getMendixObject().setValue(context, MemberNames.Organization_OrganizationURL.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Organization_OrganizationURL.toString(), organization_organizationurl.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return organizationPropertyMendixObject;
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
			final saml20.proxies.OrganizationProperty that = (saml20.proxies.OrganizationProperty) obj;
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
		return "SAML20.OrganizationProperty";
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