// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nap.proxies;

public enum Titles
{
	Mr_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Mr." }, new java.lang.String[] { "nl_NL", "Dhr." }, new java.lang.String[] { "de_DE", "Herr" } }),
	Mrs_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Mrs." }, new java.lang.String[] { "nl_NL", "Mevr." }, new java.lang.String[] { "de_DE", "Frau" } }),
	Dr_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dr." }, new java.lang.String[] { "nl_NL", "Dr." }, new java.lang.String[] { "de_DE", "Dr." } }),
	Drs_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Drs." }, new java.lang.String[] { "nl_NL", "Drs." }, new java.lang.String[] { "de_DE", "Dipl." } }),
	Ing_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ing." }, new java.lang.String[] { "nl_NL", "Ing." }, new java.lang.String[] { "de_DE", "Ingenieur" } }),
	ir_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ir." }, new java.lang.String[] { "nl_NL", "Ir." }, new java.lang.String[] { "de_DE", "Ing." } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Titles(java.lang.String[][] captionStrings)
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
