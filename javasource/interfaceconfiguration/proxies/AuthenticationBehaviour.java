// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceconfiguration.proxies;

public enum AuthenticationBehaviour
{
	Allow_Local_Authentication_For_All_Users(new java.lang.String[][] { new java.lang.String[] { "en_US", "Allow Local Authentication For All Users" }, new java.lang.String[] { "nl_NL", "Sta lokale authenticatie toe voor alle gebruikers" } }),
	Allow_Local_Authentication_For_Selected_Roles(new java.lang.String[][] { new java.lang.String[] { "en_US", "Allow Local Authentication For Selected Roles" }, new java.lang.String[] { "nl_NL", "Sta lokale authenticatie toe voor geselecteerde rollen" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private AuthenticationBehaviour(java.lang.String[][] captionStrings)
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
