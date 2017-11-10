// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nap.proxies;

public class Contact_Info
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject contact_InfoMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NAP.Contact_Info";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Detail("Detail"),
		ContactType("ContactType"),
		Shared("Shared"),
		FromLDAP("FromLDAP"),
		IsDefaultPerType("IsDefaultPerType"),
		InterfaceGUID("InterfaceGUID"),
		Person_Contact_Info("NAP.Person_Contact_Info"),
		Contact_Info_DataAccess("NAP.Contact_Info_DataAccess");

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

	public Contact_Info(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "NAP.Contact_Info"));
	}

	protected Contact_Info(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject contact_InfoMendixObject)
	{
		if (contact_InfoMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("NAP.Contact_Info", contact_InfoMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a NAP.Contact_Info");

		this.contact_InfoMendixObject = contact_InfoMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Contact_Info.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static nap.proxies.Contact_Info initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nap.proxies.Contact_Info.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static nap.proxies.Contact_Info initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nap.proxies.Contact_Info(context, mendixObject);
	}

	public static nap.proxies.Contact_Info load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nap.proxies.Contact_Info.initialize(context, mendixObject);
	}

	public static java.util.List<nap.proxies.Contact_Info> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<nap.proxies.Contact_Info> result = new java.util.ArrayList<nap.proxies.Contact_Info>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//NAP.Contact_Info" + xpathConstraint))
			result.add(nap.proxies.Contact_Info.initialize(context, obj));
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
	 * @return value of Detail
	 */
	public final java.lang.String getDetail()
	{
		return getDetail(getContext());
	}

	/**
	 * @param context
	 * @return value of Detail
	 */
	public final java.lang.String getDetail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Detail.toString());
	}

	/**
	 * Set value of Detail
	 * @param detail
	 */
	public final void setDetail(java.lang.String detail)
	{
		setDetail(getContext(), detail);
	}

	/**
	 * Set value of Detail
	 * @param context
	 * @param detail
	 */
	public final void setDetail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String detail)
	{
		getMendixObject().setValue(context, MemberNames.Detail.toString(), detail);
	}

	/**
	 * Set value of ContactType
	 * @param contacttype
	 */
	public final nap.proxies.Contact_Types getContactType()
	{
		return getContactType(getContext());
	}

	/**
	 * @param context
	 * @return value of ContactType
	 */
	public final nap.proxies.Contact_Types getContactType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ContactType.toString());
		if (obj == null)
			return null;

		return nap.proxies.Contact_Types.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ContactType
	 * @param contacttype
	 */
	public final void setContactType(nap.proxies.Contact_Types contacttype)
	{
		setContactType(getContext(), contacttype);
	}

	/**
	 * Set value of ContactType
	 * @param context
	 * @param contacttype
	 */
	public final void setContactType(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Contact_Types contacttype)
	{
		if (contacttype != null)
			getMendixObject().setValue(context, MemberNames.ContactType.toString(), contacttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ContactType.toString(), null);
	}

	/**
	 * @return value of Shared
	 */
	public final java.lang.Boolean getShared()
	{
		return getShared(getContext());
	}

	/**
	 * @param context
	 * @return value of Shared
	 */
	public final java.lang.Boolean getShared(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Shared.toString());
	}

	/**
	 * Set value of Shared
	 * @param shared
	 */
	public final void setShared(java.lang.Boolean shared)
	{
		setShared(getContext(), shared);
	}

	/**
	 * Set value of Shared
	 * @param context
	 * @param shared
	 */
	public final void setShared(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean shared)
	{
		getMendixObject().setValue(context, MemberNames.Shared.toString(), shared);
	}

	/**
	 * @return value of FromLDAP
	 */
	public final java.lang.Boolean getFromLDAP()
	{
		return getFromLDAP(getContext());
	}

	/**
	 * @param context
	 * @return value of FromLDAP
	 */
	public final java.lang.Boolean getFromLDAP(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.FromLDAP.toString());
	}

	/**
	 * Set value of FromLDAP
	 * @param fromldap
	 */
	public final void setFromLDAP(java.lang.Boolean fromldap)
	{
		setFromLDAP(getContext(), fromldap);
	}

	/**
	 * Set value of FromLDAP
	 * @param context
	 * @param fromldap
	 */
	public final void setFromLDAP(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean fromldap)
	{
		getMendixObject().setValue(context, MemberNames.FromLDAP.toString(), fromldap);
	}

	/**
	 * @return value of IsDefaultPerType
	 */
	public final java.lang.Boolean getIsDefaultPerType()
	{
		return getIsDefaultPerType(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDefaultPerType
	 */
	public final java.lang.Boolean getIsDefaultPerType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsDefaultPerType.toString());
	}

	/**
	 * Set value of IsDefaultPerType
	 * @param isdefaultpertype
	 */
	public final void setIsDefaultPerType(java.lang.Boolean isdefaultpertype)
	{
		setIsDefaultPerType(getContext(), isdefaultpertype);
	}

	/**
	 * Set value of IsDefaultPerType
	 * @param context
	 * @param isdefaultpertype
	 */
	public final void setIsDefaultPerType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdefaultpertype)
	{
		getMendixObject().setValue(context, MemberNames.IsDefaultPerType.toString(), isdefaultpertype);
	}

	/**
	 * @return value of InterfaceGUID
	 */
	public final java.lang.String getInterfaceGUID()
	{
		return getInterfaceGUID(getContext());
	}

	/**
	 * @param context
	 * @return value of InterfaceGUID
	 */
	public final java.lang.String getInterfaceGUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InterfaceGUID.toString());
	}

	/**
	 * Set value of InterfaceGUID
	 * @param interfaceguid
	 */
	public final void setInterfaceGUID(java.lang.String interfaceguid)
	{
		setInterfaceGUID(getContext(), interfaceguid);
	}

	/**
	 * Set value of InterfaceGUID
	 * @param context
	 * @param interfaceguid
	 */
	public final void setInterfaceGUID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String interfaceguid)
	{
		getMendixObject().setValue(context, MemberNames.InterfaceGUID.toString(), interfaceguid);
	}

	/**
	 * @return value of Person_Contact_Info
	 */
	public final java.util.List<nap.proxies.Person> getPerson_Contact_Info() throws com.mendix.core.CoreException
	{
		return getPerson_Contact_Info(getContext());
	}

	/**
	 * @param context
	 * @return value of Person_Contact_Info
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<nap.proxies.Person> getPerson_Contact_Info(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<nap.proxies.Person> result = new java.util.ArrayList<nap.proxies.Person>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Person_Contact_Info.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(nap.proxies.Person.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Person_Contact_Info
	 * @param person_contact_info
	 */
	public final void setPerson_Contact_Info(java.util.List<nap.proxies.Person> person_contact_info)
	{
		setPerson_Contact_Info(getContext(), person_contact_info);
	}

	/**
	 * Set value of Person_Contact_Info
	 * @param context
	 * @param person_contact_info
	 */
	public final void setPerson_Contact_Info(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<nap.proxies.Person> person_contact_info)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (nap.proxies.Person proxyObject : person_contact_info)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Person_Contact_Info.toString(), identifiers);
	}

	/**
	 * @return value of Contact_Info_DataAccess
	 */
	public final java.util.List<da.proxies.Label> getContact_Info_DataAccess() throws com.mendix.core.CoreException
	{
		return getContact_Info_DataAccess(getContext());
	}

	/**
	 * @param context
	 * @return value of Contact_Info_DataAccess
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<da.proxies.Label> getContact_Info_DataAccess(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<da.proxies.Label> result = new java.util.ArrayList<da.proxies.Label>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Contact_Info_DataAccess.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(da.proxies.Label.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Contact_Info_DataAccess
	 * @param contact_info_dataaccess
	 */
	public final void setContact_Info_DataAccess(java.util.List<da.proxies.Label> contact_info_dataaccess)
	{
		setContact_Info_DataAccess(getContext(), contact_info_dataaccess);
	}

	/**
	 * Set value of Contact_Info_DataAccess
	 * @param context
	 * @param contact_info_dataaccess
	 */
	public final void setContact_Info_DataAccess(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<da.proxies.Label> contact_info_dataaccess)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (da.proxies.Label proxyObject : contact_info_dataaccess)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Contact_Info_DataAccess.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return contact_InfoMendixObject;
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
			final nap.proxies.Contact_Info that = (nap.proxies.Contact_Info) obj;
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
		return "NAP.Contact_Info";
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