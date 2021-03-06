// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slm.proxies;

public class Service
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject serviceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SLM.Service";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ServiceName("ServiceName"),
		Description("Description"),
		hasCommitment("hasCommitment"),
		CardColor("CardColor"),
		ConfigurationItem_Service("CMDB.ConfigurationItem_Service"),
		Service_Commitment("SLM.Service_Commitment"),
		Service_DataAccess("SLM.Service_DataAccess");

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

	public Service(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SLM.Service"));
	}

	protected Service(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject serviceMendixObject)
	{
		if (serviceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SLM.Service", serviceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SLM.Service");

		this.serviceMendixObject = serviceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Service.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static slm.proxies.Service initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return slm.proxies.Service.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static slm.proxies.Service initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new slm.proxies.Service(context, mendixObject);
	}

	public static slm.proxies.Service load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return slm.proxies.Service.initialize(context, mendixObject);
	}

	public static java.util.List<slm.proxies.Service> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<slm.proxies.Service> result = new java.util.ArrayList<slm.proxies.Service>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SLM.Service" + xpathConstraint))
			result.add(slm.proxies.Service.initialize(context, obj));
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
	 * @return value of ServiceName
	 */
	public final java.lang.String getServiceName()
	{
		return getServiceName(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceName
	 */
	public final java.lang.String getServiceName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ServiceName.toString());
	}

	/**
	 * Set value of ServiceName
	 * @param servicename
	 */
	public final void setServiceName(java.lang.String servicename)
	{
		setServiceName(getContext(), servicename);
	}

	/**
	 * Set value of ServiceName
	 * @param context
	 * @param servicename
	 */
	public final void setServiceName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String servicename)
	{
		getMendixObject().setValue(context, MemberNames.ServiceName.toString(), servicename);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of hasCommitment
	 */
	public final java.lang.Boolean gethasCommitment()
	{
		return gethasCommitment(getContext());
	}

	/**
	 * @param context
	 * @return value of hasCommitment
	 */
	public final java.lang.Boolean gethasCommitment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.hasCommitment.toString());
	}

	/**
	 * Set value of hasCommitment
	 * @param hascommitment
	 */
	public final void sethasCommitment(java.lang.Boolean hascommitment)
	{
		sethasCommitment(getContext(), hascommitment);
	}

	/**
	 * Set value of hasCommitment
	 * @param context
	 * @param hascommitment
	 */
	public final void sethasCommitment(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hascommitment)
	{
		getMendixObject().setValue(context, MemberNames.hasCommitment.toString(), hascommitment);
	}

	/**
	 * @return value of CardColor
	 */
	public final java.lang.String getCardColor()
	{
		return getCardColor(getContext());
	}

	/**
	 * @param context
	 * @return value of CardColor
	 */
	public final java.lang.String getCardColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CardColor.toString());
	}

	/**
	 * Set value of CardColor
	 * @param cardcolor
	 */
	public final void setCardColor(java.lang.String cardcolor)
	{
		setCardColor(getContext(), cardcolor);
	}

	/**
	 * Set value of CardColor
	 * @param context
	 * @param cardcolor
	 */
	public final void setCardColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cardcolor)
	{
		getMendixObject().setValue(context, MemberNames.CardColor.toString(), cardcolor);
	}

	/**
	 * @return value of ConfigurationItem_Service
	 */
	public final java.util.List<cmdb.proxies.ConfigurationItem> getConfigurationItem_Service() throws com.mendix.core.CoreException
	{
		return getConfigurationItem_Service(getContext());
	}

	/**
	 * @param context
	 * @return value of ConfigurationItem_Service
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<cmdb.proxies.ConfigurationItem> getConfigurationItem_Service(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<cmdb.proxies.ConfigurationItem> result = new java.util.ArrayList<cmdb.proxies.ConfigurationItem>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ConfigurationItem_Service.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(cmdb.proxies.ConfigurationItem.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ConfigurationItem_Service
	 * @param configurationitem_service
	 */
	public final void setConfigurationItem_Service(java.util.List<cmdb.proxies.ConfigurationItem> configurationitem_service)
	{
		setConfigurationItem_Service(getContext(), configurationitem_service);
	}

	/**
	 * Set value of ConfigurationItem_Service
	 * @param context
	 * @param configurationitem_service
	 */
	public final void setConfigurationItem_Service(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<cmdb.proxies.ConfigurationItem> configurationitem_service)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (cmdb.proxies.ConfigurationItem proxyObject : configurationitem_service)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ConfigurationItem_Service.toString(), identifiers);
	}

	/**
	 * @return value of Service_Commitment
	 */
	public final slm_notifications.proxies.Commitment getService_Commitment() throws com.mendix.core.CoreException
	{
		return getService_Commitment(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_Commitment
	 */
	public final slm_notifications.proxies.Commitment getService_Commitment(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slm_notifications.proxies.Commitment result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Service_Commitment.toString());
		if (identifier != null)
			result = slm_notifications.proxies.Commitment.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Service_Commitment
	 * @param service_commitment
	 */
	public final void setService_Commitment(slm_notifications.proxies.Commitment service_commitment)
	{
		setService_Commitment(getContext(), service_commitment);
	}

	/**
	 * Set value of Service_Commitment
	 * @param context
	 * @param service_commitment
	 */
	public final void setService_Commitment(com.mendix.systemwideinterfaces.core.IContext context, slm_notifications.proxies.Commitment service_commitment)
	{
		if (service_commitment == null)
			getMendixObject().setValue(context, MemberNames.Service_Commitment.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Service_Commitment.toString(), service_commitment.getMendixObject().getId());
	}

	/**
	 * @return value of Service_DataAccess
	 */
	public final java.util.List<da.proxies.Label> getService_DataAccess() throws com.mendix.core.CoreException
	{
		return getService_DataAccess(getContext());
	}

	/**
	 * @param context
	 * @return value of Service_DataAccess
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<da.proxies.Label> getService_DataAccess(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<da.proxies.Label> result = new java.util.ArrayList<da.proxies.Label>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Service_DataAccess.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(da.proxies.Label.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Service_DataAccess
	 * @param service_dataaccess
	 */
	public final void setService_DataAccess(java.util.List<da.proxies.Label> service_dataaccess)
	{
		setService_DataAccess(getContext(), service_dataaccess);
	}

	/**
	 * Set value of Service_DataAccess
	 * @param context
	 * @param service_dataaccess
	 */
	public final void setService_DataAccess(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<da.proxies.Label> service_dataaccess)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (da.proxies.Label proxyObject : service_dataaccess)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Service_DataAccess.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return serviceMendixObject;
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
			final slm.proxies.Service that = (slm.proxies.Service) obj;
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
		return "SLM.Service";
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
