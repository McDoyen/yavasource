// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceplanon.proxies;

public class Config
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject configMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfacePlanon.Config";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Days_RemoveLogging("Days_RemoveLogging");

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

	public Config(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfacePlanon.Config"));
	}

	protected Config(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject configMendixObject)
	{
		if (configMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfacePlanon.Config", configMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfacePlanon.Config");

		this.configMendixObject = configMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Config.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceplanon.proxies.Config initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceplanon.proxies.Config.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceplanon.proxies.Config initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceplanon.proxies.Config(context, mendixObject);
	}

	public static interfaceplanon.proxies.Config load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceplanon.proxies.Config.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceplanon.proxies.Config> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceplanon.proxies.Config> result = new java.util.ArrayList<interfaceplanon.proxies.Config>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfacePlanon.Config" + xpathConstraint))
			result.add(interfaceplanon.proxies.Config.initialize(context, obj));
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
	 * @return value of Days_RemoveLogging
	 */
	public final java.lang.Integer getDays_RemoveLogging()
	{
		return getDays_RemoveLogging(getContext());
	}

	/**
	 * @param context
	 * @return value of Days_RemoveLogging
	 */
	public final java.lang.Integer getDays_RemoveLogging(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Days_RemoveLogging.toString());
	}

	/**
	 * Set value of Days_RemoveLogging
	 * @param days_removelogging
	 */
	public final void setDays_RemoveLogging(java.lang.Integer days_removelogging)
	{
		setDays_RemoveLogging(getContext(), days_removelogging);
	}

	/**
	 * Set value of Days_RemoveLogging
	 * @param context
	 * @param days_removelogging
	 */
	public final void setDays_RemoveLogging(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer days_removelogging)
	{
		getMendixObject().setValue(context, MemberNames.Days_RemoveLogging.toString(), days_removelogging);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return configMendixObject;
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
			final interfaceplanon.proxies.Config that = (interfaceplanon.proxies.Config) obj;
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
		return "InterfacePlanon.Config";
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
