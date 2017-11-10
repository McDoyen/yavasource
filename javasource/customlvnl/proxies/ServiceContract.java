// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public class ServiceContract
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject serviceContractMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CustomLVNL.ServiceContract";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ServiceContractNumber("ServiceContractNumber"),
		EffectiveDate("EffectiveDate"),
		ExpirationDate("ExpirationDate"),
		TurnAroundTime("TurnAroundTime"),
		PriceYear("PriceYear"),
		OnSiteResponse("OnSiteResponse"),
		Comments("Comments"),
		Inactive("Inactive"),
		ServiceContract_ContractType("CustomLVNL.ServiceContract_ContractType"),
		ServiceContract_BusinessGroup("CustomLVNL.ServiceContract_BusinessGroup");

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

	public ServiceContract(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CustomLVNL.ServiceContract"));
	}

	protected ServiceContract(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject serviceContractMendixObject)
	{
		if (serviceContractMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CustomLVNL.ServiceContract", serviceContractMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CustomLVNL.ServiceContract");

		this.serviceContractMendixObject = serviceContractMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ServiceContract.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static customlvnl.proxies.ServiceContract initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return customlvnl.proxies.ServiceContract.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static customlvnl.proxies.ServiceContract initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new customlvnl.proxies.ServiceContract(context, mendixObject);
	}

	public static customlvnl.proxies.ServiceContract load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return customlvnl.proxies.ServiceContract.initialize(context, mendixObject);
	}

	public static java.util.List<customlvnl.proxies.ServiceContract> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<customlvnl.proxies.ServiceContract> result = new java.util.ArrayList<customlvnl.proxies.ServiceContract>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CustomLVNL.ServiceContract" + xpathConstraint))
			result.add(customlvnl.proxies.ServiceContract.initialize(context, obj));
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
	 * @return value of ServiceContractNumber
	 */
	public final java.lang.String getServiceContractNumber()
	{
		return getServiceContractNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceContractNumber
	 */
	public final java.lang.String getServiceContractNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ServiceContractNumber.toString());
	}

	/**
	 * Set value of ServiceContractNumber
	 * @param servicecontractnumber
	 */
	public final void setServiceContractNumber(java.lang.String servicecontractnumber)
	{
		setServiceContractNumber(getContext(), servicecontractnumber);
	}

	/**
	 * Set value of ServiceContractNumber
	 * @param context
	 * @param servicecontractnumber
	 */
	public final void setServiceContractNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String servicecontractnumber)
	{
		getMendixObject().setValue(context, MemberNames.ServiceContractNumber.toString(), servicecontractnumber);
	}

	/**
	 * @return value of EffectiveDate
	 */
	public final java.util.Date getEffectiveDate()
	{
		return getEffectiveDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EffectiveDate
	 */
	public final java.util.Date getEffectiveDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EffectiveDate.toString());
	}

	/**
	 * Set value of EffectiveDate
	 * @param effectivedate
	 */
	public final void setEffectiveDate(java.util.Date effectivedate)
	{
		setEffectiveDate(getContext(), effectivedate);
	}

	/**
	 * Set value of EffectiveDate
	 * @param context
	 * @param effectivedate
	 */
	public final void setEffectiveDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date effectivedate)
	{
		getMendixObject().setValue(context, MemberNames.EffectiveDate.toString(), effectivedate);
	}

	/**
	 * @return value of ExpirationDate
	 */
	public final java.util.Date getExpirationDate()
	{
		return getExpirationDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpirationDate
	 */
	public final java.util.Date getExpirationDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ExpirationDate.toString());
	}

	/**
	 * Set value of ExpirationDate
	 * @param expirationdate
	 */
	public final void setExpirationDate(java.util.Date expirationdate)
	{
		setExpirationDate(getContext(), expirationdate);
	}

	/**
	 * Set value of ExpirationDate
	 * @param context
	 * @param expirationdate
	 */
	public final void setExpirationDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date expirationdate)
	{
		getMendixObject().setValue(context, MemberNames.ExpirationDate.toString(), expirationdate);
	}

	/**
	 * @return value of TurnAroundTime
	 */
	public final java.lang.Integer getTurnAroundTime()
	{
		return getTurnAroundTime(getContext());
	}

	/**
	 * @param context
	 * @return value of TurnAroundTime
	 */
	public final java.lang.Integer getTurnAroundTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TurnAroundTime.toString());
	}

	/**
	 * Set value of TurnAroundTime
	 * @param turnaroundtime
	 */
	public final void setTurnAroundTime(java.lang.Integer turnaroundtime)
	{
		setTurnAroundTime(getContext(), turnaroundtime);
	}

	/**
	 * Set value of TurnAroundTime
	 * @param context
	 * @param turnaroundtime
	 */
	public final void setTurnAroundTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer turnaroundtime)
	{
		getMendixObject().setValue(context, MemberNames.TurnAroundTime.toString(), turnaroundtime);
	}

	/**
	 * @return value of PriceYear
	 */
	public final java.math.BigDecimal getPriceYear()
	{
		return getPriceYear(getContext());
	}

	/**
	 * @param context
	 * @return value of PriceYear
	 */
	public final java.math.BigDecimal getPriceYear(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.PriceYear.toString());
	}

	/**
	 * Set value of PriceYear
	 * @param priceyear
	 */
	public final void setPriceYear(java.math.BigDecimal priceyear)
	{
		setPriceYear(getContext(), priceyear);
	}

	/**
	 * Set value of PriceYear
	 * @param context
	 * @param priceyear
	 */
	public final void setPriceYear(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal priceyear)
	{
		getMendixObject().setValue(context, MemberNames.PriceYear.toString(), priceyear);
	}

	/**
	 * @return value of OnSiteResponse
	 */
	public final java.lang.Integer getOnSiteResponse()
	{
		return getOnSiteResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of OnSiteResponse
	 */
	public final java.lang.Integer getOnSiteResponse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OnSiteResponse.toString());
	}

	/**
	 * Set value of OnSiteResponse
	 * @param onsiteresponse
	 */
	public final void setOnSiteResponse(java.lang.Integer onsiteresponse)
	{
		setOnSiteResponse(getContext(), onsiteresponse);
	}

	/**
	 * Set value of OnSiteResponse
	 * @param context
	 * @param onsiteresponse
	 */
	public final void setOnSiteResponse(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer onsiteresponse)
	{
		getMendixObject().setValue(context, MemberNames.OnSiteResponse.toString(), onsiteresponse);
	}

	/**
	 * @return value of Comments
	 */
	public final java.lang.String getComments()
	{
		return getComments(getContext());
	}

	/**
	 * @param context
	 * @return value of Comments
	 */
	public final java.lang.String getComments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Comments.toString());
	}

	/**
	 * Set value of Comments
	 * @param comments
	 */
	public final void setComments(java.lang.String comments)
	{
		setComments(getContext(), comments);
	}

	/**
	 * Set value of Comments
	 * @param context
	 * @param comments
	 */
	public final void setComments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String comments)
	{
		getMendixObject().setValue(context, MemberNames.Comments.toString(), comments);
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
	 * @return value of ServiceContract_ContractType
	 */
	public final customlvnl.proxies.ContractType getServiceContract_ContractType() throws com.mendix.core.CoreException
	{
		return getServiceContract_ContractType(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceContract_ContractType
	 */
	public final customlvnl.proxies.ContractType getServiceContract_ContractType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		customlvnl.proxies.ContractType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ServiceContract_ContractType.toString());
		if (identifier != null)
			result = customlvnl.proxies.ContractType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ServiceContract_ContractType
	 * @param servicecontract_contracttype
	 */
	public final void setServiceContract_ContractType(customlvnl.proxies.ContractType servicecontract_contracttype)
	{
		setServiceContract_ContractType(getContext(), servicecontract_contracttype);
	}

	/**
	 * Set value of ServiceContract_ContractType
	 * @param context
	 * @param servicecontract_contracttype
	 */
	public final void setServiceContract_ContractType(com.mendix.systemwideinterfaces.core.IContext context, customlvnl.proxies.ContractType servicecontract_contracttype)
	{
		if (servicecontract_contracttype == null)
			getMendixObject().setValue(context, MemberNames.ServiceContract_ContractType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ServiceContract_ContractType.toString(), servicecontract_contracttype.getMendixObject().getId());
	}

	/**
	 * @return value of ServiceContract_BusinessGroup
	 */
	public final nap.proxies.BusinessGroup getServiceContract_BusinessGroup() throws com.mendix.core.CoreException
	{
		return getServiceContract_BusinessGroup(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceContract_BusinessGroup
	 */
	public final nap.proxies.BusinessGroup getServiceContract_BusinessGroup(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.BusinessGroup result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ServiceContract_BusinessGroup.toString());
		if (identifier != null)
			result = nap.proxies.BusinessGroup.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ServiceContract_BusinessGroup
	 * @param servicecontract_businessgroup
	 */
	public final void setServiceContract_BusinessGroup(nap.proxies.BusinessGroup servicecontract_businessgroup)
	{
		setServiceContract_BusinessGroup(getContext(), servicecontract_businessgroup);
	}

	/**
	 * Set value of ServiceContract_BusinessGroup
	 * @param context
	 * @param servicecontract_businessgroup
	 */
	public final void setServiceContract_BusinessGroup(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.BusinessGroup servicecontract_businessgroup)
	{
		if (servicecontract_businessgroup == null)
			getMendixObject().setValue(context, MemberNames.ServiceContract_BusinessGroup.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ServiceContract_BusinessGroup.toString(), servicecontract_businessgroup.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return serviceContractMendixObject;
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
			final customlvnl.proxies.ServiceContract that = (customlvnl.proxies.ServiceContract) obj;
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
		return "CustomLVNL.ServiceContract";
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
