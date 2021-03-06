// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package queryrequests.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class CountRequestsByXpath extends CustomJavaAction<java.lang.Long>
{
	private java.lang.String XpathQuery;

	public CountRequestsByXpath(IContext context, java.lang.String XpathQuery)
	{
		super(context);
		this.XpathQuery = XpathQuery;
	}

	@Override
	public java.lang.Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		String countQuery = "COUNT("+XpathQuery+")";
		return Core.retrieveXPathQueryAggregate(this.getContext(), countQuery);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "CountRequestsByXpath";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
