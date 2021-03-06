// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package scheduling.proxies;

public enum TemplateRequestTypeEnum
{
	TemplateRequest(new java.lang.String[][] { new java.lang.String[] { "en_US", "Template Request" }, new java.lang.String[] { "de_DE", "Fehlerbenachrichtigung" }, new java.lang.String[] { "nl_NL", "Template verzoek" } }),
	ScheduledTemplateRequest(new java.lang.String[][] { new java.lang.String[] { "en_US", "Scheduled Template Request" }, new java.lang.String[] { "de_DE", "Planmäßige Templateanfrage" }, new java.lang.String[] { "nl_NL", "Gepland templateverzoek" } }),
	TemplateTask(new java.lang.String[][] { new java.lang.String[] { "en_US", "Template Task" }, new java.lang.String[] { "de_DE", "Template-Task" }, new java.lang.String[] { "nl_NL", "Templatetaak" } }),
	TemplateTicket(new java.lang.String[][] { new java.lang.String[] { "en_US", "Template Ticket" }, new java.lang.String[] { "de_DE", "Template-Ticket" }, new java.lang.String[] { "nl_NL", "Template ticket" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private TemplateRequestTypeEnum(java.lang.String[][] captionStrings)
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
