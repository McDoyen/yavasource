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

public class ProcessTrappedMessagesInPerformanceTool extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String LicenseParameter;
	private java.util.List<IMendixObject> __TrapMessageList;
	private java.util.List<apmagent.proxies.TrapMessage> TrapMessageList;

	public ProcessTrappedMessagesInPerformanceTool(IContext context, java.lang.String LicenseParameter, java.util.List<IMendixObject> TrapMessageList)
	{
		super(context);
		this.LicenseParameter = LicenseParameter;
		this.__TrapMessageList = TrapMessageList;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.TrapMessageList = new java.util.ArrayList<apmagent.proxies.TrapMessage>();
		if (__TrapMessageList != null)
			for (IMendixObject __TrapMessageListElement : __TrapMessageList)
				this.TrapMessageList.add(apmagent.proxies.TrapMessage.initialize(getContext(), __TrapMessageListElement));

		// BEGIN USER CODE
		return nl.mansystems.performancetool.PerformanceToolLogSubscriber.processTrapMessages(LicenseParameter, TrapMessageList);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ProcessTrappedMessagesInPerformanceTool";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
