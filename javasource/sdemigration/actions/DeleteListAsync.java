// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package sdemigration.actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.webui.CustomJavaAction;

/**
 * 2975
 * This java call can be used to async delete a list of objects. 
 * xpath: Give the xpath to query for records to build list. Example:
 * '//InterfaceShared.Message[(InterfaceShared.Message_InterfaceMessageConfiguration/InterfaceConfiguration.InterfaceMessageConfiguration/InterfaceConfiguration.InterfaceMessageConfiguration_InterfaceConfiguration = '+toString($InterfaceConfigurationtGUID_1)+') and (Status = ''Error'' or Status = ''Error_Ignored'') and (CreatedByCustomMessage = false()) and (changedDate < ''[%CurrentDateTime%] - '+toString($InterfaceConfiguration_1/ErrorMessageCleanUpAge)+' * [%DayLength%]'')]'
 * 
 * 
 * listSize: Give the number of records to delete in 1 batch.
 */
public class DeleteListAsync extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String xpath;
	private java.lang.Long listSize;

	public DeleteListAsync(IContext context, java.lang.String xpath, java.lang.Long listSize)
	{
		super(context);
		this.xpath = xpath;
		this.listSize = listSize;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		Core.getLogger("ExpertDesk").debug("[DeleteListAsync] Start");
		
		int listLimit = listSize.intValue();
		long count = Core.retrieveXPathQueryAggregate(Core.createSystemContext(), "count(" + xpath + ")");
		int loop = (int) Math.ceil(((float)count) / ((float)listLimit));

		Map<String, String> sortOptions = new HashMap<String, String>();
		sortOptions.put("id", "asc");
		
		Core.getLogger("ExpertDesk").debug("[DeleteListAsync]" + count + " objects divided over ~ " + loop + " lists (" + listLimit + " items per list).");

		for(int i = 0; i< loop; i++){
			Core.getLogger("ExpertDesk").debug("[DeleteListAsync] loop number "+i);
			IContext c = Core.createSystemContext();
			List<IMendixObject> objects = Core.retrieveXPathQuery(c, xpath, listLimit, 0, sortOptions);
			List<Future<Boolean>> deleteResult = Core.deleteAsync(c, objects, true);
			for(Future<Boolean> futureItem: deleteResult){
				if(!futureItem.isDone())  futureItem.get();
			}
		}
		Core.getLogger("ExpertDesk").debug("[DeleteListAsync] Finished");
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "DeleteListAsync";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
