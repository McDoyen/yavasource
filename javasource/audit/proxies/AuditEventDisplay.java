// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audit.proxies;

public class AuditEventDisplay
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject auditEventDisplayMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Audit.AuditEventDisplay";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		EventType("EventType"),
		EventDate("EventDate"),
		EventUser("EventUser"),
		Order("Order"),
		EventSource("EventSource"),
		EventSourceType("EventSourceType"),
		CreateOrder("CreateOrder"),
		EventDisplayGrid("EventDisplayGrid"),
		Key("Key"),
		AuditEventDisplay_AuditEvent("Audit.AuditEventDisplay_AuditEvent"),
		AuditEventDisplay_AuditRecordDisplay("Audit.AuditEventDisplay_AuditRecordDisplay"),
		AuditEventDisplay_ChildAuditRecord("Audit.AuditEventDisplay_ChildAuditRecord");

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

	public AuditEventDisplay(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Audit.AuditEventDisplay"));
	}

	protected AuditEventDisplay(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject auditEventDisplayMendixObject)
	{
		if (auditEventDisplayMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Audit.AuditEventDisplay", auditEventDisplayMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Audit.AuditEventDisplay");

		this.auditEventDisplayMendixObject = auditEventDisplayMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AuditEventDisplay.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static audit.proxies.AuditEventDisplay initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return audit.proxies.AuditEventDisplay.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static audit.proxies.AuditEventDisplay initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new audit.proxies.AuditEventDisplay(context, mendixObject);
	}

	public static audit.proxies.AuditEventDisplay load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return audit.proxies.AuditEventDisplay.initialize(context, mendixObject);
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
	 * @return value of EventUser
	 */
	public final java.lang.String getEventUser()
	{
		return getEventUser(getContext());
	}

	/**
	 * @param context
	 * @return value of EventUser
	 */
	public final java.lang.String getEventUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EventUser.toString());
	}

	/**
	 * Set value of EventUser
	 * @param eventuser
	 */
	public final void setEventUser(java.lang.String eventuser)
	{
		setEventUser(getContext(), eventuser);
	}

	/**
	 * Set value of EventUser
	 * @param context
	 * @param eventuser
	 */
	public final void setEventUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String eventuser)
	{
		getMendixObject().setValue(context, MemberNames.EventUser.toString(), eventuser);
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
	 * @return value of EventSource
	 */
	public final java.lang.String getEventSource()
	{
		return getEventSource(getContext());
	}

	/**
	 * @param context
	 * @return value of EventSource
	 */
	public final java.lang.String getEventSource(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EventSource.toString());
	}

	/**
	 * Set value of EventSource
	 * @param eventsource
	 */
	public final void setEventSource(java.lang.String eventsource)
	{
		setEventSource(getContext(), eventsource);
	}

	/**
	 * Set value of EventSource
	 * @param context
	 * @param eventsource
	 */
	public final void setEventSource(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String eventsource)
	{
		getMendixObject().setValue(context, MemberNames.EventSource.toString(), eventsource);
	}

	/**
	 * Set value of EventSourceType
	 * @param eventsourcetype
	 */
	public final audit.proxies.AuditDisplay_EventSourceType getEventSourceType()
	{
		return getEventSourceType(getContext());
	}

	/**
	 * @param context
	 * @return value of EventSourceType
	 */
	public final audit.proxies.AuditDisplay_EventSourceType getEventSourceType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.EventSourceType.toString());
		if (obj == null)
			return null;

		return audit.proxies.AuditDisplay_EventSourceType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of EventSourceType
	 * @param eventsourcetype
	 */
	public final void setEventSourceType(audit.proxies.AuditDisplay_EventSourceType eventsourcetype)
	{
		setEventSourceType(getContext(), eventsourcetype);
	}

	/**
	 * Set value of EventSourceType
	 * @param context
	 * @param eventsourcetype
	 */
	public final void setEventSourceType(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditDisplay_EventSourceType eventsourcetype)
	{
		if (eventsourcetype != null)
			getMendixObject().setValue(context, MemberNames.EventSourceType.toString(), eventsourcetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.EventSourceType.toString(), null);
	}

	/**
	 * @return value of CreateOrder
	 */
	public final java.lang.Integer getCreateOrder()
	{
		return getCreateOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of CreateOrder
	 */
	public final java.lang.Integer getCreateOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.CreateOrder.toString());
	}

	/**
	 * Set value of CreateOrder
	 * @param createorder
	 */
	public final void setCreateOrder(java.lang.Integer createorder)
	{
		setCreateOrder(getContext(), createorder);
	}

	/**
	 * Set value of CreateOrder
	 * @param context
	 * @param createorder
	 */
	public final void setCreateOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer createorder)
	{
		getMendixObject().setValue(context, MemberNames.CreateOrder.toString(), createorder);
	}

	/**
	 * Set value of EventDisplayGrid
	 * @param eventdisplaygrid
	 */
	public final audit.proxies.AuditDisplay_Grid getEventDisplayGrid()
	{
		return getEventDisplayGrid(getContext());
	}

	/**
	 * @param context
	 * @return value of EventDisplayGrid
	 */
	public final audit.proxies.AuditDisplay_Grid getEventDisplayGrid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.EventDisplayGrid.toString());
		if (obj == null)
			return null;

		return audit.proxies.AuditDisplay_Grid.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of EventDisplayGrid
	 * @param eventdisplaygrid
	 */
	public final void setEventDisplayGrid(audit.proxies.AuditDisplay_Grid eventdisplaygrid)
	{
		setEventDisplayGrid(getContext(), eventdisplaygrid);
	}

	/**
	 * Set value of EventDisplayGrid
	 * @param context
	 * @param eventdisplaygrid
	 */
	public final void setEventDisplayGrid(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditDisplay_Grid eventdisplaygrid)
	{
		if (eventdisplaygrid != null)
			getMendixObject().setValue(context, MemberNames.EventDisplayGrid.toString(), eventdisplaygrid.toString());
		else
			getMendixObject().setValue(context, MemberNames.EventDisplayGrid.toString(), null);
	}

	/**
	 * @return value of Key
	 */
	public final java.lang.String getKey()
	{
		return getKey(getContext());
	}

	/**
	 * @param context
	 * @return value of Key
	 */
	public final java.lang.String getKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Key.toString());
	}

	/**
	 * Set value of Key
	 * @param key
	 */
	public final void setKey(java.lang.String key)
	{
		setKey(getContext(), key);
	}

	/**
	 * Set value of Key
	 * @param context
	 * @param key
	 */
	public final void setKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String key)
	{
		getMendixObject().setValue(context, MemberNames.Key.toString(), key);
	}

	/**
	 * @return value of AuditEventDisplay_AuditEvent
	 */
	public final audit.proxies.AuditEvent getAuditEventDisplay_AuditEvent() throws com.mendix.core.CoreException
	{
		return getAuditEventDisplay_AuditEvent(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditEventDisplay_AuditEvent
	 */
	public final audit.proxies.AuditEvent getAuditEventDisplay_AuditEvent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditEvent result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditEventDisplay_AuditEvent.toString());
		if (identifier != null)
			result = audit.proxies.AuditEvent.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditEventDisplay_AuditEvent
	 * @param auditeventdisplay_auditevent
	 */
	public final void setAuditEventDisplay_AuditEvent(audit.proxies.AuditEvent auditeventdisplay_auditevent)
	{
		setAuditEventDisplay_AuditEvent(getContext(), auditeventdisplay_auditevent);
	}

	/**
	 * Set value of AuditEventDisplay_AuditEvent
	 * @param context
	 * @param auditeventdisplay_auditevent
	 */
	public final void setAuditEventDisplay_AuditEvent(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditEvent auditeventdisplay_auditevent)
	{
		if (auditeventdisplay_auditevent == null)
			getMendixObject().setValue(context, MemberNames.AuditEventDisplay_AuditEvent.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditEventDisplay_AuditEvent.toString(), auditeventdisplay_auditevent.getMendixObject().getId());
	}

	/**
	 * @return value of AuditEventDisplay_AuditRecordDisplay
	 */
	public final audit.proxies.AuditRecordDisplay getAuditEventDisplay_AuditRecordDisplay() throws com.mendix.core.CoreException
	{
		return getAuditEventDisplay_AuditRecordDisplay(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditEventDisplay_AuditRecordDisplay
	 */
	public final audit.proxies.AuditRecordDisplay getAuditEventDisplay_AuditRecordDisplay(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditRecordDisplay result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditEventDisplay_AuditRecordDisplay.toString());
		if (identifier != null)
			result = audit.proxies.AuditRecordDisplay.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditEventDisplay_AuditRecordDisplay
	 * @param auditeventdisplay_auditrecorddisplay
	 */
	public final void setAuditEventDisplay_AuditRecordDisplay(audit.proxies.AuditRecordDisplay auditeventdisplay_auditrecorddisplay)
	{
		setAuditEventDisplay_AuditRecordDisplay(getContext(), auditeventdisplay_auditrecorddisplay);
	}

	/**
	 * Set value of AuditEventDisplay_AuditRecordDisplay
	 * @param context
	 * @param auditeventdisplay_auditrecorddisplay
	 */
	public final void setAuditEventDisplay_AuditRecordDisplay(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditRecordDisplay auditeventdisplay_auditrecorddisplay)
	{
		if (auditeventdisplay_auditrecorddisplay == null)
			getMendixObject().setValue(context, MemberNames.AuditEventDisplay_AuditRecordDisplay.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditEventDisplay_AuditRecordDisplay.toString(), auditeventdisplay_auditrecorddisplay.getMendixObject().getId());
	}

	/**
	 * @return value of AuditEventDisplay_ChildAuditRecord
	 */
	public final audit.proxies.AuditRecord getAuditEventDisplay_ChildAuditRecord() throws com.mendix.core.CoreException
	{
		return getAuditEventDisplay_ChildAuditRecord(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditEventDisplay_ChildAuditRecord
	 */
	public final audit.proxies.AuditRecord getAuditEventDisplay_ChildAuditRecord(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditRecord result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditEventDisplay_ChildAuditRecord.toString());
		if (identifier != null)
			result = audit.proxies.AuditRecord.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditEventDisplay_ChildAuditRecord
	 * @param auditeventdisplay_childauditrecord
	 */
	public final void setAuditEventDisplay_ChildAuditRecord(audit.proxies.AuditRecord auditeventdisplay_childauditrecord)
	{
		setAuditEventDisplay_ChildAuditRecord(getContext(), auditeventdisplay_childauditrecord);
	}

	/**
	 * Set value of AuditEventDisplay_ChildAuditRecord
	 * @param context
	 * @param auditeventdisplay_childauditrecord
	 */
	public final void setAuditEventDisplay_ChildAuditRecord(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditRecord auditeventdisplay_childauditrecord)
	{
		if (auditeventdisplay_childauditrecord == null)
			getMendixObject().setValue(context, MemberNames.AuditEventDisplay_ChildAuditRecord.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditEventDisplay_ChildAuditRecord.toString(), auditeventdisplay_childauditrecord.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return auditEventDisplayMendixObject;
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
			final audit.proxies.AuditEventDisplay that = (audit.proxies.AuditEventDisplay) obj;
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
		return "Audit.AuditEventDisplay";
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
