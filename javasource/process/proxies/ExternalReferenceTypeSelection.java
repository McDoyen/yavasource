// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public enum ExternalReferenceTypeSelection
{
	Ticket_ID(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ticket ID" }, new java.lang.String[] { "nl_NL", "Ticket ID" }, new java.lang.String[] { "de_DE", "Ticket-ID" } }),
	Contact(new java.lang.String[][] { new java.lang.String[] { "en_US", "Contact" }, new java.lang.String[] { "nl_NL", "Contact" }, new java.lang.String[] { "de_DE", "Kontakt" } }),
	URL(new java.lang.String[][] { new java.lang.String[] { "en_US", "URL" }, new java.lang.String[] { "nl_NL", "URL" }, new java.lang.String[] { "de_DE", "URL" } }),
	File_Location(new java.lang.String[][] { new java.lang.String[] { "en_US", "File Location" }, new java.lang.String[] { "nl_NL", "Bestandslocatie" }, new java.lang.String[] { "de_DE", "Speicherstelle" } }),
	EWR(new java.lang.String[][] { new java.lang.String[] { "en_US", "EWR" } }),
	BSL(new java.lang.String[][] { new java.lang.String[] { "en_US", "BSL" } }),
	Supplier(new java.lang.String[][] { new java.lang.String[] { "en_US", "Supplier" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ExternalReferenceTypeSelection(java.lang.String[][] captionStrings)
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