// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package metamodel.proxies;

public enum ImportExport
{
	By_Module(new java.lang.String[][] { new java.lang.String[] { "en_US", "By Module" }, new java.lang.String[] { "nl_NL", "Per module" }, new java.lang.String[] { "de_DE", "Nach Modul" } }),
	This_Object(new java.lang.String[][] { new java.lang.String[] { "en_US", "This Object" }, new java.lang.String[] { "nl_NL", "Dit object" }, new java.lang.String[] { "de_DE", "Diese Objekt" } }),
	Exclude_This_Object(new java.lang.String[][] { new java.lang.String[] { "en_US", "Exclude This Object" }, new java.lang.String[] { "nl_NL", "Sluit dit object uit" }, new java.lang.String[] { "de_DE", "Dieses Objekt ausschließen" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ImportExport(java.lang.String[][] captionStrings)
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
