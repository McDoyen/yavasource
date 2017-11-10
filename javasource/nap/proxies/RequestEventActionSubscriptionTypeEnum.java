// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nap.proxies;

public enum RequestEventActionSubscriptionTypeEnum
{
	Any(new java.lang.String[][] { new java.lang.String[] { "en_US", "Any" }, new java.lang.String[] { "nl_NL", "Elke" }, new java.lang.String[] { "de_DE", "Jede/r  " } }),
	Specific_Transitions(new java.lang.String[][] { new java.lang.String[] { "en_US", "Specific Transitions" }, new java.lang.String[] { "nl_NL", "Specifieke transities" }, new java.lang.String[] { "de_DE", "Spezifische Transitionen" } }),
	Specific_Function(new java.lang.String[][] { new java.lang.String[] { "en_US", "Specific Function" }, new java.lang.String[] { "nl_NL", "Specifieke functie" }, new java.lang.String[] { "de_DE", "Spezifische Funktion" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private RequestEventActionSubscriptionTypeEnum(java.lang.String[][] captionStrings)
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