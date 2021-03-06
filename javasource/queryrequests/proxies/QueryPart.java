// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package queryrequests.proxies;

/**
 * SprintR 1172370: Enable filters based on relative time period (new attribute RelativeTimePeriod)
 * 
 * 1090793: Custom timeframe past or future <x> days/weeks/months
 */
public class QueryPart
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject queryPartMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QueryRequests.QueryPart";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Value("Value"),
		Value_Int("Value_Int"),
		Value_DateTime("Value_DateTime"),
		Value_Boolean("Value_Boolean"),
		TypeReference("TypeReference"),
		ReferenceOrEnum("ReferenceOrEnum"),
		Order("Order"),
		UseCode("UseCode"),
		DateTimeCode("DateTimeCode"),
		QueryType("QueryType"),
		Backup("Backup"),
		ObjectID("ObjectID"),
		Operator("Operator"),
		UpdateReferencedField("UpdateReferencedField"),
		Valid("Valid"),
		RelativeTimePeriod("RelativeTimePeriod"),
		RelativeTimePeriodOffsetAmount("RelativeTimePeriodOffsetAmount"),
		RelativeTimePeriodOffsetUnit("RelativeTimePeriodOffsetUnit"),
		RelativeTimeFramePastOrFuture("RelativeTimeFramePastOrFuture"),
		QueryPart_Query("QueryRequests.QueryPart_Query"),
		QueryPart_SelectableField("QueryRequests.QueryPart_SelectableField"),
		QueryPart_OperatorForField("QueryRequests.QueryPart_OperatorForField"),
		TEMPQueryPart_OperatorForField("QueryRequests.TEMPQueryPart_OperatorForField");

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

	public QueryPart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "QueryRequests.QueryPart"));
	}

	protected QueryPart(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject queryPartMendixObject)
	{
		if (queryPartMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("QueryRequests.QueryPart", queryPartMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a QueryRequests.QueryPart");

		this.queryPartMendixObject = queryPartMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'QueryPart.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static queryrequests.proxies.QueryPart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return queryrequests.proxies.QueryPart.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static queryrequests.proxies.QueryPart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new queryrequests.proxies.QueryPart(context, mendixObject);
	}

	public static queryrequests.proxies.QueryPart load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return queryrequests.proxies.QueryPart.initialize(context, mendixObject);
	}

	public static java.util.List<queryrequests.proxies.QueryPart> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<queryrequests.proxies.QueryPart> result = new java.util.ArrayList<queryrequests.proxies.QueryPart>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//QueryRequests.QueryPart" + xpathConstraint))
			result.add(queryrequests.proxies.QueryPart.initialize(context, obj));
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
	 * @return value of Value_Int
	 */
	public final java.lang.Integer getValue_Int()
	{
		return getValue_Int(getContext());
	}

	/**
	 * @param context
	 * @return value of Value_Int
	 */
	public final java.lang.Integer getValue_Int(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Value_Int.toString());
	}

	/**
	 * Set value of Value_Int
	 * @param value_int
	 */
	public final void setValue_Int(java.lang.Integer value_int)
	{
		setValue_Int(getContext(), value_int);
	}

	/**
	 * Set value of Value_Int
	 * @param context
	 * @param value_int
	 */
	public final void setValue_Int(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer value_int)
	{
		getMendixObject().setValue(context, MemberNames.Value_Int.toString(), value_int);
	}

	/**
	 * @return value of Value_DateTime
	 */
	public final java.util.Date getValue_DateTime()
	{
		return getValue_DateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of Value_DateTime
	 */
	public final java.util.Date getValue_DateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Value_DateTime.toString());
	}

	/**
	 * Set value of Value_DateTime
	 * @param value_datetime
	 */
	public final void setValue_DateTime(java.util.Date value_datetime)
	{
		setValue_DateTime(getContext(), value_datetime);
	}

	/**
	 * Set value of Value_DateTime
	 * @param context
	 * @param value_datetime
	 */
	public final void setValue_DateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date value_datetime)
	{
		getMendixObject().setValue(context, MemberNames.Value_DateTime.toString(), value_datetime);
	}

	/**
	 * @return value of Value_Boolean
	 */
	public final java.lang.Boolean getValue_Boolean()
	{
		return getValue_Boolean(getContext());
	}

	/**
	 * @param context
	 * @return value of Value_Boolean
	 */
	public final java.lang.Boolean getValue_Boolean(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Value_Boolean.toString());
	}

	/**
	 * Set value of Value_Boolean
	 * @param value_boolean
	 */
	public final void setValue_Boolean(java.lang.Boolean value_boolean)
	{
		setValue_Boolean(getContext(), value_boolean);
	}

	/**
	 * Set value of Value_Boolean
	 * @param context
	 * @param value_boolean
	 */
	public final void setValue_Boolean(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean value_boolean)
	{
		getMendixObject().setValue(context, MemberNames.Value_Boolean.toString(), value_boolean);
	}

	/**
	 * Set value of TypeReference
	 * @param typereference
	 */
	public final metamodel.proxies.PrimitiveTypeEnum getTypeReference()
	{
		return getTypeReference(getContext());
	}

	/**
	 * @param context
	 * @return value of TypeReference
	 */
	public final metamodel.proxies.PrimitiveTypeEnum getTypeReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TypeReference.toString());
		if (obj == null)
			return null;

		return metamodel.proxies.PrimitiveTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TypeReference
	 * @param typereference
	 */
	public final void setTypeReference(metamodel.proxies.PrimitiveTypeEnum typereference)
	{
		setTypeReference(getContext(), typereference);
	}

	/**
	 * Set value of TypeReference
	 * @param context
	 * @param typereference
	 */
	public final void setTypeReference(com.mendix.systemwideinterfaces.core.IContext context, metamodel.proxies.PrimitiveTypeEnum typereference)
	{
		if (typereference != null)
			getMendixObject().setValue(context, MemberNames.TypeReference.toString(), typereference.toString());
		else
			getMendixObject().setValue(context, MemberNames.TypeReference.toString(), null);
	}

	/**
	 * @return value of ReferenceOrEnum
	 */
	public final java.lang.Boolean getReferenceOrEnum()
	{
		return getReferenceOrEnum(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceOrEnum
	 */
	public final java.lang.Boolean getReferenceOrEnum(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ReferenceOrEnum.toString());
	}

	/**
	 * Set value of ReferenceOrEnum
	 * @param referenceorenum
	 */
	public final void setReferenceOrEnum(java.lang.Boolean referenceorenum)
	{
		setReferenceOrEnum(getContext(), referenceorenum);
	}

	/**
	 * Set value of ReferenceOrEnum
	 * @param context
	 * @param referenceorenum
	 */
	public final void setReferenceOrEnum(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean referenceorenum)
	{
		getMendixObject().setValue(context, MemberNames.ReferenceOrEnum.toString(), referenceorenum);
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
	 * @return value of UseCode
	 */
	public final java.lang.Boolean getUseCode()
	{
		return getUseCode(getContext());
	}

	/**
	 * @param context
	 * @return value of UseCode
	 */
	public final java.lang.Boolean getUseCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseCode.toString());
	}

	/**
	 * Set value of UseCode
	 * @param usecode
	 */
	public final void setUseCode(java.lang.Boolean usecode)
	{
		setUseCode(getContext(), usecode);
	}

	/**
	 * Set value of UseCode
	 * @param context
	 * @param usecode
	 */
	public final void setUseCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usecode)
	{
		getMendixObject().setValue(context, MemberNames.UseCode.toString(), usecode);
	}

	/**
	 * @return value of DateTimeCode
	 */
	public final java.lang.String getDateTimeCode()
	{
		return getDateTimeCode(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeCode
	 */
	public final java.lang.String getDateTimeCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DateTimeCode.toString());
	}

	/**
	 * Set value of DateTimeCode
	 * @param datetimecode
	 */
	public final void setDateTimeCode(java.lang.String datetimecode)
	{
		setDateTimeCode(getContext(), datetimecode);
	}

	/**
	 * Set value of DateTimeCode
	 * @param context
	 * @param datetimecode
	 */
	public final void setDateTimeCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String datetimecode)
	{
		getMendixObject().setValue(context, MemberNames.DateTimeCode.toString(), datetimecode);
	}

	/**
	 * Set value of QueryType
	 * @param querytype
	 */
	public final queryrequests.proxies.AndOrOR getQueryType()
	{
		return getQueryType(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryType
	 */
	public final queryrequests.proxies.AndOrOR getQueryType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.QueryType.toString());
		if (obj == null)
			return null;

		return queryrequests.proxies.AndOrOR.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of QueryType
	 * @param querytype
	 */
	public final void setQueryType(queryrequests.proxies.AndOrOR querytype)
	{
		setQueryType(getContext(), querytype);
	}

	/**
	 * Set value of QueryType
	 * @param context
	 * @param querytype
	 */
	public final void setQueryType(com.mendix.systemwideinterfaces.core.IContext context, queryrequests.proxies.AndOrOR querytype)
	{
		if (querytype != null)
			getMendixObject().setValue(context, MemberNames.QueryType.toString(), querytype.toString());
		else
			getMendixObject().setValue(context, MemberNames.QueryType.toString(), null);
	}

	/**
	 * @return value of Backup
	 */
	public final java.lang.Boolean getBackup()
	{
		return getBackup(getContext());
	}

	/**
	 * @param context
	 * @return value of Backup
	 */
	public final java.lang.Boolean getBackup(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Backup.toString());
	}

	/**
	 * Set value of Backup
	 * @param backup
	 */
	public final void setBackup(java.lang.Boolean backup)
	{
		setBackup(getContext(), backup);
	}

	/**
	 * Set value of Backup
	 * @param context
	 * @param backup
	 */
	public final void setBackup(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean backup)
	{
		getMendixObject().setValue(context, MemberNames.Backup.toString(), backup);
	}

	/**
	 * @return value of ObjectID
	 */
	public final java.lang.String getObjectID()
	{
		return getObjectID(getContext());
	}

	/**
	 * @param context
	 * @return value of ObjectID
	 */
	public final java.lang.String getObjectID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ObjectID.toString());
	}

	/**
	 * Set value of ObjectID
	 * @param objectid
	 */
	public final void setObjectID(java.lang.String objectid)
	{
		setObjectID(getContext(), objectid);
	}

	/**
	 * Set value of ObjectID
	 * @param context
	 * @param objectid
	 */
	public final void setObjectID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String objectid)
	{
		getMendixObject().setValue(context, MemberNames.ObjectID.toString(), objectid);
	}

	/**
	 * Set value of Operator
	 * @param operator
	 */
	public final queryrequests.proxies.SearchOperators getOperator()
	{
		return getOperator(getContext());
	}

	/**
	 * @param context
	 * @return value of Operator
	 */
	public final queryrequests.proxies.SearchOperators getOperator(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Operator.toString());
		if (obj == null)
			return null;

		return queryrequests.proxies.SearchOperators.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Operator
	 * @param operator
	 */
	public final void setOperator(queryrequests.proxies.SearchOperators operator)
	{
		setOperator(getContext(), operator);
	}

	/**
	 * Set value of Operator
	 * @param context
	 * @param operator
	 */
	public final void setOperator(com.mendix.systemwideinterfaces.core.IContext context, queryrequests.proxies.SearchOperators operator)
	{
		if (operator != null)
			getMendixObject().setValue(context, MemberNames.Operator.toString(), operator.toString());
		else
			getMendixObject().setValue(context, MemberNames.Operator.toString(), null);
	}

	/**
	 * @return value of UpdateReferencedField
	 */
	public final java.lang.Boolean getUpdateReferencedField()
	{
		return getUpdateReferencedField(getContext());
	}

	/**
	 * @param context
	 * @return value of UpdateReferencedField
	 */
	public final java.lang.Boolean getUpdateReferencedField(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UpdateReferencedField.toString());
	}

	/**
	 * Set value of UpdateReferencedField
	 * @param updatereferencedfield
	 */
	public final void setUpdateReferencedField(java.lang.Boolean updatereferencedfield)
	{
		setUpdateReferencedField(getContext(), updatereferencedfield);
	}

	/**
	 * Set value of UpdateReferencedField
	 * @param context
	 * @param updatereferencedfield
	 */
	public final void setUpdateReferencedField(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean updatereferencedfield)
	{
		getMendixObject().setValue(context, MemberNames.UpdateReferencedField.toString(), updatereferencedfield);
	}

	/**
	 * @return value of Valid
	 */
	public final java.lang.Boolean getValid()
	{
		return getValid(getContext());
	}

	/**
	 * @param context
	 * @return value of Valid
	 */
	public final java.lang.Boolean getValid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Valid.toString());
	}

	/**
	 * Set value of Valid
	 * @param valid
	 */
	public final void setValid(java.lang.Boolean valid)
	{
		setValid(getContext(), valid);
	}

	/**
	 * Set value of Valid
	 * @param context
	 * @param valid
	 */
	public final void setValid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean valid)
	{
		getMendixObject().setValue(context, MemberNames.Valid.toString(), valid);
	}

	/**
	 * Set value of RelativeTimePeriod
	 * @param relativetimeperiod
	 */
	public final reporting.proxies.TimePeriodCalculationEnum getRelativeTimePeriod()
	{
		return getRelativeTimePeriod(getContext());
	}

	/**
	 * @param context
	 * @return value of RelativeTimePeriod
	 */
	public final reporting.proxies.TimePeriodCalculationEnum getRelativeTimePeriod(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.RelativeTimePeriod.toString());
		if (obj == null)
			return null;

		return reporting.proxies.TimePeriodCalculationEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of RelativeTimePeriod
	 * @param relativetimeperiod
	 */
	public final void setRelativeTimePeriod(reporting.proxies.TimePeriodCalculationEnum relativetimeperiod)
	{
		setRelativeTimePeriod(getContext(), relativetimeperiod);
	}

	/**
	 * Set value of RelativeTimePeriod
	 * @param context
	 * @param relativetimeperiod
	 */
	public final void setRelativeTimePeriod(com.mendix.systemwideinterfaces.core.IContext context, reporting.proxies.TimePeriodCalculationEnum relativetimeperiod)
	{
		if (relativetimeperiod != null)
			getMendixObject().setValue(context, MemberNames.RelativeTimePeriod.toString(), relativetimeperiod.toString());
		else
			getMendixObject().setValue(context, MemberNames.RelativeTimePeriod.toString(), null);
	}

	/**
	 * @return value of RelativeTimePeriodOffsetAmount
	 */
	public final java.lang.Integer getRelativeTimePeriodOffsetAmount()
	{
		return getRelativeTimePeriodOffsetAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of RelativeTimePeriodOffsetAmount
	 */
	public final java.lang.Integer getRelativeTimePeriodOffsetAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RelativeTimePeriodOffsetAmount.toString());
	}

	/**
	 * Set value of RelativeTimePeriodOffsetAmount
	 * @param relativetimeperiodoffsetamount
	 */
	public final void setRelativeTimePeriodOffsetAmount(java.lang.Integer relativetimeperiodoffsetamount)
	{
		setRelativeTimePeriodOffsetAmount(getContext(), relativetimeperiodoffsetamount);
	}

	/**
	 * Set value of RelativeTimePeriodOffsetAmount
	 * @param context
	 * @param relativetimeperiodoffsetamount
	 */
	public final void setRelativeTimePeriodOffsetAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer relativetimeperiodoffsetamount)
	{
		getMendixObject().setValue(context, MemberNames.RelativeTimePeriodOffsetAmount.toString(), relativetimeperiodoffsetamount);
	}

	/**
	 * Set value of RelativeTimePeriodOffsetUnit
	 * @param relativetimeperiodoffsetunit
	 */
	public final customlvnl.proxies.CustomRelativeTimeUnit getRelativeTimePeriodOffsetUnit()
	{
		return getRelativeTimePeriodOffsetUnit(getContext());
	}

	/**
	 * @param context
	 * @return value of RelativeTimePeriodOffsetUnit
	 */
	public final customlvnl.proxies.CustomRelativeTimeUnit getRelativeTimePeriodOffsetUnit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.RelativeTimePeriodOffsetUnit.toString());
		if (obj == null)
			return null;

		return customlvnl.proxies.CustomRelativeTimeUnit.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of RelativeTimePeriodOffsetUnit
	 * @param relativetimeperiodoffsetunit
	 */
	public final void setRelativeTimePeriodOffsetUnit(customlvnl.proxies.CustomRelativeTimeUnit relativetimeperiodoffsetunit)
	{
		setRelativeTimePeriodOffsetUnit(getContext(), relativetimeperiodoffsetunit);
	}

	/**
	 * Set value of RelativeTimePeriodOffsetUnit
	 * @param context
	 * @param relativetimeperiodoffsetunit
	 */
	public final void setRelativeTimePeriodOffsetUnit(com.mendix.systemwideinterfaces.core.IContext context, customlvnl.proxies.CustomRelativeTimeUnit relativetimeperiodoffsetunit)
	{
		if (relativetimeperiodoffsetunit != null)
			getMendixObject().setValue(context, MemberNames.RelativeTimePeriodOffsetUnit.toString(), relativetimeperiodoffsetunit.toString());
		else
			getMendixObject().setValue(context, MemberNames.RelativeTimePeriodOffsetUnit.toString(), null);
	}

	/**
	 * Set value of RelativeTimeFramePastOrFuture
	 * @param relativetimeframepastorfuture
	 */
	public final customlvnl.proxies.PastOrFuture getRelativeTimeFramePastOrFuture()
	{
		return getRelativeTimeFramePastOrFuture(getContext());
	}

	/**
	 * @param context
	 * @return value of RelativeTimeFramePastOrFuture
	 */
	public final customlvnl.proxies.PastOrFuture getRelativeTimeFramePastOrFuture(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.RelativeTimeFramePastOrFuture.toString());
		if (obj == null)
			return null;

		return customlvnl.proxies.PastOrFuture.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of RelativeTimeFramePastOrFuture
	 * @param relativetimeframepastorfuture
	 */
	public final void setRelativeTimeFramePastOrFuture(customlvnl.proxies.PastOrFuture relativetimeframepastorfuture)
	{
		setRelativeTimeFramePastOrFuture(getContext(), relativetimeframepastorfuture);
	}

	/**
	 * Set value of RelativeTimeFramePastOrFuture
	 * @param context
	 * @param relativetimeframepastorfuture
	 */
	public final void setRelativeTimeFramePastOrFuture(com.mendix.systemwideinterfaces.core.IContext context, customlvnl.proxies.PastOrFuture relativetimeframepastorfuture)
	{
		if (relativetimeframepastorfuture != null)
			getMendixObject().setValue(context, MemberNames.RelativeTimeFramePastOrFuture.toString(), relativetimeframepastorfuture.toString());
		else
			getMendixObject().setValue(context, MemberNames.RelativeTimeFramePastOrFuture.toString(), null);
	}

	/**
	 * @return value of QueryPart_Query
	 */
	public final queryrequests.proxies.Query getQueryPart_Query() throws com.mendix.core.CoreException
	{
		return getQueryPart_Query(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryPart_Query
	 */
	public final queryrequests.proxies.Query getQueryPart_Query(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		queryrequests.proxies.Query result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QueryPart_Query.toString());
		if (identifier != null)
			result = queryrequests.proxies.Query.load(context, identifier);
		return result;
	}

	/**
	 * Set value of QueryPart_Query
	 * @param querypart_query
	 */
	public final void setQueryPart_Query(queryrequests.proxies.Query querypart_query)
	{
		setQueryPart_Query(getContext(), querypart_query);
	}

	/**
	 * Set value of QueryPart_Query
	 * @param context
	 * @param querypart_query
	 */
	public final void setQueryPart_Query(com.mendix.systemwideinterfaces.core.IContext context, queryrequests.proxies.Query querypart_query)
	{
		if (querypart_query == null)
			getMendixObject().setValue(context, MemberNames.QueryPart_Query.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.QueryPart_Query.toString(), querypart_query.getMendixObject().getId());
	}

	/**
	 * @return value of QueryPart_SelectableField
	 */
	public final queryrequests.proxies.SelectableField getQueryPart_SelectableField() throws com.mendix.core.CoreException
	{
		return getQueryPart_SelectableField(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryPart_SelectableField
	 */
	public final queryrequests.proxies.SelectableField getQueryPart_SelectableField(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		queryrequests.proxies.SelectableField result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QueryPart_SelectableField.toString());
		if (identifier != null)
			result = queryrequests.proxies.SelectableField.load(context, identifier);
		return result;
	}

	/**
	 * Set value of QueryPart_SelectableField
	 * @param querypart_selectablefield
	 */
	public final void setQueryPart_SelectableField(queryrequests.proxies.SelectableField querypart_selectablefield)
	{
		setQueryPart_SelectableField(getContext(), querypart_selectablefield);
	}

	/**
	 * Set value of QueryPart_SelectableField
	 * @param context
	 * @param querypart_selectablefield
	 */
	public final void setQueryPart_SelectableField(com.mendix.systemwideinterfaces.core.IContext context, queryrequests.proxies.SelectableField querypart_selectablefield)
	{
		if (querypart_selectablefield == null)
			getMendixObject().setValue(context, MemberNames.QueryPart_SelectableField.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.QueryPart_SelectableField.toString(), querypart_selectablefield.getMendixObject().getId());
	}

	/**
	 * @return value of QueryPart_OperatorForField
	 */
	public final queryrequests.proxies.OperatorForField getQueryPart_OperatorForField() throws com.mendix.core.CoreException
	{
		return getQueryPart_OperatorForField(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryPart_OperatorForField
	 */
	public final queryrequests.proxies.OperatorForField getQueryPart_OperatorForField(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		queryrequests.proxies.OperatorForField result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QueryPart_OperatorForField.toString());
		if (identifier != null)
			result = queryrequests.proxies.OperatorForField.load(context, identifier);
		return result;
	}

	/**
	 * Set value of QueryPart_OperatorForField
	 * @param querypart_operatorforfield
	 */
	public final void setQueryPart_OperatorForField(queryrequests.proxies.OperatorForField querypart_operatorforfield)
	{
		setQueryPart_OperatorForField(getContext(), querypart_operatorforfield);
	}

	/**
	 * Set value of QueryPart_OperatorForField
	 * @param context
	 * @param querypart_operatorforfield
	 */
	public final void setQueryPart_OperatorForField(com.mendix.systemwideinterfaces.core.IContext context, queryrequests.proxies.OperatorForField querypart_operatorforfield)
	{
		if (querypart_operatorforfield == null)
			getMendixObject().setValue(context, MemberNames.QueryPart_OperatorForField.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.QueryPart_OperatorForField.toString(), querypart_operatorforfield.getMendixObject().getId());
	}

	/**
	 * @return value of TEMPQueryPart_OperatorForField
	 */
	public final queryrequests.proxies.OperatorForField getTEMPQueryPart_OperatorForField() throws com.mendix.core.CoreException
	{
		return getTEMPQueryPart_OperatorForField(getContext());
	}

	/**
	 * @param context
	 * @return value of TEMPQueryPart_OperatorForField
	 */
	public final queryrequests.proxies.OperatorForField getTEMPQueryPart_OperatorForField(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		queryrequests.proxies.OperatorForField result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TEMPQueryPart_OperatorForField.toString());
		if (identifier != null)
			result = queryrequests.proxies.OperatorForField.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TEMPQueryPart_OperatorForField
	 * @param tempquerypart_operatorforfield
	 */
	public final void setTEMPQueryPart_OperatorForField(queryrequests.proxies.OperatorForField tempquerypart_operatorforfield)
	{
		setTEMPQueryPart_OperatorForField(getContext(), tempquerypart_operatorforfield);
	}

	/**
	 * Set value of TEMPQueryPart_OperatorForField
	 * @param context
	 * @param tempquerypart_operatorforfield
	 */
	public final void setTEMPQueryPart_OperatorForField(com.mendix.systemwideinterfaces.core.IContext context, queryrequests.proxies.OperatorForField tempquerypart_operatorforfield)
	{
		if (tempquerypart_operatorforfield == null)
			getMendixObject().setValue(context, MemberNames.TEMPQueryPart_OperatorForField.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TEMPQueryPart_OperatorForField.toString(), tempquerypart_operatorforfield.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return queryPartMendixObject;
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
			final queryrequests.proxies.QueryPart that = (queryrequests.proxies.QueryPart) obj;
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
		return "QueryRequests.QueryPart";
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
