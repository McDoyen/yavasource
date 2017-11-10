// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class KPIConfiguration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject kPIConfigurationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.KPIConfiguration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		EmailThreshold("EmailThreshold"),
		OpenRequestWarningThreshold("OpenRequestWarningThreshold"),
		OpenRequestMaximumThreshold("OpenRequestMaximumThreshold"),
		OpenRequestInsideSLAWarningThreshold("OpenRequestInsideSLAWarningThreshold"),
		OpenRequestInsideSLAMaximumThreshold("OpenRequestInsideSLAMaximumThreshold"),
		OpenRequestFirstLineWarningThreshold("OpenRequestFirstLineWarningThreshold"),
		OpenRequestFirstLineMaximumThreshold("OpenRequestFirstLineMaximumThreshold"),
		OpenRequestInsideResponseWarningThreshold("OpenRequestInsideResponseWarningThreshold"),
		OpenRequestInsideResponseMaximumThreshold("OpenRequestInsideResponseMaximumThreshold"),
		RequestInsideSLAWarningThreshold("RequestInsideSLAWarningThreshold"),
		RequestInsideSLAMaximumThreshold("RequestInsideSLAMaximumThreshold"),
		RequestFTRWarningThreshold("RequestFTRWarningThreshold"),
		RequestFTRMaximumThreshold("RequestFTRMaximumThreshold"),
		CustomerSatisfactionWarningThreshold("CustomerSatisfactionWarningThreshold"),
		CustomerSatisfactionMaximumThreshold("CustomerSatisfactionMaximumThreshold");

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

	public KPIConfiguration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.KPIConfiguration"));
	}

	protected KPIConfiguration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject kPIConfigurationMendixObject)
	{
		if (kPIConfigurationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Process.KPIConfiguration", kPIConfigurationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.KPIConfiguration");

		this.kPIConfigurationMendixObject = kPIConfigurationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'KPIConfiguration.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.KPIConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.KPIConfiguration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.KPIConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.KPIConfiguration(context, mendixObject);
	}

	public static process.proxies.KPIConfiguration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.KPIConfiguration.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.KPIConfiguration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.KPIConfiguration> result = new java.util.ArrayList<process.proxies.KPIConfiguration>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.KPIConfiguration" + xpathConstraint))
			result.add(process.proxies.KPIConfiguration.initialize(context, obj));
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
	 * @return value of EmailThreshold
	 */
	public final java.lang.Integer getEmailThreshold()
	{
		return getEmailThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of EmailThreshold
	 */
	public final java.lang.Integer getEmailThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.EmailThreshold.toString());
	}

	/**
	 * Set value of EmailThreshold
	 * @param emailthreshold
	 */
	public final void setEmailThreshold(java.lang.Integer emailthreshold)
	{
		setEmailThreshold(getContext(), emailthreshold);
	}

	/**
	 * Set value of EmailThreshold
	 * @param context
	 * @param emailthreshold
	 */
	public final void setEmailThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer emailthreshold)
	{
		getMendixObject().setValue(context, MemberNames.EmailThreshold.toString(), emailthreshold);
	}

	/**
	 * @return value of OpenRequestWarningThreshold
	 */
	public final java.lang.Integer getOpenRequestWarningThreshold()
	{
		return getOpenRequestWarningThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenRequestWarningThreshold
	 */
	public final java.lang.Integer getOpenRequestWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OpenRequestWarningThreshold.toString());
	}

	/**
	 * Set value of OpenRequestWarningThreshold
	 * @param openrequestwarningthreshold
	 */
	public final void setOpenRequestWarningThreshold(java.lang.Integer openrequestwarningthreshold)
	{
		setOpenRequestWarningThreshold(getContext(), openrequestwarningthreshold);
	}

	/**
	 * Set value of OpenRequestWarningThreshold
	 * @param context
	 * @param openrequestwarningthreshold
	 */
	public final void setOpenRequestWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer openrequestwarningthreshold)
	{
		getMendixObject().setValue(context, MemberNames.OpenRequestWarningThreshold.toString(), openrequestwarningthreshold);
	}

	/**
	 * @return value of OpenRequestMaximumThreshold
	 */
	public final java.lang.Integer getOpenRequestMaximumThreshold()
	{
		return getOpenRequestMaximumThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenRequestMaximumThreshold
	 */
	public final java.lang.Integer getOpenRequestMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OpenRequestMaximumThreshold.toString());
	}

	/**
	 * Set value of OpenRequestMaximumThreshold
	 * @param openrequestmaximumthreshold
	 */
	public final void setOpenRequestMaximumThreshold(java.lang.Integer openrequestmaximumthreshold)
	{
		setOpenRequestMaximumThreshold(getContext(), openrequestmaximumthreshold);
	}

	/**
	 * Set value of OpenRequestMaximumThreshold
	 * @param context
	 * @param openrequestmaximumthreshold
	 */
	public final void setOpenRequestMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer openrequestmaximumthreshold)
	{
		getMendixObject().setValue(context, MemberNames.OpenRequestMaximumThreshold.toString(), openrequestmaximumthreshold);
	}

	/**
	 * @return value of OpenRequestInsideSLAWarningThreshold
	 */
	public final java.lang.Integer getOpenRequestInsideSLAWarningThreshold()
	{
		return getOpenRequestInsideSLAWarningThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenRequestInsideSLAWarningThreshold
	 */
	public final java.lang.Integer getOpenRequestInsideSLAWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OpenRequestInsideSLAWarningThreshold.toString());
	}

	/**
	 * Set value of OpenRequestInsideSLAWarningThreshold
	 * @param openrequestinsideslawarningthreshold
	 */
	public final void setOpenRequestInsideSLAWarningThreshold(java.lang.Integer openrequestinsideslawarningthreshold)
	{
		setOpenRequestInsideSLAWarningThreshold(getContext(), openrequestinsideslawarningthreshold);
	}

	/**
	 * Set value of OpenRequestInsideSLAWarningThreshold
	 * @param context
	 * @param openrequestinsideslawarningthreshold
	 */
	public final void setOpenRequestInsideSLAWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer openrequestinsideslawarningthreshold)
	{
		getMendixObject().setValue(context, MemberNames.OpenRequestInsideSLAWarningThreshold.toString(), openrequestinsideslawarningthreshold);
	}

	/**
	 * @return value of OpenRequestInsideSLAMaximumThreshold
	 */
	public final java.lang.Integer getOpenRequestInsideSLAMaximumThreshold()
	{
		return getOpenRequestInsideSLAMaximumThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenRequestInsideSLAMaximumThreshold
	 */
	public final java.lang.Integer getOpenRequestInsideSLAMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OpenRequestInsideSLAMaximumThreshold.toString());
	}

	/**
	 * Set value of OpenRequestInsideSLAMaximumThreshold
	 * @param openrequestinsideslamaximumthreshold
	 */
	public final void setOpenRequestInsideSLAMaximumThreshold(java.lang.Integer openrequestinsideslamaximumthreshold)
	{
		setOpenRequestInsideSLAMaximumThreshold(getContext(), openrequestinsideslamaximumthreshold);
	}

	/**
	 * Set value of OpenRequestInsideSLAMaximumThreshold
	 * @param context
	 * @param openrequestinsideslamaximumthreshold
	 */
	public final void setOpenRequestInsideSLAMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer openrequestinsideslamaximumthreshold)
	{
		getMendixObject().setValue(context, MemberNames.OpenRequestInsideSLAMaximumThreshold.toString(), openrequestinsideslamaximumthreshold);
	}

	/**
	 * @return value of OpenRequestFirstLineWarningThreshold
	 */
	public final java.lang.Integer getOpenRequestFirstLineWarningThreshold()
	{
		return getOpenRequestFirstLineWarningThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenRequestFirstLineWarningThreshold
	 */
	public final java.lang.Integer getOpenRequestFirstLineWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OpenRequestFirstLineWarningThreshold.toString());
	}

	/**
	 * Set value of OpenRequestFirstLineWarningThreshold
	 * @param openrequestfirstlinewarningthreshold
	 */
	public final void setOpenRequestFirstLineWarningThreshold(java.lang.Integer openrequestfirstlinewarningthreshold)
	{
		setOpenRequestFirstLineWarningThreshold(getContext(), openrequestfirstlinewarningthreshold);
	}

	/**
	 * Set value of OpenRequestFirstLineWarningThreshold
	 * @param context
	 * @param openrequestfirstlinewarningthreshold
	 */
	public final void setOpenRequestFirstLineWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer openrequestfirstlinewarningthreshold)
	{
		getMendixObject().setValue(context, MemberNames.OpenRequestFirstLineWarningThreshold.toString(), openrequestfirstlinewarningthreshold);
	}

	/**
	 * @return value of OpenRequestFirstLineMaximumThreshold
	 */
	public final java.lang.Integer getOpenRequestFirstLineMaximumThreshold()
	{
		return getOpenRequestFirstLineMaximumThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenRequestFirstLineMaximumThreshold
	 */
	public final java.lang.Integer getOpenRequestFirstLineMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OpenRequestFirstLineMaximumThreshold.toString());
	}

	/**
	 * Set value of OpenRequestFirstLineMaximumThreshold
	 * @param openrequestfirstlinemaximumthreshold
	 */
	public final void setOpenRequestFirstLineMaximumThreshold(java.lang.Integer openrequestfirstlinemaximumthreshold)
	{
		setOpenRequestFirstLineMaximumThreshold(getContext(), openrequestfirstlinemaximumthreshold);
	}

	/**
	 * Set value of OpenRequestFirstLineMaximumThreshold
	 * @param context
	 * @param openrequestfirstlinemaximumthreshold
	 */
	public final void setOpenRequestFirstLineMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer openrequestfirstlinemaximumthreshold)
	{
		getMendixObject().setValue(context, MemberNames.OpenRequestFirstLineMaximumThreshold.toString(), openrequestfirstlinemaximumthreshold);
	}

	/**
	 * @return value of OpenRequestInsideResponseWarningThreshold
	 */
	public final java.lang.Integer getOpenRequestInsideResponseWarningThreshold()
	{
		return getOpenRequestInsideResponseWarningThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenRequestInsideResponseWarningThreshold
	 */
	public final java.lang.Integer getOpenRequestInsideResponseWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OpenRequestInsideResponseWarningThreshold.toString());
	}

	/**
	 * Set value of OpenRequestInsideResponseWarningThreshold
	 * @param openrequestinsideresponsewarningthreshold
	 */
	public final void setOpenRequestInsideResponseWarningThreshold(java.lang.Integer openrequestinsideresponsewarningthreshold)
	{
		setOpenRequestInsideResponseWarningThreshold(getContext(), openrequestinsideresponsewarningthreshold);
	}

	/**
	 * Set value of OpenRequestInsideResponseWarningThreshold
	 * @param context
	 * @param openrequestinsideresponsewarningthreshold
	 */
	public final void setOpenRequestInsideResponseWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer openrequestinsideresponsewarningthreshold)
	{
		getMendixObject().setValue(context, MemberNames.OpenRequestInsideResponseWarningThreshold.toString(), openrequestinsideresponsewarningthreshold);
	}

	/**
	 * @return value of OpenRequestInsideResponseMaximumThreshold
	 */
	public final java.lang.Integer getOpenRequestInsideResponseMaximumThreshold()
	{
		return getOpenRequestInsideResponseMaximumThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenRequestInsideResponseMaximumThreshold
	 */
	public final java.lang.Integer getOpenRequestInsideResponseMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.OpenRequestInsideResponseMaximumThreshold.toString());
	}

	/**
	 * Set value of OpenRequestInsideResponseMaximumThreshold
	 * @param openrequestinsideresponsemaximumthreshold
	 */
	public final void setOpenRequestInsideResponseMaximumThreshold(java.lang.Integer openrequestinsideresponsemaximumthreshold)
	{
		setOpenRequestInsideResponseMaximumThreshold(getContext(), openrequestinsideresponsemaximumthreshold);
	}

	/**
	 * Set value of OpenRequestInsideResponseMaximumThreshold
	 * @param context
	 * @param openrequestinsideresponsemaximumthreshold
	 */
	public final void setOpenRequestInsideResponseMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer openrequestinsideresponsemaximumthreshold)
	{
		getMendixObject().setValue(context, MemberNames.OpenRequestInsideResponseMaximumThreshold.toString(), openrequestinsideresponsemaximumthreshold);
	}

	/**
	 * @return value of RequestInsideSLAWarningThreshold
	 */
	public final java.lang.Integer getRequestInsideSLAWarningThreshold()
	{
		return getRequestInsideSLAWarningThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestInsideSLAWarningThreshold
	 */
	public final java.lang.Integer getRequestInsideSLAWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RequestInsideSLAWarningThreshold.toString());
	}

	/**
	 * Set value of RequestInsideSLAWarningThreshold
	 * @param requestinsideslawarningthreshold
	 */
	public final void setRequestInsideSLAWarningThreshold(java.lang.Integer requestinsideslawarningthreshold)
	{
		setRequestInsideSLAWarningThreshold(getContext(), requestinsideslawarningthreshold);
	}

	/**
	 * Set value of RequestInsideSLAWarningThreshold
	 * @param context
	 * @param requestinsideslawarningthreshold
	 */
	public final void setRequestInsideSLAWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer requestinsideslawarningthreshold)
	{
		getMendixObject().setValue(context, MemberNames.RequestInsideSLAWarningThreshold.toString(), requestinsideslawarningthreshold);
	}

	/**
	 * @return value of RequestInsideSLAMaximumThreshold
	 */
	public final java.lang.Integer getRequestInsideSLAMaximumThreshold()
	{
		return getRequestInsideSLAMaximumThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestInsideSLAMaximumThreshold
	 */
	public final java.lang.Integer getRequestInsideSLAMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RequestInsideSLAMaximumThreshold.toString());
	}

	/**
	 * Set value of RequestInsideSLAMaximumThreshold
	 * @param requestinsideslamaximumthreshold
	 */
	public final void setRequestInsideSLAMaximumThreshold(java.lang.Integer requestinsideslamaximumthreshold)
	{
		setRequestInsideSLAMaximumThreshold(getContext(), requestinsideslamaximumthreshold);
	}

	/**
	 * Set value of RequestInsideSLAMaximumThreshold
	 * @param context
	 * @param requestinsideslamaximumthreshold
	 */
	public final void setRequestInsideSLAMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer requestinsideslamaximumthreshold)
	{
		getMendixObject().setValue(context, MemberNames.RequestInsideSLAMaximumThreshold.toString(), requestinsideslamaximumthreshold);
	}

	/**
	 * @return value of RequestFTRWarningThreshold
	 */
	public final java.lang.Integer getRequestFTRWarningThreshold()
	{
		return getRequestFTRWarningThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestFTRWarningThreshold
	 */
	public final java.lang.Integer getRequestFTRWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RequestFTRWarningThreshold.toString());
	}

	/**
	 * Set value of RequestFTRWarningThreshold
	 * @param requestftrwarningthreshold
	 */
	public final void setRequestFTRWarningThreshold(java.lang.Integer requestftrwarningthreshold)
	{
		setRequestFTRWarningThreshold(getContext(), requestftrwarningthreshold);
	}

	/**
	 * Set value of RequestFTRWarningThreshold
	 * @param context
	 * @param requestftrwarningthreshold
	 */
	public final void setRequestFTRWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer requestftrwarningthreshold)
	{
		getMendixObject().setValue(context, MemberNames.RequestFTRWarningThreshold.toString(), requestftrwarningthreshold);
	}

	/**
	 * @return value of RequestFTRMaximumThreshold
	 */
	public final java.lang.Integer getRequestFTRMaximumThreshold()
	{
		return getRequestFTRMaximumThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestFTRMaximumThreshold
	 */
	public final java.lang.Integer getRequestFTRMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RequestFTRMaximumThreshold.toString());
	}

	/**
	 * Set value of RequestFTRMaximumThreshold
	 * @param requestftrmaximumthreshold
	 */
	public final void setRequestFTRMaximumThreshold(java.lang.Integer requestftrmaximumthreshold)
	{
		setRequestFTRMaximumThreshold(getContext(), requestftrmaximumthreshold);
	}

	/**
	 * Set value of RequestFTRMaximumThreshold
	 * @param context
	 * @param requestftrmaximumthreshold
	 */
	public final void setRequestFTRMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer requestftrmaximumthreshold)
	{
		getMendixObject().setValue(context, MemberNames.RequestFTRMaximumThreshold.toString(), requestftrmaximumthreshold);
	}

	/**
	 * @return value of CustomerSatisfactionWarningThreshold
	 */
	public final java.lang.Integer getCustomerSatisfactionWarningThreshold()
	{
		return getCustomerSatisfactionWarningThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerSatisfactionWarningThreshold
	 */
	public final java.lang.Integer getCustomerSatisfactionWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.CustomerSatisfactionWarningThreshold.toString());
	}

	/**
	 * Set value of CustomerSatisfactionWarningThreshold
	 * @param customersatisfactionwarningthreshold
	 */
	public final void setCustomerSatisfactionWarningThreshold(java.lang.Integer customersatisfactionwarningthreshold)
	{
		setCustomerSatisfactionWarningThreshold(getContext(), customersatisfactionwarningthreshold);
	}

	/**
	 * Set value of CustomerSatisfactionWarningThreshold
	 * @param context
	 * @param customersatisfactionwarningthreshold
	 */
	public final void setCustomerSatisfactionWarningThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer customersatisfactionwarningthreshold)
	{
		getMendixObject().setValue(context, MemberNames.CustomerSatisfactionWarningThreshold.toString(), customersatisfactionwarningthreshold);
	}

	/**
	 * @return value of CustomerSatisfactionMaximumThreshold
	 */
	public final java.lang.Integer getCustomerSatisfactionMaximumThreshold()
	{
		return getCustomerSatisfactionMaximumThreshold(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerSatisfactionMaximumThreshold
	 */
	public final java.lang.Integer getCustomerSatisfactionMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.CustomerSatisfactionMaximumThreshold.toString());
	}

	/**
	 * Set value of CustomerSatisfactionMaximumThreshold
	 * @param customersatisfactionmaximumthreshold
	 */
	public final void setCustomerSatisfactionMaximumThreshold(java.lang.Integer customersatisfactionmaximumthreshold)
	{
		setCustomerSatisfactionMaximumThreshold(getContext(), customersatisfactionmaximumthreshold);
	}

	/**
	 * Set value of CustomerSatisfactionMaximumThreshold
	 * @param context
	 * @param customersatisfactionmaximumthreshold
	 */
	public final void setCustomerSatisfactionMaximumThreshold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer customersatisfactionmaximumthreshold)
	{
		getMendixObject().setValue(context, MemberNames.CustomerSatisfactionMaximumThreshold.toString(), customersatisfactionmaximumthreshold);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return kPIConfigurationMendixObject;
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
			final process.proxies.KPIConfiguration that = (process.proxies.KPIConfiguration) obj;
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
		return "Process.KPIConfiguration";
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