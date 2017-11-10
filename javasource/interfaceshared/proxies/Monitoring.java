// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared.proxies;

public class Monitoring
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject monitoringMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceShared.Monitoring";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MessageID("MessageID"),
		MessageType("MessageType"),
		MessageDirection("MessageDirection"),
		EventDate("EventDate"),
		EventType("EventType"),
		EventDateString("EventDateString"),
		Monitoring_Attempt("InterfaceShared.Monitoring_Attempt"),
		Monitoring_Message("InterfaceShared.Monitoring_Message"),
		Monitoring_InterfaceConfiguration("InterfaceShared.Monitoring_InterfaceConfiguration"),
		Monitoring_LDAPInbox("InterfaceShared.Monitoring_LDAPInbox");

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

	public Monitoring(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceShared.Monitoring"));
	}

	protected Monitoring(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject monitoringMendixObject)
	{
		if (monitoringMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceShared.Monitoring", monitoringMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceShared.Monitoring");

		this.monitoringMendixObject = monitoringMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Monitoring.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceshared.proxies.Monitoring initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceshared.proxies.Monitoring.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceshared.proxies.Monitoring initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceshared.proxies.Monitoring(context, mendixObject);
	}

	public static interfaceshared.proxies.Monitoring load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceshared.proxies.Monitoring.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceshared.proxies.Monitoring> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceshared.proxies.Monitoring> result = new java.util.ArrayList<interfaceshared.proxies.Monitoring>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceShared.Monitoring" + xpathConstraint))
			result.add(interfaceshared.proxies.Monitoring.initialize(context, obj));
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
	 * @return value of MessageID
	 */
	public final java.lang.String getMessageID()
	{
		return getMessageID(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageID
	 */
	public final java.lang.String getMessageID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MessageID.toString());
	}

	/**
	 * Set value of MessageID
	 * @param messageid
	 */
	public final void setMessageID(java.lang.String messageid)
	{
		setMessageID(getContext(), messageid);
	}

	/**
	 * Set value of MessageID
	 * @param context
	 * @param messageid
	 */
	public final void setMessageID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String messageid)
	{
		getMendixObject().setValue(context, MemberNames.MessageID.toString(), messageid);
	}

	/**
	 * Set value of MessageType
	 * @param messagetype
	 */
	public final interfaceshared.proxies.MessageType getMessageType()
	{
		return getMessageType(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageType
	 */
	public final interfaceshared.proxies.MessageType getMessageType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.MessageType.toString());
		if (obj == null)
			return null;

		return interfaceshared.proxies.MessageType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of MessageType
	 * @param messagetype
	 */
	public final void setMessageType(interfaceshared.proxies.MessageType messagetype)
	{
		setMessageType(getContext(), messagetype);
	}

	/**
	 * Set value of MessageType
	 * @param context
	 * @param messagetype
	 */
	public final void setMessageType(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.MessageType messagetype)
	{
		if (messagetype != null)
			getMendixObject().setValue(context, MemberNames.MessageType.toString(), messagetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.MessageType.toString(), null);
	}

	/**
	 * Set value of MessageDirection
	 * @param messagedirection
	 */
	public final interfaceshared.proxies.MessageDirection getMessageDirection()
	{
		return getMessageDirection(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageDirection
	 */
	public final interfaceshared.proxies.MessageDirection getMessageDirection(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.MessageDirection.toString());
		if (obj == null)
			return null;

		return interfaceshared.proxies.MessageDirection.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of MessageDirection
	 * @param messagedirection
	 */
	public final void setMessageDirection(interfaceshared.proxies.MessageDirection messagedirection)
	{
		setMessageDirection(getContext(), messagedirection);
	}

	/**
	 * Set value of MessageDirection
	 * @param context
	 * @param messagedirection
	 */
	public final void setMessageDirection(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.MessageDirection messagedirection)
	{
		if (messagedirection != null)
			getMendixObject().setValue(context, MemberNames.MessageDirection.toString(), messagedirection.toString());
		else
			getMendixObject().setValue(context, MemberNames.MessageDirection.toString(), null);
	}

	/**
	 * @return value of EventDate
	 */
	public final java.util.Date getEventDate()
	{
		return getEventDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EventDate
	 */
	public final java.util.Date getEventDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EventDate.toString());
	}

	/**
	 * Set value of EventDate
	 * @param eventdate
	 */
	public final void setEventDate(java.util.Date eventdate)
	{
		setEventDate(getContext(), eventdate);
	}

	/**
	 * Set value of EventDate
	 * @param context
	 * @param eventdate
	 */
	public final void setEventDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date eventdate)
	{
		getMendixObject().setValue(context, MemberNames.EventDate.toString(), eventdate);
	}

	/**
	 * Set value of EventType
	 * @param eventtype
	 */
	public final interfaceshared.proxies.MonitoringEventType getEventType()
	{
		return getEventType(getContext());
	}

	/**
	 * @param context
	 * @return value of EventType
	 */
	public final interfaceshared.proxies.MonitoringEventType getEventType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.EventType.toString());
		if (obj == null)
			return null;

		return interfaceshared.proxies.MonitoringEventType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of EventType
	 * @param eventtype
	 */
	public final void setEventType(interfaceshared.proxies.MonitoringEventType eventtype)
	{
		setEventType(getContext(), eventtype);
	}

	/**
	 * Set value of EventType
	 * @param context
	 * @param eventtype
	 */
	public final void setEventType(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.MonitoringEventType eventtype)
	{
		if (eventtype != null)
			getMendixObject().setValue(context, MemberNames.EventType.toString(), eventtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.EventType.toString(), null);
	}

	/**
	 * @return value of EventDateString
	 */
	public final java.lang.String getEventDateString()
	{
		return getEventDateString(getContext());
	}

	/**
	 * @param context
	 * @return value of EventDateString
	 */
	public final java.lang.String getEventDateString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EventDateString.toString());
	}

	/**
	 * Set value of EventDateString
	 * @param eventdatestring
	 */
	public final void setEventDateString(java.lang.String eventdatestring)
	{
		setEventDateString(getContext(), eventdatestring);
	}

	/**
	 * Set value of EventDateString
	 * @param context
	 * @param eventdatestring
	 */
	public final void setEventDateString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String eventdatestring)
	{
		getMendixObject().setValue(context, MemberNames.EventDateString.toString(), eventdatestring);
	}

	/**
	 * @return value of Monitoring_Attempt
	 */
	public final interfaceshared.proxies.Attempt getMonitoring_Attempt() throws com.mendix.core.CoreException
	{
		return getMonitoring_Attempt(getContext());
	}

	/**
	 * @param context
	 * @return value of Monitoring_Attempt
	 */
	public final interfaceshared.proxies.Attempt getMonitoring_Attempt(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.Attempt result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Monitoring_Attempt.toString());
		if (identifier != null)
			result = interfaceshared.proxies.Attempt.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Monitoring_Attempt
	 * @param monitoring_attempt
	 */
	public final void setMonitoring_Attempt(interfaceshared.proxies.Attempt monitoring_attempt)
	{
		setMonitoring_Attempt(getContext(), monitoring_attempt);
	}

	/**
	 * Set value of Monitoring_Attempt
	 * @param context
	 * @param monitoring_attempt
	 */
	public final void setMonitoring_Attempt(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.Attempt monitoring_attempt)
	{
		if (monitoring_attempt == null)
			getMendixObject().setValue(context, MemberNames.Monitoring_Attempt.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Monitoring_Attempt.toString(), monitoring_attempt.getMendixObject().getId());
	}

	/**
	 * @return value of Monitoring_Message
	 */
	public final interfaceshared.proxies.Message getMonitoring_Message() throws com.mendix.core.CoreException
	{
		return getMonitoring_Message(getContext());
	}

	/**
	 * @param context
	 * @return value of Monitoring_Message
	 */
	public final interfaceshared.proxies.Message getMonitoring_Message(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.Message result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Monitoring_Message.toString());
		if (identifier != null)
			result = interfaceshared.proxies.Message.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Monitoring_Message
	 * @param monitoring_message
	 */
	public final void setMonitoring_Message(interfaceshared.proxies.Message monitoring_message)
	{
		setMonitoring_Message(getContext(), monitoring_message);
	}

	/**
	 * Set value of Monitoring_Message
	 * @param context
	 * @param monitoring_message
	 */
	public final void setMonitoring_Message(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.Message monitoring_message)
	{
		if (monitoring_message == null)
			getMendixObject().setValue(context, MemberNames.Monitoring_Message.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Monitoring_Message.toString(), monitoring_message.getMendixObject().getId());
	}

	/**
	 * @return value of Monitoring_InterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceConfiguration getMonitoring_InterfaceConfiguration() throws com.mendix.core.CoreException
	{
		return getMonitoring_InterfaceConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of Monitoring_InterfaceConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceConfiguration getMonitoring_InterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.InterfaceConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Monitoring_InterfaceConfiguration.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.InterfaceConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Monitoring_InterfaceConfiguration
	 * @param monitoring_interfaceconfiguration
	 */
	public final void setMonitoring_InterfaceConfiguration(interfaceconfiguration.proxies.InterfaceConfiguration monitoring_interfaceconfiguration)
	{
		setMonitoring_InterfaceConfiguration(getContext(), monitoring_interfaceconfiguration);
	}

	/**
	 * Set value of Monitoring_InterfaceConfiguration
	 * @param context
	 * @param monitoring_interfaceconfiguration
	 */
	public final void setMonitoring_InterfaceConfiguration(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.InterfaceConfiguration monitoring_interfaceconfiguration)
	{
		if (monitoring_interfaceconfiguration == null)
			getMendixObject().setValue(context, MemberNames.Monitoring_InterfaceConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Monitoring_InterfaceConfiguration.toString(), monitoring_interfaceconfiguration.getMendixObject().getId());
	}

	/**
	 * @return value of Monitoring_LDAPInbox
	 */
	public final interfaceldap.proxies.LDAPInbox getMonitoring_LDAPInbox() throws com.mendix.core.CoreException
	{
		return getMonitoring_LDAPInbox(getContext());
	}

	/**
	 * @param context
	 * @return value of Monitoring_LDAPInbox
	 */
	public final interfaceldap.proxies.LDAPInbox getMonitoring_LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceldap.proxies.LDAPInbox result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Monitoring_LDAPInbox.toString());
		if (identifier != null)
			result = interfaceldap.proxies.LDAPInbox.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Monitoring_LDAPInbox
	 * @param monitoring_ldapinbox
	 */
	public final void setMonitoring_LDAPInbox(interfaceldap.proxies.LDAPInbox monitoring_ldapinbox)
	{
		setMonitoring_LDAPInbox(getContext(), monitoring_ldapinbox);
	}

	/**
	 * Set value of Monitoring_LDAPInbox
	 * @param context
	 * @param monitoring_ldapinbox
	 */
	public final void setMonitoring_LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context, interfaceldap.proxies.LDAPInbox monitoring_ldapinbox)
	{
		if (monitoring_ldapinbox == null)
			getMendixObject().setValue(context, MemberNames.Monitoring_LDAPInbox.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Monitoring_LDAPInbox.toString(), monitoring_ldapinbox.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return monitoringMendixObject;
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
			final interfaceshared.proxies.Monitoring that = (interfaceshared.proxies.Monitoring) obj;
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
		return "InterfaceShared.Monitoring";
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