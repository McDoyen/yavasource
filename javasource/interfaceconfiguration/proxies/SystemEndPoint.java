// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceconfiguration.proxies;

public class SystemEndPoint extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceConfiguration.SystemEndPoint";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HostName("HostName"),
		EndPoint("EndPoint"),
		CurrentHostName("CurrentHostName"),
		UseHTTPAuthentication("UseHTTPAuthentication"),
		HTTPValue("HTTPValue"),
		HTTPValueCheck("HTTPValueCheck"),
		SystemEndPoint_WebServiceInterfaceMessageConfiguration("InterfaceConfiguration.SystemEndPoint_WebServiceInterfaceMessageConfiguration");

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

	public SystemEndPoint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceConfiguration.SystemEndPoint"));
	}

	protected SystemEndPoint(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject systemEndPointMendixObject)
	{
		super(context, systemEndPointMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceConfiguration.SystemEndPoint", systemEndPointMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceConfiguration.SystemEndPoint");
	}

	/**
	 * @deprecated Use 'SystemEndPoint.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceconfiguration.proxies.SystemEndPoint initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceconfiguration.proxies.SystemEndPoint.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceconfiguration.proxies.SystemEndPoint initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceconfiguration.proxies.SystemEndPoint(context, mendixObject);
	}

	public static interfaceconfiguration.proxies.SystemEndPoint load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceconfiguration.proxies.SystemEndPoint.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceconfiguration.proxies.SystemEndPoint> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceconfiguration.proxies.SystemEndPoint> result = new java.util.ArrayList<interfaceconfiguration.proxies.SystemEndPoint>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceConfiguration.SystemEndPoint" + xpathConstraint))
			result.add(interfaceconfiguration.proxies.SystemEndPoint.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of HostName
	 */
	public final java.lang.String getHostName()
	{
		return getHostName(getContext());
	}

	/**
	 * @param context
	 * @return value of HostName
	 */
	public final java.lang.String getHostName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HostName.toString());
	}

	/**
	 * Set value of HostName
	 * @param hostname
	 */
	public final void setHostName(java.lang.String hostname)
	{
		setHostName(getContext(), hostname);
	}

	/**
	 * Set value of HostName
	 * @param context
	 * @param hostname
	 */
	public final void setHostName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hostname)
	{
		getMendixObject().setValue(context, MemberNames.HostName.toString(), hostname);
	}

	/**
	 * @return value of EndPoint
	 */
	public final java.lang.String getEndPoint()
	{
		return getEndPoint(getContext());
	}

	/**
	 * @param context
	 * @return value of EndPoint
	 */
	public final java.lang.String getEndPoint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EndPoint.toString());
	}

	/**
	 * Set value of EndPoint
	 * @param endpoint
	 */
	public final void setEndPoint(java.lang.String endpoint)
	{
		setEndPoint(getContext(), endpoint);
	}

	/**
	 * Set value of EndPoint
	 * @param context
	 * @param endpoint
	 */
	public final void setEndPoint(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String endpoint)
	{
		getMendixObject().setValue(context, MemberNames.EndPoint.toString(), endpoint);
	}

	/**
	 * @return value of CurrentHostName
	 */
	public final java.lang.String getCurrentHostName()
	{
		return getCurrentHostName(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentHostName
	 */
	public final java.lang.String getCurrentHostName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CurrentHostName.toString());
	}

	/**
	 * Set value of CurrentHostName
	 * @param currenthostname
	 */
	public final void setCurrentHostName(java.lang.String currenthostname)
	{
		setCurrentHostName(getContext(), currenthostname);
	}

	/**
	 * Set value of CurrentHostName
	 * @param context
	 * @param currenthostname
	 */
	public final void setCurrentHostName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String currenthostname)
	{
		getMendixObject().setValue(context, MemberNames.CurrentHostName.toString(), currenthostname);
	}

	/**
	 * @return value of UseHTTPAuthentication
	 */
	public final java.lang.Boolean getUseHTTPAuthentication()
	{
		return getUseHTTPAuthentication(getContext());
	}

	/**
	 * @param context
	 * @return value of UseHTTPAuthentication
	 */
	public final java.lang.Boolean getUseHTTPAuthentication(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseHTTPAuthentication.toString());
	}

	/**
	 * Set value of UseHTTPAuthentication
	 * @param usehttpauthentication
	 */
	public final void setUseHTTPAuthentication(java.lang.Boolean usehttpauthentication)
	{
		setUseHTTPAuthentication(getContext(), usehttpauthentication);
	}

	/**
	 * Set value of UseHTTPAuthentication
	 * @param context
	 * @param usehttpauthentication
	 */
	public final void setUseHTTPAuthentication(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usehttpauthentication)
	{
		getMendixObject().setValue(context, MemberNames.UseHTTPAuthentication.toString(), usehttpauthentication);
	}

	/**
	 * @return value of HTTPValue
	 */
	public final java.lang.String getHTTPValue()
	{
		return getHTTPValue(getContext());
	}

	/**
	 * @param context
	 * @return value of HTTPValue
	 */
	public final java.lang.String getHTTPValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HTTPValue.toString());
	}

	/**
	 * Set value of HTTPValue
	 * @param httpvalue
	 */
	public final void setHTTPValue(java.lang.String httpvalue)
	{
		setHTTPValue(getContext(), httpvalue);
	}

	/**
	 * Set value of HTTPValue
	 * @param context
	 * @param httpvalue
	 */
	public final void setHTTPValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String httpvalue)
	{
		getMendixObject().setValue(context, MemberNames.HTTPValue.toString(), httpvalue);
	}

	/**
	 * @return value of HTTPValueCheck
	 */
	public final java.lang.String getHTTPValueCheck()
	{
		return getHTTPValueCheck(getContext());
	}

	/**
	 * @param context
	 * @return value of HTTPValueCheck
	 */
	public final java.lang.String getHTTPValueCheck(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HTTPValueCheck.toString());
	}

	/**
	 * Set value of HTTPValueCheck
	 * @param httpvaluecheck
	 */
	public final void setHTTPValueCheck(java.lang.String httpvaluecheck)
	{
		setHTTPValueCheck(getContext(), httpvaluecheck);
	}

	/**
	 * Set value of HTTPValueCheck
	 * @param context
	 * @param httpvaluecheck
	 */
	public final void setHTTPValueCheck(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String httpvaluecheck)
	{
		getMendixObject().setValue(context, MemberNames.HTTPValueCheck.toString(), httpvaluecheck);
	}

	/**
	 * @return value of SystemEndPoint_WebServiceInterfaceMessageConfiguration
	 */
	public final interfaceconfiguration.proxies.WebServiceInterfaceMessageConfiguration getSystemEndPoint_WebServiceInterfaceMessageConfiguration() throws com.mendix.core.CoreException
	{
		return getSystemEndPoint_WebServiceInterfaceMessageConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of SystemEndPoint_WebServiceInterfaceMessageConfiguration
	 */
	public final interfaceconfiguration.proxies.WebServiceInterfaceMessageConfiguration getSystemEndPoint_WebServiceInterfaceMessageConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.WebServiceInterfaceMessageConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SystemEndPoint_WebServiceInterfaceMessageConfiguration.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.WebServiceInterfaceMessageConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SystemEndPoint_WebServiceInterfaceMessageConfiguration
	 * @param systemendpoint_webserviceinterfacemessageconfiguration
	 */
	public final void setSystemEndPoint_WebServiceInterfaceMessageConfiguration(interfaceconfiguration.proxies.WebServiceInterfaceMessageConfiguration systemendpoint_webserviceinterfacemessageconfiguration)
	{
		setSystemEndPoint_WebServiceInterfaceMessageConfiguration(getContext(), systemendpoint_webserviceinterfacemessageconfiguration);
	}

	/**
	 * Set value of SystemEndPoint_WebServiceInterfaceMessageConfiguration
	 * @param context
	 * @param systemendpoint_webserviceinterfacemessageconfiguration
	 */
	public final void setSystemEndPoint_WebServiceInterfaceMessageConfiguration(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.WebServiceInterfaceMessageConfiguration systemendpoint_webserviceinterfacemessageconfiguration)
	{
		if (systemendpoint_webserviceinterfacemessageconfiguration == null)
			getMendixObject().setValue(context, MemberNames.SystemEndPoint_WebServiceInterfaceMessageConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SystemEndPoint_WebServiceInterfaceMessageConfiguration.toString(), systemendpoint_webserviceinterfacemessageconfiguration.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceconfiguration.proxies.SystemEndPoint that = (interfaceconfiguration.proxies.SystemEndPoint) obj;
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
		return "InterfaceConfiguration.SystemEndPoint";
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
