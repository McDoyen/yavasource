// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public enum ProcessSatisfaction
{
	Satified(new java.lang.String[][] { new java.lang.String[] { "en_US", "Satisfied" }, new java.lang.String[] { "nl_NL", "Tevreden" }, new java.lang.String[] { "de_DE", "erfüllt " } }),
	Partially_Satisfied(new java.lang.String[][] { new java.lang.String[] { "en_US", "Partially Satisfied" }, new java.lang.String[] { "nl_NL", "Gedeeltelijk Tevreden" }, new java.lang.String[] { "de_DE", "Teilweise zufrieden" } }),
	Not_Satisfied(new java.lang.String[][] { new java.lang.String[] { "en_US", "Not Satisfied" }, new java.lang.String[] { "nl_NL", "Niet tevreden" }, new java.lang.String[] { "de_DE", "Nicht zufrieden" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ProcessSatisfaction(java.lang.String[][] captionStrings)
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