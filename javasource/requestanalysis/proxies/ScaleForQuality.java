// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestanalysis.proxies;

public enum ScaleForQuality
{
	Very_poor(new java.lang.String[][] { new java.lang.String[] { "en_US", "Very poor" }, new java.lang.String[] { "nl_NL", "Zeer slecht" }, new java.lang.String[] { "de_DE", "Sehr schlecht" } }),
	Poor(new java.lang.String[][] { new java.lang.String[] { "en_US", "Poor" }, new java.lang.String[] { "nl_NL", "Slecht" }, new java.lang.String[] { "de_DE", "Schlecht" } }),
	Fair(new java.lang.String[][] { new java.lang.String[] { "en_US", "Fair" }, new java.lang.String[] { "nl_NL", "Redelijk" }, new java.lang.String[] { "de_DE", "Leidlich" } }),
	good(new java.lang.String[][] { new java.lang.String[] { "en_US", "Good" }, new java.lang.String[] { "nl_NL", "Goed" }, new java.lang.String[] { "de_DE", "Gut" } }),
	Very_good(new java.lang.String[][] { new java.lang.String[] { "en_US", "Very good" }, new java.lang.String[] { "nl_NL", "Zeer goed" }, new java.lang.String[] { "de_DE", "Sehr gut" } }),
	excellent(new java.lang.String[][] { new java.lang.String[] { "en_US", "Excellent" }, new java.lang.String[] { "nl_NL", "Zeer goed" }, new java.lang.String[] { "de_DE", "Ausgezeichnet" } }),
	Exceptional(new java.lang.String[][] { new java.lang.String[] { "en_US", "Exceptional" }, new java.lang.String[] { "nl_NL", "Uitmuntend" }, new java.lang.String[] { "de_DE", "Außergewöhnlich" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ScaleForQuality(java.lang.String[][] captionStrings)
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
