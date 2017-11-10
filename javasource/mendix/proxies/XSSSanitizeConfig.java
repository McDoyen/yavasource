// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendix.proxies;

public class XSSSanitizeConfig
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject xSSSanitizeConfigMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Mendix.XSSSanitizeConfig";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		formatOutput("formatOutput"),
		maxInputSize("maxInputSize"),
		preserveComments("preserveComments"),
		preserveSpace("preserveSpace");

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

	public XSSSanitizeConfig(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Mendix.XSSSanitizeConfig"));
	}

	protected XSSSanitizeConfig(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject xSSSanitizeConfigMendixObject)
	{
		if (xSSSanitizeConfigMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Mendix.XSSSanitizeConfig", xSSSanitizeConfigMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Mendix.XSSSanitizeConfig");

		this.xSSSanitizeConfigMendixObject = xSSSanitizeConfigMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'XSSSanitizeConfig.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mendix.proxies.XSSSanitizeConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendix.proxies.XSSSanitizeConfig.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mendix.proxies.XSSSanitizeConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendix.proxies.XSSSanitizeConfig(context, mendixObject);
	}

	public static mendix.proxies.XSSSanitizeConfig load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendix.proxies.XSSSanitizeConfig.initialize(context, mendixObject);
	}

	public static java.util.List<mendix.proxies.XSSSanitizeConfig> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mendix.proxies.XSSSanitizeConfig> result = new java.util.ArrayList<mendix.proxies.XSSSanitizeConfig>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Mendix.XSSSanitizeConfig" + xpathConstraint))
			result.add(mendix.proxies.XSSSanitizeConfig.initialize(context, obj));
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
	 * @return value of formatOutput
	 */
	public final java.lang.Boolean getformatOutput()
	{
		return getformatOutput(getContext());
	}

	/**
	 * @param context
	 * @return value of formatOutput
	 */
	public final java.lang.Boolean getformatOutput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.formatOutput.toString());
	}

	/**
	 * Set value of formatOutput
	 * @param formatoutput
	 */
	public final void setformatOutput(java.lang.Boolean formatoutput)
	{
		setformatOutput(getContext(), formatoutput);
	}

	/**
	 * Set value of formatOutput
	 * @param context
	 * @param formatoutput
	 */
	public final void setformatOutput(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean formatoutput)
	{
		getMendixObject().setValue(context, MemberNames.formatOutput.toString(), formatoutput);
	}

	/**
	 * @return value of maxInputSize
	 */
	public final java.lang.Integer getmaxInputSize()
	{
		return getmaxInputSize(getContext());
	}

	/**
	 * @param context
	 * @return value of maxInputSize
	 */
	public final java.lang.Integer getmaxInputSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.maxInputSize.toString());
	}

	/**
	 * Set value of maxInputSize
	 * @param maxinputsize
	 */
	public final void setmaxInputSize(java.lang.Integer maxinputsize)
	{
		setmaxInputSize(getContext(), maxinputsize);
	}

	/**
	 * Set value of maxInputSize
	 * @param context
	 * @param maxinputsize
	 */
	public final void setmaxInputSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maxinputsize)
	{
		getMendixObject().setValue(context, MemberNames.maxInputSize.toString(), maxinputsize);
	}

	/**
	 * @return value of preserveComments
	 */
	public final java.lang.Boolean getpreserveComments()
	{
		return getpreserveComments(getContext());
	}

	/**
	 * @param context
	 * @return value of preserveComments
	 */
	public final java.lang.Boolean getpreserveComments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.preserveComments.toString());
	}

	/**
	 * Set value of preserveComments
	 * @param preservecomments
	 */
	public final void setpreserveComments(java.lang.Boolean preservecomments)
	{
		setpreserveComments(getContext(), preservecomments);
	}

	/**
	 * Set value of preserveComments
	 * @param context
	 * @param preservecomments
	 */
	public final void setpreserveComments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean preservecomments)
	{
		getMendixObject().setValue(context, MemberNames.preserveComments.toString(), preservecomments);
	}

	/**
	 * @return value of preserveSpace
	 */
	public final java.lang.Boolean getpreserveSpace()
	{
		return getpreserveSpace(getContext());
	}

	/**
	 * @param context
	 * @return value of preserveSpace
	 */
	public final java.lang.Boolean getpreserveSpace(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.preserveSpace.toString());
	}

	/**
	 * Set value of preserveSpace
	 * @param preservespace
	 */
	public final void setpreserveSpace(java.lang.Boolean preservespace)
	{
		setpreserveSpace(getContext(), preservespace);
	}

	/**
	 * Set value of preserveSpace
	 * @param context
	 * @param preservespace
	 */
	public final void setpreserveSpace(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean preservespace)
	{
		getMendixObject().setValue(context, MemberNames.preserveSpace.toString(), preservespace);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return xSSSanitizeConfigMendixObject;
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
			final mendix.proxies.XSSSanitizeConfig that = (mendix.proxies.XSSSanitizeConfig) obj;
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
		return "Mendix.XSSSanitizeConfig";
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
