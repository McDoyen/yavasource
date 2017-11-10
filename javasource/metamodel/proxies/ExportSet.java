// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package metamodel.proxies;

public class ExportSet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject exportSetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MetaModel.ExportSet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ExportSet_MendixEntity("MetaModel.ExportSet_MendixEntity"),
		ExportSet_MendixRelation("MetaModel.ExportSet_MendixRelation");

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

	public ExportSet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MetaModel.ExportSet"));
	}

	protected ExportSet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject exportSetMendixObject)
	{
		if (exportSetMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MetaModel.ExportSet", exportSetMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MetaModel.ExportSet");

		this.exportSetMendixObject = exportSetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ExportSet.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static metamodel.proxies.ExportSet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return metamodel.proxies.ExportSet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static metamodel.proxies.ExportSet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new metamodel.proxies.ExportSet(context, mendixObject);
	}

	public static metamodel.proxies.ExportSet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return metamodel.proxies.ExportSet.initialize(context, mendixObject);
	}

	public static java.util.List<metamodel.proxies.ExportSet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<metamodel.proxies.ExportSet> result = new java.util.ArrayList<metamodel.proxies.ExportSet>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MetaModel.ExportSet" + xpathConstraint))
			result.add(metamodel.proxies.ExportSet.initialize(context, obj));
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
	 * @return value of ExportSet_MendixEntity
	 */
	public final metamodel.proxies.MendixEntity getExportSet_MendixEntity() throws com.mendix.core.CoreException
	{
		return getExportSet_MendixEntity(getContext());
	}

	/**
	 * @param context
	 * @return value of ExportSet_MendixEntity
	 */
	public final metamodel.proxies.MendixEntity getExportSet_MendixEntity(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		metamodel.proxies.MendixEntity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExportSet_MendixEntity.toString());
		if (identifier != null)
			result = metamodel.proxies.MendixEntity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExportSet_MendixEntity
	 * @param exportset_mendixentity
	 */
	public final void setExportSet_MendixEntity(metamodel.proxies.MendixEntity exportset_mendixentity)
	{
		setExportSet_MendixEntity(getContext(), exportset_mendixentity);
	}

	/**
	 * Set value of ExportSet_MendixEntity
	 * @param context
	 * @param exportset_mendixentity
	 */
	public final void setExportSet_MendixEntity(com.mendix.systemwideinterfaces.core.IContext context, metamodel.proxies.MendixEntity exportset_mendixentity)
	{
		if (exportset_mendixentity == null)
			getMendixObject().setValue(context, MemberNames.ExportSet_MendixEntity.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExportSet_MendixEntity.toString(), exportset_mendixentity.getMendixObject().getId());
	}

	/**
	 * @return value of ExportSet_MendixRelation
	 */
	public final metamodel.proxies.MendixRelation getExportSet_MendixRelation() throws com.mendix.core.CoreException
	{
		return getExportSet_MendixRelation(getContext());
	}

	/**
	 * @param context
	 * @return value of ExportSet_MendixRelation
	 */
	public final metamodel.proxies.MendixRelation getExportSet_MendixRelation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		metamodel.proxies.MendixRelation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExportSet_MendixRelation.toString());
		if (identifier != null)
			result = metamodel.proxies.MendixRelation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExportSet_MendixRelation
	 * @param exportset_mendixrelation
	 */
	public final void setExportSet_MendixRelation(metamodel.proxies.MendixRelation exportset_mendixrelation)
	{
		setExportSet_MendixRelation(getContext(), exportset_mendixrelation);
	}

	/**
	 * Set value of ExportSet_MendixRelation
	 * @param context
	 * @param exportset_mendixrelation
	 */
	public final void setExportSet_MendixRelation(com.mendix.systemwideinterfaces.core.IContext context, metamodel.proxies.MendixRelation exportset_mendixrelation)
	{
		if (exportset_mendixrelation == null)
			getMendixObject().setValue(context, MemberNames.ExportSet_MendixRelation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExportSet_MendixRelation.toString(), exportset_mendixrelation.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return exportSetMendixObject;
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
			final metamodel.proxies.ExportSet that = (metamodel.proxies.ExportSet) obj;
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
		return "MetaModel.ExportSet";
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