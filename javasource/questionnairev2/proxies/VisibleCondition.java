// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package questionnairev2.proxies;

public enum VisibleCondition
{
	Make_Visable(new java.lang.String[][] { new java.lang.String[] { "en_US", "Make Visible" }, new java.lang.String[] { "nl_NL", "Zichtbaar maken" } }),
	Hide(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hide" }, new java.lang.String[] { "nl_NL", "Verbergen" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private VisibleCondition(java.lang.String[][] captionStrings)
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
