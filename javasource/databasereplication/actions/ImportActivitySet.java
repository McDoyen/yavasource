// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package databasereplication.actions;

import java.util.Date;
import java.util.HashMap;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import databasereplication.proxies.ScheduledImportActivity;
import com.mendix.webui.CustomJavaAction;

/**
 * This Java action executes the microflow: "ProcessActivitySet" in a new subtransaction
 */
public class ImportActivitySet extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject Activity;

	public ImportActivitySet(IContext context, IMendixObject Activity)
	{
		super(context);
		this.Activity = Activity;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		IContext context = Core.createSystemContext();
		context.startTransaction();

		try {

			HashMap<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("ImportActivity", this.Activity);
			paramMap.put("StartDate", new Date());
			Core.execute(context, "DatabaseReplication.ProcessActivitySet", paramMap);
			context.endTransaction();
		}
		catch (Exception e) {
			context.rollbackTransAction();
			Core.getLogger(this.toString()).error( "Failed importing activityset: " + this.Activity.getValue(this.getContext(), ScheduledImportActivity.MemberNames.SortOrder.toString()), e);
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
		return "ImportActivitySet";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
