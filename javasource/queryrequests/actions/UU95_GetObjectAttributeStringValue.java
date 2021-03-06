// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package queryrequests.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObjectMember;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class UU95_GetObjectAttributeStringValue extends CustomJavaAction<String>
{
	private IMendixObject InputObject;
	private String AttributeParameter1;

	public UU95_GetObjectAttributeStringValue(IContext context, IMendixObject InputObject, String AttributeParameter1)
	{
		super(context);
		this.InputObject = InputObject;
		this.AttributeParameter1 = AttributeParameter1;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		try{
			IMendixObjectMember<?> member = InputObject.getMember(this.getContext(), AttributeParameter1);
			return member.parseValueToString(this.getContext());
		} catch(Exception e) {
			return "";
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetObjectAttributeStringValue";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
