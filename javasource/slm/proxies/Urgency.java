// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slm.proxies;

public class Urgency
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject urgencyMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SLM.Urgency";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UrgencyName("UrgencyName"),
		Urgency_DataAccess("SLM.Urgency_DataAccess");

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

	public Urgency(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SLM.Urgency"));
	}

	protected Urgency(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject urgencyMendixObject)
	{
		if (urgencyMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SLM.Urgency", urgencyMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SLM.Urgency");

		this.urgencyMendixObject = urgencyMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Urgency.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static slm.proxies.Urgency initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return slm.proxies.Urgency.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static slm.proxies.Urgency initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new slm.proxies.Urgency(context, mendixObject);
	}

	public static slm.proxies.Urgency load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return slm.proxies.Urgency.initialize(context, mendixObject);
	}

	public static java.util.List<slm.proxies.Urgency> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<slm.proxies.Urgency> result = new java.util.ArrayList<slm.proxies.Urgency>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SLM.Urgency" + xpathConstraint))
			result.add(slm.proxies.Urgency.initialize(context, obj));
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
	 * @return value of UrgencyName
	 */
	public final java.lang.String getUrgencyName()
	{
		return getUrgencyName(getContext());
	}

	/**
	 * @param context
	 * @return value of UrgencyName
	 */
	public final java.lang.String getUrgencyName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UrgencyName.toString());
	}

	/**
	 * Set value of UrgencyName
	 * @param urgencyname
	 */
	public final void setUrgencyName(java.lang.String urgencyname)
	{
		setUrgencyName(getContext(), urgencyname);
	}

	/**
	 * Set value of UrgencyName
	 * @param context
	 * @param urgencyname
	 */
	public final void setUrgencyName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String urgencyname)
	{
		getMendixObject().setValue(context, MemberNames.UrgencyName.toString(), urgencyname);
	}

	/**
	 * @return value of Urgency_DataAccess
	 */
	public final java.util.List<da.proxies.Label> getUrgency_DataAccess() throws com.mendix.core.CoreException
	{
		return getUrgency_DataAccess(getContext());
	}

	/**
	 * @param context
	 * @return value of Urgency_DataAccess
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<da.proxies.Label> getUrgency_DataAccess(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<da.proxies.Label> result = new java.util.ArrayList<da.proxies.Label>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Urgency_DataAccess.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(da.proxies.Label.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Urgency_DataAccess
	 * @param urgency_dataaccess
	 */
	public final void setUrgency_DataAccess(java.util.List<da.proxies.Label> urgency_dataaccess)
	{
		setUrgency_DataAccess(getContext(), urgency_dataaccess);
	}

	/**
	 * Set value of Urgency_DataAccess
	 * @param context
	 * @param urgency_dataaccess
	 */
	public final void setUrgency_DataAccess(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<da.proxies.Label> urgency_dataaccess)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (da.proxies.Label proxyObject : urgency_dataaccess)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Urgency_DataAccess.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return urgencyMendixObject;
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
			final slm.proxies.Urgency that = (slm.proxies.Urgency) obj;
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
		return "SLM.Urgency";
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
