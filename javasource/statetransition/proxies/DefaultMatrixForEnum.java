// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package statetransition.proxies;

public enum DefaultMatrixForEnum
{
	CMDB(new java.lang.String[][] { new java.lang.String[] { "en_US", "CMDB" }, new java.lang.String[] { "nl_NL", "CMDB" }, new java.lang.String[] { "de_DE", "CMDB" } }),
	Request(new java.lang.String[][] { new java.lang.String[] { "en_US", "Request" }, new java.lang.String[] { "nl_NL", "Verzoek" } }),
	Incident(new java.lang.String[][] { new java.lang.String[] { "en_US", "Incident" }, new java.lang.String[] { "nl_NL", "Incident" }, new java.lang.String[] { "de_DE", "Incident " } }),
	Problem(new java.lang.String[][] { new java.lang.String[] { "en_US", "Problem" }, new java.lang.String[] { "nl_NL", "Probleem" }, new java.lang.String[] { "de_DE", "Problem" } }),
	Change(new java.lang.String[][] { new java.lang.String[] { "en_US", "Change" }, new java.lang.String[] { "nl_NL", "Wijziging" }, new java.lang.String[] { "de_DE", "Change   " } }),
	Operations(new java.lang.String[][] { new java.lang.String[] { "en_US", "Operations" }, new java.lang.String[] { "nl_NL", "Productie" }, new java.lang.String[] { "de_DE", "Operationen" } }),
	Delivery(new java.lang.String[][] { new java.lang.String[] { "en_US", "Delivery" }, new java.lang.String[] { "nl_NL", "Levering" }, new java.lang.String[] { "de_DE", "Zulieferung " } }),
	Service_Request(new java.lang.String[][] { new java.lang.String[] { "en_US", "Service Request" }, new java.lang.String[] { "nl_NL", "Service verzoek" }, new java.lang.String[] { "de_DE", "Service-Request" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private DefaultMatrixForEnum(java.lang.String[][] captionStrings)
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