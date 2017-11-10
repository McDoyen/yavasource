// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public class ImportFile extends interfaceshared_fileimport.proxies.IncomingFile
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CustomLVNL.ImportFile";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RunOrder("RunOrder"),
		Date("Date"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		ImportFile_ImportRun("CustomLVNL.ImportFile_ImportRun"),
		IncomingFile_ImportFiles("InterfaceShared_FileImport.IncomingFile_ImportFiles"),
		IncomingFile_Template("InterfaceShared_FileImport.IncomingFile_Template");

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

	public ImportFile(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CustomLVNL.ImportFile"));
	}

	protected ImportFile(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject importFileMendixObject)
	{
		super(context, importFileMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("CustomLVNL.ImportFile", importFileMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CustomLVNL.ImportFile");
	}

	/**
	 * @deprecated Use 'ImportFile.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static customlvnl.proxies.ImportFile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return customlvnl.proxies.ImportFile.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static customlvnl.proxies.ImportFile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new customlvnl.proxies.ImportFile(context, mendixObject);
	}

	public static customlvnl.proxies.ImportFile load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return customlvnl.proxies.ImportFile.initialize(context, mendixObject);
	}

	public static java.util.List<customlvnl.proxies.ImportFile> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<customlvnl.proxies.ImportFile> result = new java.util.ArrayList<customlvnl.proxies.ImportFile>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CustomLVNL.ImportFile" + xpathConstraint))
			result.add(customlvnl.proxies.ImportFile.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of RunOrder
	 */
	public final java.lang.Integer getRunOrder()
	{
		return getRunOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of RunOrder
	 */
	public final java.lang.Integer getRunOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RunOrder.toString());
	}

	/**
	 * Set value of RunOrder
	 * @param runorder
	 */
	public final void setRunOrder(java.lang.Integer runorder)
	{
		setRunOrder(getContext(), runorder);
	}

	/**
	 * Set value of RunOrder
	 * @param context
	 * @param runorder
	 */
	public final void setRunOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer runorder)
	{
		getMendixObject().setValue(context, MemberNames.RunOrder.toString(), runorder);
	}

	/**
	 * @return value of ImportFile_ImportRun
	 */
	public final customlvnl.proxies.ImportRun getImportFile_ImportRun() throws com.mendix.core.CoreException
	{
		return getImportFile_ImportRun(getContext());
	}

	/**
	 * @param context
	 * @return value of ImportFile_ImportRun
	 */
	public final customlvnl.proxies.ImportRun getImportFile_ImportRun(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		customlvnl.proxies.ImportRun result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ImportFile_ImportRun.toString());
		if (identifier != null)
			result = customlvnl.proxies.ImportRun.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ImportFile_ImportRun
	 * @param importfile_importrun
	 */
	public final void setImportFile_ImportRun(customlvnl.proxies.ImportRun importfile_importrun)
	{
		setImportFile_ImportRun(getContext(), importfile_importrun);
	}

	/**
	 * Set value of ImportFile_ImportRun
	 * @param context
	 * @param importfile_importrun
	 */
	public final void setImportFile_ImportRun(com.mendix.systemwideinterfaces.core.IContext context, customlvnl.proxies.ImportRun importfile_importrun)
	{
		if (importfile_importrun == null)
			getMendixObject().setValue(context, MemberNames.ImportFile_ImportRun.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ImportFile_ImportRun.toString(), importfile_importrun.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final customlvnl.proxies.ImportFile that = (customlvnl.proxies.ImportFile) obj;
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
		return "CustomLVNL.ImportFile";
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
