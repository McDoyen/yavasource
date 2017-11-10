// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared_fileimport.proxies;

public enum RunMappingType
{
	Minute_s_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Minute(s)" }, new java.lang.String[] { "nl_NL", "Minu(u)te(n)" }, new java.lang.String[] { "de_DE", "Minute(n)" } }),
	Hour_s_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hour(s)" }, new java.lang.String[] { "nl_NL", "U(u)r(en)" }, new java.lang.String[] { "de_DE", "Stunde(n)" } }),
	Day_s_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Day(s)" }, new java.lang.String[] { "nl_NL", "Dag(en)" }, new java.lang.String[] { "de_DE", "Tag(e)" } }),
	Week_s_(new java.lang.String[][] { new java.lang.String[] { "en_US", "Week(s)" }, new java.lang.String[] { "nl_NL", "We(e)k(en)" }, new java.lang.String[] { "de_DE", "Woche(n)" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private RunMappingType(java.lang.String[][] captionStrings)
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
