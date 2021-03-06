// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public class TempGroupingSelect
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject tempGroupingSelectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ServiceCatalogue.TempGroupingSelect";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NewGroupingName("NewGroupingName"),
		AddSingleSubProduct("AddSingleSubProduct"),
		TempGroupingSelect_ProductGrouping("ServiceCatalogue.TempGroupingSelect_ProductGrouping");

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

	public TempGroupingSelect(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ServiceCatalogue.TempGroupingSelect"));
	}

	protected TempGroupingSelect(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tempGroupingSelectMendixObject)
	{
		if (tempGroupingSelectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ServiceCatalogue.TempGroupingSelect", tempGroupingSelectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ServiceCatalogue.TempGroupingSelect");

		this.tempGroupingSelectMendixObject = tempGroupingSelectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TempGroupingSelect.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static servicecatalogue.proxies.TempGroupingSelect initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return servicecatalogue.proxies.TempGroupingSelect.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static servicecatalogue.proxies.TempGroupingSelect initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new servicecatalogue.proxies.TempGroupingSelect(context, mendixObject);
	}

	public static servicecatalogue.proxies.TempGroupingSelect load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return servicecatalogue.proxies.TempGroupingSelect.initialize(context, mendixObject);
	}

	public static java.util.List<servicecatalogue.proxies.TempGroupingSelect> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<servicecatalogue.proxies.TempGroupingSelect> result = new java.util.ArrayList<servicecatalogue.proxies.TempGroupingSelect>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ServiceCatalogue.TempGroupingSelect" + xpathConstraint))
			result.add(servicecatalogue.proxies.TempGroupingSelect.initialize(context, obj));
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
	 * @return value of NewGroupingName
	 */
	public final java.lang.String getNewGroupingName()
	{
		return getNewGroupingName(getContext());
	}

	/**
	 * @param context
	 * @return value of NewGroupingName
	 */
	public final java.lang.String getNewGroupingName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NewGroupingName.toString());
	}

	/**
	 * Set value of NewGroupingName
	 * @param newgroupingname
	 */
	public final void setNewGroupingName(java.lang.String newgroupingname)
	{
		setNewGroupingName(getContext(), newgroupingname);
	}

	/**
	 * Set value of NewGroupingName
	 * @param context
	 * @param newgroupingname
	 */
	public final void setNewGroupingName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String newgroupingname)
	{
		getMendixObject().setValue(context, MemberNames.NewGroupingName.toString(), newgroupingname);
	}

	/**
	 * @return value of AddSingleSubProduct
	 */
	public final java.lang.Boolean getAddSingleSubProduct()
	{
		return getAddSingleSubProduct(getContext());
	}

	/**
	 * @param context
	 * @return value of AddSingleSubProduct
	 */
	public final java.lang.Boolean getAddSingleSubProduct(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AddSingleSubProduct.toString());
	}

	/**
	 * Set value of AddSingleSubProduct
	 * @param addsinglesubproduct
	 */
	public final void setAddSingleSubProduct(java.lang.Boolean addsinglesubproduct)
	{
		setAddSingleSubProduct(getContext(), addsinglesubproduct);
	}

	/**
	 * Set value of AddSingleSubProduct
	 * @param context
	 * @param addsinglesubproduct
	 */
	public final void setAddSingleSubProduct(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean addsinglesubproduct)
	{
		getMendixObject().setValue(context, MemberNames.AddSingleSubProduct.toString(), addsinglesubproduct);
	}

	/**
	 * @return value of TempGroupingSelect_ProductGrouping
	 */
	public final servicecatalogue.proxies.ProductGrouping getTempGroupingSelect_ProductGrouping() throws com.mendix.core.CoreException
	{
		return getTempGroupingSelect_ProductGrouping(getContext());
	}

	/**
	 * @param context
	 * @return value of TempGroupingSelect_ProductGrouping
	 */
	public final servicecatalogue.proxies.ProductGrouping getTempGroupingSelect_ProductGrouping(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		servicecatalogue.proxies.ProductGrouping result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TempGroupingSelect_ProductGrouping.toString());
		if (identifier != null)
			result = servicecatalogue.proxies.ProductGrouping.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TempGroupingSelect_ProductGrouping
	 * @param tempgroupingselect_productgrouping
	 */
	public final void setTempGroupingSelect_ProductGrouping(servicecatalogue.proxies.ProductGrouping tempgroupingselect_productgrouping)
	{
		setTempGroupingSelect_ProductGrouping(getContext(), tempgroupingselect_productgrouping);
	}

	/**
	 * Set value of TempGroupingSelect_ProductGrouping
	 * @param context
	 * @param tempgroupingselect_productgrouping
	 */
	public final void setTempGroupingSelect_ProductGrouping(com.mendix.systemwideinterfaces.core.IContext context, servicecatalogue.proxies.ProductGrouping tempgroupingselect_productgrouping)
	{
		if (tempgroupingselect_productgrouping == null)
			getMendixObject().setValue(context, MemberNames.TempGroupingSelect_ProductGrouping.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TempGroupingSelect_ProductGrouping.toString(), tempgroupingselect_productgrouping.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return tempGroupingSelectMendixObject;
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
			final servicecatalogue.proxies.TempGroupingSelect that = (servicecatalogue.proxies.TempGroupingSelect) obj;
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
		return "ServiceCatalogue.TempGroupingSelect";
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
