// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public enum Validation_ColumnMapping
{
	Valid(new java.lang.String[][] { new java.lang.String[] { "en_US", "Valid" }, new java.lang.String[] { "nl_NL", "Geldig" }, new java.lang.String[] { "en_GB", "Valid" }, new java.lang.String[] { "en_ZA", "Valid" } }),
	NoTableSelected(new java.lang.String[][] { new java.lang.String[] { "en_US", "NoTableSelected" }, new java.lang.String[] { "nl_NL", "NoTableSelected" }, new java.lang.String[] { "en_GB", "NoTableSelected" }, new java.lang.String[] { "en_ZA", "NoTableSelected" } }),
	NoAttributeSelected(new java.lang.String[][] { new java.lang.String[] { "en_US", "NoAttributeSelected" }, new java.lang.String[] { "nl_NL", "NoAttributeSelected" }, new java.lang.String[] { "en_GB", "NoAttributeSelected" }, new java.lang.String[] { "en_ZA", "NoAttributeSelected" } }),
	NoMicroflowSelected(new java.lang.String[][] { new java.lang.String[] { "en_US", "NoMicroflowSelected" }, new java.lang.String[] { "nl_NL", "NoMicroflowSelected" }, new java.lang.String[] { "en_GB", "NoMicroflowSelected" }, new java.lang.String[] { "en_ZA", "NoMicroflowSelected" } }),
	NoColumnSelected(new java.lang.String[][] { new java.lang.String[] { "en_US", "NoColumnSelected" }, new java.lang.String[] { "nl_NL", "NoColumnSelected" }, new java.lang.String[] { "en_GB", "NoColumnSelected" }, new java.lang.String[] { "en_ZA", "NoColumnSelected" } }),
	NoCustomSelectStatement(new java.lang.String[][] { new java.lang.String[] { "en_US", "NoCustomSelectStatement" }, new java.lang.String[] { "nl_NL", "NoCustomSelectStatement" }, new java.lang.String[] { "en_GB", "NoCustomSelectStatement" }, new java.lang.String[] { "en_ZA", "NoCustomSelectStatement" } }),
	NoReferenceSelected(new java.lang.String[][] { new java.lang.String[] { "en_US", "NoReferenceSelected" }, new java.lang.String[] { "nl_NL", "NoReferenceSelected" }, new java.lang.String[] { "en_GB", "NoReferenceSelected" }, new java.lang.String[] { "en_ZA", "NoReferenceSelected" } }),
	NoObjectTypeSelected(new java.lang.String[][] { new java.lang.String[] { "en_US", "NoObjectTypeSelected" }, new java.lang.String[] { "nl_NL", "NoObjectTypeSelected" }, new java.lang.String[] { "en_GB", "NoObjectTypeSelected" }, new java.lang.String[] { "en_ZA", "NoObjectTypeSelected" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Validation_ColumnMapping(java.lang.String[][] captionStrings)
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
