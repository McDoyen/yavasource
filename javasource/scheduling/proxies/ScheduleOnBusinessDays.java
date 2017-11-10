// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package scheduling.proxies;

public enum ScheduleOnBusinessDays
{
	Allow(new java.lang.String[][] { new java.lang.String[] { "en_US", "Allow" }, new java.lang.String[] { "nl_NL", "Toestaan" }, new java.lang.String[] { "de_DE", "Genehmigen" } }),
	Skip(new java.lang.String[][] { new java.lang.String[] { "en_US", "Skip" }, new java.lang.String[] { "nl_NL", "Overslaan" }, new java.lang.String[] { "de_DE", "Überspringen" } }),
	NextBusinessDay(new java.lang.String[][] { new java.lang.String[] { "en_US", "Next Business Day" }, new java.lang.String[] { "nl_NL", "Volgende werkdag" }, new java.lang.String[] { "de_DE", "FolgenderGeschäftstag" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ScheduleOnBusinessDays(java.lang.String[][] captionStrings)
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
