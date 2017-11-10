// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class ChangeSnapShot extends process.proxies.RequestSnapShot
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.ChangeSnapShot";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Reason("Reason"),
		ReasonChanged("ReasonChanged"),
		ChangeType("ChangeType"),
		ChangeTypeChanged("ChangeTypeChanged"),
		ShortDescription("ShortDescription"),
		ShortDescriptionChanged("ShortDescriptionChanged"),
		DetailDescription("DetailDescription"),
		DetailDescriptionChanged("DetailDescriptionChanged"),
		DetailDescriptionNoHTML("DetailDescriptionNoHTML"),
		DetailDescriptionNoHTMLChanged("DetailDescriptionNoHTMLChanged"),
		SolutionDescription("SolutionDescription"),
		SolutionDescriptionChanged("SolutionDescriptionChanged"),
		ActualEndTime("ActualEndTime"),
		ActualEndTimeChanged("ActualEndTimeChanged"),
		CustomerSatisfaction("CustomerSatisfaction"),
		CustomerSatisfactionChanged("CustomerSatisfactionChanged"),
		ScheduledStart("ScheduledStart"),
		ScheduledStartChanged("ScheduledStartChanged"),
		ScheduledEnd("ScheduledEnd"),
		ScheduledEndChanged("ScheduledEndChanged"),
		WishDateStart("WishDateStart"),
		WishDateStartChanged("WishDateStartChanged"),
		WishDateEnd("WishDateEnd"),
		WishDateEndChanged("WishDateEndChanged"),
		OpeningCategoryChanged("OpeningCategoryChanged"),
		ClosureCategoryChanged("ClosureCategoryChanged"),
		RequestEvent_RequestSnapShot("Process.RequestEvent_RequestSnapShot"),
		RequestSnapShot_OpeningCategory("Process.RequestSnapShot_OpeningCategory"),
		RequestSnapShot_ClosureCategory("Process.RequestSnapShot_ClosureCategory");

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

	public ChangeSnapShot(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.ChangeSnapShot"));
	}

	protected ChangeSnapShot(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject changeSnapShotMendixObject)
	{
		super(context, changeSnapShotMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Process.ChangeSnapShot", changeSnapShotMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.ChangeSnapShot");
	}

	/**
	 * @deprecated Use 'ChangeSnapShot.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.ChangeSnapShot initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.ChangeSnapShot.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.ChangeSnapShot initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.ChangeSnapShot(context, mendixObject);
	}

	public static process.proxies.ChangeSnapShot load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.ChangeSnapShot.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.ChangeSnapShot> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.ChangeSnapShot> result = new java.util.ArrayList<process.proxies.ChangeSnapShot>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.ChangeSnapShot" + xpathConstraint))
			result.add(process.proxies.ChangeSnapShot.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Reason
	 */
	public final java.lang.String getReason()
	{
		return getReason(getContext());
	}

	/**
	 * @param context
	 * @return value of Reason
	 */
	public final java.lang.String getReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Reason.toString());
	}

	/**
	 * Set value of Reason
	 * @param reason
	 */
	public final void setReason(java.lang.String reason)
	{
		setReason(getContext(), reason);
	}

	/**
	 * Set value of Reason
	 * @param context
	 * @param reason
	 */
	public final void setReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reason)
	{
		getMendixObject().setValue(context, MemberNames.Reason.toString(), reason);
	}

	/**
	 * @return value of ReasonChanged
	 */
	public final java.lang.Boolean getReasonChanged()
	{
		return getReasonChanged(getContext());
	}

	/**
	 * @param context
	 * @return value of ReasonChanged
	 */
	public final java.lang.Boolean getReasonChanged(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ReasonChanged.toString());
	}

	/**
	 * Set value of ReasonChanged
	 * @param reasonchanged
	 */
	public final void setReasonChanged(java.lang.Boolean reasonchanged)
	{
		setReasonChanged(getContext(), reasonchanged);
	}

	/**
	 * Set value of ReasonChanged
	 * @param context
	 * @param reasonchanged
	 */
	public final void setReasonChanged(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean reasonchanged)
	{
		getMendixObject().setValue(context, MemberNames.ReasonChanged.toString(), reasonchanged);
	}

	/**
	 * Set value of ChangeType
	 * @param changetype
	 */
	public final process.proxies.ChangeType getChangeType()
	{
		return getChangeType(getContext());
	}

	/**
	 * @param context
	 * @return value of ChangeType
	 */
	public final process.proxies.ChangeType getChangeType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ChangeType.toString());
		if (obj == null)
			return null;

		return process.proxies.ChangeType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ChangeType
	 * @param changetype
	 */
	public final void setChangeType(process.proxies.ChangeType changetype)
	{
		setChangeType(getContext(), changetype);
	}

	/**
	 * Set value of ChangeType
	 * @param context
	 * @param changetype
	 */
	public final void setChangeType(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.ChangeType changetype)
	{
		if (changetype != null)
			getMendixObject().setValue(context, MemberNames.ChangeType.toString(), changetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ChangeType.toString(), null);
	}

	/**
	 * @return value of ChangeTypeChanged
	 */
	public final java.lang.Boolean getChangeTypeChanged()
	{
		return getChangeTypeChanged(getContext());
	}

	/**
	 * @param context
	 * @return value of ChangeTypeChanged
	 */
	public final java.lang.Boolean getChangeTypeChanged(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ChangeTypeChanged.toString());
	}

	/**
	 * Set value of ChangeTypeChanged
	 * @param changetypechanged
	 */
	public final void setChangeTypeChanged(java.lang.Boolean changetypechanged)
	{
		setChangeTypeChanged(getContext(), changetypechanged);
	}

	/**
	 * Set value of ChangeTypeChanged
	 * @param context
	 * @param changetypechanged
	 */
	public final void setChangeTypeChanged(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean changetypechanged)
	{
		getMendixObject().setValue(context, MemberNames.ChangeTypeChanged.toString(), changetypechanged);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final process.proxies.ChangeSnapShot that = (process.proxies.ChangeSnapShot) obj;
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
		return "Process.ChangeSnapShot";
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
