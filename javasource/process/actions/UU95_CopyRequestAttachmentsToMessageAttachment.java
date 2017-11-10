// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package process.actions;

import java.io.InputStream;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import emailplus.proxies.MessageAttachment;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class UU95_CopyRequestAttachmentsToMessageAttachment extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __ParameterRequestAttachment;
	private process.proxies.RequestAttachment ParameterRequestAttachment;

	public UU95_CopyRequestAttachmentsToMessageAttachment(IContext context, IMendixObject ParameterRequestAttachment)
	{
		super(context);
		this.__ParameterRequestAttachment = ParameterRequestAttachment;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.ParameterRequestAttachment = __ParameterRequestAttachment == null ? null : process.proxies.RequestAttachment.initialize(getContext(), __ParameterRequestAttachment);

		// BEGIN USER CODE
		IContext context = this.getContext();

		Core.getLogger("Process").trace("Copying RequestAttachment " + ParameterRequestAttachment.getName(context));
		MessageAttachment emailAttachment = new MessageAttachment(context);
		InputStream inputStream = Core.getFileDocumentContent(context, ParameterRequestAttachment.getMendixObject());
		Core.storeFileDocumentContent(context, emailAttachment.getMendixObject(), inputStream);
		emailAttachment.setName(ParameterRequestAttachment.getName(context));
		Core.commit(context, emailAttachment.getMendixObject());
		return emailAttachment.getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "CopyRequestAttachmentsToMessageAttachment";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}