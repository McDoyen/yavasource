// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package donotuse_concurrency_donotuse.proxies;

public enum SimulationTypeEnum
{
	Server_Crash(new java.lang.String[][] { new java.lang.String[] { "en_US", "Server Crash" }, new java.lang.String[] { "nl_NL", "Server crasht" } }),
	Server_Hang_Short(new java.lang.String[][] { new java.lang.String[] { "en_US", "Server Hang Short" }, new java.lang.String[] { "nl_NL", "Server hangt kort" } }),
	Server_Hang_Medium(new java.lang.String[][] { new java.lang.String[] { "en_US", "Server Hang Medium" }, new java.lang.String[] { "nl_NL", "Server hangt gemiddeld" } }),
	Server_Hang_Long(new java.lang.String[][] { new java.lang.String[] { "en_US", "Server Hang Long" }, new java.lang.String[] { "nl_NL", "Server hangt lang" } }),
	Lock_Object_Crash(new java.lang.String[][] { new java.lang.String[] { "en_US", "Lock Object Crash" }, new java.lang.String[] { "nl_NL", "Slotobject crasht" } }),
	Lock_Object_Hang_Short(new java.lang.String[][] { new java.lang.String[] { "en_US", "Lock Object Hang Short" }, new java.lang.String[] { "nl_NL", "Slotobject hangt kort" } }),
	Lock_Object_Hang_Medium(new java.lang.String[][] { new java.lang.String[] { "en_US", "Lock Object Hang Medium" }, new java.lang.String[] { "nl_NL", "Slotobject hangt gemiddeld" } }),
	Lock_Object_Hang_Long(new java.lang.String[][] { new java.lang.String[] { "en_US", "Lock Object Hang Long" }, new java.lang.String[] { "nl_NL", "Slotobject hangt lang" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private SimulationTypeEnum(java.lang.String[][] captionStrings)
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
