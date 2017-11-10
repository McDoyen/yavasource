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

public class IndexCIList extends CustomJavaAction<java.lang.Boolean>
{
	private java.util.List<IMendixObject> __ciList;
	private java.util.List<cmdb.proxies.ConfigurationItem> ciList;

	public IndexCIList(IContext context, java.util.List<IMendixObject> ciList)
	{
		super(context);
		this.__ciList = ciList;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.ciList = new java.util.ArrayList<cmdb.proxies.ConfigurationItem>();
		if (__ciList != null)
			for (IMendixObject __ciListElement : __ciList)
				this.ciList.add(cmdb.proxies.ConfigurationItem.initialize(getContext(), __ciListElement));

		// BEGIN USER CODE
		return nl.mansystems.advancedsearch.IndexCMDB.indexCIList(this.getContext(), this, ciList);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "IndexCIList";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}