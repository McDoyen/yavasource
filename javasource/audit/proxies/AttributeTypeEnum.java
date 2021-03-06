// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audit.proxies;

public enum AttributeTypeEnum
{
	String(new java.lang.String[][] { new java.lang.String[] { "en_US", "String" }, new java.lang.String[] { "de_DE", "String  " }, new java.lang.String[] { "nl_NL", "String" } }),
	Integer(new java.lang.String[][] { new java.lang.String[] { "en_US", "Integer" }, new java.lang.String[] { "de_DE", "Integer" }, new java.lang.String[] { "nl_NL", "Integer" } }),
	DateTime(new java.lang.String[][] { new java.lang.String[] { "en_US", "Date Time" }, new java.lang.String[] { "de_DE", "Datum / Zeit" }, new java.lang.String[] { "nl_NL", "Datum/Tijd" } }),
	_Boolean(new java.lang.String[][] { new java.lang.String[] { "en_US", "Boolean" }, new java.lang.String[] { "de_DE", "Boole'scher" }, new java.lang.String[] { "nl_NL", "Boolean" } }),
	_Float(new java.lang.String[][] { new java.lang.String[] { "en_US", "Float" }, new java.lang.String[] { "de_DE", "Float" }, new java.lang.String[] { "nl_NL", "Float" } }),
	Currency(new java.lang.String[][] { new java.lang.String[] { "en_US", "Currency" }, new java.lang.String[] { "de_DE", "Währung" }, new java.lang.String[] { "nl_NL", "Munteenheid" } }),
	_Enum(new java.lang.String[][] { new java.lang.String[] { "en_US", "Enum" }, new java.lang.String[] { "de_DE", "Aufzählung" }, new java.lang.String[] { "nl_NL", "Enum" } }),
	HashString(new java.lang.String[][] { new java.lang.String[] { "en_US", "Hash String" }, new java.lang.String[] { "de_DE", "HashString" }, new java.lang.String[] { "nl_NL", "Hash String" } }),
	AutoNumber(new java.lang.String[][] { new java.lang.String[] { "en_US", "AutoNumber" }, new java.lang.String[] { "de_DE", "AutoNummer" }, new java.lang.String[] { "nl_NL", "AutoNummer" } }),
	_Long(new java.lang.String[][] { new java.lang.String[] { "en_US", "Long" }, new java.lang.String[] { "de_DE", "Lange" }, new java.lang.String[] { "nl_NL", "Lang" } }),
	Binary(new java.lang.String[][] { new java.lang.String[] { "en_US", "Binary" }, new java.lang.String[] { "de_DE", "Binär" }, new java.lang.String[] { "nl_NL", "Binair" } }),
	Decimal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Decimal" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private AttributeTypeEnum(java.lang.String[][] captionStrings)
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
