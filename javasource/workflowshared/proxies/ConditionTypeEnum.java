// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowshared.proxies;

public enum ConditionTypeEnum
{
	Other(new java.lang.String[][] { new java.lang.String[] { "en_US", "Other" }, new java.lang.String[] { "nl_NL", "Anders" }, new java.lang.String[] { "de_DE", "Andere " } }),
	Request_Condition(new java.lang.String[][] { new java.lang.String[] { "en_US", "Request Condition" }, new java.lang.String[] { "nl_NL", "Conditie aanvragen" }, new java.lang.String[] { "de_DE", "Anfragebedingung" } }),
	Boolean_Condition(new java.lang.String[][] { new java.lang.String[] { "en_US", "Boolean Condition" }, new java.lang.String[] { "nl_NL", "Boolean conditie" }, new java.lang.String[] { "de_DE", "Boolesche Bedingung" } }),
	Result_Condition(new java.lang.String[][] { new java.lang.String[] { "en_US", "Result Condition" }, new java.lang.String[] { "de_DE", "Folgebedingung" }, new java.lang.String[] { "nl_NL", "Resultaatconditie" } }),
	Interface_Condition(new java.lang.String[][] { new java.lang.String[] { "en_US", "Interface Condition" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ConditionTypeEnum(java.lang.String[][] captionStrings)
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