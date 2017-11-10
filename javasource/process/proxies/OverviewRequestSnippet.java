// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public class OverviewRequestSnippet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject overviewRequestSnippetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Process.OverviewRequestSnippet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ContentTemplate("ContentTemplate"),
		Content("Content"),
		OverviewRequest_OverviewRequestSnippet("Process.OverviewRequest_OverviewRequestSnippet"),
		OverviewRequestWrapper_OverviewRequestSnippet("Process.OverviewRequestWrapper_OverviewRequestSnippet");

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

	public OverviewRequestSnippet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Process.OverviewRequestSnippet"));
	}

	protected OverviewRequestSnippet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject overviewRequestSnippetMendixObject)
	{
		if (overviewRequestSnippetMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Process.OverviewRequestSnippet", overviewRequestSnippetMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Process.OverviewRequestSnippet");

		this.overviewRequestSnippetMendixObject = overviewRequestSnippetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'OverviewRequestSnippet.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static process.proxies.OverviewRequestSnippet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return process.proxies.OverviewRequestSnippet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static process.proxies.OverviewRequestSnippet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new process.proxies.OverviewRequestSnippet(context, mendixObject);
	}

	public static process.proxies.OverviewRequestSnippet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return process.proxies.OverviewRequestSnippet.initialize(context, mendixObject);
	}

	public static java.util.List<process.proxies.OverviewRequestSnippet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<process.proxies.OverviewRequestSnippet> result = new java.util.ArrayList<process.proxies.OverviewRequestSnippet>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Process.OverviewRequestSnippet" + xpathConstraint))
			result.add(process.proxies.OverviewRequestSnippet.initialize(context, obj));
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
	 * @return value of ContentTemplate
	 */
	public final java.lang.String getContentTemplate()
	{
		return getContentTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of ContentTemplate
	 */
	public final java.lang.String getContentTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ContentTemplate.toString());
	}

	/**
	 * Set value of ContentTemplate
	 * @param contenttemplate
	 */
	public final void setContentTemplate(java.lang.String contenttemplate)
	{
		setContentTemplate(getContext(), contenttemplate);
	}

	/**
	 * Set value of ContentTemplate
	 * @param context
	 * @param contenttemplate
	 */
	public final void setContentTemplate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String contenttemplate)
	{
		getMendixObject().setValue(context, MemberNames.ContentTemplate.toString(), contenttemplate);
	}

	/**
	 * @return value of Content
	 */
	public final java.lang.String getContent()
	{
		return getContent(getContext());
	}

	/**
	 * @param context
	 * @return value of Content
	 */
	public final java.lang.String getContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Content.toString());
	}

	/**
	 * Set value of Content
	 * @param content
	 */
	public final void setContent(java.lang.String content)
	{
		setContent(getContext(), content);
	}

	/**
	 * Set value of Content
	 * @param context
	 * @param content
	 */
	public final void setContent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String content)
	{
		getMendixObject().setValue(context, MemberNames.Content.toString(), content);
	}

	/**
	 * @return value of OverviewRequest_OverviewRequestSnippet
	 */
	public final process.proxies.OverviewRequest getOverviewRequest_OverviewRequestSnippet() throws com.mendix.core.CoreException
	{
		return getOverviewRequest_OverviewRequestSnippet(getContext());
	}

	/**
	 * @param context
	 * @return value of OverviewRequest_OverviewRequestSnippet
	 */
	public final process.proxies.OverviewRequest getOverviewRequest_OverviewRequestSnippet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.OverviewRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OverviewRequest_OverviewRequestSnippet.toString());
		if (identifier != null)
			result = process.proxies.OverviewRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OverviewRequest_OverviewRequestSnippet
	 * @param overviewrequest_overviewrequestsnippet
	 */
	public final void setOverviewRequest_OverviewRequestSnippet(process.proxies.OverviewRequest overviewrequest_overviewrequestsnippet)
	{
		setOverviewRequest_OverviewRequestSnippet(getContext(), overviewrequest_overviewrequestsnippet);
	}

	/**
	 * Set value of OverviewRequest_OverviewRequestSnippet
	 * @param context
	 * @param overviewrequest_overviewrequestsnippet
	 */
	public final void setOverviewRequest_OverviewRequestSnippet(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.OverviewRequest overviewrequest_overviewrequestsnippet)
	{
		if (overviewrequest_overviewrequestsnippet == null)
			getMendixObject().setValue(context, MemberNames.OverviewRequest_OverviewRequestSnippet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OverviewRequest_OverviewRequestSnippet.toString(), overviewrequest_overviewrequestsnippet.getMendixObject().getId());
	}

	/**
	 * @return value of OverviewRequestWrapper_OverviewRequestSnippet
	 */
	public final process.proxies.OverviewRequestWrapper getOverviewRequestWrapper_OverviewRequestSnippet() throws com.mendix.core.CoreException
	{
		return getOverviewRequestWrapper_OverviewRequestSnippet(getContext());
	}

	/**
	 * @param context
	 * @return value of OverviewRequestWrapper_OverviewRequestSnippet
	 */
	public final process.proxies.OverviewRequestWrapper getOverviewRequestWrapper_OverviewRequestSnippet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.OverviewRequestWrapper result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OverviewRequestWrapper_OverviewRequestSnippet.toString());
		if (identifier != null)
			result = process.proxies.OverviewRequestWrapper.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OverviewRequestWrapper_OverviewRequestSnippet
	 * @param overviewrequestwrapper_overviewrequestsnippet
	 */
	public final void setOverviewRequestWrapper_OverviewRequestSnippet(process.proxies.OverviewRequestWrapper overviewrequestwrapper_overviewrequestsnippet)
	{
		setOverviewRequestWrapper_OverviewRequestSnippet(getContext(), overviewrequestwrapper_overviewrequestsnippet);
	}

	/**
	 * Set value of OverviewRequestWrapper_OverviewRequestSnippet
	 * @param context
	 * @param overviewrequestwrapper_overviewrequestsnippet
	 */
	public final void setOverviewRequestWrapper_OverviewRequestSnippet(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.OverviewRequestWrapper overviewrequestwrapper_overviewrequestsnippet)
	{
		if (overviewrequestwrapper_overviewrequestsnippet == null)
			getMendixObject().setValue(context, MemberNames.OverviewRequestWrapper_OverviewRequestSnippet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OverviewRequestWrapper_OverviewRequestSnippet.toString(), overviewrequestwrapper_overviewrequestsnippet.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return overviewRequestSnippetMendixObject;
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
			final process.proxies.OverviewRequestSnippet that = (process.proxies.OverviewRequestSnippet) obj;
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
		return "Process.OverviewRequestSnippet";
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