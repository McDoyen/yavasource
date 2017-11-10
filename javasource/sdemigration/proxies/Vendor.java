// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class Vendor extends sdemigration.proxies.SDEObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.Vendor";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		VendorID("VendorID"),
		VendorName("VendorName"),
		VendorPhone("VendorPhone"),
		VendorEmail("VendorEmail"),
		VendorType("VendorType"),
		ApprovedForPurchasing("ApprovedForPurchasing"),
		ApprovedForService("ApprovedForService"),
		Address("Address"),
		City("City"),
		Country("Country"),
		PostalCode("PostalCode"),
		ShippingAdress("ShippingAdress"),
		ShippingCity("ShippingCity"),
		ShippingPostalCode("ShippingPostalCode"),
		SalesContactName("SalesContactName"),
		SalesPhone("SalesPhone"),
		SupportContactName("SupportContactName"),
		SupportPhone("SupportPhone"),
		Inactive("Inactive"),
		processed("processed"),
		SDEObject_MigrationItemRun("SDEMigration.SDEObject_MigrationItemRun"),
		IncomingRequest_SDEObject("InterfaceRequests.IncomingRequest_SDEObject");

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

	public Vendor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.Vendor"));
	}

	protected Vendor(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vendorMendixObject)
	{
		super(context, vendorMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.Vendor", vendorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.Vendor");
	}

	/**
	 * @deprecated Use 'Vendor.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.Vendor initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.Vendor.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.Vendor initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.Vendor(context, mendixObject);
	}

	public static sdemigration.proxies.Vendor load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.Vendor.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.Vendor> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.Vendor> result = new java.util.ArrayList<sdemigration.proxies.Vendor>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.Vendor" + xpathConstraint))
			result.add(sdemigration.proxies.Vendor.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Sequence
	 */
	public final java.lang.String getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.String getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.String sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * @return value of VendorID
	 */
	public final java.lang.String getVendorID()
	{
		return getVendorID(getContext());
	}

	/**
	 * @param context
	 * @return value of VendorID
	 */
	public final java.lang.String getVendorID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.VendorID.toString());
	}

	/**
	 * Set value of VendorID
	 * @param vendorid
	 */
	public final void setVendorID(java.lang.String vendorid)
	{
		setVendorID(getContext(), vendorid);
	}

	/**
	 * Set value of VendorID
	 * @param context
	 * @param vendorid
	 */
	public final void setVendorID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String vendorid)
	{
		getMendixObject().setValue(context, MemberNames.VendorID.toString(), vendorid);
	}

	/**
	 * @return value of VendorName
	 */
	public final java.lang.String getVendorName()
	{
		return getVendorName(getContext());
	}

	/**
	 * @param context
	 * @return value of VendorName
	 */
	public final java.lang.String getVendorName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.VendorName.toString());
	}

	/**
	 * Set value of VendorName
	 * @param vendorname
	 */
	public final void setVendorName(java.lang.String vendorname)
	{
		setVendorName(getContext(), vendorname);
	}

	/**
	 * Set value of VendorName
	 * @param context
	 * @param vendorname
	 */
	public final void setVendorName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String vendorname)
	{
		getMendixObject().setValue(context, MemberNames.VendorName.toString(), vendorname);
	}

	/**
	 * @return value of VendorPhone
	 */
	public final java.lang.String getVendorPhone()
	{
		return getVendorPhone(getContext());
	}

	/**
	 * @param context
	 * @return value of VendorPhone
	 */
	public final java.lang.String getVendorPhone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.VendorPhone.toString());
	}

	/**
	 * Set value of VendorPhone
	 * @param vendorphone
	 */
	public final void setVendorPhone(java.lang.String vendorphone)
	{
		setVendorPhone(getContext(), vendorphone);
	}

	/**
	 * Set value of VendorPhone
	 * @param context
	 * @param vendorphone
	 */
	public final void setVendorPhone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String vendorphone)
	{
		getMendixObject().setValue(context, MemberNames.VendorPhone.toString(), vendorphone);
	}

	/**
	 * @return value of VendorEmail
	 */
	public final java.lang.String getVendorEmail()
	{
		return getVendorEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of VendorEmail
	 */
	public final java.lang.String getVendorEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.VendorEmail.toString());
	}

	/**
	 * Set value of VendorEmail
	 * @param vendoremail
	 */
	public final void setVendorEmail(java.lang.String vendoremail)
	{
		setVendorEmail(getContext(), vendoremail);
	}

	/**
	 * Set value of VendorEmail
	 * @param context
	 * @param vendoremail
	 */
	public final void setVendorEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String vendoremail)
	{
		getMendixObject().setValue(context, MemberNames.VendorEmail.toString(), vendoremail);
	}

	/**
	 * @return value of VendorType
	 */
	public final java.lang.String getVendorType()
	{
		return getVendorType(getContext());
	}

	/**
	 * @param context
	 * @return value of VendorType
	 */
	public final java.lang.String getVendorType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.VendorType.toString());
	}

	/**
	 * Set value of VendorType
	 * @param vendortype
	 */
	public final void setVendorType(java.lang.String vendortype)
	{
		setVendorType(getContext(), vendortype);
	}

	/**
	 * Set value of VendorType
	 * @param context
	 * @param vendortype
	 */
	public final void setVendorType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String vendortype)
	{
		getMendixObject().setValue(context, MemberNames.VendorType.toString(), vendortype);
	}

	/**
	 * @return value of ApprovedForPurchasing
	 */
	public final java.lang.String getApprovedForPurchasing()
	{
		return getApprovedForPurchasing(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovedForPurchasing
	 */
	public final java.lang.String getApprovedForPurchasing(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ApprovedForPurchasing.toString());
	}

	/**
	 * Set value of ApprovedForPurchasing
	 * @param approvedforpurchasing
	 */
	public final void setApprovedForPurchasing(java.lang.String approvedforpurchasing)
	{
		setApprovedForPurchasing(getContext(), approvedforpurchasing);
	}

	/**
	 * Set value of ApprovedForPurchasing
	 * @param context
	 * @param approvedforpurchasing
	 */
	public final void setApprovedForPurchasing(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String approvedforpurchasing)
	{
		getMendixObject().setValue(context, MemberNames.ApprovedForPurchasing.toString(), approvedforpurchasing);
	}

	/**
	 * @return value of ApprovedForService
	 */
	public final java.lang.String getApprovedForService()
	{
		return getApprovedForService(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovedForService
	 */
	public final java.lang.String getApprovedForService(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ApprovedForService.toString());
	}

	/**
	 * Set value of ApprovedForService
	 * @param approvedforservice
	 */
	public final void setApprovedForService(java.lang.String approvedforservice)
	{
		setApprovedForService(getContext(), approvedforservice);
	}

	/**
	 * Set value of ApprovedForService
	 * @param context
	 * @param approvedforservice
	 */
	public final void setApprovedForService(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String approvedforservice)
	{
		getMendixObject().setValue(context, MemberNames.ApprovedForService.toString(), approvedforservice);
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
	 * @return value of PostalCode
	 */
	public final java.lang.String getPostalCode()
	{
		return getPostalCode(getContext());
	}

	/**
	 * @param context
	 * @return value of PostalCode
	 */
	public final java.lang.String getPostalCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PostalCode.toString());
	}

	/**
	 * Set value of PostalCode
	 * @param postalcode
	 */
	public final void setPostalCode(java.lang.String postalcode)
	{
		setPostalCode(getContext(), postalcode);
	}

	/**
	 * Set value of PostalCode
	 * @param context
	 * @param postalcode
	 */
	public final void setPostalCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String postalcode)
	{
		getMendixObject().setValue(context, MemberNames.PostalCode.toString(), postalcode);
	}

	/**
	 * @return value of ShippingAdress
	 */
	public final java.lang.String getShippingAdress()
	{
		return getShippingAdress(getContext());
	}

	/**
	 * @param context
	 * @return value of ShippingAdress
	 */
	public final java.lang.String getShippingAdress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ShippingAdress.toString());
	}

	/**
	 * Set value of ShippingAdress
	 * @param shippingadress
	 */
	public final void setShippingAdress(java.lang.String shippingadress)
	{
		setShippingAdress(getContext(), shippingadress);
	}

	/**
	 * Set value of ShippingAdress
	 * @param context
	 * @param shippingadress
	 */
	public final void setShippingAdress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String shippingadress)
	{
		getMendixObject().setValue(context, MemberNames.ShippingAdress.toString(), shippingadress);
	}

	/**
	 * @return value of ShippingCity
	 */
	public final java.lang.String getShippingCity()
	{
		return getShippingCity(getContext());
	}

	/**
	 * @param context
	 * @return value of ShippingCity
	 */
	public final java.lang.String getShippingCity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ShippingCity.toString());
	}

	/**
	 * Set value of ShippingCity
	 * @param shippingcity
	 */
	public final void setShippingCity(java.lang.String shippingcity)
	{
		setShippingCity(getContext(), shippingcity);
	}

	/**
	 * Set value of ShippingCity
	 * @param context
	 * @param shippingcity
	 */
	public final void setShippingCity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String shippingcity)
	{
		getMendixObject().setValue(context, MemberNames.ShippingCity.toString(), shippingcity);
	}

	/**
	 * @return value of ShippingPostalCode
	 */
	public final java.lang.String getShippingPostalCode()
	{
		return getShippingPostalCode(getContext());
	}

	/**
	 * @param context
	 * @return value of ShippingPostalCode
	 */
	public final java.lang.String getShippingPostalCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ShippingPostalCode.toString());
	}

	/**
	 * Set value of ShippingPostalCode
	 * @param shippingpostalcode
	 */
	public final void setShippingPostalCode(java.lang.String shippingpostalcode)
	{
		setShippingPostalCode(getContext(), shippingpostalcode);
	}

	/**
	 * Set value of ShippingPostalCode
	 * @param context
	 * @param shippingpostalcode
	 */
	public final void setShippingPostalCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String shippingpostalcode)
	{
		getMendixObject().setValue(context, MemberNames.ShippingPostalCode.toString(), shippingpostalcode);
	}

	/**
	 * @return value of SalesContactName
	 */
	public final java.lang.String getSalesContactName()
	{
		return getSalesContactName(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesContactName
	 */
	public final java.lang.String getSalesContactName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SalesContactName.toString());
	}

	/**
	 * Set value of SalesContactName
	 * @param salescontactname
	 */
	public final void setSalesContactName(java.lang.String salescontactname)
	{
		setSalesContactName(getContext(), salescontactname);
	}

	/**
	 * Set value of SalesContactName
	 * @param context
	 * @param salescontactname
	 */
	public final void setSalesContactName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String salescontactname)
	{
		getMendixObject().setValue(context, MemberNames.SalesContactName.toString(), salescontactname);
	}

	/**
	 * @return value of SalesPhone
	 */
	public final java.lang.String getSalesPhone()
	{
		return getSalesPhone(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesPhone
	 */
	public final java.lang.String getSalesPhone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SalesPhone.toString());
	}

	/**
	 * Set value of SalesPhone
	 * @param salesphone
	 */
	public final void setSalesPhone(java.lang.String salesphone)
	{
		setSalesPhone(getContext(), salesphone);
	}

	/**
	 * Set value of SalesPhone
	 * @param context
	 * @param salesphone
	 */
	public final void setSalesPhone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String salesphone)
	{
		getMendixObject().setValue(context, MemberNames.SalesPhone.toString(), salesphone);
	}

	/**
	 * @return value of SupportContactName
	 */
	public final java.lang.String getSupportContactName()
	{
		return getSupportContactName(getContext());
	}

	/**
	 * @param context
	 * @return value of SupportContactName
	 */
	public final java.lang.String getSupportContactName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SupportContactName.toString());
	}

	/**
	 * Set value of SupportContactName
	 * @param supportcontactname
	 */
	public final void setSupportContactName(java.lang.String supportcontactname)
	{
		setSupportContactName(getContext(), supportcontactname);
	}

	/**
	 * Set value of SupportContactName
	 * @param context
	 * @param supportcontactname
	 */
	public final void setSupportContactName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String supportcontactname)
	{
		getMendixObject().setValue(context, MemberNames.SupportContactName.toString(), supportcontactname);
	}

	/**
	 * @return value of SupportPhone
	 */
	public final java.lang.String getSupportPhone()
	{
		return getSupportPhone(getContext());
	}

	/**
	 * @param context
	 * @return value of SupportPhone
	 */
	public final java.lang.String getSupportPhone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SupportPhone.toString());
	}

	/**
	 * Set value of SupportPhone
	 * @param supportphone
	 */
	public final void setSupportPhone(java.lang.String supportphone)
	{
		setSupportPhone(getContext(), supportphone);
	}

	/**
	 * Set value of SupportPhone
	 * @param context
	 * @param supportphone
	 */
	public final void setSupportPhone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String supportphone)
	{
		getMendixObject().setValue(context, MemberNames.SupportPhone.toString(), supportphone);
	}

	/**
	 * @return value of Inactive
	 */
	public final java.lang.Boolean getInactive()
	{
		return getInactive(getContext());
	}

	/**
	 * @param context
	 * @return value of Inactive
	 */
	public final java.lang.Boolean getInactive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Inactive.toString());
	}

	/**
	 * Set value of Inactive
	 * @param inactive
	 */
	public final void setInactive(java.lang.Boolean inactive)
	{
		setInactive(getContext(), inactive);
	}

	/**
	 * Set value of Inactive
	 * @param context
	 * @param inactive
	 */
	public final void setInactive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean inactive)
	{
		getMendixObject().setValue(context, MemberNames.Inactive.toString(), inactive);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sdemigration.proxies.Vendor that = (sdemigration.proxies.Vendor) obj;
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
		return "SDEMigration.Vendor";
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
