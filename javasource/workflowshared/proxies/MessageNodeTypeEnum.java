// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowshared.proxies;

public enum MessageNodeTypeEnum
{
	Email(new java.lang.String[][] { new java.lang.String[] { "en_US", "Email" }, new java.lang.String[] { "nl_NL", "E-mail" }, new java.lang.String[] { "de_DE", "E-Mail " } }),
	InterfaceMessage(new java.lang.String[][] { new java.lang.String[] { "en_US", "Interface Message" }, new java.lang.String[] { "nl_NL", "Interfacebericht" }, new java.lang.String[] { "de_DE", "Interface Nachricht" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private MessageNodeTypeEnum(java.lang.String[][] captionStrings)
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
