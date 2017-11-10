// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public enum ApplicationVersions
{
	m9_Modified_since_m8_3_2(new java.lang.String[][] { new java.lang.String[] { "en_US", "ED M9" }, new java.lang.String[] { "nl_NL", "ED M9" }, new java.lang.String[] { "de_DE", "m9 Modified since m8.3.2" } }),
	m9_New(new java.lang.String[][] { new java.lang.String[] { "en_US", "m9 New" }, new java.lang.String[] { "nl_NL", "m9 New" }, new java.lang.String[] { "de_DE", "m9 New" } }),
	Ziggo(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ziggo" }, new java.lang.String[] { "nl_NL", "Ziggo" } }),
	ED_M9_1(new java.lang.String[][] { new java.lang.String[] { "en_US", "ED M9.1" }, new java.lang.String[] { "nl_NL", "ED M9.1" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ApplicationVersions(java.lang.String[][] captionStrings)
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
