// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package core_security.proxies;

public class PasswordHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject passwordHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "core_security.PasswordHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CurrentPassword("CurrentPassword"),
		NewPassword("NewPassword"),
		DaysUntilExpired("DaysUntilExpired"),
		PasswordHelper_Account("core_security.PasswordHelper_Account");

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

	public PasswordHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "core_security.PasswordHelper"));
	}

	protected PasswordHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject passwordHelperMendixObject)
	{
		if (passwordHelperMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("core_security.PasswordHelper", passwordHelperMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a core_security.PasswordHelper");

		this.passwordHelperMendixObject = passwordHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PasswordHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static core_security.proxies.PasswordHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return core_security.proxies.PasswordHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static core_security.proxies.PasswordHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new core_security.proxies.PasswordHelper(context, mendixObject);
	}

	public static core_security.proxies.PasswordHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return core_security.proxies.PasswordHelper.initialize(context, mendixObject);
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
	 * @return value of CurrentPassword
	 */
	public final java.lang.String getCurrentPassword()
	{
		return getCurrentPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentPassword
	 */
	public final java.lang.String getCurrentPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CurrentPassword.toString());
	}

	/**
	 * Set value of CurrentPassword
	 * @param currentpassword
	 */
	public final void setCurrentPassword(java.lang.String currentpassword)
	{
		setCurrentPassword(getContext(), currentpassword);
	}

	/**
	 * Set value of CurrentPassword
	 * @param context
	 * @param currentpassword
	 */
	public final void setCurrentPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String currentpassword)
	{
		getMendixObject().setValue(context, MemberNames.CurrentPassword.toString(), currentpassword);
	}

	/**
	 * @return value of NewPassword
	 */
	public final java.lang.String getNewPassword()
	{
		return getNewPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of NewPassword
	 */
	public final java.lang.String getNewPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NewPassword.toString());
	}

	/**
	 * Set value of NewPassword
	 * @param newpassword
	 */
	public final void setNewPassword(java.lang.String newpassword)
	{
		setNewPassword(getContext(), newpassword);
	}

	/**
	 * Set value of NewPassword
	 * @param context
	 * @param newpassword
	 */
	public final void setNewPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String newpassword)
	{
		getMendixObject().setValue(context, MemberNames.NewPassword.toString(), newpassword);
	}

	/**
	 * @return value of DaysUntilExpired
	 */
	public final java.lang.Double getDaysUntilExpired()
	{
		return getDaysUntilExpired(getContext());
	}

	/**
	 * @param context
	 * @return value of DaysUntilExpired
	 */
	public final java.lang.Double getDaysUntilExpired(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.DaysUntilExpired.toString());
	}

	/**
	 * Set value of DaysUntilExpired
	 * @param daysuntilexpired
	 */
	public final void setDaysUntilExpired(java.lang.Double daysuntilexpired)
	{
		setDaysUntilExpired(getContext(), daysuntilexpired);
	}

	/**
	 * Set value of DaysUntilExpired
	 * @param context
	 * @param daysuntilexpired
	 */
	public final void setDaysUntilExpired(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double daysuntilexpired)
	{
		getMendixObject().setValue(context, MemberNames.DaysUntilExpired.toString(), daysuntilexpired);
	}

	/**
	 * @return value of PasswordHelper_Account
	 */
	public final mendix.proxies.Account getPasswordHelper_Account() throws com.mendix.core.CoreException
	{
		return getPasswordHelper_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of PasswordHelper_Account
	 */
	public final mendix.proxies.Account getPasswordHelper_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendix.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PasswordHelper_Account.toString());
		if (identifier != null)
			result = mendix.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PasswordHelper_Account
	 * @param passwordhelper_account
	 */
	public final void setPasswordHelper_Account(mendix.proxies.Account passwordhelper_account)
	{
		setPasswordHelper_Account(getContext(), passwordhelper_account);
	}

	/**
	 * Set value of PasswordHelper_Account
	 * @param context
	 * @param passwordhelper_account
	 */
	public final void setPasswordHelper_Account(com.mendix.systemwideinterfaces.core.IContext context, mendix.proxies.Account passwordhelper_account)
	{
		if (passwordhelper_account == null)
			getMendixObject().setValue(context, MemberNames.PasswordHelper_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PasswordHelper_Account.toString(), passwordhelper_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return passwordHelperMendixObject;
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
			final core_security.proxies.PasswordHelper that = (core_security.proxies.PasswordHelper) obj;
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
		return "core_security.PasswordHelper";
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
