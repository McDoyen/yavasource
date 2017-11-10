// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nap.proxies;

public class PersonBusinessRole
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject personBusinessRoleMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NAP.PersonBusinessRole";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PersonBusinessRole_BusinessRole("NAP.PersonBusinessRole_BusinessRole"),
		PersonBusinessRole_Person("NAP.PersonBusinessRole_Person"),
		PersonBusinessRole_Organisation("NAP.PersonBusinessRole_Organisation");

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

	public PersonBusinessRole(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "NAP.PersonBusinessRole"));
	}

	protected PersonBusinessRole(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject personBusinessRoleMendixObject)
	{
		if (personBusinessRoleMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("NAP.PersonBusinessRole", personBusinessRoleMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a NAP.PersonBusinessRole");

		this.personBusinessRoleMendixObject = personBusinessRoleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PersonBusinessRole.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static nap.proxies.PersonBusinessRole initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nap.proxies.PersonBusinessRole.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static nap.proxies.PersonBusinessRole initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nap.proxies.PersonBusinessRole(context, mendixObject);
	}

	public static nap.proxies.PersonBusinessRole load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nap.proxies.PersonBusinessRole.initialize(context, mendixObject);
	}

	public static java.util.List<nap.proxies.PersonBusinessRole> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<nap.proxies.PersonBusinessRole> result = new java.util.ArrayList<nap.proxies.PersonBusinessRole>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//NAP.PersonBusinessRole" + xpathConstraint))
			result.add(nap.proxies.PersonBusinessRole.initialize(context, obj));
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
	 * @return value of PersonBusinessRole_BusinessRole
	 */
	public final nap.proxies.BusinessRole getPersonBusinessRole_BusinessRole() throws com.mendix.core.CoreException
	{
		return getPersonBusinessRole_BusinessRole(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonBusinessRole_BusinessRole
	 */
	public final nap.proxies.BusinessRole getPersonBusinessRole_BusinessRole(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.BusinessRole result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PersonBusinessRole_BusinessRole.toString());
		if (identifier != null)
			result = nap.proxies.BusinessRole.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PersonBusinessRole_BusinessRole
	 * @param personbusinessrole_businessrole
	 */
	public final void setPersonBusinessRole_BusinessRole(nap.proxies.BusinessRole personbusinessrole_businessrole)
	{
		setPersonBusinessRole_BusinessRole(getContext(), personbusinessrole_businessrole);
	}

	/**
	 * Set value of PersonBusinessRole_BusinessRole
	 * @param context
	 * @param personbusinessrole_businessrole
	 */
	public final void setPersonBusinessRole_BusinessRole(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.BusinessRole personbusinessrole_businessrole)
	{
		if (personbusinessrole_businessrole == null)
			getMendixObject().setValue(context, MemberNames.PersonBusinessRole_BusinessRole.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PersonBusinessRole_BusinessRole.toString(), personbusinessrole_businessrole.getMendixObject().getId());
	}

	/**
	 * @return value of PersonBusinessRole_Person
	 */
	public final nap.proxies.Person getPersonBusinessRole_Person() throws com.mendix.core.CoreException
	{
		return getPersonBusinessRole_Person(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonBusinessRole_Person
	 */
	public final nap.proxies.Person getPersonBusinessRole_Person(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PersonBusinessRole_Person.toString());
		if (identifier != null)
			result = nap.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PersonBusinessRole_Person
	 * @param personbusinessrole_person
	 */
	public final void setPersonBusinessRole_Person(nap.proxies.Person personbusinessrole_person)
	{
		setPersonBusinessRole_Person(getContext(), personbusinessrole_person);
	}

	/**
	 * Set value of PersonBusinessRole_Person
	 * @param context
	 * @param personbusinessrole_person
	 */
	public final void setPersonBusinessRole_Person(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Person personbusinessrole_person)
	{
		if (personbusinessrole_person == null)
			getMendixObject().setValue(context, MemberNames.PersonBusinessRole_Person.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PersonBusinessRole_Person.toString(), personbusinessrole_person.getMendixObject().getId());
	}

	/**
	 * @return value of PersonBusinessRole_Organisation
	 */
	public final nap.proxies.Organisation getPersonBusinessRole_Organisation() throws com.mendix.core.CoreException
	{
		return getPersonBusinessRole_Organisation(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonBusinessRole_Organisation
	 */
	public final nap.proxies.Organisation getPersonBusinessRole_Organisation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Organisation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PersonBusinessRole_Organisation.toString());
		if (identifier != null)
			result = nap.proxies.Organisation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PersonBusinessRole_Organisation
	 * @param personbusinessrole_organisation
	 */
	public final void setPersonBusinessRole_Organisation(nap.proxies.Organisation personbusinessrole_organisation)
	{
		setPersonBusinessRole_Organisation(getContext(), personbusinessrole_organisation);
	}

	/**
	 * Set value of PersonBusinessRole_Organisation
	 * @param context
	 * @param personbusinessrole_organisation
	 */
	public final void setPersonBusinessRole_Organisation(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Organisation personbusinessrole_organisation)
	{
		if (personbusinessrole_organisation == null)
			getMendixObject().setValue(context, MemberNames.PersonBusinessRole_Organisation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PersonBusinessRole_Organisation.toString(), personbusinessrole_organisation.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return personBusinessRoleMendixObject;
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
			final nap.proxies.PersonBusinessRole that = (nap.proxies.PersonBusinessRole) obj;
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
		return "NAP.PersonBusinessRole";
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