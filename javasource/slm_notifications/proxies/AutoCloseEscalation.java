// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slm_notifications.proxies;

public class AutoCloseEscalation extends slm_notifications.proxies.Escalation
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SLM_Notifications.AutoCloseEscalation";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SentHoursBeforeClose("SentHoursBeforeClose"),
		Subject("Subject"),
		Message("Message"),
		MessageType("MessageType"),
		SendToAssignee("SendToAssignee"),
		SendToPerson("SendToPerson"),
		SendToPersonCaller("SendToPersonCaller"),
		Escalation_MessageTemplate("SLM_Notifications.Escalation_MessageTemplate");

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

	public AutoCloseEscalation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SLM_Notifications.AutoCloseEscalation"));
	}

	protected AutoCloseEscalation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject autoCloseEscalationMendixObject)
	{
		super(context, autoCloseEscalationMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SLM_Notifications.AutoCloseEscalation", autoCloseEscalationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SLM_Notifications.AutoCloseEscalation");
	}

	/**
	 * @deprecated Use 'AutoCloseEscalation.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static slm_notifications.proxies.AutoCloseEscalation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return slm_notifications.proxies.AutoCloseEscalation.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static slm_notifications.proxies.AutoCloseEscalation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new slm_notifications.proxies.AutoCloseEscalation(context, mendixObject);
	}

	public static slm_notifications.proxies.AutoCloseEscalation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return slm_notifications.proxies.AutoCloseEscalation.initialize(context, mendixObject);
	}

	public static java.util.List<slm_notifications.proxies.AutoCloseEscalation> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<slm_notifications.proxies.AutoCloseEscalation> result = new java.util.ArrayList<slm_notifications.proxies.AutoCloseEscalation>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SLM_Notifications.AutoCloseEscalation" + xpathConstraint))
			result.add(slm_notifications.proxies.AutoCloseEscalation.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of SentHoursBeforeClose
	 */
	public final java.lang.Integer getSentHoursBeforeClose()
	{
		return getSentHoursBeforeClose(getContext());
	}

	/**
	 * @param context
	 * @return value of SentHoursBeforeClose
	 */
	public final java.lang.Integer getSentHoursBeforeClose(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.SentHoursBeforeClose.toString());
	}

	/**
	 * Set value of SentHoursBeforeClose
	 * @param senthoursbeforeclose
	 */
	public final void setSentHoursBeforeClose(java.lang.Integer senthoursbeforeclose)
	{
		setSentHoursBeforeClose(getContext(), senthoursbeforeclose);
	}

	/**
	 * Set value of SentHoursBeforeClose
	 * @param context
	 * @param senthoursbeforeclose
	 */
	public final void setSentHoursBeforeClose(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer senthoursbeforeclose)
	{
		getMendixObject().setValue(context, MemberNames.SentHoursBeforeClose.toString(), senthoursbeforeclose);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final slm_notifications.proxies.AutoCloseEscalation that = (slm_notifications.proxies.AutoCloseEscalation) obj;
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
		return "SLM_Notifications.AutoCloseEscalation";
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
