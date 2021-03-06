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
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import nl.mansystems.shared.Base64;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Applies AES encryption to the value string using a symmetric key. 
 * The keylength should exactly be 16 characters (128 bit).
 */
public class DecryptString extends CustomJavaAction<java.lang.String>
{
	private java.lang.String valueToDecrypt;
	private java.lang.String key;

	public DecryptString(IContext context, java.lang.String valueToDecrypt, java.lang.String key)
	{
		super(context);
		this.valueToDecrypt = valueToDecrypt;
		this.key = key;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return decryptString(key, valueToDecrypt);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "DecryptString";
	}

	// BEGIN EXTRA CODE
	// From community commons, to remove dependency
	public static String decryptString(String key, String valueToDecrypt) throws Exception
	{
		if (valueToDecrypt == null)
			return null;
		if (key == null)
			throw new MendixRuntimeException("Key should not be empty");
		if (key.length() != 16)
			throw new MendixRuntimeException("Key length should be 16");
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5PADDING");
		SecretKeySpec k = new SecretKeySpec(key.getBytes(), "AES");
		String[] s = valueToDecrypt.split(";");
		if (s.length < 2) //Not an encrypted string, just return the original value.
			return valueToDecrypt;
		byte[] iv = Base64.decode(s[0]);
		byte[] encryptedData = Base64.decode(s[1]);
		c.init(Cipher.DECRYPT_MODE, k, new IvParameterSpec(iv));
		return new String(c.doFinal(encryptedData));
	}
	// END EXTRA CODE
}
