// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package serviceroutes.proxies;

public class ServiceRelations
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject serviceRelationsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceRoutes.ServiceRelations";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ServiceRelations_ServiceParent("ServiceRoutes.ServiceRelations_ServiceParent"),
		ServiceRelations_ServiceChild("ServiceRoutes.ServiceRelations_ServiceChild");

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

	public ServiceRelations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceRoutes.ServiceRelations"));
	}

	protected ServiceRelations(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject serviceRelationsMendixObject)
	{
		if (serviceRelationsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ServiceRoutes.ServiceRelations", serviceRelationsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceRoutes.ServiceRelations");

		this.serviceRelationsMendixObject = serviceRelationsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ServiceRelations.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static serviceroutes.proxies.ServiceRelations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return serviceroutes.proxies.ServiceRelations.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static serviceroutes.proxies.ServiceRelations initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new serviceroutes.proxies.ServiceRelations(context, mendixObject);
	}

	public static serviceroutes.proxies.ServiceRelations load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return serviceroutes.proxies.ServiceRelations.initialize(context, mendixObject);
	}

	public static java.util.List<serviceroutes.proxies.ServiceRelations> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<serviceroutes.proxies.ServiceRelations> result = new java.util.ArrayList<serviceroutes.proxies.ServiceRelations>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceRoutes.ServiceRelations" + xpathConstraint))
			result.add(serviceroutes.proxies.ServiceRelations.initialize(context, obj));
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
	 * @return value of ServiceRelations_ServiceParent
	 */
	public final slm.proxies.Service getServiceRelations_ServiceParent() throws com.mendix.core.CoreException
	{
		return getServiceRelations_ServiceParent(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceRelations_ServiceParent
	 */
	public final slm.proxies.Service getServiceRelations_ServiceParent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slm.proxies.Service result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ServiceRelations_ServiceParent.toString());
		if (identifier != null)
			result = slm.proxies.Service.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ServiceRelations_ServiceParent
	 * @param servicerelations_serviceparent
	 */
	public final void setServiceRelations_ServiceParent(slm.proxies.Service servicerelations_serviceparent)
	{
		setServiceRelations_ServiceParent(getContext(), servicerelations_serviceparent);
	}

	/**
	 * Set value of ServiceRelations_ServiceParent
	 * @param context
	 * @param servicerelations_serviceparent
	 */
	public final void setServiceRelations_ServiceParent(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.Service servicerelations_serviceparent)
	{
		if (servicerelations_serviceparent == null)
			getMendixObject().setValue(context, MemberNames.ServiceRelations_ServiceParent.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ServiceRelations_ServiceParent.toString(), servicerelations_serviceparent.getMendixObject().getId());
	}

	/**
	 * @return value of ServiceRelations_ServiceChild
	 */
	public final slm.proxies.Service getServiceRelations_ServiceChild() throws com.mendix.core.CoreException
	{
		return getServiceRelations_ServiceChild(getContext());
	}

	/**
	 * @param context
	 * @return value of ServiceRelations_ServiceChild
	 */
	public final slm.proxies.Service getServiceRelations_ServiceChild(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slm.proxies.Service result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ServiceRelations_ServiceChild.toString());
		if (identifier != null)
			result = slm.proxies.Service.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ServiceRelations_ServiceChild
	 * @param servicerelations_servicechild
	 */
	public final void setServiceRelations_ServiceChild(slm.proxies.Service servicerelations_servicechild)
	{
		setServiceRelations_ServiceChild(getContext(), servicerelations_servicechild);
	}

	/**
	 * Set value of ServiceRelations_ServiceChild
	 * @param context
	 * @param servicerelations_servicechild
	 */
	public final void setServiceRelations_ServiceChild(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.Service servicerelations_servicechild)
	{
		if (servicerelations_servicechild == null)
			getMendixObject().setValue(context, MemberNames.ServiceRelations_ServiceChild.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ServiceRelations_ServiceChild.toString(), servicerelations_servicechild.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return serviceRelationsMendixObject;
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
			final serviceroutes.proxies.ServiceRelations that = (serviceroutes.proxies.ServiceRelations) obj;
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
		return "ServiceRoutes.ServiceRelations";
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
