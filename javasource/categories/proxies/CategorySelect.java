// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package categories.proxies;

public class CategorySelect
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject categorySelectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Categories.CategorySelect";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SelectLevel("SelectLevel"),
		CategoryFullName("CategoryFullName"),
		CategoryType("CategoryType"),
		CategorySelect_Category("Categories.CategorySelect_Category"),
		CategorySelect_Request("Categories.CategorySelect_Request");

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

	public CategorySelect(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Categories.CategorySelect"));
	}

	protected CategorySelect(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject categorySelectMendixObject)
	{
		if (categorySelectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Categories.CategorySelect", categorySelectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Categories.CategorySelect");

		this.categorySelectMendixObject = categorySelectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CategorySelect.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static categories.proxies.CategorySelect initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return categories.proxies.CategorySelect.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static categories.proxies.CategorySelect initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new categories.proxies.CategorySelect(context, mendixObject);
	}

	public static categories.proxies.CategorySelect load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return categories.proxies.CategorySelect.initialize(context, mendixObject);
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
	 * @return value of SelectLevel
	 */
	public final java.lang.Integer getSelectLevel()
	{
		return getSelectLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectLevel
	 */
	public final java.lang.Integer getSelectLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.SelectLevel.toString());
	}

	/**
	 * Set value of SelectLevel
	 * @param selectlevel
	 */
	public final void setSelectLevel(java.lang.Integer selectlevel)
	{
		setSelectLevel(getContext(), selectlevel);
	}

	/**
	 * Set value of SelectLevel
	 * @param context
	 * @param selectlevel
	 */
	public final void setSelectLevel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer selectlevel)
	{
		getMendixObject().setValue(context, MemberNames.SelectLevel.toString(), selectlevel);
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
	 * Set value of CategoryType
	 * @param categorytype
	 */
	public final categories.proxies.CategoryType getCategoryType()
	{
		return getCategoryType(getContext());
	}

	/**
	 * @param context
	 * @return value of CategoryType
	 */
	public final categories.proxies.CategoryType getCategoryType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.CategoryType.toString());
		if (obj == null)
			return null;

		return categories.proxies.CategoryType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of CategoryType
	 * @param categorytype
	 */
	public final void setCategoryType(categories.proxies.CategoryType categorytype)
	{
		setCategoryType(getContext(), categorytype);
	}

	/**
	 * Set value of CategoryType
	 * @param context
	 * @param categorytype
	 */
	public final void setCategoryType(com.mendix.systemwideinterfaces.core.IContext context, categories.proxies.CategoryType categorytype)
	{
		if (categorytype != null)
			getMendixObject().setValue(context, MemberNames.CategoryType.toString(), categorytype.toString());
		else
			getMendixObject().setValue(context, MemberNames.CategoryType.toString(), null);
	}

	/**
	 * @return value of CategorySelect_Category
	 */
	public final categories.proxies.Category getCategorySelect_Category() throws com.mendix.core.CoreException
	{
		return getCategorySelect_Category(getContext());
	}

	/**
	 * @param context
	 * @return value of CategorySelect_Category
	 */
	public final categories.proxies.Category getCategorySelect_Category(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		categories.proxies.Category result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CategorySelect_Category.toString());
		if (identifier != null)
			result = categories.proxies.Category.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CategorySelect_Category
	 * @param categoryselect_category
	 */
	public final void setCategorySelect_Category(categories.proxies.Category categoryselect_category)
	{
		setCategorySelect_Category(getContext(), categoryselect_category);
	}

	/**
	 * Set value of CategorySelect_Category
	 * @param context
	 * @param categoryselect_category
	 */
	public final void setCategorySelect_Category(com.mendix.systemwideinterfaces.core.IContext context, categories.proxies.Category categoryselect_category)
	{
		if (categoryselect_category == null)
			getMendixObject().setValue(context, MemberNames.CategorySelect_Category.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CategorySelect_Category.toString(), categoryselect_category.getMendixObject().getId());
	}

	/**
	 * @return value of CategorySelect_Request
	 */
	public final process.proxies.Request getCategorySelect_Request() throws com.mendix.core.CoreException
	{
		return getCategorySelect_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of CategorySelect_Request
	 */
	public final process.proxies.Request getCategorySelect_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CategorySelect_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CategorySelect_Request
	 * @param categoryselect_request
	 */
	public final void setCategorySelect_Request(process.proxies.Request categoryselect_request)
	{
		setCategorySelect_Request(getContext(), categoryselect_request);
	}

	/**
	 * Set value of CategorySelect_Request
	 * @param context
	 * @param categoryselect_request
	 */
	public final void setCategorySelect_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request categoryselect_request)
	{
		if (categoryselect_request == null)
			getMendixObject().setValue(context, MemberNames.CategorySelect_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CategorySelect_Request.toString(), categoryselect_request.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return categorySelectMendixObject;
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
			final categories.proxies.CategorySelect that = (categories.proxies.CategorySelect) obj;
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
		return "Categories.CategorySelect";
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
