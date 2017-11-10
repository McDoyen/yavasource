// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package queryrequests.proxies;

public class DummyContext
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dummyContextMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QueryRequests.DummyContext";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		childBurst("childBurst");

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

	public DummyContext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "QueryRequests.DummyContext"));
	}

	protected DummyContext(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dummyContextMendixObject)
	{
		if (dummyContextMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("QueryRequests.DummyContext", dummyContextMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a QueryRequests.DummyContext");

		this.dummyContextMendixObject = dummyContextMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DummyContext.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static queryrequests.proxies.DummyContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return queryrequests.proxies.DummyContext.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static queryrequests.proxies.DummyContext initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new queryrequests.proxies.DummyContext(context, mendixObject);
	}

	public static queryrequests.proxies.DummyContext load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return queryrequests.proxies.DummyContext.initialize(context, mendixObject);
	}

	public static java.util.List<queryrequests.proxies.DummyContext> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<queryrequests.proxies.DummyContext> result = new java.util.ArrayList<queryrequests.proxies.DummyContext>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//QueryRequests.DummyContext" + xpathConstraint))
			result.add(queryrequests.proxies.DummyContext.initialize(context, obj));
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
	 * @return value of childBurst
	 */
	public final java.util.Date getchildBurst()
	{
		return getchildBurst(getContext());
	}

	/**
	 * @param context
	 * @return value of childBurst
	 */
	public final java.util.Date getchildBurst(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.childBurst.toString());
	}

	/**
	 * Set value of childBurst
	 * @param childburst
	 */
	public final void setchildBurst(java.util.Date childburst)
	{
		setchildBurst(getContext(), childburst);
	}

	/**
	 * Set value of childBurst
	 * @param context
	 * @param childburst
	 */
	public final void setchildBurst(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date childburst)
	{
		getMendixObject().setValue(context, MemberNames.childBurst.toString(), childburst);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dummyContextMendixObject;
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
			final queryrequests.proxies.DummyContext that = (queryrequests.proxies.DummyContext) obj;
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
		return "QueryRequests.DummyContext";
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