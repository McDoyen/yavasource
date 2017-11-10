// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package interfaceshared.actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class ValidateDateString extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String DateString;
	private java.lang.String DateFormat;

	public ValidateDateString(IContext context, java.lang.String DateString, java.lang.String DateFormat)
	{
		super(context);
		this.DateString = DateString;
		this.DateFormat = DateFormat;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		try {
			new SimpleDateFormat(DateFormat).parse(DateString);
		}
        catch (ParseException e) {
        	return false;
        }
        return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ValidateDateString";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}