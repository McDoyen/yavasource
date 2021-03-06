// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public class SupposedSystemImport extends customlvnl.proxies.ImportLog
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CustomLVNL.SupposedSystemImport";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CIType("CIType"),
		SupposedSystem("SupposedSystem"),
		Delete("Delete"),
		ProcessDate("ProcessDate"),
		StatusNote("StatusNote"),
		ProcessStatus("ProcessStatus"),
		Number("Number"),
		Validated("Validated"),
		Processed("Processed"),
		ImportType("ImportType"),
		SupposedSystemImport_CITypeImport("CustomLVNL.SupposedSystemImport_CITypeImport"),
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

	public SupposedSystemImport(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CustomLVNL.SupposedSystemImport"));
	}

	protected SupposedSystemImport(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject supposedSystemImportMendixObject)
	{
		super(context, supposedSystemImportMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("CustomLVNL.SupposedSystemImport", supposedSystemImportMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CustomLVNL.SupposedSystemImport");
	}

	/**
	 * @deprecated Use 'SupposedSystemImport.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static customlvnl.proxies.SupposedSystemImport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return customlvnl.proxies.SupposedSystemImport.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static customlvnl.proxies.SupposedSystemImport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new customlvnl.proxies.SupposedSystemImport(context, mendixObject);
	}

	public static customlvnl.proxies.SupposedSystemImport load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return customlvnl.proxies.SupposedSystemImport.initialize(context, mendixObject);
	}

	public static java.util.List<customlvnl.proxies.SupposedSystemImport> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<customlvnl.proxies.SupposedSystemImport> result = new java.util.ArrayList<customlvnl.proxies.SupposedSystemImport>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CustomLVNL.SupposedSystemImport" + xpathConstraint))
			result.add(customlvnl.proxies.SupposedSystemImport.initialize(context, obj));
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
	 * @return value of SupposedSystem
	 */
	public final java.lang.String getSupposedSystem()
	{
		return getSupposedSystem(getContext());
	}

	/**
	 * @param context
	 * @return value of SupposedSystem
	 */
	public final java.lang.String getSupposedSystem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SupposedSystem.toString());
	}

	/**
	 * Set value of SupposedSystem
	 * @param supposedsystem
	 */
	public final void setSupposedSystem(java.lang.String supposedsystem)
	{
		setSupposedSystem(getContext(), supposedsystem);
	}

	/**
	 * Set value of SupposedSystem
	 * @param context
	 * @param supposedsystem
	 */
	public final void setSupposedSystem(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String supposedsystem)
	{
		getMendixObject().setValue(context, MemberNames.SupposedSystem.toString(), supposedsystem);
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
	 * @return value of SupposedSystemImport_CITypeImport
	 */
	public final customlvnl.proxies.CITypeImport getSupposedSystemImport_CITypeImport() throws com.mendix.core.CoreException
	{
		return getSupposedSystemImport_CITypeImport(getContext());
	}

	/**
	 * @param context
	 * @return value of SupposedSystemImport_CITypeImport
	 */
	public final customlvnl.proxies.CITypeImport getSupposedSystemImport_CITypeImport(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		customlvnl.proxies.CITypeImport result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SupposedSystemImport_CITypeImport.toString());
		if (identifier != null)
			result = customlvnl.proxies.CITypeImport.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SupposedSystemImport_CITypeImport
	 * @param supposedsystemimport_citypeimport
	 */
	public final void setSupposedSystemImport_CITypeImport(customlvnl.proxies.CITypeImport supposedsystemimport_citypeimport)
	{
		setSupposedSystemImport_CITypeImport(getContext(), supposedsystemimport_citypeimport);
	}

	/**
	 * Set value of SupposedSystemImport_CITypeImport
	 * @param context
	 * @param supposedsystemimport_citypeimport
	 */
	public final void setSupposedSystemImport_CITypeImport(com.mendix.systemwideinterfaces.core.IContext context, customlvnl.proxies.CITypeImport supposedsystemimport_citypeimport)
	{
		if (supposedsystemimport_citypeimport == null)
			getMendixObject().setValue(context, MemberNames.SupposedSystemImport_CITypeImport.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SupposedSystemImport_CITypeImport.toString(), supposedsystemimport_citypeimport.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final customlvnl.proxies.SupposedSystemImport that = (customlvnl.proxies.SupposedSystemImport) obj;
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
		return "CustomLVNL.SupposedSystemImport";
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
