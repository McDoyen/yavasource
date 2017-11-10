// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestanalysis.proxies;

public enum onethroughten
{
	_1(new java.lang.String[][] { new java.lang.String[] { "en_US", "1" }, new java.lang.String[] { "de_DE", "1" }, new java.lang.String[] { "nl_NL", "1" } }),
	_2(new java.lang.String[][] { new java.lang.String[] { "en_US", "2" }, new java.lang.String[] { "de_DE", "2" }, new java.lang.String[] { "nl_NL", "2" } }),
	_3(new java.lang.String[][] { new java.lang.String[] { "en_US", "3" }, new java.lang.String[] { "de_DE", "3" }, new java.lang.String[] { "nl_NL", "3" } }),
	_4(new java.lang.String[][] { new java.lang.String[] { "en_US", "4" }, new java.lang.String[] { "de_DE", "4" }, new java.lang.String[] { "nl_NL", "4" } }),
	_5(new java.lang.String[][] { new java.lang.String[] { "en_US", "5" }, new java.lang.String[] { "de_DE", "5" }, new java.lang.String[] { "nl_NL", "5" } }),
	_6(new java.lang.String[][] { new java.lang.String[] { "en_US", "6" }, new java.lang.String[] { "de_DE", "6" }, new java.lang.String[] { "nl_NL", "6" } }),
	_7(new java.lang.String[][] { new java.lang.String[] { "en_US", "7" }, new java.lang.String[] { "de_DE", "7" }, new java.lang.String[] { "nl_NL", "7" } }),
	_8(new java.lang.String[][] { new java.lang.String[] { "en_US", "8" }, new java.lang.String[] { "de_DE", "8" }, new java.lang.String[] { "nl_NL", "8" } }),
	_9(new java.lang.String[][] { new java.lang.String[] { "en_US", "9" }, new java.lang.String[] { "de_DE", "9" }, new java.lang.String[] { "nl_NL", "9" } }),
	_10(new java.lang.String[][] { new java.lang.String[] { "en_US", "10" }, new java.lang.String[] { "de_DE", "10" }, new java.lang.String[] { "nl_NL", "10" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private onethroughten(java.lang.String[][] captionStrings)
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
