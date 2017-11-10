// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package sdemigration.actions;

import java.util.List;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class DeleteAllObjectsOfEntityName extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String EntityName;

	public DeleteAllObjectsOfEntityName(IContext context, java.lang.String EntityName)
	{
		super(context);
		this.EntityName = EntityName;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		
		String xPath = "//"+EntityName;

		List<IMendixObject> objects = Core.retrieveXPathQuery(getContext(), xPath);
		
		return Core.delete(getContext(), objects);	
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "DeleteAllObjectsOfEntityName";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
