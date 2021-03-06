// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package genericuserfunctions.proxies;

public class UserSessionObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject userSessionObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GenericUserFunctions.UserSessionObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UserSessionObject_SelectableField("GenericUserFunctions.UserSessionObject_SelectableField"),
		Account_UserSessionObject("Mendix.Account_UserSessionObject");

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

	public UserSessionObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GenericUserFunctions.UserSessionObject"));
	}

	protected UserSessionObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject userSessionObjectMendixObject)
	{
		if (userSessionObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("GenericUserFunctions.UserSessionObject", userSessionObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GenericUserFunctions.UserSessionObject");

		this.userSessionObjectMendixObject = userSessionObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'UserSessionObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static genericuserfunctions.proxies.UserSessionObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return genericuserfunctions.proxies.UserSessionObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static genericuserfunctions.proxies.UserSessionObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new genericuserfunctions.proxies.UserSessionObject(context, mendixObject);
	}

	public static genericuserfunctions.proxies.UserSessionObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return genericuserfunctions.proxies.UserSessionObject.initialize(context, mendixObject);
	}

	public static java.util.List<genericuserfunctions.proxies.UserSessionObject> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<genericuserfunctions.proxies.UserSessionObject> result = new java.util.ArrayList<genericuserfunctions.proxies.UserSessionObject>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//GenericUserFunctions.UserSessionObject" + xpathConstraint))
			result.add(genericuserfunctions.proxies.UserSessionObject.initialize(context, obj));
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
	 * @return value of UserSessionObject_SelectableField
	 */
	public final queryrequests.proxies.SelectableField getUserSessionObject_SelectableField() throws com.mendix.core.CoreException
	{
		return getUserSessionObject_SelectableField(getContext());
	}

	/**
	 * @param context
	 * @return value of UserSessionObject_SelectableField
	 */
	public final queryrequests.proxies.SelectableField getUserSessionObject_SelectableField(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		queryrequests.proxies.SelectableField result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.UserSessionObject_SelectableField.toString());
		if (identifier != null)
			result = queryrequests.proxies.SelectableField.load(context, identifier);
		return result;
	}

	/**
	 * Set value of UserSessionObject_SelectableField
	 * @param usersessionobject_selectablefield
	 */
	public final void setUserSessionObject_SelectableField(queryrequests.proxies.SelectableField usersessionobject_selectablefield)
	{
		setUserSessionObject_SelectableField(getContext(), usersessionobject_selectablefield);
	}

	/**
	 * Set value of UserSessionObject_SelectableField
	 * @param context
	 * @param usersessionobject_selectablefield
	 */
	public final void setUserSessionObject_SelectableField(com.mendix.systemwideinterfaces.core.IContext context, queryrequests.proxies.SelectableField usersessionobject_selectablefield)
	{
		if (usersessionobject_selectablefield == null)
			getMendixObject().setValue(context, MemberNames.UserSessionObject_SelectableField.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.UserSessionObject_SelectableField.toString(), usersessionobject_selectablefield.getMendixObject().getId());
	}

	/**
	 * @return value of Account_UserSessionObject
	 */
	public final mendix.proxies.Account getAccount_UserSessionObject() throws com.mendix.core.CoreException
	{
		return getAccount_UserSessionObject(getContext());
	}

	/**
	 * @param context
	 * @return value of Account_UserSessionObject
	 */
	public final mendix.proxies.Account getAccount_UserSessionObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendix.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Account_UserSessionObject.toString());
		if (identifier != null)
			result = mendix.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Account_UserSessionObject
	 * @param account_usersessionobject
	 */
	public final void setAccount_UserSessionObject(mendix.proxies.Account account_usersessionobject)
	{
		setAccount_UserSessionObject(getContext(), account_usersessionobject);
	}

	/**
	 * Set value of Account_UserSessionObject
	 * @param context
	 * @param account_usersessionobject
	 */
	public final void setAccount_UserSessionObject(com.mendix.systemwideinterfaces.core.IContext context, mendix.proxies.Account account_usersessionobject)
	{
		if (account_usersessionobject == null)
			getMendixObject().setValue(context, MemberNames.Account_UserSessionObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Account_UserSessionObject.toString(), account_usersessionobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return userSessionObjectMendixObject;
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
			final genericuserfunctions.proxies.UserSessionObject that = (genericuserfunctions.proxies.UserSessionObject) obj;
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
		return "GenericUserFunctions.UserSessionObject";
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
