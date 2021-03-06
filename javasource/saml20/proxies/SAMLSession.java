// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package saml20.proxies;

public class SAMLSession
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sAMLSessionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAML20.SAMLSession";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SessionID("SessionID"),
		Username("Username"),
		SAMLSession_SSOConfiguration("SAML20.SAMLSession_SSOConfiguration");

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

	public SAMLSession(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAML20.SAMLSession"));
	}

	protected SAMLSession(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sAMLSessionMendixObject)
	{
		if (sAMLSessionMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SAML20.SAMLSession", sAMLSessionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAML20.SAMLSession");

		this.sAMLSessionMendixObject = sAMLSessionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SAMLSession.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static saml20.proxies.SAMLSession initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return saml20.proxies.SAMLSession.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static saml20.proxies.SAMLSession initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new saml20.proxies.SAMLSession(context, mendixObject);
	}

	public static saml20.proxies.SAMLSession load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return saml20.proxies.SAMLSession.initialize(context, mendixObject);
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
	 * @return value of SessionID
	 */
	public final java.lang.String getSessionID()
	{
		return getSessionID(getContext());
	}

	/**
	 * @param context
	 * @return value of SessionID
	 */
	public final java.lang.String getSessionID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SessionID.toString());
	}

	/**
	 * Set value of SessionID
	 * @param sessionid
	 */
	public final void setSessionID(java.lang.String sessionid)
	{
		setSessionID(getContext(), sessionid);
	}

	/**
	 * Set value of SessionID
	 * @param context
	 * @param sessionid
	 */
	public final void setSessionID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sessionid)
	{
		getMendixObject().setValue(context, MemberNames.SessionID.toString(), sessionid);
	}

	/**
	 * @return value of Username
	 */
	public final java.lang.String getUsername()
	{
		return getUsername(getContext());
	}

	/**
	 * @param context
	 * @return value of Username
	 */
	public final java.lang.String getUsername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Username.toString());
	}

	/**
	 * Set value of Username
	 * @param username
	 */
	public final void setUsername(java.lang.String username)
	{
		setUsername(getContext(), username);
	}

	/**
	 * Set value of Username
	 * @param context
	 * @param username
	 */
	public final void setUsername(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String username)
	{
		getMendixObject().setValue(context, MemberNames.Username.toString(), username);
	}

	/**
	 * @return value of SAMLSession_SSOConfiguration
	 */
	public final saml20.proxies.SSOConfiguration getSAMLSession_SSOConfiguration() throws com.mendix.core.CoreException
	{
		return getSAMLSession_SSOConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of SAMLSession_SSOConfiguration
	 */
	public final saml20.proxies.SSOConfiguration getSAMLSession_SSOConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		saml20.proxies.SSOConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SAMLSession_SSOConfiguration.toString());
		if (identifier != null)
			result = saml20.proxies.SSOConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SAMLSession_SSOConfiguration
	 * @param samlsession_ssoconfiguration
	 */
	public final void setSAMLSession_SSOConfiguration(saml20.proxies.SSOConfiguration samlsession_ssoconfiguration)
	{
		setSAMLSession_SSOConfiguration(getContext(), samlsession_ssoconfiguration);
	}

	/**
	 * Set value of SAMLSession_SSOConfiguration
	 * @param context
	 * @param samlsession_ssoconfiguration
	 */
	public final void setSAMLSession_SSOConfiguration(com.mendix.systemwideinterfaces.core.IContext context, saml20.proxies.SSOConfiguration samlsession_ssoconfiguration)
	{
		if (samlsession_ssoconfiguration == null)
			getMendixObject().setValue(context, MemberNames.SAMLSession_SSOConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SAMLSession_SSOConfiguration.toString(), samlsession_ssoconfiguration.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sAMLSessionMendixObject;
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
			final saml20.proxies.SAMLSession that = (saml20.proxies.SAMLSession) obj;
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
		return "SAML20.SAMLSession";
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
