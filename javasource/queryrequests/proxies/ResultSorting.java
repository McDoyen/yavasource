// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package queryrequests.proxies;

public enum ResultSorting
{
	Ticket_Task_IDs(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ticket > Task (id)" }, new java.lang.String[] { "nl_NL", "Ticket > Taak (id)" } }),
	Status(new java.lang.String[][] { new java.lang.String[] { "en_US", "Status" }, new java.lang.String[] { "nl_NL", "Status" } }),
	Create_Date(new java.lang.String[][] { new java.lang.String[] { "en_US", "Create Date" }, new java.lang.String[] { "nl_NL", "Aanmaakdatum" } }),
	Person(new java.lang.String[][] { new java.lang.String[] { "en_US", "Person" }, new java.lang.String[] { "nl_NL", "Persoon" } }),
	Delivering_Organisation(new java.lang.String[][] { new java.lang.String[] { "en_US", "Delivering Organisation" }, new java.lang.String[] { "nl_NL", "Toegewezen groep" } }),
	Receiving_Organisation(new java.lang.String[][] { new java.lang.String[] { "en_US", "Receiving Organisation" }, new java.lang.String[] { "nl_NL", "Ontvangende organisatie" } }),
	Service(new java.lang.String[][] { new java.lang.String[] { "en_US", "Type" }, new java.lang.String[] { "nl_NL", "Type" } }),
	Service_Process(new java.lang.String[][] { new java.lang.String[] { "en_US", "Service Process" }, new java.lang.String[] { "nl_NL", "Service process" } }),
	Contract_End_Time(new java.lang.String[][] { new java.lang.String[] { "en_US", "Contract End Time" }, new java.lang.String[] { "nl_NL", "Contract eind tijd" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ResultSorting(java.lang.String[][] captionStrings)
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
