// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slm_notifications.proxies;

public class Commitment
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject commitmentMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SLM_Notifications.Commitment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CommitmentName("CommitmentName"),
		ResolveTime("ResolveTime"),
		ResponseTime("ResponseTime"),
		ResolveTimeStr("ResolveTimeStr"),
		ResponseTimeStr("ResponseTimeStr"),
		ResolveTimeBy("ResolveTimeBy"),
		NumberOfBusinessDays("NumberOfBusinessDays"),
		Commitment_Resolve_Escalations("SLM_Notifications.Commitment_Resolve_Escalations"),
		Commitment_Response_Escalations("SLM_Notifications.Commitment_Response_Escalations"),
		Commitment_Holidays_Group("SLM_Notifications.Commitment_Holidays_Group"),
		Commitment_Business_Time_Group("SLM_Notifications.Commitment_Business_Time_Group"),
		Commitment_DataAccess("SLM_Notifications.Commitment_DataAccess");

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

	public Commitment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SLM_Notifications.Commitment"));
	}

	protected Commitment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject commitmentMendixObject)
	{
		if (commitmentMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SLM_Notifications.Commitment", commitmentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SLM_Notifications.Commitment");

		this.commitmentMendixObject = commitmentMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Commitment.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static slm_notifications.proxies.Commitment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return slm_notifications.proxies.Commitment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static slm_notifications.proxies.Commitment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new slm_notifications.proxies.Commitment(context, mendixObject);
	}

	public static slm_notifications.proxies.Commitment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return slm_notifications.proxies.Commitment.initialize(context, mendixObject);
	}

	public static java.util.List<slm_notifications.proxies.Commitment> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<slm_notifications.proxies.Commitment> result = new java.util.ArrayList<slm_notifications.proxies.Commitment>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SLM_Notifications.Commitment" + xpathConstraint))
			result.add(slm_notifications.proxies.Commitment.initialize(context, obj));
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
	 * @return value of CommitmentName
	 */
	public final java.lang.String getCommitmentName()
	{
		return getCommitmentName(getContext());
	}

	/**
	 * @param context
	 * @return value of CommitmentName
	 */
	public final java.lang.String getCommitmentName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CommitmentName.toString());
	}

	/**
	 * Set value of CommitmentName
	 * @param commitmentname
	 */
	public final void setCommitmentName(java.lang.String commitmentname)
	{
		setCommitmentName(getContext(), commitmentname);
	}

	/**
	 * Set value of CommitmentName
	 * @param context
	 * @param commitmentname
	 */
	public final void setCommitmentName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String commitmentname)
	{
		getMendixObject().setValue(context, MemberNames.CommitmentName.toString(), commitmentname);
	}

	/**
	 * @return value of ResolveTime
	 */
	public final java.lang.Integer getResolveTime()
	{
		return getResolveTime(getContext());
	}

	/**
	 * @param context
	 * @return value of ResolveTime
	 */
	public final java.lang.Integer getResolveTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ResolveTime.toString());
	}

	/**
	 * Set value of ResolveTime
	 * @param resolvetime
	 */
	public final void setResolveTime(java.lang.Integer resolvetime)
	{
		setResolveTime(getContext(), resolvetime);
	}

	/**
	 * Set value of ResolveTime
	 * @param context
	 * @param resolvetime
	 */
	public final void setResolveTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer resolvetime)
	{
		getMendixObject().setValue(context, MemberNames.ResolveTime.toString(), resolvetime);
	}

	/**
	 * @return value of ResponseTime
	 */
	public final java.lang.Integer getResponseTime()
	{
		return getResponseTime(getContext());
	}

	/**
	 * @param context
	 * @return value of ResponseTime
	 */
	public final java.lang.Integer getResponseTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ResponseTime.toString());
	}

	/**
	 * Set value of ResponseTime
	 * @param responsetime
	 */
	public final void setResponseTime(java.lang.Integer responsetime)
	{
		setResponseTime(getContext(), responsetime);
	}

	/**
	 * Set value of ResponseTime
	 * @param context
	 * @param responsetime
	 */
	public final void setResponseTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer responsetime)
	{
		getMendixObject().setValue(context, MemberNames.ResponseTime.toString(), responsetime);
	}

	/**
	 * @return value of ResolveTimeStr
	 */
	public final java.lang.String getResolveTimeStr()
	{
		return getResolveTimeStr(getContext());
	}

	/**
	 * @param context
	 * @return value of ResolveTimeStr
	 */
	public final java.lang.String getResolveTimeStr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ResolveTimeStr.toString());
	}

	/**
	 * Set value of ResolveTimeStr
	 * @param resolvetimestr
	 */
	public final void setResolveTimeStr(java.lang.String resolvetimestr)
	{
		setResolveTimeStr(getContext(), resolvetimestr);
	}

	/**
	 * Set value of ResolveTimeStr
	 * @param context
	 * @param resolvetimestr
	 */
	public final void setResolveTimeStr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String resolvetimestr)
	{
		getMendixObject().setValue(context, MemberNames.ResolveTimeStr.toString(), resolvetimestr);
	}

	/**
	 * @return value of ResponseTimeStr
	 */
	public final java.lang.String getResponseTimeStr()
	{
		return getResponseTimeStr(getContext());
	}

	/**
	 * @param context
	 * @return value of ResponseTimeStr
	 */
	public final java.lang.String getResponseTimeStr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ResponseTimeStr.toString());
	}

	/**
	 * Set value of ResponseTimeStr
	 * @param responsetimestr
	 */
	public final void setResponseTimeStr(java.lang.String responsetimestr)
	{
		setResponseTimeStr(getContext(), responsetimestr);
	}

	/**
	 * Set value of ResponseTimeStr
	 * @param context
	 * @param responsetimestr
	 */
	public final void setResponseTimeStr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String responsetimestr)
	{
		getMendixObject().setValue(context, MemberNames.ResponseTimeStr.toString(), responsetimestr);
	}

	/**
	 * Set value of ResolveTimeBy
	 * @param resolvetimeby
	 */
	public final slm_notifications.proxies.ResolveTimeBy getResolveTimeBy()
	{
		return getResolveTimeBy(getContext());
	}

	/**
	 * @param context
	 * @return value of ResolveTimeBy
	 */
	public final slm_notifications.proxies.ResolveTimeBy getResolveTimeBy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ResolveTimeBy.toString());
		if (obj == null)
			return null;

		return slm_notifications.proxies.ResolveTimeBy.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ResolveTimeBy
	 * @param resolvetimeby
	 */
	public final void setResolveTimeBy(slm_notifications.proxies.ResolveTimeBy resolvetimeby)
	{
		setResolveTimeBy(getContext(), resolvetimeby);
	}

	/**
	 * Set value of ResolveTimeBy
	 * @param context
	 * @param resolvetimeby
	 */
	public final void setResolveTimeBy(com.mendix.systemwideinterfaces.core.IContext context, slm_notifications.proxies.ResolveTimeBy resolvetimeby)
	{
		if (resolvetimeby != null)
			getMendixObject().setValue(context, MemberNames.ResolveTimeBy.toString(), resolvetimeby.toString());
		else
			getMendixObject().setValue(context, MemberNames.ResolveTimeBy.toString(), null);
	}

	/**
	 * @return value of NumberOfBusinessDays
	 */
	public final java.lang.Integer getNumberOfBusinessDays()
	{
		return getNumberOfBusinessDays(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfBusinessDays
	 */
	public final java.lang.Integer getNumberOfBusinessDays(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfBusinessDays.toString());
	}

	/**
	 * Set value of NumberOfBusinessDays
	 * @param numberofbusinessdays
	 */
	public final void setNumberOfBusinessDays(java.lang.Integer numberofbusinessdays)
	{
		setNumberOfBusinessDays(getContext(), numberofbusinessdays);
	}

	/**
	 * Set value of NumberOfBusinessDays
	 * @param context
	 * @param numberofbusinessdays
	 */
	public final void setNumberOfBusinessDays(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberofbusinessdays)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfBusinessDays.toString(), numberofbusinessdays);
	}

	/**
	 * @return value of Commitment_Resolve_Escalations
	 */
	public final java.util.List<slm_notifications.proxies.Resolve_Escalation> getCommitment_Resolve_Escalations() throws com.mendix.core.CoreException
	{
		return getCommitment_Resolve_Escalations(getContext());
	}

	/**
	 * @param context
	 * @return value of Commitment_Resolve_Escalations
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<slm_notifications.proxies.Resolve_Escalation> getCommitment_Resolve_Escalations(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<slm_notifications.proxies.Resolve_Escalation> result = new java.util.ArrayList<slm_notifications.proxies.Resolve_Escalation>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Commitment_Resolve_Escalations.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(slm_notifications.proxies.Resolve_Escalation.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Commitment_Resolve_Escalations
	 * @param commitment_resolve_escalations
	 */
	public final void setCommitment_Resolve_Escalations(java.util.List<slm_notifications.proxies.Resolve_Escalation> commitment_resolve_escalations)
	{
		setCommitment_Resolve_Escalations(getContext(), commitment_resolve_escalations);
	}

	/**
	 * Set value of Commitment_Resolve_Escalations
	 * @param context
	 * @param commitment_resolve_escalations
	 */
	public final void setCommitment_Resolve_Escalations(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<slm_notifications.proxies.Resolve_Escalation> commitment_resolve_escalations)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (slm_notifications.proxies.Resolve_Escalation proxyObject : commitment_resolve_escalations)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Commitment_Resolve_Escalations.toString(), identifiers);
	}

	/**
	 * @return value of Commitment_Response_Escalations
	 */
	public final java.util.List<slm_notifications.proxies.Response_Escalation> getCommitment_Response_Escalations() throws com.mendix.core.CoreException
	{
		return getCommitment_Response_Escalations(getContext());
	}

	/**
	 * @param context
	 * @return value of Commitment_Response_Escalations
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<slm_notifications.proxies.Response_Escalation> getCommitment_Response_Escalations(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<slm_notifications.proxies.Response_Escalation> result = new java.util.ArrayList<slm_notifications.proxies.Response_Escalation>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Commitment_Response_Escalations.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(slm_notifications.proxies.Response_Escalation.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Commitment_Response_Escalations
	 * @param commitment_response_escalations
	 */
	public final void setCommitment_Response_Escalations(java.util.List<slm_notifications.proxies.Response_Escalation> commitment_response_escalations)
	{
		setCommitment_Response_Escalations(getContext(), commitment_response_escalations);
	}

	/**
	 * Set value of Commitment_Response_Escalations
	 * @param context
	 * @param commitment_response_escalations
	 */
	public final void setCommitment_Response_Escalations(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<slm_notifications.proxies.Response_Escalation> commitment_response_escalations)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (slm_notifications.proxies.Response_Escalation proxyObject : commitment_response_escalations)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Commitment_Response_Escalations.toString(), identifiers);
	}

	/**
	 * @return value of Commitment_Holidays_Group
	 */
	public final businesshours.proxies.Holidays_Group getCommitment_Holidays_Group() throws com.mendix.core.CoreException
	{
		return getCommitment_Holidays_Group(getContext());
	}

	/**
	 * @param context
	 * @return value of Commitment_Holidays_Group
	 */
	public final businesshours.proxies.Holidays_Group getCommitment_Holidays_Group(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		businesshours.proxies.Holidays_Group result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Commitment_Holidays_Group.toString());
		if (identifier != null)
			result = businesshours.proxies.Holidays_Group.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Commitment_Holidays_Group
	 * @param commitment_holidays_group
	 */
	public final void setCommitment_Holidays_Group(businesshours.proxies.Holidays_Group commitment_holidays_group)
	{
		setCommitment_Holidays_Group(getContext(), commitment_holidays_group);
	}

	/**
	 * Set value of Commitment_Holidays_Group
	 * @param context
	 * @param commitment_holidays_group
	 */
	public final void setCommitment_Holidays_Group(com.mendix.systemwideinterfaces.core.IContext context, businesshours.proxies.Holidays_Group commitment_holidays_group)
	{
		if (commitment_holidays_group == null)
			getMendixObject().setValue(context, MemberNames.Commitment_Holidays_Group.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Commitment_Holidays_Group.toString(), commitment_holidays_group.getMendixObject().getId());
	}

	/**
	 * @return value of Commitment_Business_Time_Group
	 */
	public final businesshours.proxies.Business_Time_Group getCommitment_Business_Time_Group() throws com.mendix.core.CoreException
	{
		return getCommitment_Business_Time_Group(getContext());
	}

	/**
	 * @param context
	 * @return value of Commitment_Business_Time_Group
	 */
	public final businesshours.proxies.Business_Time_Group getCommitment_Business_Time_Group(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		businesshours.proxies.Business_Time_Group result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Commitment_Business_Time_Group.toString());
		if (identifier != null)
			result = businesshours.proxies.Business_Time_Group.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Commitment_Business_Time_Group
	 * @param commitment_business_time_group
	 */
	public final void setCommitment_Business_Time_Group(businesshours.proxies.Business_Time_Group commitment_business_time_group)
	{
		setCommitment_Business_Time_Group(getContext(), commitment_business_time_group);
	}

	/**
	 * Set value of Commitment_Business_Time_Group
	 * @param context
	 * @param commitment_business_time_group
	 */
	public final void setCommitment_Business_Time_Group(com.mendix.systemwideinterfaces.core.IContext context, businesshours.proxies.Business_Time_Group commitment_business_time_group)
	{
		if (commitment_business_time_group == null)
			getMendixObject().setValue(context, MemberNames.Commitment_Business_Time_Group.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Commitment_Business_Time_Group.toString(), commitment_business_time_group.getMendixObject().getId());
	}

	/**
	 * @return value of Commitment_DataAccess
	 */
	public final java.util.List<da.proxies.Label> getCommitment_DataAccess() throws com.mendix.core.CoreException
	{
		return getCommitment_DataAccess(getContext());
	}

	/**
	 * @param context
	 * @return value of Commitment_DataAccess
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<da.proxies.Label> getCommitment_DataAccess(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<da.proxies.Label> result = new java.util.ArrayList<da.proxies.Label>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Commitment_DataAccess.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(da.proxies.Label.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Commitment_DataAccess
	 * @param commitment_dataaccess
	 */
	public final void setCommitment_DataAccess(java.util.List<da.proxies.Label> commitment_dataaccess)
	{
		setCommitment_DataAccess(getContext(), commitment_dataaccess);
	}

	/**
	 * Set value of Commitment_DataAccess
	 * @param context
	 * @param commitment_dataaccess
	 */
	public final void setCommitment_DataAccess(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<da.proxies.Label> commitment_dataaccess)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (da.proxies.Label proxyObject : commitment_dataaccess)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Commitment_DataAccess.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return commitmentMendixObject;
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
			final slm_notifications.proxies.Commitment that = (slm_notifications.proxies.Commitment) obj;
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
		return "SLM_Notifications.Commitment";
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
