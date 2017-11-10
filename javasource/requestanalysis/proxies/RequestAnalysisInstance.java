// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestanalysis.proxies;

public class RequestAnalysisInstance extends requestanalysis.proxies.Analysis_Instance
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RequestAnalysis.RequestAnalysisInstance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		AnalysisFinished("AnalysisFinished"),
		AnalysisID("AnalysisID"),
		Analysis("Analysis"),
		Analysis_Instance_Analysis("RequestAnalysis.Analysis_Instance_Analysis"),
		Analysis_Instance_Request("RequestAnalysis.Analysis_Instance_Request");

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

	public RequestAnalysisInstance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RequestAnalysis.RequestAnalysisInstance"));
	}

	protected RequestAnalysisInstance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject requestAnalysisInstanceMendixObject)
	{
		super(context, requestAnalysisInstanceMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("RequestAnalysis.RequestAnalysisInstance", requestAnalysisInstanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RequestAnalysis.RequestAnalysisInstance");
	}

	/**
	 * @deprecated Use 'RequestAnalysisInstance.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static requestanalysis.proxies.RequestAnalysisInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return requestanalysis.proxies.RequestAnalysisInstance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static requestanalysis.proxies.RequestAnalysisInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new requestanalysis.proxies.RequestAnalysisInstance(context, mendixObject);
	}

	public static requestanalysis.proxies.RequestAnalysisInstance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return requestanalysis.proxies.RequestAnalysisInstance.initialize(context, mendixObject);
	}

	public static java.util.List<requestanalysis.proxies.RequestAnalysisInstance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<requestanalysis.proxies.RequestAnalysisInstance> result = new java.util.ArrayList<requestanalysis.proxies.RequestAnalysisInstance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RequestAnalysis.RequestAnalysisInstance" + xpathConstraint))
			result.add(requestanalysis.proxies.RequestAnalysisInstance.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final requestanalysis.proxies.RequestAnalysisInstance that = (requestanalysis.proxies.RequestAnalysisInstance) obj;
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
		return "RequestAnalysis.RequestAnalysisInstance";
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
