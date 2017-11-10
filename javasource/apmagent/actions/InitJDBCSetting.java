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
import apmagent.proxies.JDBCSetting;
import apmagent.proxies.QueryStatement;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.connectionbus.DBMSType;
import com.mendix.systemwideinterfaces.connectionbus.JDBCDataStoreConfiguration;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class InitJDBCSetting extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __PostgreSQLQueryParameter;
	private apmagent.proxies.QueryStatement PostgreSQLQueryParameter;
	private IMendixObject __MSSQLQueryParameter;
	private apmagent.proxies.QueryStatement MSSQLQueryParameter;
	private IMendixObject __MySQLQueryParameter;
	private apmagent.proxies.QueryStatement MySQLQueryParameter;
	private IMendixObject __OracleQueryParameter;
	private apmagent.proxies.QueryStatement OracleQueryParameter;
	private java.lang.String PasswordKeyParameter;

	public InitJDBCSetting(IContext context, IMendixObject PostgreSQLQueryParameter, IMendixObject MSSQLQueryParameter, IMendixObject MySQLQueryParameter, IMendixObject OracleQueryParameter, java.lang.String PasswordKeyParameter)
	{
		super(context);
		this.__PostgreSQLQueryParameter = PostgreSQLQueryParameter;
		this.__MSSQLQueryParameter = MSSQLQueryParameter;
		this.__MySQLQueryParameter = MySQLQueryParameter;
		this.__OracleQueryParameter = OracleQueryParameter;
		this.PasswordKeyParameter = PasswordKeyParameter;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.PostgreSQLQueryParameter = __PostgreSQLQueryParameter == null ? null : apmagent.proxies.QueryStatement.initialize(getContext(), __PostgreSQLQueryParameter);

		this.MSSQLQueryParameter = __MSSQLQueryParameter == null ? null : apmagent.proxies.QueryStatement.initialize(getContext(), __MSSQLQueryParameter);

		this.MySQLQueryParameter = __MySQLQueryParameter == null ? null : apmagent.proxies.QueryStatement.initialize(getContext(), __MySQLQueryParameter);

		this.OracleQueryParameter = __OracleQueryParameter == null ? null : apmagent.proxies.QueryStatement.initialize(getContext(), __OracleQueryParameter);

		// BEGIN USER CODE
		try {
			QueryStatement result=null;
			JDBCDataStoreConfiguration jdbcSetting = Core.getConfiguration().getDataStoreConfiguration();
			JDBCSetting newJdbcSetting = new JDBCSetting(getContext());
			newJdbcSetting.setDescription("Generated current database settings");
			newJdbcSetting.setJDBCUser(jdbcSetting.getUserName());
			newJdbcSetting.setJDBCEncryptedPassword(encryptString(PasswordKeyParameter, jdbcSetting.getPassword()));
			String url;
			if (jdbcSetting.getDBMSType().equals(DBMSType.POSTGRESQL)) {
				url = "jdbc:postgresql://"+jdbcSetting.getHostName()+":"+jdbcSetting.getPortNumber()+"/"+jdbcSetting.getDatabaseName();
				result = PostgreSQLQueryParameter;
			} else if (jdbcSetting.getDBMSType().equals(DBMSType.ORACLE)) {
				url = "jdbc:oracle:thin:@"+jdbcSetting.getHostName()+":"+jdbcSetting.getPortNumber()+":"+jdbcSetting.getDatabaseName();
				result = OracleQueryParameter;
			} else if (jdbcSetting.getDBMSType().equals(DBMSType.SQLSERVER)) {
				url = "jdbc:sqlserver://"+jdbcSetting.getHostName()+":"+jdbcSetting.getPortNumber()+";"+jdbcSetting.getDatabaseName()+";integratedSecurity=true;";
				result = MSSQLQueryParameter;
			} /* else if (jdbcSetting.getDBMSType().equals(DBMSType.MYSQL)) { // Future Mx5 line
				url = "jdbc:mysql://"+jdbcSetting.getHostName()+":"+jdbcSetting.getPortNumber()+"/"+jdbcSetting.getDatabaseName();
				result = MYSQLQueryParameter;
			} */ else {
				url = "unknown JDBC driver for "+jdbcSetting.getDBMSType().name()+":"+jdbcSetting.getHostName()+":"+jdbcSetting.getPortNumber()+"/"+jdbcSetting.getDatabaseName();
			}
			newJdbcSetting.setJDBCURL(url);
			newJdbcSetting.commit();
			if (result!=null) {
				result.setJDBCStatement_JDBCSetting(newJdbcSetting);
				result.commit();
				return result.getMendixObject();
			}
		} catch (CoreException e) {
			Core.getLogger("APMAgent.Shared").error("Error initializing JDBC connection ", e);
		}
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "InitJDBCSetting";
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
