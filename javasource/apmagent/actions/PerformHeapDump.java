// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class PerformHeapDump extends CustomJavaAction<java.lang.String>
{
	private java.lang.Boolean LiveParameter;

	public PerformHeapDump(IContext context, java.lang.Boolean LiveParameter)
	{
		super(context);
		this.LiveParameter = LiveParameter;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		simpleDateFormat.setTimeZone(timeZone);
	    String fileName = nl.mansystems.shared.SharedFunctions.getTempFile("heap-dump-" + simpleDateFormat.format(new Date()) + ".bin"); 
	    boolean result = nl.mansystems.jmx.ToolJMXInterface.dumpHeap(fileName, LiveParameter);
	    if (result) {
	    	return fileName;
	    } else { 
	    	return null;
	    }
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "PerformHeapDump";
	}

	// BEGIN EXTRA CODE
	private final static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS", Locale.getDefault());
	private final static java.util.TimeZone timeZone = TimeZone.getDefault();
	// END EXTRA CODE
}