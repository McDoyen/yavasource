// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package importexport.proxies;

public class DataPatchRecord
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dataPatchRecordMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ImportExport.DataPatchRecord";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ImportAction("ImportAction"),
		Key("Key"),
		EntityName("EntityName"),
		MendixID("MendixID"),
		DataPatchRecord_DataPatchSet("ImportExport.DataPatchRecord_DataPatchSet");

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

	public DataPatchRecord(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ImportExport.DataPatchRecord"));
	}

	protected DataPatchRecord(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dataPatchRecordMendixObject)
	{
		if (dataPatchRecordMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ImportExport.DataPatchRecord", dataPatchRecordMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ImportExport.DataPatchRecord");

		this.dataPatchRecordMendixObject = dataPatchRecordMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DataPatchRecord.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static importexport.proxies.DataPatchRecord initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return importexport.proxies.DataPatchRecord.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static importexport.proxies.DataPatchRecord initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new importexport.proxies.DataPatchRecord(context, mendixObject);
	}

	public static importexport.proxies.DataPatchRecord load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return importexport.proxies.DataPatchRecord.initialize(context, mendixObject);
	}

	public static java.util.List<importexport.proxies.DataPatchRecord> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<importexport.proxies.DataPatchRecord> result = new java.util.ArrayList<importexport.proxies.DataPatchRecord>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ImportExport.DataPatchRecord" + xpathConstraint))
			result.add(importexport.proxies.DataPatchRecord.initialize(context, obj));
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
	 * Set value of ImportAction
	 * @param importaction
	 */
	public final importexport.proxies.ImportActionEnum getImportAction()
	{
		return getImportAction(getContext());
	}

	/**
	 * @param context
	 * @return value of ImportAction
	 */
	public final importexport.proxies.ImportActionEnum getImportAction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ImportAction.toString());
		if (obj == null)
			return null;

		return importexport.proxies.ImportActionEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ImportAction
	 * @param importaction
	 */
	public final void setImportAction(importexport.proxies.ImportActionEnum importaction)
	{
		setImportAction(getContext(), importaction);
	}

	/**
	 * Set value of ImportAction
	 * @param context
	 * @param importaction
	 */
	public final void setImportAction(com.mendix.systemwideinterfaces.core.IContext context, importexport.proxies.ImportActionEnum importaction)
	{
		if (importaction != null)
			getMendixObject().setValue(context, MemberNames.ImportAction.toString(), importaction.toString());
		else
			getMendixObject().setValue(context, MemberNames.ImportAction.toString(), null);
	}

	/**
	 * @return value of Key
	 */
	public final java.lang.String getKey()
	{
		return getKey(getContext());
	}

	/**
	 * @param context
	 * @return value of Key
	 */
	public final java.lang.String getKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Key.toString());
	}

	/**
	 * Set value of Key
	 * @param key
	 */
	public final void setKey(java.lang.String key)
	{
		setKey(getContext(), key);
	}

	/**
	 * Set value of Key
	 * @param context
	 * @param key
	 */
	public final void setKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String key)
	{
		getMendixObject().setValue(context, MemberNames.Key.toString(), key);
	}

	/**
	 * @return value of EntityName
	 */
	public final java.lang.String getEntityName()
	{
		return getEntityName(getContext());
	}

	/**
	 * @param context
	 * @return value of EntityName
	 */
	public final java.lang.String getEntityName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EntityName.toString());
	}

	/**
	 * Set value of EntityName
	 * @param entityname
	 */
	public final void setEntityName(java.lang.String entityname)
	{
		setEntityName(getContext(), entityname);
	}

	/**
	 * Set value of EntityName
	 * @param context
	 * @param entityname
	 */
	public final void setEntityName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String entityname)
	{
		getMendixObject().setValue(context, MemberNames.EntityName.toString(), entityname);
	}

	/**
	 * @return value of MendixID
	 */
	public final java.lang.Long getMendixID()
	{
		return getMendixID(getContext());
	}

	/**
	 * @param context
	 * @return value of MendixID
	 */
	public final java.lang.Long getMendixID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MendixID.toString());
	}

	/**
	 * Set value of MendixID
	 * @param mendixid
	 */
	public final void setMendixID(java.lang.Long mendixid)
	{
		setMendixID(getContext(), mendixid);
	}

	/**
	 * Set value of MendixID
	 * @param context
	 * @param mendixid
	 */
	public final void setMendixID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long mendixid)
	{
		getMendixObject().setValue(context, MemberNames.MendixID.toString(), mendixid);
	}

	/**
	 * @return value of DataPatchRecord_DataPatchSet
	 */
	public final importexport.proxies.DataPatchSet getDataPatchRecord_DataPatchSet() throws com.mendix.core.CoreException
	{
		return getDataPatchRecord_DataPatchSet(getContext());
	}

	/**
	 * @param context
	 * @return value of DataPatchRecord_DataPatchSet
	 */
	public final importexport.proxies.DataPatchSet getDataPatchRecord_DataPatchSet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		importexport.proxies.DataPatchSet result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DataPatchRecord_DataPatchSet.toString());
		if (identifier != null)
			result = importexport.proxies.DataPatchSet.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DataPatchRecord_DataPatchSet
	 * @param datapatchrecord_datapatchset
	 */
	public final void setDataPatchRecord_DataPatchSet(importexport.proxies.DataPatchSet datapatchrecord_datapatchset)
	{
		setDataPatchRecord_DataPatchSet(getContext(), datapatchrecord_datapatchset);
	}

	/**
	 * Set value of DataPatchRecord_DataPatchSet
	 * @param context
	 * @param datapatchrecord_datapatchset
	 */
	public final void setDataPatchRecord_DataPatchSet(com.mendix.systemwideinterfaces.core.IContext context, importexport.proxies.DataPatchSet datapatchrecord_datapatchset)
	{
		if (datapatchrecord_datapatchset == null)
			getMendixObject().setValue(context, MemberNames.DataPatchRecord_DataPatchSet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DataPatchRecord_DataPatchSet.toString(), datapatchrecord_datapatchset.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dataPatchRecordMendixObject;
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
			final importexport.proxies.DataPatchRecord that = (importexport.proxies.DataPatchRecord) obj;
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
		return "ImportExport.DataPatchRecord";
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