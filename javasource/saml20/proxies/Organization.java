// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package saml20.proxies;

public class Organization
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject organizationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAML20.Organization";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Organization_EntityDescriptor("SAML20.Organization_EntityDescriptor");

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

	public Organization(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAML20.Organization"));
	}

	protected Organization(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject organizationMendixObject)
	{
		if (organizationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAML20.Organization", organizationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAML20.Organization");

		this.organizationMendixObject = organizationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Organization.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static saml20.proxies.Organization initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return saml20.proxies.Organization.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static saml20.proxies.Organization initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new saml20.proxies.Organization(context, mendixObject);
	}

	public static saml20.proxies.Organization load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return saml20.proxies.Organization.initialize(context, mendixObject);
	}

	public static java.util.List<saml20.proxies.Organization> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<saml20.proxies.Organization> result = new java.util.ArrayList<saml20.proxies.Organization>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SAML20.Organization" + xpathConstraint))
			result.add(saml20.proxies.Organization.initialize(context, obj));
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
	 * @return value of Organization_EntityDescriptor
	 */
	public final saml20.proxies.EntityDescriptor getOrganization_EntityDescriptor() throws com.mendix.core.CoreException
	{
		return getOrganization_EntityDescriptor(getContext());
	}

	/**
	 * @param context
	 * @return value of Organization_EntityDescriptor
	 */
	public final saml20.proxies.EntityDescriptor getOrganization_EntityDescriptor(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		saml20.proxies.EntityDescriptor result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Organization_EntityDescriptor.toString());
		if (identifier != null)
			result = saml20.proxies.EntityDescriptor.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Organization_EntityDescriptor
	 * @param organization_entitydescriptor
	 */
	public final void setOrganization_EntityDescriptor(saml20.proxies.EntityDescriptor organization_entitydescriptor)
	{
		setOrganization_EntityDescriptor(getContext(), organization_entitydescriptor);
	}

	/**
	 * Set value of Organization_EntityDescriptor
	 * @param context
	 * @param organization_entitydescriptor
	 */
	public final void setOrganization_EntityDescriptor(com.mendix.systemwideinterfaces.core.IContext context, saml20.proxies.EntityDescriptor organization_entitydescriptor)
	{
		if (organization_entitydescriptor == null)
			getMendixObject().setValue(context, MemberNames.Organization_EntityDescriptor.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Organization_EntityDescriptor.toString(), organization_entitydescriptor.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return organizationMendixObject;
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
			final saml20.proxies.Organization that = (saml20.proxies.Organization) obj;
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
		return "SAML20.Organization";
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