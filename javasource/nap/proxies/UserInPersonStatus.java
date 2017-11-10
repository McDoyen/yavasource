// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nap.proxies;

public enum UserInPersonStatus
{
	None(new java.lang.String[][] { new java.lang.String[] { "en_US", "None" }, new java.lang.String[] { "nl_NL", "Geen" }, new java.lang.String[] { "de_DE", "Keine(r)" } }),
	BeingCreated(new java.lang.String[][] { new java.lang.String[] { "en_US", "Being Created" }, new java.lang.String[] { "nl_NL", "Wordt aangemaakt" }, new java.lang.String[] { "de_DE", "ImErstellungsprozess" } }),
	HasUser(new java.lang.String[][] { new java.lang.String[] { "en_US", "Has User" }, new java.lang.String[] { "nl_NL", "Heeft gebruiker" }, new java.lang.String[] { "de_DE", "Hat Nutzer" } }),
	BeingDeleted(new java.lang.String[][] { new java.lang.String[] { "en_US", "Being Deleted" }, new java.lang.String[] { "nl_NL", "Wordt verwijderd" }, new java.lang.String[] { "de_DE", "ImLöschprozess" } }),
	BeingLinked(new java.lang.String[][] { new java.lang.String[] { "en_US", "Being Linked" }, new java.lang.String[] { "nl_NL", "Relatie wordt aangelegd" }, new java.lang.String[] { "de_DE", "BeingLinked" } }),
	BeingUnlinked(new java.lang.String[][] { new java.lang.String[] { "en_US", "Being Unlinked" }, new java.lang.String[] { "nl_NL", "Relatie wordt verwijderd" }, new java.lang.String[] { "de_DE", "BeingUnlinked" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private UserInPersonStatus(java.lang.String[][] captionStrings)
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
