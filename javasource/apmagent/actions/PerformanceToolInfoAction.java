// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import java.util.ArrayList;
import java.util.List;
import nl.mansystems.performancetool.PerformanceToolLogSubscriber;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class PerformanceToolInfoAction extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String MessageString;
	private java.lang.String InfoString;
	private IMendixObject MendixObject1;
	private IMendixObject MendixObject2;
	private IMendixObject MendixObject3;

	public PerformanceToolInfoAction(IContext context, java.lang.String MessageString, java.lang.String InfoString, IMendixObject MendixObject1, IMendixObject MendixObject2, IMendixObject MendixObject3)
	{
		super(context);
		this.MessageString = MessageString;
		this.InfoString = InfoString;
		this.MendixObject1 = MendixObject1;
		this.MendixObject2 = MendixObject2;
		this.MendixObject3 = MendixObject3;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
    	List<IMendixObject> objectList = new ArrayList<IMendixObject>();
    	if (MendixObject1!=null) objectList.add(MendixObject1);
    	if (MendixObject2!=null) objectList.add(MendixObject2);
    	if (MendixObject3!=null) objectList.add(MendixObject3);
		PerformanceToolLogSubscriber.logActionInfo(this.getContext().getExecutionId(), InfoString, MessageString, objectList);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "PerformanceToolInfoAction";
	}

	// BEGIN EXTRA CODE

	// END EXTRA CODE
}
