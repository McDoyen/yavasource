// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audit.proxies;

public class AuditAttribute
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject auditAttributeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Audit.AuditAttribute";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AttributeName("AttributeName"),
		FromDate("FromDate"),
		ToDate("ToDate"),
		AttributeType("AttributeType"),
		IsLast("IsLast"),
		Value("Value"),
		OldValue("OldValue"),
		StringValue("StringValue"),
		DateTimeValue("DateTimeValue"),
		LongValue("LongValue"),
		FloatValue("FloatValue"),
		DecimalValue("DecimalValue"),
		IsNull("IsNull"),
		MendixID("MendixID"),
		FromEventID("FromEventID"),
		ToEventID("ToEventID"),
		AuditAttribute_FromAuditEvent("Audit.AuditAttribute_FromAuditEvent"),
		AuditAttribute_AuditRecord("Audit.AuditAttribute_AuditRecord"),
		AuditFileDocument_AuditAttribute("Audit.AuditFileDocument_AuditAttribute"),
		AuditAttribute_ToAuditEvent("Audit.AuditAttribute_ToAuditEvent");

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

	public AuditAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Audit.AuditAttribute"));
	}

	protected AuditAttribute(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject auditAttributeMendixObject)
	{
		if (auditAttributeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Audit.AuditAttribute", auditAttributeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Audit.AuditAttribute");

		this.auditAttributeMendixObject = auditAttributeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AuditAttribute.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static audit.proxies.AuditAttribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return audit.proxies.AuditAttribute.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static audit.proxies.AuditAttribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new audit.proxies.AuditAttribute(context, mendixObject);
	}

	public static audit.proxies.AuditAttribute load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return audit.proxies.AuditAttribute.initialize(context, mendixObject);
	}

	public static java.util.List<audit.proxies.AuditAttribute> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<audit.proxies.AuditAttribute> result = new java.util.ArrayList<audit.proxies.AuditAttribute>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Audit.AuditAttribute" + xpathConstraint))
			result.add(audit.proxies.AuditAttribute.initialize(context, obj));
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
	 * @return value of AttributeName
	 */
	public final java.lang.String getAttributeName()
	{
		return getAttributeName(getContext());
	}

	/**
	 * @param context
	 * @return value of AttributeName
	 */
	public final java.lang.String getAttributeName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AttributeName.toString());
	}

	/**
	 * Set value of AttributeName
	 * @param attributename
	 */
	public final void setAttributeName(java.lang.String attributename)
	{
		setAttributeName(getContext(), attributename);
	}

	/**
	 * Set value of AttributeName
	 * @param context
	 * @param attributename
	 */
	public final void setAttributeName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attributename)
	{
		getMendixObject().setValue(context, MemberNames.AttributeName.toString(), attributename);
	}

	/**
	 * @return value of FromDate
	 */
	public final java.util.Date getFromDate()
	{
		return getFromDate(getContext());
	}

	/**
	 * @param context
	 * @return value of FromDate
	 */
	public final java.util.Date getFromDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.FromDate.toString());
	}

	/**
	 * Set value of FromDate
	 * @param fromdate
	 */
	public final void setFromDate(java.util.Date fromdate)
	{
		setFromDate(getContext(), fromdate);
	}

	/**
	 * Set value of FromDate
	 * @param context
	 * @param fromdate
	 */
	public final void setFromDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date fromdate)
	{
		getMendixObject().setValue(context, MemberNames.FromDate.toString(), fromdate);
	}

	/**
	 * @return value of ToDate
	 */
	public final java.util.Date getToDate()
	{
		return getToDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ToDate
	 */
	public final java.util.Date getToDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ToDate.toString());
	}

	/**
	 * Set value of ToDate
	 * @param todate
	 */
	public final void setToDate(java.util.Date todate)
	{
		setToDate(getContext(), todate);
	}

	/**
	 * Set value of ToDate
	 * @param context
	 * @param todate
	 */
	public final void setToDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date todate)
	{
		getMendixObject().setValue(context, MemberNames.ToDate.toString(), todate);
	}

	/**
	 * Set value of AttributeType
	 * @param attributetype
	 */
	public final audit.proxies.AttributeTypeEnum getAttributeType()
	{
		return getAttributeType(getContext());
	}

	/**
	 * @param context
	 * @return value of AttributeType
	 */
	public final audit.proxies.AttributeTypeEnum getAttributeType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AttributeType.toString());
		if (obj == null)
			return null;

		return audit.proxies.AttributeTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AttributeType
	 * @param attributetype
	 */
	public final void setAttributeType(audit.proxies.AttributeTypeEnum attributetype)
	{
		setAttributeType(getContext(), attributetype);
	}

	/**
	 * Set value of AttributeType
	 * @param context
	 * @param attributetype
	 */
	public final void setAttributeType(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AttributeTypeEnum attributetype)
	{
		if (attributetype != null)
			getMendixObject().setValue(context, MemberNames.AttributeType.toString(), attributetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.AttributeType.toString(), null);
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
	 * @return value of OldValue
	 */
	public final java.lang.String getOldValue()
	{
		return getOldValue(getContext());
	}

	/**
	 * @param context
	 * @return value of OldValue
	 */
	public final java.lang.String getOldValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OldValue.toString());
	}

	/**
	 * Set value of OldValue
	 * @param oldvalue
	 */
	public final void setOldValue(java.lang.String oldvalue)
	{
		setOldValue(getContext(), oldvalue);
	}

	/**
	 * Set value of OldValue
	 * @param context
	 * @param oldvalue
	 */
	public final void setOldValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String oldvalue)
	{
		getMendixObject().setValue(context, MemberNames.OldValue.toString(), oldvalue);
	}

	/**
	 * @return value of StringValue
	 */
	public final java.lang.String getStringValue()
	{
		return getStringValue(getContext());
	}

	/**
	 * @param context
	 * @return value of StringValue
	 */
	public final java.lang.String getStringValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StringValue.toString());
	}

	/**
	 * Set value of StringValue
	 * @param stringvalue
	 */
	public final void setStringValue(java.lang.String stringvalue)
	{
		setStringValue(getContext(), stringvalue);
	}

	/**
	 * Set value of StringValue
	 * @param context
	 * @param stringvalue
	 */
	public final void setStringValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String stringvalue)
	{
		getMendixObject().setValue(context, MemberNames.StringValue.toString(), stringvalue);
	}

	/**
	 * @return value of DateTimeValue
	 */
	public final java.util.Date getDateTimeValue()
	{
		return getDateTimeValue(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeValue
	 */
	public final java.util.Date getDateTimeValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateTimeValue.toString());
	}

	/**
	 * Set value of DateTimeValue
	 * @param datetimevalue
	 */
	public final void setDateTimeValue(java.util.Date datetimevalue)
	{
		setDateTimeValue(getContext(), datetimevalue);
	}

	/**
	 * Set value of DateTimeValue
	 * @param context
	 * @param datetimevalue
	 */
	public final void setDateTimeValue(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date datetimevalue)
	{
		getMendixObject().setValue(context, MemberNames.DateTimeValue.toString(), datetimevalue);
	}

	/**
	 * @return value of LongValue
	 */
	public final java.lang.Long getLongValue()
	{
		return getLongValue(getContext());
	}

	/**
	 * @param context
	 * @return value of LongValue
	 */
	public final java.lang.Long getLongValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.LongValue.toString());
	}

	/**
	 * Set value of LongValue
	 * @param longvalue
	 */
	public final void setLongValue(java.lang.Long longvalue)
	{
		setLongValue(getContext(), longvalue);
	}

	/**
	 * Set value of LongValue
	 * @param context
	 * @param longvalue
	 */
	public final void setLongValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long longvalue)
	{
		getMendixObject().setValue(context, MemberNames.LongValue.toString(), longvalue);
	}

	/**
	 * @return value of FloatValue
	 */
	public final java.lang.Double getFloatValue()
	{
		return getFloatValue(getContext());
	}

	/**
	 * @param context
	 * @return value of FloatValue
	 */
	public final java.lang.Double getFloatValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.FloatValue.toString());
	}

	/**
	 * Set value of FloatValue
	 * @param floatvalue
	 */
	public final void setFloatValue(java.lang.Double floatvalue)
	{
		setFloatValue(getContext(), floatvalue);
	}

	/**
	 * Set value of FloatValue
	 * @param context
	 * @param floatvalue
	 */
	public final void setFloatValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double floatvalue)
	{
		getMendixObject().setValue(context, MemberNames.FloatValue.toString(), floatvalue);
	}

	/**
	 * @return value of DecimalValue
	 */
	public final java.math.BigDecimal getDecimalValue()
	{
		return getDecimalValue(getContext());
	}

	/**
	 * @param context
	 * @return value of DecimalValue
	 */
	public final java.math.BigDecimal getDecimalValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.DecimalValue.toString());
	}

	/**
	 * Set value of DecimalValue
	 * @param decimalvalue
	 */
	public final void setDecimalValue(java.math.BigDecimal decimalvalue)
	{
		setDecimalValue(getContext(), decimalvalue);
	}

	/**
	 * Set value of DecimalValue
	 * @param context
	 * @param decimalvalue
	 */
	public final void setDecimalValue(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal decimalvalue)
	{
		getMendixObject().setValue(context, MemberNames.DecimalValue.toString(), decimalvalue);
	}

	/**
	 * @return value of IsNull
	 */
	public final java.lang.Boolean getIsNull()
	{
		return getIsNull(getContext());
	}

	/**
	 * @param context
	 * @return value of IsNull
	 */
	public final java.lang.Boolean getIsNull(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsNull.toString());
	}

	/**
	 * Set value of IsNull
	 * @param isnull
	 */
	public final void setIsNull(java.lang.Boolean isnull)
	{
		setIsNull(getContext(), isnull);
	}

	/**
	 * Set value of IsNull
	 * @param context
	 * @param isnull
	 */
	public final void setIsNull(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isnull)
	{
		getMendixObject().setValue(context, MemberNames.IsNull.toString(), isnull);
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
	 * @return value of FromEventID
	 */
	public final java.lang.Long getFromEventID()
	{
		return getFromEventID(getContext());
	}

	/**
	 * @param context
	 * @return value of FromEventID
	 */
	public final java.lang.Long getFromEventID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.FromEventID.toString());
	}

	/**
	 * Set value of FromEventID
	 * @param fromeventid
	 */
	public final void setFromEventID(java.lang.Long fromeventid)
	{
		setFromEventID(getContext(), fromeventid);
	}

	/**
	 * Set value of FromEventID
	 * @param context
	 * @param fromeventid
	 */
	public final void setFromEventID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long fromeventid)
	{
		getMendixObject().setValue(context, MemberNames.FromEventID.toString(), fromeventid);
	}

	/**
	 * @return value of ToEventID
	 */
	public final java.lang.Long getToEventID()
	{
		return getToEventID(getContext());
	}

	/**
	 * @param context
	 * @return value of ToEventID
	 */
	public final java.lang.Long getToEventID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ToEventID.toString());
	}

	/**
	 * Set value of ToEventID
	 * @param toeventid
	 */
	public final void setToEventID(java.lang.Long toeventid)
	{
		setToEventID(getContext(), toeventid);
	}

	/**
	 * Set value of ToEventID
	 * @param context
	 * @param toeventid
	 */
	public final void setToEventID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long toeventid)
	{
		getMendixObject().setValue(context, MemberNames.ToEventID.toString(), toeventid);
	}

	/**
	 * @return value of AuditAttribute_FromAuditEvent
	 */
	public final audit.proxies.AuditEvent getAuditAttribute_FromAuditEvent() throws com.mendix.core.CoreException
	{
		return getAuditAttribute_FromAuditEvent(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditAttribute_FromAuditEvent
	 */
	public final audit.proxies.AuditEvent getAuditAttribute_FromAuditEvent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditEvent result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditAttribute_FromAuditEvent.toString());
		if (identifier != null)
			result = audit.proxies.AuditEvent.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditAttribute_FromAuditEvent
	 * @param auditattribute_fromauditevent
	 */
	public final void setAuditAttribute_FromAuditEvent(audit.proxies.AuditEvent auditattribute_fromauditevent)
	{
		setAuditAttribute_FromAuditEvent(getContext(), auditattribute_fromauditevent);
	}

	/**
	 * Set value of AuditAttribute_FromAuditEvent
	 * @param context
	 * @param auditattribute_fromauditevent
	 */
	public final void setAuditAttribute_FromAuditEvent(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditEvent auditattribute_fromauditevent)
	{
		if (auditattribute_fromauditevent == null)
			getMendixObject().setValue(context, MemberNames.AuditAttribute_FromAuditEvent.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditAttribute_FromAuditEvent.toString(), auditattribute_fromauditevent.getMendixObject().getId());
	}

	/**
	 * @return value of AuditAttribute_AuditRecord
	 */
	public final audit.proxies.AuditRecord getAuditAttribute_AuditRecord() throws com.mendix.core.CoreException
	{
		return getAuditAttribute_AuditRecord(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditAttribute_AuditRecord
	 */
	public final audit.proxies.AuditRecord getAuditAttribute_AuditRecord(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditRecord result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditAttribute_AuditRecord.toString());
		if (identifier != null)
			result = audit.proxies.AuditRecord.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditAttribute_AuditRecord
	 * @param auditattribute_auditrecord
	 */
	public final void setAuditAttribute_AuditRecord(audit.proxies.AuditRecord auditattribute_auditrecord)
	{
		setAuditAttribute_AuditRecord(getContext(), auditattribute_auditrecord);
	}

	/**
	 * Set value of AuditAttribute_AuditRecord
	 * @param context
	 * @param auditattribute_auditrecord
	 */
	public final void setAuditAttribute_AuditRecord(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditRecord auditattribute_auditrecord)
	{
		if (auditattribute_auditrecord == null)
			getMendixObject().setValue(context, MemberNames.AuditAttribute_AuditRecord.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditAttribute_AuditRecord.toString(), auditattribute_auditrecord.getMendixObject().getId());
	}

	/**
	 * @return value of AuditFileDocument_AuditAttribute
	 */
	public final audit.proxies.AuditFileDocument getAuditFileDocument_AuditAttribute() throws com.mendix.core.CoreException
	{
		return getAuditFileDocument_AuditAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditFileDocument_AuditAttribute
	 */
	public final audit.proxies.AuditFileDocument getAuditFileDocument_AuditAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditFileDocument result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditFileDocument_AuditAttribute.toString());
		if (identifier != null)
			result = audit.proxies.AuditFileDocument.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditFileDocument_AuditAttribute
	 * @param auditfiledocument_auditattribute
	 */
	public final void setAuditFileDocument_AuditAttribute(audit.proxies.AuditFileDocument auditfiledocument_auditattribute)
	{
		setAuditFileDocument_AuditAttribute(getContext(), auditfiledocument_auditattribute);
	}

	/**
	 * Set value of AuditFileDocument_AuditAttribute
	 * @param context
	 * @param auditfiledocument_auditattribute
	 */
	public final void setAuditFileDocument_AuditAttribute(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditFileDocument auditfiledocument_auditattribute)
	{
		if (auditfiledocument_auditattribute == null)
			getMendixObject().setValue(context, MemberNames.AuditFileDocument_AuditAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditFileDocument_AuditAttribute.toString(), auditfiledocument_auditattribute.getMendixObject().getId());
	}

	/**
	 * @return value of AuditAttribute_ToAuditEvent
	 */
	public final audit.proxies.AuditEvent getAuditAttribute_ToAuditEvent() throws com.mendix.core.CoreException
	{
		return getAuditAttribute_ToAuditEvent(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditAttribute_ToAuditEvent
	 */
	public final audit.proxies.AuditEvent getAuditAttribute_ToAuditEvent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditEvent result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditAttribute_ToAuditEvent.toString());
		if (identifier != null)
			result = audit.proxies.AuditEvent.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditAttribute_ToAuditEvent
	 * @param auditattribute_toauditevent
	 */
	public final void setAuditAttribute_ToAuditEvent(audit.proxies.AuditEvent auditattribute_toauditevent)
	{
		setAuditAttribute_ToAuditEvent(getContext(), auditattribute_toauditevent);
	}

	/**
	 * Set value of AuditAttribute_ToAuditEvent
	 * @param context
	 * @param auditattribute_toauditevent
	 */
	public final void setAuditAttribute_ToAuditEvent(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditEvent auditattribute_toauditevent)
	{
		if (auditattribute_toauditevent == null)
			getMendixObject().setValue(context, MemberNames.AuditAttribute_ToAuditEvent.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditAttribute_ToAuditEvent.toString(), auditattribute_toauditevent.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return auditAttributeMendixObject;
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
			final audit.proxies.AuditAttribute that = (audit.proxies.AuditAttribute) obj;
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
		return "Audit.AuditAttribute";
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
