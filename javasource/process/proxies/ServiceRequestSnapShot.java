// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class ServiceRequestSnapShot extends process.proxies.RequestSnapShot
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.ServiceRequestSnapShot";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CustomerWishdate("CustomerWishdate"),
		CustomerWishDateChanged("CustomerWishDateChanged"),
		CustomerWishDateReason("CustomerWishDateReason"),
		CustomerWishDateReasonChanged("CustomerWishDateReasonChanged"),
		ShortDescription("ShortDescription"),
		ShortDescriptionChanged("ShortDescriptionChanged"),
		DetailDescription("DetailDescription"),
		DetailDescriptionChanged("DetailDescriptionChanged"),
		DetailDescriptionNoHTML("DetailDescriptionNoHTML"),
		DetailDescriptionNoHTMLChanged("DetailDescriptionNoHTMLChanged"),
		SolutionDescription("SolutionDescription"),
		SolutionDescriptionChanged("SolutionDescriptionChanged"),
		ActualEndTime("ActualEndTime"),
		ActualEndTimeChanged("ActualEndTimeChanged"),
		CustomerSatisfaction("CustomerSatisfaction"),
		CustomerSatisfactionChanged("CustomerSatisfactionChanged"),
		ScheduledStart("ScheduledStart"),
		ScheduledStartChanged("ScheduledStartChanged"),
		ScheduledEnd("ScheduledEnd"),
		ScheduledEndChanged("ScheduledEndChanged"),
		WishDateStart("WishDateStart"),
		WishDateStartChanged("WishDateStartChanged"),
		WishDateEnd("WishDateEnd"),
		WishDateEndChanged("WishDateEndChanged"),
		OpeningCategoryChanged("OpeningCategoryChanged"),
		ClosureCategoryChanged("ClosureCategoryChanged"),
		RequestEvent_RequestSnapShot("Process.RequestEvent_RequestSnapShot"),
		RequestSnapShot_OpeningCategory("Process.RequestSnapShot_OpeningCategory"),
		RequestSnapShot_ClosureCategory("Process.RequestSnapShot_ClosureCategory");

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

	public ServiceRequestSnapShot(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.ServiceRequestSnapShot"));
	}

	protected ServiceRequestSnapShot(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject serviceRequestSnapShotMendixObject)
	{
		super(context, serviceRequestSnapShotMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Process.ServiceRequestSnapShot", serviceRequestSnapShotMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.ServiceRequestSnapShot");
	}

	/**
	 * @deprecated Use 'ServiceRequestSnapShot.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.ServiceRequestSnapShot initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.ServiceRequestSnapShot.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.ServiceRequestSnapShot initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("Process.OperationSnapShot", mendixObject.getType()))
			return process.proxies.OperationSnapShot.initialize(context, mendixObject);

		return new process.proxies.ServiceRequestSnapShot(context, mendixObject);
	}

	public static process.proxies.ServiceRequestSnapShot load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.ServiceRequestSnapShot.initialize(context, mendixObject);
	}

	public static java.util.List<? extends process.proxies.ServiceRequestSnapShot> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.ServiceRequestSnapShot> result = new java.util.ArrayList<process.proxies.ServiceRequestSnapShot>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.ServiceRequestSnapShot" + xpathConstraint))
			result.add(process.proxies.ServiceRequestSnapShot.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of CustomerWishdate
	 */
	public final java.util.Date getCustomerWishdate()
	{
		return getCustomerWishdate(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerWishdate
	 */
	public final java.util.Date getCustomerWishdate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CustomerWishdate.toString());
	}

	/**
	 * Set value of CustomerWishdate
	 * @param customerwishdate
	 */
	public final void setCustomerWishdate(java.util.Date customerwishdate)
	{
		setCustomerWishdate(getContext(), customerwishdate);
	}

	/**
	 * Set value of CustomerWishdate
	 * @param context
	 * @param customerwishdate
	 */
	public final void setCustomerWishdate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date customerwishdate)
	{
		getMendixObject().setValue(context, MemberNames.CustomerWishdate.toString(), customerwishdate);
	}

	/**
	 * @return value of CustomerWishDateChanged
	 */
	public final java.lang.Boolean getCustomerWishDateChanged()
	{
		return getCustomerWishDateChanged(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerWishDateChanged
	 */
	public final java.lang.Boolean getCustomerWishDateChanged(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CustomerWishDateChanged.toString());
	}

	/**
	 * Set value of CustomerWishDateChanged
	 * @param customerwishdatechanged
	 */
	public final void setCustomerWishDateChanged(java.lang.Boolean customerwishdatechanged)
	{
		setCustomerWishDateChanged(getContext(), customerwishdatechanged);
	}

	/**
	 * Set value of CustomerWishDateChanged
	 * @param context
	 * @param customerwishdatechanged
	 */
	public final void setCustomerWishDateChanged(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean customerwishdatechanged)
	{
		getMendixObject().setValue(context, MemberNames.CustomerWishDateChanged.toString(), customerwishdatechanged);
	}

	/**
	 * @return value of CustomerWishDateReason
	 */
	public final java.lang.String getCustomerWishDateReason()
	{
		return getCustomerWishDateReason(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerWishDateReason
	 */
	public final java.lang.String getCustomerWishDateReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomerWishDateReason.toString());
	}

	/**
	 * Set value of CustomerWishDateReason
	 * @param customerwishdatereason
	 */
	public final void setCustomerWishDateReason(java.lang.String customerwishdatereason)
	{
		setCustomerWishDateReason(getContext(), customerwishdatereason);
	}

	/**
	 * Set value of CustomerWishDateReason
	 * @param context
	 * @param customerwishdatereason
	 */
	public final void setCustomerWishDateReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customerwishdatereason)
	{
		getMendixObject().setValue(context, MemberNames.CustomerWishDateReason.toString(), customerwishdatereason);
	}

	/**
	 * @return value of CustomerWishDateReasonChanged
	 */
	public final java.lang.Boolean getCustomerWishDateReasonChanged()
	{
		return getCustomerWishDateReasonChanged(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerWishDateReasonChanged
	 */
	public final java.lang.Boolean getCustomerWishDateReasonChanged(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CustomerWishDateReasonChanged.toString());
	}

	/**
	 * Set value of CustomerWishDateReasonChanged
	 * @param customerwishdatereasonchanged
	 */
	public final void setCustomerWishDateReasonChanged(java.lang.Boolean customerwishdatereasonchanged)
	{
		setCustomerWishDateReasonChanged(getContext(), customerwishdatereasonchanged);
	}

	/**
	 * Set value of CustomerWishDateReasonChanged
	 * @param context
	 * @param customerwishdatereasonchanged
	 */
	public final void setCustomerWishDateReasonChanged(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean customerwishdatereasonchanged)
	{
		getMendixObject().setValue(context, MemberNames.CustomerWishDateReasonChanged.toString(), customerwishdatereasonchanged);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final process.proxies.ServiceRequestSnapShot that = (process.proxies.ServiceRequestSnapShot) obj;
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
		return "Process.ServiceRequestSnapShot";
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