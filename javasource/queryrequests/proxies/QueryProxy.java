// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package queryrequests.proxies;

public class QueryProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject queryProxyMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QueryRequests.QueryProxy";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		QueryName("QueryName"),
		_SortValue("_SortValue"),
		IsDefaultOnOpen("IsDefaultOnOpen"),
		UseQuery("UseQuery"),
		SharedQuery("SharedQuery"),
		Executed("Executed"),
		MaxExecuteTime("MaxExecuteTime"),
		QueryProxy_Query("QueryRequests.QueryProxy_Query"),
		QueryProxy_DummyContext("QueryRequests.QueryProxy_DummyContext"),
		QueryProxy_Account("QueryRequests.QueryProxy_Account");

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

	public QueryProxy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "QueryRequests.QueryProxy"));
	}

	protected QueryProxy(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject queryProxyMendixObject)
	{
		if (queryProxyMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("QueryRequests.QueryProxy", queryProxyMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a QueryRequests.QueryProxy");

		this.queryProxyMendixObject = queryProxyMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'QueryProxy.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static queryrequests.proxies.QueryProxy initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return queryrequests.proxies.QueryProxy.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static queryrequests.proxies.QueryProxy initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new queryrequests.proxies.QueryProxy(context, mendixObject);
	}

	public static queryrequests.proxies.QueryProxy load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return queryrequests.proxies.QueryProxy.initialize(context, mendixObject);
	}

	public static java.util.List<queryrequests.proxies.QueryProxy> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<queryrequests.proxies.QueryProxy> result = new java.util.ArrayList<queryrequests.proxies.QueryProxy>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//QueryRequests.QueryProxy" + xpathConstraint))
			result.add(queryrequests.proxies.QueryProxy.initialize(context, obj));
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
	 * @return value of QueryName
	 */
	public final java.lang.String getQueryName()
	{
		return getQueryName(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryName
	 */
	public final java.lang.String getQueryName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.QueryName.toString());
	}

	/**
	 * Set value of QueryName
	 * @param queryname
	 */
	public final void setQueryName(java.lang.String queryname)
	{
		setQueryName(getContext(), queryname);
	}

	/**
	 * Set value of QueryName
	 * @param context
	 * @param queryname
	 */
	public final void setQueryName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String queryname)
	{
		getMendixObject().setValue(context, MemberNames.QueryName.toString(), queryname);
	}

	/**
	 * @return value of _SortValue
	 */
	public final java.lang.Double get_SortValue()
	{
		return get_SortValue(getContext());
	}

	/**
	 * @param context
	 * @return value of _SortValue
	 */
	public final java.lang.Double get_SortValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames._SortValue.toString());
	}

	/**
	 * Set value of _SortValue
	 * @param _sortvalue
	 */
	public final void set_SortValue(java.lang.Double _sortvalue)
	{
		set_SortValue(getContext(), _sortvalue);
	}

	/**
	 * Set value of _SortValue
	 * @param context
	 * @param _sortvalue
	 */
	public final void set_SortValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double _sortvalue)
	{
		getMendixObject().setValue(context, MemberNames._SortValue.toString(), _sortvalue);
	}

	/**
	 * @return value of IsDefaultOnOpen
	 */
	public final java.lang.Boolean getIsDefaultOnOpen()
	{
		return getIsDefaultOnOpen(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDefaultOnOpen
	 */
	public final java.lang.Boolean getIsDefaultOnOpen(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsDefaultOnOpen.toString());
	}

	/**
	 * Set value of IsDefaultOnOpen
	 * @param isdefaultonopen
	 */
	public final void setIsDefaultOnOpen(java.lang.Boolean isdefaultonopen)
	{
		setIsDefaultOnOpen(getContext(), isdefaultonopen);
	}

	/**
	 * Set value of IsDefaultOnOpen
	 * @param context
	 * @param isdefaultonopen
	 */
	public final void setIsDefaultOnOpen(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdefaultonopen)
	{
		getMendixObject().setValue(context, MemberNames.IsDefaultOnOpen.toString(), isdefaultonopen);
	}

	/**
	 * @return value of UseQuery
	 */
	public final java.lang.Boolean getUseQuery()
	{
		return getUseQuery(getContext());
	}

	/**
	 * @param context
	 * @return value of UseQuery
	 */
	public final java.lang.Boolean getUseQuery(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseQuery.toString());
	}

	/**
	 * Set value of UseQuery
	 * @param usequery
	 */
	public final void setUseQuery(java.lang.Boolean usequery)
	{
		setUseQuery(getContext(), usequery);
	}

	/**
	 * Set value of UseQuery
	 * @param context
	 * @param usequery
	 */
	public final void setUseQuery(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usequery)
	{
		getMendixObject().setValue(context, MemberNames.UseQuery.toString(), usequery);
	}

	/**
	 * @return value of SharedQuery
	 */
	public final java.lang.Boolean getSharedQuery()
	{
		return getSharedQuery(getContext());
	}

	/**
	 * @param context
	 * @return value of SharedQuery
	 */
	public final java.lang.Boolean getSharedQuery(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SharedQuery.toString());
	}

	/**
	 * Set value of SharedQuery
	 * @param sharedquery
	 */
	public final void setSharedQuery(java.lang.Boolean sharedquery)
	{
		setSharedQuery(getContext(), sharedquery);
	}

	/**
	 * Set value of SharedQuery
	 * @param context
	 * @param sharedquery
	 */
	public final void setSharedQuery(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean sharedquery)
	{
		getMendixObject().setValue(context, MemberNames.SharedQuery.toString(), sharedquery);
	}

	/**
	 * @return value of Executed
	 */
	public final java.lang.Integer getExecuted()
	{
		return getExecuted(getContext());
	}

	/**
	 * @param context
	 * @return value of Executed
	 */
	public final java.lang.Integer getExecuted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Executed.toString());
	}

	/**
	 * Set value of Executed
	 * @param executed
	 */
	public final void setExecuted(java.lang.Integer executed)
	{
		setExecuted(getContext(), executed);
	}

	/**
	 * Set value of Executed
	 * @param context
	 * @param executed
	 */
	public final void setExecuted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer executed)
	{
		getMendixObject().setValue(context, MemberNames.Executed.toString(), executed);
	}

	/**
	 * @return value of MaxExecuteTime
	 */
	public final java.lang.Double getMaxExecuteTime()
	{
		return getMaxExecuteTime(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxExecuteTime
	 */
	public final java.lang.Double getMaxExecuteTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.MaxExecuteTime.toString());
	}

	/**
	 * Set value of MaxExecuteTime
	 * @param maxexecutetime
	 */
	public final void setMaxExecuteTime(java.lang.Double maxexecutetime)
	{
		setMaxExecuteTime(getContext(), maxexecutetime);
	}

	/**
	 * Set value of MaxExecuteTime
	 * @param context
	 * @param maxexecutetime
	 */
	public final void setMaxExecuteTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double maxexecutetime)
	{
		getMendixObject().setValue(context, MemberNames.MaxExecuteTime.toString(), maxexecutetime);
	}

	/**
	 * @return value of QueryProxy_Query
	 */
	public final queryrequests.proxies.Query getQueryProxy_Query() throws com.mendix.core.CoreException
	{
		return getQueryProxy_Query(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryProxy_Query
	 */
	public final queryrequests.proxies.Query getQueryProxy_Query(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		queryrequests.proxies.Query result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QueryProxy_Query.toString());
		if (identifier != null)
			result = queryrequests.proxies.Query.load(context, identifier);
		return result;
	}

	/**
	 * Set value of QueryProxy_Query
	 * @param queryproxy_query
	 */
	public final void setQueryProxy_Query(queryrequests.proxies.Query queryproxy_query)
	{
		setQueryProxy_Query(getContext(), queryproxy_query);
	}

	/**
	 * Set value of QueryProxy_Query
	 * @param context
	 * @param queryproxy_query
	 */
	public final void setQueryProxy_Query(com.mendix.systemwideinterfaces.core.IContext context, queryrequests.proxies.Query queryproxy_query)
	{
		if (queryproxy_query == null)
			getMendixObject().setValue(context, MemberNames.QueryProxy_Query.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.QueryProxy_Query.toString(), queryproxy_query.getMendixObject().getId());
	}

	/**
	 * @return value of QueryProxy_DummyContext
	 */
	public final queryrequests.proxies.DummyContext getQueryProxy_DummyContext() throws com.mendix.core.CoreException
	{
		return getQueryProxy_DummyContext(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryProxy_DummyContext
	 */
	public final queryrequests.proxies.DummyContext getQueryProxy_DummyContext(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		queryrequests.proxies.DummyContext result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QueryProxy_DummyContext.toString());
		if (identifier != null)
			result = queryrequests.proxies.DummyContext.load(context, identifier);
		return result;
	}

	/**
	 * Set value of QueryProxy_DummyContext
	 * @param queryproxy_dummycontext
	 */
	public final void setQueryProxy_DummyContext(queryrequests.proxies.DummyContext queryproxy_dummycontext)
	{
		setQueryProxy_DummyContext(getContext(), queryproxy_dummycontext);
	}

	/**
	 * Set value of QueryProxy_DummyContext
	 * @param context
	 * @param queryproxy_dummycontext
	 */
	public final void setQueryProxy_DummyContext(com.mendix.systemwideinterfaces.core.IContext context, queryrequests.proxies.DummyContext queryproxy_dummycontext)
	{
		if (queryproxy_dummycontext == null)
			getMendixObject().setValue(context, MemberNames.QueryProxy_DummyContext.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.QueryProxy_DummyContext.toString(), queryproxy_dummycontext.getMendixObject().getId());
	}

	/**
	 * @return value of QueryProxy_Account
	 */
	public final mendix.proxies.Account getQueryProxy_Account() throws com.mendix.core.CoreException
	{
		return getQueryProxy_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryProxy_Account
	 */
	public final mendix.proxies.Account getQueryProxy_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendix.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.QueryProxy_Account.toString());
		if (identifier != null)
			result = mendix.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of QueryProxy_Account
	 * @param queryproxy_account
	 */
	public final void setQueryProxy_Account(mendix.proxies.Account queryproxy_account)
	{
		setQueryProxy_Account(getContext(), queryproxy_account);
	}

	/**
	 * Set value of QueryProxy_Account
	 * @param context
	 * @param queryproxy_account
	 */
	public final void setQueryProxy_Account(com.mendix.systemwideinterfaces.core.IContext context, mendix.proxies.Account queryproxy_account)
	{
		if (queryproxy_account == null)
			getMendixObject().setValue(context, MemberNames.QueryProxy_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.QueryProxy_Account.toString(), queryproxy_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return queryProxyMendixObject;
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
			final queryrequests.proxies.QueryProxy that = (queryrequests.proxies.QueryProxy) obj;
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
		return "QueryRequests.QueryProxy";
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