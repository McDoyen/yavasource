// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package saml20.proxies;

public class ContactProperty
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject contactPropertyMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAML20.ContactProperty";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_content_("_content_"),
		ContactType_EmailAddress("SAML20.ContactType_EmailAddress"),
		ContactType_TelephoneNumber("SAML20.ContactType_TelephoneNumber");

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

	public ContactProperty(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAML20.ContactProperty"));
	}

	protected ContactProperty(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject contactPropertyMendixObject)
	{
		if (contactPropertyMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAML20.ContactProperty", contactPropertyMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAML20.ContactProperty");

		this.contactPropertyMendixObject = contactPropertyMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ContactProperty.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static saml20.proxies.ContactProperty initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return saml20.proxies.ContactProperty.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static saml20.proxies.ContactProperty initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new saml20.proxies.ContactProperty(context, mendixObject);
	}

	public static saml20.proxies.ContactProperty load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return saml20.proxies.ContactProperty.initialize(context, mendixObject);
	}

	public static java.util.List<saml20.proxies.ContactProperty> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<saml20.proxies.ContactProperty> result = new java.util.ArrayList<saml20.proxies.ContactProperty>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SAML20.ContactProperty" + xpathConstraint))
			result.add(saml20.proxies.ContactProperty.initialize(context, obj));
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
	 * @return value of ContactType_EmailAddress
	 */
	public final saml20.proxies.Contact getContactType_EmailAddress() throws com.mendix.core.CoreException
	{
		return getContactType_EmailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of ContactType_EmailAddress
	 */
	public final saml20.proxies.Contact getContactType_EmailAddress(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		saml20.proxies.Contact result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContactType_EmailAddress.toString());
		if (identifier != null)
			result = saml20.proxies.Contact.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContactType_EmailAddress
	 * @param contacttype_emailaddress
	 */
	public final void setContactType_EmailAddress(saml20.proxies.Contact contacttype_emailaddress)
	{
		setContactType_EmailAddress(getContext(), contacttype_emailaddress);
	}

	/**
	 * Set value of ContactType_EmailAddress
	 * @param context
	 * @param contacttype_emailaddress
	 */
	public final void setContactType_EmailAddress(com.mendix.systemwideinterfaces.core.IContext context, saml20.proxies.Contact contacttype_emailaddress)
	{
		if (contacttype_emailaddress == null)
			getMendixObject().setValue(context, MemberNames.ContactType_EmailAddress.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ContactType_EmailAddress.toString(), contacttype_emailaddress.getMendixObject().getId());
	}

	/**
	 * @return value of ContactType_TelephoneNumber
	 */
	public final saml20.proxies.Contact getContactType_TelephoneNumber() throws com.mendix.core.CoreException
	{
		return getContactType_TelephoneNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of ContactType_TelephoneNumber
	 */
	public final saml20.proxies.Contact getContactType_TelephoneNumber(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		saml20.proxies.Contact result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ContactType_TelephoneNumber.toString());
		if (identifier != null)
			result = saml20.proxies.Contact.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ContactType_TelephoneNumber
	 * @param contacttype_telephonenumber
	 */
	public final void setContactType_TelephoneNumber(saml20.proxies.Contact contacttype_telephonenumber)
	{
		setContactType_TelephoneNumber(getContext(), contacttype_telephonenumber);
	}

	/**
	 * Set value of ContactType_TelephoneNumber
	 * @param context
	 * @param contacttype_telephonenumber
	 */
	public final void setContactType_TelephoneNumber(com.mendix.systemwideinterfaces.core.IContext context, saml20.proxies.Contact contacttype_telephonenumber)
	{
		if (contacttype_telephonenumber == null)
			getMendixObject().setValue(context, MemberNames.ContactType_TelephoneNumber.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ContactType_TelephoneNumber.toString(), contacttype_telephonenumber.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return contactPropertyMendixObject;
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
			final saml20.proxies.ContactProperty that = (saml20.proxies.ContactProperty) obj;
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
		return "SAML20.ContactProperty";
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
