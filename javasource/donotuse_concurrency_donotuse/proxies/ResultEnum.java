// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package donotuse_concurrency_donotuse.proxies;

public enum ResultEnum
{
	Executed_And_Rollback(new java.lang.String[][] { new java.lang.String[] { "en_US", "Executed And Rollback" }, new java.lang.String[] { "nl_NL", "Uitgevoerd en rollback" } }),
	Executed_Lock_Object(new java.lang.String[][] { new java.lang.String[] { "en_US", "Executed Lock Object" }, new java.lang.String[] { "nl_NL", "Slotobject uitgevoerd" } }),
	Other_Executed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Other Executed" }, new java.lang.String[] { "nl_NL", "Ander heeft uitgevoerd" } }),
	Other_Executed_Before_Start(new java.lang.String[][] { new java.lang.String[] { "en_US", "Other Executed Before Start" }, new java.lang.String[] { "nl_NL", "Ander heeft uitgevoerd voordat gestart" } }),
	Out_Of_Sequence(new java.lang.String[][] { new java.lang.String[] { "en_US", "Out Of Sequence" }, new java.lang.String[] { "nl_NL", "Uit volgorde" } }),
	Start(new java.lang.String[][] { new java.lang.String[] { "en_US", "Start" }, new java.lang.String[] { "nl_NL", "Start" } }),
	Timeout(new java.lang.String[][] { new java.lang.String[] { "en_US", "Timeout" }, new java.lang.String[] { "nl_NL", "Timeout" } }),
	Protection_Clears_Lock(new java.lang.String[][] { new java.lang.String[] { "en_US", "Protection Clears Lock" }, new java.lang.String[] { "nl_NL", "Bescherming geeft slot vrij" } }),
	Unlock_Without_Server_Lock(new java.lang.String[][] { new java.lang.String[] { "en_US", "Unlock Without Server Lock" }, new java.lang.String[] { "nl_NL", "Slot vrijgeven zonder serverslot" } }),
	Startup_Server(new java.lang.String[][] { new java.lang.String[] { "en_US", "Startup Server" }, new java.lang.String[] { "nl_NL", "Opstarten server" } }),
	Shutdown_Server(new java.lang.String[][] { new java.lang.String[] { "en_US", "Shutdown Server" }, new java.lang.String[] { "nl_NL", "Stoppen server" } }),
	Simulated_Crash(new java.lang.String[][] { new java.lang.String[] { "en_US", "Simulated Crash" }, new java.lang.String[] { "nl_NL", "Gesimuleerde crash" } }),
	Simulated_Hang(new java.lang.String[][] { new java.lang.String[] { "en_US", "Simulated Hang" }, new java.lang.String[] { "nl_NL", "Gesimuleerd hangen" } }),
	Continue_After_Hang(new java.lang.String[][] { new java.lang.String[] { "en_US", "Continue After Hang" }, new java.lang.String[] { "nl_NL", "Verder na hangen" } }),
	Continue_After_Crash(new java.lang.String[][] { new java.lang.String[] { "en_US", "Continue After Crash" }, new java.lang.String[] { "nl_NL", "Verder na crash" } }),
	History_On(new java.lang.String[][] { new java.lang.String[] { "en_US", "History On" }, new java.lang.String[] { "nl_NL", "Geschiedenis aan" } }),
	History_Off(new java.lang.String[][] { new java.lang.String[] { "en_US", "History Off" }, new java.lang.String[] { "nl_NL", "Geschiedenis uit" } }),
	History_Truncated(new java.lang.String[][] { new java.lang.String[] { "en_US", "History Truncated" }, new java.lang.String[] { "nl_NL", "Geschiedenis gewist" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ResultEnum(java.lang.String[][] captionStrings)
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
