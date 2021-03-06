// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cmdb.proxies;

public enum Depreciation_Period
{
	Week(new java.lang.String[][] { new java.lang.String[] { "en_US", "Weeks" }, new java.lang.String[] { "nl_NL", "Weken" }, new java.lang.String[] { "de_DE", "Woche" } }),
	Month(new java.lang.String[][] { new java.lang.String[] { "en_US", "Months" }, new java.lang.String[] { "nl_NL", "Maanden" }, new java.lang.String[] { "de_DE", "Monat" } }),
	Quarter(new java.lang.String[][] { new java.lang.String[] { "en_US", "Quarters" }, new java.lang.String[] { "nl_NL", "Kwartalen" }, new java.lang.String[] { "de_DE", "Quartal" } }),
	Year(new java.lang.String[][] { new java.lang.String[] { "en_US", "Years" }, new java.lang.String[] { "de_DE", "Jahre" }, new java.lang.String[] { "nl_NL", "Jaren" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Depreciation_Period(java.lang.String[][] captionStrings)
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
