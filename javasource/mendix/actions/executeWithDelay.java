// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mendix.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

/**
 * Java action to execute a microflow after a specified delay.
 * 
 * !!WARNING!! Should only be used in seperate thread (ie by using Asynchronous execution) to avoid main thread being delayed.
 * 
 * Parameters:
 * 
 * *microflowName: Microflow to execute
 * contextObject: Object to pass to microflow
 * *delay: Time to wait before executing the microflow
 */
public class executeWithDelay extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String microflowName;
	private IMendixObject contextObject;
	private java.lang.Long delay;

	public executeWithDelay(IContext context, java.lang.String microflowName, IMendixObject contextObject, java.lang.Long delay)
	{
		super(context);
		this.microflowName = microflowName;
		this.contextObject = contextObject;
		this.delay = delay;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		boolean result = true;		
		
		if (delay == null || delay == 0)
			delay = 2500l;
		
		try {
			Thread.sleep(delay);			
			Core.execute(getContext(), microflowName, contextObject);
		} catch (InterruptedException ie) {
			throw new RuntimeException("Thread exception: "+ microflowName + ": " + ie.getMessage(), ie); 
		} catch (Exception e) {
			return false;
		}
		
		return result;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "executeWithDelay";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}