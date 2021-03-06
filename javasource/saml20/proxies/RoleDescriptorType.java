// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package saml20.proxies;

public enum RoleDescriptorType
{
	SPSSODescriptor(new java.lang.String[][] { new java.lang.String[] { "en_US", "SPSSODescriptor" }, new java.lang.String[] { "nl_NL", "SPSSODescriptor" }, new java.lang.String[] { "en_GB", "SPSSODescriptor" }, new java.lang.String[] { "en_ZA", "SPSSODescriptor" } }),
	IDPSSODescriptor(new java.lang.String[][] { new java.lang.String[] { "en_US", "IDPSSODescriptor" }, new java.lang.String[] { "nl_NL", "IDPSSODescriptor" }, new java.lang.String[] { "en_GB", "IDPSSODescriptor" }, new java.lang.String[] { "en_ZA", "IDPSSODescriptor" } }),
	AttributeAuthorityDescriptor(new java.lang.String[][] { new java.lang.String[] { "en_US", "AttributeAuthorityDescriptor" }, new java.lang.String[] { "nl_NL", "AttributeAuthorityDescriptor" }, new java.lang.String[] { "en_GB", "AttributeAuthorityDescriptor" }, new java.lang.String[] { "en_ZA", "AttributeAuthorityDescriptor" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private RoleDescriptorType(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
