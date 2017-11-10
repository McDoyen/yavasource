// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package donotuse_concurrency_donotuse.actions;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class SetThreadNumber extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __ThreadParameter1;
	private donotuse_concurrency_donotuse.proxies.Thread ThreadParameter1;
	private java.lang.Long Number;

	public SetThreadNumber(IContext context, IMendixObject ThreadParameter1, java.lang.Long Number)
	{
		super(context);
		this.__ThreadParameter1 = ThreadParameter1;
		this.Number = Number;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.ThreadParameter1 = __ThreadParameter1 == null ? null : donotuse_concurrency_donotuse.proxies.Thread.initialize(getContext(), __ThreadParameter1);

		// BEGIN USER CODE
		try {
		    IContext newContext = this.getContext().getSession().createContext(); 
			newContext.startTransaction();    
			ThreadParameter1.setNumber(newContext,(Number!= null ? Number.intValue() : null));
			Core.commit(newContext, __ThreadParameter1);
			newContext.endTransaction();
		} catch (CoreException e) {
			Core.getLogger("ExpertDesk").error("Conccurency set number in database failed: " + e.getMessage());
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
		return "SetThreadNumber";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}