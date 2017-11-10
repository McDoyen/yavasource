// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public class MxStatic extends xlsreport.proxies.MxData
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XLSReport.MxStatic";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ColumnPlace("ColumnPlace"),
		RowPlace("RowPlace"),
		StaticType("StaticType"),
		AggregateFunction("AggregateFunction"),
		Name("Name"),
		Status("Status"),
		MxStatic_MxColumn("XLSReport.MxStatic_MxColumn"),
		MxStatic_MxObjectMember("XLSReport.MxStatic_MxObjectMember"),
		MxData_MxSheet("XLSReport.MxData_MxSheet"),
		MxData_MxCellStyle("XLSReport.MxData_MxCellStyle"),
		MxXPath_MxData("XLSReport.MxXPath_MxData");

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

	public MxStatic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "XLSReport.MxStatic"));
	}

	protected MxStatic(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxStaticMendixObject)
	{
		super(context, mxStaticMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("XLSReport.MxStatic", mxStaticMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a XLSReport.MxStatic");
	}

	/**
	 * @deprecated Use 'MxStatic.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static xlsreport.proxies.MxStatic initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xlsreport.proxies.MxStatic.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static xlsreport.proxies.MxStatic initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xlsreport.proxies.MxStatic(context, mendixObject);
	}

	public static xlsreport.proxies.MxStatic load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xlsreport.proxies.MxStatic.initialize(context, mendixObject);
	}

	public static java.util.List<xlsreport.proxies.MxStatic> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<xlsreport.proxies.MxStatic> result = new java.util.ArrayList<xlsreport.proxies.MxStatic>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//XLSReport.MxStatic" + xpathConstraint))
			result.add(xlsreport.proxies.MxStatic.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ColumnPlace
	 */
	public final java.lang.Integer getColumnPlace()
	{
		return getColumnPlace(getContext());
	}

	/**
	 * @param context
	 * @return value of ColumnPlace
	 */
	public final java.lang.Integer getColumnPlace(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ColumnPlace.toString());
	}

	/**
	 * Set value of ColumnPlace
	 * @param columnplace
	 */
	public final void setColumnPlace(java.lang.Integer columnplace)
	{
		setColumnPlace(getContext(), columnplace);
	}

	/**
	 * Set value of ColumnPlace
	 * @param context
	 * @param columnplace
	 */
	public final void setColumnPlace(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer columnplace)
	{
		getMendixObject().setValue(context, MemberNames.ColumnPlace.toString(), columnplace);
	}

	/**
	 * @return value of RowPlace
	 */
	public final java.lang.Integer getRowPlace()
	{
		return getRowPlace(getContext());
	}

	/**
	 * @param context
	 * @return value of RowPlace
	 */
	public final java.lang.Integer getRowPlace(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RowPlace.toString());
	}

	/**
	 * Set value of RowPlace
	 * @param rowplace
	 */
	public final void setRowPlace(java.lang.Integer rowplace)
	{
		setRowPlace(getContext(), rowplace);
	}

	/**
	 * Set value of RowPlace
	 * @param context
	 * @param rowplace
	 */
	public final void setRowPlace(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer rowplace)
	{
		getMendixObject().setValue(context, MemberNames.RowPlace.toString(), rowplace);
	}

	/**
	 * Set value of StaticType
	 * @param statictype
	 */
	public final xlsreport.proxies.StaticType getStaticType()
	{
		return getStaticType(getContext());
	}

	/**
	 * @param context
	 * @return value of StaticType
	 */
	public final xlsreport.proxies.StaticType getStaticType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.StaticType.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.StaticType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of StaticType
	 * @param statictype
	 */
	public final void setStaticType(xlsreport.proxies.StaticType statictype)
	{
		setStaticType(getContext(), statictype);
	}

	/**
	 * Set value of StaticType
	 * @param context
	 * @param statictype
	 */
	public final void setStaticType(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.StaticType statictype)
	{
		if (statictype != null)
			getMendixObject().setValue(context, MemberNames.StaticType.toString(), statictype.toString());
		else
			getMendixObject().setValue(context, MemberNames.StaticType.toString(), null);
	}

	/**
	 * Set value of AggregateFunction
	 * @param aggregatefunction
	 */
	public final xlsreport.proxies.AggregateFunction getAggregateFunction()
	{
		return getAggregateFunction(getContext());
	}

	/**
	 * @param context
	 * @return value of AggregateFunction
	 */
	public final xlsreport.proxies.AggregateFunction getAggregateFunction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AggregateFunction.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.AggregateFunction.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AggregateFunction
	 * @param aggregatefunction
	 */
	public final void setAggregateFunction(xlsreport.proxies.AggregateFunction aggregatefunction)
	{
		setAggregateFunction(getContext(), aggregatefunction);
	}

	/**
	 * Set value of AggregateFunction
	 * @param context
	 * @param aggregatefunction
	 */
	public final void setAggregateFunction(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.AggregateFunction aggregatefunction)
	{
		if (aggregatefunction != null)
			getMendixObject().setValue(context, MemberNames.AggregateFunction.toString(), aggregatefunction.toString());
		else
			getMendixObject().setValue(context, MemberNames.AggregateFunction.toString(), null);
	}

	/**
	 * @return value of MxStatic_MxColumn
	 */
	public final xlsreport.proxies.MxColumn getMxStatic_MxColumn() throws com.mendix.core.CoreException
	{
		return getMxStatic_MxColumn(getContext());
	}

	/**
	 * @param context
	 * @return value of MxStatic_MxColumn
	 */
	public final xlsreport.proxies.MxColumn getMxStatic_MxColumn(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxColumn result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxStatic_MxColumn.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxColumn.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxStatic_MxColumn
	 * @param mxstatic_mxcolumn
	 */
	public final void setMxStatic_MxColumn(xlsreport.proxies.MxColumn mxstatic_mxcolumn)
	{
		setMxStatic_MxColumn(getContext(), mxstatic_mxcolumn);
	}

	/**
	 * Set value of MxStatic_MxColumn
	 * @param context
	 * @param mxstatic_mxcolumn
	 */
	public final void setMxStatic_MxColumn(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxColumn mxstatic_mxcolumn)
	{
		if (mxstatic_mxcolumn == null)
			getMendixObject().setValue(context, MemberNames.MxStatic_MxColumn.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxStatic_MxColumn.toString(), mxstatic_mxcolumn.getMendixObject().getId());
	}

	/**
	 * @return value of MxStatic_MxObjectMember
	 */
	public final mxmodelreflection.proxies.MxObjectMember getMxStatic_MxObjectMember() throws com.mendix.core.CoreException
	{
		return getMxStatic_MxObjectMember(getContext());
	}

	/**
	 * @param context
	 * @return value of MxStatic_MxObjectMember
	 */
	public final mxmodelreflection.proxies.MxObjectMember getMxStatic_MxObjectMember(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectMember result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxStatic_MxObjectMember.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectMember.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxStatic_MxObjectMember
	 * @param mxstatic_mxobjectmember
	 */
	public final void setMxStatic_MxObjectMember(mxmodelreflection.proxies.MxObjectMember mxstatic_mxobjectmember)
	{
		setMxStatic_MxObjectMember(getContext(), mxstatic_mxobjectmember);
	}

	/**
	 * Set value of MxStatic_MxObjectMember
	 * @param context
	 * @param mxstatic_mxobjectmember
	 */
	public final void setMxStatic_MxObjectMember(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectMember mxstatic_mxobjectmember)
	{
		if (mxstatic_mxobjectmember == null)
			getMendixObject().setValue(context, MemberNames.MxStatic_MxObjectMember.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxStatic_MxObjectMember.toString(), mxstatic_mxobjectmember.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final xlsreport.proxies.MxStatic that = (xlsreport.proxies.MxStatic) obj;
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
		return "XLSReport.MxStatic";
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
