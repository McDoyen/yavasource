// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendix.proxies;

/**
 * 1090790 user-customizable columns (new entity "gridsettings" to store customized grid data for widget)
 */
public class GridSettings
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject gridSettingsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Mendix.GridSettings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		GridID("GridID"),
		Settings("Settings"),
		GridSettings_Account("Mendix.GridSettings_Account");

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

	public GridSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Mendix.GridSettings"));
	}

	protected GridSettings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject gridSettingsMendixObject)
	{
		if (gridSettingsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Mendix.GridSettings", gridSettingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Mendix.GridSettings");

		this.gridSettingsMendixObject = gridSettingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'GridSettings.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mendix.proxies.GridSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendix.proxies.GridSettings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mendix.proxies.GridSettings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendix.proxies.GridSettings(context, mendixObject);
	}

	public static mendix.proxies.GridSettings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendix.proxies.GridSettings.initialize(context, mendixObject);
	}

	public static java.util.List<mendix.proxies.GridSettings> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mendix.proxies.GridSettings> result = new java.util.ArrayList<mendix.proxies.GridSettings>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Mendix.GridSettings" + xpathConstraint))
			result.add(mendix.proxies.GridSettings.initialize(context, obj));
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
	 * @return value of GridID
	 */
	public final java.lang.String getGridID()
	{
		return getGridID(getContext());
	}

	/**
	 * @param context
	 * @return value of GridID
	 */
	public final java.lang.String getGridID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.GridID.toString());
	}

	/**
	 * Set value of GridID
	 * @param gridid
	 */
	public final void setGridID(java.lang.String gridid)
	{
		setGridID(getContext(), gridid);
	}

	/**
	 * Set value of GridID
	 * @param context
	 * @param gridid
	 */
	public final void setGridID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String gridid)
	{
		getMendixObject().setValue(context, MemberNames.GridID.toString(), gridid);
	}

	/**
	 * @return value of Settings
	 */
	public final java.lang.String getSettings()
	{
		return getSettings(getContext());
	}

	/**
	 * @param context
	 * @return value of Settings
	 */
	public final java.lang.String getSettings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Settings.toString());
	}

	/**
	 * Set value of Settings
	 * @param settings
	 */
	public final void setSettings(java.lang.String settings)
	{
		setSettings(getContext(), settings);
	}

	/**
	 * Set value of Settings
	 * @param context
	 * @param settings
	 */
	public final void setSettings(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String settings)
	{
		getMendixObject().setValue(context, MemberNames.Settings.toString(), settings);
	}

	/**
	 * @return value of GridSettings_Account
	 */
	public final mendix.proxies.Account getGridSettings_Account() throws com.mendix.core.CoreException
	{
		return getGridSettings_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of GridSettings_Account
	 */
	public final mendix.proxies.Account getGridSettings_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendix.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.GridSettings_Account.toString());
		if (identifier != null)
			result = mendix.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of GridSettings_Account
	 * @param gridsettings_account
	 */
	public final void setGridSettings_Account(mendix.proxies.Account gridsettings_account)
	{
		setGridSettings_Account(getContext(), gridsettings_account);
	}

	/**
	 * Set value of GridSettings_Account
	 * @param context
	 * @param gridsettings_account
	 */
	public final void setGridSettings_Account(com.mendix.systemwideinterfaces.core.IContext context, mendix.proxies.Account gridsettings_account)
	{
		if (gridsettings_account == null)
			getMendixObject().setValue(context, MemberNames.GridSettings_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.GridSettings_Account.toString(), gridsettings_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return gridSettingsMendixObject;
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
			final mendix.proxies.GridSettings that = (mendix.proxies.GridSettings) obj;
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
		return "Mendix.GridSettings";
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