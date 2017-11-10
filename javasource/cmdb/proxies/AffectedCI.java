// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cmdb.proxies;

public class AffectedCI
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject affectedCIMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CMDB.AffectedCI";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		State("State"),
		InterfaceGUID("InterfaceGUID"),
		Delete("Delete"),
		HasSpareReserved("HasSpareReserved"),
		AffectedCI_ConfigurationItem("CMDB.AffectedCI_ConfigurationItem"),
		AffectedCISelect_AffectedCI("CMDB.AffectedCISelect_AffectedCI"),
		AffectedCIHelper_AffectedCI("CMDB.AffectedCIHelper_AffectedCI"),
		AffectedCI_Request("CMDB.AffectedCI_Request"),
		AffectedCI_TemplateRequest("CMDB.AffectedCI_TemplateRequest"),
		AffectedCI_InitiatingInterfaceConfiguration("CMDB.AffectedCI_InitiatingInterfaceConfiguration"),
		AffectedCI_TempEventInitiatingProcessingAttempt("CMDB.AffectedCI_TempEventInitiatingProcessingAttempt");

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

	public AffectedCI(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CMDB.AffectedCI"));
	}

	protected AffectedCI(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject affectedCIMendixObject)
	{
		if (affectedCIMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CMDB.AffectedCI", affectedCIMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CMDB.AffectedCI");

		this.affectedCIMendixObject = affectedCIMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AffectedCI.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static cmdb.proxies.AffectedCI initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return cmdb.proxies.AffectedCI.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static cmdb.proxies.AffectedCI initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new cmdb.proxies.AffectedCI(context, mendixObject);
	}

	public static cmdb.proxies.AffectedCI load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return cmdb.proxies.AffectedCI.initialize(context, mendixObject);
	}

	public static java.util.List<cmdb.proxies.AffectedCI> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<cmdb.proxies.AffectedCI> result = new java.util.ArrayList<cmdb.proxies.AffectedCI>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CMDB.AffectedCI" + xpathConstraint))
			result.add(cmdb.proxies.AffectedCI.initialize(context, obj));
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
	 * Set value of State
	 * @param state
	 */
	public final cmdb.proxies.AffectedCIState getState()
	{
		return getState(getContext());
	}

	/**
	 * @param context
	 * @return value of State
	 */
	public final cmdb.proxies.AffectedCIState getState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.State.toString());
		if (obj == null)
			return null;

		return cmdb.proxies.AffectedCIState.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final void setState(cmdb.proxies.AffectedCIState state)
	{
		setState(getContext(), state);
	}

	/**
	 * Set value of State
	 * @param context
	 * @param state
	 */
	public final void setState(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.AffectedCIState state)
	{
		if (state != null)
			getMendixObject().setValue(context, MemberNames.State.toString(), state.toString());
		else
			getMendixObject().setValue(context, MemberNames.State.toString(), null);
	}

	/**
	 * @return value of InterfaceGUID
	 */
	public final java.lang.String getInterfaceGUID()
	{
		return getInterfaceGUID(getContext());
	}

	/**
	 * @param context
	 * @return value of InterfaceGUID
	 */
	public final java.lang.String getInterfaceGUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InterfaceGUID.toString());
	}

	/**
	 * Set value of InterfaceGUID
	 * @param interfaceguid
	 */
	public final void setInterfaceGUID(java.lang.String interfaceguid)
	{
		setInterfaceGUID(getContext(), interfaceguid);
	}

	/**
	 * Set value of InterfaceGUID
	 * @param context
	 * @param interfaceguid
	 */
	public final void setInterfaceGUID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String interfaceguid)
	{
		getMendixObject().setValue(context, MemberNames.InterfaceGUID.toString(), interfaceguid);
	}

	/**
	 * @return value of Delete
	 */
	public final java.lang.Boolean getDelete()
	{
		return getDelete(getContext());
	}

	/**
	 * @param context
	 * @return value of Delete
	 */
	public final java.lang.Boolean getDelete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Delete.toString());
	}

	/**
	 * Set value of Delete
	 * @param delete
	 */
	public final void setDelete(java.lang.Boolean delete)
	{
		setDelete(getContext(), delete);
	}

	/**
	 * Set value of Delete
	 * @param context
	 * @param delete
	 */
	public final void setDelete(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean delete)
	{
		getMendixObject().setValue(context, MemberNames.Delete.toString(), delete);
	}

	/**
	 * @return value of HasSpareReserved
	 */
	public final java.lang.Boolean getHasSpareReserved()
	{
		return getHasSpareReserved(getContext());
	}

	/**
	 * @param context
	 * @return value of HasSpareReserved
	 */
	public final java.lang.Boolean getHasSpareReserved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasSpareReserved.toString());
	}

	/**
	 * Set value of HasSpareReserved
	 * @param hassparereserved
	 */
	public final void setHasSpareReserved(java.lang.Boolean hassparereserved)
	{
		setHasSpareReserved(getContext(), hassparereserved);
	}

	/**
	 * Set value of HasSpareReserved
	 * @param context
	 * @param hassparereserved
	 */
	public final void setHasSpareReserved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hassparereserved)
	{
		getMendixObject().setValue(context, MemberNames.HasSpareReserved.toString(), hassparereserved);
	}

	/**
	 * @return value of AffectedCI_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getAffectedCI_ConfigurationItem() throws com.mendix.core.CoreException
	{
		return getAffectedCI_ConfigurationItem(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCI_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getAffectedCI_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.ConfigurationItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCI_ConfigurationItem.toString());
		if (identifier != null)
			result = cmdb.proxies.ConfigurationItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCI_ConfigurationItem
	 * @param affectedci_configurationitem
	 */
	public final void setAffectedCI_ConfigurationItem(cmdb.proxies.ConfigurationItem affectedci_configurationitem)
	{
		setAffectedCI_ConfigurationItem(getContext(), affectedci_configurationitem);
	}

	/**
	 * Set value of AffectedCI_ConfigurationItem
	 * @param context
	 * @param affectedci_configurationitem
	 */
	public final void setAffectedCI_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.ConfigurationItem affectedci_configurationitem)
	{
		if (affectedci_configurationitem == null)
			getMendixObject().setValue(context, MemberNames.AffectedCI_ConfigurationItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCI_ConfigurationItem.toString(), affectedci_configurationitem.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCISelect_AffectedCI
	 */
	public final cmdb.proxies.AffectedCISelect getAffectedCISelect_AffectedCI() throws com.mendix.core.CoreException
	{
		return getAffectedCISelect_AffectedCI(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCISelect_AffectedCI
	 */
	public final cmdb.proxies.AffectedCISelect getAffectedCISelect_AffectedCI(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.AffectedCISelect result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCISelect_AffectedCI.toString());
		if (identifier != null)
			result = cmdb.proxies.AffectedCISelect.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCISelect_AffectedCI
	 * @param affectedciselect_affectedci
	 */
	public final void setAffectedCISelect_AffectedCI(cmdb.proxies.AffectedCISelect affectedciselect_affectedci)
	{
		setAffectedCISelect_AffectedCI(getContext(), affectedciselect_affectedci);
	}

	/**
	 * Set value of AffectedCISelect_AffectedCI
	 * @param context
	 * @param affectedciselect_affectedci
	 */
	public final void setAffectedCISelect_AffectedCI(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.AffectedCISelect affectedciselect_affectedci)
	{
		if (affectedciselect_affectedci == null)
			getMendixObject().setValue(context, MemberNames.AffectedCISelect_AffectedCI.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCISelect_AffectedCI.toString(), affectedciselect_affectedci.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCIHelper_AffectedCI
	 */
	public final cmdb.proxies.AffectedCIHelper getAffectedCIHelper_AffectedCI() throws com.mendix.core.CoreException
	{
		return getAffectedCIHelper_AffectedCI(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIHelper_AffectedCI
	 */
	public final cmdb.proxies.AffectedCIHelper getAffectedCIHelper_AffectedCI(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.AffectedCIHelper result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIHelper_AffectedCI.toString());
		if (identifier != null)
			result = cmdb.proxies.AffectedCIHelper.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIHelper_AffectedCI
	 * @param affectedcihelper_affectedci
	 */
	public final void setAffectedCIHelper_AffectedCI(cmdb.proxies.AffectedCIHelper affectedcihelper_affectedci)
	{
		setAffectedCIHelper_AffectedCI(getContext(), affectedcihelper_affectedci);
	}

	/**
	 * Set value of AffectedCIHelper_AffectedCI
	 * @param context
	 * @param affectedcihelper_affectedci
	 */
	public final void setAffectedCIHelper_AffectedCI(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.AffectedCIHelper affectedcihelper_affectedci)
	{
		if (affectedcihelper_affectedci == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIHelper_AffectedCI.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIHelper_AffectedCI.toString(), affectedcihelper_affectedci.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCI_Request
	 */
	public final process.proxies.Request getAffectedCI_Request() throws com.mendix.core.CoreException
	{
		return getAffectedCI_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCI_Request
	 */
	public final process.proxies.Request getAffectedCI_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCI_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCI_Request
	 * @param affectedci_request
	 */
	public final void setAffectedCI_Request(process.proxies.Request affectedci_request)
	{
		setAffectedCI_Request(getContext(), affectedci_request);
	}

	/**
	 * Set value of AffectedCI_Request
	 * @param context
	 * @param affectedci_request
	 */
	public final void setAffectedCI_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request affectedci_request)
	{
		if (affectedci_request == null)
			getMendixObject().setValue(context, MemberNames.AffectedCI_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCI_Request.toString(), affectedci_request.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCI_TemplateRequest
	 */
	public final scheduling.proxies.TemplateRequest getAffectedCI_TemplateRequest() throws com.mendix.core.CoreException
	{
		return getAffectedCI_TemplateRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCI_TemplateRequest
	 */
	public final scheduling.proxies.TemplateRequest getAffectedCI_TemplateRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		scheduling.proxies.TemplateRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCI_TemplateRequest.toString());
		if (identifier != null)
			result = scheduling.proxies.TemplateRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCI_TemplateRequest
	 * @param affectedci_templaterequest
	 */
	public final void setAffectedCI_TemplateRequest(scheduling.proxies.TemplateRequest affectedci_templaterequest)
	{
		setAffectedCI_TemplateRequest(getContext(), affectedci_templaterequest);
	}

	/**
	 * Set value of AffectedCI_TemplateRequest
	 * @param context
	 * @param affectedci_templaterequest
	 */
	public final void setAffectedCI_TemplateRequest(com.mendix.systemwideinterfaces.core.IContext context, scheduling.proxies.TemplateRequest affectedci_templaterequest)
	{
		if (affectedci_templaterequest == null)
			getMendixObject().setValue(context, MemberNames.AffectedCI_TemplateRequest.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCI_TemplateRequest.toString(), affectedci_templaterequest.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCI_InitiatingInterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceConfiguration getAffectedCI_InitiatingInterfaceConfiguration() throws com.mendix.core.CoreException
	{
		return getAffectedCI_InitiatingInterfaceConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCI_InitiatingInterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceConfiguration getAffectedCI_InitiatingInterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.InterfaceConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCI_InitiatingInterfaceConfiguration.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.InterfaceConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCI_InitiatingInterfaceConfiguration
	 * @param affectedci_initiatinginterfaceconfiguration
	 */
	public final void setAffectedCI_InitiatingInterfaceConfiguration(interfaceconfiguration.proxies.InterfaceConfiguration affectedci_initiatinginterfaceconfiguration)
	{
		setAffectedCI_InitiatingInterfaceConfiguration(getContext(), affectedci_initiatinginterfaceconfiguration);
	}

	/**
	 * Set value of AffectedCI_InitiatingInterfaceConfiguration
	 * @param context
	 * @param affectedci_initiatinginterfaceconfiguration
	 */
	public final void setAffectedCI_InitiatingInterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.InterfaceConfiguration affectedci_initiatinginterfaceconfiguration)
	{
		if (affectedci_initiatinginterfaceconfiguration == null)
			getMendixObject().setValue(context, MemberNames.AffectedCI_InitiatingInterfaceConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCI_InitiatingInterfaceConfiguration.toString(), affectedci_initiatinginterfaceconfiguration.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCI_TempEventInitiatingProcessingAttempt
	 */
	public final interfaceshared.proxies.ProcessingAttempt getAffectedCI_TempEventInitiatingProcessingAttempt() throws com.mendix.core.CoreException
	{
		return getAffectedCI_TempEventInitiatingProcessingAttempt(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCI_TempEventInitiatingProcessingAttempt
	 */
	public final interfaceshared.proxies.ProcessingAttempt getAffectedCI_TempEventInitiatingProcessingAttempt(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.ProcessingAttempt result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCI_TempEventInitiatingProcessingAttempt.toString());
		if (identifier != null)
			result = interfaceshared.proxies.ProcessingAttempt.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCI_TempEventInitiatingProcessingAttempt
	 * @param affectedci_tempeventinitiatingprocessingattempt
	 */
	public final void setAffectedCI_TempEventInitiatingProcessingAttempt(interfaceshared.proxies.ProcessingAttempt affectedci_tempeventinitiatingprocessingattempt)
	{
		setAffectedCI_TempEventInitiatingProcessingAttempt(getContext(), affectedci_tempeventinitiatingprocessingattempt);
	}

	/**
	 * Set value of AffectedCI_TempEventInitiatingProcessingAttempt
	 * @param context
	 * @param affectedci_tempeventinitiatingprocessingattempt
	 */
	public final void setAffectedCI_TempEventInitiatingProcessingAttempt(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.ProcessingAttempt affectedci_tempeventinitiatingprocessingattempt)
	{
		if (affectedci_tempeventinitiatingprocessingattempt == null)
			getMendixObject().setValue(context, MemberNames.AffectedCI_TempEventInitiatingProcessingAttempt.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCI_TempEventInitiatingProcessingAttempt.toString(), affectedci_tempeventinitiatingprocessingattempt.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return affectedCIMendixObject;
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
			final cmdb.proxies.AffectedCI that = (cmdb.proxies.AffectedCI) obj;
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
		return "CMDB.AffectedCI";
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
