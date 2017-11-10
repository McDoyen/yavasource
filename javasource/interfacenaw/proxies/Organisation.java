// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacenaw.proxies;

public class Organisation
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject organisationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceNAW.Organisation";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Organisatie_ID("Organisatie_ID"),
		Organisatie_naam("Organisatie_naam"),
		Organisatie_afkorting("Organisatie_afkorting"),
		Status("Status"),
		Date("Date"),
		Log("Log");

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

	public Organisation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceNAW.Organisation"));
	}

	protected Organisation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject organisationMendixObject)
	{
		if (organisationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceNAW.Organisation", organisationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceNAW.Organisation");

		this.organisationMendixObject = organisationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Organisation.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacenaw.proxies.Organisation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacenaw.proxies.Organisation.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacenaw.proxies.Organisation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacenaw.proxies.Organisation(context, mendixObject);
	}

	public static interfacenaw.proxies.Organisation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacenaw.proxies.Organisation.initialize(context, mendixObject);
	}

	public static java.util.List<interfacenaw.proxies.Organisation> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacenaw.proxies.Organisation> result = new java.util.ArrayList<interfacenaw.proxies.Organisation>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceNAW.Organisation" + xpathConstraint))
			result.add(interfacenaw.proxies.Organisation.initialize(context, obj));
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
	 * @return value of Organisatie_ID
	 */
	public final java.lang.String getOrganisatie_ID()
	{
		return getOrganisatie_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of Organisatie_ID
	 */
	public final java.lang.String getOrganisatie_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Organisatie_ID.toString());
	}

	/**
	 * Set value of Organisatie_ID
	 * @param organisatie_id
	 */
	public final void setOrganisatie_ID(java.lang.String organisatie_id)
	{
		setOrganisatie_ID(getContext(), organisatie_id);
	}

	/**
	 * Set value of Organisatie_ID
	 * @param context
	 * @param organisatie_id
	 */
	public final void setOrganisatie_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organisatie_id)
	{
		getMendixObject().setValue(context, MemberNames.Organisatie_ID.toString(), organisatie_id);
	}

	/**
	 * @return value of Organisatie_naam
	 */
	public final java.lang.String getOrganisatie_naam()
	{
		return getOrganisatie_naam(getContext());
	}

	/**
	 * @param context
	 * @return value of Organisatie_naam
	 */
	public final java.lang.String getOrganisatie_naam(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Organisatie_naam.toString());
	}

	/**
	 * Set value of Organisatie_naam
	 * @param organisatie_naam
	 */
	public final void setOrganisatie_naam(java.lang.String organisatie_naam)
	{
		setOrganisatie_naam(getContext(), organisatie_naam);
	}

	/**
	 * Set value of Organisatie_naam
	 * @param context
	 * @param organisatie_naam
	 */
	public final void setOrganisatie_naam(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organisatie_naam)
	{
		getMendixObject().setValue(context, MemberNames.Organisatie_naam.toString(), organisatie_naam);
	}

	/**
	 * @return value of Organisatie_afkorting
	 */
	public final java.lang.String getOrganisatie_afkorting()
	{
		return getOrganisatie_afkorting(getContext());
	}

	/**
	 * @param context
	 * @return value of Organisatie_afkorting
	 */
	public final java.lang.String getOrganisatie_afkorting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Organisatie_afkorting.toString());
	}

	/**
	 * Set value of Organisatie_afkorting
	 * @param organisatie_afkorting
	 */
	public final void setOrganisatie_afkorting(java.lang.String organisatie_afkorting)
	{
		setOrganisatie_afkorting(getContext(), organisatie_afkorting);
	}

	/**
	 * Set value of Organisatie_afkorting
	 * @param context
	 * @param organisatie_afkorting
	 */
	public final void setOrganisatie_afkorting(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organisatie_afkorting)
	{
		getMendixObject().setValue(context, MemberNames.Organisatie_afkorting.toString(), organisatie_afkorting);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final interfaceartemis.proxies.Status getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final interfaceartemis.proxies.Status getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return interfaceartemis.proxies.Status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(interfaceartemis.proxies.Status status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, interfaceartemis.proxies.Status status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return value of Log
	 */
	public final java.lang.String getLog()
	{
		return getLog(getContext());
	}

	/**
	 * @param context
	 * @return value of Log
	 */
	public final java.lang.String getLog(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Log.toString());
	}

	/**
	 * Set value of Log
	 * @param log
	 */
	public final void setLog(java.lang.String log)
	{
		setLog(getContext(), log);
	}

	/**
	 * Set value of Log
	 * @param context
	 * @param log
	 */
	public final void setLog(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String log)
	{
		getMendixObject().setValue(context, MemberNames.Log.toString(), log);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return organisationMendixObject;
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
			final interfacenaw.proxies.Organisation that = (interfacenaw.proxies.Organisation) obj;
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
		return "InterfaceNAW.Organisation";
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
