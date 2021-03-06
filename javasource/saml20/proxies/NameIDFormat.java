// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package saml20.proxies;

public class NameIDFormat
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject nameIDFormatMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAML20.NameIDFormat";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Description("Description"),
		NameIDFormat_RoleDescriptor("SAML20.NameIDFormat_RoleDescriptor");

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

	public NameIDFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAML20.NameIDFormat"));
	}

	protected NameIDFormat(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject nameIDFormatMendixObject)
	{
		if (nameIDFormatMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAML20.NameIDFormat", nameIDFormatMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAML20.NameIDFormat");

		this.nameIDFormatMendixObject = nameIDFormatMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'NameIDFormat.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static saml20.proxies.NameIDFormat initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return saml20.proxies.NameIDFormat.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static saml20.proxies.NameIDFormat initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new saml20.proxies.NameIDFormat(context, mendixObject);
	}

	public static saml20.proxies.NameIDFormat load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return saml20.proxies.NameIDFormat.initialize(context, mendixObject);
	}

	public static java.util.List<saml20.proxies.NameIDFormat> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<saml20.proxies.NameIDFormat> result = new java.util.ArrayList<saml20.proxies.NameIDFormat>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SAML20.NameIDFormat" + xpathConstraint))
			result.add(saml20.proxies.NameIDFormat.initialize(context, obj));
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
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of NameIDFormat_RoleDescriptor
	 */
	public final saml20.proxies.RoleDescriptor getNameIDFormat_RoleDescriptor() throws com.mendix.core.CoreException
	{
		return getNameIDFormat_RoleDescriptor(getContext());
	}

	/**
	 * @param context
	 * @return value of NameIDFormat_RoleDescriptor
	 */
	public final saml20.proxies.RoleDescriptor getNameIDFormat_RoleDescriptor(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		saml20.proxies.RoleDescriptor result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NameIDFormat_RoleDescriptor.toString());
		if (identifier != null)
			result = saml20.proxies.RoleDescriptor.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NameIDFormat_RoleDescriptor
	 * @param nameidformat_roledescriptor
	 */
	public final void setNameIDFormat_RoleDescriptor(saml20.proxies.RoleDescriptor nameidformat_roledescriptor)
	{
		setNameIDFormat_RoleDescriptor(getContext(), nameidformat_roledescriptor);
	}

	/**
	 * Set value of NameIDFormat_RoleDescriptor
	 * @param context
	 * @param nameidformat_roledescriptor
	 */
	public final void setNameIDFormat_RoleDescriptor(com.mendix.systemwideinterfaces.core.IContext context, saml20.proxies.RoleDescriptor nameidformat_roledescriptor)
	{
		if (nameidformat_roledescriptor == null)
			getMendixObject().setValue(context, MemberNames.NameIDFormat_RoleDescriptor.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NameIDFormat_RoleDescriptor.toString(), nameidformat_roledescriptor.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return nameIDFormatMendixObject;
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
			final saml20.proxies.NameIDFormat that = (saml20.proxies.NameIDFormat) obj;
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
		return "SAML20.NameIDFormat";
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
