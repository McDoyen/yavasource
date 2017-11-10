// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestanalysis.proxies;

public class RequestAnalysis extends requestanalysis.proxies.Analysis
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RequestAnalysis.RequestAnalysis";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name");

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

	public RequestAnalysis(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RequestAnalysis.RequestAnalysis"));
	}

	protected RequestAnalysis(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestAnalysisMendixObject)
	{
		super(context, requestAnalysisMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("RequestAnalysis.RequestAnalysis", requestAnalysisMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RequestAnalysis.RequestAnalysis");
	}

	/**
	 * @deprecated Use 'RequestAnalysis.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static requestanalysis.proxies.RequestAnalysis initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return requestanalysis.proxies.RequestAnalysis.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static requestanalysis.proxies.RequestAnalysis initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new requestanalysis.proxies.RequestAnalysis(context, mendixObject);
	}

	public static requestanalysis.proxies.RequestAnalysis load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return requestanalysis.proxies.RequestAnalysis.initialize(context, mendixObject);
	}

	public static java.util.List<requestanalysis.proxies.RequestAnalysis> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<requestanalysis.proxies.RequestAnalysis> result = new java.util.ArrayList<requestanalysis.proxies.RequestAnalysis>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RequestAnalysis.RequestAnalysis" + xpathConstraint))
			result.add(requestanalysis.proxies.RequestAnalysis.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final requestanalysis.proxies.RequestAnalysis that = (requestanalysis.proxies.RequestAnalysis) obj;
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
		return "RequestAnalysis.RequestAnalysis";
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
