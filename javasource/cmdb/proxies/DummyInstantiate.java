// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cmdb.proxies;

public class DummyInstantiate
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dummyInstantiateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CMDB.DummyInstantiate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Start("Start"),
		Stop("Stop"),
		SetCatalog("SetCatalog"),
		DummyInstantiate_ConfigurationItem("CMDB.DummyInstantiate_ConfigurationItem");

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

	public DummyInstantiate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CMDB.DummyInstantiate"));
	}

	protected DummyInstantiate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dummyInstantiateMendixObject)
	{
		if (dummyInstantiateMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CMDB.DummyInstantiate", dummyInstantiateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CMDB.DummyInstantiate");

		this.dummyInstantiateMendixObject = dummyInstantiateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DummyInstantiate.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static cmdb.proxies.DummyInstantiate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return cmdb.proxies.DummyInstantiate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static cmdb.proxies.DummyInstantiate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new cmdb.proxies.DummyInstantiate(context, mendixObject);
	}

	public static cmdb.proxies.DummyInstantiate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return cmdb.proxies.DummyInstantiate.initialize(context, mendixObject);
	}

	public static java.util.List<cmdb.proxies.DummyInstantiate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<cmdb.proxies.DummyInstantiate> result = new java.util.ArrayList<cmdb.proxies.DummyInstantiate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CMDB.DummyInstantiate" + xpathConstraint))
			result.add(cmdb.proxies.DummyInstantiate.initialize(context, obj));
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
	 * @return value of Start
	 */
	public final java.lang.Integer getStart()
	{
		return getStart(getContext());
	}

	/**
	 * @param context
	 * @return value of Start
	 */
	public final java.lang.Integer getStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Start.toString());
	}

	/**
	 * Set value of Start
	 * @param start
	 */
	public final void setStart(java.lang.Integer start)
	{
		setStart(getContext(), start);
	}

	/**
	 * Set value of Start
	 * @param context
	 * @param start
	 */
	public final void setStart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer start)
	{
		getMendixObject().setValue(context, MemberNames.Start.toString(), start);
	}

	/**
	 * @return value of Stop
	 */
	public final java.lang.Integer getStop()
	{
		return getStop(getContext());
	}

	/**
	 * @param context
	 * @return value of Stop
	 */
	public final java.lang.Integer getStop(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Stop.toString());
	}

	/**
	 * Set value of Stop
	 * @param stop
	 */
	public final void setStop(java.lang.Integer stop)
	{
		setStop(getContext(), stop);
	}

	/**
	 * Set value of Stop
	 * @param context
	 * @param stop
	 */
	public final void setStop(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer stop)
	{
		getMendixObject().setValue(context, MemberNames.Stop.toString(), stop);
	}

	/**
	 * @return value of SetCatalog
	 */
	public final java.lang.Boolean getSetCatalog()
	{
		return getSetCatalog(getContext());
	}

	/**
	 * @param context
	 * @return value of SetCatalog
	 */
	public final java.lang.Boolean getSetCatalog(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SetCatalog.toString());
	}

	/**
	 * Set value of SetCatalog
	 * @param setcatalog
	 */
	public final void setSetCatalog(java.lang.Boolean setcatalog)
	{
		setSetCatalog(getContext(), setcatalog);
	}

	/**
	 * Set value of SetCatalog
	 * @param context
	 * @param setcatalog
	 */
	public final void setSetCatalog(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean setcatalog)
	{
		getMendixObject().setValue(context, MemberNames.SetCatalog.toString(), setcatalog);
	}

	/**
	 * @return value of DummyInstantiate_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getDummyInstantiate_ConfigurationItem() throws com.mendix.core.CoreException
	{
		return getDummyInstantiate_ConfigurationItem(getContext());
	}

	/**
	 * @param context
	 * @return value of DummyInstantiate_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getDummyInstantiate_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.ConfigurationItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DummyInstantiate_ConfigurationItem.toString());
		if (identifier != null)
			result = cmdb.proxies.ConfigurationItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DummyInstantiate_ConfigurationItem
	 * @param dummyinstantiate_configurationitem
	 */
	public final void setDummyInstantiate_ConfigurationItem(cmdb.proxies.ConfigurationItem dummyinstantiate_configurationitem)
	{
		setDummyInstantiate_ConfigurationItem(getContext(), dummyinstantiate_configurationitem);
	}

	/**
	 * Set value of DummyInstantiate_ConfigurationItem
	 * @param context
	 * @param dummyinstantiate_configurationitem
	 */
	public final void setDummyInstantiate_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.ConfigurationItem dummyinstantiate_configurationitem)
	{
		if (dummyinstantiate_configurationitem == null)
			getMendixObject().setValue(context, MemberNames.DummyInstantiate_ConfigurationItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DummyInstantiate_ConfigurationItem.toString(), dummyinstantiate_configurationitem.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dummyInstantiateMendixObject;
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
			final cmdb.proxies.DummyInstantiate that = (cmdb.proxies.DummyInstantiate) obj;
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
		return "CMDB.DummyInstantiate";
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
