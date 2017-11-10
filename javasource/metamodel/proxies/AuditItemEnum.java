// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package metamodel.proxies;

public enum AuditItemEnum
{
	By_Entity(new java.lang.String[][] { new java.lang.String[] { "en_US", "By Entity" }, new java.lang.String[] { "nl_NL", "Per entiteit" }, new java.lang.String[] { "de_DE", "Nach Entität" } }),
	Audit_This_Item(new java.lang.String[][] { new java.lang.String[] { "en_US", "Audit This Item" }, new java.lang.String[] { "nl_NL", "Audit dit item" }, new java.lang.String[] { "de_DE", "Dieses Elemente auditieren" } }),
	Skip_This_Item(new java.lang.String[][] { new java.lang.String[] { "en_US", "Skip This Item" }, new java.lang.String[] { "nl_NL", "Dit item overslaan" }, new java.lang.String[] { "de_DE", "Dieses Element überspringen" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private AuditItemEnum(java.lang.String[][] captionStrings)
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
