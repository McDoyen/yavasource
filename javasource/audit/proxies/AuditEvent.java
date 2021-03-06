// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audit.proxies;

public class AuditEvent
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject auditEventMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Audit.AuditEvent";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		EventDate("EventDate"),
		EventType("EventType"),
		Order("Order"),
		IsLast("IsLast"),
		HistoricPersonKey("HistoricPersonKey"),
		HistoricUserKey("HistoricUserKey"),
		MendixID("MendixID"),
		EventID("EventID"),
		AuditEvent_AuditRecord("Audit.AuditEvent_AuditRecord"),
		AuditEvent_User("Audit.AuditEvent_User"),
		AuditEvent_Person("Audit.AuditEvent_Person");

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

	public AuditEvent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Audit.AuditEvent"));
	}

	protected AuditEvent(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject auditEventMendixObject)
	{
		if (auditEventMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Audit.AuditEvent", auditEventMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Audit.AuditEvent");

		this.auditEventMendixObject = auditEventMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AuditEvent.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static audit.proxies.AuditEvent initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return audit.proxies.AuditEvent.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static audit.proxies.AuditEvent initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new audit.proxies.AuditEvent(context, mendixObject);
	}

	public static audit.proxies.AuditEvent load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return audit.proxies.AuditEvent.initialize(context, mendixObject);
	}

	public static java.util.List<audit.proxies.AuditEvent> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<audit.proxies.AuditEvent> result = new java.util.ArrayList<audit.proxies.AuditEvent>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Audit.AuditEvent" + xpathConstraint))
			result.add(audit.proxies.AuditEvent.initialize(context, obj));
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
	public final audit.proxies.EventTypeEnum getEventType()
	{
		return getEventType(getContext());
	}

	/**
	 * @param context
	 * @return value of EventType
	 */
	public final audit.proxies.EventTypeEnum getEventType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.EventType.toString());
		if (obj == null)
			return null;

		return audit.proxies.EventTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of EventType
	 * @param eventtype
	 */
	public final void setEventType(audit.proxies.EventTypeEnum eventtype)
	{
		setEventType(getContext(), eventtype);
	}

	/**
	 * Set value of EventType
	 * @param context
	 * @param eventtype
	 */
	public final void setEventType(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.EventTypeEnum eventtype)
	{
		if (eventtype != null)
			getMendixObject().setValue(context, MemberNames.EventType.toString(), eventtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.EventType.toString(), null);
	}

	/**
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder()
	{
		return getOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Order.toString());
	}

	/**
	 * Set value of Order
	 * @param order
	 */
	public final void setOrder(java.lang.Integer order)
	{
		setOrder(getContext(), order);
	}

	/**
	 * Set value of Order
	 * @param context
	 * @param order
	 */
	public final void setOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer order)
	{
		getMendixObject().setValue(context, MemberNames.Order.toString(), order);
	}

	/**
	 * @return value of IsLast
	 */
	public final java.lang.Boolean getIsLast()
	{
		return getIsLast(getContext());
	}

	/**
	 * @param context
	 * @return value of IsLast
	 */
	public final java.lang.Boolean getIsLast(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsLast.toString());
	}

	/**
	 * Set value of IsLast
	 * @param islast
	 */
	public final void setIsLast(java.lang.Boolean islast)
	{
		setIsLast(getContext(), islast);
	}

	/**
	 * Set value of IsLast
	 * @param context
	 * @param islast
	 */
	public final void setIsLast(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean islast)
	{
		getMendixObject().setValue(context, MemberNames.IsLast.toString(), islast);
	}

	/**
	 * @return value of HistoricPersonKey
	 */
	public final java.lang.String getHistoricPersonKey()
	{
		return getHistoricPersonKey(getContext());
	}

	/**
	 * @param context
	 * @return value of HistoricPersonKey
	 */
	public final java.lang.String getHistoricPersonKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HistoricPersonKey.toString());
	}

	/**
	 * Set value of HistoricPersonKey
	 * @param historicpersonkey
	 */
	public final void setHistoricPersonKey(java.lang.String historicpersonkey)
	{
		setHistoricPersonKey(getContext(), historicpersonkey);
	}

	/**
	 * Set value of HistoricPersonKey
	 * @param context
	 * @param historicpersonkey
	 */
	public final void setHistoricPersonKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String historicpersonkey)
	{
		getMendixObject().setValue(context, MemberNames.HistoricPersonKey.toString(), historicpersonkey);
	}

	/**
	 * @return value of HistoricUserKey
	 */
	public final java.lang.String getHistoricUserKey()
	{
		return getHistoricUserKey(getContext());
	}

	/**
	 * @param context
	 * @return value of HistoricUserKey
	 */
	public final java.lang.String getHistoricUserKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HistoricUserKey.toString());
	}

	/**
	 * Set value of HistoricUserKey
	 * @param historicuserkey
	 */
	public final void setHistoricUserKey(java.lang.String historicuserkey)
	{
		setHistoricUserKey(getContext(), historicuserkey);
	}

	/**
	 * Set value of HistoricUserKey
	 * @param context
	 * @param historicuserkey
	 */
	public final void setHistoricUserKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String historicuserkey)
	{
		getMendixObject().setValue(context, MemberNames.HistoricUserKey.toString(), historicuserkey);
	}

	/**
	 * @return value of MendixID
	 */
	public final java.lang.Long getMendixID()
	{
		return getMendixID(getContext());
	}

	/**
	 * @param context
	 * @return value of MendixID
	 */
	public final java.lang.Long getMendixID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MendixID.toString());
	}

	/**
	 * Set value of MendixID
	 * @param mendixid
	 */
	public final void setMendixID(java.lang.Long mendixid)
	{
		setMendixID(getContext(), mendixid);
	}

	/**
	 * Set value of MendixID
	 * @param context
	 * @param mendixid
	 */
	public final void setMendixID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long mendixid)
	{
		getMendixObject().setValue(context, MemberNames.MendixID.toString(), mendixid);
	}

	/**
	 * @return value of EventID
	 */
	public final java.lang.Long getEventID()
	{
		return getEventID(getContext());
	}

	/**
	 * @param context
	 * @return value of EventID
	 */
	public final java.lang.Long getEventID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.EventID.toString());
	}

	/**
	 * Set value of EventID
	 * @param eventid
	 */
	public final void setEventID(java.lang.Long eventid)
	{
		setEventID(getContext(), eventid);
	}

	/**
	 * Set value of EventID
	 * @param context
	 * @param eventid
	 */
	public final void setEventID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long eventid)
	{
		getMendixObject().setValue(context, MemberNames.EventID.toString(), eventid);
	}

	/**
	 * @return value of AuditEvent_AuditRecord
	 */
	public final audit.proxies.AuditRecord getAuditEvent_AuditRecord() throws com.mendix.core.CoreException
	{
		return getAuditEvent_AuditRecord(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditEvent_AuditRecord
	 */
	public final audit.proxies.AuditRecord getAuditEvent_AuditRecord(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditRecord result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditEvent_AuditRecord.toString());
		if (identifier != null)
			result = audit.proxies.AuditRecord.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditEvent_AuditRecord
	 * @param auditevent_auditrecord
	 */
	public final void setAuditEvent_AuditRecord(audit.proxies.AuditRecord auditevent_auditrecord)
	{
		setAuditEvent_AuditRecord(getContext(), auditevent_auditrecord);
	}

	/**
	 * Set value of AuditEvent_AuditRecord
	 * @param context
	 * @param auditevent_auditrecord
	 */
	public final void setAuditEvent_AuditRecord(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditRecord auditevent_auditrecord)
	{
		if (auditevent_auditrecord == null)
			getMendixObject().setValue(context, MemberNames.AuditEvent_AuditRecord.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditEvent_AuditRecord.toString(), auditevent_auditrecord.getMendixObject().getId());
	}

	/**
	 * @return value of AuditEvent_User
	 */
	public final system.proxies.User getAuditEvent_User() throws com.mendix.core.CoreException
	{
		return getAuditEvent_User(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditEvent_User
	 */
	public final system.proxies.User getAuditEvent_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditEvent_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditEvent_User
	 * @param auditevent_user
	 */
	public final void setAuditEvent_User(system.proxies.User auditevent_user)
	{
		setAuditEvent_User(getContext(), auditevent_user);
	}

	/**
	 * Set value of AuditEvent_User
	 * @param context
	 * @param auditevent_user
	 */
	public final void setAuditEvent_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User auditevent_user)
	{
		if (auditevent_user == null)
			getMendixObject().setValue(context, MemberNames.AuditEvent_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditEvent_User.toString(), auditevent_user.getMendixObject().getId());
	}

	/**
	 * @return value of AuditEvent_Person
	 */
	public final nap.proxies.Person getAuditEvent_Person() throws com.mendix.core.CoreException
	{
		return getAuditEvent_Person(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditEvent_Person
	 */
	public final nap.proxies.Person getAuditEvent_Person(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditEvent_Person.toString());
		if (identifier != null)
			result = nap.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditEvent_Person
	 * @param auditevent_person
	 */
	public final void setAuditEvent_Person(nap.proxies.Person auditevent_person)
	{
		setAuditEvent_Person(getContext(), auditevent_person);
	}

	/**
	 * Set value of AuditEvent_Person
	 * @param context
	 * @param auditevent_person
	 */
	public final void setAuditEvent_Person(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Person auditevent_person)
	{
		if (auditevent_person == null)
			getMendixObject().setValue(context, MemberNames.AuditEvent_Person.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditEvent_Person.toString(), auditevent_person.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return auditEventMendixObject;
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
			final audit.proxies.AuditEvent that = (audit.proxies.AuditEvent) obj;
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
		return "Audit.AuditEvent";
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
