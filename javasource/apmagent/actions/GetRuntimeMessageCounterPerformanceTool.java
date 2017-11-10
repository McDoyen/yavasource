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

public class GetRuntimeMessageCounterPerformanceTool extends CustomJavaAction<java.lang.Long>
{
	public GetRuntimeMessageCounterPerformanceTool(IContext context)
	{
		super(context);
	}

	@Override
	public java.lang.Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		return nl.mansystems.performancetool.PerformanceToolLogSubscriber.getRuntimeMessageCounter();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetRuntimeMessageCounterPerformanceTool";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
