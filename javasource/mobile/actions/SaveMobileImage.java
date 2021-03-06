// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mobile.actions;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class SaveMobileImage extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __FileDocumentParameter1;
	private system.proxies.FileDocument FileDocumentParameter1;
	private java.lang.String ImageString;

	public SaveMobileImage(IContext context, IMendixObject FileDocumentParameter1, java.lang.String ImageString)
	{
		super(context);
		this.__FileDocumentParameter1 = FileDocumentParameter1;
		this.ImageString = ImageString;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.FileDocumentParameter1 = __FileDocumentParameter1 == null ? null : system.proxies.FileDocument.initialize(getContext(), __FileDocumentParameter1);

		// BEGIN USER CODE
		
		byte [] decoded = org.apache.commons.codec.binary.Base64.decodeBase64(ImageString.getBytes());
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss") ;;
		FileDocumentParameter1.setName("picture-"+dateFormat.format(date) + ".jpg");
		Core.storeFileDocumentContent(getContext(), FileDocumentParameter1.getMendixObject(), new ByteArrayInputStream(decoded));
	
		return true;	
		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SaveMobileImage";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
