// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class ImportPerformanceToolFile extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String FileName;
	private java.lang.String DateTimeFormatString;
	private java.lang.String LanguageCode;
	private java.lang.Long ActionThreshold;
	private java.lang.Long MicroflowThreshold;
	private java.lang.Long ImportVersion;
	private java.lang.String IncludeMicroflows;
	private java.lang.String ExcludeMicroflows;
	private java.lang.String LicenseParameter;

	public ImportPerformanceToolFile(IContext context, java.lang.String FileName, java.lang.String DateTimeFormatString, java.lang.String LanguageCode, java.lang.Long ActionThreshold, java.lang.Long MicroflowThreshold, java.lang.Long ImportVersion, java.lang.String IncludeMicroflows, java.lang.String ExcludeMicroflows, java.lang.String LicenseParameter)
	{
		super(context);
		this.FileName = FileName;
		this.DateTimeFormatString = DateTimeFormatString;
		this.LanguageCode = LanguageCode;
		this.ActionThreshold = ActionThreshold;
		this.MicroflowThreshold = MicroflowThreshold;
		this.ImportVersion = ImportVersion;
		this.IncludeMicroflows = IncludeMicroflows;
		this.ExcludeMicroflows = ExcludeMicroflows;
		this.LicenseParameter = LicenseParameter;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return nl.mansystems.performancetool.PerformanceToolLogSubscriber.readFile(LicenseParameter, FileName, DateTimeFormatString, LanguageCode, MicroflowThreshold, ActionThreshold, (int) (long) ImportVersion, IncludeMicroflows, ExcludeMicroflows);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ImportPerformanceToolFile";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
