// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public enum TestStatus
{
	_New(new java.lang.String[][] { new java.lang.String[] { "en_US", "New" }, new java.lang.String[] { "nl_NL", "Nieuw" }, new java.lang.String[] { "de_DE", "Neu " } }),
	Open(new java.lang.String[][] { new java.lang.String[] { "en_US", "Open" }, new java.lang.String[] { "nl_NL", "Open" }, new java.lang.String[] { "de_DE", "Offen" } }),
	Issue_found(new java.lang.String[][] { new java.lang.String[] { "en_US", "Issue found" } }),
	Ready_for_retest(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ready for retest" } }),
	Correct(new java.lang.String[][] { new java.lang.String[] { "en_US", "Correct" }, new java.lang.String[] { "nl_NL", "Juist" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private TestStatus(java.lang.String[][] captionStrings)
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