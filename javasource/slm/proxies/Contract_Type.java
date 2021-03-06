// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slm.proxies;

public enum Contract_Type
{
	SLA(new java.lang.String[][] { new java.lang.String[] { "en_US", "SLA" }, new java.lang.String[] { "nl_NL", "SLA" }, new java.lang.String[] { "de_DE", "SLA" } }),
	OLA(new java.lang.String[][] { new java.lang.String[] { "en_US", "OLA" }, new java.lang.String[] { "nl_NL", "OLA" }, new java.lang.String[] { "de_DE", "OLA" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Contract_Type(java.lang.String[][] captionStrings)
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
