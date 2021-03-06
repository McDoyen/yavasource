// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class ConfigurationItemICT extends sdemigration.proxies.SDEObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.ConfigurationItemICT";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		CICatalogPart("CICatalogPart"),
		Category("Category"),
		Subcategory("Subcategory"),
		Status("Status"),
		Code("Code"),
		Name("Name"),
		SystemID("SystemID"),
		Brand("Brand"),
		ModelVersion("ModelVersion"),
		Site("Site"),
		Country("Country"),
		Location("Location"),
		AdministratorGroup("AdministratorGroup"),
		Remarks("Remarks"),
		Kaartnummer("Kaartnummer"),
		Pukcode("Pukcode"),
		IMEI("IMEI"),
		Capacity("Capacity"),
		Ipadres("Ipadres"),
		CapacityMin("CapacityMin"),
		MACAdres("MACAdres"),
		SerialNumber("SerialNumber"),
		Supplier("Supplier"),
		OwnerName("OwnerName"),
		CostCenter("CostCenter"),
		AssetID("AssetID"),
		StartDate("StartDate"),
		BookValue("BookValue"),
		Inactive("Inactive"),
		PONumber("PONumber"),
		ShortDescription("ShortDescription"),
		ADGroep("ADGroep"),
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

	public ConfigurationItemICT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.ConfigurationItemICT"));
	}

	protected ConfigurationItemICT(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject configurationItemICTMendixObject)
	{
		super(context, configurationItemICTMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.ConfigurationItemICT", configurationItemICTMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.ConfigurationItemICT");
	}

	/**
	 * @deprecated Use 'ConfigurationItemICT.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.ConfigurationItemICT initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.ConfigurationItemICT.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.ConfigurationItemICT initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.ConfigurationItemICT(context, mendixObject);
	}

	public static sdemigration.proxies.ConfigurationItemICT load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.ConfigurationItemICT.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.ConfigurationItemICT> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.ConfigurationItemICT> result = new java.util.ArrayList<sdemigration.proxies.ConfigurationItemICT>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.ConfigurationItemICT" + xpathConstraint))
			result.add(sdemigration.proxies.ConfigurationItemICT.initialize(context, obj));
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
	 * @return value of CICatalogPart
	 */
	public final java.lang.String getCICatalogPart()
	{
		return getCICatalogPart(getContext());
	}

	/**
	 * @param context
	 * @return value of CICatalogPart
	 */
	public final java.lang.String getCICatalogPart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CICatalogPart.toString());
	}

	/**
	 * Set value of CICatalogPart
	 * @param cicatalogpart
	 */
	public final void setCICatalogPart(java.lang.String cicatalogpart)
	{
		setCICatalogPart(getContext(), cicatalogpart);
	}

	/**
	 * Set value of CICatalogPart
	 * @param context
	 * @param cicatalogpart
	 */
	public final void setCICatalogPart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cicatalogpart)
	{
		getMendixObject().setValue(context, MemberNames.CICatalogPart.toString(), cicatalogpart);
	}

	/**
	 * @return value of Category
	 */
	public final java.lang.String getCategory()
	{
		return getCategory(getContext());
	}

	/**
	 * @param context
	 * @return value of Category
	 */
	public final java.lang.String getCategory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Category.toString());
	}

	/**
	 * Set value of Category
	 * @param category
	 */
	public final void setCategory(java.lang.String category)
	{
		setCategory(getContext(), category);
	}

	/**
	 * Set value of Category
	 * @param context
	 * @param category
	 */
	public final void setCategory(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String category)
	{
		getMendixObject().setValue(context, MemberNames.Category.toString(), category);
	}

	/**
	 * @return value of Subcategory
	 */
	public final java.lang.String getSubcategory()
	{
		return getSubcategory(getContext());
	}

	/**
	 * @param context
	 * @return value of Subcategory
	 */
	public final java.lang.String getSubcategory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Subcategory.toString());
	}

	/**
	 * Set value of Subcategory
	 * @param subcategory
	 */
	public final void setSubcategory(java.lang.String subcategory)
	{
		setSubcategory(getContext(), subcategory);
	}

	/**
	 * Set value of Subcategory
	 * @param context
	 * @param subcategory
	 */
	public final void setSubcategory(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String subcategory)
	{
		getMendixObject().setValue(context, MemberNames.Subcategory.toString(), subcategory);
	}

	/**
	 * @return value of Status
	 */
	public final java.lang.String getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final java.lang.String getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Status.toString());
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(java.lang.String status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String status)
	{
		getMendixObject().setValue(context, MemberNames.Status.toString(), status);
	}

	/**
	 * @return value of Code
	 */
	public final java.lang.String getCode()
	{
		return getCode(getContext());
	}

	/**
	 * @param context
	 * @return value of Code
	 */
	public final java.lang.String getCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Code.toString());
	}

	/**
	 * Set value of Code
	 * @param code
	 */
	public final void setCode(java.lang.String code)
	{
		setCode(getContext(), code);
	}

	/**
	 * Set value of Code
	 * @param context
	 * @param code
	 */
	public final void setCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String code)
	{
		getMendixObject().setValue(context, MemberNames.Code.toString(), code);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of SystemID
	 */
	public final java.lang.String getSystemID()
	{
		return getSystemID(getContext());
	}

	/**
	 * @param context
	 * @return value of SystemID
	 */
	public final java.lang.String getSystemID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SystemID.toString());
	}

	/**
	 * Set value of SystemID
	 * @param systemid
	 */
	public final void setSystemID(java.lang.String systemid)
	{
		setSystemID(getContext(), systemid);
	}

	/**
	 * Set value of SystemID
	 * @param context
	 * @param systemid
	 */
	public final void setSystemID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String systemid)
	{
		getMendixObject().setValue(context, MemberNames.SystemID.toString(), systemid);
	}

	/**
	 * @return value of Brand
	 */
	public final java.lang.String getBrand()
	{
		return getBrand(getContext());
	}

	/**
	 * @param context
	 * @return value of Brand
	 */
	public final java.lang.String getBrand(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Brand.toString());
	}

	/**
	 * Set value of Brand
	 * @param brand
	 */
	public final void setBrand(java.lang.String brand)
	{
		setBrand(getContext(), brand);
	}

	/**
	 * Set value of Brand
	 * @param context
	 * @param brand
	 */
	public final void setBrand(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String brand)
	{
		getMendixObject().setValue(context, MemberNames.Brand.toString(), brand);
	}

	/**
	 * @return value of ModelVersion
	 */
	public final java.lang.String getModelVersion()
	{
		return getModelVersion(getContext());
	}

	/**
	 * @param context
	 * @return value of ModelVersion
	 */
	public final java.lang.String getModelVersion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ModelVersion.toString());
	}

	/**
	 * Set value of ModelVersion
	 * @param modelversion
	 */
	public final void setModelVersion(java.lang.String modelversion)
	{
		setModelVersion(getContext(), modelversion);
	}

	/**
	 * Set value of ModelVersion
	 * @param context
	 * @param modelversion
	 */
	public final void setModelVersion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String modelversion)
	{
		getMendixObject().setValue(context, MemberNames.ModelVersion.toString(), modelversion);
	}

	/**
	 * @return value of Site
	 */
	public final java.lang.String getSite()
	{
		return getSite(getContext());
	}

	/**
	 * @param context
	 * @return value of Site
	 */
	public final java.lang.String getSite(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Site.toString());
	}

	/**
	 * Set value of Site
	 * @param site
	 */
	public final void setSite(java.lang.String site)
	{
		setSite(getContext(), site);
	}

	/**
	 * Set value of Site
	 * @param context
	 * @param site
	 */
	public final void setSite(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String site)
	{
		getMendixObject().setValue(context, MemberNames.Site.toString(), site);
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
	 * @return value of Location
	 */
	public final java.lang.String getLocation()
	{
		return getLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of Location
	 */
	public final java.lang.String getLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Location.toString());
	}

	/**
	 * Set value of Location
	 * @param location
	 */
	public final void setLocation(java.lang.String location)
	{
		setLocation(getContext(), location);
	}

	/**
	 * Set value of Location
	 * @param context
	 * @param location
	 */
	public final void setLocation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String location)
	{
		getMendixObject().setValue(context, MemberNames.Location.toString(), location);
	}

	/**
	 * @return value of AdministratorGroup
	 */
	public final java.lang.String getAdministratorGroup()
	{
		return getAdministratorGroup(getContext());
	}

	/**
	 * @param context
	 * @return value of AdministratorGroup
	 */
	public final java.lang.String getAdministratorGroup(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AdministratorGroup.toString());
	}

	/**
	 * Set value of AdministratorGroup
	 * @param administratorgroup
	 */
	public final void setAdministratorGroup(java.lang.String administratorgroup)
	{
		setAdministratorGroup(getContext(), administratorgroup);
	}

	/**
	 * Set value of AdministratorGroup
	 * @param context
	 * @param administratorgroup
	 */
	public final void setAdministratorGroup(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String administratorgroup)
	{
		getMendixObject().setValue(context, MemberNames.AdministratorGroup.toString(), administratorgroup);
	}

	/**
	 * @return value of Remarks
	 */
	public final java.lang.String getRemarks()
	{
		return getRemarks(getContext());
	}

	/**
	 * @param context
	 * @return value of Remarks
	 */
	public final java.lang.String getRemarks(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Remarks.toString());
	}

	/**
	 * Set value of Remarks
	 * @param remarks
	 */
	public final void setRemarks(java.lang.String remarks)
	{
		setRemarks(getContext(), remarks);
	}

	/**
	 * Set value of Remarks
	 * @param context
	 * @param remarks
	 */
	public final void setRemarks(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String remarks)
	{
		getMendixObject().setValue(context, MemberNames.Remarks.toString(), remarks);
	}

	/**
	 * @return value of Kaartnummer
	 */
	public final java.lang.String getKaartnummer()
	{
		return getKaartnummer(getContext());
	}

	/**
	 * @param context
	 * @return value of Kaartnummer
	 */
	public final java.lang.String getKaartnummer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Kaartnummer.toString());
	}

	/**
	 * Set value of Kaartnummer
	 * @param kaartnummer
	 */
	public final void setKaartnummer(java.lang.String kaartnummer)
	{
		setKaartnummer(getContext(), kaartnummer);
	}

	/**
	 * Set value of Kaartnummer
	 * @param context
	 * @param kaartnummer
	 */
	public final void setKaartnummer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String kaartnummer)
	{
		getMendixObject().setValue(context, MemberNames.Kaartnummer.toString(), kaartnummer);
	}

	/**
	 * @return value of Pukcode
	 */
	public final java.lang.String getPukcode()
	{
		return getPukcode(getContext());
	}

	/**
	 * @param context
	 * @return value of Pukcode
	 */
	public final java.lang.String getPukcode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Pukcode.toString());
	}

	/**
	 * Set value of Pukcode
	 * @param pukcode
	 */
	public final void setPukcode(java.lang.String pukcode)
	{
		setPukcode(getContext(), pukcode);
	}

	/**
	 * Set value of Pukcode
	 * @param context
	 * @param pukcode
	 */
	public final void setPukcode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String pukcode)
	{
		getMendixObject().setValue(context, MemberNames.Pukcode.toString(), pukcode);
	}

	/**
	 * @return value of IMEI
	 */
	public final java.lang.String getIMEI()
	{
		return getIMEI(getContext());
	}

	/**
	 * @param context
	 * @return value of IMEI
	 */
	public final java.lang.String getIMEI(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.IMEI.toString());
	}

	/**
	 * Set value of IMEI
	 * @param imei
	 */
	public final void setIMEI(java.lang.String imei)
	{
		setIMEI(getContext(), imei);
	}

	/**
	 * Set value of IMEI
	 * @param context
	 * @param imei
	 */
	public final void setIMEI(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String imei)
	{
		getMendixObject().setValue(context, MemberNames.IMEI.toString(), imei);
	}

	/**
	 * @return value of Capacity
	 */
	public final java.lang.String getCapacity()
	{
		return getCapacity(getContext());
	}

	/**
	 * @param context
	 * @return value of Capacity
	 */
	public final java.lang.String getCapacity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Capacity.toString());
	}

	/**
	 * Set value of Capacity
	 * @param capacity
	 */
	public final void setCapacity(java.lang.String capacity)
	{
		setCapacity(getContext(), capacity);
	}

	/**
	 * Set value of Capacity
	 * @param context
	 * @param capacity
	 */
	public final void setCapacity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String capacity)
	{
		getMendixObject().setValue(context, MemberNames.Capacity.toString(), capacity);
	}

	/**
	 * @return value of Ipadres
	 */
	public final java.lang.String getIpadres()
	{
		return getIpadres(getContext());
	}

	/**
	 * @param context
	 * @return value of Ipadres
	 */
	public final java.lang.String getIpadres(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Ipadres.toString());
	}

	/**
	 * Set value of Ipadres
	 * @param ipadres
	 */
	public final void setIpadres(java.lang.String ipadres)
	{
		setIpadres(getContext(), ipadres);
	}

	/**
	 * Set value of Ipadres
	 * @param context
	 * @param ipadres
	 */
	public final void setIpadres(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ipadres)
	{
		getMendixObject().setValue(context, MemberNames.Ipadres.toString(), ipadres);
	}

	/**
	 * @return value of CapacityMin
	 */
	public final java.lang.String getCapacityMin()
	{
		return getCapacityMin(getContext());
	}

	/**
	 * @param context
	 * @return value of CapacityMin
	 */
	public final java.lang.String getCapacityMin(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CapacityMin.toString());
	}

	/**
	 * Set value of CapacityMin
	 * @param capacitymin
	 */
	public final void setCapacityMin(java.lang.String capacitymin)
	{
		setCapacityMin(getContext(), capacitymin);
	}

	/**
	 * Set value of CapacityMin
	 * @param context
	 * @param capacitymin
	 */
	public final void setCapacityMin(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String capacitymin)
	{
		getMendixObject().setValue(context, MemberNames.CapacityMin.toString(), capacitymin);
	}

	/**
	 * @return value of MACAdres
	 */
	public final java.lang.String getMACAdres()
	{
		return getMACAdres(getContext());
	}

	/**
	 * @param context
	 * @return value of MACAdres
	 */
	public final java.lang.String getMACAdres(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MACAdres.toString());
	}

	/**
	 * Set value of MACAdres
	 * @param macadres
	 */
	public final void setMACAdres(java.lang.String macadres)
	{
		setMACAdres(getContext(), macadres);
	}

	/**
	 * Set value of MACAdres
	 * @param context
	 * @param macadres
	 */
	public final void setMACAdres(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String macadres)
	{
		getMendixObject().setValue(context, MemberNames.MACAdres.toString(), macadres);
	}

	/**
	 * @return value of SerialNumber
	 */
	public final java.lang.String getSerialNumber()
	{
		return getSerialNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of SerialNumber
	 */
	public final java.lang.String getSerialNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SerialNumber.toString());
	}

	/**
	 * Set value of SerialNumber
	 * @param serialnumber
	 */
	public final void setSerialNumber(java.lang.String serialnumber)
	{
		setSerialNumber(getContext(), serialnumber);
	}

	/**
	 * Set value of SerialNumber
	 * @param context
	 * @param serialnumber
	 */
	public final void setSerialNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String serialnumber)
	{
		getMendixObject().setValue(context, MemberNames.SerialNumber.toString(), serialnumber);
	}

	/**
	 * @return value of Supplier
	 */
	public final java.lang.String getSupplier()
	{
		return getSupplier(getContext());
	}

	/**
	 * @param context
	 * @return value of Supplier
	 */
	public final java.lang.String getSupplier(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Supplier.toString());
	}

	/**
	 * Set value of Supplier
	 * @param supplier
	 */
	public final void setSupplier(java.lang.String supplier)
	{
		setSupplier(getContext(), supplier);
	}

	/**
	 * Set value of Supplier
	 * @param context
	 * @param supplier
	 */
	public final void setSupplier(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String supplier)
	{
		getMendixObject().setValue(context, MemberNames.Supplier.toString(), supplier);
	}

	/**
	 * @return value of OwnerName
	 */
	public final java.lang.String getOwnerName()
	{
		return getOwnerName(getContext());
	}

	/**
	 * @param context
	 * @return value of OwnerName
	 */
	public final java.lang.String getOwnerName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OwnerName.toString());
	}

	/**
	 * Set value of OwnerName
	 * @param ownername
	 */
	public final void setOwnerName(java.lang.String ownername)
	{
		setOwnerName(getContext(), ownername);
	}

	/**
	 * Set value of OwnerName
	 * @param context
	 * @param ownername
	 */
	public final void setOwnerName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ownername)
	{
		getMendixObject().setValue(context, MemberNames.OwnerName.toString(), ownername);
	}

	/**
	 * @return value of CostCenter
	 */
	public final java.lang.String getCostCenter()
	{
		return getCostCenter(getContext());
	}

	/**
	 * @param context
	 * @return value of CostCenter
	 */
	public final java.lang.String getCostCenter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CostCenter.toString());
	}

	/**
	 * Set value of CostCenter
	 * @param costcenter
	 */
	public final void setCostCenter(java.lang.String costcenter)
	{
		setCostCenter(getContext(), costcenter);
	}

	/**
	 * Set value of CostCenter
	 * @param context
	 * @param costcenter
	 */
	public final void setCostCenter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String costcenter)
	{
		getMendixObject().setValue(context, MemberNames.CostCenter.toString(), costcenter);
	}

	/**
	 * @return value of AssetID
	 */
	public final java.lang.String getAssetID()
	{
		return getAssetID(getContext());
	}

	/**
	 * @param context
	 * @return value of AssetID
	 */
	public final java.lang.String getAssetID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AssetID.toString());
	}

	/**
	 * Set value of AssetID
	 * @param assetid
	 */
	public final void setAssetID(java.lang.String assetid)
	{
		setAssetID(getContext(), assetid);
	}

	/**
	 * Set value of AssetID
	 * @param context
	 * @param assetid
	 */
	public final void setAssetID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String assetid)
	{
		getMendixObject().setValue(context, MemberNames.AssetID.toString(), assetid);
	}

	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of BookValue
	 */
	public final java.lang.String getBookValue()
	{
		return getBookValue(getContext());
	}

	/**
	 * @param context
	 * @return value of BookValue
	 */
	public final java.lang.String getBookValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BookValue.toString());
	}

	/**
	 * Set value of BookValue
	 * @param bookvalue
	 */
	public final void setBookValue(java.lang.String bookvalue)
	{
		setBookValue(getContext(), bookvalue);
	}

	/**
	 * Set value of BookValue
	 * @param context
	 * @param bookvalue
	 */
	public final void setBookValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bookvalue)
	{
		getMendixObject().setValue(context, MemberNames.BookValue.toString(), bookvalue);
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

	/**
	 * @return value of PONumber
	 */
	public final java.lang.String getPONumber()
	{
		return getPONumber(getContext());
	}

	/**
	 * @param context
	 * @return value of PONumber
	 */
	public final java.lang.String getPONumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PONumber.toString());
	}

	/**
	 * Set value of PONumber
	 * @param ponumber
	 */
	public final void setPONumber(java.lang.String ponumber)
	{
		setPONumber(getContext(), ponumber);
	}

	/**
	 * Set value of PONumber
	 * @param context
	 * @param ponumber
	 */
	public final void setPONumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ponumber)
	{
		getMendixObject().setValue(context, MemberNames.PONumber.toString(), ponumber);
	}

	/**
	 * @return value of ShortDescription
	 */
	public final java.lang.String getShortDescription()
	{
		return getShortDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of ShortDescription
	 */
	public final java.lang.String getShortDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ShortDescription.toString());
	}

	/**
	 * Set value of ShortDescription
	 * @param shortdescription
	 */
	public final void setShortDescription(java.lang.String shortdescription)
	{
		setShortDescription(getContext(), shortdescription);
	}

	/**
	 * Set value of ShortDescription
	 * @param context
	 * @param shortdescription
	 */
	public final void setShortDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String shortdescription)
	{
		getMendixObject().setValue(context, MemberNames.ShortDescription.toString(), shortdescription);
	}

	/**
	 * @return value of ADGroep
	 */
	public final java.lang.String getADGroep()
	{
		return getADGroep(getContext());
	}

	/**
	 * @param context
	 * @return value of ADGroep
	 */
	public final java.lang.String getADGroep(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ADGroep.toString());
	}

	/**
	 * Set value of ADGroep
	 * @param adgroep
	 */
	public final void setADGroep(java.lang.String adgroep)
	{
		setADGroep(getContext(), adgroep);
	}

	/**
	 * Set value of ADGroep
	 * @param context
	 * @param adgroep
	 */
	public final void setADGroep(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String adgroep)
	{
		getMendixObject().setValue(context, MemberNames.ADGroep.toString(), adgroep);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sdemigration.proxies.ConfigurationItemICT that = (sdemigration.proxies.ConfigurationItemICT) obj;
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
		return "SDEMigration.ConfigurationItemICT";
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
