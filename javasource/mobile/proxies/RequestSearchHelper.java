// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mobile.proxies;

public class RequestSearchHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject requestSearchHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Mobile.RequestSearchHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProcessType("ProcessType");

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

	public RequestSearchHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Mobile.RequestSearchHelper"));
	}

	protected RequestSearchHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestSearchHelperMendixObject)
	{
		if (requestSearchHelperMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Mobile.RequestSearchHelper", requestSearchHelperMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Mobile.RequestSearchHelper");

		this.requestSearchHelperMendixObject = requestSearchHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RequestSearchHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mobile.proxies.RequestSearchHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mobile.proxies.RequestSearchHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mobile.proxies.RequestSearchHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mobile.proxies.RequestSearchHelper(context, mendixObject);
	}

	public static mobile.proxies.RequestSearchHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mobile.proxies.RequestSearchHelper.initialize(context, mendixObject);
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
	 * Set value of ProcessType
	 * @param processtype
	 */
	public final slm.proxies.ProcessType getProcessType()
	{
		return getProcessType(getContext());
	}

	/**
	 * @param context
	 * @return value of ProcessType
	 */
	public final slm.proxies.ProcessType getProcessType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProcessType.toString());
		if (obj == null)
			return null;

		return slm.proxies.ProcessType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProcessType
	 * @param processtype
	 */
	public final void setProcessType(slm.proxies.ProcessType processtype)
	{
		setProcessType(getContext(), processtype);
	}

	/**
	 * Set value of ProcessType
	 * @param context
	 * @param processtype
	 */
	public final void setProcessType(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.ProcessType processtype)
	{
		if (processtype != null)
			getMendixObject().setValue(context, MemberNames.ProcessType.toString(), processtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProcessType.toString(), null);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return requestSearchHelperMendixObject;
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
			final mobile.proxies.RequestSearchHelper that = (mobile.proxies.RequestSearchHelper) obj;
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
		return "Mobile.RequestSearchHelper";
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