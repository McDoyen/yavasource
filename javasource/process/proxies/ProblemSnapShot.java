// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class ProblemSnapShot extends process.proxies.RequestSnapShot
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.ProblemSnapShot";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProblemType("ProblemType"),
		ProblemTypeChanged("ProblemTypeChanged"),
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

	public ProblemSnapShot(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.ProblemSnapShot"));
	}

	protected ProblemSnapShot(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject problemSnapShotMendixObject)
	{
		super(context, problemSnapShotMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Process.ProblemSnapShot", problemSnapShotMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.ProblemSnapShot");
	}

	/**
	 * @deprecated Use 'ProblemSnapShot.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.ProblemSnapShot initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.ProblemSnapShot.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.ProblemSnapShot initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.ProblemSnapShot(context, mendixObject);
	}

	public static process.proxies.ProblemSnapShot load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.ProblemSnapShot.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.ProblemSnapShot> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.ProblemSnapShot> result = new java.util.ArrayList<process.proxies.ProblemSnapShot>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.ProblemSnapShot" + xpathConstraint))
			result.add(process.proxies.ProblemSnapShot.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of ProblemType
	 * @param problemtype
	 */
	public final process.proxies.ProblemType getProblemType()
	{
		return getProblemType(getContext());
	}

	/**
	 * @param context
	 * @return value of ProblemType
	 */
	public final process.proxies.ProblemType getProblemType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProblemType.toString());
		if (obj == null)
			return null;

		return process.proxies.ProblemType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProblemType
	 * @param problemtype
	 */
	public final void setProblemType(process.proxies.ProblemType problemtype)
	{
		setProblemType(getContext(), problemtype);
	}

	/**
	 * Set value of ProblemType
	 * @param context
	 * @param problemtype
	 */
	public final void setProblemType(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.ProblemType problemtype)
	{
		if (problemtype != null)
			getMendixObject().setValue(context, MemberNames.ProblemType.toString(), problemtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProblemType.toString(), null);
	}

	/**
	 * @return value of ProblemTypeChanged
	 */
	public final java.lang.Boolean getProblemTypeChanged()
	{
		return getProblemTypeChanged(getContext());
	}

	/**
	 * @param context
	 * @return value of ProblemTypeChanged
	 */
	public final java.lang.Boolean getProblemTypeChanged(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ProblemTypeChanged.toString());
	}

	/**
	 * Set value of ProblemTypeChanged
	 * @param problemtypechanged
	 */
	public final void setProblemTypeChanged(java.lang.Boolean problemtypechanged)
	{
		setProblemTypeChanged(getContext(), problemtypechanged);
	}

	/**
	 * Set value of ProblemTypeChanged
	 * @param context
	 * @param problemtypechanged
	 */
	public final void setProblemTypeChanged(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean problemtypechanged)
	{
		getMendixObject().setValue(context, MemberNames.ProblemTypeChanged.toString(), problemtypechanged);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final process.proxies.ProblemSnapShot that = (process.proxies.ProblemSnapShot) obj;
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
		return "Process.ProblemSnapShot";
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