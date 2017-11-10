// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package categories.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Categories module
	public static void auditCategory_AfterCommit(IContext context, categories.proxies.Category _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "Categories.AuditCategory_AfterCommit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditCategory_AfterDelete(IContext context, categories.proxies.Category _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "Categories.AuditCategory_AfterDelete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void auditCategory_GetAuditRecord(IContext context, categories.proxies.Category _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Object", _object == null ? null : _object.getMendixObject());
			Core.execute(context, "Categories.AuditCategory_GetAuditRecord", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean category_BeforeCommit(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "Categories.Category_BeforeCommit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean category_CheckUniqueness(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "Categories.Category_CheckUniqueness", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.Long category_GetChildDepth(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			return (java.lang.Long)Core.execute(context, "Categories.Category_GetChildDepth", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void copyCategoryList(IContext context, java.util.List<categories.proxies.Category> _categoryList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_categoryList = null;
			if (_categoryList != null)
			{
				listparam_categoryList = new java.util.ArrayList<IMendixObject>();
				for (categories.proxies.Category obj : _categoryList)
					listparam_categoryList.add(obj.getMendixObject());
			}
			params.put("CategoryList", listparam_categoryList);
			Core.execute(context, "Categories.CopyCategoryList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void copyCategoryTree(IContext context, categories.proxies.Category _category_LV0)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category_LV0", _category_LV0 == null ? null : _category_LV0.getMendixObject());
			Core.execute(context, "Categories.CopyCategoryTree", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String getCategoryFullName(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			return (java.lang.String)Core.execute(context, "Categories.GetCategoryFullName", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<categories.proxies.Category> getCategoryListParent_Childs(IContext context, categories.proxies.Category _inputCategory)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InputCategory", _inputCategory == null ? null : _inputCategory.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "Categories.GetCategoryListParent_Childs", params);
			java.util.List<categories.proxies.Category> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<categories.proxies.Category>();
				for (IMendixObject obj : objs)
					result.add(categories.proxies.Category.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<categories.proxies.Category> getCategoryListParent_Root(IContext context, categories.proxies.Category _inputCategory)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InputCategory", _inputCategory == null ? null : _inputCategory.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "Categories.GetCategoryListParent_Root", params);
			java.util.List<categories.proxies.Category> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<categories.proxies.Category>();
				for (IMendixObject obj : objs)
					result.add(categories.proxies.Category.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void getParentCategoryTypeAndForFields(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			Core.execute(context, "Categories.GetParentCategoryTypeAndForFields", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void isParentOnly(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			Core.execute(context, "Categories.IsParentOnly", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CategoryCancel(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			Core.execute(context, "Categories.IVK_CategoryCancel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CategorySave(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			Core.execute(context, "Categories.IVK_CategorySave", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CategorySaveAndClose(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			Core.execute(context, "Categories.IVK_CategorySaveAndClose", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void mergeCategoryList(IContext context, java.util.List<categories.proxies.Category> _categoryList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_categoryList = null;
			if (_categoryList != null)
			{
				listparam_categoryList = new java.util.ArrayList<IMendixObject>();
				for (categories.proxies.Category obj : _categoryList)
					listparam_categoryList.add(obj.getMendixObject());
			}
			params.put("CategoryList", listparam_categoryList);
			Core.execute(context, "Categories.MergeCategoryList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void mergeSubTree(IContext context, categories.proxies.Category _category_LV0)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category_LV0", _category_LV0 == null ? null : _category_LV0.getMendixObject());
			Core.execute(context, "Categories.MergeSubTree", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void moveCategories(IContext context, categories.proxies.Category _category_LV0)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category_LV0", _category_LV0 == null ? null : _category_LV0.getMendixObject());
			Core.execute(context, "Categories.MoveCategories", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void moveCategoryList(IContext context, java.util.List<categories.proxies.Category> _categoryList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_categoryList = null;
			if (_categoryList != null)
			{
				listparam_categoryList = new java.util.ArrayList<IMendixObject>();
				for (categories.proxies.Category obj : _categoryList)
					listparam_categoryList.add(obj.getMendixObject());
			}
			params.put("CategoryList", listparam_categoryList);
			Core.execute(context, "Categories.MoveCategoryList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void newCategoryList(IContext context, java.util.List<categories.proxies.Category> _categoryList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_categoryList = null;
			if (_categoryList != null)
			{
				listparam_categoryList = new java.util.ArrayList<IMendixObject>();
				for (categories.proxies.Category obj : _categoryList)
					listparam_categoryList.add(obj.getMendixObject());
			}
			params.put("CategoryList", listparam_categoryList);
			Core.execute(context, "Categories.NewCategoryList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void pruneCategoryList(IContext context, java.util.List<categories.proxies.Category> _categoryList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_categoryList = null;
			if (_categoryList != null)
			{
				listparam_categoryList = new java.util.ArrayList<IMendixObject>();
				for (categories.proxies.Category obj : _categoryList)
					listparam_categoryList.add(obj.getMendixObject());
			}
			params.put("CategoryList", listparam_categoryList);
			Core.execute(context, "Categories.PruneCategoryList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void pruneNode(IContext context, categories.proxies.Category _category_LV0)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category_LV0", _category_LV0 == null ? null : _category_LV0.getMendixObject());
			Core.execute(context, "Categories.PruneNode", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void refeshClientAfterRollback(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			Core.execute(context, "Categories.RefeshClientAfterRollback", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void rotateType(IContext context, java.util.List<categories.proxies.Category> _categoryList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_categoryList = null;
			if (_categoryList != null)
			{
				listparam_categoryList = new java.util.ArrayList<IMendixObject>();
				for (categories.proxies.Category obj : _categoryList)
					listparam_categoryList.add(obj.getMendixObject());
			}
			params.put("CategoryList", listparam_categoryList);
			Core.execute(context, "Categories.RotateType", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean setCategoryLevel(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "Categories.SetCategoryLevel", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setCategoryStatus(IContext context, java.util.List<categories.proxies.Category> _categoryList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_categoryList = null;
			if (_categoryList != null)
			{
				listparam_categoryList = new java.util.ArrayList<IMendixObject>();
				for (categories.proxies.Category obj : _categoryList)
					listparam_categoryList.add(obj.getMendixObject());
			}
			params.put("CategoryList", listparam_categoryList);
			Core.execute(context, "Categories.SetCategoryStatus", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setProcessType(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			Core.execute(context, "Categories.SetProcessType", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void syncImportKeys(IContext context, java.util.List<categories.proxies.Category> _categoryList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_categoryList = null;
			if (_categoryList != null)
			{
				listparam_categoryList = new java.util.ArrayList<IMendixObject>();
				for (categories.proxies.Category obj : _categoryList)
					listparam_categoryList.add(obj.getMendixObject());
			}
			params.put("CategoryList", listparam_categoryList);
			Core.execute(context, "Categories.SyncImportKeys", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void updateProcessAndFullName(IContext context, categories.proxies.Category _category_1)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category_1", _category_1 == null ? null : _category_1.getMendixObject());
			Core.execute(context, "Categories.UpdateProcessAndFullName", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean validateCategoryRequiredFields(IContext context, categories.proxies.Category _category)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Category", _category == null ? null : _category.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "Categories.ValidateCategoryRequiredFields", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}