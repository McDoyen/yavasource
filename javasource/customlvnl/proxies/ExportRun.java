// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public class ExportRun
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject exportRunMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CustomLVNL.ExportRun";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ExportType("ExportType"),
		Delete("Delete"),
		IsNew("IsNew"),
		ExportRun_MxTemplate("CustomLVNL.ExportRun_MxTemplate");

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

	public ExportRun(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CustomLVNL.ExportRun"));
	}

	protected ExportRun(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject exportRunMendixObject)
	{
		if (exportRunMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CustomLVNL.ExportRun", exportRunMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CustomLVNL.ExportRun");

		this.exportRunMendixObject = exportRunMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ExportRun.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static customlvnl.proxies.ExportRun initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return customlvnl.proxies.ExportRun.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static customlvnl.proxies.ExportRun initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new customlvnl.proxies.ExportRun(context, mendixObject);
	}

	public static customlvnl.proxies.ExportRun load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return customlvnl.proxies.ExportRun.initialize(context, mendixObject);
	}

	public static java.util.List<customlvnl.proxies.ExportRun> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<customlvnl.proxies.ExportRun> result = new java.util.ArrayList<customlvnl.proxies.ExportRun>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CustomLVNL.ExportRun" + xpathConstraint))
			result.add(customlvnl.proxies.ExportRun.initialize(context, obj));
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
	 * Set value of ExportType
	 * @param exporttype
	 */
	public final customlvnl.proxies.ExportType getExportType()
	{
		return getExportType(getContext());
	}

	/**
	 * @param context
	 * @return value of ExportType
	 */
	public final customlvnl.proxies.ExportType getExportType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ExportType.toString());
		if (obj == null)
			return null;

		return customlvnl.proxies.ExportType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ExportType
	 * @param exporttype
	 */
	public final void setExportType(customlvnl.proxies.ExportType exporttype)
	{
		setExportType(getContext(), exporttype);
	}

	/**
	 * Set value of ExportType
	 * @param context
	 * @param exporttype
	 */
	public final void setExportType(com.mendix.systemwideinterfaces.core.IContext context, customlvnl.proxies.ExportType exporttype)
	{
		if (exporttype != null)
			getMendixObject().setValue(context, MemberNames.ExportType.toString(), exporttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ExportType.toString(), null);
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
	 * @return value of IsNew
	 */
	public final java.lang.String getIsNew()
	{
		return getIsNew(getContext());
	}

	/**
	 * @param context
	 * @return value of IsNew
	 */
	public final java.lang.String getIsNew(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.IsNew.toString());
	}

	/**
	 * Set value of IsNew
	 * @param isnew
	 */
	public final void setIsNew(java.lang.String isnew)
	{
		setIsNew(getContext(), isnew);
	}

	/**
	 * Set value of IsNew
	 * @param context
	 * @param isnew
	 */
	public final void setIsNew(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String isnew)
	{
		getMendixObject().setValue(context, MemberNames.IsNew.toString(), isnew);
	}

	/**
	 * @return value of ExportRun_MxTemplate
	 */
	public final xlsreport.proxies.MxTemplate getExportRun_MxTemplate() throws com.mendix.core.CoreException
	{
		return getExportRun_MxTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of ExportRun_MxTemplate
	 */
	public final xlsreport.proxies.MxTemplate getExportRun_MxTemplate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExportRun_MxTemplate.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExportRun_MxTemplate
	 * @param exportrun_mxtemplate
	 */
	public final void setExportRun_MxTemplate(xlsreport.proxies.MxTemplate exportrun_mxtemplate)
	{
		setExportRun_MxTemplate(getContext(), exportrun_mxtemplate);
	}

	/**
	 * Set value of ExportRun_MxTemplate
	 * @param context
	 * @param exportrun_mxtemplate
	 */
	public final void setExportRun_MxTemplate(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxTemplate exportrun_mxtemplate)
	{
		if (exportrun_mxtemplate == null)
			getMendixObject().setValue(context, MemberNames.ExportRun_MxTemplate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExportRun_MxTemplate.toString(), exportrun_mxtemplate.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return exportRunMendixObject;
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
			final customlvnl.proxies.ExportRun that = (customlvnl.proxies.ExportRun) obj;
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
		return "CustomLVNL.ExportRun";
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
