// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package reporting.proxies;

public enum MultiSeriesCharts
{
	Heatmap(new java.lang.String[][] { new java.lang.String[] { "en_US", "Heat map" }, new java.lang.String[] { "nl_NL", "Hittematrix" } }),
	Marimekko(new java.lang.String[][] { new java.lang.String[] { "en_US", "Marimekko" }, new java.lang.String[] { "nl_NL", "Marimekko" } }),
	MSBar2D(new java.lang.String[][] { new java.lang.String[] { "en_US", "MS Bar 2D (Column & Bar)" }, new java.lang.String[] { "de_DE", "MS Bar 2D (Zeilen & Balken)" }, new java.lang.String[] { "nl_NL", "MS Bar 2D (Column & Bar)" } }),
	MSColumn2D(new java.lang.String[][] { new java.lang.String[] { "en_US", "MS Column 2D (Column & Bar)" }, new java.lang.String[] { "de_DE", "MS Column 2D  (Zeile & Balken)" }, new java.lang.String[] { "nl_NL", "MS Column 2D  (Column & Bar)" } }),
	MSColumn3D(new java.lang.String[][] { new java.lang.String[] { "en_US", "MS Column 3D (Column & Bar)" }, new java.lang.String[] { "de_DE", "MS Column 3D  (Zeile & Balken)" }, new java.lang.String[] { "nl_NL", "MS Column 3D  (Column & Bar)" } }),
	MSCombi2D(new java.lang.String[][] { new java.lang.String[] { "en_US", "MS Combi 2D (Column & Bar)" }, new java.lang.String[] { "nl_NL", "MS Combi 2D (Column & Bar)" }, new java.lang.String[] { "de_DE", "MS Combi 2D (Zeilen & Balken)" } }),
	MSCombi3D(new java.lang.String[][] { new java.lang.String[] { "en_US", "MS Combi 3D (Column & Bar)" }, new java.lang.String[] { "nl_NL", "MS Combi (Lijn grafiek)" }, new java.lang.String[] { "de_DE", "MS Combi 3D  (Zeilen & Balken)" } }),
	MSLine(new java.lang.String[][] { new java.lang.String[] { "en_US", "MS Line ( Line Chart)" }, new java.lang.String[] { "de_DE", "MS Line ( Line Chart)" }, new java.lang.String[] { "nl_NL", "MS Line ( Line Chart)" } }),
	Radar(new java.lang.String[][] { new java.lang.String[] { "en_US", "Radar" }, new java.lang.String[] { "nl_NL", "Radar" }, new java.lang.String[] { "de_DE", "Radar" } }),
	StackedArea2D(new java.lang.String[][] { new java.lang.String[] { "en_US", "Stacked Area 2D (Stacked Chart)" }, new java.lang.String[] { "de_DE", "Stacked Area 2D (Stacked Chart)" }, new java.lang.String[] { "nl_NL", "Stacked Area 2D (Stacked Chart)" } }),
	StackedBar2D(new java.lang.String[][] { new java.lang.String[] { "en_US", "Stacked Bar 2D (Stacked Chart)" }, new java.lang.String[] { "de_DE", "Stacked Bar 2D (Stacked Chart)" }, new java.lang.String[] { "nl_NL", "Stacked Bar 2D (Stacked Chart)" } }),
	StackedColumn2D(new java.lang.String[][] { new java.lang.String[] { "en_US", "Stacked Column 2D (Stacked Chart)" }, new java.lang.String[] { "de_DE", "Stacked Column 2D (Stacked Chart)" }, new java.lang.String[] { "nl_NL", "Stacked Column 2D (Stacked Chart)" } }),
	StackedColumn3D(new java.lang.String[][] { new java.lang.String[] { "en_US", "Stacked Column 3D (Stacked Chart)" }, new java.lang.String[] { "de_DE", "Stacked Column 3D (Stacked Chart)" }, new java.lang.String[] { "nl_NL", "Stacked Column 3D (Stacked Chart)" } }),
	Zoomline(new java.lang.String[][] { new java.lang.String[] { "en_US", "Zoomline" }, new java.lang.String[] { "nl_NL", "Inzoomlijn" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private MultiSeriesCharts(java.lang.String[][] captionStrings)
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
