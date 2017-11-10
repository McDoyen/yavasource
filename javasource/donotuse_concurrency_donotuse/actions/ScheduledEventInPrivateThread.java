// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package donotuse_concurrency_donotuse.actions;

import java.util.Date;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Interval in milliseconds since the last start
 */
public class ScheduledEventInPrivateThread extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String MicroflowName;
	private java.lang.Long Interval;

	public ScheduledEventInPrivateThread(IContext context, java.lang.String MicroflowName, java.lang.Long Interval)
	{
		super(context);
		this.MicroflowName = MicroflowName;
		this.Interval = Interval;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		Thread thread = new Thread(new PrivateScheduledEventThread(MicroflowName, Interval));
		thread.setName(MicroflowName);
    	thread.setUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override 
                    public void uncaughtException(Thread t, Throwable e) {
                    	Core.getLogger("Concurrency").error("Uncaught thread-exception: " + MicroflowName+": "+e);
                    }
                });
		thread.start();
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ScheduledEventInPrivateThread";
	}

	// BEGIN EXTRA CODE
	private class PrivateScheduledEventThread implements Runnable {
		private String MicroflowName1;
		private Long Interval1;

		PrivateScheduledEventThread(String MicroflowName, Long Interval) {
			this.MicroflowName1 = MicroflowName;
			this.Interval1 = Interval;
		}
		
		public void run() {
			Core.getLogger("Concurrency").info("Start executing dynamic scheduled event microflow " + MicroflowName1);
	    	while (true) {
		    	Date start = new Date();
				try {
					Core.getLogger("Concurrency").trace("Running executing dynamic scheduled event microflow " + MicroflowName1);
					Core.execute(Core.createSystemContext(), MicroflowName);				
					Core.getLogger("Concurrency").trace("Finished executing dynamic scheduled event microflow " + MicroflowName1);
				} catch (Exception e) {
					Core.getLogger("Concurrency").error("Failed to execute dynamic scheduled event microflow " + MicroflowName1 + ".", e);
				}
				Date end = new Date();
				Long millis = end.getTime() - start.getTime();
				Core.getLogger("Concurrency").debug("Executed dynamic scheduled event microflow " + MicroflowName1 + " in " + millis + " ms.");
				Long sleep = Interval1 - millis;
				if (sleep<1000L) sleep = 1000L;
				try {
					Thread.sleep(sleep);
				} catch(InterruptedException e) {
					Core.getLogger("Concurrency").info("Stop executing dynamic scheduled event microflow " + MicroflowName1);
					break;
				}
	    	}
	    }
	}
	// END EXTRA CODE
}
