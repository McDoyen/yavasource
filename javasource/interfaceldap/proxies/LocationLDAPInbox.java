// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceldap.proxies;

public class LocationLDAPInbox extends interfaceldap.proxies.LDAPInbox
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceLDAP.LocationLDAPInbox";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		LocationName("LocationName"),
		Address("Address"),
		Zipcode("Zipcode"),
		City("City"),
		Country("Country"),
		AccountActive("AccountActive"),
		LDAPID("LDAPID"),
		ProcessingStatus("ProcessingStatus"),
		LDAPID_OldStyle("LDAPID_OldStyle"),
		LocationLDAPInbox_Location("InterfaceLDAP.LocationLDAPInbox_Location"),
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

	public LocationLDAPInbox(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceLDAP.LocationLDAPInbox"));
	}

	protected LocationLDAPInbox(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject locationLDAPInboxMendixObject)
	{
		super(context, locationLDAPInboxMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceLDAP.LocationLDAPInbox", locationLDAPInboxMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceLDAP.LocationLDAPInbox");
	}

	/**
	 * @deprecated Use 'LocationLDAPInbox.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceldap.proxies.LocationLDAPInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceldap.proxies.LocationLDAPInbox.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceldap.proxies.LocationLDAPInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceldap.proxies.LocationLDAPInbox(context, mendixObject);
	}

	public static interfaceldap.proxies.LocationLDAPInbox load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceldap.proxies.LocationLDAPInbox.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceldap.proxies.LocationLDAPInbox> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceldap.proxies.LocationLDAPInbox> result = new java.util.ArrayList<interfaceldap.proxies.LocationLDAPInbox>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceLDAP.LocationLDAPInbox" + xpathConstraint))
			result.add(interfaceldap.proxies.LocationLDAPInbox.initialize(context, obj));
		return result;
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
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @return value of Zipcode
	 */
	public final java.lang.String getZipcode()
	{
		return getZipcode(getContext());
	}

	/**
	 * @param context
	 * @return value of Zipcode
	 */
	public final java.lang.String getZipcode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Zipcode.toString());
	}

	/**
	 * Set value of Zipcode
	 * @param zipcode
	 */
	public final void setZipcode(java.lang.String zipcode)
	{
		setZipcode(getContext(), zipcode);
	}

	/**
	 * Set value of Zipcode
	 * @param context
	 * @param zipcode
	 */
	public final void setZipcode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String zipcode)
	{
		getMendixObject().setValue(context, MemberNames.Zipcode.toString(), zipcode);
	}

	/**
	 * @return value of City
	 */
	public final java.lang.String getCity()
	{
		return getCity(getContext());
	}

	/**
	 * @param context
	 * @return value of City
	 */
	public final java.lang.String getCity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.City.toString());
	}

	/**
	 * Set value of City
	 * @param city
	 */
	public final void setCity(java.lang.String city)
	{
		setCity(getContext(), city);
	}

	/**
	 * Set value of City
	 * @param context
	 * @param city
	 */
	public final void setCity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String city)
	{
		getMendixObject().setValue(context, MemberNames.City.toString(), city);
	}

	/**
	 * @return value of Country
	 */
	public final java.lang.String getCountry()
	{
		return getCountry(getContext());
	}

	/**
	 * @param context
	 * @return value of Country
	 */
	public final java.lang.String getCountry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Country.toString());
	}

	/**
	 * Set value of Country
	 * @param country
	 */
	public final void setCountry(java.lang.String country)
	{
		setCountry(getContext(), country);
	}

	/**
	 * Set value of Country
	 * @param context
	 * @param country
	 */
	public final void setCountry(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String country)
	{
		getMendixObject().setValue(context, MemberNames.Country.toString(), country);
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
	 * @return value of LocationLDAPInbox_Location
	 */
	public final nap.proxies.Location getLocationLDAPInbox_Location() throws com.mendix.core.CoreException
	{
		return getLocationLDAPInbox_Location(getContext());
	}

	/**
	 * @param context
	 * @return value of LocationLDAPInbox_Location
	 */
	public final nap.proxies.Location getLocationLDAPInbox_Location(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Location result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LocationLDAPInbox_Location.toString());
		if (identifier != null)
			result = nap.proxies.Location.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LocationLDAPInbox_Location
	 * @param locationldapinbox_location
	 */
	public final void setLocationLDAPInbox_Location(nap.proxies.Location locationldapinbox_location)
	{
		setLocationLDAPInbox_Location(getContext(), locationldapinbox_location);
	}

	/**
	 * Set value of LocationLDAPInbox_Location
	 * @param context
	 * @param locationldapinbox_location
	 */
	public final void setLocationLDAPInbox_Location(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Location locationldapinbox_location)
	{
		if (locationldapinbox_location == null)
			getMendixObject().setValue(context, MemberNames.LocationLDAPInbox_Location.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LocationLDAPInbox_Location.toString(), locationldapinbox_location.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceldap.proxies.LocationLDAPInbox that = (interfaceldap.proxies.LocationLDAPInbox) obj;
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
		return "InterfaceLDAP.LocationLDAPInbox";
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
