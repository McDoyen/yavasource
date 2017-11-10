// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package approval.proxies;

public class OrganisationRoleApproval
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject organisationRoleApprovalMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Approval.OrganisationRoleApproval";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ForAnyRole("ForAnyRole"),
		OrganisationRoleApproval_CustomerApprovalTemplate("Approval.OrganisationRoleApproval_CustomerApprovalTemplate"),
		OrganisationRoleApproval_ForOrganisation("Approval.OrganisationRoleApproval_ForOrganisation"),
		OrganisationRoleApproval_ForBusinessRole("Approval.OrganisationRoleApproval_ForBusinessRole"),
		OrganisationRoleApproval_ByOrganisation("Approval.OrganisationRoleApproval_ByOrganisation"),
		OrganisationRoleApproval_ByBusinessRole("Approval.OrganisationRoleApproval_ByBusinessRole");

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

	public OrganisationRoleApproval(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Approval.OrganisationRoleApproval"));
	}

	protected OrganisationRoleApproval(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject organisationRoleApprovalMendixObject)
	{
		if (organisationRoleApprovalMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Approval.OrganisationRoleApproval", organisationRoleApprovalMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Approval.OrganisationRoleApproval");

		this.organisationRoleApprovalMendixObject = organisationRoleApprovalMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'OrganisationRoleApproval.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static approval.proxies.OrganisationRoleApproval initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return approval.proxies.OrganisationRoleApproval.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static approval.proxies.OrganisationRoleApproval initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new approval.proxies.OrganisationRoleApproval(context, mendixObject);
	}

	public static approval.proxies.OrganisationRoleApproval load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return approval.proxies.OrganisationRoleApproval.initialize(context, mendixObject);
	}

	public static java.util.List<approval.proxies.OrganisationRoleApproval> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<approval.proxies.OrganisationRoleApproval> result = new java.util.ArrayList<approval.proxies.OrganisationRoleApproval>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Approval.OrganisationRoleApproval" + xpathConstraint))
			result.add(approval.proxies.OrganisationRoleApproval.initialize(context, obj));
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
	 * @return value of ForAnyRole
	 */
	public final java.lang.Boolean getForAnyRole()
	{
		return getForAnyRole(getContext());
	}

	/**
	 * @param context
	 * @return value of ForAnyRole
	 */
	public final java.lang.Boolean getForAnyRole(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ForAnyRole.toString());
	}

	/**
	 * Set value of ForAnyRole
	 * @param foranyrole
	 */
	public final void setForAnyRole(java.lang.Boolean foranyrole)
	{
		setForAnyRole(getContext(), foranyrole);
	}

	/**
	 * Set value of ForAnyRole
	 * @param context
	 * @param foranyrole
	 */
	public final void setForAnyRole(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean foranyrole)
	{
		getMendixObject().setValue(context, MemberNames.ForAnyRole.toString(), foranyrole);
	}

	/**
	 * @return value of OrganisationRoleApproval_CustomerApprovalTemplate
	 */
	public final approval.proxies.CustomerApprovalTemplate getOrganisationRoleApproval_CustomerApprovalTemplate() throws com.mendix.core.CoreException
	{
		return getOrganisationRoleApproval_CustomerApprovalTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganisationRoleApproval_CustomerApprovalTemplate
	 */
	public final approval.proxies.CustomerApprovalTemplate getOrganisationRoleApproval_CustomerApprovalTemplate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		approval.proxies.CustomerApprovalTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrganisationRoleApproval_CustomerApprovalTemplate.toString());
		if (identifier != null)
			result = approval.proxies.CustomerApprovalTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OrganisationRoleApproval_CustomerApprovalTemplate
	 * @param organisationroleapproval_customerapprovaltemplate
	 */
	public final void setOrganisationRoleApproval_CustomerApprovalTemplate(approval.proxies.CustomerApprovalTemplate organisationroleapproval_customerapprovaltemplate)
	{
		setOrganisationRoleApproval_CustomerApprovalTemplate(getContext(), organisationroleapproval_customerapprovaltemplate);
	}

	/**
	 * Set value of OrganisationRoleApproval_CustomerApprovalTemplate
	 * @param context
	 * @param organisationroleapproval_customerapprovaltemplate
	 */
	public final void setOrganisationRoleApproval_CustomerApprovalTemplate(com.mendix.systemwideinterfaces.core.IContext context, approval.proxies.CustomerApprovalTemplate organisationroleapproval_customerapprovaltemplate)
	{
		if (organisationroleapproval_customerapprovaltemplate == null)
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_CustomerApprovalTemplate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_CustomerApprovalTemplate.toString(), organisationroleapproval_customerapprovaltemplate.getMendixObject().getId());
	}

	/**
	 * @return value of OrganisationRoleApproval_ForOrganisation
	 */
	public final nap.proxies.Organisation getOrganisationRoleApproval_ForOrganisation() throws com.mendix.core.CoreException
	{
		return getOrganisationRoleApproval_ForOrganisation(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganisationRoleApproval_ForOrganisation
	 */
	public final nap.proxies.Organisation getOrganisationRoleApproval_ForOrganisation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Organisation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrganisationRoleApproval_ForOrganisation.toString());
		if (identifier != null)
			result = nap.proxies.Organisation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OrganisationRoleApproval_ForOrganisation
	 * @param organisationroleapproval_fororganisation
	 */
	public final void setOrganisationRoleApproval_ForOrganisation(nap.proxies.Organisation organisationroleapproval_fororganisation)
	{
		setOrganisationRoleApproval_ForOrganisation(getContext(), organisationroleapproval_fororganisation);
	}

	/**
	 * Set value of OrganisationRoleApproval_ForOrganisation
	 * @param context
	 * @param organisationroleapproval_fororganisation
	 */
	public final void setOrganisationRoleApproval_ForOrganisation(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Organisation organisationroleapproval_fororganisation)
	{
		if (organisationroleapproval_fororganisation == null)
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_ForOrganisation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_ForOrganisation.toString(), organisationroleapproval_fororganisation.getMendixObject().getId());
	}

	/**
	 * @return value of OrganisationRoleApproval_ForBusinessRole
	 */
	public final nap.proxies.BusinessRole getOrganisationRoleApproval_ForBusinessRole() throws com.mendix.core.CoreException
	{
		return getOrganisationRoleApproval_ForBusinessRole(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganisationRoleApproval_ForBusinessRole
	 */
	public final nap.proxies.BusinessRole getOrganisationRoleApproval_ForBusinessRole(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.BusinessRole result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrganisationRoleApproval_ForBusinessRole.toString());
		if (identifier != null)
			result = nap.proxies.BusinessRole.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OrganisationRoleApproval_ForBusinessRole
	 * @param organisationroleapproval_forbusinessrole
	 */
	public final void setOrganisationRoleApproval_ForBusinessRole(nap.proxies.BusinessRole organisationroleapproval_forbusinessrole)
	{
		setOrganisationRoleApproval_ForBusinessRole(getContext(), organisationroleapproval_forbusinessrole);
	}

	/**
	 * Set value of OrganisationRoleApproval_ForBusinessRole
	 * @param context
	 * @param organisationroleapproval_forbusinessrole
	 */
	public final void setOrganisationRoleApproval_ForBusinessRole(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.BusinessRole organisationroleapproval_forbusinessrole)
	{
		if (organisationroleapproval_forbusinessrole == null)
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_ForBusinessRole.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_ForBusinessRole.toString(), organisationroleapproval_forbusinessrole.getMendixObject().getId());
	}

	/**
	 * @return value of OrganisationRoleApproval_ByOrganisation
	 */
	public final nap.proxies.Organisation getOrganisationRoleApproval_ByOrganisation() throws com.mendix.core.CoreException
	{
		return getOrganisationRoleApproval_ByOrganisation(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganisationRoleApproval_ByOrganisation
	 */
	public final nap.proxies.Organisation getOrganisationRoleApproval_ByOrganisation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Organisation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrganisationRoleApproval_ByOrganisation.toString());
		if (identifier != null)
			result = nap.proxies.Organisation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OrganisationRoleApproval_ByOrganisation
	 * @param organisationroleapproval_byorganisation
	 */
	public final void setOrganisationRoleApproval_ByOrganisation(nap.proxies.Organisation organisationroleapproval_byorganisation)
	{
		setOrganisationRoleApproval_ByOrganisation(getContext(), organisationroleapproval_byorganisation);
	}

	/**
	 * Set value of OrganisationRoleApproval_ByOrganisation
	 * @param context
	 * @param organisationroleapproval_byorganisation
	 */
	public final void setOrganisationRoleApproval_ByOrganisation(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Organisation organisationroleapproval_byorganisation)
	{
		if (organisationroleapproval_byorganisation == null)
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_ByOrganisation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_ByOrganisation.toString(), organisationroleapproval_byorganisation.getMendixObject().getId());
	}

	/**
	 * @return value of OrganisationRoleApproval_ByBusinessRole
	 */
	public final nap.proxies.BusinessRole getOrganisationRoleApproval_ByBusinessRole() throws com.mendix.core.CoreException
	{
		return getOrganisationRoleApproval_ByBusinessRole(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganisationRoleApproval_ByBusinessRole
	 */
	public final nap.proxies.BusinessRole getOrganisationRoleApproval_ByBusinessRole(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.BusinessRole result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrganisationRoleApproval_ByBusinessRole.toString());
		if (identifier != null)
			result = nap.proxies.BusinessRole.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OrganisationRoleApproval_ByBusinessRole
	 * @param organisationroleapproval_bybusinessrole
	 */
	public final void setOrganisationRoleApproval_ByBusinessRole(nap.proxies.BusinessRole organisationroleapproval_bybusinessrole)
	{
		setOrganisationRoleApproval_ByBusinessRole(getContext(), organisationroleapproval_bybusinessrole);
	}

	/**
	 * Set value of OrganisationRoleApproval_ByBusinessRole
	 * @param context
	 * @param organisationroleapproval_bybusinessrole
	 */
	public final void setOrganisationRoleApproval_ByBusinessRole(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.BusinessRole organisationroleapproval_bybusinessrole)
	{
		if (organisationroleapproval_bybusinessrole == null)
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_ByBusinessRole.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OrganisationRoleApproval_ByBusinessRole.toString(), organisationroleapproval_bybusinessrole.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return organisationRoleApprovalMendixObject;
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
			final approval.proxies.OrganisationRoleApproval that = (approval.proxies.OrganisationRoleApproval) obj;
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
		return "Approval.OrganisationRoleApproval";
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
