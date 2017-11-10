// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceconfiguration.proxies;

public enum DefaultTableItemType
{
	Request(new java.lang.String[][] { new java.lang.String[] { "en_US", "Request" }, new java.lang.String[] { "nl_NL", "Verzoek" } }),
	Request_Update(new java.lang.String[][] { new java.lang.String[] { "en_US", "Request Update" }, new java.lang.String[] { "nl_NL", "Verzoek update" } }),
	Contract_Aspect_Update(new java.lang.String[][] { new java.lang.String[] { "en_US", "Contract Aspect Update" }, new java.lang.String[] { "nl_NL", "Contract aspect update" } }),
	Add_Update_Delete_Affected_CIs(new java.lang.String[][] { new java.lang.String[] { "en_US", "Add Update Delete Affected CIs" }, new java.lang.String[] { "nl_NL", "Toevoegen Wijzigen Verwijderen Betrokken CIs" } }),
	LDAPImportType(new java.lang.String[][] { new java.lang.String[] { "en_US", "LDAPImportType" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private DefaultTableItemType(java.lang.String[][] captionStrings)
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
