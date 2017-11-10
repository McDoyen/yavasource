// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public enum CheckType
{
	Visibility(new java.lang.String[][] { new java.lang.String[] { "en_US", "Visibility" }, new java.lang.String[] { "nl_NL", "Zichtbaarheid" } }),
	Editablitily(new java.lang.String[][] { new java.lang.String[] { "en_US", "Editablitily" } }),
	Value(new java.lang.String[][] { new java.lang.String[] { "en_US", "Value" }, new java.lang.String[] { "nl_NL", "Waarde" } }),
	IdentifierValue(new java.lang.String[][] { new java.lang.String[] { "en_US", "Identifier value" } }),
	OtherIdentifierValue(new java.lang.String[][] { new java.lang.String[] { "en_US", "Other identifier value" } }),
	NumberOfEntries(new java.lang.String[][] { new java.lang.String[] { "en_US", "Number of entries" } }),
	Functionality(new java.lang.String[][] { new java.lang.String[] { "en_US", "Functionality" }, new java.lang.String[] { "nl_NL", "Functionaliteit" } }),
	ColumnValues(new java.lang.String[][] { new java.lang.String[] { "en_US", "Column values" }, new java.lang.String[] { "nl_NL", "Kolom waarden" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private CheckType(java.lang.String[][] captionStrings)
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
