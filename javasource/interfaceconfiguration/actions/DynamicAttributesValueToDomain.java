// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package interfaceconfiguration.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class DynamicAttributesValueToDomain extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String Value;
	private IMendixObject EntityParameter1;
	private java.lang.String AttributeToSet;

	public DynamicAttributesValueToDomain(IContext context, java.lang.String Value, IMendixObject EntityParameter1, java.lang.String AttributeToSet)
	{
		super(context);
		this.Value = Value;
		this.EntityParameter1 = EntityParameter1;
		this.AttributeToSet = AttributeToSet;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		IContext context = this.getContext();
		try{
			EntityParameter1.setValue(context, AttributeToSet, Value);
		} catch(Exception e) {
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
		return "DynamicAttributesValueToDomain";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
