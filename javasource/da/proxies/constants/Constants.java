// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package da.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the DA module

	public static boolean getUseDataAccess()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("DA.UseDataAccess");
	}
}