// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public enum AnnouncementType
{
	State_letter(new java.lang.String[][] { new java.lang.String[] { "en_US", "State letter" } }),
	Official_Journal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Official Journal" } }),
	Staatsblad(new java.lang.String[][] { new java.lang.String[] { "en_US", "Staatsblad" } }),
	Notice_of_Proposed_Amendment(new java.lang.String[][] { new java.lang.String[] { "en_US", "Notice of Proposed Amendment" } }),
	Other(new java.lang.String[][] { new java.lang.String[] { "en_US", "Other" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private AnnouncementType(java.lang.String[][] captionStrings)
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
