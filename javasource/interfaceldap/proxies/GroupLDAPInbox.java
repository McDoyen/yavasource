// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceldap.proxies;

public class GroupLDAPInbox extends interfaceldap.proxies.LDAPInbox
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceLDAP.GroupLDAPInbox";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Dn("Dn"),
		LDAPID("LDAPID"),
		ProcessingStatus("ProcessingStatus"),
		LDAPID_OldStyle("LDAPID_OldStyle"),
		GroupLDAPInbox_LDAPGroup("InterfaceLDAP.GroupLDAPInbox_LDAPGroup"),
		LDAPInbox_LDAPImport("InterfaceLDAP.LDAPInbox_LDAPImport"),
		LDAPInbox_LDAPPath("InterfaceLDAP.LDAPInbox_LDAPPath"),
		CurrentRepeatingStructureProcessingAttempt_LDAPInbox("InterfaceShared.CurrentRepeatingStructureProcessingAttempt_LDAPInbox"),
		ParentProcessingPart_LDAPInbox("InterfaceShared.ParentProcessingPart_LDAPInbox");

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

	public GroupLDAPInbox(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceLDAP.GroupLDAPInbox"));
	}

	protected GroupLDAPInbox(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject groupLDAPInboxMendixObject)
	{
		super(context, groupLDAPInboxMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceLDAP.GroupLDAPInbox", groupLDAPInboxMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceLDAP.GroupLDAPInbox");
	}

	/**
	 * @deprecated Use 'GroupLDAPInbox.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceldap.proxies.GroupLDAPInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceldap.proxies.GroupLDAPInbox.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceldap.proxies.GroupLDAPInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceldap.proxies.GroupLDAPInbox(context, mendixObject);
	}

	public static interfaceldap.proxies.GroupLDAPInbox load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceldap.proxies.GroupLDAPInbox.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceldap.proxies.GroupLDAPInbox> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceldap.proxies.GroupLDAPInbox> result = new java.util.ArrayList<interfaceldap.proxies.GroupLDAPInbox>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceLDAP.GroupLDAPInbox" + xpathConstraint))
			result.add(interfaceldap.proxies.GroupLDAPInbox.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Dn
	 */
	public final java.lang.String getDn()
	{
		return getDn(getContext());
	}

	/**
	 * @param context
	 * @return value of Dn
	 */
	public final java.lang.String getDn(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Dn.toString());
	}

	/**
	 * Set value of Dn
	 * @param dn
	 */
	public final void setDn(java.lang.String dn)
	{
		setDn(getContext(), dn);
	}

	/**
	 * Set value of Dn
	 * @param context
	 * @param dn
	 */
	public final void setDn(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dn)
	{
		getMendixObject().setValue(context, MemberNames.Dn.toString(), dn);
	}

	/**
	 * @return value of GroupLDAPInbox_LDAPGroup
	 */
	public final interfaceconfiguration.proxies.LDAPGroup getGroupLDAPInbox_LDAPGroup() throws com.mendix.core.CoreException
	{
		return getGroupLDAPInbox_LDAPGroup(getContext());
	}

	/**
	 * @param context
	 * @return value of GroupLDAPInbox_LDAPGroup
	 */
	public final interfaceconfiguration.proxies.LDAPGroup getGroupLDAPInbox_LDAPGroup(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.LDAPGroup result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.GroupLDAPInbox_LDAPGroup.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.LDAPGroup.load(context, identifier);
		return result;
	}

	/**
	 * Set value of GroupLDAPInbox_LDAPGroup
	 * @param groupldapinbox_ldapgroup
	 */
	public final void setGroupLDAPInbox_LDAPGroup(interfaceconfiguration.proxies.LDAPGroup groupldapinbox_ldapgroup)
	{
		setGroupLDAPInbox_LDAPGroup(getContext(), groupldapinbox_ldapgroup);
	}

	/**
	 * Set value of GroupLDAPInbox_LDAPGroup
	 * @param context
	 * @param groupldapinbox_ldapgroup
	 */
	public final void setGroupLDAPInbox_LDAPGroup(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.LDAPGroup groupldapinbox_ldapgroup)
	{
		if (groupldapinbox_ldapgroup == null)
			getMendixObject().setValue(context, MemberNames.GroupLDAPInbox_LDAPGroup.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.GroupLDAPInbox_LDAPGroup.toString(), groupldapinbox_ldapgroup.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceldap.proxies.GroupLDAPInbox that = (interfaceldap.proxies.GroupLDAPInbox) obj;
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
		return "InterfaceLDAP.GroupLDAPInbox";
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