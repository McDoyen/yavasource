// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package saml20.actions;

import java.util.List;
import saml20.implementation.security.CertificateHandler;
import saml20.proxies.EntitiesDescriptor;
import saml20.proxies.EntityDescriptor;
import saml20.proxies.KeyDescriptor;
import saml20.proxies.KeyInfo;
import saml20.proxies.RoleDescriptor;
import saml20.proxies.X509Certificate;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class ReEvaluateImportedData extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __IdPFile;
	private saml20.proxies.IdPMetadata IdPFile;

	public ReEvaluateImportedData(IContext context, IMendixObject IdPFile)
	{
		super(context);
		this.__IdPFile = IdPFile;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.IdPFile = __IdPFile == null ? null : saml20.proxies.IdPMetadata.initialize(getContext(), __IdPFile);

		// BEGIN USER CODE

		List<IMendixObject> result = Core.retrieveXPathQueryEscaped(getContext(), "//%s[%s/%s [%s/%s/%s/%s/%s=%s or %s/%s/%s/%s/%s/%s/%s/%s/%s=%s or %s/%s/%s=%s]]", 
				X509Certificate.entityName, 
				KeyInfo.MemberNames.KeyInfo_X509Certificate.toString(), 
				KeyInfo.entityName,
				
				KeyInfo.MemberNames.KeyInfo_EntityDescriptor.toString(),
				EntityDescriptor.entityName,
				EntityDescriptor.MemberNames.EntityDescriptor_EntitiesDescriptor.toString(),
				EntitiesDescriptor.entityName,
				EntitiesDescriptor.MemberNames.EntitiesDescriptor_IdPMetadata.toString(),
				String.valueOf(this.IdPFile.getMendixObject().getId().toLong()),
				

				KeyDescriptor.MemberNames.KeyDescriptor_KeyInfo.toString(),
				KeyDescriptor.entityName,
				KeyDescriptor.MemberNames.KeyDescriptor_RoleDescriptor.toString(),
				RoleDescriptor.entityName,
				RoleDescriptor.MemberNames.RoleDescriptor_EntityDescriptor.toString(),
				EntityDescriptor.entityName,
				EntityDescriptor.MemberNames.EntityDescriptor_EntitiesDescriptor.toString(),
				EntitiesDescriptor.entityName,
				EntitiesDescriptor.MemberNames.EntitiesDescriptor_IdPMetadata.toString(),
				String.valueOf(this.IdPFile.getMendixObject().getId().toLong()),
				
				EntitiesDescriptor.MemberNames.EntitiesDescriptor_KeyInfo.toString(),
				EntitiesDescriptor.entityName,
				EntitiesDescriptor.MemberNames.EntitiesDescriptor_IdPMetadata.toString(),
				String.valueOf(this.IdPFile.getMendixObject().getId().toLong()) );
		
		
		for( IMendixObject certObj : result ) { 
			CertificateHandler.extractCertificateMetaData(this.getContext(), certObj);
		}
		Core.commit(getContext(), result);

		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ReEvaluateImportedData";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
