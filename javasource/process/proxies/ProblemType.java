// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public enum ProblemType
{
	New_Problem(new java.lang.String[][] { new java.lang.String[] { "en_US", "New Problem" }, new java.lang.String[] { "nl_NL", "Nieuw Probleem" }, new java.lang.String[] { "de_DE", "Neues Problem" } }),
	Known_Error(new java.lang.String[][] { new java.lang.String[] { "en_US", "Known Error" }, new java.lang.String[] { "nl_NL", "Bekende Fout" }, new java.lang.String[] { "de_DE", "Bekannter Fehler" } }),
	Known_Problem(new java.lang.String[][] { new java.lang.String[] { "en_US", "Known Problem" }, new java.lang.String[] { "nl_NL", "Bekend Probleem" }, new java.lang.String[] { "de_DE", "Bekanntes Problem" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ProblemType(java.lang.String[][] captionStrings)
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
