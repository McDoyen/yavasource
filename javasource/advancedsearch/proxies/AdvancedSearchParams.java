// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package advancedsearch.proxies;

public class AdvancedSearchParams
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject advancedSearchParamsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AdvancedSearch.AdvancedSearchParams";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Query("Query");

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

	public AdvancedSearchParams(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AdvancedSearch.AdvancedSearchParams"));
	}

	protected AdvancedSearchParams(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject advancedSearchParamsMendixObject)
	{
		if (advancedSearchParamsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AdvancedSearch.AdvancedSearchParams", advancedSearchParamsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AdvancedSearch.AdvancedSearchParams");

		this.advancedSearchParamsMendixObject = advancedSearchParamsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AdvancedSearchParams.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static advancedsearch.proxies.AdvancedSearchParams initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return advancedsearch.proxies.AdvancedSearchParams.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static advancedsearch.proxies.AdvancedSearchParams initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new advancedsearch.proxies.AdvancedSearchParams(context, mendixObject);
	}

	public static advancedsearch.proxies.AdvancedSearchParams load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return advancedsearch.proxies.AdvancedSearchParams.initialize(context, mendixObject);
	}

	public static java.util.List<advancedsearch.proxies.AdvancedSearchParams> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<advancedsearch.proxies.AdvancedSearchParams> result = new java.util.ArrayList<advancedsearch.proxies.AdvancedSearchParams>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AdvancedSearch.AdvancedSearchParams" + xpathConstraint))
			result.add(advancedsearch.proxies.AdvancedSearchParams.initialize(context, obj));
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
	 * @return value of Query
	 */
	public final java.lang.String getQuery()
	{
		return getQuery(getContext());
	}

	/**
	 * @param context
	 * @return value of Query
	 */
	public final java.lang.String getQuery(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Query.toString());
	}

	/**
	 * Set value of Query
	 * @param query
	 */
	public final void setQuery(java.lang.String query)
	{
		setQuery(getContext(), query);
	}

	/**
	 * Set value of Query
	 * @param context
	 * @param query
	 */
	public final void setQuery(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String query)
	{
		getMendixObject().setValue(context, MemberNames.Query.toString(), query);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return advancedSearchParamsMendixObject;
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
			final advancedsearch.proxies.AdvancedSearchParams that = (advancedsearch.proxies.AdvancedSearchParams) obj;
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
		return "AdvancedSearch.AdvancedSearchParams";
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
