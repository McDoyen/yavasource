// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package importexport.proxies;

public class ImportLog
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject importLogMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ImportExport.ImportLog";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Result("Result"),
		LogLevel("LogLevel"),
		Message("Message"),
		StackTrace("StackTrace"),
		HasStack("HasStack"),
		ImportLog_ImportExportSetting("ImportExport.ImportLog_ImportExportSetting"),
		ImportLog_ImportAttempt("ImportExport.ImportLog_ImportAttempt");

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

	public ImportLog(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ImportExport.ImportLog"));
	}

	protected ImportLog(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject importLogMendixObject)
	{
		if (importLogMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ImportExport.ImportLog", importLogMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ImportExport.ImportLog");

		this.importLogMendixObject = importLogMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ImportLog.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static importexport.proxies.ImportLog initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return importexport.proxies.ImportLog.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static importexport.proxies.ImportLog initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new importexport.proxies.ImportLog(context, mendixObject);
	}

	public static importexport.proxies.ImportLog load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return importexport.proxies.ImportLog.initialize(context, mendixObject);
	}

	public static java.util.List<importexport.proxies.ImportLog> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<importexport.proxies.ImportLog> result = new java.util.ArrayList<importexport.proxies.ImportLog>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ImportExport.ImportLog" + xpathConstraint))
			result.add(importexport.proxies.ImportLog.initialize(context, obj));
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
	 * @return value of Result
	 */
	public final java.lang.Boolean getResult()
	{
		return getResult(getContext());
	}

	/**
	 * @param context
	 * @return value of Result
	 */
	public final java.lang.Boolean getResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Result.toString());
	}

	/**
	 * Set value of Result
	 * @param result
	 */
	public final void setResult(java.lang.Boolean result)
	{
		setResult(getContext(), result);
	}

	/**
	 * Set value of Result
	 * @param context
	 * @param result
	 */
	public final void setResult(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean result)
	{
		getMendixObject().setValue(context, MemberNames.Result.toString(), result);
	}

	/**
	 * Set value of LogLevel
	 * @param loglevel
	 */
	public final importexport.proxies.LogLevel getLogLevel()
	{
		return getLogLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of LogLevel
	 */
	public final importexport.proxies.LogLevel getLogLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.LogLevel.toString());
		if (obj == null)
			return null;

		return importexport.proxies.LogLevel.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of LogLevel
	 * @param loglevel
	 */
	public final void setLogLevel(importexport.proxies.LogLevel loglevel)
	{
		setLogLevel(getContext(), loglevel);
	}

	/**
	 * Set value of LogLevel
	 * @param context
	 * @param loglevel
	 */
	public final void setLogLevel(com.mendix.systemwideinterfaces.core.IContext context, importexport.proxies.LogLevel loglevel)
	{
		if (loglevel != null)
			getMendixObject().setValue(context, MemberNames.LogLevel.toString(), loglevel.toString());
		else
			getMendixObject().setValue(context, MemberNames.LogLevel.toString(), null);
	}

	/**
	 * @return value of Message
	 */
	public final java.lang.String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final java.lang.String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(java.lang.String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of StackTrace
	 */
	public final java.lang.String getStackTrace()
	{
		return getStackTrace(getContext());
	}

	/**
	 * @param context
	 * @return value of StackTrace
	 */
	public final java.lang.String getStackTrace(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.StackTrace.toString());
	}

	/**
	 * Set value of StackTrace
	 * @param stacktrace
	 */
	public final void setStackTrace(java.lang.String stacktrace)
	{
		setStackTrace(getContext(), stacktrace);
	}

	/**
	 * Set value of StackTrace
	 * @param context
	 * @param stacktrace
	 */
	public final void setStackTrace(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String stacktrace)
	{
		getMendixObject().setValue(context, MemberNames.StackTrace.toString(), stacktrace);
	}

	/**
	 * @return value of HasStack
	 */
	public final java.lang.Boolean getHasStack()
	{
		return getHasStack(getContext());
	}

	/**
	 * @param context
	 * @return value of HasStack
	 */
	public final java.lang.Boolean getHasStack(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasStack.toString());
	}

	/**
	 * Set value of HasStack
	 * @param hasstack
	 */
	public final void setHasStack(java.lang.Boolean hasstack)
	{
		setHasStack(getContext(), hasstack);
	}

	/**
	 * Set value of HasStack
	 * @param context
	 * @param hasstack
	 */
	public final void setHasStack(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hasstack)
	{
		getMendixObject().setValue(context, MemberNames.HasStack.toString(), hasstack);
	}

	/**
	 * @return value of ImportLog_ImportExportSetting
	 */
	public final importexport.proxies.ImportExportSetting getImportLog_ImportExportSetting() throws com.mendix.core.CoreException
	{
		return getImportLog_ImportExportSetting(getContext());
	}

	/**
	 * @param context
	 * @return value of ImportLog_ImportExportSetting
	 */
	public final importexport.proxies.ImportExportSetting getImportLog_ImportExportSetting(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		importexport.proxies.ImportExportSetting result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ImportLog_ImportExportSetting.toString());
		if (identifier != null)
			result = importexport.proxies.ImportExportSetting.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ImportLog_ImportExportSetting
	 * @param importlog_importexportsetting
	 */
	public final void setImportLog_ImportExportSetting(importexport.proxies.ImportExportSetting importlog_importexportsetting)
	{
		setImportLog_ImportExportSetting(getContext(), importlog_importexportsetting);
	}

	/**
	 * Set value of ImportLog_ImportExportSetting
	 * @param context
	 * @param importlog_importexportsetting
	 */
	public final void setImportLog_ImportExportSetting(com.mendix.systemwideinterfaces.core.IContext context, importexport.proxies.ImportExportSetting importlog_importexportsetting)
	{
		if (importlog_importexportsetting == null)
			getMendixObject().setValue(context, MemberNames.ImportLog_ImportExportSetting.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ImportLog_ImportExportSetting.toString(), importlog_importexportsetting.getMendixObject().getId());
	}

	/**
	 * @return value of ImportLog_ImportAttempt
	 */
	public final importexport.proxies.ImportAttempt getImportLog_ImportAttempt() throws com.mendix.core.CoreException
	{
		return getImportLog_ImportAttempt(getContext());
	}

	/**
	 * @param context
	 * @return value of ImportLog_ImportAttempt
	 */
	public final importexport.proxies.ImportAttempt getImportLog_ImportAttempt(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		importexport.proxies.ImportAttempt result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ImportLog_ImportAttempt.toString());
		if (identifier != null)
			result = importexport.proxies.ImportAttempt.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ImportLog_ImportAttempt
	 * @param importlog_importattempt
	 */
	public final void setImportLog_ImportAttempt(importexport.proxies.ImportAttempt importlog_importattempt)
	{
		setImportLog_ImportAttempt(getContext(), importlog_importattempt);
	}

	/**
	 * Set value of ImportLog_ImportAttempt
	 * @param context
	 * @param importlog_importattempt
	 */
	public final void setImportLog_ImportAttempt(com.mendix.systemwideinterfaces.core.IContext context, importexport.proxies.ImportAttempt importlog_importattempt)
	{
		if (importlog_importattempt == null)
			getMendixObject().setValue(context, MemberNames.ImportLog_ImportAttempt.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ImportLog_ImportAttempt.toString(), importlog_importattempt.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return importLogMendixObject;
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
			final importexport.proxies.ImportLog that = (importexport.proxies.ImportLog) obj;
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
		return "ImportExport.ImportLog";
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
