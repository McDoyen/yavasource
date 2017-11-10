// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cmdb.proxies;

public class CITransitionAudit
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject cITransitionAuditMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CMDB.CITransitionAudit";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DateTime("DateTime"),
		CITransitionAudit_ConfigurationItem("CMDB.CITransitionAudit_ConfigurationItem"),
		CITransitionAudit_FromState("CMDB.CITransitionAudit_FromState"),
		CITransitionAudit_ToState("CMDB.CITransitionAudit_ToState"),
		CITransitionAudit_Transition("CMDB.CITransitionAudit_Transition"),
		CITransitionAudit_Person("CMDB.CITransitionAudit_Person");

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

	public CITransitionAudit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CMDB.CITransitionAudit"));
	}

	protected CITransitionAudit(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cITransitionAuditMendixObject)
	{
		if (cITransitionAuditMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CMDB.CITransitionAudit", cITransitionAuditMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CMDB.CITransitionAudit");

		this.cITransitionAuditMendixObject = cITransitionAuditMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CITransitionAudit.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static cmdb.proxies.CITransitionAudit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return cmdb.proxies.CITransitionAudit.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static cmdb.proxies.CITransitionAudit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new cmdb.proxies.CITransitionAudit(context, mendixObject);
	}

	public static cmdb.proxies.CITransitionAudit load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return cmdb.proxies.CITransitionAudit.initialize(context, mendixObject);
	}

	public static java.util.List<cmdb.proxies.CITransitionAudit> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<cmdb.proxies.CITransitionAudit> result = new java.util.ArrayList<cmdb.proxies.CITransitionAudit>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CMDB.CITransitionAudit" + xpathConstraint))
			result.add(cmdb.proxies.CITransitionAudit.initialize(context, obj));
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
	 * @return value of DateTime
	 */
	public final java.util.Date getDateTime()
	{
		return getDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTime
	 */
	public final java.util.Date getDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateTime.toString());
	}

	/**
	 * Set value of DateTime
	 * @param datetime
	 */
	public final void setDateTime(java.util.Date datetime)
	{
		setDateTime(getContext(), datetime);
	}

	/**
	 * Set value of DateTime
	 * @param context
	 * @param datetime
	 */
	public final void setDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date datetime)
	{
		getMendixObject().setValue(context, MemberNames.DateTime.toString(), datetime);
	}

	/**
	 * @return value of CITransitionAudit_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getCITransitionAudit_ConfigurationItem() throws com.mendix.core.CoreException
	{
		return getCITransitionAudit_ConfigurationItem(getContext());
	}

	/**
	 * @param context
	 * @return value of CITransitionAudit_ConfigurationItem
	 */
	public final cmdb.proxies.ConfigurationItem getCITransitionAudit_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		cmdb.proxies.ConfigurationItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CITransitionAudit_ConfigurationItem.toString());
		if (identifier != null)
			result = cmdb.proxies.ConfigurationItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CITransitionAudit_ConfigurationItem
	 * @param citransitionaudit_configurationitem
	 */
	public final void setCITransitionAudit_ConfigurationItem(cmdb.proxies.ConfigurationItem citransitionaudit_configurationitem)
	{
		setCITransitionAudit_ConfigurationItem(getContext(), citransitionaudit_configurationitem);
	}

	/**
	 * Set value of CITransitionAudit_ConfigurationItem
	 * @param context
	 * @param citransitionaudit_configurationitem
	 */
	public final void setCITransitionAudit_ConfigurationItem(com.mendix.systemwideinterfaces.core.IContext context, cmdb.proxies.ConfigurationItem citransitionaudit_configurationitem)
	{
		if (citransitionaudit_configurationitem == null)
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_ConfigurationItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_ConfigurationItem.toString(), citransitionaudit_configurationitem.getMendixObject().getId());
	}

	/**
	 * @return value of CITransitionAudit_FromState
	 */
	public final statetransition.proxies.State getCITransitionAudit_FromState() throws com.mendix.core.CoreException
	{
		return getCITransitionAudit_FromState(getContext());
	}

	/**
	 * @param context
	 * @return value of CITransitionAudit_FromState
	 */
	public final statetransition.proxies.State getCITransitionAudit_FromState(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		statetransition.proxies.State result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CITransitionAudit_FromState.toString());
		if (identifier != null)
			result = statetransition.proxies.State.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CITransitionAudit_FromState
	 * @param citransitionaudit_fromstate
	 */
	public final void setCITransitionAudit_FromState(statetransition.proxies.State citransitionaudit_fromstate)
	{
		setCITransitionAudit_FromState(getContext(), citransitionaudit_fromstate);
	}

	/**
	 * Set value of CITransitionAudit_FromState
	 * @param context
	 * @param citransitionaudit_fromstate
	 */
	public final void setCITransitionAudit_FromState(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.State citransitionaudit_fromstate)
	{
		if (citransitionaudit_fromstate == null)
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_FromState.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_FromState.toString(), citransitionaudit_fromstate.getMendixObject().getId());
	}

	/**
	 * @return value of CITransitionAudit_ToState
	 */
	public final statetransition.proxies.State getCITransitionAudit_ToState() throws com.mendix.core.CoreException
	{
		return getCITransitionAudit_ToState(getContext());
	}

	/**
	 * @param context
	 * @return value of CITransitionAudit_ToState
	 */
	public final statetransition.proxies.State getCITransitionAudit_ToState(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		statetransition.proxies.State result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CITransitionAudit_ToState.toString());
		if (identifier != null)
			result = statetransition.proxies.State.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CITransitionAudit_ToState
	 * @param citransitionaudit_tostate
	 */
	public final void setCITransitionAudit_ToState(statetransition.proxies.State citransitionaudit_tostate)
	{
		setCITransitionAudit_ToState(getContext(), citransitionaudit_tostate);
	}

	/**
	 * Set value of CITransitionAudit_ToState
	 * @param context
	 * @param citransitionaudit_tostate
	 */
	public final void setCITransitionAudit_ToState(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.State citransitionaudit_tostate)
	{
		if (citransitionaudit_tostate == null)
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_ToState.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_ToState.toString(), citransitionaudit_tostate.getMendixObject().getId());
	}

	/**
	 * @return value of CITransitionAudit_Transition
	 */
	public final statetransition.proxies.Transition getCITransitionAudit_Transition() throws com.mendix.core.CoreException
	{
		return getCITransitionAudit_Transition(getContext());
	}

	/**
	 * @param context
	 * @return value of CITransitionAudit_Transition
	 */
	public final statetransition.proxies.Transition getCITransitionAudit_Transition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		statetransition.proxies.Transition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CITransitionAudit_Transition.toString());
		if (identifier != null)
			result = statetransition.proxies.Transition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CITransitionAudit_Transition
	 * @param citransitionaudit_transition
	 */
	public final void setCITransitionAudit_Transition(statetransition.proxies.Transition citransitionaudit_transition)
	{
		setCITransitionAudit_Transition(getContext(), citransitionaudit_transition);
	}

	/**
	 * Set value of CITransitionAudit_Transition
	 * @param context
	 * @param citransitionaudit_transition
	 */
	public final void setCITransitionAudit_Transition(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.Transition citransitionaudit_transition)
	{
		if (citransitionaudit_transition == null)
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_Transition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_Transition.toString(), citransitionaudit_transition.getMendixObject().getId());
	}

	/**
	 * @return value of CITransitionAudit_Person
	 */
	public final nap.proxies.Person getCITransitionAudit_Person() throws com.mendix.core.CoreException
	{
		return getCITransitionAudit_Person(getContext());
	}

	/**
	 * @param context
	 * @return value of CITransitionAudit_Person
	 */
	public final nap.proxies.Person getCITransitionAudit_Person(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CITransitionAudit_Person.toString());
		if (identifier != null)
			result = nap.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CITransitionAudit_Person
	 * @param citransitionaudit_person
	 */
	public final void setCITransitionAudit_Person(nap.proxies.Person citransitionaudit_person)
	{
		setCITransitionAudit_Person(getContext(), citransitionaudit_person);
	}

	/**
	 * Set value of CITransitionAudit_Person
	 * @param context
	 * @param citransitionaudit_person
	 */
	public final void setCITransitionAudit_Person(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Person citransitionaudit_person)
	{
		if (citransitionaudit_person == null)
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_Person.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CITransitionAudit_Person.toString(), citransitionaudit_person.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return cITransitionAuditMendixObject;
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
			final cmdb.proxies.CITransitionAudit that = (cmdb.proxies.CITransitionAudit) obj;
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
		return "CMDB.CITransitionAudit";
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