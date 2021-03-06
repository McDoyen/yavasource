// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package process.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Process module

	public static boolean getIncludeOpenPauseInRemainingTime()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("Process.IncludeOpenPauseInRemainingTime");
	}

	public static java.lang.Long getMaxDropDownResultSize()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("Process.MaxDropDownResultSize");
	}

	public static java.lang.Long getMaxSubTaskLevel()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("Process.MaxSubTaskLevel");
	}

	/**
	* This constant is used to define if dynamic attributes are used for the change process and underlying tasks.
	* Set it to false and the dynamic attribute references are not shown on the ticket and tasks for the change process.
	*/
	public static boolean getUseDynamicAttributes_Change()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("Process.UseDynamicAttributes_Change");
	}

	/**
	* This constant is used to define if dynamic attributes are used for the problem process and underlying tasks.
	* Set it to false and the dynamic attribute references are not shown on the ticket and tasks for the problem process.
	*/
	public static boolean getUseDynamicAttributes_Delivery()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("Process.UseDynamicAttributes_Delivery");
	}

	/**
	* This constant is used to define if dynamic attributes are used for the incident process and underlying tasks.
	* Set it to false and the dynamic attribute references are not shown on the ticket and tasks for the incident process.
	*/
	public static boolean getUseDynamicAttributes_Incident()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("Process.UseDynamicAttributes_Incident");
	}

	/**
	* This constant is used to define if dynamic attributes are used for the operation process and underlying tasks.
	* Set it to false and the dynamic attribute references are not shown on the ticket and tasks for the operation process.
	*/
	public static boolean getUseDynamicAttributes_Operation()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("Process.UseDynamicAttributes_Operation");
	}

	/**
	* This constant is used to define if dynamic attributes are used for the problem process and underlying tasks.
	* Set it to false and the dynamic attribute references are not shown on the ticket and tasks for the problem process.
	*/
	public static boolean getUseDynamicAttributes_Problem()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("Process.UseDynamicAttributes_Problem");
	}

	/**
	* This constant is used to define if dynamic attributes are used for the problem process and underlying tasks.
	* Set it to false and the dynamic attribute references are not shown on the ticket and tasks for the problem process.
	*/
	public static boolean getUseDynamicAttributes_ServiceRequest()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("Process.UseDynamicAttributes_ServiceRequest");
	}
}