package interfaceconfiguration;

import interfaceconfiguration.proxies.LDAPInterfaceConfiguration;
import interfaceconfiguration.proxies.LDAPObject;
import interfaceshared.proxies.ProcessingPart;
import mendix.proxies.Level;

import org.springframework.ldap.core.LdapTemplate;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public class ReadRootObject {

	public static void readRoot(IContext context, LDAPInterfaceConfiguration ldapInterfaceConfiguration, ProcessingPart processingPart, boolean valueCheckChanged, String valueCheckCode)  throws Exception {		
		LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "Importing Ldap root directory.");
		
		LDAPObject rootObject = readObject(context, ldapInterfaceConfiguration, processingPart, "objectGUID", valueCheckChanged, valueCheckCode);
		if(rootObject == null){
			return;
		}
		rootObject.setLDAPObject_LDAPInterfaceConfiguration(ldapInterfaceConfiguration);
				
		try{
			Core.commit(context, rootObject.getMendixObject());
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "Parsed LDAP correctly, retrieved root entry." + rootObject.getDistinguishedName());
		}
		catch(Throwable e) {
			if (context.isInTransaction())
				context.rollbackTransAction();
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, 
			"An error occured during commit of root directory to LDAPDirectory, the error is: " + e.getMessage());
		}
	}
	
	public static LDAPObject readObject(IContext context, LDAPInterfaceConfiguration ldapInterfaceConfiguration, ProcessingPart processingPart, String ldapUniqueIdentifierAttribute, boolean valueCheckChanged, String valueCheckCode) throws Exception 
	{
		try{
			LdapTemplate template = LDAPModule.getInstance().getLdapTemplate(ldapInterfaceConfiguration, valueCheckChanged, valueCheckCode);
			TempLDAPObject tempLDAPObject = LDAPModule.getInstance().getObject(ldapInterfaceConfiguration.getRoot(), template, processingPart, context, ldapInterfaceConfiguration);
			if(tempLDAPObject == null){
			 return null;
			}
			tempLDAPObject.setChildren(LDAPModule.getInstance().getObjectChildren(ldapInterfaceConfiguration.getRoot(), "(objectclass=*)" ,template, processingPart, context, ldapInterfaceConfiguration, null));
					
			LDAPObject ldapObject = LDAPModule.getInstance().convertFromDirectory(ldapInterfaceConfiguration, context, tempLDAPObject, template, ldapUniqueIdentifierAttribute, processingPart);
			if(ldapObject == null){
				 return null;
			}		
			ldapObject.setIsRoot(true);
			
			try{
				Core.commit(context, ldapObject.getMendixObject());
			}
			catch(Throwable e) {
				if (context.isInTransaction())
					context.rollbackTransAction();
				LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, 
				"An error occured during commit of person to LDAPDirectory:  " + tempLDAPObject.getModifiedDn() + " the error is: " + e.getMessage());
				return null;
			}			
			return ldapObject;
		}
		catch(Exception e){
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "An error occured during objects retrieval, error: " +e.getMessage());
			return null;
		}
	}
}
