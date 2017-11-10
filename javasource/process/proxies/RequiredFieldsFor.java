// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public enum RequiredFieldsFor
{
	All(new java.lang.String[][] { new java.lang.String[] { "en_US", "All" }, new java.lang.String[] { "nl_NL", "Alle" }, new java.lang.String[] { "de_DE", "Alle " } }),
	Incident(new java.lang.String[][] { new java.lang.String[] { "en_US", "Incident" }, new java.lang.String[] { "nl_NL", "Incident" }, new java.lang.String[] { "de_DE", "Incident " } }),
	Change(new java.lang.String[][] { new java.lang.String[] { "en_US", "Change" }, new java.lang.String[] { "nl_NL", "Wijziging" }, new java.lang.String[] { "de_DE", "Change   " } }),
	Problem(new java.lang.String[][] { new java.lang.String[] { "en_US", "Problem" }, new java.lang.String[] { "nl_NL", "Probleem" }, new java.lang.String[] { "de_DE", "Problem" } }),
	Operation(new java.lang.String[][] { new java.lang.String[] { "en_US", "Operation" }, new java.lang.String[] { "nl_NL", "Operation" }, new java.lang.String[] { "de_DE", "Operation   " } }),
	Delivery(new java.lang.String[][] { new java.lang.String[] { "en_US", "Delivery" }, new java.lang.String[] { "nl_NL", "Levering" }, new java.lang.String[] { "de_DE", "Zulieferung " } }),
	Service_Request(new java.lang.String[][] { new java.lang.String[] { "en_US", "Service Request" }, new java.lang.String[] { "nl_NL", "Service verzoek" }, new java.lang.String[] { "de_DE", "Service-Request" } }),
	Task(new java.lang.String[][] { new java.lang.String[] { "en_US", "Task" }, new java.lang.String[] { "nl_NL", "Taak" }, new java.lang.String[] { "de_DE", "Task" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private RequiredFieldsFor(java.lang.String[][] captionStrings)
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