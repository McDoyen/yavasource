// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package approval.proxies;

public enum ApprovalByEnum
{
	First(new java.lang.String[][] { new java.lang.String[] { "en_US", "First" }, new java.lang.String[] { "de_DE", "Erster / Erste" }, new java.lang.String[] { "nl_NL", "Eerste" } }),
	Majority(new java.lang.String[][] { new java.lang.String[] { "en_US", "Majority" }, new java.lang.String[] { "de_DE", "Mehrheit" }, new java.lang.String[] { "nl_NL", "Meerderheid" } }),
	Number(new java.lang.String[][] { new java.lang.String[] { "en_US", "Number" }, new java.lang.String[] { "de_DE", "Anzahl" }, new java.lang.String[] { "nl_NL", "Aantal" } }),
	All(new java.lang.String[][] { new java.lang.String[] { "en_US", "All" }, new java.lang.String[] { "de_DE", "Alle " }, new java.lang.String[] { "nl_NL", "Alle" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ApprovalByEnum(java.lang.String[][] captionStrings)
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
