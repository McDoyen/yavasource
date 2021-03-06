// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package advancedsearch.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class IndexInterfaceMessageList extends CustomJavaAction<java.lang.Boolean>
{
	private java.util.List<IMendixObject> __MessageList;
	private java.util.List<interfaceshared.proxies.IndexData> MessageList;

	public IndexInterfaceMessageList(IContext context, java.util.List<IMendixObject> MessageList)
	{
		super(context);
		this.__MessageList = MessageList;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.MessageList = new java.util.ArrayList<interfaceshared.proxies.IndexData>();
		if (__MessageList != null)
			for (IMendixObject __MessageListElement : __MessageList)
				this.MessageList.add(interfaceshared.proxies.IndexData.initialize(getContext(), __MessageListElement));

		// BEGIN USER CODE
		return nl.mansystems.advancedsearch.IndexInterfaceMessage.indexInterfaceMessageList(this.getContext(), this, MessageList);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "IndexInterfaceMessageList";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
