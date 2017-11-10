// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public class CIImport extends customlvnl.proxies.ImportLog
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CustomLVNL.CIImport";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CIName("CIName"),
		CIType("CIType"),
		CIStatus("CIStatus"),
		ShortDescription("ShortDescription"),
		SerialNumber("SerialNumber"),
		CITag("CITag"),
		SNIQRCode("SNIQRCode"),
		ModelVersion("ModelVersion"),
		ServiceContract("ServiceContract"),
		Node("Node"),
		AssemblyID("AssemblyID"),
		StockLocation("StockLocation"),
		ReplacementDate("ReplacementDate"),
		TestDate("TestDate"),
		PurchaseDate("PurchaseDate"),
		PONumber("PONumber"),
		InstallDate("InstallDate"),
		Manufacturer("Manufacturer"),
		LocationICT("LocationICT"),
		RoomICT("RoomICT"),
		OwnerGroup("OwnerGroup"),
		IsNew("IsNew"),
		ProcessDate("ProcessDate"),
		StatusNote("StatusNote"),
		ProcessStatus("ProcessStatus"),
		Number("Number"),
		Validated("Validated"),
		Processed("Processed"),
		ImportType("ImportType"),
		ImportLog_ImportRun("CustomLVNL.ImportLog_ImportRun");

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

	public CIImport(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CustomLVNL.CIImport"));
	}

	protected CIImport(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cIImportMendixObject)
	{
		super(context, cIImportMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("CustomLVNL.CIImport", cIImportMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CustomLVNL.CIImport");
	}

	/**
	 * @deprecated Use 'CIImport.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static customlvnl.proxies.CIImport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return customlvnl.proxies.CIImport.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static customlvnl.proxies.CIImport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new customlvnl.proxies.CIImport(context, mendixObject);
	}

	public static customlvnl.proxies.CIImport load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return customlvnl.proxies.CIImport.initialize(context, mendixObject);
	}

	public static java.util.List<customlvnl.proxies.CIImport> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<customlvnl.proxies.CIImport> result = new java.util.ArrayList<customlvnl.proxies.CIImport>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CustomLVNL.CIImport" + xpathConstraint))
			result.add(customlvnl.proxies.CIImport.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of CIName
	 */
	public final java.lang.String getCIName()
	{
		return getCIName(getContext());
	}

	/**
	 * @param context
	 * @return value of CIName
	 */
	public final java.lang.String getCIName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CIName.toString());
	}

	/**
	 * Set value of CIName
	 * @param ciname
	 */
	public final void setCIName(java.lang.String ciname)
	{
		setCIName(getContext(), ciname);
	}

	/**
	 * Set value of CIName
	 * @param context
	 * @param ciname
	 */
	public final void setCIName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ciname)
	{
		getMendixObject().setValue(context, MemberNames.CIName.toString(), ciname);
	}

	/**
	 * @return value of CIType
	 */
	public final java.lang.String getCIType()
	{
		return getCIType(getContext());
	}

	/**
	 * @param context
	 * @return value of CIType
	 */
	public final java.lang.String getCIType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CIType.toString());
	}

	/**
	 * Set value of CIType
	 * @param citype
	 */
	public final void setCIType(java.lang.String citype)
	{
		setCIType(getContext(), citype);
	}

	/**
	 * Set value of CIType
	 * @param context
	 * @param citype
	 */
	public final void setCIType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String citype)
	{
		getMendixObject().setValue(context, MemberNames.CIType.toString(), citype);
	}

	/**
	 * @return value of CIStatus
	 */
	public final java.lang.String getCIStatus()
	{
		return getCIStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of CIStatus
	 */
	public final java.lang.String getCIStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CIStatus.toString());
	}

	/**
	 * Set value of CIStatus
	 * @param cistatus
	 */
	public final void setCIStatus(java.lang.String cistatus)
	{
		setCIStatus(getContext(), cistatus);
	}

	/**
	 * Set value of CIStatus
	 * @param context
	 * @param cistatus
	 */
	public final void setCIStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cistatus)
	{
		getMendixObject().setValue(context, MemberNames.CIStatus.toString(), cistatus);
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
	 * @return value of CITag
	 */
	public final java.lang.String getCITag()
	{
		return getCITag(getContext());
	}

	/**
	 * @param context
	 * @return value of CITag
	 */
	public final java.lang.String getCITag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CITag.toString());
	}

	/**
	 * Set value of CITag
	 * @param citag
	 */
	public final void setCITag(java.lang.String citag)
	{
		setCITag(getContext(), citag);
	}

	/**
	 * Set value of CITag
	 * @param context
	 * @param citag
	 */
	public final void setCITag(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String citag)
	{
		getMendixObject().setValue(context, MemberNames.CITag.toString(), citag);
	}

	/**
	 * @return value of SNIQRCode
	 */
	public final java.lang.String getSNIQRCode()
	{
		return getSNIQRCode(getContext());
	}

	/**
	 * @param context
	 * @return value of SNIQRCode
	 */
	public final java.lang.String getSNIQRCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SNIQRCode.toString());
	}

	/**
	 * Set value of SNIQRCode
	 * @param sniqrcode
	 */
	public final void setSNIQRCode(java.lang.String sniqrcode)
	{
		setSNIQRCode(getContext(), sniqrcode);
	}

	/**
	 * Set value of SNIQRCode
	 * @param context
	 * @param sniqrcode
	 */
	public final void setSNIQRCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sniqrcode)
	{
		getMendixObject().setValue(context, MemberNames.SNIQRCode.toString(), sniqrcode);
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
	 * @return value of ServiceContract
	 */
	public final java.lang.String getServiceContract()
	{
		return getServiceContract(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceContract
	 */
	public final java.lang.String getServiceContract(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ServiceContract.toString());
	}

	/**
	 * Set value of ServiceContract
	 * @param servicecontract
	 */
	public final void setServiceContract(java.lang.String servicecontract)
	{
		setServiceContract(getContext(), servicecontract);
	}

	/**
	 * Set value of ServiceContract
	 * @param context
	 * @param servicecontract
	 */
	public final void setServiceContract(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String servicecontract)
	{
		getMendixObject().setValue(context, MemberNames.ServiceContract.toString(), servicecontract);
	}

	/**
	 * @return value of Node
	 */
	public final java.lang.String getNode()
	{
		return getNode(getContext());
	}

	/**
	 * @param context
	 * @return value of Node
	 */
	public final java.lang.String getNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Node.toString());
	}

	/**
	 * Set value of Node
	 * @param node
	 */
	public final void setNode(java.lang.String node)
	{
		setNode(getContext(), node);
	}

	/**
	 * Set value of Node
	 * @param context
	 * @param node
	 */
	public final void setNode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String node)
	{
		getMendixObject().setValue(context, MemberNames.Node.toString(), node);
	}

	/**
	 * @return value of AssemblyID
	 */
	public final java.lang.String getAssemblyID()
	{
		return getAssemblyID(getContext());
	}

	/**
	 * @param context
	 * @return value of AssemblyID
	 */
	public final java.lang.String getAssemblyID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AssemblyID.toString());
	}

	/**
	 * Set value of AssemblyID
	 * @param assemblyid
	 */
	public final void setAssemblyID(java.lang.String assemblyid)
	{
		setAssemblyID(getContext(), assemblyid);
	}

	/**
	 * Set value of AssemblyID
	 * @param context
	 * @param assemblyid
	 */
	public final void setAssemblyID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String assemblyid)
	{
		getMendixObject().setValue(context, MemberNames.AssemblyID.toString(), assemblyid);
	}

	/**
	 * @return value of StockLocation
	 */
	public final java.lang.String getStockLocation()
	{
		return getStockLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of StockLocation
	 */
	public final java.lang.String getStockLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StockLocation.toString());
	}

	/**
	 * Set value of StockLocation
	 * @param stocklocation
	 */
	public final void setStockLocation(java.lang.String stocklocation)
	{
		setStockLocation(getContext(), stocklocation);
	}

	/**
	 * Set value of StockLocation
	 * @param context
	 * @param stocklocation
	 */
	public final void setStockLocation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String stocklocation)
	{
		getMendixObject().setValue(context, MemberNames.StockLocation.toString(), stocklocation);
	}

	/**
	 * @return value of ReplacementDate
	 */
	public final java.lang.String getReplacementDate()
	{
		return getReplacementDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ReplacementDate
	 */
	public final java.lang.String getReplacementDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ReplacementDate.toString());
	}

	/**
	 * Set value of ReplacementDate
	 * @param replacementdate
	 */
	public final void setReplacementDate(java.lang.String replacementdate)
	{
		setReplacementDate(getContext(), replacementdate);
	}

	/**
	 * Set value of ReplacementDate
	 * @param context
	 * @param replacementdate
	 */
	public final void setReplacementDate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String replacementdate)
	{
		getMendixObject().setValue(context, MemberNames.ReplacementDate.toString(), replacementdate);
	}

	/**
	 * @return value of TestDate
	 */
	public final java.lang.String getTestDate()
	{
		return getTestDate(getContext());
	}

	/**
	 * @param context
	 * @return value of TestDate
	 */
	public final java.lang.String getTestDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TestDate.toString());
	}

	/**
	 * Set value of TestDate
	 * @param testdate
	 */
	public final void setTestDate(java.lang.String testdate)
	{
		setTestDate(getContext(), testdate);
	}

	/**
	 * Set value of TestDate
	 * @param context
	 * @param testdate
	 */
	public final void setTestDate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String testdate)
	{
		getMendixObject().setValue(context, MemberNames.TestDate.toString(), testdate);
	}

	/**
	 * @return value of PurchaseDate
	 */
	public final java.lang.String getPurchaseDate()
	{
		return getPurchaseDate(getContext());
	}

	/**
	 * @param context
	 * @return value of PurchaseDate
	 */
	public final java.lang.String getPurchaseDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PurchaseDate.toString());
	}

	/**
	 * Set value of PurchaseDate
	 * @param purchasedate
	 */
	public final void setPurchaseDate(java.lang.String purchasedate)
	{
		setPurchaseDate(getContext(), purchasedate);
	}

	/**
	 * Set value of PurchaseDate
	 * @param context
	 * @param purchasedate
	 */
	public final void setPurchaseDate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String purchasedate)
	{
		getMendixObject().setValue(context, MemberNames.PurchaseDate.toString(), purchasedate);
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
	 * @return value of InstallDate
	 */
	public final java.lang.String getInstallDate()
	{
		return getInstallDate(getContext());
	}

	/**
	 * @param context
	 * @return value of InstallDate
	 */
	public final java.lang.String getInstallDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InstallDate.toString());
	}

	/**
	 * Set value of InstallDate
	 * @param installdate
	 */
	public final void setInstallDate(java.lang.String installdate)
	{
		setInstallDate(getContext(), installdate);
	}

	/**
	 * Set value of InstallDate
	 * @param context
	 * @param installdate
	 */
	public final void setInstallDate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String installdate)
	{
		getMendixObject().setValue(context, MemberNames.InstallDate.toString(), installdate);
	}

	/**
	 * @return value of Manufacturer
	 */
	public final java.lang.String getManufacturer()
	{
		return getManufacturer(getContext());
	}

	/**
	 * @param context
	 * @return value of Manufacturer
	 */
	public final java.lang.String getManufacturer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Manufacturer.toString());
	}

	/**
	 * Set value of Manufacturer
	 * @param manufacturer
	 */
	public final void setManufacturer(java.lang.String manufacturer)
	{
		setManufacturer(getContext(), manufacturer);
	}

	/**
	 * Set value of Manufacturer
	 * @param context
	 * @param manufacturer
	 */
	public final void setManufacturer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String manufacturer)
	{
		getMendixObject().setValue(context, MemberNames.Manufacturer.toString(), manufacturer);
	}

	/**
	 * @return value of LocationICT
	 */
	public final java.lang.String getLocationICT()
	{
		return getLocationICT(getContext());
	}

	/**
	 * @param context
	 * @return value of LocationICT
	 */
	public final java.lang.String getLocationICT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LocationICT.toString());
	}

	/**
	 * Set value of LocationICT
	 * @param locationict
	 */
	public final void setLocationICT(java.lang.String locationict)
	{
		setLocationICT(getContext(), locationict);
	}

	/**
	 * Set value of LocationICT
	 * @param context
	 * @param locationict
	 */
	public final void setLocationICT(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String locationict)
	{
		getMendixObject().setValue(context, MemberNames.LocationICT.toString(), locationict);
	}

	/**
	 * @return value of RoomICT
	 */
	public final java.lang.String getRoomICT()
	{
		return getRoomICT(getContext());
	}

	/**
	 * @param context
	 * @return value of RoomICT
	 */
	public final java.lang.String getRoomICT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RoomICT.toString());
	}

	/**
	 * Set value of RoomICT
	 * @param roomict
	 */
	public final void setRoomICT(java.lang.String roomict)
	{
		setRoomICT(getContext(), roomict);
	}

	/**
	 * Set value of RoomICT
	 * @param context
	 * @param roomict
	 */
	public final void setRoomICT(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String roomict)
	{
		getMendixObject().setValue(context, MemberNames.RoomICT.toString(), roomict);
	}

	/**
	 * @return value of OwnerGroup
	 */
	public final java.lang.String getOwnerGroup()
	{
		return getOwnerGroup(getContext());
	}

	/**
	 * @param context
	 * @return value of OwnerGroup
	 */
	public final java.lang.String getOwnerGroup(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OwnerGroup.toString());
	}

	/**
	 * Set value of OwnerGroup
	 * @param ownergroup
	 */
	public final void setOwnerGroup(java.lang.String ownergroup)
	{
		setOwnerGroup(getContext(), ownergroup);
	}

	/**
	 * Set value of OwnerGroup
	 * @param context
	 * @param ownergroup
	 */
	public final void setOwnerGroup(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ownergroup)
	{
		getMendixObject().setValue(context, MemberNames.OwnerGroup.toString(), ownergroup);
	}

	/**
	 * @return value of IsNew
	 */
	public final java.lang.String getIsNew()
	{
		return getIsNew(getContext());
	}

	/**
	 * @param context
	 * @return value of IsNew
	 */
	public final java.lang.String getIsNew(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.IsNew.toString());
	}

	/**
	 * Set value of IsNew
	 * @param isnew
	 */
	public final void setIsNew(java.lang.String isnew)
	{
		setIsNew(getContext(), isnew);
	}

	/**
	 * Set value of IsNew
	 * @param context
	 * @param isnew
	 */
	public final void setIsNew(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String isnew)
	{
		getMendixObject().setValue(context, MemberNames.IsNew.toString(), isnew);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final customlvnl.proxies.CIImport that = (customlvnl.proxies.CIImport) obj;
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
		return "CustomLVNL.CIImport";
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
