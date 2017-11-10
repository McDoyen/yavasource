// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mobile.proxies;

public class SparepartHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sparepartHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Mobile.SparepartHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SparepartHelper_ConfigurationItem("Mobile.SparepartHelper_ConfigurationItem"),
		SparepartHelper_AffectedCI("Mobile.SparepartHelper_AffectedCI");

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

	public SparepartHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Mobile.SparepartHelper"));
	}

	protected SparepartHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sparepartHelperMendixObject)
	{
		if (sparepartHelperMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Mobile.SparepartHelper", sparepartHelperMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Mobile.SparepartHelper");

		this.sparepartHelperMendixObject = sparepartHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SparepartHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mobile.proxies.SparepartHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mobile.proxies.SparepartHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mobile.proxies.SparepartHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mobile.proxies.SparepartHelper(context, mendixObject);
	}

	public static mobile.proxies.SparepartHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mobile.proxies.SparepartHelper.initialize(context, mendixObject);
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
	 * @return value of SparepartHelper_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getSparepartHelper_ConfigurationItem() throws com.mendix.core.CoreException
	{
		return getSparepartHelper_ConfigurationItem(getContext());
	}

	/**
	 * @param context
	 * @return value of SparepartHelper_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getSparepartHelper_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.ConfigurationItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SparepartHelper_ConfigurationItem.toString());
		if (identifier != null)
			result = cmdb.proxies.ConfigurationItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SparepartHelper_ConfigurationItem
	 * @param spareparthelper_configurationitem
	 */
	public final void setSparepartHelper_ConfigurationItem(cmdb.proxies.ConfigurationItem spareparthelper_configurationitem)
	{
		setSparepartHelper_ConfigurationItem(getContext(), spareparthelper_configurationitem);
	}

	/**
	 * Set value of SparepartHelper_ConfigurationItem
	 * @param context
	 * @param spareparthelper_configurationitem
	 */
	public final void setSparepartHelper_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.ConfigurationItem spareparthelper_configurationitem)
	{
		if (spareparthelper_configurationitem == null)
			getMendixObject().setValue(context, MemberNames.SparepartHelper_ConfigurationItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SparepartHelper_ConfigurationItem.toString(), spareparthelper_configurationitem.getMendixObject().getId());
	}

	/**
	 * @return value of SparepartHelper_AffectedCI
	 */
	public final cmdb.proxies.AffectedCI getSparepartHelper_AffectedCI() throws com.mendix.core.CoreException
	{
		return getSparepartHelper_AffectedCI(getContext());
	}

	/**
	 * @param context
	 * @return value of SparepartHelper_AffectedCI
	 */
	public final cmdb.proxies.AffectedCI getSparepartHelper_AffectedCI(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.AffectedCI result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SparepartHelper_AffectedCI.toString());
		if (identifier != null)
			result = cmdb.proxies.AffectedCI.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SparepartHelper_AffectedCI
	 * @param spareparthelper_affectedci
	 */
	public final void setSparepartHelper_AffectedCI(cmdb.proxies.AffectedCI spareparthelper_affectedci)
	{
		setSparepartHelper_AffectedCI(getContext(), spareparthelper_affectedci);
	}

	/**
	 * Set value of SparepartHelper_AffectedCI
	 * @param context
	 * @param spareparthelper_affectedci
	 */
	public final void setSparepartHelper_AffectedCI(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.AffectedCI spareparthelper_affectedci)
	{
		if (spareparthelper_affectedci == null)
			getMendixObject().setValue(context, MemberNames.SparepartHelper_AffectedCI.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SparepartHelper_AffectedCI.toString(), spareparthelper_affectedci.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sparepartHelperMendixObject;
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
			final mobile.proxies.SparepartHelper that = (mobile.proxies.SparepartHelper) obj;
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
		return "Mobile.SparepartHelper";
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
