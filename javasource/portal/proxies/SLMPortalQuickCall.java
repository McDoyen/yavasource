// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package portal.proxies;

public class SLMPortalQuickCall extends portal.proxies.PortalQuickCall
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Portal.SLMPortalQuickCall";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ShowServiceProcess("ShowServiceProcess"),
		ShowService("ShowService"),
		ShowIUPCombination("ShowIUPCombination"),
		Valid("Valid"),
		DeeplinkCode("DeeplinkCode"),
		Description("Description"),
		DescriptionNoHtml("DescriptionNoHtml"),
		ShortDescription("ShortDescription"),
		CreateQueuedRequest("CreateQueuedRequest"),
		SLMPortalQuickCall_Contract("Portal.SLMPortalQuickCall_Contract"),
		SLMPortalQuickCall_IUP_Combination("Portal.SLMPortalQuickCall_IUP_Combination"),
		SLMPortalQuickCall_Service("Portal.SLMPortalQuickCall_Service"),
		SLMPortalQuickCall_Service_Process("Portal.SLMPortalQuickCall_Service_Process"),
		SLMPortalQuickCall_Organisation("Portal.SLMPortalQuickCall_Organisation");

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

	public SLMPortalQuickCall(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Portal.SLMPortalQuickCall"));
	}

	protected SLMPortalQuickCall(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sLMPortalQuickCallMendixObject)
	{
		super(context, sLMPortalQuickCallMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Portal.SLMPortalQuickCall", sLMPortalQuickCallMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Portal.SLMPortalQuickCall");
	}

	/**
	 * @deprecated Use 'SLMPortalQuickCall.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static portal.proxies.SLMPortalQuickCall initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return portal.proxies.SLMPortalQuickCall.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static portal.proxies.SLMPortalQuickCall initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new portal.proxies.SLMPortalQuickCall(context, mendixObject);
	}

	public static portal.proxies.SLMPortalQuickCall load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return portal.proxies.SLMPortalQuickCall.initialize(context, mendixObject);
	}

	public static java.util.List<portal.proxies.SLMPortalQuickCall> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<portal.proxies.SLMPortalQuickCall> result = new java.util.ArrayList<portal.proxies.SLMPortalQuickCall>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Portal.SLMPortalQuickCall" + xpathConstraint))
			result.add(portal.proxies.SLMPortalQuickCall.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ShowServiceProcess
	 */
	public final java.lang.Boolean getShowServiceProcess()
	{
		return getShowServiceProcess(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowServiceProcess
	 */
	public final java.lang.Boolean getShowServiceProcess(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowServiceProcess.toString());
	}

	/**
	 * Set value of ShowServiceProcess
	 * @param showserviceprocess
	 */
	public final void setShowServiceProcess(java.lang.Boolean showserviceprocess)
	{
		setShowServiceProcess(getContext(), showserviceprocess);
	}

	/**
	 * Set value of ShowServiceProcess
	 * @param context
	 * @param showserviceprocess
	 */
	public final void setShowServiceProcess(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showserviceprocess)
	{
		getMendixObject().setValue(context, MemberNames.ShowServiceProcess.toString(), showserviceprocess);
	}

	/**
	 * @return value of ShowService
	 */
	public final java.lang.Boolean getShowService()
	{
		return getShowService(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowService
	 */
	public final java.lang.Boolean getShowService(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowService.toString());
	}

	/**
	 * Set value of ShowService
	 * @param showservice
	 */
	public final void setShowService(java.lang.Boolean showservice)
	{
		setShowService(getContext(), showservice);
	}

	/**
	 * Set value of ShowService
	 * @param context
	 * @param showservice
	 */
	public final void setShowService(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showservice)
	{
		getMendixObject().setValue(context, MemberNames.ShowService.toString(), showservice);
	}

	/**
	 * @return value of ShowIUPCombination
	 */
	public final java.lang.Boolean getShowIUPCombination()
	{
		return getShowIUPCombination(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowIUPCombination
	 */
	public final java.lang.Boolean getShowIUPCombination(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowIUPCombination.toString());
	}

	/**
	 * Set value of ShowIUPCombination
	 * @param showiupcombination
	 */
	public final void setShowIUPCombination(java.lang.Boolean showiupcombination)
	{
		setShowIUPCombination(getContext(), showiupcombination);
	}

	/**
	 * Set value of ShowIUPCombination
	 * @param context
	 * @param showiupcombination
	 */
	public final void setShowIUPCombination(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showiupcombination)
	{
		getMendixObject().setValue(context, MemberNames.ShowIUPCombination.toString(), showiupcombination);
	}

	/**
	 * @return value of Valid
	 */
	public final java.lang.Boolean getValid()
	{
		return getValid(getContext());
	}

	/**
	 * @param context
	 * @return value of Valid
	 */
	public final java.lang.Boolean getValid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Valid.toString());
	}

	/**
	 * Set value of Valid
	 * @param valid
	 */
	public final void setValid(java.lang.Boolean valid)
	{
		setValid(getContext(), valid);
	}

	/**
	 * Set value of Valid
	 * @param context
	 * @param valid
	 */
	public final void setValid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean valid)
	{
		getMendixObject().setValue(context, MemberNames.Valid.toString(), valid);
	}

	/**
	 * @return value of DeeplinkCode
	 */
	public final java.lang.String getDeeplinkCode()
	{
		return getDeeplinkCode(getContext());
	}

	/**
	 * @param context
	 * @return value of DeeplinkCode
	 */
	public final java.lang.String getDeeplinkCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DeeplinkCode.toString());
	}

	/**
	 * Set value of DeeplinkCode
	 * @param deeplinkcode
	 */
	public final void setDeeplinkCode(java.lang.String deeplinkcode)
	{
		setDeeplinkCode(getContext(), deeplinkcode);
	}

	/**
	 * Set value of DeeplinkCode
	 * @param context
	 * @param deeplinkcode
	 */
	public final void setDeeplinkCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String deeplinkcode)
	{
		getMendixObject().setValue(context, MemberNames.DeeplinkCode.toString(), deeplinkcode);
	}

	/**
	 * @return value of SLMPortalQuickCall_Contract
	 */
	public final slm.proxies.Contract getSLMPortalQuickCall_Contract() throws com.mendix.core.CoreException
	{
		return getSLMPortalQuickCall_Contract(getContext());
	}

	/**
	 * @param context
	 * @return value of SLMPortalQuickCall_Contract
	 */
	public final slm.proxies.Contract getSLMPortalQuickCall_Contract(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slm.proxies.Contract result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SLMPortalQuickCall_Contract.toString());
		if (identifier != null)
			result = slm.proxies.Contract.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SLMPortalQuickCall_Contract
	 * @param slmportalquickcall_contract
	 */
	public final void setSLMPortalQuickCall_Contract(slm.proxies.Contract slmportalquickcall_contract)
	{
		setSLMPortalQuickCall_Contract(getContext(), slmportalquickcall_contract);
	}

	/**
	 * Set value of SLMPortalQuickCall_Contract
	 * @param context
	 * @param slmportalquickcall_contract
	 */
	public final void setSLMPortalQuickCall_Contract(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.Contract slmportalquickcall_contract)
	{
		if (slmportalquickcall_contract == null)
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_Contract.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_Contract.toString(), slmportalquickcall_contract.getMendixObject().getId());
	}

	/**
	 * @return value of SLMPortalQuickCall_IUP_Combination
	 */
	public final slm.proxies.IUP_Combination getSLMPortalQuickCall_IUP_Combination() throws com.mendix.core.CoreException
	{
		return getSLMPortalQuickCall_IUP_Combination(getContext());
	}

	/**
	 * @param context
	 * @return value of SLMPortalQuickCall_IUP_Combination
	 */
	public final slm.proxies.IUP_Combination getSLMPortalQuickCall_IUP_Combination(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slm.proxies.IUP_Combination result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SLMPortalQuickCall_IUP_Combination.toString());
		if (identifier != null)
			result = slm.proxies.IUP_Combination.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SLMPortalQuickCall_IUP_Combination
	 * @param slmportalquickcall_iup_combination
	 */
	public final void setSLMPortalQuickCall_IUP_Combination(slm.proxies.IUP_Combination slmportalquickcall_iup_combination)
	{
		setSLMPortalQuickCall_IUP_Combination(getContext(), slmportalquickcall_iup_combination);
	}

	/**
	 * Set value of SLMPortalQuickCall_IUP_Combination
	 * @param context
	 * @param slmportalquickcall_iup_combination
	 */
	public final void setSLMPortalQuickCall_IUP_Combination(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.IUP_Combination slmportalquickcall_iup_combination)
	{
		if (slmportalquickcall_iup_combination == null)
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_IUP_Combination.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_IUP_Combination.toString(), slmportalquickcall_iup_combination.getMendixObject().getId());
	}

	/**
	 * @return value of SLMPortalQuickCall_Service
	 */
	public final slm.proxies.Service getSLMPortalQuickCall_Service() throws com.mendix.core.CoreException
	{
		return getSLMPortalQuickCall_Service(getContext());
	}

	/**
	 * @param context
	 * @return value of SLMPortalQuickCall_Service
	 */
	public final slm.proxies.Service getSLMPortalQuickCall_Service(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slm.proxies.Service result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SLMPortalQuickCall_Service.toString());
		if (identifier != null)
			result = slm.proxies.Service.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SLMPortalQuickCall_Service
	 * @param slmportalquickcall_service
	 */
	public final void setSLMPortalQuickCall_Service(slm.proxies.Service slmportalquickcall_service)
	{
		setSLMPortalQuickCall_Service(getContext(), slmportalquickcall_service);
	}

	/**
	 * Set value of SLMPortalQuickCall_Service
	 * @param context
	 * @param slmportalquickcall_service
	 */
	public final void setSLMPortalQuickCall_Service(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.Service slmportalquickcall_service)
	{
		if (slmportalquickcall_service == null)
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_Service.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_Service.toString(), slmportalquickcall_service.getMendixObject().getId());
	}

	/**
	 * @return value of SLMPortalQuickCall_Service_Process
	 */
	public final slm.proxies.Service_Process getSLMPortalQuickCall_Service_Process() throws com.mendix.core.CoreException
	{
		return getSLMPortalQuickCall_Service_Process(getContext());
	}

	/**
	 * @param context
	 * @return value of SLMPortalQuickCall_Service_Process
	 */
	public final slm.proxies.Service_Process getSLMPortalQuickCall_Service_Process(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slm.proxies.Service_Process result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SLMPortalQuickCall_Service_Process.toString());
		if (identifier != null)
			result = slm.proxies.Service_Process.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SLMPortalQuickCall_Service_Process
	 * @param slmportalquickcall_service_process
	 */
	public final void setSLMPortalQuickCall_Service_Process(slm.proxies.Service_Process slmportalquickcall_service_process)
	{
		setSLMPortalQuickCall_Service_Process(getContext(), slmportalquickcall_service_process);
	}

	/**
	 * Set value of SLMPortalQuickCall_Service_Process
	 * @param context
	 * @param slmportalquickcall_service_process
	 */
	public final void setSLMPortalQuickCall_Service_Process(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.Service_Process slmportalquickcall_service_process)
	{
		if (slmportalquickcall_service_process == null)
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_Service_Process.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_Service_Process.toString(), slmportalquickcall_service_process.getMendixObject().getId());
	}

	/**
	 * @return value of SLMPortalQuickCall_Organisation
	 */
	public final nap.proxies.Organisation getSLMPortalQuickCall_Organisation() throws com.mendix.core.CoreException
	{
		return getSLMPortalQuickCall_Organisation(getContext());
	}

	/**
	 * @param context
	 * @return value of SLMPortalQuickCall_Organisation
	 */
	public final nap.proxies.Organisation getSLMPortalQuickCall_Organisation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Organisation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SLMPortalQuickCall_Organisation.toString());
		if (identifier != null)
			result = nap.proxies.Organisation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SLMPortalQuickCall_Organisation
	 * @param slmportalquickcall_organisation
	 */
	public final void setSLMPortalQuickCall_Organisation(nap.proxies.Organisation slmportalquickcall_organisation)
	{
		setSLMPortalQuickCall_Organisation(getContext(), slmportalquickcall_organisation);
	}

	/**
	 * Set value of SLMPortalQuickCall_Organisation
	 * @param context
	 * @param slmportalquickcall_organisation
	 */
	public final void setSLMPortalQuickCall_Organisation(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Organisation slmportalquickcall_organisation)
	{
		if (slmportalquickcall_organisation == null)
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_Organisation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SLMPortalQuickCall_Organisation.toString(), slmportalquickcall_organisation.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final portal.proxies.SLMPortalQuickCall that = (portal.proxies.SLMPortalQuickCall) obj;
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
		return "Portal.SLMPortalQuickCall";
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
