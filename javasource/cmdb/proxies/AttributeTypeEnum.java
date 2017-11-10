// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cmdb.proxies;

public enum AttributeTypeEnum
{
	_Boolean(new java.lang.String[][] { new java.lang.String[] { "en_US", "Boolean" } }),
	DropDown(new java.lang.String[][] { new java.lang.String[] { "en_US", "Drop Down" } }),
	_Float(new java.lang.String[][] { new java.lang.String[] { "en_US", "Float" }, new java.lang.String[] { "nl_NL", "Float" } }),
	Integer(new java.lang.String[][] { new java.lang.String[] { "en_US", "Integer" }, new java.lang.String[] { "nl_NL", "Integer" } }),
	String(new java.lang.String[][] { new java.lang.String[] { "en_US", "String" } }),
	Radio(new java.lang.String[][] { new java.lang.String[] { "en_US", "Radio (deprecated)" } }),
	DateTime(new java.lang.String[][] { new java.lang.String[] { "en_US", "Date Time" }, new java.lang.String[] { "nl_NL", "Datum/Tijd" } }),
	Currency(new java.lang.String[][] { new java.lang.String[] { "en_US", "Currency" }, new java.lang.String[] { "nl_NL", "Valuta" } }),
	Date(new java.lang.String[][] { new java.lang.String[] { "en_US", "Date" }, new java.lang.String[] { "nl_NL", "Datum" } }),
	StringLong(new java.lang.String[][] { new java.lang.String[] { "en_US", "StringLong" } });

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
