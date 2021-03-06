// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceldap.proxies;

public class PersonLDAPInbox extends interfaceldap.proxies.LDAPInbox
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceLDAP.PersonLDAPInbox";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FirstName("FirstName"),
		LastName("LastName"),
		Join("Join"),
		FullName("FullName"),
		Email("Email"),
		TelephoneNumber("TelephoneNumber"),
		MobileNumber("MobileNumber"),
		FaxNumber("FaxNumber"),
		UserName("UserName"),
		Language("Language"),
		TimeZone("TimeZone"),
		LocationName("LocationName"),
		OrganisationName("OrganisationName"),
		AccountActive("AccountActive"),
		LDAPID("LDAPID"),
		ProcessingStatus("ProcessingStatus"),
		LDAPID_OldStyle("LDAPID_OldStyle"),
		PersonLDAPInbox_Person("InterfaceLDAP.PersonLDAPInbox_Person"),
		PersonLDAPInbox_Account("InterfaceLDAP.PersonLDAPInbox_Account"),
		PersonLDAPInbox_Location("InterfaceLDAP.PersonLDAPInbox_Location"),
		PersonLDAPInbox_Organisation("InterfaceLDAP.PersonLDAPInbox_Organisation"),
		PersonLDAPInbox_Template("InterfaceLDAP.PersonLDAPInbox_Template"),
		PersonLDAPInbox_EmailContact_Info("InterfaceLDAP.PersonLDAPInbox_EmailContact_Info"),
		PersonLDAPInbox_TelephoneContact_Info("InterfaceLDAP.PersonLDAPInbox_TelephoneContact_Info"),
		PersonLDAPInbox_FaxContact_Info("InterfaceLDAP.PersonLDAPInbox_FaxContact_Info"),
		PersonLDAPInbox_MobileContact_Info("InterfaceLDAP.PersonLDAPInbox_MobileContact_Info"),
		LDAPInbox_LDAPImport("InterfaceLDAP.LDAPInbox_LDAPImport"),
		LDAPInbox_LDAPPath("InterfaceLDAP.LDAPInbox_LDAPPath"),
		CurrentRepeatingStructureProcessingAttempt_LDAPInbox("InterfaceShared.CurrentRepeatingStructureProcessingAttempt_LDAPInbox"),
		ParentProcessingPart_LDAPInbox("InterfaceShared.ParentProcessingPart_LDAPInbox");

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

	public PersonLDAPInbox(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceLDAP.PersonLDAPInbox"));
	}

	protected PersonLDAPInbox(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject personLDAPInboxMendixObject)
	{
		super(context, personLDAPInboxMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceLDAP.PersonLDAPInbox", personLDAPInboxMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceLDAP.PersonLDAPInbox");
	}

	/**
	 * @deprecated Use 'PersonLDAPInbox.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceldap.proxies.PersonLDAPInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceldap.proxies.PersonLDAPInbox.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceldap.proxies.PersonLDAPInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceldap.proxies.PersonLDAPInbox(context, mendixObject);
	}

	public static interfaceldap.proxies.PersonLDAPInbox load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceldap.proxies.PersonLDAPInbox.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceldap.proxies.PersonLDAPInbox> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceldap.proxies.PersonLDAPInbox> result = new java.util.ArrayList<interfaceldap.proxies.PersonLDAPInbox>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceLDAP.PersonLDAPInbox" + xpathConstraint))
			result.add(interfaceldap.proxies.PersonLDAPInbox.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of LastName
	 */
	public final java.lang.String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final java.lang.String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(java.lang.String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of Join
	 */
	public final java.lang.String getJoin()
	{
		return getJoin(getContext());
	}

	/**
	 * @param context
	 * @return value of Join
	 */
	public final java.lang.String getJoin(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Join.toString());
	}

	/**
	 * Set value of Join
	 * @param join
	 */
	public final void setJoin(java.lang.String join)
	{
		setJoin(getContext(), join);
	}

	/**
	 * Set value of Join
	 * @param context
	 * @param join
	 */
	public final void setJoin(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String join)
	{
		getMendixObject().setValue(context, MemberNames.Join.toString(), join);
	}

	/**
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return value of TelephoneNumber
	 */
	public final java.lang.String getTelephoneNumber()
	{
		return getTelephoneNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of TelephoneNumber
	 */
	public final java.lang.String getTelephoneNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TelephoneNumber.toString());
	}

	/**
	 * Set value of TelephoneNumber
	 * @param telephonenumber
	 */
	public final void setTelephoneNumber(java.lang.String telephonenumber)
	{
		setTelephoneNumber(getContext(), telephonenumber);
	}

	/**
	 * Set value of TelephoneNumber
	 * @param context
	 * @param telephonenumber
	 */
	public final void setTelephoneNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String telephonenumber)
	{
		getMendixObject().setValue(context, MemberNames.TelephoneNumber.toString(), telephonenumber);
	}

	/**
	 * @return value of MobileNumber
	 */
	public final java.lang.String getMobileNumber()
	{
		return getMobileNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of MobileNumber
	 */
	public final java.lang.String getMobileNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MobileNumber.toString());
	}

	/**
	 * Set value of MobileNumber
	 * @param mobilenumber
	 */
	public final void setMobileNumber(java.lang.String mobilenumber)
	{
		setMobileNumber(getContext(), mobilenumber);
	}

	/**
	 * Set value of MobileNumber
	 * @param context
	 * @param mobilenumber
	 */
	public final void setMobileNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mobilenumber)
	{
		getMendixObject().setValue(context, MemberNames.MobileNumber.toString(), mobilenumber);
	}

	/**
	 * @return value of FaxNumber
	 */
	public final java.lang.String getFaxNumber()
	{
		return getFaxNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of FaxNumber
	 */
	public final java.lang.String getFaxNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FaxNumber.toString());
	}

	/**
	 * Set value of FaxNumber
	 * @param faxnumber
	 */
	public final void setFaxNumber(java.lang.String faxnumber)
	{
		setFaxNumber(getContext(), faxnumber);
	}

	/**
	 * Set value of FaxNumber
	 * @param context
	 * @param faxnumber
	 */
	public final void setFaxNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String faxnumber)
	{
		getMendixObject().setValue(context, MemberNames.FaxNumber.toString(), faxnumber);
	}

	/**
	 * @return value of UserName
	 */
	public final java.lang.String getUserName()
	{
		return getUserName(getContext());
	}

	/**
	 * @param context
	 * @return value of UserName
	 */
	public final java.lang.String getUserName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UserName.toString());
	}

	/**
	 * Set value of UserName
	 * @param username
	 */
	public final void setUserName(java.lang.String username)
	{
		setUserName(getContext(), username);
	}

	/**
	 * Set value of UserName
	 * @param context
	 * @param username
	 */
	public final void setUserName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String username)
	{
		getMendixObject().setValue(context, MemberNames.UserName.toString(), username);
	}

	/**
	 * @return value of Language
	 */
	public final java.lang.String getLanguage()
	{
		return getLanguage(getContext());
	}

	/**
	 * @param context
	 * @return value of Language
	 */
	public final java.lang.String getLanguage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Language.toString());
	}

	/**
	 * Set value of Language
	 * @param language
	 */
	public final void setLanguage(java.lang.String language)
	{
		setLanguage(getContext(), language);
	}

	/**
	 * Set value of Language
	 * @param context
	 * @param language
	 */
	public final void setLanguage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String language)
	{
		getMendixObject().setValue(context, MemberNames.Language.toString(), language);
	}

	/**
	 * @return value of TimeZone
	 */
	public final java.lang.String getTimeZone()
	{
		return getTimeZone(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeZone
	 */
	public final java.lang.String getTimeZone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TimeZone.toString());
	}

	/**
	 * Set value of TimeZone
	 * @param timezone
	 */
	public final void setTimeZone(java.lang.String timezone)
	{
		setTimeZone(getContext(), timezone);
	}

	/**
	 * Set value of TimeZone
	 * @param context
	 * @param timezone
	 */
	public final void setTimeZone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String timezone)
	{
		getMendixObject().setValue(context, MemberNames.TimeZone.toString(), timezone);
	}

	/**
	 * @return value of LocationName
	 */
	public final java.lang.String getLocationName()
	{
		return getLocationName(getContext());
	}

	/**
	 * @param context
	 * @return value of LocationName
	 */
	public final java.lang.String getLocationName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LocationName.toString());
	}

	/**
	 * Set value of LocationName
	 * @param locationname
	 */
	public final void setLocationName(java.lang.String locationname)
	{
		setLocationName(getContext(), locationname);
	}

	/**
	 * Set value of LocationName
	 * @param context
	 * @param locationname
	 */
	public final void setLocationName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String locationname)
	{
		getMendixObject().setValue(context, MemberNames.LocationName.toString(), locationname);
	}

	/**
	 * @return value of OrganisationName
	 */
	public final java.lang.String getOrganisationName()
	{
		return getOrganisationName(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganisationName
	 */
	public final java.lang.String getOrganisationName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OrganisationName.toString());
	}

	/**
	 * Set value of OrganisationName
	 * @param organisationname
	 */
	public final void setOrganisationName(java.lang.String organisationname)
	{
		setOrganisationName(getContext(), organisationname);
	}

	/**
	 * Set value of OrganisationName
	 * @param context
	 * @param organisationname
	 */
	public final void setOrganisationName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organisationname)
	{
		getMendixObject().setValue(context, MemberNames.OrganisationName.toString(), organisationname);
	}

	/**
	 * @return value of AccountActive
	 */
	public final java.lang.Boolean getAccountActive()
	{
		return getAccountActive(getContext());
	}

	/**
	 * @param context
	 * @return value of AccountActive
	 */
	public final java.lang.Boolean getAccountActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AccountActive.toString());
	}

	/**
	 * Set value of AccountActive
	 * @param accountactive
	 */
	public final void setAccountActive(java.lang.Boolean accountactive)
	{
		setAccountActive(getContext(), accountactive);
	}

	/**
	 * Set value of AccountActive
	 * @param context
	 * @param accountactive
	 */
	public final void setAccountActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean accountactive)
	{
		getMendixObject().setValue(context, MemberNames.AccountActive.toString(), accountactive);
	}

	/**
	 * @return value of PersonLDAPInbox_Person
	 */
	public final nap.proxies.Person getPersonLDAPInbox_Person() throws com.mendix.core.CoreException
	{
		return getPersonLDAPInbox_Person(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLDAPInbox_Person
	 */
	public final nap.proxies.Person getPersonLDAPInbox_Person(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PersonLDAPInbox_Person.toString());
		if (identifier != null)
			result = nap.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PersonLDAPInbox_Person
	 * @param personldapinbox_person
	 */
	public final void setPersonLDAPInbox_Person(nap.proxies.Person personldapinbox_person)
	{
		setPersonLDAPInbox_Person(getContext(), personldapinbox_person);
	}

	/**
	 * Set value of PersonLDAPInbox_Person
	 * @param context
	 * @param personldapinbox_person
	 */
	public final void setPersonLDAPInbox_Person(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Person personldapinbox_person)
	{
		if (personldapinbox_person == null)
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_Person.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_Person.toString(), personldapinbox_person.getMendixObject().getId());
	}

	/**
	 * @return value of PersonLDAPInbox_Account
	 */
	public final mendix.proxies.Account getPersonLDAPInbox_Account() throws com.mendix.core.CoreException
	{
		return getPersonLDAPInbox_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLDAPInbox_Account
	 */
	public final mendix.proxies.Account getPersonLDAPInbox_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendix.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PersonLDAPInbox_Account.toString());
		if (identifier != null)
			result = mendix.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PersonLDAPInbox_Account
	 * @param personldapinbox_account
	 */
	public final void setPersonLDAPInbox_Account(mendix.proxies.Account personldapinbox_account)
	{
		setPersonLDAPInbox_Account(getContext(), personldapinbox_account);
	}

	/**
	 * Set value of PersonLDAPInbox_Account
	 * @param context
	 * @param personldapinbox_account
	 */
	public final void setPersonLDAPInbox_Account(com.mendix.systemwideinterfaces.core.IContext context, mendix.proxies.Account personldapinbox_account)
	{
		if (personldapinbox_account == null)
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_Account.toString(), personldapinbox_account.getMendixObject().getId());
	}

	/**
	 * @return value of PersonLDAPInbox_Location
	 */
	public final java.util.List<nap.proxies.Location> getPersonLDAPInbox_Location() throws com.mendix.core.CoreException
	{
		return getPersonLDAPInbox_Location(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLDAPInbox_Location
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<nap.proxies.Location> getPersonLDAPInbox_Location(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<nap.proxies.Location> result = new java.util.ArrayList<nap.proxies.Location>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.PersonLDAPInbox_Location.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(nap.proxies.Location.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of PersonLDAPInbox_Location
	 * @param personldapinbox_location
	 */
	public final void setPersonLDAPInbox_Location(java.util.List<nap.proxies.Location> personldapinbox_location)
	{
		setPersonLDAPInbox_Location(getContext(), personldapinbox_location);
	}

	/**
	 * Set value of PersonLDAPInbox_Location
	 * @param context
	 * @param personldapinbox_location
	 */
	public final void setPersonLDAPInbox_Location(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<nap.proxies.Location> personldapinbox_location)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (nap.proxies.Location proxyObject : personldapinbox_location)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_Location.toString(), identifiers);
	}

	/**
	 * @return value of PersonLDAPInbox_Organisation
	 */
	public final java.util.List<nap.proxies.Organisation> getPersonLDAPInbox_Organisation() throws com.mendix.core.CoreException
	{
		return getPersonLDAPInbox_Organisation(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLDAPInbox_Organisation
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<nap.proxies.Organisation> getPersonLDAPInbox_Organisation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<nap.proxies.Organisation> result = new java.util.ArrayList<nap.proxies.Organisation>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.PersonLDAPInbox_Organisation.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(nap.proxies.Organisation.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of PersonLDAPInbox_Organisation
	 * @param personldapinbox_organisation
	 */
	public final void setPersonLDAPInbox_Organisation(java.util.List<nap.proxies.Organisation> personldapinbox_organisation)
	{
		setPersonLDAPInbox_Organisation(getContext(), personldapinbox_organisation);
	}

	/**
	 * Set value of PersonLDAPInbox_Organisation
	 * @param context
	 * @param personldapinbox_organisation
	 */
	public final void setPersonLDAPInbox_Organisation(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<nap.proxies.Organisation> personldapinbox_organisation)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (nap.proxies.Organisation proxyObject : personldapinbox_organisation)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_Organisation.toString(), identifiers);
	}

	/**
	 * @return value of PersonLDAPInbox_Template
	 */
	public final java.util.List<roletemplates.proxies.Template> getPersonLDAPInbox_Template() throws com.mendix.core.CoreException
	{
		return getPersonLDAPInbox_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLDAPInbox_Template
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<roletemplates.proxies.Template> getPersonLDAPInbox_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<roletemplates.proxies.Template> result = new java.util.ArrayList<roletemplates.proxies.Template>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.PersonLDAPInbox_Template.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(roletemplates.proxies.Template.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of PersonLDAPInbox_Template
	 * @param personldapinbox_template
	 */
	public final void setPersonLDAPInbox_Template(java.util.List<roletemplates.proxies.Template> personldapinbox_template)
	{
		setPersonLDAPInbox_Template(getContext(), personldapinbox_template);
	}

	/**
	 * Set value of PersonLDAPInbox_Template
	 * @param context
	 * @param personldapinbox_template
	 */
	public final void setPersonLDAPInbox_Template(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<roletemplates.proxies.Template> personldapinbox_template)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (roletemplates.proxies.Template proxyObject : personldapinbox_template)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_Template.toString(), identifiers);
	}

	/**
	 * @return value of PersonLDAPInbox_EmailContact_Info
	 */
	public final nap.proxies.Contact_Info getPersonLDAPInbox_EmailContact_Info() throws com.mendix.core.CoreException
	{
		return getPersonLDAPInbox_EmailContact_Info(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLDAPInbox_EmailContact_Info
	 */
	public final nap.proxies.Contact_Info getPersonLDAPInbox_EmailContact_Info(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Contact_Info result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PersonLDAPInbox_EmailContact_Info.toString());
		if (identifier != null)
			result = nap.proxies.Contact_Info.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PersonLDAPInbox_EmailContact_Info
	 * @param personldapinbox_emailcontact_info
	 */
	public final void setPersonLDAPInbox_EmailContact_Info(nap.proxies.Contact_Info personldapinbox_emailcontact_info)
	{
		setPersonLDAPInbox_EmailContact_Info(getContext(), personldapinbox_emailcontact_info);
	}

	/**
	 * Set value of PersonLDAPInbox_EmailContact_Info
	 * @param context
	 * @param personldapinbox_emailcontact_info
	 */
	public final void setPersonLDAPInbox_EmailContact_Info(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Contact_Info personldapinbox_emailcontact_info)
	{
		if (personldapinbox_emailcontact_info == null)
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_EmailContact_Info.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_EmailContact_Info.toString(), personldapinbox_emailcontact_info.getMendixObject().getId());
	}

	/**
	 * @return value of PersonLDAPInbox_TelephoneContact_Info
	 */
	public final nap.proxies.Contact_Info getPersonLDAPInbox_TelephoneContact_Info() throws com.mendix.core.CoreException
	{
		return getPersonLDAPInbox_TelephoneContact_Info(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLDAPInbox_TelephoneContact_Info
	 */
	public final nap.proxies.Contact_Info getPersonLDAPInbox_TelephoneContact_Info(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Contact_Info result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PersonLDAPInbox_TelephoneContact_Info.toString());
		if (identifier != null)
			result = nap.proxies.Contact_Info.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PersonLDAPInbox_TelephoneContact_Info
	 * @param personldapinbox_telephonecontact_info
	 */
	public final void setPersonLDAPInbox_TelephoneContact_Info(nap.proxies.Contact_Info personldapinbox_telephonecontact_info)
	{
		setPersonLDAPInbox_TelephoneContact_Info(getContext(), personldapinbox_telephonecontact_info);
	}

	/**
	 * Set value of PersonLDAPInbox_TelephoneContact_Info
	 * @param context
	 * @param personldapinbox_telephonecontact_info
	 */
	public final void setPersonLDAPInbox_TelephoneContact_Info(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Contact_Info personldapinbox_telephonecontact_info)
	{
		if (personldapinbox_telephonecontact_info == null)
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_TelephoneContact_Info.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_TelephoneContact_Info.toString(), personldapinbox_telephonecontact_info.getMendixObject().getId());
	}

	/**
	 * @return value of PersonLDAPInbox_FaxContact_Info
	 */
	public final nap.proxies.Contact_Info getPersonLDAPInbox_FaxContact_Info() throws com.mendix.core.CoreException
	{
		return getPersonLDAPInbox_FaxContact_Info(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLDAPInbox_FaxContact_Info
	 */
	public final nap.proxies.Contact_Info getPersonLDAPInbox_FaxContact_Info(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Contact_Info result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PersonLDAPInbox_FaxContact_Info.toString());
		if (identifier != null)
			result = nap.proxies.Contact_Info.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PersonLDAPInbox_FaxContact_Info
	 * @param personldapinbox_faxcontact_info
	 */
	public final void setPersonLDAPInbox_FaxContact_Info(nap.proxies.Contact_Info personldapinbox_faxcontact_info)
	{
		setPersonLDAPInbox_FaxContact_Info(getContext(), personldapinbox_faxcontact_info);
	}

	/**
	 * Set value of PersonLDAPInbox_FaxContact_Info
	 * @param context
	 * @param personldapinbox_faxcontact_info
	 */
	public final void setPersonLDAPInbox_FaxContact_Info(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Contact_Info personldapinbox_faxcontact_info)
	{
		if (personldapinbox_faxcontact_info == null)
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_FaxContact_Info.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_FaxContact_Info.toString(), personldapinbox_faxcontact_info.getMendixObject().getId());
	}

	/**
	 * @return value of PersonLDAPInbox_MobileContact_Info
	 */
	public final nap.proxies.Contact_Info getPersonLDAPInbox_MobileContact_Info() throws com.mendix.core.CoreException
	{
		return getPersonLDAPInbox_MobileContact_Info(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonLDAPInbox_MobileContact_Info
	 */
	public final nap.proxies.Contact_Info getPersonLDAPInbox_MobileContact_Info(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Contact_Info result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PersonLDAPInbox_MobileContact_Info.toString());
		if (identifier != null)
			result = nap.proxies.Contact_Info.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PersonLDAPInbox_MobileContact_Info
	 * @param personldapinbox_mobilecontact_info
	 */
	public final void setPersonLDAPInbox_MobileContact_Info(nap.proxies.Contact_Info personldapinbox_mobilecontact_info)
	{
		setPersonLDAPInbox_MobileContact_Info(getContext(), personldapinbox_mobilecontact_info);
	}

	/**
	 * Set value of PersonLDAPInbox_MobileContact_Info
	 * @param context
	 * @param personldapinbox_mobilecontact_info
	 */
	public final void setPersonLDAPInbox_MobileContact_Info(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Contact_Info personldapinbox_mobilecontact_info)
	{
		if (personldapinbox_mobilecontact_info == null)
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_MobileContact_Info.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PersonLDAPInbox_MobileContact_Info.toString(), personldapinbox_mobilecontact_info.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceldap.proxies.PersonLDAPInbox that = (interfaceldap.proxies.PersonLDAPInbox) obj;
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
		return "InterfaceLDAP.PersonLDAPInbox";
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
