// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailplus.proxies;

public enum IncomingLock
{
	Available(new java.lang.String[][] { new java.lang.String[] { "en_US", "Available" }, new java.lang.String[] { "nl_NL", "Beschikbaar" }, new java.lang.String[] { "de_DE", "Verfügbar" } }),
	Locked(new java.lang.String[][] { new java.lang.String[] { "en_US", "Locked" }, new java.lang.String[] { "nl_NL", "Vergrendeld" }, new java.lang.String[] { "de_DE", "Gesperrt" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private IncomingLock(java.lang.String[][] captionStrings)
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
