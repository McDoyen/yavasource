// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerequests.proxies;

public class Person extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRequests.Person";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PersonFirstName("PersonFirstName"),
		PersonLastName("PersonLastName"),
		PersonJoin("PersonJoin"),
		PersonTitleString("PersonTitleString"),
		PersonTitleEnum("PersonTitleEnum"),
		PersonJobTitle("PersonJobTitle"),
		PersonFullName("PersonFullName"),
		AccountName("AccountName"),
		IncomingRequest_InterfaceSharedPerson("InterfaceRequests.IncomingRequest_InterfaceSharedPerson"),
		IncomingRequest_InterfaceSharedPersonCaller("InterfaceRequests.IncomingRequest_InterfaceSharedPersonCaller"),
		Person_PersonContainerExpertDesk("InterfaceRequests.Person_PersonContainerExpertDesk"),
		Person_PersonCallerContainerExpertDesk("InterfaceRequests.Person_PersonCallerContainerExpertDesk"),
		IncomingRequest_InterfaceSharedAssignedPerson("InterfaceRequests.IncomingRequest_InterfaceSharedAssignedPerson"),
		IncomingRequestUpdate_InterfaceSharedAssignedPerson("InterfaceRequestUpdate.IncomingRequestUpdate_InterfaceSharedAssignedPerson");

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

	public Person(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRequests.Person"));
	}

	protected Person(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject personMendixObject)
	{
		super(context, personMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRequests.Person", personMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRequests.Person");
	}

	/**
	 * @deprecated Use 'Person.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerequests.proxies.Person initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerequests.proxies.Person.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerequests.proxies.Person initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerequests.proxies.Person(context, mendixObject);
	}

	public static interfacerequests.proxies.Person load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerequests.proxies.Person.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerequests.proxies.Person> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerequests.proxies.Person> result = new java.util.ArrayList<interfacerequests.proxies.Person>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRequests.Person" + xpathConstraint))
			result.add(interfacerequests.proxies.Person.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of PersonFirstName
	 */
	public final java.lang.String getPersonFirstName()
	{
		return getPersonFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonFirstName
	 */
	public final java.lang.String getPersonFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PersonFirstName.toString());
	}

	/**
	 * Set value of PersonFirstName
	 * @param personfirstname
	 */
	public final void setPersonFirstName(java.lang.String personfirstname)
	{
		setPersonFirstName(getContext(), personfirstname);
	}

	/**
	 * Set value of PersonFirstName
	 * @param context
	 * @param personfirstname
	 */
	public final void setPersonFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String personfirstname)
	{
		getMendixObject().setValue(context, MemberNames.PersonFirstName.toString(), personfirstname);
	}

	/**
	 * @return value of PersonLastName
	 */
	public final java.lang.String getPersonLastName()
	{
		return getPersonLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLastName
	 */
	public final java.lang.String getPersonLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PersonLastName.toString());
	}

	/**
	 * Set value of PersonLastName
	 * @param personlastname
	 */
	public final void setPersonLastName(java.lang.String personlastname)
	{
		setPersonLastName(getContext(), personlastname);
	}

	/**
	 * Set value of PersonLastName
	 * @param context
	 * @param personlastname
	 */
	public final void setPersonLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String personlastname)
	{
		getMendixObject().setValue(context, MemberNames.PersonLastName.toString(), personlastname);
	}

	/**
	 * @return value of PersonJoin
	 */
	public final java.lang.String getPersonJoin()
	{
		return getPersonJoin(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonJoin
	 */
	public final java.lang.String getPersonJoin(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PersonJoin.toString());
	}

	/**
	 * Set value of PersonJoin
	 * @param personjoin
	 */
	public final void setPersonJoin(java.lang.String personjoin)
	{
		setPersonJoin(getContext(), personjoin);
	}

	/**
	 * Set value of PersonJoin
	 * @param context
	 * @param personjoin
	 */
	public final void setPersonJoin(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String personjoin)
	{
		getMendixObject().setValue(context, MemberNames.PersonJoin.toString(), personjoin);
	}

	/**
	 * @return value of PersonTitleString
	 */
	public final java.lang.String getPersonTitleString()
	{
		return getPersonTitleString(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonTitleString
	 */
	public final java.lang.String getPersonTitleString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PersonTitleString.toString());
	}

	/**
	 * Set value of PersonTitleString
	 * @param persontitlestring
	 */
	public final void setPersonTitleString(java.lang.String persontitlestring)
	{
		setPersonTitleString(getContext(), persontitlestring);
	}

	/**
	 * Set value of PersonTitleString
	 * @param context
	 * @param persontitlestring
	 */
	public final void setPersonTitleString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String persontitlestring)
	{
		getMendixObject().setValue(context, MemberNames.PersonTitleString.toString(), persontitlestring);
	}

	/**
	 * Set value of PersonTitleEnum
	 * @param persontitleenum
	 */
	public final nap.proxies.Titles getPersonTitleEnum()
	{
		return getPersonTitleEnum(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonTitleEnum
	 */
	public final nap.proxies.Titles getPersonTitleEnum(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.PersonTitleEnum.toString());
		if (obj == null)
			return null;

		return nap.proxies.Titles.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of PersonTitleEnum
	 * @param persontitleenum
	 */
	public final void setPersonTitleEnum(nap.proxies.Titles persontitleenum)
	{
		setPersonTitleEnum(getContext(), persontitleenum);
	}

	/**
	 * Set value of PersonTitleEnum
	 * @param context
	 * @param persontitleenum
	 */
	public final void setPersonTitleEnum(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Titles persontitleenum)
	{
		if (persontitleenum != null)
			getMendixObject().setValue(context, MemberNames.PersonTitleEnum.toString(), persontitleenum.toString());
		else
			getMendixObject().setValue(context, MemberNames.PersonTitleEnum.toString(), null);
	}

	/**
	 * @return value of PersonJobTitle
	 */
	public final java.lang.String getPersonJobTitle()
	{
		return getPersonJobTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonJobTitle
	 */
	public final java.lang.String getPersonJobTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PersonJobTitle.toString());
	}

	/**
	 * Set value of PersonJobTitle
	 * @param personjobtitle
	 */
	public final void setPersonJobTitle(java.lang.String personjobtitle)
	{
		setPersonJobTitle(getContext(), personjobtitle);
	}

	/**
	 * Set value of PersonJobTitle
	 * @param context
	 * @param personjobtitle
	 */
	public final void setPersonJobTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String personjobtitle)
	{
		getMendixObject().setValue(context, MemberNames.PersonJobTitle.toString(), personjobtitle);
	}

	/**
	 * @return value of PersonFullName
	 */
	public final java.lang.String getPersonFullName()
	{
		return getPersonFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonFullName
	 */
	public final java.lang.String getPersonFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PersonFullName.toString());
	}

	/**
	 * Set value of PersonFullName
	 * @param personfullname
	 */
	public final void setPersonFullName(java.lang.String personfullname)
	{
		setPersonFullName(getContext(), personfullname);
	}

	/**
	 * Set value of PersonFullName
	 * @param context
	 * @param personfullname
	 */
	public final void setPersonFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String personfullname)
	{
		getMendixObject().setValue(context, MemberNames.PersonFullName.toString(), personfullname);
	}

	/**
	 * @return value of AccountName
	 */
	public final java.lang.String getAccountName()
	{
		return getAccountName(getContext());
	}

	/**
	 * @param context
	 * @return value of AccountName
	 */
	public final java.lang.String getAccountName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AccountName.toString());
	}

	/**
	 * Set value of AccountName
	 * @param accountname
	 */
	public final void setAccountName(java.lang.String accountname)
	{
		setAccountName(getContext(), accountname);
	}

	/**
	 * Set value of AccountName
	 * @param context
	 * @param accountname
	 */
	public final void setAccountName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String accountname)
	{
		getMendixObject().setValue(context, MemberNames.AccountName.toString(), accountname);
	}

	/**
	 * @return value of IncomingRequest_InterfaceSharedPerson
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_InterfaceSharedPerson() throws com.mendix.core.CoreException
	{
		return getIncomingRequest_InterfaceSharedPerson(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingRequest_InterfaceSharedPerson
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_InterfaceSharedPerson(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.IncomingRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingRequest_InterfaceSharedPerson.toString());
		if (identifier != null)
			result = interfacerequests.proxies.IncomingRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingRequest_InterfaceSharedPerson
	 * @param incomingrequest_interfacesharedperson
	 */
	public final void setIncomingRequest_InterfaceSharedPerson(interfacerequests.proxies.IncomingRequest incomingrequest_interfacesharedperson)
	{
		setIncomingRequest_InterfaceSharedPerson(getContext(), incomingrequest_interfacesharedperson);
	}

	/**
	 * Set value of IncomingRequest_InterfaceSharedPerson
	 * @param context
	 * @param incomingrequest_interfacesharedperson
	 */
	public final void setIncomingRequest_InterfaceSharedPerson(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.IncomingRequest incomingrequest_interfacesharedperson)
	{
		if (incomingrequest_interfacesharedperson == null)
			getMendixObject().setValue(context, MemberNames.IncomingRequest_InterfaceSharedPerson.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingRequest_InterfaceSharedPerson.toString(), incomingrequest_interfacesharedperson.getMendixObject().getId());
	}

	/**
	 * @return value of IncomingRequest_InterfaceSharedPersonCaller
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_InterfaceSharedPersonCaller() throws com.mendix.core.CoreException
	{
		return getIncomingRequest_InterfaceSharedPersonCaller(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingRequest_InterfaceSharedPersonCaller
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_InterfaceSharedPersonCaller(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.IncomingRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingRequest_InterfaceSharedPersonCaller.toString());
		if (identifier != null)
			result = interfacerequests.proxies.IncomingRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingRequest_InterfaceSharedPersonCaller
	 * @param incomingrequest_interfacesharedpersoncaller
	 */
	public final void setIncomingRequest_InterfaceSharedPersonCaller(interfacerequests.proxies.IncomingRequest incomingrequest_interfacesharedpersoncaller)
	{
		setIncomingRequest_InterfaceSharedPersonCaller(getContext(), incomingrequest_interfacesharedpersoncaller);
	}

	/**
	 * Set value of IncomingRequest_InterfaceSharedPersonCaller
	 * @param context
	 * @param incomingrequest_interfacesharedpersoncaller
	 */
	public final void setIncomingRequest_InterfaceSharedPersonCaller(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.IncomingRequest incomingrequest_interfacesharedpersoncaller)
	{
		if (incomingrequest_interfacesharedpersoncaller == null)
			getMendixObject().setValue(context, MemberNames.IncomingRequest_InterfaceSharedPersonCaller.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingRequest_InterfaceSharedPersonCaller.toString(), incomingrequest_interfacesharedpersoncaller.getMendixObject().getId());
	}

	/**
	 * @return value of Person_PersonContainerExpertDesk
	 */
	public final interfacerequests.proxies.PersonContainerExpertDesk getPerson_PersonContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getPerson_PersonContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of Person_PersonContainerExpertDesk
	 */
	public final interfacerequests.proxies.PersonContainerExpertDesk getPerson_PersonContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.PersonContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Person_PersonContainerExpertDesk.toString());
		if (identifier != null)
			result = interfacerequests.proxies.PersonContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Person_PersonContainerExpertDesk
	 * @param person_personcontainerexpertdesk
	 */
	public final void setPerson_PersonContainerExpertDesk(interfacerequests.proxies.PersonContainerExpertDesk person_personcontainerexpertdesk)
	{
		setPerson_PersonContainerExpertDesk(getContext(), person_personcontainerexpertdesk);
	}

	/**
	 * Set value of Person_PersonContainerExpertDesk
	 * @param context
	 * @param person_personcontainerexpertdesk
	 */
	public final void setPerson_PersonContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.PersonContainerExpertDesk person_personcontainerexpertdesk)
	{
		if (person_personcontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.Person_PersonContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Person_PersonContainerExpertDesk.toString(), person_personcontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of Person_PersonCallerContainerExpertDesk
	 */
	public final interfacerequests.proxies.PersonCallerContainerExpertDesk getPerson_PersonCallerContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getPerson_PersonCallerContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of Person_PersonCallerContainerExpertDesk
	 */
	public final interfacerequests.proxies.PersonCallerContainerExpertDesk getPerson_PersonCallerContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.PersonCallerContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Person_PersonCallerContainerExpertDesk.toString());
		if (identifier != null)
			result = interfacerequests.proxies.PersonCallerContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Person_PersonCallerContainerExpertDesk
	 * @param person_personcallercontainerexpertdesk
	 */
	public final void setPerson_PersonCallerContainerExpertDesk(interfacerequests.proxies.PersonCallerContainerExpertDesk person_personcallercontainerexpertdesk)
	{
		setPerson_PersonCallerContainerExpertDesk(getContext(), person_personcallercontainerexpertdesk);
	}

	/**
	 * Set value of Person_PersonCallerContainerExpertDesk
	 * @param context
	 * @param person_personcallercontainerexpertdesk
	 */
	public final void setPerson_PersonCallerContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.PersonCallerContainerExpertDesk person_personcallercontainerexpertdesk)
	{
		if (person_personcallercontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.Person_PersonCallerContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Person_PersonCallerContainerExpertDesk.toString(), person_personcallercontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of IncomingRequest_InterfaceSharedAssignedPerson
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_InterfaceSharedAssignedPerson() throws com.mendix.core.CoreException
	{
		return getIncomingRequest_InterfaceSharedAssignedPerson(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingRequest_InterfaceSharedAssignedPerson
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_InterfaceSharedAssignedPerson(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.IncomingRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingRequest_InterfaceSharedAssignedPerson.toString());
		if (identifier != null)
			result = interfacerequests.proxies.IncomingRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingRequest_InterfaceSharedAssignedPerson
	 * @param incomingrequest_interfacesharedassignedperson
	 */
	public final void setIncomingRequest_InterfaceSharedAssignedPerson(interfacerequests.proxies.IncomingRequest incomingrequest_interfacesharedassignedperson)
	{
		setIncomingRequest_InterfaceSharedAssignedPerson(getContext(), incomingrequest_interfacesharedassignedperson);
	}

	/**
	 * Set value of IncomingRequest_InterfaceSharedAssignedPerson
	 * @param context
	 * @param incomingrequest_interfacesharedassignedperson
	 */
	public final void setIncomingRequest_InterfaceSharedAssignedPerson(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.IncomingRequest incomingrequest_interfacesharedassignedperson)
	{
		if (incomingrequest_interfacesharedassignedperson == null)
			getMendixObject().setValue(context, MemberNames.IncomingRequest_InterfaceSharedAssignedPerson.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingRequest_InterfaceSharedAssignedPerson.toString(), incomingrequest_interfacesharedassignedperson.getMendixObject().getId());
	}

	/**
	 * @return value of IncomingRequestUpdate_InterfaceSharedAssignedPerson
	 */
	public final interfacerequestupdate.proxies.IncomingRequestUpdate getIncomingRequestUpdate_InterfaceSharedAssignedPerson() throws com.mendix.core.CoreException
	{
		return getIncomingRequestUpdate_InterfaceSharedAssignedPerson(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingRequestUpdate_InterfaceSharedAssignedPerson
	 */
	public final interfacerequestupdate.proxies.IncomingRequestUpdate getIncomingRequestUpdate_InterfaceSharedAssignedPerson(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequestupdate.proxies.IncomingRequestUpdate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingRequestUpdate_InterfaceSharedAssignedPerson.toString());
		if (identifier != null)
			result = interfacerequestupdate.proxies.IncomingRequestUpdate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingRequestUpdate_InterfaceSharedAssignedPerson
	 * @param incomingrequestupdate_interfacesharedassignedperson
	 */
	public final void setIncomingRequestUpdate_InterfaceSharedAssignedPerson(interfacerequestupdate.proxies.IncomingRequestUpdate incomingrequestupdate_interfacesharedassignedperson)
	{
		setIncomingRequestUpdate_InterfaceSharedAssignedPerson(getContext(), incomingrequestupdate_interfacesharedassignedperson);
	}

	/**
	 * Set value of IncomingRequestUpdate_InterfaceSharedAssignedPerson
	 * @param context
	 * @param incomingrequestupdate_interfacesharedassignedperson
	 */
	public final void setIncomingRequestUpdate_InterfaceSharedAssignedPerson(com.mendix.systemwideinterfaces.core.IContext context, interfacerequestupdate.proxies.IncomingRequestUpdate incomingrequestupdate_interfacesharedassignedperson)
	{
		if (incomingrequestupdate_interfacesharedassignedperson == null)
			getMendixObject().setValue(context, MemberNames.IncomingRequestUpdate_InterfaceSharedAssignedPerson.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingRequestUpdate_InterfaceSharedAssignedPerson.toString(), incomingrequestupdate_interfacesharedassignedperson.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacerequests.proxies.Person that = (interfacerequests.proxies.Person) obj;
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
		return "InterfaceRequests.Person";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
