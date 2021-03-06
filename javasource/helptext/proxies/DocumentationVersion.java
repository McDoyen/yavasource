// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package helptext.proxies;

public class DocumentationVersion
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject documentationVersionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "HelpText.DocumentationVersion";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Version("Version");

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

	public DocumentationVersion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "HelpText.DocumentationVersion"));
	}

	protected DocumentationVersion(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject documentationVersionMendixObject)
	{
		if (documentationVersionMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("HelpText.DocumentationVersion", documentationVersionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a HelpText.DocumentationVersion");

		this.documentationVersionMendixObject = documentationVersionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DocumentationVersion.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static helptext.proxies.DocumentationVersion initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return helptext.proxies.DocumentationVersion.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static helptext.proxies.DocumentationVersion initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new helptext.proxies.DocumentationVersion(context, mendixObject);
	}

	public static helptext.proxies.DocumentationVersion load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return helptext.proxies.DocumentationVersion.initialize(context, mendixObject);
	}

	public static java.util.List<helptext.proxies.DocumentationVersion> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<helptext.proxies.DocumentationVersion> result = new java.util.ArrayList<helptext.proxies.DocumentationVersion>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//HelpText.DocumentationVersion" + xpathConstraint))
			result.add(helptext.proxies.DocumentationVersion.initialize(context, obj));
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
	 * @return value of Version
	 */
	public final java.lang.String getVersion()
	{
		return getVersion(getContext());
	}

	/**
	 * @param context
	 * @return value of Version
	 */
	public final java.lang.String getVersion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Version.toString());
	}

	/**
	 * Set value of Version
	 * @param version
	 */
	public final void setVersion(java.lang.String version)
	{
		setVersion(getContext(), version);
	}

	/**
	 * Set value of Version
	 * @param context
	 * @param version
	 */
	public final void setVersion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String version)
	{
		getMendixObject().setValue(context, MemberNames.Version.toString(), version);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return documentationVersionMendixObject;
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
			final helptext.proxies.DocumentationVersion that = (helptext.proxies.DocumentationVersion) obj;
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
		return "HelpText.DocumentationVersion";
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
