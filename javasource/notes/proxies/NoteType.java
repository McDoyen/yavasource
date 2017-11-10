// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package notes.proxies;

public enum NoteType
{
	Ticket(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ticket" }, new java.lang.String[] { "nl_NL", "Ticket" }, new java.lang.String[] { "de_DE", "Ticket" } }),
	Task(new java.lang.String[][] { new java.lang.String[] { "en_US", "Task" }, new java.lang.String[] { "nl_NL", "Taak" }, new java.lang.String[] { "de_DE", "Task" } }),
	CI(new java.lang.String[][] { new java.lang.String[] { "en_US", "CI" }, new java.lang.String[] { "nl_NL", "CI" }, new java.lang.String[] { "de_DE", "CI   " } }),
	Contract(new java.lang.String[][] { new java.lang.String[] { "en_US", "Contract" }, new java.lang.String[] { "nl_NL", "Contract" }, new java.lang.String[] { "de_DE", "Vertrags" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private NoteType(java.lang.String[][] captionStrings)
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