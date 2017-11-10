// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package nap.actions;

import java.util.List;
import system.proxies.Language;
import nap.proxies.Countries;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class MatchCountry extends CustomJavaAction<java.lang.String>
{
	private java.lang.String countryString;

	public MatchCountry(IContext context, java.lang.String countryString)
	{
		super(context);
		this.countryString = countryString;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		Core.getLogger("MatchCountry").trace("Start, looking for " + countryString + ".");
		if(countryString == null){
			Core.getLogger("MatchCountry").trace("No country given as input");
			return null;
		}
		Countries[] allCountries = Countries.values();
		List<IMendixObject> languages = Core.retrieveXPathQuery(this.getContext(), "//System.Language");
		if (languages==null || languages.size()==0) {
			Core.getLogger("MatchCountry").error("No languages in ExpertDesk to match against.");
			return null;
		}
		for(Countries countrie:allCountries) {
			Core.getLogger("MatchCountry").trace("Country " + countrie.toString());
			for(IMendixObject iLanguage:languages) {
				Language language = Language.initialize(this.getContext(), iLanguage);
				Core.getLogger("MatchCountry").trace("Language " + language.getDescription());
				String captionValue = countrie.getCaption(language.getCode());
				
				if (countryString.equals(captionValue)) {
					Core.getLogger("MatchCountry").trace("Found match in " + language.getDescription() + " for country " + countrie.toString());
					return countrie.name();
				}
			}
		}
		
		Core.getLogger("MatchCountry").error("Country string " + countryString + " not found.");
		return null;	
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "MatchCountry";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}