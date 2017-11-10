// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cmdb.proxies;

public class ScreenBlock
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject screenBlockMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CMDB.ScreenBlock";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Title("Title"),
		ScreenblockOrder("ScreenblockOrder"),
		Active("Active"),
		ScreenBlock_DynamicCIDefinition("CMDB.ScreenBlock_DynamicCIDefinition");

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

	public ScreenBlock(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CMDB.ScreenBlock"));
	}

	protected ScreenBlock(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject screenBlockMendixObject)
	{
		if (screenBlockMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CMDB.ScreenBlock", screenBlockMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CMDB.ScreenBlock");

		this.screenBlockMendixObject = screenBlockMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ScreenBlock.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static cmdb.proxies.ScreenBlock initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return cmdb.proxies.ScreenBlock.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static cmdb.proxies.ScreenBlock initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new cmdb.proxies.ScreenBlock(context, mendixObject);
	}

	public static cmdb.proxies.ScreenBlock load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return cmdb.proxies.ScreenBlock.initialize(context, mendixObject);
	}

	public static java.util.List<cmdb.proxies.ScreenBlock> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<cmdb.proxies.ScreenBlock> result = new java.util.ArrayList<cmdb.proxies.ScreenBlock>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CMDB.ScreenBlock" + xpathConstraint))
			result.add(cmdb.proxies.ScreenBlock.initialize(context, obj));
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
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of ScreenblockOrder
	 */
	public final java.lang.Integer getScreenblockOrder()
	{
		return getScreenblockOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of ScreenblockOrder
	 */
	public final java.lang.Integer getScreenblockOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ScreenblockOrder.toString());
	}

	/**
	 * Set value of ScreenblockOrder
	 * @param screenblockorder
	 */
	public final void setScreenblockOrder(java.lang.Integer screenblockorder)
	{
		setScreenblockOrder(getContext(), screenblockorder);
	}

	/**
	 * Set value of ScreenblockOrder
	 * @param context
	 * @param screenblockorder
	 */
	public final void setScreenblockOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer screenblockorder)
	{
		getMendixObject().setValue(context, MemberNames.ScreenblockOrder.toString(), screenblockorder);
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
	 * @return value of ScreenBlock_DynamicCIDefinition
	 */
	public final cmdb.proxies.CMDBType getScreenBlock_DynamicCIDefinition() throws com.mendix.core.CoreException
	{
		return getScreenBlock_DynamicCIDefinition(getContext());
	}

	/**
	 * @param context
	 * @return value of ScreenBlock_DynamicCIDefinition
	 */
	public final cmdb.proxies.CMDBType getScreenBlock_DynamicCIDefinition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.CMDBType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ScreenBlock_DynamicCIDefinition.toString());
		if (identifier != null)
			result = cmdb.proxies.CMDBType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ScreenBlock_DynamicCIDefinition
	 * @param screenblock_dynamiccidefinition
	 */
	public final void setScreenBlock_DynamicCIDefinition(cmdb.proxies.CMDBType screenblock_dynamiccidefinition)
	{
		setScreenBlock_DynamicCIDefinition(getContext(), screenblock_dynamiccidefinition);
	}

	/**
	 * Set value of ScreenBlock_DynamicCIDefinition
	 * @param context
	 * @param screenblock_dynamiccidefinition
	 */
	public final void setScreenBlock_DynamicCIDefinition(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.CMDBType screenblock_dynamiccidefinition)
	{
		if (screenblock_dynamiccidefinition == null)
			getMendixObject().setValue(context, MemberNames.ScreenBlock_DynamicCIDefinition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ScreenBlock_DynamicCIDefinition.toString(), screenblock_dynamiccidefinition.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return screenBlockMendixObject;
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
			final cmdb.proxies.ScreenBlock that = (cmdb.proxies.ScreenBlock) obj;
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
		return "CMDB.ScreenBlock";
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