// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import nl.mansystems.logtool.LogToolLogSubscriber;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Also reloads Exclusions
 */
public class SetOptionsLogTool extends CustomJavaAction<java.lang.Boolean>
{
	private apmagent.proxies.Level DefaultLevel;
	private apmagent.proxies.Level FallBackLevel;
	private java.lang.Long FixedDuration;
	private java.lang.Long MaxMessagesToStore;
	private java.lang.Boolean OnMaxMessagesStopTrueOrCleanupFalse;
	private java.lang.Long MaxLagDuration;
	private java.lang.Boolean StopOnMaxLag;

	public SetOptionsLogTool(IContext context, java.lang.String DefaultLevel, java.lang.String FallBackLevel, java.lang.Long FixedDuration, java.lang.Long MaxMessagesToStore, java.lang.Boolean OnMaxMessagesStopTrueOrCleanupFalse, java.lang.Long MaxLagDuration, java.lang.Boolean StopOnMaxLag)
	{
		super(context);
		this.DefaultLevel = DefaultLevel == null ? null : apmagent.proxies.Level.valueOf(DefaultLevel);
		this.FallBackLevel = FallBackLevel == null ? null : apmagent.proxies.Level.valueOf(FallBackLevel);
		this.FixedDuration = FixedDuration;
		this.MaxMessagesToStore = MaxMessagesToStore;
		this.OnMaxMessagesStopTrueOrCleanupFalse = OnMaxMessagesStopTrueOrCleanupFalse;
		this.MaxLagDuration = MaxLagDuration;
		this.StopOnMaxLag = StopOnMaxLag;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		LogToolLogSubscriber.setOptions(DefaultLevel, FallBackLevel, StopOnMaxLag, MaxMessagesToStore, OnMaxMessagesStopTrueOrCleanupFalse, FixedDuration, MaxLagDuration);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SetOptionsLogTool";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
