// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared_fileimport.proxies;

public class ImportFiles
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject importFilesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceShared_FileImport.ImportFiles";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AutoID("AutoID"),
		DirectoryUsed("DirectoryUsed"),
		FilesImported("FilesImported"),
		UnsupportedFiles("UnsupportedFiles");

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

	public ImportFiles(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceShared_FileImport.ImportFiles"));
	}

	protected ImportFiles(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject importFilesMendixObject)
	{
		if (importFilesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceShared_FileImport.ImportFiles", importFilesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceShared_FileImport.ImportFiles");

		this.importFilesMendixObject = importFilesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ImportFiles.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceshared_fileimport.proxies.ImportFiles initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceshared_fileimport.proxies.ImportFiles.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceshared_fileimport.proxies.ImportFiles initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceshared_fileimport.proxies.ImportFiles(context, mendixObject);
	}

	public static interfaceshared_fileimport.proxies.ImportFiles load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceshared_fileimport.proxies.ImportFiles.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceshared_fileimport.proxies.ImportFiles> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceshared_fileimport.proxies.ImportFiles> result = new java.util.ArrayList<interfaceshared_fileimport.proxies.ImportFiles>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceShared_FileImport.ImportFiles" + xpathConstraint))
			result.add(interfaceshared_fileimport.proxies.ImportFiles.initialize(context, obj));
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
	 * @return value of AutoID
	 */
	public final java.lang.Long getAutoID()
	{
		return getAutoID(getContext());
	}

	/**
	 * @param context
	 * @return value of AutoID
	 */
	public final java.lang.Long getAutoID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.AutoID.toString());
	}

	/**
	 * Set value of AutoID
	 * @param autoid
	 */
	public final void setAutoID(java.lang.Long autoid)
	{
		setAutoID(getContext(), autoid);
	}

	/**
	 * Set value of AutoID
	 * @param context
	 * @param autoid
	 */
	public final void setAutoID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long autoid)
	{
		getMendixObject().setValue(context, MemberNames.AutoID.toString(), autoid);
	}

	/**
	 * @return value of DirectoryUsed
	 */
	public final java.lang.String getDirectoryUsed()
	{
		return getDirectoryUsed(getContext());
	}

	/**
	 * @param context
	 * @return value of DirectoryUsed
	 */
	public final java.lang.String getDirectoryUsed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DirectoryUsed.toString());
	}

	/**
	 * Set value of DirectoryUsed
	 * @param directoryused
	 */
	public final void setDirectoryUsed(java.lang.String directoryused)
	{
		setDirectoryUsed(getContext(), directoryused);
	}

	/**
	 * Set value of DirectoryUsed
	 * @param context
	 * @param directoryused
	 */
	public final void setDirectoryUsed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String directoryused)
	{
		getMendixObject().setValue(context, MemberNames.DirectoryUsed.toString(), directoryused);
	}

	/**
	 * @return value of FilesImported
	 */
	public final java.lang.Integer getFilesImported()
	{
		return getFilesImported(getContext());
	}

	/**
	 * @param context
	 * @return value of FilesImported
	 */
	public final java.lang.Integer getFilesImported(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.FilesImported.toString());
	}

	/**
	 * Set value of FilesImported
	 * @param filesimported
	 */
	public final void setFilesImported(java.lang.Integer filesimported)
	{
		setFilesImported(getContext(), filesimported);
	}

	/**
	 * Set value of FilesImported
	 * @param context
	 * @param filesimported
	 */
	public final void setFilesImported(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer filesimported)
	{
		getMendixObject().setValue(context, MemberNames.FilesImported.toString(), filesimported);
	}

	/**
	 * @return value of UnsupportedFiles
	 */
	public final java.lang.Boolean getUnsupportedFiles()
	{
		return getUnsupportedFiles(getContext());
	}

	/**
	 * @param context
	 * @return value of UnsupportedFiles
	 */
	public final java.lang.Boolean getUnsupportedFiles(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UnsupportedFiles.toString());
	}

	/**
	 * Set value of UnsupportedFiles
	 * @param unsupportedfiles
	 */
	public final void setUnsupportedFiles(java.lang.Boolean unsupportedfiles)
	{
		setUnsupportedFiles(getContext(), unsupportedfiles);
	}

	/**
	 * Set value of UnsupportedFiles
	 * @param context
	 * @param unsupportedfiles
	 */
	public final void setUnsupportedFiles(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean unsupportedfiles)
	{
		getMendixObject().setValue(context, MemberNames.UnsupportedFiles.toString(), unsupportedfiles);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return importFilesMendixObject;
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
			final interfaceshared_fileimport.proxies.ImportFiles that = (interfaceshared_fileimport.proxies.ImportFiles) obj;
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
		return "InterfaceShared_FileImport.ImportFiles";
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
