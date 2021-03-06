// This file was generated by Mendix Modeler 7.7.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audit.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Audit module

	public static java.lang.Long getChunkSize()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("Audit.ChunkSize");
	}

	public static boolean getInitFixInline()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("Audit.InitFixInline");
	}

	public static java.lang.Long getParallelSessions()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("Audit.ParallelSessions");
	}

	public static boolean getUseAudit()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("Audit.UseAudit");
	}
}