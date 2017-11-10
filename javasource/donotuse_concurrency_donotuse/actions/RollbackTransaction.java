// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package donotuse_concurrency_donotuse.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class RollbackTransaction extends CustomJavaAction<java.lang.Boolean>
{
	public RollbackTransaction(IContext context)
	{
		super(context);
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		this.getContext().rollbackTransAction();
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "RollbackTransaction";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}