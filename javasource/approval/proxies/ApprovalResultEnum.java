// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package approval.proxies;

public enum ApprovalResultEnum
{
	Approved(new java.lang.String[][] { new java.lang.String[] { "en_US", "Approved" }, new java.lang.String[] { "de_DE", "Genehmigt" }, new java.lang.String[] { "nl_NL", "Goedgekeurd" } }),
	Rejected(new java.lang.String[][] { new java.lang.String[] { "en_US", "Rejected" }, new java.lang.String[] { "de_DE", "Abgelehnt" }, new java.lang.String[] { "nl_NL", "Afgewezen" } }),
	Open(new java.lang.String[][] { new java.lang.String[] { "en_US", "Open" }, new java.lang.String[] { "de_DE", "Offen" }, new java.lang.String[] { "nl_NL", "Open" } }),
	Cancelled(new java.lang.String[][] { new java.lang.String[] { "en_US", "Cancelled" }, new java.lang.String[] { "de_DE", "Annuliert" }, new java.lang.String[] { "nl_NL", "Geannuleerd" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ApprovalResultEnum(java.lang.String[][] captionStrings)
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
