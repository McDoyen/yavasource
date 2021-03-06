// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package servicecatalogue.proxies;

public enum LabelItemUsageEnum
{
	Linked_to_existing_shared_items(new java.lang.String[][] { new java.lang.String[] { "en_US", "Linked to existing shared items" }, new java.lang.String[] { "nl_NL", "Gerelateerd aan bestaande gedeelde items." }, new java.lang.String[] { "de_DE", "Verbunden mit vorhandenen geteilten Artikeln" } }),
	Copy_as_private_items(new java.lang.String[][] { new java.lang.String[] { "en_US", "Copy as private items" }, new java.lang.String[] { "nl_NL", "Kopiëren als privé-items" }, new java.lang.String[] { "de_DE", "Als privates Item kopieren" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private LabelItemUsageEnum(java.lang.String[][] captionStrings)
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
