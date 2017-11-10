// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import nl.mansystems.traptool.TrapToolLogSubscriber;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Also reloads Exclusions
 */
public class SetOptionsTrapTool extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.Boolean TrapOnWarnings;
	private java.lang.Long QueuesParameter;
	private java.lang.Long QueueSwitchAfterDuration;
	private java.lang.Long QueueSwitchAfterRecords;
	private java.lang.Long MaxMessagesToStore;
	private java.lang.Boolean OnMaxMessagesStopTrueOrCleanupFalse;
	private java.lang.Long MaxLagDuration;
	private java.lang.Long FixedDuration;

	public SetOptionsTrapTool(IContext context, java.lang.Boolean TrapOnWarnings, java.lang.Long QueuesParameter, java.lang.Long QueueSwitchAfterDuration, java.lang.Long QueueSwitchAfterRecords, java.lang.Long MaxMessagesToStore, java.lang.Boolean OnMaxMessagesStopTrueOrCleanupFalse, java.lang.Long MaxLagDuration, java.lang.Long FixedDuration)
	{
		super(context);
		this.TrapOnWarnings = TrapOnWarnings;
		this.QueuesParameter = QueuesParameter;
		this.QueueSwitchAfterDuration = QueueSwitchAfterDuration;
		this.QueueSwitchAfterRecords = QueueSwitchAfterRecords;
		this.MaxMessagesToStore = MaxMessagesToStore;
		this.OnMaxMessagesStopTrueOrCleanupFalse = OnMaxMessagesStopTrueOrCleanupFalse;
		this.MaxLagDuration = MaxLagDuration;
		this.FixedDuration = FixedDuration;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		TrapToolLogSubscriber.setOptions(QueuesParameter, QueueSwitchAfterDuration, QueueSwitchAfterRecords, TrapOnWarnings, MaxMessagesToStore, OnMaxMessagesStopTrueOrCleanupFalse, FixedDuration, MaxLagDuration);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SetOptionsTrapTool";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
