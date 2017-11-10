// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package process.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class Create_Cylinder extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __RelatedChartXML;
	private fusionchartsplus.proxies.ChartXML RelatedChartXML;
	private java.lang.Long Value;
	private java.lang.Long WarningThreshold;
	private java.lang.Long MaximumThreshold;

	public Create_Cylinder(IContext context, IMendixObject RelatedChartXML, java.lang.Long Value, java.lang.Long WarningThreshold, java.lang.Long MaximumThreshold)
	{
		super(context);
		this.__RelatedChartXML = RelatedChartXML;
		this.Value = Value;
		this.WarningThreshold = WarningThreshold;
		this.MaximumThreshold = MaximumThreshold;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		this.RelatedChartXML = __RelatedChartXML == null ? null : fusionchartsplus.proxies.ChartXML.initialize(getContext(), __RelatedChartXML);

		// BEGIN USER CODE
		nl.mansystems.graph.Create_Cylinder cag = new nl.mansystems.graph.Create_Cylinder(Value, WarningThreshold, MaximumThreshold);
		return cag.executeAction();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "Create_Cylinder";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}