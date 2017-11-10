// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package apmagent.actions;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import nl.mansystems.shared.Base64;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Decrypts an AES encrypted string.
 * The keylength should exactly be 16 characters (128 bit).
 */
public class EncryptString extends CustomJavaAction<java.lang.String>
{
	private java.lang.String valueToEncrypt;
	private java.lang.String key;

	public EncryptString(IContext context, java.lang.String valueToEncrypt, java.lang.String key)
	{
		super(context);
		this.valueToEncrypt = valueToEncrypt;
		this.key = key;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return encryptString(key, valueToEncrypt);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "EncryptString";
	}

	// BEGIN EXTRA CODE
	// From community commons, to remove dependency
	public static String encryptString(String key, String valueToEncrypt) throws Exception
	{
		if (valueToEncrypt == null) 
			return null;
		if (key == null)
			throw new MendixRuntimeException("Key should not be empty");
		if (key.length() != 16)
			throw new MendixRuntimeException("Key length should be 16");
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5PADDING");
		SecretKeySpec k = new SecretKeySpec(key.getBytes(), "AES");
		c.init(Cipher.ENCRYPT_MODE, k);
		byte[] encryptedData = c.doFinal(valueToEncrypt.getBytes());
		byte[] iv = c.getIV();
		return new StringBuilder(Base64.encodeBytes(iv)).append(";").append(Base64.encodeBytes(encryptedData)).toString();
	}
	// END EXTRA CODE
}