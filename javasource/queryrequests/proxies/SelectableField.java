// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package queryrequests.proxies;

public class SelectableField
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject selectableFieldMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "QueryRequests.SelectableField";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FieldName("FieldName"),
		Reference("Reference"),
		FieldUsedInQuery("FieldUsedInQuery"),
		UpdateReferencedField("UpdateReferencedField"),
		UseHelperAttribute("UseHelperAttribute"),
		DynamicAttribute("DynamicAttribute"),
		SelectableField_MendixAttribute("QueryRequests.SelectableField_MendixAttribute"),
		SelectableField_MendixRelation("QueryRequests.SelectableField_MendixRelation"),
		SelectableField_MendixReferencedAttribute("QueryRequests.SelectableField_MendixReferencedAttribute"),
		SelectableField_HelperMendixAttribute("QueryRequests.SelectableField_HelperMendixAttribute"),
		SelectableField_ScreenBlockAttribute("QueryRequests.SelectableField_ScreenBlockAttribute");

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

	public SelectableField(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "QueryRequests.SelectableField"));
	}

	protected SelectableField(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject selectableFieldMendixObject)
	{
		if (selectableFieldMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("QueryRequests.SelectableField", selectableFieldMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a QueryRequests.SelectableField");

		this.selectableFieldMendixObject = selectableFieldMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SelectableField.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static queryrequests.proxies.SelectableField initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return queryrequests.proxies.SelectableField.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static queryrequests.proxies.SelectableField initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new queryrequests.proxies.SelectableField(context, mendixObject);
	}

	public static queryrequests.proxies.SelectableField load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return queryrequests.proxies.SelectableField.initialize(context, mendixObject);
	}

	public static java.util.List<queryrequests.proxies.SelectableField> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<queryrequests.proxies.SelectableField> result = new java.util.ArrayList<queryrequests.proxies.SelectableField>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//QueryRequests.SelectableField" + xpathConstraint))
			result.add(queryrequests.proxies.SelectableField.initialize(context, obj));
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
	 * @return value of FieldName
	 */
	public final java.lang.String getFieldName()
	{
		return getFieldName(getContext());
	}

	/**
	 * @param context
	 * @return value of FieldName
	 */
	public final java.lang.String getFieldName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FieldName.toString());
	}

	/**
	 * Set value of FieldName
	 * @param fieldname
	 */
	public final void setFieldName(java.lang.String fieldname)
	{
		setFieldName(getContext(), fieldname);
	}

	/**
	 * Set value of FieldName
	 * @param context
	 * @param fieldname
	 */
	public final void setFieldName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fieldname)
	{
		getMendixObject().setValue(context, MemberNames.FieldName.toString(), fieldname);
	}

	/**
	 * @return value of Reference
	 */
	public final java.lang.Boolean getReference()
	{
		return getReference(getContext());
	}

	/**
	 * @param context
	 * @return value of Reference
	 */
	public final java.lang.Boolean getReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Reference.toString());
	}

	/**
	 * Set value of Reference
	 * @param reference
	 */
	public final void setReference(java.lang.Boolean reference)
	{
		setReference(getContext(), reference);
	}

	/**
	 * Set value of Reference
	 * @param context
	 * @param reference
	 */
	public final void setReference(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean reference)
	{
		getMendixObject().setValue(context, MemberNames.Reference.toString(), reference);
	}

	/**
	 * @return value of FieldUsedInQuery
	 */
	public final java.lang.Boolean getFieldUsedInQuery()
	{
		return getFieldUsedInQuery(getContext());
	}

	/**
	 * @param context
	 * @return value of FieldUsedInQuery
	 */
	public final java.lang.Boolean getFieldUsedInQuery(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.FieldUsedInQuery.toString());
	}

	/**
	 * Set value of FieldUsedInQuery
	 * @param fieldusedinquery
	 */
	public final void setFieldUsedInQuery(java.lang.Boolean fieldusedinquery)
	{
		setFieldUsedInQuery(getContext(), fieldusedinquery);
	}

	/**
	 * Set value of FieldUsedInQuery
	 * @param context
	 * @param fieldusedinquery
	 */
	public final void setFieldUsedInQuery(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean fieldusedinquery)
	{
		getMendixObject().setValue(context, MemberNames.FieldUsedInQuery.toString(), fieldusedinquery);
	}

	/**
	 * @return value of UpdateReferencedField
	 */
	public final java.lang.Boolean getUpdateReferencedField()
	{
		return getUpdateReferencedField(getContext());
	}

	/**
	 * @param context
	 * @return value of UpdateReferencedField
	 */
	public final java.lang.Boolean getUpdateReferencedField(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UpdateReferencedField.toString());
	}

	/**
	 * Set value of UpdateReferencedField
	 * @param updatereferencedfield
	 */
	public final void setUpdateReferencedField(java.lang.Boolean updatereferencedfield)
	{
		setUpdateReferencedField(getContext(), updatereferencedfield);
	}

	/**
	 * Set value of UpdateReferencedField
	 * @param context
	 * @param updatereferencedfield
	 */
	public final void setUpdateReferencedField(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean updatereferencedfield)
	{
		getMendixObject().setValue(context, MemberNames.UpdateReferencedField.toString(), updatereferencedfield);
	}

	/**
	 * @return value of UseHelperAttribute
	 */
	public final java.lang.Boolean getUseHelperAttribute()
	{
		return getUseHelperAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of UseHelperAttribute
	 */
	public final java.lang.Boolean getUseHelperAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseHelperAttribute.toString());
	}

	/**
	 * Set value of UseHelperAttribute
	 * @param usehelperattribute
	 */
	public final void setUseHelperAttribute(java.lang.Boolean usehelperattribute)
	{
		setUseHelperAttribute(getContext(), usehelperattribute);
	}

	/**
	 * Set value of UseHelperAttribute
	 * @param context
	 * @param usehelperattribute
	 */
	public final void setUseHelperAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usehelperattribute)
	{
		getMendixObject().setValue(context, MemberNames.UseHelperAttribute.toString(), usehelperattribute);
	}

	/**
	 * @return value of DynamicAttribute
	 */
	public final java.lang.Boolean getDynamicAttribute()
	{
		return getDynamicAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of DynamicAttribute
	 */
	public final java.lang.Boolean getDynamicAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DynamicAttribute.toString());
	}

	/**
	 * Set value of DynamicAttribute
	 * @param dynamicattribute
	 */
	public final void setDynamicAttribute(java.lang.Boolean dynamicattribute)
	{
		setDynamicAttribute(getContext(), dynamicattribute);
	}

	/**
	 * Set value of DynamicAttribute
	 * @param context
	 * @param dynamicattribute
	 */
	public final void setDynamicAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean dynamicattribute)
	{
		getMendixObject().setValue(context, MemberNames.DynamicAttribute.toString(), dynamicattribute);
	}

	/**
	 * @return value of SelectableField_MendixAttribute
	 */
	public final metamodel.proxies.MendixAttribute getSelectableField_MendixAttribute() throws com.mendix.core.CoreException
	{
		return getSelectableField_MendixAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectableField_MendixAttribute
	 */
	public final metamodel.proxies.MendixAttribute getSelectableField_MendixAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		metamodel.proxies.MendixAttribute result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectableField_MendixAttribute.toString());
		if (identifier != null)
			result = metamodel.proxies.MendixAttribute.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SelectableField_MendixAttribute
	 * @param selectablefield_mendixattribute
	 */
	public final void setSelectableField_MendixAttribute(metamodel.proxies.MendixAttribute selectablefield_mendixattribute)
	{
		setSelectableField_MendixAttribute(getContext(), selectablefield_mendixattribute);
	}

	/**
	 * Set value of SelectableField_MendixAttribute
	 * @param context
	 * @param selectablefield_mendixattribute
	 */
	public final void setSelectableField_MendixAttribute(com.mendix.systemwideinterfaces.core.IContext context, metamodel.proxies.MendixAttribute selectablefield_mendixattribute)
	{
		if (selectablefield_mendixattribute == null)
			getMendixObject().setValue(context, MemberNames.SelectableField_MendixAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SelectableField_MendixAttribute.toString(), selectablefield_mendixattribute.getMendixObject().getId());
	}

	/**
	 * @return value of SelectableField_MendixRelation
	 */
	public final metamodel.proxies.MendixRelation getSelectableField_MendixRelation() throws com.mendix.core.CoreException
	{
		return getSelectableField_MendixRelation(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectableField_MendixRelation
	 */
	public final metamodel.proxies.MendixRelation getSelectableField_MendixRelation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		metamodel.proxies.MendixRelation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectableField_MendixRelation.toString());
		if (identifier != null)
			result = metamodel.proxies.MendixRelation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SelectableField_MendixRelation
	 * @param selectablefield_mendixrelation
	 */
	public final void setSelectableField_MendixRelation(metamodel.proxies.MendixRelation selectablefield_mendixrelation)
	{
		setSelectableField_MendixRelation(getContext(), selectablefield_mendixrelation);
	}

	/**
	 * Set value of SelectableField_MendixRelation
	 * @param context
	 * @param selectablefield_mendixrelation
	 */
	public final void setSelectableField_MendixRelation(com.mendix.systemwideinterfaces.core.IContext context, metamodel.proxies.MendixRelation selectablefield_mendixrelation)
	{
		if (selectablefield_mendixrelation == null)
			getMendixObject().setValue(context, MemberNames.SelectableField_MendixRelation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SelectableField_MendixRelation.toString(), selectablefield_mendixrelation.getMendixObject().getId());
	}

	/**
	 * @return value of SelectableField_MendixReferencedAttribute
	 */
	public final metamodel.proxies.MendixAttribute getSelectableField_MendixReferencedAttribute() throws com.mendix.core.CoreException
	{
		return getSelectableField_MendixReferencedAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectableField_MendixReferencedAttribute
	 */
	public final metamodel.proxies.MendixAttribute getSelectableField_MendixReferencedAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		metamodel.proxies.MendixAttribute result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectableField_MendixReferencedAttribute.toString());
		if (identifier != null)
			result = metamodel.proxies.MendixAttribute.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SelectableField_MendixReferencedAttribute
	 * @param selectablefield_mendixreferencedattribute
	 */
	public final void setSelectableField_MendixReferencedAttribute(metamodel.proxies.MendixAttribute selectablefield_mendixreferencedattribute)
	{
		setSelectableField_MendixReferencedAttribute(getContext(), selectablefield_mendixreferencedattribute);
	}

	/**
	 * Set value of SelectableField_MendixReferencedAttribute
	 * @param context
	 * @param selectablefield_mendixreferencedattribute
	 */
	public final void setSelectableField_MendixReferencedAttribute(com.mendix.systemwideinterfaces.core.IContext context, metamodel.proxies.MendixAttribute selectablefield_mendixreferencedattribute)
	{
		if (selectablefield_mendixreferencedattribute == null)
			getMendixObject().setValue(context, MemberNames.SelectableField_MendixReferencedAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SelectableField_MendixReferencedAttribute.toString(), selectablefield_mendixreferencedattribute.getMendixObject().getId());
	}

	/**
	 * @return value of SelectableField_HelperMendixAttribute
	 */
	public final metamodel.proxies.MendixAttribute getSelectableField_HelperMendixAttribute() throws com.mendix.core.CoreException
	{
		return getSelectableField_HelperMendixAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectableField_HelperMendixAttribute
	 */
	public final metamodel.proxies.MendixAttribute getSelectableField_HelperMendixAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		metamodel.proxies.MendixAttribute result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectableField_HelperMendixAttribute.toString());
		if (identifier != null)
			result = metamodel.proxies.MendixAttribute.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SelectableField_HelperMendixAttribute
	 * @param selectablefield_helpermendixattribute
	 */
	public final void setSelectableField_HelperMendixAttribute(metamodel.proxies.MendixAttribute selectablefield_helpermendixattribute)
	{
		setSelectableField_HelperMendixAttribute(getContext(), selectablefield_helpermendixattribute);
	}

	/**
	 * Set value of SelectableField_HelperMendixAttribute
	 * @param context
	 * @param selectablefield_helpermendixattribute
	 */
	public final void setSelectableField_HelperMendixAttribute(com.mendix.systemwideinterfaces.core.IContext context, metamodel.proxies.MendixAttribute selectablefield_helpermendixattribute)
	{
		if (selectablefield_helpermendixattribute == null)
			getMendixObject().setValue(context, MemberNames.SelectableField_HelperMendixAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SelectableField_HelperMendixAttribute.toString(), selectablefield_helpermendixattribute.getMendixObject().getId());
	}

	/**
	 * @return value of SelectableField_ScreenBlockAttribute
	 */
	public final slm.proxies.ScreenBlockAttribute getSelectableField_ScreenBlockAttribute() throws com.mendix.core.CoreException
	{
		return getSelectableField_ScreenBlockAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectableField_ScreenBlockAttribute
	 */
	public final slm.proxies.ScreenBlockAttribute getSelectableField_ScreenBlockAttribute(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slm.proxies.ScreenBlockAttribute result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectableField_ScreenBlockAttribute.toString());
		if (identifier != null)
			result = slm.proxies.ScreenBlockAttribute.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SelectableField_ScreenBlockAttribute
	 * @param selectablefield_screenblockattribute
	 */
	public final void setSelectableField_ScreenBlockAttribute(slm.proxies.ScreenBlockAttribute selectablefield_screenblockattribute)
	{
		setSelectableField_ScreenBlockAttribute(getContext(), selectablefield_screenblockattribute);
	}

	/**
	 * Set value of SelectableField_ScreenBlockAttribute
	 * @param context
	 * @param selectablefield_screenblockattribute
	 */
	public final void setSelectableField_ScreenBlockAttribute(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.ScreenBlockAttribute selectablefield_screenblockattribute)
	{
		if (selectablefield_screenblockattribute == null)
			getMendixObject().setValue(context, MemberNames.SelectableField_ScreenBlockAttribute.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SelectableField_ScreenBlockAttribute.toString(), selectablefield_screenblockattribute.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return selectableFieldMendixObject;
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
			final queryrequests.proxies.SelectableField that = (queryrequests.proxies.SelectableField) obj;
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
		return "QueryRequests.SelectableField";
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
