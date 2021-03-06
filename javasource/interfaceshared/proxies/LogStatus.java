// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared.proxies;

public enum LogStatus
{
	Not_Viewed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Not Viewed" }, new java.lang.String[] { "nl_NL", "Niet bekeken" } }),
	Viewed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Viewed" }, new java.lang.String[] { "nl_NL", "Bekeken" } }),
	Solved(new java.lang.String[][] { new java.lang.String[] { "en_US", "Solved" }, new java.lang.String[] { "nl_NL", "Opgelost" } }),
	Ignored(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ignored" }, new java.lang.String[] { "nl_NL", "Genegeerd" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private LogStatus(java.lang.String[][] captionStrings)
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
