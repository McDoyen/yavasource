// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mendix.actions;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class HTMLToText extends CustomJavaAction<java.lang.String>
{
	private java.lang.String HTMLString;

	public HTMLToText(IContext context, java.lang.String HTMLString)
	{
		super(context);
		this.HTMLString = HTMLString;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		Document doc = Jsoup.parse(HTMLString);
		Elements elements = new Elements();
		Elements brElements = doc.getElementsByTag("br");
		Elements pElements = doc.getElementsByTag("p");
		elements.addAll(brElements);
		elements.addAll(pElements);
		for(Element element:elements) {
			element.appendText("#NEWLINE#");
		}
		String plainText = doc.text();
		return plainText.replaceAll("#NEWLINE#", "\n");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "HTMLToText";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
