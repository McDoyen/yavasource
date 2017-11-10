// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package reporting.proxies;

public class FilterDefinition
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject filterDefinitionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Reporting.FilterDefinition";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		FilterType("FilterType"),
		OQLJoinString("OQLJoinString"),
		OQLWhereString("OQLWhereString"),
		FilterDefinition_ReportQuery("Reporting.FilterDefinition_ReportQuery");

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

	public FilterDefinition(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Reporting.FilterDefinition"));
	}

	protected FilterDefinition(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject filterDefinitionMendixObject)
	{
		if (filterDefinitionMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Reporting.FilterDefinition", filterDefinitionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Reporting.FilterDefinition");

		this.filterDefinitionMendixObject = filterDefinitionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'FilterDefinition.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static reporting.proxies.FilterDefinition initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return reporting.proxies.FilterDefinition.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static reporting.proxies.FilterDefinition initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new reporting.proxies.FilterDefinition(context, mendixObject);
	}

	public static reporting.proxies.FilterDefinition load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return reporting.proxies.FilterDefinition.initialize(context, mendixObject);
	}

	public static java.util.List<reporting.proxies.FilterDefinition> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<reporting.proxies.FilterDefinition> result = new java.util.ArrayList<reporting.proxies.FilterDefinition>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Reporting.FilterDefinition" + xpathConstraint))
			result.add(reporting.proxies.FilterDefinition.initialize(context, obj));
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
	 * Set value of FilterType
	 * @param filtertype
	 */
	public final reporting.proxies.FilterTypeEnum getFilterType()
	{
		return getFilterType(getContext());
	}

	/**
	 * @param context
	 * @return value of FilterType
	 */
	public final reporting.proxies.FilterTypeEnum getFilterType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.FilterType.toString());
		if (obj == null)
			return null;

		return reporting.proxies.FilterTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of FilterType
	 * @param filtertype
	 */
	public final void setFilterType(reporting.proxies.FilterTypeEnum filtertype)
	{
		setFilterType(getContext(), filtertype);
	}

	/**
	 * Set value of FilterType
	 * @param context
	 * @param filtertype
	 */
	public final void setFilterType(com.mendix.systemwideinterfaces.core.IContext context, reporting.proxies.FilterTypeEnum filtertype)
	{
		if (filtertype != null)
			getMendixObject().setValue(context, MemberNames.FilterType.toString(), filtertype.toString());
		else
			getMendixObject().setValue(context, MemberNames.FilterType.toString(), null);
	}

	/**
	 * @return value of OQLJoinString
	 */
	public final java.lang.String getOQLJoinString()
	{
		return getOQLJoinString(getContext());
	}

	/**
	 * @param context
	 * @return value of OQLJoinString
	 */
	public final java.lang.String getOQLJoinString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OQLJoinString.toString());
	}

	/**
	 * Set value of OQLJoinString
	 * @param oqljoinstring
	 */
	public final void setOQLJoinString(java.lang.String oqljoinstring)
	{
		setOQLJoinString(getContext(), oqljoinstring);
	}

	/**
	 * Set value of OQLJoinString
	 * @param context
	 * @param oqljoinstring
	 */
	public final void setOQLJoinString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String oqljoinstring)
	{
		getMendixObject().setValue(context, MemberNames.OQLJoinString.toString(), oqljoinstring);
	}

	/**
	 * @return value of OQLWhereString
	 */
	public final java.lang.String getOQLWhereString()
	{
		return getOQLWhereString(getContext());
	}

	/**
	 * @param context
	 * @return value of OQLWhereString
	 */
	public final java.lang.String getOQLWhereString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OQLWhereString.toString());
	}

	/**
	 * Set value of OQLWhereString
	 * @param oqlwherestring
	 */
	public final void setOQLWhereString(java.lang.String oqlwherestring)
	{
		setOQLWhereString(getContext(), oqlwherestring);
	}

	/**
	 * Set value of OQLWhereString
	 * @param context
	 * @param oqlwherestring
	 */
	public final void setOQLWhereString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String oqlwherestring)
	{
		getMendixObject().setValue(context, MemberNames.OQLWhereString.toString(), oqlwherestring);
	}

	/**
	 * @return value of FilterDefinition_ReportQuery
	 */
	public final reporting.proxies.ReportQuery getFilterDefinition_ReportQuery() throws com.mendix.core.CoreException
	{
		return getFilterDefinition_ReportQuery(getContext());
	}

	/**
	 * @param context
	 * @return value of FilterDefinition_ReportQuery
	 */
	public final reporting.proxies.ReportQuery getFilterDefinition_ReportQuery(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		reporting.proxies.ReportQuery result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FilterDefinition_ReportQuery.toString());
		if (identifier != null)
			result = reporting.proxies.ReportQuery.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FilterDefinition_ReportQuery
	 * @param filterdefinition_reportquery
	 */
	public final void setFilterDefinition_ReportQuery(reporting.proxies.ReportQuery filterdefinition_reportquery)
	{
		setFilterDefinition_ReportQuery(getContext(), filterdefinition_reportquery);
	}

	/**
	 * Set value of FilterDefinition_ReportQuery
	 * @param context
	 * @param filterdefinition_reportquery
	 */
	public final void setFilterDefinition_ReportQuery(com.mendix.systemwideinterfaces.core.IContext context, reporting.proxies.ReportQuery filterdefinition_reportquery)
	{
		if (filterdefinition_reportquery == null)
			getMendixObject().setValue(context, MemberNames.FilterDefinition_ReportQuery.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FilterDefinition_ReportQuery.toString(), filterdefinition_reportquery.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return filterDefinitionMendixObject;
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
			final reporting.proxies.FilterDefinition that = (reporting.proxies.FilterDefinition) obj;
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
		return "Reporting.FilterDefinition";
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
