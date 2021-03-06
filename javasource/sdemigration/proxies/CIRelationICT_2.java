// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class CIRelationICT_2 extends sdemigration.proxies.SDEObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.CIRelationICT_2";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		item_1("item_1"),
		item_2("item_2"),
		Relationship("Relationship"),
		processed("processed"),
		SDEObject_MigrationItemRun("SDEMigration.SDEObject_MigrationItemRun"),
		IncomingRequest_SDEObject("InterfaceRequests.IncomingRequest_SDEObject");

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

	public CIRelationICT_2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.CIRelationICT_2"));
	}

	protected CIRelationICT_2(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cIRelationICT_2MendixObject)
	{
		super(context, cIRelationICT_2MendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.CIRelationICT_2", cIRelationICT_2MendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.CIRelationICT_2");
	}

	/**
	 * @deprecated Use 'CIRelationICT_2.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.CIRelationICT_2 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.CIRelationICT_2.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.CIRelationICT_2 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.CIRelationICT_2(context, mendixObject);
	}

	public static sdemigration.proxies.CIRelationICT_2 load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.CIRelationICT_2.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.CIRelationICT_2> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.CIRelationICT_2> result = new java.util.ArrayList<sdemigration.proxies.CIRelationICT_2>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.CIRelationICT_2" + xpathConstraint))
			result.add(sdemigration.proxies.CIRelationICT_2.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of item_1
	 */
	public final java.lang.String getitem_1()
	{
		return getitem_1(getContext());
	}

	/**
	 * @param context
	 * @return value of item_1
	 */
	public final java.lang.String getitem_1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.item_1.toString());
	}

	/**
	 * Set value of item_1
	 * @param item_1
	 */
	public final void setitem_1(java.lang.String item_1)
	{
		setitem_1(getContext(), item_1);
	}

	/**
	 * Set value of item_1
	 * @param context
	 * @param item_1
	 */
	public final void setitem_1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String item_1)
	{
		getMendixObject().setValue(context, MemberNames.item_1.toString(), item_1);
	}

	/**
	 * @return value of item_2
	 */
	public final java.lang.String getitem_2()
	{
		return getitem_2(getContext());
	}

	/**
	 * @param context
	 * @return value of item_2
	 */
	public final java.lang.String getitem_2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.item_2.toString());
	}

	/**
	 * Set value of item_2
	 * @param item_2
	 */
	public final void setitem_2(java.lang.String item_2)
	{
		setitem_2(getContext(), item_2);
	}

	/**
	 * Set value of item_2
	 * @param context
	 * @param item_2
	 */
	public final void setitem_2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String item_2)
	{
		getMendixObject().setValue(context, MemberNames.item_2.toString(), item_2);
	}

	/**
	 * @return value of Relationship
	 */
	public final java.lang.String getRelationship()
	{
		return getRelationship(getContext());
	}

	/**
	 * @param context
	 * @return value of Relationship
	 */
	public final java.lang.String getRelationship(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Relationship.toString());
	}

	/**
	 * Set value of Relationship
	 * @param relationship
	 */
	public final void setRelationship(java.lang.String relationship)
	{
		setRelationship(getContext(), relationship);
	}

	/**
	 * Set value of Relationship
	 * @param context
	 * @param relationship
	 */
	public final void setRelationship(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String relationship)
	{
		getMendixObject().setValue(context, MemberNames.Relationship.toString(), relationship);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sdemigration.proxies.CIRelationICT_2 that = (sdemigration.proxies.CIRelationICT_2) obj;
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
		return "SDEMigration.CIRelationICT_2";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
