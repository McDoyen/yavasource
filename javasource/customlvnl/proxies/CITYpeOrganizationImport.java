// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public class CITYpeOrganizationImport extends customlvnl.proxies.ImportLog
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CustomLVNL.CITYpeOrganizationImport";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CIType("CIType"),
		OrganizationName("OrganizationName"),
		RelationType("RelationType"),
		Delete("Delete"),
		ProcessDate("ProcessDate"),
		StatusNote("StatusNote"),
		ProcessStatus("ProcessStatus"),
		Number("Number"),
		Validated("Validated"),
		Processed("Processed"),
		ImportType("ImportType"),
		CITYpeOrganizationImport_CITypeImport("CustomLVNL.CITYpeOrganizationImport_CITypeImport"),
		ImportLog_ImportRun("CustomLVNL.ImportLog_ImportRun");

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

	public CITYpeOrganizationImport(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CustomLVNL.CITYpeOrganizationImport"));
	}

	protected CITYpeOrganizationImport(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cITYpeOrganizationImportMendixObject)
	{
		super(context, cITYpeOrganizationImportMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("CustomLVNL.CITYpeOrganizationImport", cITYpeOrganizationImportMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CustomLVNL.CITYpeOrganizationImport");
	}

	/**
	 * @deprecated Use 'CITYpeOrganizationImport.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static customlvnl.proxies.CITYpeOrganizationImport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return customlvnl.proxies.CITYpeOrganizationImport.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static customlvnl.proxies.CITYpeOrganizationImport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new customlvnl.proxies.CITYpeOrganizationImport(context, mendixObject);
	}

	public static customlvnl.proxies.CITYpeOrganizationImport load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return customlvnl.proxies.CITYpeOrganizationImport.initialize(context, mendixObject);
	}

	public static java.util.List<customlvnl.proxies.CITYpeOrganizationImport> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<customlvnl.proxies.CITYpeOrganizationImport> result = new java.util.ArrayList<customlvnl.proxies.CITYpeOrganizationImport>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CustomLVNL.CITYpeOrganizationImport" + xpathConstraint))
			result.add(customlvnl.proxies.CITYpeOrganizationImport.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of CIType
	 */
	public final java.lang.String getCIType()
	{
		return getCIType(getContext());
	}

	/**
	 * @param context
	 * @return value of CIType
	 */
	public final java.lang.String getCIType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CIType.toString());
	}

	/**
	 * Set value of CIType
	 * @param citype
	 */
	public final void setCIType(java.lang.String citype)
	{
		setCIType(getContext(), citype);
	}

	/**
	 * Set value of CIType
	 * @param context
	 * @param citype
	 */
	public final void setCIType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String citype)
	{
		getMendixObject().setValue(context, MemberNames.CIType.toString(), citype);
	}

	/**
	 * @return value of OrganizationName
	 */
	public final java.lang.String getOrganizationName()
	{
		return getOrganizationName(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganizationName
	 */
	public final java.lang.String getOrganizationName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OrganizationName.toString());
	}

	/**
	 * Set value of OrganizationName
	 * @param organizationname
	 */
	public final void setOrganizationName(java.lang.String organizationname)
	{
		setOrganizationName(getContext(), organizationname);
	}

	/**
	 * Set value of OrganizationName
	 * @param context
	 * @param organizationname
	 */
	public final void setOrganizationName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organizationname)
	{
		getMendixObject().setValue(context, MemberNames.OrganizationName.toString(), organizationname);
	}

	/**
	 * @return value of RelationType
	 */
	public final java.lang.String getRelationType()
	{
		return getRelationType(getContext());
	}

	/**
	 * @param context
	 * @return value of RelationType
	 */
	public final java.lang.String getRelationType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RelationType.toString());
	}

	/**
	 * Set value of RelationType
	 * @param relationtype
	 */
	public final void setRelationType(java.lang.String relationtype)
	{
		setRelationType(getContext(), relationtype);
	}

	/**
	 * Set value of RelationType
	 * @param context
	 * @param relationtype
	 */
	public final void setRelationType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String relationtype)
	{
		getMendixObject().setValue(context, MemberNames.RelationType.toString(), relationtype);
	}

	/**
	 * @return value of Delete
	 */
	public final java.lang.String getDelete()
	{
		return getDelete(getContext());
	}

	/**
	 * @param context
	 * @return value of Delete
	 */
	public final java.lang.String getDelete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Delete.toString());
	}

	/**
	 * Set value of Delete
	 * @param delete
	 */
	public final void setDelete(java.lang.String delete)
	{
		setDelete(getContext(), delete);
	}

	/**
	 * Set value of Delete
	 * @param context
	 * @param delete
	 */
	public final void setDelete(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String delete)
	{
		getMendixObject().setValue(context, MemberNames.Delete.toString(), delete);
	}

	/**
	 * @return value of CITYpeOrganizationImport_CITypeImport
	 */
	public final customlvnl.proxies.CITypeImport getCITYpeOrganizationImport_CITypeImport() throws com.mendix.core.CoreException
	{
		return getCITYpeOrganizationImport_CITypeImport(getContext());
	}

	/**
	 * @param context
	 * @return value of CITYpeOrganizationImport_CITypeImport
	 */
	public final customlvnl.proxies.CITypeImport getCITYpeOrganizationImport_CITypeImport(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		customlvnl.proxies.CITypeImport result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CITYpeOrganizationImport_CITypeImport.toString());
		if (identifier != null)
			result = customlvnl.proxies.CITypeImport.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CITYpeOrganizationImport_CITypeImport
	 * @param citypeorganizationimport_citypeimport
	 */
	public final void setCITYpeOrganizationImport_CITypeImport(customlvnl.proxies.CITypeImport citypeorganizationimport_citypeimport)
	{
		setCITYpeOrganizationImport_CITypeImport(getContext(), citypeorganizationimport_citypeimport);
	}

	/**
	 * Set value of CITYpeOrganizationImport_CITypeImport
	 * @param context
	 * @param citypeorganizationimport_citypeimport
	 */
	public final void setCITYpeOrganizationImport_CITypeImport(com.mendix.systemwideinterfaces.core.IContext context, customlvnl.proxies.CITypeImport citypeorganizationimport_citypeimport)
	{
		if (citypeorganizationimport_citypeimport == null)
			getMendixObject().setValue(context, MemberNames.CITYpeOrganizationImport_CITypeImport.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CITYpeOrganizationImport_CITypeImport.toString(), citypeorganizationimport_citypeimport.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final customlvnl.proxies.CITYpeOrganizationImport that = (customlvnl.proxies.CITYpeOrganizationImport) obj;
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
		return "CustomLVNL.CITYpeOrganizationImport";
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
