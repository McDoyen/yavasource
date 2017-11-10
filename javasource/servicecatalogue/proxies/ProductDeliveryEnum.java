// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public enum ProductDeliveryEnum
{
	None(new java.lang.String[][] { new java.lang.String[] { "en_US", "None" }, new java.lang.String[] { "de_DE", "Keine(r)" }, new java.lang.String[] { "nl_NL", "Geen" } }),
	Task(new java.lang.String[][] { new java.lang.String[] { "en_US", "Task" }, new java.lang.String[] { "de_DE", "Task" }, new java.lang.String[] { "nl_NL", "Taak" } }),
	Task_With_Workflow(new java.lang.String[][] { new java.lang.String[] { "en_US", "Task With Workflow" }, new java.lang.String[] { "nl_NL", "Taak met workflow" }, new java.lang.String[] { "de_DE", "Task mit Workflow" } }),
	Request(new java.lang.String[][] { new java.lang.String[] { "en_US", "Request" }, new java.lang.String[] { "de_DE", "Request" }, new java.lang.String[] { "nl_NL", "Verzoek" } }),
	Request_With_Workflow(new java.lang.String[][] { new java.lang.String[] { "en_US", "Request With Workflow" }, new java.lang.String[] { "nl_NL", "Verzoek met workflow" }, new java.lang.String[] { "de_DE", "Anfrage mit Workflow" } }),
	SRM_Workflow(new java.lang.String[][] { new java.lang.String[] { "en_US", "SRM Workflow" }, new java.lang.String[] { "nl_NL", "SRM workflow" }, new java.lang.String[] { "de_DE", "SRM Workflow" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ProductDeliveryEnum(java.lang.String[][] captionStrings)
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
