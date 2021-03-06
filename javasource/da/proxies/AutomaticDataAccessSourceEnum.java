// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package da.proxies;

public enum AutomaticDataAccessSourceEnum
{
	Relation(new java.lang.String[][] { new java.lang.String[] { "en_US", "Relation" }, new java.lang.String[] { "nl_NL", "Relatie" }, new java.lang.String[] { "de_DE", "Verbindung  " } }),
	Self(new java.lang.String[][] { new java.lang.String[] { "en_US", "Self" }, new java.lang.String[] { "nl_NL", "Zelf" }, new java.lang.String[] { "de_DE", "Eigener" } }),
	Via_Entity(new java.lang.String[][] { new java.lang.String[] { "en_US", "Via Entity" }, new java.lang.String[] { "nl_NL", "Via entiteit" }, new java.lang.String[] { "de_DE", "Via Entität" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private AutomaticDataAccessSourceEnum(java.lang.String[][] captionStrings)
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
