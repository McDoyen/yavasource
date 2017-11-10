// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public enum ActivityStreamCreation
{
	Notes(new java.lang.String[][] { new java.lang.String[] { "en_US", "Note" }, new java.lang.String[] { "nl_NL", "Notitie" }, new java.lang.String[] { "de_DE", "Notiz " } }),
	Notifications(new java.lang.String[][] { new java.lang.String[] { "en_US", "Notification" }, new java.lang.String[] { "nl_NL", "Notificatie" }, new java.lang.String[] { "de_DE", "Benachrichtigung " } }),
	Email(new java.lang.String[][] { new java.lang.String[] { "en_US", "Email" }, new java.lang.String[] { "nl_NL", "E-mail" }, new java.lang.String[] { "de_DE", "E-Mail " } }),
	StatusHistory(new java.lang.String[][] { new java.lang.String[] { "en_US", "Status audit" }, new java.lang.String[] { "nl_NL", "Status Audit" }, new java.lang.String[] { "de_DE", "Status-Audit" } }),
	Aspect_audit(new java.lang.String[][] { new java.lang.String[] { "en_US", "Aspect audit" }, new java.lang.String[] { "nl_NL", "Aspect audit" } }),
	General(new java.lang.String[][] { new java.lang.String[] { "en_US", "General" }, new java.lang.String[] { "nl_NL", "Algemeen" }, new java.lang.String[] { "de_DE", "Allgemein" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ActivityStreamCreation(java.lang.String[][] captionStrings)
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
