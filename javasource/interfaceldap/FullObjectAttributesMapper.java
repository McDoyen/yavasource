package interfaceldap;

import interfaceconfiguration.proxies.LDAPInterfaceConfiguration;
import interfaceconfiguration.proxies.LDAPPath;
import interfaceshared.proxies.ProcessingPart;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;

import mendix.proxies.Level;

import org.springframework.ldap.core.AttributesMapper;

import com.mendix.systemwideinterfaces.core.IContext;

import org.apache.commons.codec.binary.Base64;

/**
 * Maps all properties of an LDAP directory onto a TempLDAPObject object
 * Used in conjunction with LdapModule
 * @author avm
 *
 */
public class FullObjectAttributesMapper implements AttributesMapper {
	private LDAPInterfaceConfiguration ldapInterfaceConfiguration;
	private ProcessingPart processingPart;
	private IContext context;
	private LDAPPath ldapPath;
	
	public FullObjectAttributesMapper(IContext context, ProcessingPart processingPart, LDAPInterfaceConfiguration ldapInterfaceConfiguration, LDAPPath ldapPath){
		super();
		this.processingPart = processingPart;
		this.context = context;
		this.ldapInterfaceConfiguration = ldapInterfaceConfiguration;
		this.ldapPath = ldapPath;
	}
	
	public Object mapFromAttributes(Attributes attrs) {
		return mapFromAttributes(attrs, null);
	}
	
	public Object mapFromAttributes(Attributes attrs, String objectName){
		try {
			if (attrs.get("distinguishedName") == null) {
				if(objectName == null || objectName.equals("")){
					LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.WARNING, "No distinguished name attribute found for object, this object will not be imported");
					return null;
				}
				else{
					LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.WARNING, "No distinguished name attribute found for object " + objectName + ", this object will not be imported");
					return null;
				}
			}
			String dn = (String) attrs.get("distinguishedName").get();
			String modifiedDn = ((String) attrs.get("distinguishedName").get()).replace("\\\\","\\");
			TempLDAPObject tempLDAPObject = new TempLDAPObject(dn);
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "Processing object: " + modifiedDn);
			NamingEnumeration<String> n = attrs.getIDs();
			while (n.hasMoreElements()) {
				String o = n.nextElement();
				
				if (attrs.get(o).size() == 0) {
					LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.WARNING, "Skipping empty attribute '" + o + "'");
					continue;
				}
				
				Object property = attrs.get(o).get();
				LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "Mapping attribute: " + o);

				if (property instanceof String) {
					String result = (String) property;
					if (o.equals("memberOf")) {
						NamingEnumeration<?> members = attrs.get(o).getAll();
						while (members.hasMoreElements()) {
							Object member = members.nextElement();
							if (member instanceof String) {
								tempLDAPObject.addMemberOf((String) member);
							}
						}
					}
					else if (o.equals("objectClass")) {
						NamingEnumeration<?> objectClasses = attrs.get(o).getAll();
						while (objectClasses.hasMoreElements()) {
							Object objectClass = objectClasses.nextElement();
							if (objectClass instanceof String) {
								tempLDAPObject.addObjectClass((String) objectClass);
							}
						}
					}
					else if (o.equals("userAccountControl")){
						ArrayList<Integer> userAccountControl = convertDecimalToBinary(Integer.parseInt((String) attrs.get(o).get()));
						if((userAccountControl.get(1)).equals(new Integer(0))){
							tempLDAPObject.setProperty(o, Boolean.TRUE.toString(), true);
						}
						else{
							tempLDAPObject.setProperty(o, Boolean.FALSE.toString(), true);
						}
					}
					else if(o.equals("cn")){
						tempLDAPObject.setCn((String) attrs.get(o).get());
					}
					else if (o.equals("objectGUID")||o.equals("objectSid")){
						Object object = attrs.get(o).get();
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						try{ 
							ObjectOutputStream oos = new ObjectOutputStream(baos); 
							oos.writeObject(object);
							byte[] byteArray = baos.toByteArray();
							String base64ObjecGUID = new String(Base64.encodeBase64(byteArray));
							tempLDAPObject.setProperty(o, base64ObjecGUID, true);
						}
						catch(java.io.IOException ioe){
							LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "An error occured during reading of the ObjectGUID bytestream, error: " + ioe.getMessage());
							return null;
						} 

						//This code is in to supply the old version of the objectGUID for upgrade purposes from ED 9.1 to ED 9.5
						if (o.equals("objectGUID")){
							tempLDAPObject.setProperty(o + "_old", result, true);
						}
					}				
					else {
						tempLDAPObject.setProperty(o, result, true);
					}

				}
				else{
					tempLDAPObject.setProperty(o, null, false);		
				}
			}
			if(ldapPath != null){
				tempLDAPObject.setLdapPath(ldapPath);
			}
			
			return tempLDAPObject;
		} catch (Throwable e) {
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "Error reading attributes in ldap directory, error: " + e.getMessage());
		}
		return null;
	}
	
    public static ArrayList<Integer> convertDecimalToBinary(int decimalValue)
    {
        ArrayList<Integer> b = new ArrayList<Integer>();

        while (decimalValue != 0)
        {
        	b.add(decimalValue % 2);
            decimalValue = decimalValue / 2;
        }
        return b;
    }
}
