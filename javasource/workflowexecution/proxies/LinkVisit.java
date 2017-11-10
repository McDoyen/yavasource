// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowexecution.proxies;

public class LinkVisit
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject linkVisitMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowExecution.LinkVisit";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		LinkVisit_FromNodeVisit("WorkflowExecution.LinkVisit_FromNodeVisit"),
		LinkVisit_ToNodeVisit("WorkflowExecution.LinkVisit_ToNodeVisit"),
		LinkVisit_Link("WorkflowExecution.LinkVisit_Link");

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

	public LinkVisit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowExecution.LinkVisit"));
	}

	protected LinkVisit(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject linkVisitMendixObject)
	{
		if (linkVisitMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("WorkflowExecution.LinkVisit", linkVisitMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowExecution.LinkVisit");

		this.linkVisitMendixObject = linkVisitMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LinkVisit.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowexecution.proxies.LinkVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowexecution.proxies.LinkVisit.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowexecution.proxies.LinkVisit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowexecution.proxies.LinkVisit(context, mendixObject);
	}

	public static workflowexecution.proxies.LinkVisit load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowexecution.proxies.LinkVisit.initialize(context, mendixObject);
	}

	public static java.util.List<workflowexecution.proxies.LinkVisit> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowexecution.proxies.LinkVisit> result = new java.util.ArrayList<workflowexecution.proxies.LinkVisit>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowExecution.LinkVisit" + xpathConstraint))
			result.add(workflowexecution.proxies.LinkVisit.initialize(context, obj));
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
	 * @return value of LinkVisit_FromNodeVisit
	 */
	public final workflowexecution.proxies.NodeVisit getLinkVisit_FromNodeVisit() throws com.mendix.core.CoreException
	{
		return getLinkVisit_FromNodeVisit(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkVisit_FromNodeVisit
	 */
	public final workflowexecution.proxies.NodeVisit getLinkVisit_FromNodeVisit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowexecution.proxies.NodeVisit result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LinkVisit_FromNodeVisit.toString());
		if (identifier != null)
			result = workflowexecution.proxies.NodeVisit.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LinkVisit_FromNodeVisit
	 * @param linkvisit_fromnodevisit
	 */
	public final void setLinkVisit_FromNodeVisit(workflowexecution.proxies.NodeVisit linkvisit_fromnodevisit)
	{
		setLinkVisit_FromNodeVisit(getContext(), linkvisit_fromnodevisit);
	}

	/**
	 * Set value of LinkVisit_FromNodeVisit
	 * @param context
	 * @param linkvisit_fromnodevisit
	 */
	public final void setLinkVisit_FromNodeVisit(com.mendix.systemwideinterfaces.core.IContext context, workflowexecution.proxies.NodeVisit linkvisit_fromnodevisit)
	{
		if (linkvisit_fromnodevisit == null)
			getMendixObject().setValue(context, MemberNames.LinkVisit_FromNodeVisit.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LinkVisit_FromNodeVisit.toString(), linkvisit_fromnodevisit.getMendixObject().getId());
	}

	/**
	 * @return value of LinkVisit_ToNodeVisit
	 */
	public final workflowexecution.proxies.NodeVisit getLinkVisit_ToNodeVisit() throws com.mendix.core.CoreException
	{
		return getLinkVisit_ToNodeVisit(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkVisit_ToNodeVisit
	 */
	public final workflowexecution.proxies.NodeVisit getLinkVisit_ToNodeVisit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowexecution.proxies.NodeVisit result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LinkVisit_ToNodeVisit.toString());
		if (identifier != null)
			result = workflowexecution.proxies.NodeVisit.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LinkVisit_ToNodeVisit
	 * @param linkvisit_tonodevisit
	 */
	public final void setLinkVisit_ToNodeVisit(workflowexecution.proxies.NodeVisit linkvisit_tonodevisit)
	{
		setLinkVisit_ToNodeVisit(getContext(), linkvisit_tonodevisit);
	}

	/**
	 * Set value of LinkVisit_ToNodeVisit
	 * @param context
	 * @param linkvisit_tonodevisit
	 */
	public final void setLinkVisit_ToNodeVisit(com.mendix.systemwideinterfaces.core.IContext context, workflowexecution.proxies.NodeVisit linkvisit_tonodevisit)
	{
		if (linkvisit_tonodevisit == null)
			getMendixObject().setValue(context, MemberNames.LinkVisit_ToNodeVisit.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LinkVisit_ToNodeVisit.toString(), linkvisit_tonodevisit.getMendixObject().getId());
	}

	/**
	 * @return value of LinkVisit_Link
	 */
	public final workflowinstance.proxies.Link getLinkVisit_Link() throws com.mendix.core.CoreException
	{
		return getLinkVisit_Link(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkVisit_Link
	 */
	public final workflowinstance.proxies.Link getLinkVisit_Link(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowinstance.proxies.Link result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LinkVisit_Link.toString());
		if (identifier != null)
			result = workflowinstance.proxies.Link.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LinkVisit_Link
	 * @param linkvisit_link
	 */
	public final void setLinkVisit_Link(workflowinstance.proxies.Link linkvisit_link)
	{
		setLinkVisit_Link(getContext(), linkvisit_link);
	}

	/**
	 * Set value of LinkVisit_Link
	 * @param context
	 * @param linkvisit_link
	 */
	public final void setLinkVisit_Link(com.mendix.systemwideinterfaces.core.IContext context, workflowinstance.proxies.Link linkvisit_link)
	{
		if (linkvisit_link == null)
			getMendixObject().setValue(context, MemberNames.LinkVisit_Link.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LinkVisit_Link.toString(), linkvisit_link.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return linkVisitMendixObject;
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
			final workflowexecution.proxies.LinkVisit that = (workflowexecution.proxies.LinkVisit) obj;
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
		return "WorkflowExecution.LinkVisit";
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