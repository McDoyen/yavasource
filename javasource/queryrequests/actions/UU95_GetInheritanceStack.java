// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package queryrequests.actions;

import java.util.LinkedList;
import interfaceshared.proxies.StringWrapper;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;

/**
 * 
 */
public class UU95_GetInheritanceStack extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject InputObject;

	public UU95_GetInheritanceStack(IContext context, IMendixObject InputObject)
	{
		super(context);
		this.InputObject = InputObject;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		LinkedList<IMendixObject> outputList = new LinkedList<IMendixObject>();
		IMetaObject iMetaobject = Core.getMetaObject(InputObject.getType());
		StringWrapper stringWrapper = new StringWrapper(this.getContext());
		stringWrapper.setValue(iMetaobject.getName());
		String entityName = iMetaobject.getSuperName();
		outputList.add(stringWrapper.getMendixObject());
		boolean hasNext = true;
		while(hasNext){
			if(!entityName.equals("")){
				iMetaobject = Core.getMetaObject(entityName);
				StringWrapper superStringWrapper = new StringWrapper(this.getContext());
				superStringWrapper.setValue(iMetaobject.getName());
				outputList.add(stringWrapper.getMendixObject());
				entityName = iMetaobject.getSuperName();
			}
			else{
				hasNext = false;
			}
		}
		return outputList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetInheritanceStack";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}