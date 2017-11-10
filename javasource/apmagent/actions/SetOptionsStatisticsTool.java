// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import nl.mansystems.statisticstool.StatisticsToolLogSubscriber;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Also reloads MicroflowInfo
 */
public class SetOptionsStatisticsTool extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.Long MaxLagDuration;
	private java.lang.Long FixedDuration;

	public SetOptionsStatisticsTool(IContext context, java.lang.Long MaxLagDuration, java.lang.Long FixedDuration)
	{
		super(context);
		this.MaxLagDuration = MaxLagDuration;
		this.FixedDuration = FixedDuration;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		StatisticsToolLogSubscriber.setOptions(FixedDuration, MaxLagDuration);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SetOptionsStatisticsTool";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}