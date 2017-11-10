// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package billing.proxies;

public class HourlyRate
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject hourlyRateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Billing.HourlyRate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HourlyRate("HourlyRate");

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

	public HourlyRate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Billing.HourlyRate"));
	}

	protected HourlyRate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject hourlyRateMendixObject)
	{
		if (hourlyRateMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Billing.HourlyRate", hourlyRateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Billing.HourlyRate");

		this.hourlyRateMendixObject = hourlyRateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'HourlyRate.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static billing.proxies.HourlyRate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return billing.proxies.HourlyRate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static billing.proxies.HourlyRate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new billing.proxies.HourlyRate(context, mendixObject);
	}

	public static billing.proxies.HourlyRate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return billing.proxies.HourlyRate.initialize(context, mendixObject);
	}

	public static java.util.List<billing.proxies.HourlyRate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<billing.proxies.HourlyRate> result = new java.util.ArrayList<billing.proxies.HourlyRate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Billing.HourlyRate" + xpathConstraint))
			result.add(billing.proxies.HourlyRate.initialize(context, obj));
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
	 * @return value of HourlyRate
	 */
	public final java.math.BigDecimal getHourlyRate()
	{
		return getHourlyRate(getContext());
	}

	/**
	 * @param context
	 * @return value of HourlyRate
	 */
	public final java.math.BigDecimal getHourlyRate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.HourlyRate.toString());
	}

	/**
	 * Set value of HourlyRate
	 * @param hourlyrate
	 */
	public final void setHourlyRate(java.math.BigDecimal hourlyrate)
	{
		setHourlyRate(getContext(), hourlyrate);
	}

	/**
	 * Set value of HourlyRate
	 * @param context
	 * @param hourlyrate
	 */
	public final void setHourlyRate(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal hourlyrate)
	{
		getMendixObject().setValue(context, MemberNames.HourlyRate.toString(), hourlyrate);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return hourlyRateMendixObject;
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
			final billing.proxies.HourlyRate that = (billing.proxies.HourlyRate) obj;
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
		return "Billing.HourlyRate";
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