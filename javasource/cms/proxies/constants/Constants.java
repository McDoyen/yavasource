// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cms.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the CMS module

	/**
	* The ExpertDesk copyright message. It is for example used on the About popup.
	*/
	public static java.lang.String getEDCopyright()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("CMS.EDCopyright");
	}

	/**
	* The ExpertDesk version number. It is for example shown in the About popup.
	*/
	public static java.lang.String getEDVersion()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("CMS.EDVersion");
	}
}