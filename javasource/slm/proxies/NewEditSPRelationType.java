// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slm.proxies;

public class NewEditSPRelationType
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject newEditSPRelationTypeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SLM.NewEditSPRelationType";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		InverseName("InverseName"),
		Description("Description"),
		Color("Color"),
		NewEditSPRelationType_SPRelationType("SLM.NewEditSPRelationType_SPRelationType");

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

	public NewEditSPRelationType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SLM.NewEditSPRelationType"));
	}

	protected NewEditSPRelationType(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject newEditSPRelationTypeMendixObject)
	{
		if (newEditSPRelationTypeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SLM.NewEditSPRelationType", newEditSPRelationTypeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SLM.NewEditSPRelationType");

		this.newEditSPRelationTypeMendixObject = newEditSPRelationTypeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'NewEditSPRelationType.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static slm.proxies.NewEditSPRelationType initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return slm.proxies.NewEditSPRelationType.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static slm.proxies.NewEditSPRelationType initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new slm.proxies.NewEditSPRelationType(context, mendixObject);
	}

	public static slm.proxies.NewEditSPRelationType load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return slm.proxies.NewEditSPRelationType.initialize(context, mendixObject);
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
	 * @return value of InverseName
	 */
	public final java.lang.String getInverseName()
	{
		return getInverseName(getContext());
	}

	/**
	 * @param context
	 * @return value of InverseName
	 */
	public final java.lang.String getInverseName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InverseName.toString());
	}

	/**
	 * Set value of InverseName
	 * @param inversename
	 */
	public final void setInverseName(java.lang.String inversename)
	{
		setInverseName(getContext(), inversename);
	}

	/**
	 * Set value of InverseName
	 * @param context
	 * @param inversename
	 */
	public final void setInverseName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String inversename)
	{
		getMendixObject().setValue(context, MemberNames.InverseName.toString(), inversename);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Color
	 */
	public final java.lang.String getColor()
	{
		return getColor(getContext());
	}

	/**
	 * @param context
	 * @return value of Color
	 */
	public final java.lang.String getColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Color.toString());
	}

	/**
	 * Set value of Color
	 * @param color
	 */
	public final void setColor(java.lang.String color)
	{
		setColor(getContext(), color);
	}

	/**
	 * Set value of Color
	 * @param context
	 * @param color
	 */
	public final void setColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String color)
	{
		getMendixObject().setValue(context, MemberNames.Color.toString(), color);
	}

	/**
	 * @return value of NewEditSPRelationType_SPRelationType
	 */
	public final slm.proxies.SPRelationType getNewEditSPRelationType_SPRelationType() throws com.mendix.core.CoreException
	{
		return getNewEditSPRelationType_SPRelationType(getContext());
	}

	/**
	 * @param context
	 * @return value of NewEditSPRelationType_SPRelationType
	 */
	public final slm.proxies.SPRelationType getNewEditSPRelationType_SPRelationType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slm.proxies.SPRelationType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.NewEditSPRelationType_SPRelationType.toString());
		if (identifier != null)
			result = slm.proxies.SPRelationType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of NewEditSPRelationType_SPRelationType
	 * @param neweditsprelationtype_sprelationtype
	 */
	public final void setNewEditSPRelationType_SPRelationType(slm.proxies.SPRelationType neweditsprelationtype_sprelationtype)
	{
		setNewEditSPRelationType_SPRelationType(getContext(), neweditsprelationtype_sprelationtype);
	}

	/**
	 * Set value of NewEditSPRelationType_SPRelationType
	 * @param context
	 * @param neweditsprelationtype_sprelationtype
	 */
	public final void setNewEditSPRelationType_SPRelationType(com.mendix.systemwideinterfaces.core.IContext context, slm.proxies.SPRelationType neweditsprelationtype_sprelationtype)
	{
		if (neweditsprelationtype_sprelationtype == null)
			getMendixObject().setValue(context, MemberNames.NewEditSPRelationType_SPRelationType.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.NewEditSPRelationType_SPRelationType.toString(), neweditsprelationtype_sprelationtype.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return newEditSPRelationTypeMendixObject;
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
			final slm.proxies.NewEditSPRelationType that = (slm.proxies.NewEditSPRelationType) obj;
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
		return "SLM.NewEditSPRelationType";
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
