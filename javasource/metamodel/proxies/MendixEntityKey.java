// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package metamodel.proxies;

public class MendixEntityKey
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mendixEntityKeyMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MetaModel.MendixEntityKey";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		KeyType("KeyType"),
		Active("Active"),
		AuditItem("AuditItem"),
		IsImportExportUserAttributeOrReference("IsImportExportUserAttributeOrReference"),
		FullName("FullName"),
		Alias("Alias"),
		DisplayInAuditOverview("DisplayInAuditOverview");

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

	public MendixEntityKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MetaModel.MendixEntityKey"));
	}

	protected MendixEntityKey(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixEntityKeyMendixObject)
	{
		if (mendixEntityKeyMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MetaModel.MendixEntityKey", mendixEntityKeyMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MetaModel.MendixEntityKey");

		this.mendixEntityKeyMendixObject = mendixEntityKeyMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MendixEntityKey.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static metamodel.proxies.MendixEntityKey initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return metamodel.proxies.MendixEntityKey.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static metamodel.proxies.MendixEntityKey initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("MetaModel.MendixAttribute", mendixObject.getType()))
			return metamodel.proxies.MendixAttribute.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("MetaModel.MendixRelation", mendixObject.getType()))
			return metamodel.proxies.MendixRelation.initialize(context, mendixObject);

		return new metamodel.proxies.MendixEntityKey(context, mendixObject);
	}

	public static metamodel.proxies.MendixEntityKey load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return metamodel.proxies.MendixEntityKey.initialize(context, mendixObject);
	}

	public static java.util.List<? extends metamodel.proxies.MendixEntityKey> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<metamodel.proxies.MendixEntityKey> result = new java.util.ArrayList<metamodel.proxies.MendixEntityKey>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MetaModel.MendixEntityKey" + xpathConstraint))
			result.add(metamodel.proxies.MendixEntityKey.initialize(context, obj));
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
	 * Set value of KeyType
	 * @param keytype
	 */
	public final metamodel.proxies.KeyType getKeyType()
	{
		return getKeyType(getContext());
	}

	/**
	 * @param context
	 * @return value of KeyType
	 */
	public final metamodel.proxies.KeyType getKeyType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.KeyType.toString());
		if (obj == null)
			return null;

		return metamodel.proxies.KeyType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of KeyType
	 * @param keytype
	 */
	public final void setKeyType(metamodel.proxies.KeyType keytype)
	{
		setKeyType(getContext(), keytype);
	}

	/**
	 * Set value of KeyType
	 * @param context
	 * @param keytype
	 */
	public final void setKeyType(com.mendix.systemwideinterfaces.core.IContext context, metamodel.proxies.KeyType keytype)
	{
		if (keytype != null)
			getMendixObject().setValue(context, MemberNames.KeyType.toString(), keytype.toString());
		else
			getMendixObject().setValue(context, MemberNames.KeyType.toString(), null);
	}

	/**
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive()
	{
		return getActive(getContext());
	}

	/**
	 * @param context
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Active.toString());
	}

	/**
	 * Set value of Active
	 * @param active
	 */
	public final void setActive(java.lang.Boolean active)
	{
		setActive(getContext(), active);
	}

	/**
	 * Set value of Active
	 * @param context
	 * @param active
	 */
	public final void setActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean active)
	{
		getMendixObject().setValue(context, MemberNames.Active.toString(), active);
	}

	/**
	 * Set value of AuditItem
	 * @param audititem
	 */
	public final metamodel.proxies.AuditItemEnum getAuditItem()
	{
		return getAuditItem(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditItem
	 */
	public final metamodel.proxies.AuditItemEnum getAuditItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AuditItem.toString());
		if (obj == null)
			return null;

		return metamodel.proxies.AuditItemEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AuditItem
	 * @param audititem
	 */
	public final void setAuditItem(metamodel.proxies.AuditItemEnum audititem)
	{
		setAuditItem(getContext(), audititem);
	}

	/**
	 * Set value of AuditItem
	 * @param context
	 * @param audititem
	 */
	public final void setAuditItem(com.mendix.systemwideinterfaces.core.IContext context, metamodel.proxies.AuditItemEnum audititem)
	{
		if (audititem != null)
			getMendixObject().setValue(context, MemberNames.AuditItem.toString(), audititem.toString());
		else
			getMendixObject().setValue(context, MemberNames.AuditItem.toString(), null);
	}

	/**
	 * @return value of IsImportExportUserAttributeOrReference
	 */
	public final java.lang.Boolean getIsImportExportUserAttributeOrReference()
	{
		return getIsImportExportUserAttributeOrReference(getContext());
	}

	/**
	 * @param context
	 * @return value of IsImportExportUserAttributeOrReference
	 */
	public final java.lang.Boolean getIsImportExportUserAttributeOrReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsImportExportUserAttributeOrReference.toString());
	}

	/**
	 * Set value of IsImportExportUserAttributeOrReference
	 * @param isimportexportuserattributeorreference
	 */
	public final void setIsImportExportUserAttributeOrReference(java.lang.Boolean isimportexportuserattributeorreference)
	{
		setIsImportExportUserAttributeOrReference(getContext(), isimportexportuserattributeorreference);
	}

	/**
	 * Set value of IsImportExportUserAttributeOrReference
	 * @param context
	 * @param isimportexportuserattributeorreference
	 */
	public final void setIsImportExportUserAttributeOrReference(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isimportexportuserattributeorreference)
	{
		getMendixObject().setValue(context, MemberNames.IsImportExportUserAttributeOrReference.toString(), isimportexportuserattributeorreference);
	}

	/**
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of Alias
	 */
	public final java.lang.String getAlias()
	{
		return getAlias(getContext());
	}

	/**
	 * @param context
	 * @return value of Alias
	 */
	public final java.lang.String getAlias(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Alias.toString());
	}

	/**
	 * Set value of Alias
	 * @param alias
	 */
	public final void setAlias(java.lang.String alias)
	{
		setAlias(getContext(), alias);
	}

	/**
	 * Set value of Alias
	 * @param context
	 * @param alias
	 */
	public final void setAlias(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String alias)
	{
		getMendixObject().setValue(context, MemberNames.Alias.toString(), alias);
	}

	/**
	 * @return value of DisplayInAuditOverview
	 */
	public final java.lang.Boolean getDisplayInAuditOverview()
	{
		return getDisplayInAuditOverview(getContext());
	}

	/**
	 * @param context
	 * @return value of DisplayInAuditOverview
	 */
	public final java.lang.Boolean getDisplayInAuditOverview(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DisplayInAuditOverview.toString());
	}

	/**
	 * Set value of DisplayInAuditOverview
	 * @param displayinauditoverview
	 */
	public final void setDisplayInAuditOverview(java.lang.Boolean displayinauditoverview)
	{
		setDisplayInAuditOverview(getContext(), displayinauditoverview);
	}

	/**
	 * Set value of DisplayInAuditOverview
	 * @param context
	 * @param displayinauditoverview
	 */
	public final void setDisplayInAuditOverview(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean displayinauditoverview)
	{
		getMendixObject().setValue(context, MemberNames.DisplayInAuditOverview.toString(), displayinauditoverview);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mendixEntityKeyMendixObject;
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
			final metamodel.proxies.MendixEntityKey that = (metamodel.proxies.MendixEntityKey) obj;
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
		return "MetaModel.MendixEntityKey";
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
