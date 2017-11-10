// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class SetJMXStringValue extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String JMXName;
	private java.lang.String JMXValue;

	public SetJMXStringValue(IContext context, java.lang.String JMXName, java.lang.String JMXValue)
	{
		super(context);
		this.JMXName = JMXName;
		this.JMXValue = JMXValue;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
	    nl.mansystems.jmx.MansystemsDynamic.setStringValue(JMXName,JMXValue);
	    return true;		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SetJMXStringValue";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
