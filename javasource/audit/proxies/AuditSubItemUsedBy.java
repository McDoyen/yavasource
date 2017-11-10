// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audit.proxies;

public class AuditSubItemUsedBy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject auditSubItemUsedByMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Audit.AuditSubItemUsedBy";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ItemName("ItemName"),
		ItemEntity("ItemEntity"),
		ItemValue("ItemValue"),
		ItemFullName("ItemFullName"),
		ItemFromDate("ItemFromDate"),
		ItemToDate("ItemToDate"),
		AuditSubItemUsedBy_AuditItemUsedBy("Audit.AuditSubItemUsedBy_AuditItemUsedBy"),
		AuditSubItemUsedBy_AuditAssociation("Audit.AuditSubItemUsedBy_AuditAssociation");

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

	public AuditSubItemUsedBy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Audit.AuditSubItemUsedBy"));
	}

	protected AuditSubItemUsedBy(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject auditSubItemUsedByMendixObject)
	{
		if (auditSubItemUsedByMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Audit.AuditSubItemUsedBy", auditSubItemUsedByMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Audit.AuditSubItemUsedBy");

		this.auditSubItemUsedByMendixObject = auditSubItemUsedByMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AuditSubItemUsedBy.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static audit.proxies.AuditSubItemUsedBy initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return audit.proxies.AuditSubItemUsedBy.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static audit.proxies.AuditSubItemUsedBy initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new audit.proxies.AuditSubItemUsedBy(context, mendixObject);
	}

	public static audit.proxies.AuditSubItemUsedBy load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return audit.proxies.AuditSubItemUsedBy.initialize(context, mendixObject);
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
	 * @return value of ItemName
	 */
	public final java.lang.String getItemName()
	{
		return getItemName(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemName
	 */
	public final java.lang.String getItemName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemName.toString());
	}

	/**
	 * Set value of ItemName
	 * @param itemname
	 */
	public final void setItemName(java.lang.String itemname)
	{
		setItemName(getContext(), itemname);
	}

	/**
	 * Set value of ItemName
	 * @param context
	 * @param itemname
	 */
	public final void setItemName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itemname)
	{
		getMendixObject().setValue(context, MemberNames.ItemName.toString(), itemname);
	}

	/**
	 * @return value of ItemEntity
	 */
	public final java.lang.String getItemEntity()
	{
		return getItemEntity(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemEntity
	 */
	public final java.lang.String getItemEntity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemEntity.toString());
	}

	/**
	 * Set value of ItemEntity
	 * @param itementity
	 */
	public final void setItemEntity(java.lang.String itementity)
	{
		setItemEntity(getContext(), itementity);
	}

	/**
	 * Set value of ItemEntity
	 * @param context
	 * @param itementity
	 */
	public final void setItemEntity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itementity)
	{
		getMendixObject().setValue(context, MemberNames.ItemEntity.toString(), itementity);
	}

	/**
	 * @return value of ItemValue
	 */
	public final java.lang.String getItemValue()
	{
		return getItemValue(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemValue
	 */
	public final java.lang.String getItemValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemValue.toString());
	}

	/**
	 * Set value of ItemValue
	 * @param itemvalue
	 */
	public final void setItemValue(java.lang.String itemvalue)
	{
		setItemValue(getContext(), itemvalue);
	}

	/**
	 * Set value of ItemValue
	 * @param context
	 * @param itemvalue
	 */
	public final void setItemValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itemvalue)
	{
		getMendixObject().setValue(context, MemberNames.ItemValue.toString(), itemvalue);
	}

	/**
	 * @return value of ItemFullName
	 */
	public final java.lang.String getItemFullName()
	{
		return getItemFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemFullName
	 */
	public final java.lang.String getItemFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemFullName.toString());
	}

	/**
	 * Set value of ItemFullName
	 * @param itemfullname
	 */
	public final void setItemFullName(java.lang.String itemfullname)
	{
		setItemFullName(getContext(), itemfullname);
	}

	/**
	 * Set value of ItemFullName
	 * @param context
	 * @param itemfullname
	 */
	public final void setItemFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itemfullname)
	{
		getMendixObject().setValue(context, MemberNames.ItemFullName.toString(), itemfullname);
	}

	/**
	 * @return value of ItemFromDate
	 */
	public final java.util.Date getItemFromDate()
	{
		return getItemFromDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemFromDate
	 */
	public final java.util.Date getItemFromDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ItemFromDate.toString());
	}

	/**
	 * Set value of ItemFromDate
	 * @param itemfromdate
	 */
	public final void setItemFromDate(java.util.Date itemfromdate)
	{
		setItemFromDate(getContext(), itemfromdate);
	}

	/**
	 * Set value of ItemFromDate
	 * @param context
	 * @param itemfromdate
	 */
	public final void setItemFromDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date itemfromdate)
	{
		getMendixObject().setValue(context, MemberNames.ItemFromDate.toString(), itemfromdate);
	}

	/**
	 * @return value of ItemToDate
	 */
	public final java.util.Date getItemToDate()
	{
		return getItemToDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemToDate
	 */
	public final java.util.Date getItemToDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ItemToDate.toString());
	}

	/**
	 * Set value of ItemToDate
	 * @param itemtodate
	 */
	public final void setItemToDate(java.util.Date itemtodate)
	{
		setItemToDate(getContext(), itemtodate);
	}

	/**
	 * Set value of ItemToDate
	 * @param context
	 * @param itemtodate
	 */
	public final void setItemToDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date itemtodate)
	{
		getMendixObject().setValue(context, MemberNames.ItemToDate.toString(), itemtodate);
	}

	/**
	 * @return value of AuditSubItemUsedBy_AuditItemUsedBy
	 */
	public final audit.proxies.AuditItemUsedBy getAuditSubItemUsedBy_AuditItemUsedBy() throws com.mendix.core.CoreException
	{
		return getAuditSubItemUsedBy_AuditItemUsedBy(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditSubItemUsedBy_AuditItemUsedBy
	 */
	public final audit.proxies.AuditItemUsedBy getAuditSubItemUsedBy_AuditItemUsedBy(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditItemUsedBy result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditSubItemUsedBy_AuditItemUsedBy.toString());
		if (identifier != null)
			result = audit.proxies.AuditItemUsedBy.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditSubItemUsedBy_AuditItemUsedBy
	 * @param auditsubitemusedby_audititemusedby
	 */
	public final void setAuditSubItemUsedBy_AuditItemUsedBy(audit.proxies.AuditItemUsedBy auditsubitemusedby_audititemusedby)
	{
		setAuditSubItemUsedBy_AuditItemUsedBy(getContext(), auditsubitemusedby_audititemusedby);
	}

	/**
	 * Set value of AuditSubItemUsedBy_AuditItemUsedBy
	 * @param context
	 * @param auditsubitemusedby_audititemusedby
	 */
	public final void setAuditSubItemUsedBy_AuditItemUsedBy(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditItemUsedBy auditsubitemusedby_audititemusedby)
	{
		if (auditsubitemusedby_audititemusedby == null)
			getMendixObject().setValue(context, MemberNames.AuditSubItemUsedBy_AuditItemUsedBy.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditSubItemUsedBy_AuditItemUsedBy.toString(), auditsubitemusedby_audititemusedby.getMendixObject().getId());
	}

	/**
	 * @return value of AuditSubItemUsedBy_AuditAssociation
	 */
	public final audit.proxies.AuditAssociation getAuditSubItemUsedBy_AuditAssociation() throws com.mendix.core.CoreException
	{
		return getAuditSubItemUsedBy_AuditAssociation(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditSubItemUsedBy_AuditAssociation
	 */
	public final audit.proxies.AuditAssociation getAuditSubItemUsedBy_AuditAssociation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditAssociation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditSubItemUsedBy_AuditAssociation.toString());
		if (identifier != null)
			result = audit.proxies.AuditAssociation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditSubItemUsedBy_AuditAssociation
	 * @param auditsubitemusedby_auditassociation
	 */
	public final void setAuditSubItemUsedBy_AuditAssociation(audit.proxies.AuditAssociation auditsubitemusedby_auditassociation)
	{
		setAuditSubItemUsedBy_AuditAssociation(getContext(), auditsubitemusedby_auditassociation);
	}

	/**
	 * Set value of AuditSubItemUsedBy_AuditAssociation
	 * @param context
	 * @param auditsubitemusedby_auditassociation
	 */
	public final void setAuditSubItemUsedBy_AuditAssociation(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditAssociation auditsubitemusedby_auditassociation)
	{
		if (auditsubitemusedby_auditassociation == null)
			getMendixObject().setValue(context, MemberNames.AuditSubItemUsedBy_AuditAssociation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditSubItemUsedBy_AuditAssociation.toString(), auditsubitemusedby_auditassociation.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return auditSubItemUsedByMendixObject;
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
			final audit.proxies.AuditSubItemUsedBy that = (audit.proxies.AuditSubItemUsedBy) obj;
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
		return "Audit.AuditSubItemUsedBy";
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