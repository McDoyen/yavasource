// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies;

public enum RelationTypes
{
	Has_impact_on(new java.lang.String[][] { new java.lang.String[] { "en_US", "Has Impact On" }, new java.lang.String[] { "nl_NL", "Heeft impact op" }, new java.lang.String[] { "de_DE", "Hat Auswirkung auf" } }),
	Related_to(new java.lang.String[][] { new java.lang.String[] { "en_US", "Related to" }, new java.lang.String[] { "nl_NL", "Gerelateerd aan" }, new java.lang.String[] { "de_DE", "Verbunden mit " } }),
	Caused_by(new java.lang.String[][] { new java.lang.String[] { "en_US", "Caused by" }, new java.lang.String[] { "nl_NL", "Veroorzaakt door" }, new java.lang.String[] { "de_DE", "Verursacht durch" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private RelationTypes(java.lang.String[][] captionStrings)
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
