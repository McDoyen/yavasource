// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package scheduling.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Scheduling module

	public static java.lang.Long getDefaultRequestDurationDays()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("Scheduling.DefaultRequestDurationDays");
	}
}