// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package da.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class SetAutomaticDataAccessWithRules extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject InputObject;
	private IMendixObject __DefaultLabelPar;
	private da.proxies.Label DefaultLabelPar;
	private java.util.List<IMendixObject> __CurrentLabels;
	private java.util.List<da.proxies.Label> CurrentLabels;

	public SetAutomaticDataAccessWithRules(IContext context, IMendixObject InputObject, IMendixObject DefaultLabelPar, java.util.List<IMendixObject> CurrentLabels)
	{
		super(context);
		this.InputObject = InputObject;
		this.__DefaultLabelPar = DefaultLabelPar;
		this.__CurrentLabels = CurrentLabels;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.DefaultLabelPar = __DefaultLabelPar == null ? null : da.proxies.Label.initialize(getContext(), __DefaultLabelPar);

		this.CurrentLabels = new java.util.ArrayList<da.proxies.Label>();
		if (__CurrentLabels != null)
			for (IMendixObject __CurrentLabelsElement : __CurrentLabels)
				this.CurrentLabels.add(da.proxies.Label.initialize(getContext(), __CurrentLabelsElement));

		// BEGIN USER CODE
		nl.mansystems.da.SetAutomaticDataAccessWithRules sada = 
			new nl.mansystems.da.SetAutomaticDataAccessWithRules(this.getContext(), this, InputObject, DefaultLabelPar, CurrentLabels, 0);
		return sada.executeAction();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SetAutomaticDataAccessWithRules";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
