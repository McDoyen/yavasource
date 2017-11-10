// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package interfacerequests.actions;

import java.util.Map;
import nap.proxies.Countries;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaEnumValue;
import com.mendix.systemwideinterfaces.core.meta.IMetaEnumeration;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaPrimitive;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class CastStringToEnum extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject StringFieldEntity;
	private java.lang.String StringFieldName;
	private IMendixObject EnumFieldEntity;
	private java.lang.String EnumFieldName;

	public CastStringToEnum(IContext context, IMendixObject StringFieldEntity, java.lang.String StringFieldName, IMendixObject EnumFieldEntity, java.lang.String EnumFieldName)
	{
		super(context);
		this.StringFieldEntity = StringFieldEntity;
		this.StringFieldName = StringFieldName;
		this.EnumFieldEntity = EnumFieldEntity;
		this.EnumFieldName = EnumFieldName;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		boolean result = true;
		String totalCaption = "";
		for ( Countries c : Countries.values() ){
			String caption = "/" + c.getCaption("nl_NL");
			totalCaption.concat(caption);
		}
		
		if (StringFieldEntity.hasMember(StringFieldName)){		
			String value = StringFieldEntity.getValue(this.getContext(), StringFieldName);
			if (EnumFieldEntity.hasMember(EnumFieldName)){
				IMetaObject iMetaObject = EnumFieldEntity.getMetaObject();
				IMetaPrimitive iMetaPrimitive = iMetaObject.getMetaPrimitive(EnumFieldName);
				IMetaEnumeration iMetaEnumeration = iMetaPrimitive.getEnumeration();
				Map<String, IMetaEnumValue> map = iMetaEnumeration.getEnumValues();
				IMetaEnumValue iMetaEnumValue = map.get(value);
				if(iMetaEnumValue == null){
					//This type of fault will most likely be caused by and attempt to translate a string directly, it will be up to the workflow in the modeler to show an error in the logging if so required. 
					throw new Exception("Invalid enumeration value: " + StringFieldName + " for enumeration "+ iMetaEnumeration.getName() + " linked to field " + EnumFieldName);		
				}
				else{
					EnumFieldEntity.setValue(this.getContext(), EnumFieldName, value);
				}				
			}
			else{
				//This fault situation does not throw an exception, since this is most likely an error that is caused by a fault in the modeler, it cannot be fixed by a user.
				Core.getLogger("SetChangeDynamicAttributes").error("Unkown enum attribute: " + EnumFieldName + " for string entitiy : " + EnumFieldEntity);
				result = false;											
			}
			
		}
		else{
			//This fault situation does not throw an exception, since this is most likely an error that is caused by a fault in the modeler, it cannot be fixed by a user. 
			Core.getLogger("SetChangeDynamicAttributes").error("Unkown string attribute: " + StringFieldName + " for string entitiy : " + StringFieldEntity);
			result = false;							
		}
		return result;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "CastStringToEnum";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}