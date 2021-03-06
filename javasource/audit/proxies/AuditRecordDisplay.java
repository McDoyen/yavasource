// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audit.proxies;

public class AuditRecordDisplay
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject auditRecordDisplayMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Audit.AuditRecordDisplay";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FromAudit("FromAudit"),
		Entity("Entity"),
		Key("Key"),
		IsDeleted("IsDeleted"),
		PointInTime("PointInTime"),
		ShowUserAttributesOnly("ShowUserAttributesOnly"),
		UsedByDetermined("UsedByDetermined"),
		AuditRecordDisplay_AuditRecord("Audit.AuditRecordDisplay_AuditRecord");

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

	public AuditRecordDisplay(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Audit.AuditRecordDisplay"));
	}

	protected AuditRecordDisplay(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject auditRecordDisplayMendixObject)
	{
		if (auditRecordDisplayMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Audit.AuditRecordDisplay", auditRecordDisplayMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Audit.AuditRecordDisplay");

		this.auditRecordDisplayMendixObject = auditRecordDisplayMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AuditRecordDisplay.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static audit.proxies.AuditRecordDisplay initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return audit.proxies.AuditRecordDisplay.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static audit.proxies.AuditRecordDisplay initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new audit.proxies.AuditRecordDisplay(context, mendixObject);
	}

	public static audit.proxies.AuditRecordDisplay load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return audit.proxies.AuditRecordDisplay.initialize(context, mendixObject);
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
	 * @return value of FromAudit
	 */
	public final java.lang.Boolean getFromAudit()
	{
		return getFromAudit(getContext());
	}

	/**
	 * @param context
	 * @return value of FromAudit
	 */
	public final java.lang.Boolean getFromAudit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.FromAudit.toString());
	}

	/**
	 * Set value of FromAudit
	 * @param fromaudit
	 */
	public final void setFromAudit(java.lang.Boolean fromaudit)
	{
		setFromAudit(getContext(), fromaudit);
	}

	/**
	 * Set value of FromAudit
	 * @param context
	 * @param fromaudit
	 */
	public final void setFromAudit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean fromaudit)
	{
		getMendixObject().setValue(context, MemberNames.FromAudit.toString(), fromaudit);
	}

	/**
	 * @return value of Entity
	 */
	public final java.lang.String getEntity()
	{
		return getEntity(getContext());
	}

	/**
	 * @param context
	 * @return value of Entity
	 */
	public final java.lang.String getEntity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Entity.toString());
	}

	/**
	 * Set value of Entity
	 * @param entity
	 */
	public final void setEntity(java.lang.String entity)
	{
		setEntity(getContext(), entity);
	}

	/**
	 * Set value of Entity
	 * @param context
	 * @param entity
	 */
	public final void setEntity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String entity)
	{
		getMendixObject().setValue(context, MemberNames.Entity.toString(), entity);
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
	 * @return value of IsDeleted
	 */
	public final java.lang.Boolean getIsDeleted()
	{
		return getIsDeleted(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDeleted
	 */
	public final java.lang.Boolean getIsDeleted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsDeleted.toString());
	}

	/**
	 * Set value of IsDeleted
	 * @param isdeleted
	 */
	public final void setIsDeleted(java.lang.Boolean isdeleted)
	{
		setIsDeleted(getContext(), isdeleted);
	}

	/**
	 * Set value of IsDeleted
	 * @param context
	 * @param isdeleted
	 */
	public final void setIsDeleted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdeleted)
	{
		getMendixObject().setValue(context, MemberNames.IsDeleted.toString(), isdeleted);
	}

	/**
	 * @return value of PointInTime
	 */
	public final java.util.Date getPointInTime()
	{
		return getPointInTime(getContext());
	}

	/**
	 * @param context
	 * @return value of PointInTime
	 */
	public final java.util.Date getPointInTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.PointInTime.toString());
	}

	/**
	 * Set value of PointInTime
	 * @param pointintime
	 */
	public final void setPointInTime(java.util.Date pointintime)
	{
		setPointInTime(getContext(), pointintime);
	}

	/**
	 * Set value of PointInTime
	 * @param context
	 * @param pointintime
	 */
	public final void setPointInTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date pointintime)
	{
		getMendixObject().setValue(context, MemberNames.PointInTime.toString(), pointintime);
	}

	/**
	 * @return value of ShowUserAttributesOnly
	 */
	public final java.lang.Boolean getShowUserAttributesOnly()
	{
		return getShowUserAttributesOnly(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowUserAttributesOnly
	 */
	public final java.lang.Boolean getShowUserAttributesOnly(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowUserAttributesOnly.toString());
	}

	/**
	 * Set value of ShowUserAttributesOnly
	 * @param showuserattributesonly
	 */
	public final void setShowUserAttributesOnly(java.lang.Boolean showuserattributesonly)
	{
		setShowUserAttributesOnly(getContext(), showuserattributesonly);
	}

	/**
	 * Set value of ShowUserAttributesOnly
	 * @param context
	 * @param showuserattributesonly
	 */
	public final void setShowUserAttributesOnly(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showuserattributesonly)
	{
		getMendixObject().setValue(context, MemberNames.ShowUserAttributesOnly.toString(), showuserattributesonly);
	}

	/**
	 * @return value of UsedByDetermined
	 */
	public final java.lang.Boolean getUsedByDetermined()
	{
		return getUsedByDetermined(getContext());
	}

	/**
	 * @param context
	 * @return value of UsedByDetermined
	 */
	public final java.lang.Boolean getUsedByDetermined(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UsedByDetermined.toString());
	}

	/**
	 * Set value of UsedByDetermined
	 * @param usedbydetermined
	 */
	public final void setUsedByDetermined(java.lang.Boolean usedbydetermined)
	{
		setUsedByDetermined(getContext(), usedbydetermined);
	}

	/**
	 * Set value of UsedByDetermined
	 * @param context
	 * @param usedbydetermined
	 */
	public final void setUsedByDetermined(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usedbydetermined)
	{
		getMendixObject().setValue(context, MemberNames.UsedByDetermined.toString(), usedbydetermined);
	}

	/**
	 * @return value of AuditRecordDisplay_AuditRecord
	 */
	public final audit.proxies.AuditRecord getAuditRecordDisplay_AuditRecord() throws com.mendix.core.CoreException
	{
		return getAuditRecordDisplay_AuditRecord(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditRecordDisplay_AuditRecord
	 */
	public final audit.proxies.AuditRecord getAuditRecordDisplay_AuditRecord(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audit.proxies.AuditRecord result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AuditRecordDisplay_AuditRecord.toString());
		if (identifier != null)
			result = audit.proxies.AuditRecord.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AuditRecordDisplay_AuditRecord
	 * @param auditrecorddisplay_auditrecord
	 */
	public final void setAuditRecordDisplay_AuditRecord(audit.proxies.AuditRecord auditrecorddisplay_auditrecord)
	{
		setAuditRecordDisplay_AuditRecord(getContext(), auditrecorddisplay_auditrecord);
	}

	/**
	 * Set value of AuditRecordDisplay_AuditRecord
	 * @param context
	 * @param auditrecorddisplay_auditrecord
	 */
	public final void setAuditRecordDisplay_AuditRecord(com.mendix.systemwideinterfaces.core.IContext context, audit.proxies.AuditRecord auditrecorddisplay_auditrecord)
	{
		if (auditrecorddisplay_auditrecord == null)
			getMendixObject().setValue(context, MemberNames.AuditRecordDisplay_AuditRecord.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AuditRecordDisplay_AuditRecord.toString(), auditrecorddisplay_auditrecord.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return auditRecordDisplayMendixObject;
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
			final audit.proxies.AuditRecordDisplay that = (audit.proxies.AuditRecordDisplay) obj;
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
		return "Audit.AuditRecordDisplay";
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
