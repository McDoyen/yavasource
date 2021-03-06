// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cms.proxies;

public enum CMSPages
{
	Home(new java.lang.String[][] { new java.lang.String[] { "en_US", "Home" }, new java.lang.String[] { "nl_NL", "Home" }, new java.lang.String[] { "de_DE", "Home " } }),
	Portal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Portal" }, new java.lang.String[] { "nl_NL", "Portaal" }, new java.lang.String[] { "de_DE", "Portal" } }),
	FAQ(new java.lang.String[][] { new java.lang.String[] { "en_US", "FAQ" }, new java.lang.String[] { "nl_NL", "FAQ" }, new java.lang.String[] { "de_DE", "FAQ" } }),
	MyRequests(new java.lang.String[][] { new java.lang.String[] { "en_US", "My Requests" }, new java.lang.String[] { "nl_NL", "Mijn verzoeken" }, new java.lang.String[] { "de_DE", "Meine Requests" } }),
	AboutDialog(new java.lang.String[][] { new java.lang.String[] { "en_US", "About Dialog" }, new java.lang.String[] { "nl_NL", "Over Dialoog" }, new java.lang.String[] { "de_DE", "Info Dialogfenster " } }),
	Test(new java.lang.String[][] { new java.lang.String[] { "en_US", "Test" }, new java.lang.String[] { "nl_NL", "Test" }, new java.lang.String[] { "de_DE", "Test" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private CMSPages(java.lang.String[][] captionStrings)
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
