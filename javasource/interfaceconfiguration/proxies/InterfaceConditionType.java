// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceconfiguration.proxies;

public enum InterfaceConditionType
{
	Message_Direction(new java.lang.String[][] { new java.lang.String[] { "en_US", "Message Direction" }, new java.lang.String[] { "nl_NL", "Bericht richting" } }),
	Message_Type(new java.lang.String[][] { new java.lang.String[] { "en_US", "Message Type" }, new java.lang.String[] { "nl_NL", "Bericht type" } }),
	Message_Status(new java.lang.String[][] { new java.lang.String[] { "en_US", "Message Status" }, new java.lang.String[] { "nl_NL", "Bericht status" } }),
	_Interface(new java.lang.String[][] { new java.lang.String[] { "en_US", "Interface" }, new java.lang.String[] { "nl_NL", "Interface" } }),
	Interface_Message(new java.lang.String[][] { new java.lang.String[] { "en_US", "Interface Message" }, new java.lang.String[] { "nl_NL", "Interface bericht" } }),
	Send_Fault_Filter(new java.lang.String[][] { new java.lang.String[] { "en_US", "Send Fault Filter" }, new java.lang.String[] { "nl_NL", "Zend fout filter" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private InterfaceConditionType(java.lang.String[][] captionStrings)
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