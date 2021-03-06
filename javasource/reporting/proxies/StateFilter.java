// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package reporting.proxies;

public class StateFilter extends reporting.proxies.ReportFilter
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Reporting.StateFilter";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FilterType("FilterType"),
		ReadableString("ReadableString"),
		Editable("Editable"),
		IsDefault("IsDefault"),
		IsCopyOfDefault("IsCopyOfDefault"),
		FilterID("FilterID"),
		FilterDefinitionName("FilterDefinitionName"),
		StateFilter_States("Reporting.StateFilter_States"),
		ReportFilter_ReportSelect("Reporting.ReportFilter_ReportSelect"),
		ReportFilter_Definition("Reporting.ReportFilter_Definition"),
		ReportFilter_User("Reporting.ReportFilter_User");

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

	public StateFilter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Reporting.StateFilter"));
	}

	protected StateFilter(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject stateFilterMendixObject)
	{
		super(context, stateFilterMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Reporting.StateFilter", stateFilterMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Reporting.StateFilter");
	}

	/**
	 * @deprecated Use 'StateFilter.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static reporting.proxies.StateFilter initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return reporting.proxies.StateFilter.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static reporting.proxies.StateFilter initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new reporting.proxies.StateFilter(context, mendixObject);
	}

	public static reporting.proxies.StateFilter load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return reporting.proxies.StateFilter.initialize(context, mendixObject);
	}

	public static java.util.List<reporting.proxies.StateFilter> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<reporting.proxies.StateFilter> result = new java.util.ArrayList<reporting.proxies.StateFilter>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Reporting.StateFilter" + xpathConstraint))
			result.add(reporting.proxies.StateFilter.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of StateFilter_States
	 */
	public final java.util.List<statetransition.proxies.State> getStateFilter_States() throws com.mendix.core.CoreException
	{
		return getStateFilter_States(getContext());
	}

	/**
	 * @param context
	 * @return value of StateFilter_States
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<statetransition.proxies.State> getStateFilter_States(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<statetransition.proxies.State> result = new java.util.ArrayList<statetransition.proxies.State>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.StateFilter_States.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(statetransition.proxies.State.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of StateFilter_States
	 * @param statefilter_states
	 */
	public final void setStateFilter_States(java.util.List<statetransition.proxies.State> statefilter_states)
	{
		setStateFilter_States(getContext(), statefilter_states);
	}

	/**
	 * Set value of StateFilter_States
	 * @param context
	 * @param statefilter_states
	 */
	public final void setStateFilter_States(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<statetransition.proxies.State> statefilter_states)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (statetransition.proxies.State proxyObject : statefilter_states)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.StateFilter_States.toString(), identifiers);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final reporting.proxies.StateFilter that = (reporting.proxies.StateFilter) obj;
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
		return "Reporting.StateFilter";
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
