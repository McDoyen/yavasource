// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package emailplus.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class UU95_CopyIncomingMessageAttachmentToRequestAttachment extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __ParameterIncommingEmailAttachment;
	private emailplus.proxies.MessageAttachment ParameterIncommingEmailAttachment;

	public UU95_CopyIncomingMessageAttachmentToRequestAttachment(IContext context, IMendixObject ParameterIncommingEmailAttachment)
	{
		super(context);
		this.__ParameterIncommingEmailAttachment = ParameterIncommingEmailAttachment;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.ParameterIncommingEmailAttachment = __ParameterIncommingEmailAttachment == null ? null : emailplus.proxies.MessageAttachment.initialize(getContext(), __ParameterIncommingEmailAttachment);

		// BEGIN USER CODE
		nl.mansystems.email.CopyIncomingEmailAttachmentToRequestAttachment ciea = new nl.mansystems.email.CopyIncomingEmailAttachmentToRequestAttachment(this.getContext(), ParameterIncommingEmailAttachment);
		return ciea.executeAction();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "CopyIncomingMessageAttachmentToRequestAttachment";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
