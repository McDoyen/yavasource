// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the APMAgent module

	/**
	* For testing applications with multiple runtimes on the same host.
	*/
	public static boolean getAppendApplicationURLToHostname()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("APMAgent.AppendApplicationURLToHostname");
	}

	public static java.lang.Long getBatchDeleteChunkSize()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("APMAgent.BatchDeleteChunkSize");
	}

	/**
	* list of patterns in semi colon list that filters out microflows. Used in statistics tool and performance tool jar.
	*/
	public static java.lang.String getExcludedMicroflows()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("APMAgent.ExcludedMicroflows");
	}

	public static java.lang.Long getMaxRunningMicroflowsInDialog()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("APMAgent.MaxRunningMicroflowsInDialog");
	}

	/**
	* Seconds to wait for a microflow to finish on stop recording.
	*/
	public static java.lang.Long getPerformanceToolWaitTimeForMicroflowToFinish()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("APMAgent.PerformanceToolWaitTimeForMicroflowToFinish");
	}

	/**
	* Added for the rare situation that the after startup cause the server to fail to startup.
	*/
	public static boolean getRunAfterStartup()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("APMAgent.RunAfterStartup");
	}
}