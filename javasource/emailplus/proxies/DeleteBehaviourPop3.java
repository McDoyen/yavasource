// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailplus.proxies;

public enum DeleteBehaviourPop3
{
	LeaveOnServer(new java.lang.String[][] { new java.lang.String[] { "en_US", "Leave On Server" }, new java.lang.String[] { "nl_NL", "Laat op server staan" }, new java.lang.String[] { "de_DE", "Auf dem Server lassen" } }),
	DeleteOnRetrieval(new java.lang.String[][] { new java.lang.String[] { "en_US", "Delete on Retrieval" }, new java.lang.String[] { "nl_NL", "Verwijder bij ophalen" }, new java.lang.String[] { "de_DE", "Auf Abruf löschen" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private DeleteBehaviourPop3(java.lang.String[][] captionStrings)
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
