// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowshared.proxies;

public enum NodeTypeEnum
{
	Start(new java.lang.String[][] { new java.lang.String[] { "en_US", "Start" }, new java.lang.String[] { "nl_NL", "Start" }, new java.lang.String[] { "de_DE", "Start" } }),
	End(new java.lang.String[][] { new java.lang.String[] { "en_US", "End" }, new java.lang.String[] { "nl_NL", "Einde" }, new java.lang.String[] { "de_DE", "Ende " } }),
	Merge(new java.lang.String[][] { new java.lang.String[] { "en_US", "Merge" }, new java.lang.String[] { "nl_NL", "Merge" }, new java.lang.String[] { "de_DE", "Merge" } }),
	Conditional(new java.lang.String[][] { new java.lang.String[] { "en_US", "Conditional" }, new java.lang.String[] { "nl_NL", "Conditioneel" }, new java.lang.String[] { "de_DE", "Abhängig" } }),
	Parallel(new java.lang.String[][] { new java.lang.String[] { "en_US", "Parallel" }, new java.lang.String[] { "nl_NL", "Parallel" }, new java.lang.String[] { "de_DE", "Parallel" } }),
	Action(new java.lang.String[][] { new java.lang.String[] { "en_US", "Action" }, new java.lang.String[] { "de_DE", "Aktion " }, new java.lang.String[] { "nl_NL", "Actie" } }),
	Message(new java.lang.String[][] { new java.lang.String[] { "en_US", "Message" }, new java.lang.String[] { "de_DE", "Nachricht   " }, new java.lang.String[] { "nl_NL", "Bericht" } }),
	Approval(new java.lang.String[][] { new java.lang.String[] { "en_US", "Approval" }, new java.lang.String[] { "de_DE", "Abnahme  " }, new java.lang.String[] { "nl_NL", "Goedkeuring" } }),
	Timer(new java.lang.String[][] { new java.lang.String[] { "en_US", "Timer" }, new java.lang.String[] { "de_DE", "Zeitmesser" }, new java.lang.String[] { "nl_NL", "Timer" } }),
	Cancel(new java.lang.String[][] { new java.lang.String[] { "en_US", "Cancel" }, new java.lang.String[] { "de_DE", "Abbrechen" }, new java.lang.String[] { "nl_NL", "Annuleren" } }),
	SubWorkflow(new java.lang.String[][] { new java.lang.String[] { "en_US", "SubWorkflow" }, new java.lang.String[] { "de_DE", "Sub-Workflow" }, new java.lang.String[] { "nl_NL", "Subworkflow" } }),
	Request(new java.lang.String[][] { new java.lang.String[] { "en_US", "Request" }, new java.lang.String[] { "de_DE", "Request" }, new java.lang.String[] { "nl_NL", "Verzoek" } }),
	Signal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Signal" }, new java.lang.String[] { "de_DE", "Impuls" }, new java.lang.String[] { "nl_NL", "Signaal" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private NodeTypeEnum(java.lang.String[][] captionStrings)
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