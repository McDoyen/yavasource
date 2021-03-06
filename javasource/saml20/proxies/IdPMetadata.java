// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package saml20.proxies;

public class IdPMetadata extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SAML20.IdPMetadata";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		SSOConfiguration_IdPMetadata("SAML20.SSOConfiguration_IdPMetadata");

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

	public IdPMetadata(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SAML20.IdPMetadata"));
	}

	protected IdPMetadata(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject idPMetadataMendixObject)
	{
		super(context, idPMetadataMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SAML20.IdPMetadata", idPMetadataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SAML20.IdPMetadata");
	}

	/**
	 * @deprecated Use 'IdPMetadata.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static saml20.proxies.IdPMetadata initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return saml20.proxies.IdPMetadata.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static saml20.proxies.IdPMetadata initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new saml20.proxies.IdPMetadata(context, mendixObject);
	}

	public static saml20.proxies.IdPMetadata load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return saml20.proxies.IdPMetadata.initialize(context, mendixObject);
	}

	public static java.util.List<saml20.proxies.IdPMetadata> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<saml20.proxies.IdPMetadata> result = new java.util.ArrayList<saml20.proxies.IdPMetadata>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SAML20.IdPMetadata" + xpathConstraint))
			result.add(saml20.proxies.IdPMetadata.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of SSOConfiguration_IdPMetadata
	 */
	public final saml20.proxies.SSOConfiguration getSSOConfiguration_IdPMetadata() throws com.mendix.core.CoreException
	{
		return getSSOConfiguration_IdPMetadata(getContext());
	}

	/**
	 * @param context
	 * @return value of SSOConfiguration_IdPMetadata
	 */
	public final saml20.proxies.SSOConfiguration getSSOConfiguration_IdPMetadata(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		saml20.proxies.SSOConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SSOConfiguration_IdPMetadata.toString());
		if (identifier != null)
			result = saml20.proxies.SSOConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SSOConfiguration_IdPMetadata
	 * @param ssoconfiguration_idpmetadata
	 */
	public final void setSSOConfiguration_IdPMetadata(saml20.proxies.SSOConfiguration ssoconfiguration_idpmetadata)
	{
		setSSOConfiguration_IdPMetadata(getContext(), ssoconfiguration_idpmetadata);
	}

	/**
	 * Set value of SSOConfiguration_IdPMetadata
	 * @param context
	 * @param ssoconfiguration_idpmetadata
	 */
	public final void setSSOConfiguration_IdPMetadata(com.mendix.systemwideinterfaces.core.IContext context, saml20.proxies.SSOConfiguration ssoconfiguration_idpmetadata)
	{
		if (ssoconfiguration_idpmetadata == null)
			getMendixObject().setValue(context, MemberNames.SSOConfiguration_IdPMetadata.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SSOConfiguration_IdPMetadata.toString(), ssoconfiguration_idpmetadata.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final saml20.proxies.IdPMetadata that = (saml20.proxies.IdPMetadata) obj;
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
		return "SAML20.IdPMetadata";
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
