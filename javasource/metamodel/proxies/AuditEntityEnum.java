// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package metamodel.proxies;

public enum AuditEntityEnum
{
	No_Audit(new java.lang.String[][] { new java.lang.String[] { "en_US", "No Audit" }, new java.lang.String[] { "nl_NL", "Geen audit" }, new java.lang.String[] { "de_DE", "Keines Audit" } }),
	Audit_Specific_Items(new java.lang.String[][] { new java.lang.String[] { "en_US", "Audit Specific Items" }, new java.lang.String[] { "nl_NL", "Audit specifieke items" }, new java.lang.String[] { "de_DE", "Einzelne Elemente auditieren" } }),
	Audit_All_Items(new java.lang.String[][] { new java.lang.String[] { "en_US", "Audit All Items" }, new java.lang.String[] { "nl_NL", "Audit alle items" }, new java.lang.String[] { "de_DE", "Alle Artikel auditieren" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private AuditEntityEnum(java.lang.String[][] captionStrings)
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
