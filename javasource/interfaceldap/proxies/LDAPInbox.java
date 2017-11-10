// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceldap.proxies;

/**
 * The "LDAPID_OldStyle" field is used in ExpertDesk 9.5 to update from the old version of the ID (binary value shown as string value) to the new version of  the ID (binary value shown as decimal value).
 * This field is to be removed in later versions of ExpertDesk.
 */
public class LDAPInbox extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceLDAP.LDAPInbox";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		LDAPID("LDAPID"),
		ProcessingStatus("ProcessingStatus"),
		LDAPID_OldStyle("LDAPID_OldStyle"),
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

	public LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceLDAP.LDAPInbox"));
	}

	protected LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject lDAPInboxMendixObject)
	{
		super(context, lDAPInboxMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceLDAP.LDAPInbox", lDAPInboxMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceLDAP.LDAPInbox");
	}

	/**
	 * @deprecated Use 'LDAPInbox.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceldap.proxies.LDAPInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceldap.proxies.LDAPInbox.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceldap.proxies.LDAPInbox initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("InterfaceLDAP.GroupLDAPInbox", mendixObject.getType()))
			return interfaceldap.proxies.GroupLDAPInbox.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceLDAP.LocationLDAPInbox", mendixObject.getType()))
			return interfaceldap.proxies.LocationLDAPInbox.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceLDAP.OrganisationLDAPInbox", mendixObject.getType()))
			return interfaceldap.proxies.OrganisationLDAPInbox.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceLDAP.PersonLDAPInbox", mendixObject.getType()))
			return interfaceldap.proxies.PersonLDAPInbox.initialize(context, mendixObject);

		return new interfaceldap.proxies.LDAPInbox(context, mendixObject);
	}

	public static interfaceldap.proxies.LDAPInbox load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceldap.proxies.LDAPInbox.initialize(context, mendixObject);
	}

	public static java.util.List<? extends interfaceldap.proxies.LDAPInbox> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceldap.proxies.LDAPInbox> result = new java.util.ArrayList<interfaceldap.proxies.LDAPInbox>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceLDAP.LDAPInbox" + xpathConstraint))
			result.add(interfaceldap.proxies.LDAPInbox.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of LDAPID
	 */
	public final java.lang.String getLDAPID()
	{
		return getLDAPID(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPID
	 */
	public final java.lang.String getLDAPID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LDAPID.toString());
	}

	/**
	 * Set value of LDAPID
	 * @param ldapid
	 */
	public final void setLDAPID(java.lang.String ldapid)
	{
		setLDAPID(getContext(), ldapid);
	}

	/**
	 * Set value of LDAPID
	 * @param context
	 * @param ldapid
	 */
	public final void setLDAPID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ldapid)
	{
		getMendixObject().setValue(context, MemberNames.LDAPID.toString(), ldapid);
	}

	/**
	 * Set value of ProcessingStatus
	 * @param processingstatus
	 */
	public final interfaceshared.proxies.ProcessingStatus getProcessingStatus()
	{
		return getProcessingStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of ProcessingStatus
	 */
	public final interfaceshared.proxies.ProcessingStatus getProcessingStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProcessingStatus.toString());
		if (obj == null)
			return null;

		return interfaceshared.proxies.ProcessingStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProcessingStatus
	 * @param processingstatus
	 */
	public final void setProcessingStatus(interfaceshared.proxies.ProcessingStatus processingstatus)
	{
		setProcessingStatus(getContext(), processingstatus);
	}

	/**
	 * Set value of ProcessingStatus
	 * @param context
	 * @param processingstatus
	 */
	public final void setProcessingStatus(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.ProcessingStatus processingstatus)
	{
		if (processingstatus != null)
			getMendixObject().setValue(context, MemberNames.ProcessingStatus.toString(), processingstatus.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProcessingStatus.toString(), null);
	}

	/**
	 * @return value of LDAPID_OldStyle
	 */
	public final java.lang.String getLDAPID_OldStyle()
	{
		return getLDAPID_OldStyle(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPID_OldStyle
	 */
	public final java.lang.String getLDAPID_OldStyle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LDAPID_OldStyle.toString());
	}

	/**
	 * Set value of LDAPID_OldStyle
	 * @param ldapid_oldstyle
	 */
	public final void setLDAPID_OldStyle(java.lang.String ldapid_oldstyle)
	{
		setLDAPID_OldStyle(getContext(), ldapid_oldstyle);
	}

	/**
	 * Set value of LDAPID_OldStyle
	 * @param context
	 * @param ldapid_oldstyle
	 */
	public final void setLDAPID_OldStyle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ldapid_oldstyle)
	{
		getMendixObject().setValue(context, MemberNames.LDAPID_OldStyle.toString(), ldapid_oldstyle);
	}

	/**
	 * @return value of LDAPInbox_LDAPImport
	 */
	public final interfaceldap.proxies.LDAPImport getLDAPInbox_LDAPImport() throws com.mendix.core.CoreException
	{
		return getLDAPInbox_LDAPImport(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPInbox_LDAPImport
	 */
	public final interfaceldap.proxies.LDAPImport getLDAPInbox_LDAPImport(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceldap.proxies.LDAPImport result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LDAPInbox_LDAPImport.toString());
		if (identifier != null)
			result = interfaceldap.proxies.LDAPImport.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LDAPInbox_LDAPImport
	 * @param ldapinbox_ldapimport
	 */
	public final void setLDAPInbox_LDAPImport(interfaceldap.proxies.LDAPImport ldapinbox_ldapimport)
	{
		setLDAPInbox_LDAPImport(getContext(), ldapinbox_ldapimport);
	}

	/**
	 * Set value of LDAPInbox_LDAPImport
	 * @param context
	 * @param ldapinbox_ldapimport
	 */
	public final void setLDAPInbox_LDAPImport(com.mendix.systemwideinterfaces.core.IContext context, interfaceldap.proxies.LDAPImport ldapinbox_ldapimport)
	{
		if (ldapinbox_ldapimport == null)
			getMendixObject().setValue(context, MemberNames.LDAPInbox_LDAPImport.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LDAPInbox_LDAPImport.toString(), ldapinbox_ldapimport.getMendixObject().getId());
	}

	/**
	 * @return value of LDAPInbox_LDAPPath
	 */
	public final interfaceconfiguration.proxies.LDAPPath getLDAPInbox_LDAPPath() throws com.mendix.core.CoreException
	{
		return getLDAPInbox_LDAPPath(getContext());
	}

	/**
	 * @param context
	 * @return value of LDAPInbox_LDAPPath
	 */
	public final interfaceconfiguration.proxies.LDAPPath getLDAPInbox_LDAPPath(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.LDAPPath result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LDAPInbox_LDAPPath.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.LDAPPath.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LDAPInbox_LDAPPath
	 * @param ldapinbox_ldappath
	 */
	public final void setLDAPInbox_LDAPPath(interfaceconfiguration.proxies.LDAPPath ldapinbox_ldappath)
	{
		setLDAPInbox_LDAPPath(getContext(), ldapinbox_ldappath);
	}

	/**
	 * Set value of LDAPInbox_LDAPPath
	 * @param context
	 * @param ldapinbox_ldappath
	 */
	public final void setLDAPInbox_LDAPPath(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.LDAPPath ldapinbox_ldappath)
	{
		if (ldapinbox_ldappath == null)
			getMendixObject().setValue(context, MemberNames.LDAPInbox_LDAPPath.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LDAPInbox_LDAPPath.toString(), ldapinbox_ldappath.getMendixObject().getId());
	}

	/**
	 * @return value of CurrentRepeatingStructureProcessingAttempt_LDAPInbox
	 */
	public final interfaceshared.proxies.RepeatingStructureProcessingAttempt getCurrentRepeatingStructureProcessingAttempt_LDAPInbox() throws com.mendix.core.CoreException
	{
		return getCurrentRepeatingStructureProcessingAttempt_LDAPInbox(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentRepeatingStructureProcessingAttempt_LDAPInbox
	 */
	public final interfaceshared.proxies.RepeatingStructureProcessingAttempt getCurrentRepeatingStructureProcessingAttempt_LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.RepeatingStructureProcessingAttempt result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CurrentRepeatingStructureProcessingAttempt_LDAPInbox.toString());
		if (identifier != null)
			result = interfaceshared.proxies.RepeatingStructureProcessingAttempt.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CurrentRepeatingStructureProcessingAttempt_LDAPInbox
	 * @param currentrepeatingstructureprocessingattempt_ldapinbox
	 */
	public final void setCurrentRepeatingStructureProcessingAttempt_LDAPInbox(interfaceshared.proxies.RepeatingStructureProcessingAttempt currentrepeatingstructureprocessingattempt_ldapinbox)
	{
		setCurrentRepeatingStructureProcessingAttempt_LDAPInbox(getContext(), currentrepeatingstructureprocessingattempt_ldapinbox);
	}

	/**
	 * Set value of CurrentRepeatingStructureProcessingAttempt_LDAPInbox
	 * @param context
	 * @param currentrepeatingstructureprocessingattempt_ldapinbox
	 */
	public final void setCurrentRepeatingStructureProcessingAttempt_LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.RepeatingStructureProcessingAttempt currentrepeatingstructureprocessingattempt_ldapinbox)
	{
		if (currentrepeatingstructureprocessingattempt_ldapinbox == null)
			getMendixObject().setValue(context, MemberNames.CurrentRepeatingStructureProcessingAttempt_LDAPInbox.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CurrentRepeatingStructureProcessingAttempt_LDAPInbox.toString(), currentrepeatingstructureprocessingattempt_ldapinbox.getMendixObject().getId());
	}

	/**
	 * @return value of ParentProcessingPart_LDAPInbox
	 */
	public final interfaceshared.proxies.ProcessingPart getParentProcessingPart_LDAPInbox() throws com.mendix.core.CoreException
	{
		return getParentProcessingPart_LDAPInbox(getContext());
	}

	/**
	 * @param context
	 * @return value of ParentProcessingPart_LDAPInbox
	 */
	public final interfaceshared.proxies.ProcessingPart getParentProcessingPart_LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.ProcessingPart result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ParentProcessingPart_LDAPInbox.toString());
		if (identifier != null)
			result = interfaceshared.proxies.ProcessingPart.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ParentProcessingPart_LDAPInbox
	 * @param parentprocessingpart_ldapinbox
	 */
	public final void setParentProcessingPart_LDAPInbox(interfaceshared.proxies.ProcessingPart parentprocessingpart_ldapinbox)
	{
		setParentProcessingPart_LDAPInbox(getContext(), parentprocessingpart_ldapinbox);
	}

	/**
	 * Set value of ParentProcessingPart_LDAPInbox
	 * @param context
	 * @param parentprocessingpart_ldapinbox
	 */
	public final void setParentProcessingPart_LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.ProcessingPart parentprocessingpart_ldapinbox)
	{
		if (parentprocessingpart_ldapinbox == null)
			getMendixObject().setValue(context, MemberNames.ParentProcessingPart_LDAPInbox.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ParentProcessingPart_LDAPInbox.toString(), parentprocessingpart_ldapinbox.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceldap.proxies.LDAPInbox that = (interfaceldap.proxies.LDAPInbox) obj;
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
		return "InterfaceLDAP.LDAPInbox";
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
