// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacenaw.proxies;

public class Person
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject personMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceNAW.Person";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Person_id("Person_id"),
		Volledige_naam("Volledige_naam"),
		Voorletters("Voorletters"),
		Achternaam("Achternaam"),
		Tussenvoegsel("Tussenvoegsel"),
		Toestel_1("Toestel_1"),
		Mobielnummer("Mobielnummer"),
		E_mail("E_mail"),
		Object1("Object1"),
		Ruimte1("Ruimte1"),
		Sam_account("Sam_account"),
		Organisatie_id("Organisatie_id"),
		Status("Status"),
		Date("Date"),
		Log("Log"),
		Roepnaam("Roepnaam"),
		PartnerNaam("PartnerNaam"),
		PartnerTussenvoegsel("PartnerTussenvoegsel"),
		Naamvolgorde("Naamvolgorde"),
		Geslacht("Geslacht");

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
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceNAW.Person"));
	}

	protected Person(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject personMendixObject)
	{
		if (personMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceNAW.Person", personMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceNAW.Person");

		this.personMendixObject = personMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Person.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacenaw.proxies.Person initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacenaw.proxies.Person.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacenaw.proxies.Person initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacenaw.proxies.Person(context, mendixObject);
	}

	public static interfacenaw.proxies.Person load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacenaw.proxies.Person.initialize(context, mendixObject);
	}

	public static java.util.List<interfacenaw.proxies.Person> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacenaw.proxies.Person> result = new java.util.ArrayList<interfacenaw.proxies.Person>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceNAW.Person" + xpathConstraint))
			result.add(interfacenaw.proxies.Person.initialize(context, obj));
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
	 * @return value of Person_id
	 */
	public final java.lang.String getPerson_id()
	{
		return getPerson_id(getContext());
	}

	/**
	 * @param context
	 * @return value of Person_id
	 */
	public final java.lang.String getPerson_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Person_id.toString());
	}

	/**
	 * Set value of Person_id
	 * @param person_id
	 */
	public final void setPerson_id(java.lang.String person_id)
	{
		setPerson_id(getContext(), person_id);
	}

	/**
	 * Set value of Person_id
	 * @param context
	 * @param person_id
	 */
	public final void setPerson_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String person_id)
	{
		getMendixObject().setValue(context, MemberNames.Person_id.toString(), person_id);
	}

	/**
	 * @return value of Volledige_naam
	 */
	public final java.lang.String getVolledige_naam()
	{
		return getVolledige_naam(getContext());
	}

	/**
	 * @param context
	 * @return value of Volledige_naam
	 */
	public final java.lang.String getVolledige_naam(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Volledige_naam.toString());
	}

	/**
	 * Set value of Volledige_naam
	 * @param volledige_naam
	 */
	public final void setVolledige_naam(java.lang.String volledige_naam)
	{
		setVolledige_naam(getContext(), volledige_naam);
	}

	/**
	 * Set value of Volledige_naam
	 * @param context
	 * @param volledige_naam
	 */
	public final void setVolledige_naam(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String volledige_naam)
	{
		getMendixObject().setValue(context, MemberNames.Volledige_naam.toString(), volledige_naam);
	}

	/**
	 * @return value of Voorletters
	 */
	public final java.lang.String getVoorletters()
	{
		return getVoorletters(getContext());
	}

	/**
	 * @param context
	 * @return value of Voorletters
	 */
	public final java.lang.String getVoorletters(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Voorletters.toString());
	}

	/**
	 * Set value of Voorletters
	 * @param voorletters
	 */
	public final void setVoorletters(java.lang.String voorletters)
	{
		setVoorletters(getContext(), voorletters);
	}

	/**
	 * Set value of Voorletters
	 * @param context
	 * @param voorletters
	 */
	public final void setVoorletters(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String voorletters)
	{
		getMendixObject().setValue(context, MemberNames.Voorletters.toString(), voorletters);
	}

	/**
	 * @return value of Achternaam
	 */
	public final java.lang.String getAchternaam()
	{
		return getAchternaam(getContext());
	}

	/**
	 * @param context
	 * @return value of Achternaam
	 */
	public final java.lang.String getAchternaam(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Achternaam.toString());
	}

	/**
	 * Set value of Achternaam
	 * @param achternaam
	 */
	public final void setAchternaam(java.lang.String achternaam)
	{
		setAchternaam(getContext(), achternaam);
	}

	/**
	 * Set value of Achternaam
	 * @param context
	 * @param achternaam
	 */
	public final void setAchternaam(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String achternaam)
	{
		getMendixObject().setValue(context, MemberNames.Achternaam.toString(), achternaam);
	}

	/**
	 * @return value of Tussenvoegsel
	 */
	public final java.lang.String getTussenvoegsel()
	{
		return getTussenvoegsel(getContext());
	}

	/**
	 * @param context
	 * @return value of Tussenvoegsel
	 */
	public final java.lang.String getTussenvoegsel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Tussenvoegsel.toString());
	}

	/**
	 * Set value of Tussenvoegsel
	 * @param tussenvoegsel
	 */
	public final void setTussenvoegsel(java.lang.String tussenvoegsel)
	{
		setTussenvoegsel(getContext(), tussenvoegsel);
	}

	/**
	 * Set value of Tussenvoegsel
	 * @param context
	 * @param tussenvoegsel
	 */
	public final void setTussenvoegsel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tussenvoegsel)
	{
		getMendixObject().setValue(context, MemberNames.Tussenvoegsel.toString(), tussenvoegsel);
	}

	/**
	 * @return value of Toestel_1
	 */
	public final java.lang.String getToestel_1()
	{
		return getToestel_1(getContext());
	}

	/**
	 * @param context
	 * @return value of Toestel_1
	 */
	public final java.lang.String getToestel_1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Toestel_1.toString());
	}

	/**
	 * Set value of Toestel_1
	 * @param toestel_1
	 */
	public final void setToestel_1(java.lang.String toestel_1)
	{
		setToestel_1(getContext(), toestel_1);
	}

	/**
	 * Set value of Toestel_1
	 * @param context
	 * @param toestel_1
	 */
	public final void setToestel_1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String toestel_1)
	{
		getMendixObject().setValue(context, MemberNames.Toestel_1.toString(), toestel_1);
	}

	/**
	 * @return value of Mobielnummer
	 */
	public final java.lang.String getMobielnummer()
	{
		return getMobielnummer(getContext());
	}

	/**
	 * @param context
	 * @return value of Mobielnummer
	 */
	public final java.lang.String getMobielnummer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Mobielnummer.toString());
	}

	/**
	 * Set value of Mobielnummer
	 * @param mobielnummer
	 */
	public final void setMobielnummer(java.lang.String mobielnummer)
	{
		setMobielnummer(getContext(), mobielnummer);
	}

	/**
	 * Set value of Mobielnummer
	 * @param context
	 * @param mobielnummer
	 */
	public final void setMobielnummer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mobielnummer)
	{
		getMendixObject().setValue(context, MemberNames.Mobielnummer.toString(), mobielnummer);
	}

	/**
	 * @return value of E_mail
	 */
	public final java.lang.String getE_mail()
	{
		return getE_mail(getContext());
	}

	/**
	 * @param context
	 * @return value of E_mail
	 */
	public final java.lang.String getE_mail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.E_mail.toString());
	}

	/**
	 * Set value of E_mail
	 * @param e_mail
	 */
	public final void setE_mail(java.lang.String e_mail)
	{
		setE_mail(getContext(), e_mail);
	}

	/**
	 * Set value of E_mail
	 * @param context
	 * @param e_mail
	 */
	public final void setE_mail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String e_mail)
	{
		getMendixObject().setValue(context, MemberNames.E_mail.toString(), e_mail);
	}

	/**
	 * @return value of Object1
	 */
	public final java.lang.String getObject1()
	{
		return getObject1(getContext());
	}

	/**
	 * @param context
	 * @return value of Object1
	 */
	public final java.lang.String getObject1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Object1.toString());
	}

	/**
	 * Set value of Object1
	 * @param object1
	 */
	public final void setObject1(java.lang.String object1)
	{
		setObject1(getContext(), object1);
	}

	/**
	 * Set value of Object1
	 * @param context
	 * @param object1
	 */
	public final void setObject1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String object1)
	{
		getMendixObject().setValue(context, MemberNames.Object1.toString(), object1);
	}

	/**
	 * @return value of Ruimte1
	 */
	public final java.lang.String getRuimte1()
	{
		return getRuimte1(getContext());
	}

	/**
	 * @param context
	 * @return value of Ruimte1
	 */
	public final java.lang.String getRuimte1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Ruimte1.toString());
	}

	/**
	 * Set value of Ruimte1
	 * @param ruimte1
	 */
	public final void setRuimte1(java.lang.String ruimte1)
	{
		setRuimte1(getContext(), ruimte1);
	}

	/**
	 * Set value of Ruimte1
	 * @param context
	 * @param ruimte1
	 */
	public final void setRuimte1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ruimte1)
	{
		getMendixObject().setValue(context, MemberNames.Ruimte1.toString(), ruimte1);
	}

	/**
	 * @return value of Sam_account
	 */
	public final java.lang.String getSam_account()
	{
		return getSam_account(getContext());
	}

	/**
	 * @param context
	 * @return value of Sam_account
	 */
	public final java.lang.String getSam_account(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sam_account.toString());
	}

	/**
	 * Set value of Sam_account
	 * @param sam_account
	 */
	public final void setSam_account(java.lang.String sam_account)
	{
		setSam_account(getContext(), sam_account);
	}

	/**
	 * Set value of Sam_account
	 * @param context
	 * @param sam_account
	 */
	public final void setSam_account(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sam_account)
	{
		getMendixObject().setValue(context, MemberNames.Sam_account.toString(), sam_account);
	}

	/**
	 * @return value of Organisatie_id
	 */
	public final java.lang.String getOrganisatie_id()
	{
		return getOrganisatie_id(getContext());
	}

	/**
	 * @param context
	 * @return value of Organisatie_id
	 */
	public final java.lang.String getOrganisatie_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Organisatie_id.toString());
	}

	/**
	 * Set value of Organisatie_id
	 * @param organisatie_id
	 */
	public final void setOrganisatie_id(java.lang.String organisatie_id)
	{
		setOrganisatie_id(getContext(), organisatie_id);
	}

	/**
	 * Set value of Organisatie_id
	 * @param context
	 * @param organisatie_id
	 */
	public final void setOrganisatie_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organisatie_id)
	{
		getMendixObject().setValue(context, MemberNames.Organisatie_id.toString(), organisatie_id);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final interfaceartemis.proxies.Status getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final interfaceartemis.proxies.Status getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return interfaceartemis.proxies.Status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(interfaceartemis.proxies.Status status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, interfaceartemis.proxies.Status status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return value of Log
	 */
	public final java.lang.String getLog()
	{
		return getLog(getContext());
	}

	/**
	 * @param context
	 * @return value of Log
	 */
	public final java.lang.String getLog(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Log.toString());
	}

	/**
	 * Set value of Log
	 * @param log
	 */
	public final void setLog(java.lang.String log)
	{
		setLog(getContext(), log);
	}

	/**
	 * Set value of Log
	 * @param context
	 * @param log
	 */
	public final void setLog(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String log)
	{
		getMendixObject().setValue(context, MemberNames.Log.toString(), log);
	}

	/**
	 * @return value of Roepnaam
	 */
	public final java.lang.String getRoepnaam()
	{
		return getRoepnaam(getContext());
	}

	/**
	 * @param context
	 * @return value of Roepnaam
	 */
	public final java.lang.String getRoepnaam(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Roepnaam.toString());
	}

	/**
	 * Set value of Roepnaam
	 * @param roepnaam
	 */
	public final void setRoepnaam(java.lang.String roepnaam)
	{
		setRoepnaam(getContext(), roepnaam);
	}

	/**
	 * Set value of Roepnaam
	 * @param context
	 * @param roepnaam
	 */
	public final void setRoepnaam(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String roepnaam)
	{
		getMendixObject().setValue(context, MemberNames.Roepnaam.toString(), roepnaam);
	}

	/**
	 * @return value of PartnerNaam
	 */
	public final java.lang.String getPartnerNaam()
	{
		return getPartnerNaam(getContext());
	}

	/**
	 * @param context
	 * @return value of PartnerNaam
	 */
	public final java.lang.String getPartnerNaam(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PartnerNaam.toString());
	}

	/**
	 * Set value of PartnerNaam
	 * @param partnernaam
	 */
	public final void setPartnerNaam(java.lang.String partnernaam)
	{
		setPartnerNaam(getContext(), partnernaam);
	}

	/**
	 * Set value of PartnerNaam
	 * @param context
	 * @param partnernaam
	 */
	public final void setPartnerNaam(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String partnernaam)
	{
		getMendixObject().setValue(context, MemberNames.PartnerNaam.toString(), partnernaam);
	}

	/**
	 * @return value of PartnerTussenvoegsel
	 */
	public final java.lang.String getPartnerTussenvoegsel()
	{
		return getPartnerTussenvoegsel(getContext());
	}

	/**
	 * @param context
	 * @return value of PartnerTussenvoegsel
	 */
	public final java.lang.String getPartnerTussenvoegsel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PartnerTussenvoegsel.toString());
	}

	/**
	 * Set value of PartnerTussenvoegsel
	 * @param partnertussenvoegsel
	 */
	public final void setPartnerTussenvoegsel(java.lang.String partnertussenvoegsel)
	{
		setPartnerTussenvoegsel(getContext(), partnertussenvoegsel);
	}

	/**
	 * Set value of PartnerTussenvoegsel
	 * @param context
	 * @param partnertussenvoegsel
	 */
	public final void setPartnerTussenvoegsel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String partnertussenvoegsel)
	{
		getMendixObject().setValue(context, MemberNames.PartnerTussenvoegsel.toString(), partnertussenvoegsel);
	}

	/**
	 * @return value of Naamvolgorde
	 */
	public final java.lang.String getNaamvolgorde()
	{
		return getNaamvolgorde(getContext());
	}

	/**
	 * @param context
	 * @return value of Naamvolgorde
	 */
	public final java.lang.String getNaamvolgorde(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Naamvolgorde.toString());
	}

	/**
	 * Set value of Naamvolgorde
	 * @param naamvolgorde
	 */
	public final void setNaamvolgorde(java.lang.String naamvolgorde)
	{
		setNaamvolgorde(getContext(), naamvolgorde);
	}

	/**
	 * Set value of Naamvolgorde
	 * @param context
	 * @param naamvolgorde
	 */
	public final void setNaamvolgorde(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String naamvolgorde)
	{
		getMendixObject().setValue(context, MemberNames.Naamvolgorde.toString(), naamvolgorde);
	}

	/**
	 * @return value of Geslacht
	 */
	public final java.lang.String getGeslacht()
	{
		return getGeslacht(getContext());
	}

	/**
	 * @param context
	 * @return value of Geslacht
	 */
	public final java.lang.String getGeslacht(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Geslacht.toString());
	}

	/**
	 * Set value of Geslacht
	 * @param geslacht
	 */
	public final void setGeslacht(java.lang.String geslacht)
	{
		setGeslacht(getContext(), geslacht);
	}

	/**
	 * Set value of Geslacht
	 * @param context
	 * @param geslacht
	 */
	public final void setGeslacht(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String geslacht)
	{
		getMendixObject().setValue(context, MemberNames.Geslacht.toString(), geslacht);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return personMendixObject;
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
			final interfacenaw.proxies.Person that = (interfacenaw.proxies.Person) obj;
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
		return "InterfaceNAW.Person";
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
