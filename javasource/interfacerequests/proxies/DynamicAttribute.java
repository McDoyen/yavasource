// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerequests.proxies;

public class DynamicAttribute extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRequests.DynamicAttribute";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Value("Value"),
		DynamicAttributeGUID("DynamicAttributeGUID"),
		Operation("Operation"),
		DynamicAttributes_IncomingRequest("InterfaceRequests.DynamicAttributes_IncomingRequest"),
		DynamicAttributeResponse_DynamicAttribute("InterfaceRequests.DynamicAttributeResponse_DynamicAttribute"),
		DynamicAttribute_DynamicAttributesContainerExpertDesk("InterfaceRequests.DynamicAttribute_DynamicAttributesContainerExpertDesk"),
		DynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk("InterfaceRequests.DynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk"),
		DynamicAttributes_IncomingRequestUpdate("InterfaceRequests.DynamicAttributes_IncomingRequestUpdate"),
		DynamicAttribute_DynamicTable("InterfaceRequests.DynamicAttribute_DynamicTable");

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

	public DynamicAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRequests.DynamicAttribute"));
	}

	protected DynamicAttribute(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dynamicAttributeMendixObject)
	{
		super(context, dynamicAttributeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRequests.DynamicAttribute", dynamicAttributeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRequests.DynamicAttribute");
	}

	/**
	 * @deprecated Use 'DynamicAttribute.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerequests.proxies.DynamicAttribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerequests.proxies.DynamicAttribute.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerequests.proxies.DynamicAttribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerequests.proxies.DynamicAttribute(context, mendixObject);
	}

	public static interfacerequests.proxies.DynamicAttribute load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerequests.proxies.DynamicAttribute.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerequests.proxies.DynamicAttribute> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerequests.proxies.DynamicAttribute> result = new java.util.ArrayList<interfacerequests.proxies.DynamicAttribute>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRequests.DynamicAttribute" + xpathConstraint))
			result.add(interfacerequests.proxies.DynamicAttribute.initialize(context, obj));
		return result;
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
	 * @return value of Value
	 */
	public final java.lang.String getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.lang.String getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.lang.String value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @return value of DynamicAttributeGUID
	 */
	public final java.lang.String getDynamicAttributeGUID()
	{
		return getDynamicAttributeGUID(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributeGUID
	 */
	public final java.lang.String getDynamicAttributeGUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DynamicAttributeGUID.toString());
	}

	/**
	 * Set value of DynamicAttributeGUID
	 * @param dynamicattributeguid
	 */
	public final void setDynamicAttributeGUID(java.lang.String dynamicattributeguid)
	{
		setDynamicAttributeGUID(getContext(), dynamicattributeguid);
	}

	/**
	 * Set value of DynamicAttributeGUID
	 * @param context
	 * @param dynamicattributeguid
	 */
	public final void setDynamicAttributeGUID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dynamicattributeguid)
	{
		getMendixObject().setValue(context, MemberNames.DynamicAttributeGUID.toString(), dynamicattributeguid);
	}

	/**
	 * Set value of Operation
	 * @param operation
	 */
	public final interfaceshared.proxies.AddUpdateDeleteOperation getOperation()
	{
		return getOperation(getContext());
	}

	/**
	 * @param context
	 * @return value of Operation
	 */
	public final interfaceshared.proxies.AddUpdateDeleteOperation getOperation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Operation.toString());
		if (obj == null)
			return null;

		return interfaceshared.proxies.AddUpdateDeleteOperation.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Operation
	 * @param operation
	 */
	public final void setOperation(interfaceshared.proxies.AddUpdateDeleteOperation operation)
	{
		setOperation(getContext(), operation);
	}

	/**
	 * Set value of Operation
	 * @param context
	 * @param operation
	 */
	public final void setOperation(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.AddUpdateDeleteOperation operation)
	{
		if (operation != null)
			getMendixObject().setValue(context, MemberNames.Operation.toString(), operation.toString());
		else
			getMendixObject().setValue(context, MemberNames.Operation.toString(), null);
	}

	/**
	 * @return value of DynamicAttributes_IncomingRequest
	 */
	public final interfacerequests.proxies.IncomingRequest getDynamicAttributes_IncomingRequest() throws com.mendix.core.CoreException
	{
		return getDynamicAttributes_IncomingRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributes_IncomingRequest
	 */
	public final interfacerequests.proxies.IncomingRequest getDynamicAttributes_IncomingRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.IncomingRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributes_IncomingRequest.toString());
		if (identifier != null)
			result = interfacerequests.proxies.IncomingRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributes_IncomingRequest
	 * @param dynamicattributes_incomingrequest
	 */
	public final void setDynamicAttributes_IncomingRequest(interfacerequests.proxies.IncomingRequest dynamicattributes_incomingrequest)
	{
		setDynamicAttributes_IncomingRequest(getContext(), dynamicattributes_incomingrequest);
	}

	/**
	 * Set value of DynamicAttributes_IncomingRequest
	 * @param context
	 * @param dynamicattributes_incomingrequest
	 */
	public final void setDynamicAttributes_IncomingRequest(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.IncomingRequest dynamicattributes_incomingrequest)
	{
		if (dynamicattributes_incomingrequest == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributes_IncomingRequest.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributes_IncomingRequest.toString(), dynamicattributes_incomingrequest.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttributeResponse_DynamicAttribute
	 */
	public final interfacerequests.proxies.DynamicAttributeResponse getDynamicAttributeResponse_DynamicAttribute() throws com.mendix.core.CoreException
	{
		return getDynamicAttributeResponse_DynamicAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributeResponse_DynamicAttribute
	 */
	public final interfacerequests.proxies.DynamicAttributeResponse getDynamicAttributeResponse_DynamicAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.DynamicAttributeResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributeResponse_DynamicAttribute.toString());
		if (identifier != null)
			result = interfacerequests.proxies.DynamicAttributeResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributeResponse_DynamicAttribute
	 * @param dynamicattributeresponse_dynamicattribute
	 */
	public final void setDynamicAttributeResponse_DynamicAttribute(interfacerequests.proxies.DynamicAttributeResponse dynamicattributeresponse_dynamicattribute)
	{
		setDynamicAttributeResponse_DynamicAttribute(getContext(), dynamicattributeresponse_dynamicattribute);
	}

	/**
	 * Set value of DynamicAttributeResponse_DynamicAttribute
	 * @param context
	 * @param dynamicattributeresponse_dynamicattribute
	 */
	public final void setDynamicAttributeResponse_DynamicAttribute(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.DynamicAttributeResponse dynamicattributeresponse_dynamicattribute)
	{
		if (dynamicattributeresponse_dynamicattribute == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_DynamicAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponse_DynamicAttribute.toString(), dynamicattributeresponse_dynamicattribute.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttribute_DynamicAttributesContainerExpertDesk
	 */
	public final interfacerequests.proxies.DynamicAttributesContainerExpertDesk getDynamicAttribute_DynamicAttributesContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getDynamicAttribute_DynamicAttributesContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttribute_DynamicAttributesContainerExpertDesk
	 */
	public final interfacerequests.proxies.DynamicAttributesContainerExpertDesk getDynamicAttribute_DynamicAttributesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.DynamicAttributesContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttribute_DynamicAttributesContainerExpertDesk.toString());
		if (identifier != null)
			result = interfacerequests.proxies.DynamicAttributesContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttribute_DynamicAttributesContainerExpertDesk
	 * @param dynamicattribute_dynamicattributescontainerexpertdesk
	 */
	public final void setDynamicAttribute_DynamicAttributesContainerExpertDesk(interfacerequests.proxies.DynamicAttributesContainerExpertDesk dynamicattribute_dynamicattributescontainerexpertdesk)
	{
		setDynamicAttribute_DynamicAttributesContainerExpertDesk(getContext(), dynamicattribute_dynamicattributescontainerexpertdesk);
	}

	/**
	 * Set value of DynamicAttribute_DynamicAttributesContainerExpertDesk
	 * @param context
	 * @param dynamicattribute_dynamicattributescontainerexpertdesk
	 */
	public final void setDynamicAttribute_DynamicAttributesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.DynamicAttributesContainerExpertDesk dynamicattribute_dynamicattributescontainerexpertdesk)
	{
		if (dynamicattribute_dynamicattributescontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttribute_DynamicAttributesContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttribute_DynamicAttributesContainerExpertDesk.toString(), dynamicattribute_dynamicattributescontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk
	 */
	public final interfacerequests.proxies.DynamicAttributesContainerExpertDesk getDynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk() throws com.mendix.core.CoreException
	{
		return getDynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk
	 */
	public final interfacerequests.proxies.DynamicAttributesContainerExpertDesk getDynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.DynamicAttributesContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk.toString());
		if (identifier != null)
			result = interfacerequests.proxies.DynamicAttributesContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk
	 * @param dynamicattributeresponsevalue_dynamicattributescontainerexpertdesk
	 */
	public final void setDynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk(interfacerequests.proxies.DynamicAttributesContainerExpertDesk dynamicattributeresponsevalue_dynamicattributescontainerexpertdesk)
	{
		setDynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk(getContext(), dynamicattributeresponsevalue_dynamicattributescontainerexpertdesk);
	}

	/**
	 * Set value of DynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk
	 * @param context
	 * @param dynamicattributeresponsevalue_dynamicattributescontainerexpertdesk
	 */
	public final void setDynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.DynamicAttributesContainerExpertDesk dynamicattributeresponsevalue_dynamicattributescontainerexpertdesk)
	{
		if (dynamicattributeresponsevalue_dynamicattributescontainerexpertdesk == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributeResponseValue_DynamicAttributesContainerExpertDesk.toString(), dynamicattributeresponsevalue_dynamicattributescontainerexpertdesk.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttributes_IncomingRequestUpdate
	 */
	public final interfacerequestupdate.proxies.IncomingRequestUpdate getDynamicAttributes_IncomingRequestUpdate() throws com.mendix.core.CoreException
	{
		return getDynamicAttributes_IncomingRequestUpdate(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttributes_IncomingRequestUpdate
	 */
	public final interfacerequestupdate.proxies.IncomingRequestUpdate getDynamicAttributes_IncomingRequestUpdate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequestupdate.proxies.IncomingRequestUpdate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DynamicAttributes_IncomingRequestUpdate.toString());
		if (identifier != null)
			result = interfacerequestupdate.proxies.IncomingRequestUpdate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DynamicAttributes_IncomingRequestUpdate
	 * @param dynamicattributes_incomingrequestupdate
	 */
	public final void setDynamicAttributes_IncomingRequestUpdate(interfacerequestupdate.proxies.IncomingRequestUpdate dynamicattributes_incomingrequestupdate)
	{
		setDynamicAttributes_IncomingRequestUpdate(getContext(), dynamicattributes_incomingrequestupdate);
	}

	/**
	 * Set value of DynamicAttributes_IncomingRequestUpdate
	 * @param context
	 * @param dynamicattributes_incomingrequestupdate
	 */
	public final void setDynamicAttributes_IncomingRequestUpdate(com.mendix.systemwideinterfaces.core.IContext context, interfacerequestupdate.proxies.IncomingRequestUpdate dynamicattributes_incomingrequestupdate)
	{
		if (dynamicattributes_incomingrequestupdate == null)
			getMendixObject().setValue(context, MemberNames.DynamicAttributes_IncomingRequestUpdate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DynamicAttributes_IncomingRequestUpdate.toString(), dynamicattributes_incomingrequestupdate.getMendixObject().getId());
	}

	/**
	 * @return value of DynamicAttribute_DynamicTable
	 */
	public final java.util.List<interfaceconfiguration.proxies.DynamicTable> getDynamicAttribute_DynamicTable() throws com.mendix.core.CoreException
	{
		return getDynamicAttribute_DynamicTable(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttribute_DynamicTable
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<interfaceconfiguration.proxies.DynamicTable> getDynamicAttribute_DynamicTable(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceconfiguration.proxies.DynamicTable> result = new java.util.ArrayList<interfaceconfiguration.proxies.DynamicTable>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.DynamicAttribute_DynamicTable.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(interfaceconfiguration.proxies.DynamicTable.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of DynamicAttribute_DynamicTable
	 * @param dynamicattribute_dynamictable
	 */
	public final void setDynamicAttribute_DynamicTable(java.util.List<interfaceconfiguration.proxies.DynamicTable> dynamicattribute_dynamictable)
	{
		setDynamicAttribute_DynamicTable(getContext(), dynamicattribute_dynamictable);
	}

	/**
	 * Set value of DynamicAttribute_DynamicTable
	 * @param context
	 * @param dynamicattribute_dynamictable
	 */
	public final void setDynamicAttribute_DynamicTable(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<interfaceconfiguration.proxies.DynamicTable> dynamicattribute_dynamictable)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (interfaceconfiguration.proxies.DynamicTable proxyObject : dynamicattribute_dynamictable)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.DynamicAttribute_DynamicTable.toString(), identifiers);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacerequests.proxies.DynamicAttribute that = (interfacerequests.proxies.DynamicAttribute) obj;
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
		return "InterfaceRequests.DynamicAttribute";
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