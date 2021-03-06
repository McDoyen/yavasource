// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies;

public class JDBCSetting
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject jDBCSettingMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "APMAgent.JDBCSetting";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Description("Description"),
		JDBCUser("JDBCUser"),
		JDBCEncryptedPassword("JDBCEncryptedPassword"),
		JDBCURL("JDBCURL"),
		JDBCStatementSeparator("JDBCStatementSeparator"),
		JDBCEchoStatement("JDBCEchoStatement"),
		JDBCEchoRows("JDBCEchoRows");

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

	public JDBCSetting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "APMAgent.JDBCSetting"));
	}

	protected JDBCSetting(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject jDBCSettingMendixObject)
	{
		if (jDBCSettingMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("APMAgent.JDBCSetting", jDBCSettingMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a APMAgent.JDBCSetting");

		this.jDBCSettingMendixObject = jDBCSettingMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'JDBCSetting.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static apmagent.proxies.JDBCSetting initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return apmagent.proxies.JDBCSetting.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static apmagent.proxies.JDBCSetting initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new apmagent.proxies.JDBCSetting(context, mendixObject);
	}

	public static apmagent.proxies.JDBCSetting load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return apmagent.proxies.JDBCSetting.initialize(context, mendixObject);
	}

	public static java.util.List<apmagent.proxies.JDBCSetting> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<apmagent.proxies.JDBCSetting> result = new java.util.ArrayList<apmagent.proxies.JDBCSetting>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//APMAgent.JDBCSetting" + xpathConstraint))
			result.add(apmagent.proxies.JDBCSetting.initialize(context, obj));
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
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of JDBCUser
	 */
	public final java.lang.String getJDBCUser()
	{
		return getJDBCUser(getContext());
	}

	/**
	 * @param context
	 * @return value of JDBCUser
	 */
	public final java.lang.String getJDBCUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JDBCUser.toString());
	}

	/**
	 * Set value of JDBCUser
	 * @param jdbcuser
	 */
	public final void setJDBCUser(java.lang.String jdbcuser)
	{
		setJDBCUser(getContext(), jdbcuser);
	}

	/**
	 * Set value of JDBCUser
	 * @param context
	 * @param jdbcuser
	 */
	public final void setJDBCUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String jdbcuser)
	{
		getMendixObject().setValue(context, MemberNames.JDBCUser.toString(), jdbcuser);
	}

	/**
	 * @return value of JDBCEncryptedPassword
	 */
	public final java.lang.String getJDBCEncryptedPassword()
	{
		return getJDBCEncryptedPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of JDBCEncryptedPassword
	 */
	public final java.lang.String getJDBCEncryptedPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JDBCEncryptedPassword.toString());
	}

	/**
	 * Set value of JDBCEncryptedPassword
	 * @param jdbcencryptedpassword
	 */
	public final void setJDBCEncryptedPassword(java.lang.String jdbcencryptedpassword)
	{
		setJDBCEncryptedPassword(getContext(), jdbcencryptedpassword);
	}

	/**
	 * Set value of JDBCEncryptedPassword
	 * @param context
	 * @param jdbcencryptedpassword
	 */
	public final void setJDBCEncryptedPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String jdbcencryptedpassword)
	{
		getMendixObject().setValue(context, MemberNames.JDBCEncryptedPassword.toString(), jdbcencryptedpassword);
	}

	/**
	 * @return value of JDBCURL
	 */
	public final java.lang.String getJDBCURL()
	{
		return getJDBCURL(getContext());
	}

	/**
	 * @param context
	 * @return value of JDBCURL
	 */
	public final java.lang.String getJDBCURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JDBCURL.toString());
	}

	/**
	 * Set value of JDBCURL
	 * @param jdbcurl
	 */
	public final void setJDBCURL(java.lang.String jdbcurl)
	{
		setJDBCURL(getContext(), jdbcurl);
	}

	/**
	 * Set value of JDBCURL
	 * @param context
	 * @param jdbcurl
	 */
	public final void setJDBCURL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String jdbcurl)
	{
		getMendixObject().setValue(context, MemberNames.JDBCURL.toString(), jdbcurl);
	}

	/**
	 * @return value of JDBCStatementSeparator
	 */
	public final java.lang.String getJDBCStatementSeparator()
	{
		return getJDBCStatementSeparator(getContext());
	}

	/**
	 * @param context
	 * @return value of JDBCStatementSeparator
	 */
	public final java.lang.String getJDBCStatementSeparator(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JDBCStatementSeparator.toString());
	}

	/**
	 * Set value of JDBCStatementSeparator
	 * @param jdbcstatementseparator
	 */
	public final void setJDBCStatementSeparator(java.lang.String jdbcstatementseparator)
	{
		setJDBCStatementSeparator(getContext(), jdbcstatementseparator);
	}

	/**
	 * Set value of JDBCStatementSeparator
	 * @param context
	 * @param jdbcstatementseparator
	 */
	public final void setJDBCStatementSeparator(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String jdbcstatementseparator)
	{
		getMendixObject().setValue(context, MemberNames.JDBCStatementSeparator.toString(), jdbcstatementseparator);
	}

	/**
	 * @return value of JDBCEchoStatement
	 */
	public final java.lang.Boolean getJDBCEchoStatement()
	{
		return getJDBCEchoStatement(getContext());
	}

	/**
	 * @param context
	 * @return value of JDBCEchoStatement
	 */
	public final java.lang.Boolean getJDBCEchoStatement(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.JDBCEchoStatement.toString());
	}

	/**
	 * Set value of JDBCEchoStatement
	 * @param jdbcechostatement
	 */
	public final void setJDBCEchoStatement(java.lang.Boolean jdbcechostatement)
	{
		setJDBCEchoStatement(getContext(), jdbcechostatement);
	}

	/**
	 * Set value of JDBCEchoStatement
	 * @param context
	 * @param jdbcechostatement
	 */
	public final void setJDBCEchoStatement(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean jdbcechostatement)
	{
		getMendixObject().setValue(context, MemberNames.JDBCEchoStatement.toString(), jdbcechostatement);
	}

	/**
	 * @return value of JDBCEchoRows
	 */
	public final java.lang.Boolean getJDBCEchoRows()
	{
		return getJDBCEchoRows(getContext());
	}

	/**
	 * @param context
	 * @return value of JDBCEchoRows
	 */
	public final java.lang.Boolean getJDBCEchoRows(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.JDBCEchoRows.toString());
	}

	/**
	 * Set value of JDBCEchoRows
	 * @param jdbcechorows
	 */
	public final void setJDBCEchoRows(java.lang.Boolean jdbcechorows)
	{
		setJDBCEchoRows(getContext(), jdbcechorows);
	}

	/**
	 * Set value of JDBCEchoRows
	 * @param context
	 * @param jdbcechorows
	 */
	public final void setJDBCEchoRows(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean jdbcechorows)
	{
		getMendixObject().setValue(context, MemberNames.JDBCEchoRows.toString(), jdbcechorows);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return jDBCSettingMendixObject;
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
			final apmagent.proxies.JDBCSetting that = (apmagent.proxies.JDBCSetting) obj;
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
		return "APMAgent.JDBCSetting";
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
