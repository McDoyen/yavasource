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

public class InitDataAccess extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String EntityNamePar;
	private java.lang.Boolean AllTrueOrEmptiesFalse;
	private IMendixObject __DefaultLabelPar;
	private da.proxies.Label DefaultLabelPar;

	public InitDataAccess(IContext context, java.lang.String EntityNamePar, java.lang.Boolean AllTrueOrEmptiesFalse, IMendixObject DefaultLabelPar)
	{
		super(context);
		this.EntityNamePar = EntityNamePar;
		this.AllTrueOrEmptiesFalse = AllTrueOrEmptiesFalse;
		this.__DefaultLabelPar = DefaultLabelPar;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.DefaultLabelPar = __DefaultLabelPar == null ? null : da.proxies.Label.initialize(getContext(), __DefaultLabelPar);

		// BEGIN USER CODE
		nl.mansystems.da.InitDataAccess ida = new nl.mansystems.da.InitDataAccess(this.getContext(), this, EntityNamePar, DefaultLabelPar, AllTrueOrEmptiesFalse);
		return ida.executeAction();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "InitDataAccess";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
