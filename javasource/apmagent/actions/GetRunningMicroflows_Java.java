// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class GetRunningMicroflows_Java extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String ExcludeMicroflows;

	public GetRunningMicroflows_Java(IContext context, java.lang.String ExcludeMicroflows)
	{
		super(context);
		this.ExcludeMicroflows = ExcludeMicroflows;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		return nl.mansystems.statisticstool.StatisticsToolLogSubscriber.getRunningMicroflows(ExcludeMicroflows);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetRunningMicroflows_Java";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}