// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class ExternalReference
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject externalReferenceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.ExternalReference";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ReferenceID("ReferenceID"),
		ReferenceType("ReferenceType"),
		UsedForInterface("UsedForInterface"),
		InterfaceGUID("InterfaceGUID"),
		InitialSyncDone("InitialSyncDone"),
		StartSync("StartSync"),
		ReferenceTypeSelection("ReferenceTypeSelection"),
		ExternalReference_Request("Process.ExternalReference_Request"),
		ExternalReference_OverviewRequest("Process.ExternalReference_OverviewRequest"),
		ExternalReference_InterfaceConfiguration("Process.ExternalReference_InterfaceConfiguration"),
		ExternalReference_InitiatingInterfaceConfiguration("Process.ExternalReference_InitiatingInterfaceConfiguration"),
		ExternalReference_TempEventInitiatingProcessingAttempt("Process.ExternalReference_TempEventInitiatingProcessingAttempt");

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

	public ExternalReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.ExternalReference"));
	}

	protected ExternalReference(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject externalReferenceMendixObject)
	{
		if (externalReferenceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Process.ExternalReference", externalReferenceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.ExternalReference");

		this.externalReferenceMendixObject = externalReferenceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ExternalReference.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.ExternalReference initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.ExternalReference.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.ExternalReference initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.ExternalReference(context, mendixObject);
	}

	public static process.proxies.ExternalReference load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.ExternalReference.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.ExternalReference> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.ExternalReference> result = new java.util.ArrayList<process.proxies.ExternalReference>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.ExternalReference" + xpathConstraint))
			result.add(process.proxies.ExternalReference.initialize(context, obj));
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
	 * @return value of ReferenceID
	 */
	public final java.lang.String getReferenceID()
	{
		return getReferenceID(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceID
	 */
	public final java.lang.String getReferenceID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ReferenceID.toString());
	}

	/**
	 * Set value of ReferenceID
	 * @param referenceid
	 */
	public final void setReferenceID(java.lang.String referenceid)
	{
		setReferenceID(getContext(), referenceid);
	}

	/**
	 * Set value of ReferenceID
	 * @param context
	 * @param referenceid
	 */
	public final void setReferenceID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String referenceid)
	{
		getMendixObject().setValue(context, MemberNames.ReferenceID.toString(), referenceid);
	}

	/**
	 * Set value of ReferenceType
	 * @param referencetype
	 */
	public final process.proxies.ExternalReferenceType getReferenceType()
	{
		return getReferenceType(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceType
	 */
	public final process.proxies.ExternalReferenceType getReferenceType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ReferenceType.toString());
		if (obj == null)
			return null;

		return process.proxies.ExternalReferenceType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ReferenceType
	 * @param referencetype
	 */
	public final void setReferenceType(process.proxies.ExternalReferenceType referencetype)
	{
		setReferenceType(getContext(), referencetype);
	}

	/**
	 * Set value of ReferenceType
	 * @param context
	 * @param referencetype
	 */
	public final void setReferenceType(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.ExternalReferenceType referencetype)
	{
		if (referencetype != null)
			getMendixObject().setValue(context, MemberNames.ReferenceType.toString(), referencetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ReferenceType.toString(), null);
	}

	/**
	 * @return value of UsedForInterface
	 */
	public final java.lang.Boolean getUsedForInterface()
	{
		return getUsedForInterface(getContext());
	}

	/**
	 * @param context
	 * @return value of UsedForInterface
	 */
	public final java.lang.Boolean getUsedForInterface(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UsedForInterface.toString());
	}

	/**
	 * Set value of UsedForInterface
	 * @param usedforinterface
	 */
	public final void setUsedForInterface(java.lang.Boolean usedforinterface)
	{
		setUsedForInterface(getContext(), usedforinterface);
	}

	/**
	 * Set value of UsedForInterface
	 * @param context
	 * @param usedforinterface
	 */
	public final void setUsedForInterface(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usedforinterface)
	{
		getMendixObject().setValue(context, MemberNames.UsedForInterface.toString(), usedforinterface);
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
	 * @return value of InitialSyncDone
	 */
	public final java.lang.Boolean getInitialSyncDone()
	{
		return getInitialSyncDone(getContext());
	}

	/**
	 * @param context
	 * @return value of InitialSyncDone
	 */
	public final java.lang.Boolean getInitialSyncDone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.InitialSyncDone.toString());
	}

	/**
	 * Set value of InitialSyncDone
	 * @param initialsyncdone
	 */
	public final void setInitialSyncDone(java.lang.Boolean initialsyncdone)
	{
		setInitialSyncDone(getContext(), initialsyncdone);
	}

	/**
	 * Set value of InitialSyncDone
	 * @param context
	 * @param initialsyncdone
	 */
	public final void setInitialSyncDone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean initialsyncdone)
	{
		getMendixObject().setValue(context, MemberNames.InitialSyncDone.toString(), initialsyncdone);
	}

	/**
	 * @return value of StartSync
	 */
	public final java.lang.Boolean getStartSync()
	{
		return getStartSync(getContext());
	}

	/**
	 * @param context
	 * @return value of StartSync
	 */
	public final java.lang.Boolean getStartSync(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.StartSync.toString());
	}

	/**
	 * Set value of StartSync
	 * @param startsync
	 */
	public final void setStartSync(java.lang.Boolean startsync)
	{
		setStartSync(getContext(), startsync);
	}

	/**
	 * Set value of StartSync
	 * @param context
	 * @param startsync
	 */
	public final void setStartSync(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean startsync)
	{
		getMendixObject().setValue(context, MemberNames.StartSync.toString(), startsync);
	}

	/**
	 * Set value of ReferenceTypeSelection
	 * @param referencetypeselection
	 */
	public final process.proxies.ExternalReferenceTypeSelection getReferenceTypeSelection()
	{
		return getReferenceTypeSelection(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceTypeSelection
	 */
	public final process.proxies.ExternalReferenceTypeSelection getReferenceTypeSelection(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ReferenceTypeSelection.toString());
		if (obj == null)
			return null;

		return process.proxies.ExternalReferenceTypeSelection.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ReferenceTypeSelection
	 * @param referencetypeselection
	 */
	public final void setReferenceTypeSelection(process.proxies.ExternalReferenceTypeSelection referencetypeselection)
	{
		setReferenceTypeSelection(getContext(), referencetypeselection);
	}

	/**
	 * Set value of ReferenceTypeSelection
	 * @param context
	 * @param referencetypeselection
	 */
	public final void setReferenceTypeSelection(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.ExternalReferenceTypeSelection referencetypeselection)
	{
		if (referencetypeselection != null)
			getMendixObject().setValue(context, MemberNames.ReferenceTypeSelection.toString(), referencetypeselection.toString());
		else
			getMendixObject().setValue(context, MemberNames.ReferenceTypeSelection.toString(), null);
	}

	/**
	 * @return value of ExternalReference_Request
	 */
	public final java.util.List<process.proxies.Request> getExternalReference_Request() throws com.mendix.core.CoreException
	{
		return getExternalReference_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of ExternalReference_Request
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<process.proxies.Request> getExternalReference_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.Request> result = new java.util.ArrayList<process.proxies.Request>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ExternalReference_Request.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(process.proxies.Request.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ExternalReference_Request
	 * @param externalreference_request
	 */
	public final void setExternalReference_Request(java.util.List<process.proxies.Request> externalreference_request)
	{
		setExternalReference_Request(getContext(), externalreference_request);
	}

	/**
	 * Set value of ExternalReference_Request
	 * @param context
	 * @param externalreference_request
	 */
	public final void setExternalReference_Request(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<process.proxies.Request> externalreference_request)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (process.proxies.Request proxyObject : externalreference_request)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ExternalReference_Request.toString(), identifiers);
	}

	/**
	 * @return value of ExternalReference_OverviewRequest
	 */
	public final java.util.List<process.proxies.OverviewRequest> getExternalReference_OverviewRequest() throws com.mendix.core.CoreException
	{
		return getExternalReference_OverviewRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of ExternalReference_OverviewRequest
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<process.proxies.OverviewRequest> getExternalReference_OverviewRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.OverviewRequest> result = new java.util.ArrayList<process.proxies.OverviewRequest>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.ExternalReference_OverviewRequest.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(process.proxies.OverviewRequest.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of ExternalReference_OverviewRequest
	 * @param externalreference_overviewrequest
	 */
	public final void setExternalReference_OverviewRequest(java.util.List<process.proxies.OverviewRequest> externalreference_overviewrequest)
	{
		setExternalReference_OverviewRequest(getContext(), externalreference_overviewrequest);
	}

	/**
	 * Set value of ExternalReference_OverviewRequest
	 * @param context
	 * @param externalreference_overviewrequest
	 */
	public final void setExternalReference_OverviewRequest(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<process.proxies.OverviewRequest> externalreference_overviewrequest)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (process.proxies.OverviewRequest proxyObject : externalreference_overviewrequest)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.ExternalReference_OverviewRequest.toString(), identifiers);
	}

	/**
	 * @return value of ExternalReference_InterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceConfiguration getExternalReference_InterfaceConfiguration() throws com.mendix.core.CoreException
	{
		return getExternalReference_InterfaceConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of ExternalReference_InterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceConfiguration getExternalReference_InterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.InterfaceConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExternalReference_InterfaceConfiguration.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.InterfaceConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExternalReference_InterfaceConfiguration
	 * @param externalreference_interfaceconfiguration
	 */
	public final void setExternalReference_InterfaceConfiguration(interfaceconfiguration.proxies.InterfaceConfiguration externalreference_interfaceconfiguration)
	{
		setExternalReference_InterfaceConfiguration(getContext(), externalreference_interfaceconfiguration);
	}

	/**
	 * Set value of ExternalReference_InterfaceConfiguration
	 * @param context
	 * @param externalreference_interfaceconfiguration
	 */
	public final void setExternalReference_InterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.InterfaceConfiguration externalreference_interfaceconfiguration)
	{
		if (externalreference_interfaceconfiguration == null)
			getMendixObject().setValue(context, MemberNames.ExternalReference_InterfaceConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExternalReference_InterfaceConfiguration.toString(), externalreference_interfaceconfiguration.getMendixObject().getId());
	}

	/**
	 * @return value of ExternalReference_InitiatingInterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceConfiguration getExternalReference_InitiatingInterfaceConfiguration() throws com.mendix.core.CoreException
	{
		return getExternalReference_InitiatingInterfaceConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of ExternalReference_InitiatingInterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceConfiguration getExternalReference_InitiatingInterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.InterfaceConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExternalReference_InitiatingInterfaceConfiguration.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.InterfaceConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExternalReference_InitiatingInterfaceConfiguration
	 * @param externalreference_initiatinginterfaceconfiguration
	 */
	public final void setExternalReference_InitiatingInterfaceConfiguration(interfaceconfiguration.proxies.InterfaceConfiguration externalreference_initiatinginterfaceconfiguration)
	{
		setExternalReference_InitiatingInterfaceConfiguration(getContext(), externalreference_initiatinginterfaceconfiguration);
	}

	/**
	 * Set value of ExternalReference_InitiatingInterfaceConfiguration
	 * @param context
	 * @param externalreference_initiatinginterfaceconfiguration
	 */
	public final void setExternalReference_InitiatingInterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.InterfaceConfiguration externalreference_initiatinginterfaceconfiguration)
	{
		if (externalreference_initiatinginterfaceconfiguration == null)
			getMendixObject().setValue(context, MemberNames.ExternalReference_InitiatingInterfaceConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExternalReference_InitiatingInterfaceConfiguration.toString(), externalreference_initiatinginterfaceconfiguration.getMendixObject().getId());
	}

	/**
	 * @return value of ExternalReference_TempEventInitiatingProcessingAttempt
	 */
	public final interfaceshared.proxies.ProcessingAttempt getExternalReference_TempEventInitiatingProcessingAttempt() throws com.mendix.core.CoreException
	{
		return getExternalReference_TempEventInitiatingProcessingAttempt(getContext());
	}

	/**
	 * @param context
	 * @return value of ExternalReference_TempEventInitiatingProcessingAttempt
	 */
	public final interfaceshared.proxies.ProcessingAttempt getExternalReference_TempEventInitiatingProcessingAttempt(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.ProcessingAttempt result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExternalReference_TempEventInitiatingProcessingAttempt.toString());
		if (identifier != null)
			result = interfaceshared.proxies.ProcessingAttempt.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExternalReference_TempEventInitiatingProcessingAttempt
	 * @param externalreference_tempeventinitiatingprocessingattempt
	 */
	public final void setExternalReference_TempEventInitiatingProcessingAttempt(interfaceshared.proxies.ProcessingAttempt externalreference_tempeventinitiatingprocessingattempt)
	{
		setExternalReference_TempEventInitiatingProcessingAttempt(getContext(), externalreference_tempeventinitiatingprocessingattempt);
	}

	/**
	 * Set value of ExternalReference_TempEventInitiatingProcessingAttempt
	 * @param context
	 * @param externalreference_tempeventinitiatingprocessingattempt
	 */
	public final void setExternalReference_TempEventInitiatingProcessingAttempt(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.ProcessingAttempt externalreference_tempeventinitiatingprocessingattempt)
	{
		if (externalreference_tempeventinitiatingprocessingattempt == null)
			getMendixObject().setValue(context, MemberNames.ExternalReference_TempEventInitiatingProcessingAttempt.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExternalReference_TempEventInitiatingProcessingAttempt.toString(), externalreference_tempeventinitiatingprocessingattempt.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return externalReferenceMendixObject;
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
			final process.proxies.ExternalReference that = (process.proxies.ExternalReference) obj;
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
		return "Process.ExternalReference";
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
