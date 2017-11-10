// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package changecalendar.proxies;

public enum ChangeCalendarColorCode
{
	Color01(new java.lang.String[][] { new java.lang.String[] { "en_US", "Blue" }, new java.lang.String[] { "nl_NL", "Blauw" } }),
	Color02(new java.lang.String[][] { new java.lang.String[] { "en_US", "Orange" }, new java.lang.String[] { "nl_NL", "Oranje" } }),
	Color03(new java.lang.String[][] { new java.lang.String[] { "en_US", "Green" }, new java.lang.String[] { "nl_NL", "Groen" } }),
	Color04(new java.lang.String[][] { new java.lang.String[] { "en_US", "Red" }, new java.lang.String[] { "nl_NL", "Rood" } }),
	Color05(new java.lang.String[][] { new java.lang.String[] { "en_US", "Grey" }, new java.lang.String[] { "nl_NL", "Grijs" } }),
	Color06(new java.lang.String[][] { new java.lang.String[] { "en_US", "Purple" }, new java.lang.String[] { "nl_NL", "Paars" } }),
	Color07(new java.lang.String[][] { new java.lang.String[] { "en_US", "Brown" }, new java.lang.String[] { "nl_NL", "Bruin" } }),
	Color08(new java.lang.String[][] { new java.lang.String[] { "en_US", "Yellow" }, new java.lang.String[] { "nl_NL", "Geel" } }),
	Color09(new java.lang.String[][] { new java.lang.String[] { "en_US", "Color09" } }),
	Color10(new java.lang.String[][] { new java.lang.String[] { "en_US", "Color10" } }),
	Color11(new java.lang.String[][] { new java.lang.String[] { "en_US", "Color11" } }),
	Color12(new java.lang.String[][] { new java.lang.String[] { "en_US", "Color12" } }),
	Color13(new java.lang.String[][] { new java.lang.String[] { "en_US", "Color13" } }),
	Color14(new java.lang.String[][] { new java.lang.String[] { "en_US", "Color14" } }),
	Color15(new java.lang.String[][] { new java.lang.String[] { "en_US", "Color15" } }),
	Color16(new java.lang.String[][] { new java.lang.String[] { "en_US", "Color16" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ChangeCalendarColorCode(java.lang.String[][] captionStrings)
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