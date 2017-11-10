// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies;

public class CallTreeHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject callTreeHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "APMAgent.CallTreeHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Duration("Duration"),
		IsMicroflowCall("IsMicroflowCall"),
		CacheBurst("CacheBurst"),
		CallTreeHelper_Parent("APMAgent.CallTreeHelper_Parent"),
		CallTreeHelper_MicroflowPerformance("APMAgent.CallTreeHelper_MicroflowPerformance"),
		CallTreeHelper_ActionPerformance("APMAgent.CallTreeHelper_ActionPerformance");

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

	public CallTreeHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "APMAgent.CallTreeHelper"));
	}

	protected CallTreeHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject callTreeHelperMendixObject)
	{
		if (callTreeHelperMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("APMAgent.CallTreeHelper", callTreeHelperMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a APMAgent.CallTreeHelper");

		this.callTreeHelperMendixObject = callTreeHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CallTreeHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static apmagent.proxies.CallTreeHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return apmagent.proxies.CallTreeHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static apmagent.proxies.CallTreeHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new apmagent.proxies.CallTreeHelper(context, mendixObject);
	}

	public static apmagent.proxies.CallTreeHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return apmagent.proxies.CallTreeHelper.initialize(context, mendixObject);
	}

	public static java.util.List<apmagent.proxies.CallTreeHelper> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<apmagent.proxies.CallTreeHelper> result = new java.util.ArrayList<apmagent.proxies.CallTreeHelper>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//APMAgent.CallTreeHelper" + xpathConstraint))
			result.add(apmagent.proxies.CallTreeHelper.initialize(context, obj));
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
	 * @return value of Duration
	 */
	public final java.lang.Long getDuration()
	{
		return getDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of Duration
	 */
	public final java.lang.Long getDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Duration.toString());
	}

	/**
	 * Set value of Duration
	 * @param duration
	 */
	public final void setDuration(java.lang.Long duration)
	{
		setDuration(getContext(), duration);
	}

	/**
	 * Set value of Duration
	 * @param context
	 * @param duration
	 */
	public final void setDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long duration)
	{
		getMendixObject().setValue(context, MemberNames.Duration.toString(), duration);
	}

	/**
	 * @return value of IsMicroflowCall
	 */
	public final java.lang.Boolean getIsMicroflowCall()
	{
		return getIsMicroflowCall(getContext());
	}

	/**
	 * @param context
	 * @return value of IsMicroflowCall
	 */
	public final java.lang.Boolean getIsMicroflowCall(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsMicroflowCall.toString());
	}

	/**
	 * Set value of IsMicroflowCall
	 * @param ismicroflowcall
	 */
	public final void setIsMicroflowCall(java.lang.Boolean ismicroflowcall)
	{
		setIsMicroflowCall(getContext(), ismicroflowcall);
	}

	/**
	 * Set value of IsMicroflowCall
	 * @param context
	 * @param ismicroflowcall
	 */
	public final void setIsMicroflowCall(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ismicroflowcall)
	{
		getMendixObject().setValue(context, MemberNames.IsMicroflowCall.toString(), ismicroflowcall);
	}

	/**
	 * @return value of CacheBurst
	 */
	public final java.util.Date getCacheBurst()
	{
		return getCacheBurst(getContext());
	}

	/**
	 * @param context
	 * @return value of CacheBurst
	 */
	public final java.util.Date getCacheBurst(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CacheBurst.toString());
	}

	/**
	 * Set value of CacheBurst
	 * @param cacheburst
	 */
	public final void setCacheBurst(java.util.Date cacheburst)
	{
		setCacheBurst(getContext(), cacheburst);
	}

	/**
	 * Set value of CacheBurst
	 * @param context
	 * @param cacheburst
	 */
	public final void setCacheBurst(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date cacheburst)
	{
		getMendixObject().setValue(context, MemberNames.CacheBurst.toString(), cacheburst);
	}

	/**
	 * @return value of CallTreeHelper_Parent
	 */
	public final apmagent.proxies.CallTreeHelper getCallTreeHelper_Parent() throws com.mendix.core.CoreException
	{
		return getCallTreeHelper_Parent(getContext());
	}

	/**
	 * @param context
	 * @return value of CallTreeHelper_Parent
	 */
	public final apmagent.proxies.CallTreeHelper getCallTreeHelper_Parent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		apmagent.proxies.CallTreeHelper result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CallTreeHelper_Parent.toString());
		if (identifier != null)
			result = apmagent.proxies.CallTreeHelper.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CallTreeHelper_Parent
	 * @param calltreehelper_parent
	 */
	public final void setCallTreeHelper_Parent(apmagent.proxies.CallTreeHelper calltreehelper_parent)
	{
		setCallTreeHelper_Parent(getContext(), calltreehelper_parent);
	}

	/**
	 * Set value of CallTreeHelper_Parent
	 * @param context
	 * @param calltreehelper_parent
	 */
	public final void setCallTreeHelper_Parent(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.CallTreeHelper calltreehelper_parent)
	{
		if (calltreehelper_parent == null)
			getMendixObject().setValue(context, MemberNames.CallTreeHelper_Parent.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CallTreeHelper_Parent.toString(), calltreehelper_parent.getMendixObject().getId());
	}

	/**
	 * @return value of CallTreeHelper_MicroflowPerformance
	 */
	public final apmagent.proxies.MicroflowPerformance getCallTreeHelper_MicroflowPerformance() throws com.mendix.core.CoreException
	{
		return getCallTreeHelper_MicroflowPerformance(getContext());
	}

	/**
	 * @param context
	 * @return value of CallTreeHelper_MicroflowPerformance
	 */
	public final apmagent.proxies.MicroflowPerformance getCallTreeHelper_MicroflowPerformance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		apmagent.proxies.MicroflowPerformance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CallTreeHelper_MicroflowPerformance.toString());
		if (identifier != null)
			result = apmagent.proxies.MicroflowPerformance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CallTreeHelper_MicroflowPerformance
	 * @param calltreehelper_microflowperformance
	 */
	public final void setCallTreeHelper_MicroflowPerformance(apmagent.proxies.MicroflowPerformance calltreehelper_microflowperformance)
	{
		setCallTreeHelper_MicroflowPerformance(getContext(), calltreehelper_microflowperformance);
	}

	/**
	 * Set value of CallTreeHelper_MicroflowPerformance
	 * @param context
	 * @param calltreehelper_microflowperformance
	 */
	public final void setCallTreeHelper_MicroflowPerformance(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.MicroflowPerformance calltreehelper_microflowperformance)
	{
		if (calltreehelper_microflowperformance == null)
			getMendixObject().setValue(context, MemberNames.CallTreeHelper_MicroflowPerformance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CallTreeHelper_MicroflowPerformance.toString(), calltreehelper_microflowperformance.getMendixObject().getId());
	}

	/**
	 * @return value of CallTreeHelper_ActionPerformance
	 */
	public final apmagent.proxies.ActionPerformance getCallTreeHelper_ActionPerformance() throws com.mendix.core.CoreException
	{
		return getCallTreeHelper_ActionPerformance(getContext());
	}

	/**
	 * @param context
	 * @return value of CallTreeHelper_ActionPerformance
	 */
	public final apmagent.proxies.ActionPerformance getCallTreeHelper_ActionPerformance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		apmagent.proxies.ActionPerformance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CallTreeHelper_ActionPerformance.toString());
		if (identifier != null)
			result = apmagent.proxies.ActionPerformance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CallTreeHelper_ActionPerformance
	 * @param calltreehelper_actionperformance
	 */
	public final void setCallTreeHelper_ActionPerformance(apmagent.proxies.ActionPerformance calltreehelper_actionperformance)
	{
		setCallTreeHelper_ActionPerformance(getContext(), calltreehelper_actionperformance);
	}

	/**
	 * Set value of CallTreeHelper_ActionPerformance
	 * @param context
	 * @param calltreehelper_actionperformance
	 */
	public final void setCallTreeHelper_ActionPerformance(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.ActionPerformance calltreehelper_actionperformance)
	{
		if (calltreehelper_actionperformance == null)
			getMendixObject().setValue(context, MemberNames.CallTreeHelper_ActionPerformance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CallTreeHelper_ActionPerformance.toString(), calltreehelper_actionperformance.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return callTreeHelperMendixObject;
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
			final apmagent.proxies.CallTreeHelper that = (apmagent.proxies.CallTreeHelper) obj;
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
		return "APMAgent.CallTreeHelper";
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
