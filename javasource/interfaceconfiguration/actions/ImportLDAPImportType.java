// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package interfaceconfiguration.actions;

import interfaceconfiguration.proxies.LDAPImportType;
import interfaceldap.LDAPModule;
import java.util.ArrayList;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class ImportLDAPImportType extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __LDAPImportTypeParameter1;
	private interfaceconfiguration.proxies.LDAPImportType LDAPImportTypeParameter1;
	private IMendixObject __LDAPInterfaceConfigurationParameter1;
	private interfaceconfiguration.proxies.LDAPInterfaceConfiguration LDAPInterfaceConfigurationParameter1;
	private IMendixObject __ProcessingPartParameter1;
	private interfaceshared.proxies.ProcessingPart ProcessingPartParameter1;
	private IMendixObject __LDAPImportParameter1;
	private interfaceldap.proxies.LDAPImport LDAPImportParameter1;
	private java.lang.Boolean ValueCheckChanged;
	private java.lang.String ValueCheckCode;
	private IMendixObject __LDAPProcessingAttemptParameter1;
	private interfaceshared.proxies.LDAPProcessingAttempt LDAPProcessingAttemptParameter1;

	public ImportLDAPImportType(IContext context, IMendixObject LDAPImportTypeParameter1, IMendixObject LDAPInterfaceConfigurationParameter1, IMendixObject ProcessingPartParameter1, IMendixObject LDAPImportParameter1, java.lang.Boolean ValueCheckChanged, java.lang.String ValueCheckCode, IMendixObject LDAPProcessingAttemptParameter1)
	{
		super(context);
		this.__LDAPImportTypeParameter1 = LDAPImportTypeParameter1;
		this.__LDAPInterfaceConfigurationParameter1 = LDAPInterfaceConfigurationParameter1;
		this.__ProcessingPartParameter1 = ProcessingPartParameter1;
		this.__LDAPImportParameter1 = LDAPImportParameter1;
		this.ValueCheckChanged = ValueCheckChanged;
		this.ValueCheckCode = ValueCheckCode;
		this.__LDAPProcessingAttemptParameter1 = LDAPProcessingAttemptParameter1;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.LDAPImportTypeParameter1 = __LDAPImportTypeParameter1 == null ? null : interfaceconfiguration.proxies.LDAPImportType.initialize(getContext(), __LDAPImportTypeParameter1);

		this.LDAPInterfaceConfigurationParameter1 = __LDAPInterfaceConfigurationParameter1 == null ? null : interfaceconfiguration.proxies.LDAPInterfaceConfiguration.initialize(getContext(), __LDAPInterfaceConfigurationParameter1);

		this.ProcessingPartParameter1 = __ProcessingPartParameter1 == null ? null : interfaceshared.proxies.ProcessingPart.initialize(getContext(), __ProcessingPartParameter1);

		this.LDAPImportParameter1 = __LDAPImportParameter1 == null ? null : interfaceldap.proxies.LDAPImport.initialize(getContext(), __LDAPImportParameter1);

		this.LDAPProcessingAttemptParameter1 = __LDAPProcessingAttemptParameter1 == null ? null : interfaceshared.proxies.LDAPProcessingAttempt.initialize(getContext(), __LDAPProcessingAttemptParameter1);

		// BEGIN USER CODE
		ArrayList<LDAPImportType> lDAPImportType = new ArrayList<LDAPImportType>();
		lDAPImportType.add(LDAPImportTypeParameter1);
		LDAPModule.importLDAP(getContext(), ProcessingPartParameter1, LDAPInterfaceConfigurationParameter1, lDAPImportType, LDAPImportParameter1, ValueCheckChanged, ValueCheckCode, LDAPProcessingAttemptParameter1);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ImportLDAPImportType";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
