// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package statetransition.proxies;

public enum Function_Type
{
	CMDB_Function(new java.lang.String[][] { new java.lang.String[] { "en_US", "CMDB Function" }, new java.lang.String[] { "nl_NL", "CMDB functie" }, new java.lang.String[] { "de_DE", "CMDB Funktion" } }),
	Process_Function(new java.lang.String[][] { new java.lang.String[] { "en_US", "Process Function" }, new java.lang.String[] { "nl_NL", "Procesfunctie" }, new java.lang.String[] { "de_DE", "Prozessfunktion" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Function_Type(java.lang.String[][] captionStrings)
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
