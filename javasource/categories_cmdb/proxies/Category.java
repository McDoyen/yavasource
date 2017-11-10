// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package categories_cmdb.proxies;

public class Category
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject categoryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Categories_CMDB.Category";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CategoryName("CategoryName"),
		Level("Level"),
		ShowCITypes("ShowCITypes"),
		CategoryFullName("CategoryFullName"),
		ImportKey("ImportKey"),
		InterfaceGUID("InterfaceGUID"),
		Category_Category("Categories_CMDB.Category_Category"),
		TempCategory_CategoryToMove("Categories_CMDB.TempCategory_CategoryToMove"),
		Category_CMDBType("Categories_CMDB.Category_CMDBType"),
		Category_InstanceRequestCondition("Categories_CMDB.Category_InstanceRequestCondition"),
		Category_TemplateRequestCondition("Categories_CMDB.Category_TemplateRequestCondition");

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

	public Category(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Categories_CMDB.Category"));
	}

	protected Category(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject categoryMendixObject)
	{
		if (categoryMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Categories_CMDB.Category", categoryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Categories_CMDB.Category");

		this.categoryMendixObject = categoryMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Category.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static categories_cmdb.proxies.Category initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return categories_cmdb.proxies.Category.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static categories_cmdb.proxies.Category initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new categories_cmdb.proxies.Category(context, mendixObject);
	}

	public static categories_cmdb.proxies.Category load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return categories_cmdb.proxies.Category.initialize(context, mendixObject);
	}

	public static java.util.List<categories_cmdb.proxies.Category> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<categories_cmdb.proxies.Category> result = new java.util.ArrayList<categories_cmdb.proxies.Category>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Categories_CMDB.Category" + xpathConstraint))
			result.add(categories_cmdb.proxies.Category.initialize(context, obj));
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
	 * @return value of CategoryName
	 */
	public final java.lang.String getCategoryName()
	{
		return getCategoryName(getContext());
	}

	/**
	 * @param context
	 * @return value of CategoryName
	 */
	public final java.lang.String getCategoryName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CategoryName.toString());
	}

	/**
	 * Set value of CategoryName
	 * @param categoryname
	 */
	public final void setCategoryName(java.lang.String categoryname)
	{
		setCategoryName(getContext(), categoryname);
	}

	/**
	 * Set value of CategoryName
	 * @param context
	 * @param categoryname
	 */
	public final void setCategoryName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String categoryname)
	{
		getMendixObject().setValue(context, MemberNames.CategoryName.toString(), categoryname);
	}

	/**
	 * @return value of Level
	 */
	public final java.lang.Integer getLevel()
	{
		return getLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of Level
	 */
	public final java.lang.Integer getLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Level.toString());
	}

	/**
	 * Set value of Level
	 * @param level
	 */
	public final void setLevel(java.lang.Integer level)
	{
		setLevel(getContext(), level);
	}

	/**
	 * Set value of Level
	 * @param context
	 * @param level
	 */
	public final void setLevel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer level)
	{
		getMendixObject().setValue(context, MemberNames.Level.toString(), level);
	}

	/**
	 * @return value of ShowCITypes
	 */
	public final java.lang.Boolean getShowCITypes()
	{
		return getShowCITypes(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowCITypes
	 */
	public final java.lang.Boolean getShowCITypes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowCITypes.toString());
	}

	/**
	 * Set value of ShowCITypes
	 * @param showcitypes
	 */
	public final void setShowCITypes(java.lang.Boolean showcitypes)
	{
		setShowCITypes(getContext(), showcitypes);
	}

	/**
	 * Set value of ShowCITypes
	 * @param context
	 * @param showcitypes
	 */
	public final void setShowCITypes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showcitypes)
	{
		getMendixObject().setValue(context, MemberNames.ShowCITypes.toString(), showcitypes);
	}

	/**
	 * @return value of CategoryFullName
	 */
	public final java.lang.String getCategoryFullName()
	{
		return getCategoryFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of CategoryFullName
	 */
	public final java.lang.String getCategoryFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CategoryFullName.toString());
	}

	/**
	 * Set value of CategoryFullName
	 * @param categoryfullname
	 */
	public final void setCategoryFullName(java.lang.String categoryfullname)
	{
		setCategoryFullName(getContext(), categoryfullname);
	}

	/**
	 * Set value of CategoryFullName
	 * @param context
	 * @param categoryfullname
	 */
	public final void setCategoryFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String categoryfullname)
	{
		getMendixObject().setValue(context, MemberNames.CategoryFullName.toString(), categoryfullname);
	}

	/**
	 * @return value of ImportKey
	 */
	public final java.lang.String getImportKey()
	{
		return getImportKey(getContext());
	}

	/**
	 * @param context
	 * @return value of ImportKey
	 */
	public final java.lang.String getImportKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ImportKey.toString());
	}

	/**
	 * Set value of ImportKey
	 * @param importkey
	 */
	public final void setImportKey(java.lang.String importkey)
	{
		setImportKey(getContext(), importkey);
	}

	/**
	 * Set value of ImportKey
	 * @param context
	 * @param importkey
	 */
	public final void setImportKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String importkey)
	{
		getMendixObject().setValue(context, MemberNames.ImportKey.toString(), importkey);
	}

	/**
	 * @return value of InterfaceGUID
	 */
	public final java.lang.String getInterfaceGUID()
	{
		return getInterfaceGUID(getContext());
	}

	/**
	 * @param context
	 * @return value of InterfaceGUID
	 */
	public final java.lang.String getInterfaceGUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InterfaceGUID.toString());
	}

	/**
	 * Set value of InterfaceGUID
	 * @param interfaceguid
	 */
	public final void setInterfaceGUID(java.lang.String interfaceguid)
	{
		setInterfaceGUID(getContext(), interfaceguid);
	}

	/**
	 * Set value of InterfaceGUID
	 * @param context
	 * @param interfaceguid
	 */
	public final void setInterfaceGUID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String interfaceguid)
	{
		getMendixObject().setValue(context, MemberNames.InterfaceGUID.toString(), interfaceguid);
	}

	/**
	 * @return value of Category_Category
	 */
	public final categories_cmdb.proxies.Category getCategory_Category() throws com.mendix.core.CoreException
	{
		return getCategory_Category(getContext());
	}

	/**
	 * @param context
	 * @return value of Category_Category
	 */
	public final categories_cmdb.proxies.Category getCategory_Category(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		categories_cmdb.proxies.Category result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Category_Category.toString());
		if (identifier != null)
			result = categories_cmdb.proxies.Category.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Category_Category
	 * @param category_category
	 */
	public final void setCategory_Category(categories_cmdb.proxies.Category category_category)
	{
		setCategory_Category(getContext(), category_category);
	}

	/**
	 * Set value of Category_Category
	 * @param context
	 * @param category_category
	 */
	public final void setCategory_Category(com.mendix.systemwideinterfaces.core.IContext context, categories_cmdb.proxies.Category category_category)
	{
		if (category_category == null)
			getMendixObject().setValue(context, MemberNames.Category_Category.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Category_Category.toString(), category_category.getMendixObject().getId());
	}

	/**
	 * @return value of TempCategory_CategoryToMove
	 */
	public final java.util.List<categories_cmdb.proxies.Category> getTempCategory_CategoryToMove() throws com.mendix.core.CoreException
	{
		return getTempCategory_CategoryToMove(getContext());
	}

	/**
	 * @param context
	 * @return value of TempCategory_CategoryToMove
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<categories_cmdb.proxies.Category> getTempCategory_CategoryToMove(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<categories_cmdb.proxies.Category> result = new java.util.ArrayList<categories_cmdb.proxies.Category>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.TempCategory_CategoryToMove.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(categories_cmdb.proxies.Category.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of TempCategory_CategoryToMove
	 * @param tempcategory_categorytomove
	 */
	public final void setTempCategory_CategoryToMove(java.util.List<categories_cmdb.proxies.Category> tempcategory_categorytomove)
	{
		setTempCategory_CategoryToMove(getContext(), tempcategory_categorytomove);
	}

	/**
	 * Set value of TempCategory_CategoryToMove
	 * @param context
	 * @param tempcategory_categorytomove
	 */
	public final void setTempCategory_CategoryToMove(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<categories_cmdb.proxies.Category> tempcategory_categorytomove)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (categories_cmdb.proxies.Category proxyObject : tempcategory_categorytomove)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.TempCategory_CategoryToMove.toString(), identifiers);
	}

	/**
	 * @return value of Category_CMDBType
	 */
	public final java.util.List<cmdb.proxies.CMDBType> getCategory_CMDBType() throws com.mendix.core.CoreException
	{
		return getCategory_CMDBType(getContext());
	}

	/**
	 * @param context
	 * @return value of Category_CMDBType
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<cmdb.proxies.CMDBType> getCategory_CMDBType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<cmdb.proxies.CMDBType> result = new java.util.ArrayList<cmdb.proxies.CMDBType>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Category_CMDBType.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(cmdb.proxies.CMDBType.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Category_CMDBType
	 * @param category_cmdbtype
	 */
	public final void setCategory_CMDBType(java.util.List<cmdb.proxies.CMDBType> category_cmdbtype)
	{
		setCategory_CMDBType(getContext(), category_cmdbtype);
	}

	/**
	 * Set value of Category_CMDBType
	 * @param context
	 * @param category_cmdbtype
	 */
	public final void setCategory_CMDBType(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<cmdb.proxies.CMDBType> category_cmdbtype)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (cmdb.proxies.CMDBType proxyObject : category_cmdbtype)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Category_CMDBType.toString(), identifiers);
	}

	/**
	 * @return value of Category_InstanceRequestCondition
	 */
	public final workflowinstance.proxies.RequestCondition getCategory_InstanceRequestCondition() throws com.mendix.core.CoreException
	{
		return getCategory_InstanceRequestCondition(getContext());
	}

	/**
	 * @param context
	 * @return value of Category_InstanceRequestCondition
	 */
	public final workflowinstance.proxies.RequestCondition getCategory_InstanceRequestCondition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowinstance.proxies.RequestCondition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Category_InstanceRequestCondition.toString());
		if (identifier != null)
			result = workflowinstance.proxies.RequestCondition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Category_InstanceRequestCondition
	 * @param category_instancerequestcondition
	 */
	public final void setCategory_InstanceRequestCondition(workflowinstance.proxies.RequestCondition category_instancerequestcondition)
	{
		setCategory_InstanceRequestCondition(getContext(), category_instancerequestcondition);
	}

	/**
	 * Set value of Category_InstanceRequestCondition
	 * @param context
	 * @param category_instancerequestcondition
	 */
	public final void setCategory_InstanceRequestCondition(com.mendix.systemwideinterfaces.core.IContext context, workflowinstance.proxies.RequestCondition category_instancerequestcondition)
	{
		if (category_instancerequestcondition == null)
			getMendixObject().setValue(context, MemberNames.Category_InstanceRequestCondition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Category_InstanceRequestCondition.toString(), category_instancerequestcondition.getMendixObject().getId());
	}

	/**
	 * @return value of Category_TemplateRequestCondition
	 */
	public final workflowtemplate.proxies.RequestCondition getCategory_TemplateRequestCondition() throws com.mendix.core.CoreException
	{
		return getCategory_TemplateRequestCondition(getContext());
	}

	/**
	 * @param context
	 * @return value of Category_TemplateRequestCondition
	 */
	public final workflowtemplate.proxies.RequestCondition getCategory_TemplateRequestCondition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowtemplate.proxies.RequestCondition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Category_TemplateRequestCondition.toString());
		if (identifier != null)
			result = workflowtemplate.proxies.RequestCondition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Category_TemplateRequestCondition
	 * @param category_templaterequestcondition
	 */
	public final void setCategory_TemplateRequestCondition(workflowtemplate.proxies.RequestCondition category_templaterequestcondition)
	{
		setCategory_TemplateRequestCondition(getContext(), category_templaterequestcondition);
	}

	/**
	 * Set value of Category_TemplateRequestCondition
	 * @param context
	 * @param category_templaterequestcondition
	 */
	public final void setCategory_TemplateRequestCondition(com.mendix.systemwideinterfaces.core.IContext context, workflowtemplate.proxies.RequestCondition category_templaterequestcondition)
	{
		if (category_templaterequestcondition == null)
			getMendixObject().setValue(context, MemberNames.Category_TemplateRequestCondition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Category_TemplateRequestCondition.toString(), category_templaterequestcondition.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return categoryMendixObject;
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
			final categories_cmdb.proxies.Category that = (categories_cmdb.proxies.Category) obj;
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
		return "Categories_CMDB.Category";
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
