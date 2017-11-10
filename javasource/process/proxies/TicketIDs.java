// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class TicketIDs
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject ticketIDsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.TicketIDs";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TicketID("TicketID"),
		AutoNum("AutoNum"),
		TicketIDShort("TicketIDShort"),
		TicketIDs_Request("Process.TicketIDs_Request");

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

	public TicketIDs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.TicketIDs"));
	}

	protected TicketIDs(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject ticketIDsMendixObject)
	{
		if (ticketIDsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Process.TicketIDs", ticketIDsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.TicketIDs");

		this.ticketIDsMendixObject = ticketIDsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TicketIDs.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.TicketIDs initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.TicketIDs.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.TicketIDs initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.TicketIDs(context, mendixObject);
	}

	public static process.proxies.TicketIDs load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.TicketIDs.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.TicketIDs> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.TicketIDs> result = new java.util.ArrayList<process.proxies.TicketIDs>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.TicketIDs" + xpathConstraint))
			result.add(process.proxies.TicketIDs.initialize(context, obj));
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
	 * @return value of TicketID
	 */
	public final java.lang.String getTicketID()
	{
		return getTicketID(getContext());
	}

	/**
	 * @param context
	 * @return value of TicketID
	 */
	public final java.lang.String getTicketID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TicketID.toString());
	}

	/**
	 * Set value of TicketID
	 * @param ticketid
	 */
	public final void setTicketID(java.lang.String ticketid)
	{
		setTicketID(getContext(), ticketid);
	}

	/**
	 * Set value of TicketID
	 * @param context
	 * @param ticketid
	 */
	public final void setTicketID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ticketid)
	{
		getMendixObject().setValue(context, MemberNames.TicketID.toString(), ticketid);
	}

	/**
	 * @return value of AutoNum
	 */
	public final java.lang.Long getAutoNum()
	{
		return getAutoNum(getContext());
	}

	/**
	 * @param context
	 * @return value of AutoNum
	 */
	public final java.lang.Long getAutoNum(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.AutoNum.toString());
	}

	/**
	 * Set value of AutoNum
	 * @param autonum
	 */
	public final void setAutoNum(java.lang.Long autonum)
	{
		setAutoNum(getContext(), autonum);
	}

	/**
	 * Set value of AutoNum
	 * @param context
	 * @param autonum
	 */
	public final void setAutoNum(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long autonum)
	{
		getMendixObject().setValue(context, MemberNames.AutoNum.toString(), autonum);
	}

	/**
	 * @return value of TicketIDShort
	 */
	public final java.lang.String getTicketIDShort()
	{
		return getTicketIDShort(getContext());
	}

	/**
	 * @param context
	 * @return value of TicketIDShort
	 */
	public final java.lang.String getTicketIDShort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TicketIDShort.toString());
	}

	/**
	 * Set value of TicketIDShort
	 * @param ticketidshort
	 */
	public final void setTicketIDShort(java.lang.String ticketidshort)
	{
		setTicketIDShort(getContext(), ticketidshort);
	}

	/**
	 * Set value of TicketIDShort
	 * @param context
	 * @param ticketidshort
	 */
	public final void setTicketIDShort(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ticketidshort)
	{
		getMendixObject().setValue(context, MemberNames.TicketIDShort.toString(), ticketidshort);
	}

	/**
	 * @return value of TicketIDs_Request
	 */
	public final process.proxies.Request getTicketIDs_Request() throws com.mendix.core.CoreException
	{
		return getTicketIDs_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of TicketIDs_Request
	 */
	public final process.proxies.Request getTicketIDs_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TicketIDs_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TicketIDs_Request
	 * @param ticketids_request
	 */
	public final void setTicketIDs_Request(process.proxies.Request ticketids_request)
	{
		setTicketIDs_Request(getContext(), ticketids_request);
	}

	/**
	 * Set value of TicketIDs_Request
	 * @param context
	 * @param ticketids_request
	 */
	public final void setTicketIDs_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request ticketids_request)
	{
		if (ticketids_request == null)
			getMendixObject().setValue(context, MemberNames.TicketIDs_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TicketIDs_Request.toString(), ticketids_request.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return ticketIDsMendixObject;
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
			final process.proxies.TicketIDs that = (process.proxies.TicketIDs) obj;
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
		return "Process.TicketIDs";
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
