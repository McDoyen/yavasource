// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class JMXGetDomainsRunning extends CustomJavaAction<java.lang.Boolean>
{
	private java.util.List<IMendixObject> __RunningDomainListParameter;
	private java.util.List<apmagent.proxies.RunningDomain> RunningDomainListParameter;
	private IMendixObject __GlobalSettingsParameter;
	private apmagent.proxies.GlobalSettings GlobalSettingsParameter;

	public JMXGetDomainsRunning(IContext context, java.util.List<IMendixObject> RunningDomainListParameter, IMendixObject GlobalSettingsParameter)
	{
		super(context);
		this.__RunningDomainListParameter = RunningDomainListParameter;
		this.__GlobalSettingsParameter = GlobalSettingsParameter;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.RunningDomainListParameter = new java.util.ArrayList<apmagent.proxies.RunningDomain>();
		if (__RunningDomainListParameter != null)
			for (IMendixObject __RunningDomainListParameterElement : __RunningDomainListParameter)
				this.RunningDomainListParameter.add(apmagent.proxies.RunningDomain.initialize(getContext(), __RunningDomainListParameterElement));

		this.GlobalSettingsParameter = __GlobalSettingsParameter == null ? null : apmagent.proxies.GlobalSettings.initialize(getContext(), __GlobalSettingsParameter);

		// BEGIN USER CODE
		nl.mansystems.jmx.ToolJMXInterface.getDomains(this.getContext(), GlobalSettingsParameter, RunningDomainListParameter);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "JMXGetDomainsRunning";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
