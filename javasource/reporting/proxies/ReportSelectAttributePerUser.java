// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package reporting.proxies;

public class ReportSelectAttributePerUser extends reporting.proxies.ReportSelectAttribute
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Reporting.ReportSelectAttributePerUser";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Order("Order"),
		OrderBy("OrderBy"),
		ReportSelectAttributePerUser_ReportSelect("Reporting.ReportSelectAttributePerUser_ReportSelect"),
		ReportSelectAttributePerUser_User("Reporting.ReportSelectAttributePerUser_User"),
		ReportSelectAttribute_SelectAttribute("Reporting.ReportSelectAttribute_SelectAttribute"),
		ReportSelectAttribute_ReportSelect("Reporting.ReportSelectAttribute_ReportSelect");

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

	public ReportSelectAttributePerUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Reporting.ReportSelectAttributePerUser"));
	}

	protected ReportSelectAttributePerUser(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject reportSelectAttributePerUserMendixObject)
	{
		super(context, reportSelectAttributePerUserMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Reporting.ReportSelectAttributePerUser", reportSelectAttributePerUserMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Reporting.ReportSelectAttributePerUser");
	}

	/**
	 * @deprecated Use 'ReportSelectAttributePerUser.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static reporting.proxies.ReportSelectAttributePerUser initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return reporting.proxies.ReportSelectAttributePerUser.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static reporting.proxies.ReportSelectAttributePerUser initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new reporting.proxies.ReportSelectAttributePerUser(context, mendixObject);
	}

	public static reporting.proxies.ReportSelectAttributePerUser load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return reporting.proxies.ReportSelectAttributePerUser.initialize(context, mendixObject);
	}

	public static java.util.List<reporting.proxies.ReportSelectAttributePerUser> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<reporting.proxies.ReportSelectAttributePerUser> result = new java.util.ArrayList<reporting.proxies.ReportSelectAttributePerUser>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Reporting.ReportSelectAttributePerUser" + xpathConstraint))
			result.add(reporting.proxies.ReportSelectAttributePerUser.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ReportSelectAttributePerUser_ReportSelect
	 */
	public final reporting.proxies.ReportSelect getReportSelectAttributePerUser_ReportSelect() throws com.mendix.core.CoreException
	{
		return getReportSelectAttributePerUser_ReportSelect(getContext());
	}

	/**
	 * @param context
	 * @return value of ReportSelectAttributePerUser_ReportSelect
	 */
	public final reporting.proxies.ReportSelect getReportSelectAttributePerUser_ReportSelect(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		reporting.proxies.ReportSelect result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReportSelectAttributePerUser_ReportSelect.toString());
		if (identifier != null)
			result = reporting.proxies.ReportSelect.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReportSelectAttributePerUser_ReportSelect
	 * @param reportselectattributeperuser_reportselect
	 */
	public final void setReportSelectAttributePerUser_ReportSelect(reporting.proxies.ReportSelect reportselectattributeperuser_reportselect)
	{
		setReportSelectAttributePerUser_ReportSelect(getContext(), reportselectattributeperuser_reportselect);
	}

	/**
	 * Set value of ReportSelectAttributePerUser_ReportSelect
	 * @param context
	 * @param reportselectattributeperuser_reportselect
	 */
	public final void setReportSelectAttributePerUser_ReportSelect(com.mendix.systemwideinterfaces.core.IContext context, reporting.proxies.ReportSelect reportselectattributeperuser_reportselect)
	{
		if (reportselectattributeperuser_reportselect == null)
			getMendixObject().setValue(context, MemberNames.ReportSelectAttributePerUser_ReportSelect.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReportSelectAttributePerUser_ReportSelect.toString(), reportselectattributeperuser_reportselect.getMendixObject().getId());
	}

	/**
	 * @return value of ReportSelectAttributePerUser_User
	 */
	public final system.proxies.User getReportSelectAttributePerUser_User() throws com.mendix.core.CoreException
	{
		return getReportSelectAttributePerUser_User(getContext());
	}

	/**
	 * @param context
	 * @return value of ReportSelectAttributePerUser_User
	 */
	public final system.proxies.User getReportSelectAttributePerUser_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReportSelectAttributePerUser_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReportSelectAttributePerUser_User
	 * @param reportselectattributeperuser_user
	 */
	public final void setReportSelectAttributePerUser_User(system.proxies.User reportselectattributeperuser_user)
	{
		setReportSelectAttributePerUser_User(getContext(), reportselectattributeperuser_user);
	}

	/**
	 * Set value of ReportSelectAttributePerUser_User
	 * @param context
	 * @param reportselectattributeperuser_user
	 */
	public final void setReportSelectAttributePerUser_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User reportselectattributeperuser_user)
	{
		if (reportselectattributeperuser_user == null)
			getMendixObject().setValue(context, MemberNames.ReportSelectAttributePerUser_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReportSelectAttributePerUser_User.toString(), reportselectattributeperuser_user.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final reporting.proxies.ReportSelectAttributePerUser that = (reporting.proxies.ReportSelectAttributePerUser) obj;
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
		return "Reporting.ReportSelectAttributePerUser";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
