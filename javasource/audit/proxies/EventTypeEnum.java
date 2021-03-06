// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audit.proxies;

public enum EventTypeEnum
{
	Initial(new java.lang.String[][] { new java.lang.String[] { "en_US", "Initial" } }),
	Insert(new java.lang.String[][] { new java.lang.String[] { "en_US", "Insert" }, new java.lang.String[] { "de_DE", "Einfügen " }, new java.lang.String[] { "nl_NL", "Invoegen" } }),
	Update(new java.lang.String[][] { new java.lang.String[] { "en_US", "Update" }, new java.lang.String[] { "de_DE", "Update " }, new java.lang.String[] { "nl_NL", "Update" } }),
	Delete(new java.lang.String[][] { new java.lang.String[] { "en_US", "Delete" }, new java.lang.String[] { "de_DE", "Löschen " }, new java.lang.String[] { "nl_NL", "Verwijderen" } }),
	Snapshot(new java.lang.String[][] { new java.lang.String[] { "en_US", "Snapshot" }, new java.lang.String[] { "nl_NL", "Snapshot" }, new java.lang.String[] { "de_DE", "Snapshot" } }),
	UpdateReferenceSetBoth(new java.lang.String[][] { new java.lang.String[] { "en_US", "Update Reference Set Both" }, new java.lang.String[] { "nl_NL", "Beide referentiesets bijwerken." }, new java.lang.String[] { "de_DE", "Update Reference Set Both" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private EventTypeEnum(java.lang.String[][] captionStrings)
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
