// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package changecalendar.proxies;

public enum ChangeCalendarView
{
	AllDay(new java.lang.String[][] { new java.lang.String[] { "en_US", "All day" }, new java.lang.String[] { "nl_NL", "Gehele dag" } }),
	Night(new java.lang.String[][] { new java.lang.String[] { "en_US", "Night" }, new java.lang.String[] { "nl_NL", "Nacht" } }),
	Weights(new java.lang.String[][] { new java.lang.String[] { "en_US", "Weights" }, new java.lang.String[] { "nl_NL", "Gewichten" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ChangeCalendarView(java.lang.String[][] captionStrings)
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
