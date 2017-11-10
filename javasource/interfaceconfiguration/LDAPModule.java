package interfaceconfiguration;

import interfaceconfiguration.proxies.LDAPAttribute;
import interfaceconfiguration.proxies.LDAPAttributeMapping;
import interfaceconfiguration.proxies.LDAPClass;
import interfaceconfiguration.proxies.LDAPFilterClass;
import interfaceconfiguration.proxies.LDAPGroup;
import interfaceconfiguration.proxies.LDAPImportType;
import interfaceconfiguration.proxies.LDAPInterfaceConfiguration;
import interfaceconfiguration.proxies.LDAPObject;
import interfaceconfiguration.proxies.LDAPPath;
import interfaceconfiguration.proxies.LocationAttribute;
import interfaceconfiguration.proxies.OrganisationAttribute;
import interfaceconfiguration.proxies.PersonAttribute;
import interfaceldap.LDAPActionListener;
import interfaceldap.LDAPException;
import interfaceldap.LDAPLoginAction;
import interfaceldap.proxies.GroupLDAPInbox;
import interfaceldap.proxies.LDAPImport;
import interfaceldap.proxies.LocationLDAPInbox;
import interfaceldap.proxies.OrganisationLDAPInbox;
import interfaceldap.proxies.PersonLDAPGroup;
import interfaceldap.proxies.PersonLDAPInbox;
import interfaceldap.proxies.PersonLDAPObjectClass;
import interfaceshared.InterfaceSingle;
import interfaceshared.proxies.LDAPProcessingAttempt;
import interfaceshared.proxies.ProcessingLog;
import interfaceshared.proxies.ProcessingPart;
import interfaceshared.proxies.ProcessingType;
import interfaceshared.proxies.RepeatingStructureProcessingAttempt;
import interfaceshared.proxies.RepeatingStructuresType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.naming.InvalidNameException;
import javax.naming.directory.SearchControls;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;

import mendix.proxies.Level;

import org.springframework.ldap.control.PagedResultsDirContextProcessor;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.filter.NotFilter;
import org.springframework.ldap.filter.OrFilter;
import org.springframework.ldap.filter.WhitespaceWildcardsFilter;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.StringUtils;
import communitycommons.XPath;

public class LDAPModule {
	public static String LDAP_LOG = "LDAP";

	private static Map<String, LdapTemplate> ldapConnections;
	
	static LDAPModule self = null;
	
	public static LDAPModule getInstance() {
		if (self == null)
			self = new LDAPModule();
		return self;
	}
	
	/**
	 * Sets up the LDAP configuration with default values (any call to authenticate will fail until "setupLdapTemplate" has been called successfully)
	 */
	public LDAPModule() {
		ldapConnections = new HashMap<String, LdapTemplate>();
		LDAPActionListener listener = new LDAPActionListener();
		listener.addReplaceEvent(LDAPLoginAction.class.getName());
		Core.addUserAction(LDAPLoginAction.class);
		Core.addListener(listener);
	}
	
	/**
	 * Links an additional import location, from which users are read.
	 * Returns the server to which the import location has been added  
	 * @param context
	 * @param ldapObject
	 * @throws CoreException
	 */
	public void addLdapDirectory(IContext context, LDAPObject ldapObject, LDAPImportType ldapImportType) throws CoreException{
		String DN = ldapObject.getDistinguishedName();  
		
		List<IMendixObject> locations = LDAPModule.query(context, LDAPPath.getType(), LDAPPath.MemberNames.Location, DN, null, null);
		//only add if the location was not already in the list
		if (locations.size() == 0) 
		{
			LDAPPath location = new LDAPPath(context);
			location.setLocation(DN);
			location.setLDAPPath_LDAPImportType(ldapImportType);
			Core.commit(context, location.getMendixObject());
		}
	}
	
	public void readLDAP(IContext context, LDAPInterfaceConfiguration ldapInterfaceConfiguration, ProcessingPart processingPart, boolean valueCheckChanged, String valueCheckCode) throws Exception 
	{
		addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "Starting 'Read LDAP'");
		String rootLocation = ldapInterfaceConfiguration.getRoot();
		if (rootLocation==null || rootLocation.isEmpty()) 
		{
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "ProcessingPartType is not configured correctly, you should specify the LDAP root directory");
		}
		else{
			ReadRootObject.readRoot(context, ldapInterfaceConfiguration, processingPart, valueCheckChanged, valueCheckCode);
		}
	}
	
	public boolean authenticateUser(IContext context, String check, String valueCheck) throws Exception 
	{
		List<IMendixObject> ldapInterfaceConfigurationList = LDAPModule.query(context, LDAPInterfaceConfiguration.getType(), LDAPInterfaceConfiguration.MemberNames.UseLDAP, "true", null, null); 
		for (IMendixObject ldapInterfaceConfigurationObj : ldapInterfaceConfigurationList) 
		{
			LDAPInterfaceConfiguration ldapInterfaceConfiguration = LDAPInterfaceConfiguration.initialize(context, ldapInterfaceConfigurationObj);
			if (authenticate(check + (ldapInterfaceConfiguration.getLoginSuffix() != null ? ldapInterfaceConfiguration.getLoginSuffix().trim() : ""), valueCheck, getLdapTemplate(ldapInterfaceConfiguration, false, InterfaceSingle.getInstance().getValue())))
				return true;
		}
		return false;
	}
	
	public List<String> getLdapImportAttributes(IContext context, LDAPImportType ldapImportType, ProcessingPart processingPart, LDAPInterfaceConfiguration ldapInterfaceConfiguration) throws Exception
	{
		//directory of 
		List<IMendixObject> ldapPaths = LDAPModule.query(context, LDAPPath.getType(), LDAPPath.MemberNames.LDAPPath_LDAPImportType,ldapImportType.getMendixObject().getId().toLong(), processingPart, ldapInterfaceConfiguration);

		if (ldapPaths.size() == 0)
			throw new LDAPException("Locations from which to import attributes have not been defined");

		Map<String, Integer> allattrs = new HashMap<String, Integer>();
		
		//for each import path
		for(IMendixObject pathObj : ldapPaths) 
		{
			LDAPPath path = LDAPPath.initialize(context, pathObj);
			List<IMendixObject> ldapObjects = LDAPModule.query(context, LDAPObject.getType(), LDAPObject.MemberNames.DistinguishedName, path.getLocation(), processingPart, ldapInterfaceConfiguration);
			//for its corresponding ldap directory
			for (IMendixObject ldapObject : ldapObjects)
			{
				List<IMendixObject> subdirs = LDAPModule.query(context, LDAPObject.getType(), LDAPObject.MemberNames.LDAPObject_LDAPObject, ldapObject.getId().toLong(), processingPart, ldapInterfaceConfiguration);
				//fetch all sub directories (users)
				for (IMendixObject subdir: subdirs) 
				{
					//and retrieve all attributes
					List<IMendixObject> attrs = LDAPModule.query(context, LDAPAttribute.getType(), LDAPAttribute.MemberNames.LDAPAttribute_LDAPObject, subdir.getId().toLong(), processingPart, ldapInterfaceConfiguration);
					for(IMendixObject attr: attrs) 
					{
						String attrname = attr.getMember(context, LDAPAttribute.MemberNames.Name.toString()).parseValueToString(context);
						if (!allattrs.containsKey(attrname))
							allattrs.put(attrname, 0);
						allattrs.put(attrname, 1+ allattrs.get(attrname));
					}
				}
				break; //only one dir per ldappath
			}
		}
		
		//MWE: DISABLED failsafe: only return attributes available in all users.
		//(otherwise optimize code above: all for loops can break after first result) 
		List<String> result = new ArrayList<String>();
		for(String attr : allattrs.keySet())
			//if (allattrs.get(attr) == total)
				result.add(attr);
		
		return result;
	}
	
	/* Helper methods */
	
	/**
	 * Authenticates a user against the LDAP server, as configured by setupLdapTemplate
	 * @param username
	 * @param password
	 * @return
	 */
	private boolean authenticate(String username, String password, LdapTemplate ldapTemplate) {
		Core.getLogger(LDAPModule.LDAP_LOG).debug("Trying to authenticate " + username + " with LDAP");
		LdapContextSource cs = (LdapContextSource)ldapTemplate.getContextSource();
		cs.setUserDn(username);
		cs.setPassword(password);
		try {
			ldapTemplate.setContextSource(cs);
			cs.getReadOnlyContext();
		}
		catch (org.springframework.ldap.AuthenticationException e) {
			return false;
		}
		Core.getLogger(LDAPModule.LDAP_LOG).debug("User " + username + " authenticated with LDAP");
		return true;
	}
		
	/**
	 * Sets up the LDAP template to use new credentials and server configuration, and tries to authenticate
	 * @param username
	 * @param password
	 * @param ProcessingPartTypeAddress
	 * @param ldapLocation
	 * @param isActiveDirectory
	 * @throws Exception if LDAP can't login
	 */
	private LdapTemplate createLdapTemplate(String ldapUsername, String ldapPassword, String ProcessingPartTypeAddress, boolean isActiveDirectory) throws Exception {
		LdapTemplate ldapTemplate = new LdapTemplate(new LdapContextSource());
		ldapTemplate.setIgnorePartialResultException(isActiveDirectory); // Active directory throws partialresult exceptions because of referrals
		LdapContextSource ldapContext = (LdapContextSource)ldapTemplate.getContextSource();
		ldapContext.setBase("");
		ldapContext.setPassword(ldapPassword);
		ldapContext.setUserDn(ldapUsername);
		ldapContext.setUrl(ProcessingPartTypeAddress);
		ldapContext.afterPropertiesSet();
		ldapTemplate.setContextSource(ldapContext);
		if (authenticate(ldapUsername, ldapPassword, ldapTemplate)==false) 
			throw new LDAPException("Invalid ldap credentials");
		ldapConnections.put(ProcessingPartTypeAddress, ldapTemplate);
		return ldapTemplate;
	}

	protected LdapTemplate getLdapTemplate(LDAPInterfaceConfiguration ldapInterfaceConfiguration, boolean valueCheckChanged, String valueCheckCode) throws Exception {
		String value = ldapInterfaceConfiguration.getValue();
		String valueCheck = "";
		if(valueCheckChanged){
			valueCheck = ldapInterfaceConfiguration.getValueCheck();
		}
		else{
			valueCheck =  StringUtils.decryptString(valueCheckCode, ldapInterfaceConfiguration.getValueCheck());
		}
		String ProcessingPartTypeAddress = ldapInterfaceConfiguration.getServerAddress();
		Boolean ldapIsActiveDirectory = ldapInterfaceConfiguration.getIsActiveDirectory();

		LdapTemplate ldapTemplate = ldapConnections.containsKey(ProcessingPartTypeAddress) ? ldapConnections.get(ProcessingPartTypeAddress) 
				: createLdapTemplate(value, valueCheck, ProcessingPartTypeAddress, ldapIsActiveDirectory);
		if (!authenticate(value, valueCheck, ldapTemplate))
			throw new LDAPException("Invalid LDAP credentials");
		return ldapTemplate;
	}
	
	protected IMendixObject getProcessingPartTypeParent(IContext context, IMendixObject ldapObject) throws CoreException 
	{
		IMendixIdentifier ldapInterfaceConfiguration = ldapObject.getValue(context, LDAPObject.MemberNames.LDAPObject_LDAPInterfaceConfiguration.toString());
		
		if (ldapInterfaceConfiguration==null) {
			return getProcessingPartTypeParent(context, Core.retrieveId(context, (IMendixIdentifier) 
					ldapObject.getValue(context, LDAPObject.MemberNames.LDAPObject_LDAPObject.toString())));
		}
			
		return Core.retrieveId(context, ldapInterfaceConfiguration);
	}
	
	protected LDAPObject convertFromDirectory(LDAPInterfaceConfiguration ldapInterfaceConfiguration, IContext context, TempLDAPObject tempLDAPObject, LdapTemplate ldapTemplate, String userNameField, ProcessingPart processingPart) throws MendixException 
	{
		addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "Storing " + tempLDAPObject.getModifiedDn());
		
		LDAPObject ldapObject = new LDAPObject(context);
		
		ldapObject.setDistinguishedName(tempLDAPObject.getModifiedDn());
		
		ldapObject.setLDAPObject_LDAPInterfaceConfiguration(ldapInterfaceConfiguration);
			
		for (String property : tempLDAPObject.getPropertyNames()) {
			LDAPAttribute attribute = new LDAPAttribute(context);
			attribute.setName(property);
			if (property.equals(userNameField))
				attribute.setValue(tempLDAPObject.getProperty(property));
			
			attribute.setLDAPAttribute_LDAPObject(ldapObject);
			try{
				Core.commit(context, attribute.getMendixObject());
			}
			catch(Throwable e) {
				if (context.isInTransaction())
					context.rollbackTransAction();
				addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, 
				"An error occured during commit of an attribute to LDAPAttribute, the dn for the attribute is: " + tempLDAPObject.getDn() + ", the attribute is: " + property + " the error is: " + e.getMessage());
			}
		}
		
		for (String objectClassName : tempLDAPObject.getObjectClass()){
			LDAPClass ldapClass = new LDAPClass(context);
			ldapClass.setClassName(objectClassName);
			ldapClass.setLDAPClass_LDAPObject(ldapObject);
			try{
				Core.commit(context, ldapClass.getMendixObject());
			}
			catch(Throwable e) {
				if (context.isInTransaction())
					context.rollbackTransAction();
				addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, 
				"An error occured during commit of an object class to LDAPClass, the dn for the class is: " + tempLDAPObject.getDn() + ", the class name is: " + objectClassName + " the error is: " + e.getMessage());
			}			
		}
		
		if(tempLDAPObject.getChildren() == null){
			return ldapObject;
		}
		List<TempLDAPObject> childTempLDAPObjects = tempLDAPObject.getChildren();
		for (TempLDAPObject childTempLDAPObject : childTempLDAPObjects) {
			childTempLDAPObject.setChildren(getObjectChildren(childTempLDAPObject.getDn(),"(objectclass=*)", ldapTemplate, processingPart, context, ldapInterfaceConfiguration, null));
			LDAPObject newldapdir = convertFromDirectory(ldapInterfaceConfiguration, context, childTempLDAPObject, ldapTemplate, userNameField, processingPart);
			newldapdir.setLDAPObject_LDAPObject(ldapObject);
			try{
				Core.commit(context, newldapdir.getMendixObject());
			}
			catch(Throwable e) {
				if (context.isInTransaction())
					context.rollbackTransAction();
				addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, 
				"An error occured during commit of a sub directory to LDAPObject: " + childTempLDAPObject.getDn() + " the error is: " + e.getMessage());
			}
		}
		return ldapObject;
	}
	
	/**
	 * Read all children of an LDAP directory entry with objectclass "top" (should be just about everything, but at least all people)
	 */
	protected List<TempLDAPObject> getObjectChildren(String dn, String filter, LdapTemplate ldapTemplate, ProcessingPart processingPart, IContext context, LDAPInterfaceConfiguration ldapInterfaceConfiguration, LDAPPath ldapPath) {
		try{
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "Get object children: " + dn);			
			
			PagedResultsDirContextProcessor pagedResultsDirContextProcessor = new PagedResultsDirContextProcessor(ldapInterfaceConfiguration.getLDAPMaxQueryResultSize());
			SearchControls searchControls = new SearchControls();
			if(ldapPath != null){
				if(ldapPath.getImportRecursive()){
					searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);	
				}
				else{
					searchControls.setSearchScope(SearchControls.ONELEVEL_SCOPE);	
				}
			}
			else{
				searchControls.setSearchScope(SearchControls.ONELEVEL_SCOPE);
			}
			List<TempLDAPObject> entries = new LinkedList<TempLDAPObject>();
			ldapTemplate.search(prepareDN(dn), filter, searchControls, new CustomNameClassPairCallbackHandler(entries, context, processingPart, ldapInterfaceConfiguration, ldapPath), pagedResultsDirContextProcessor);			
			return entries;
		}
		catch(Throwable e){
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "An error occuring during processing of node: " + dn + ", error: " + e.getMessage());
			return null;
		}
	}

	public static String prepareDN(String dn) throws InvalidNameException {
		String modifiedDn = dn;
		
		modifiedDn = modifiedDn.replace("\\\\", "\\\\\\\\");
		
		LdapName ldapName = new LdapName(modifiedDn);
		List<Rdn> rdnList = ldapName.getRdns();
		for( Rdn rdn : rdnList ){
			modifiedDn = modifiedDn.replace((String)rdn.getValue(), Rdn.escapeValue(rdn.getValue()));
		}
		
		//RDN isn't escaping slashes, which will cause a naming exception when not escaped, so this is done seperately.

		if (modifiedDn.contains("/")) {
			modifiedDn = modifiedDn.replace("/","\\/");
		}
		return modifiedDn;
	}
	
	protected TempLDAPObject getObject(String dn, LdapTemplate ldapTemplate, ProcessingPart processingPart, IContext context, LDAPInterfaceConfiguration ldapInterfaceConfiguration) {
		try{		
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "Reading: " + dn);
			
			TempLDAPObject entry = new TempLDAPObject(dn);
			
			Object o = ldapTemplate.lookup(prepareDN(dn), new FullObjectAttributesMapper(context, processingPart, ldapInterfaceConfiguration, null));
	
			if (o.getClass() == entry.getClass()) 
				return (TempLDAPObject)o;
	
			return entry;
		}
		catch(Exception e){
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "An error occuring during processing of node: " + dn + ", error: " + e.getMessage());
			return null;
		}
	}
	
	protected static List<IMendixObject> query(IContext context, String query, ProcessingPart processingPart, LDAPInterfaceConfiguration ldapInterfaceConfiguration) 
	{
		try {
			return Core.retrieveXPathQuery(context, query);
		} catch (CoreException e) {
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "Error during LDAP query, is the query correct and the database consistent? Error: " + e.getMessage());
			return null;
		}
	}
	
	protected static List<IMendixObject> query(IContext context, String type, Object field /* Enum value */, Object value, ProcessingPart processingPart, LDAPInterfaceConfiguration ldapInterfaceConfiguration) 
	{
		try {
			return Core.retrieveXPathQueryEscaped(context, "//%s[%s='%s']", 
					type, field.toString(), value.toString());
		} catch (CoreException e) {
			if(processingPart == null||ldapInterfaceConfiguration == null){
				Core.getLogger(LDAPModule.LDAP_LOG).error("Error during LDAP query, is the query correct and the database consistent? Error: " + e.getMessage());
			}
			else{
				LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "Error during LDAP query, is the query correct and the database consistent? Error: " + e.getMessage());	
			}
			return null;
		}
	}
	
	public static void addLogging(IContext context, ProcessingPart processingPart, LDAPInterfaceConfiguration ldapInterfaceConfiguration, Level logLevel, String logMessage ){
		char[] charArray = logMessage.toCharArray();
		for(int i = 0; i < charArray.length; i++){
			if(Character.getType(charArray[i]) == 15){
				charArray[i] = ' ';
			}
		}
		String modifiedLogMessage = String.copyValueOf(charArray);
		if(ldapInterfaceConfiguration.getDebug() || logLevel.equals(Level.CRITICAL) || logLevel.equals(Level.ERROR) || logLevel.equals(Level.WARNING)){
			ProcessingLog processingLog = new ProcessingLog(context); 
			processingLog.setLevel(context, logLevel);
			processingLog.setMessage(context, modifiedLogMessage);
			processingLog.setNode(context, LDAPModule.LDAP_LOG);
			processingLog.setProcessingType(context, ProcessingType.Processing_Log);
			try{
				processingLog.setProcessing_Processing(context, processingPart);
				Core.commit(context, processingLog.getMendixObject());
			}
			catch(Throwable e){
				Core.getLogger(LDAPModule.LDAP_LOG).error("An error occured during commit or creation of logging, the error is: " + e.getMessage());
				addConsoleLogging(logLevel, modifiedLogMessage);
			}
		}
		addConsoleLogging(logLevel, modifiedLogMessage);
	}
	
	private static void addConsoleLogging(Level logLevel, String logMessage){
		if(logLevel.equals(Level.CRITICAL)){
			Core.getLogger(LDAPModule.LDAP_LOG).critical(logMessage);
		}
		else if(logLevel.equals(Level.ERROR)){
			Core.getLogger(LDAPModule.LDAP_LOG).error(logMessage);
		}
		else if(logLevel.equals(Level.WARNING)){
			Core.getLogger(LDAPModule.LDAP_LOG).warn(logMessage);
		}
		else if(logLevel.equals(Level.INFO)){
			Core.getLogger(LDAPModule.LDAP_LOG).info(logMessage);
		}
		else if(logLevel.equals(Level.DEBUG)){
			Core.getLogger(LDAPModule.LDAP_LOG).debug(logMessage);
		}									
		else{
			Core.getLogger(LDAPModule.LDAP_LOG).trace(logMessage);
		}
	}
	
	public static void importLDAP(IContext context, ProcessingPart processingPart, LDAPInterfaceConfiguration ldapInterfaceConfiguration, List<LDAPImportType> ldapImportTypeList, LDAPImport ldapImport, boolean valueCheckChanged, String valueCheckCode, LDAPProcessingAttempt LDAPProcessingAttempt)  throws Exception 
	{
		for(LDAPImportType ldapImportType : ldapImportTypeList){
			String importEntity = ldapImportType.getImportEntity();
			if (importEntity == null || "".equals(importEntity)){
				LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "Ldap Module: User entity was not set!");
				return;
			}
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "Started synchronizing users from LDAP server "+ldapInterfaceConfiguration.getServerAddress());
			
			String keyField = "objectGUID";
			String keyFieldOld = "objectGUID_old";
			if (keyField == null || "".equals(keyField)){
				LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "No login field specified for ldap configuration");
				return;
			}
			
			//The fresh LDAP Directories
			List<TempLDAPObject> tempLDAPObjects = getObjectsFromServer(context, ldapImportType, processingPart, ldapInterfaceConfiguration, valueCheckChanged, valueCheckCode);
			if(tempLDAPObjects == null ){
				return;
			}
			
			//The user defined attribute mappings
			List<IMendixObject> attrmappings =  LDAPModule.query(context, LDAPAttributeMapping.getType(), LDAPAttributeMapping.MemberNames.LDAPAttributeMapping_LDAPImportType, ldapImportType.getMendixObject().getId().toLong(), processingPart, ldapInterfaceConfiguration);
			
			for (TempLDAPObject tempLDAPObject : tempLDAPObjects) 
			{
				RepeatingStructureProcessingAttempt repeatingStructureProcessingAttempt = new RepeatingStructureProcessingAttempt(context);
				repeatingStructureProcessingAttempt.setRepeatingStructureProcessingAttempt_ProcessingAttempt(context, LDAPProcessingAttempt);
				ProcessingPart repeatingStructureProcessingPart = new ProcessingPart(context);
				repeatingStructureProcessingPart.setProcessing_Attempt(context, repeatingStructureProcessingAttempt);
				repeatingStructureProcessingPart.setFunction("Import LDAP object");
				repeatingStructureProcessingPart.setBlocking(new Boolean(true));
//				LdapModule.info("----------------------Started syncing user : " + dir.getProperty(userNameField));
				if (!tempLDAPObject.hasProperty(keyField)) {
					LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.WARNING, "Skipping: " + tempLDAPObject.getModifiedDn());
					continue;
				}
				
				String key = "<error!>";
				String keyOld = "<error!>";
				try {
					key = tempLDAPObject.getProperty(keyField);
					keyOld = tempLDAPObject.getProperty(keyFieldOld);
				}
				
				catch(Exception e) {
					LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.WARNING, "Skipping (no key attribute): " + tempLDAPObject.getModifiedDn());
					continue;
				}
				//The account active switch is part of the UserAccountControl attribute, this attribute is only available on organizationalPerson nodes, for nodes in which it is not available the default value is true. 
				Boolean accountActive = getAccountActive(context, repeatingStructureProcessingPart,ldapInterfaceConfiguration,tempLDAPObject);
						
				context.startTransaction();
				
				if(importEntity.equals(PersonLDAPInbox.entityName)){
					PersonLDAPInbox personLDAPInbox = new PersonLDAPInbox(context);
					personLDAPInbox.setLDAPID(key);
					personLDAPInbox.setLDAPID_OldStyle(getKeyOldModified(keyOld));
					
					repeatingStructureProcessingAttempt.setRepeatingStructureType(context, RepeatingStructuresType.LDAPPersonInbox);
					repeatingStructureProcessingAttempt.setRepeatingStructureProcessingAttempt_LDAPInbox(context, personLDAPInbox);
					repeatingStructureProcessingAttempt.setCurrentRepeatingStructureProcessingAttempt_LDAPInbox(context, personLDAPInbox);
					repeatingStructureProcessingAttempt.commit();
					
					personLDAPInbox.setAccountActive(accountActive);
					personLDAPInbox.setParentProcessingPart_LDAPInbox(context, processingPart);
					personLDAPInbox.setLDAPInbox_LDAPImport(context, ldapImport);
					personLDAPInbox.setLDAPInbox_LDAPPath(context, tempLDAPObject.getLdapPath());
					for(IMendixObject mapping: attrmappings) 
					{
						String ldapattr = mapping.getValue(context, LDAPAttributeMapping.MemberNames.LdapAttr.toString());
						String userattr = mapping.getValue(context, LDAPAttributeMapping.MemberNames.ImportAttr.toString());
						PersonAttribute personAttribute = PersonAttribute.valueOf(userattr);
						String personAttributeString = getPersonAttribute(personAttribute);
						if (tempLDAPObject.hasProperty(ldapattr)){
							if(personAttributeString != null && !personAttributeString.equals("")){
								personLDAPInbox.getMendixObject().setValue(context, personAttributeString, tempLDAPObject.getProperty(ldapattr));	
							}
							else{
								LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.WARNING, 
										String.format("The attribute mapping between ldap attribute %s and user/person attribute %s could not be used because the user/person attribute could not be found.", ldapattr, userattr));
							}
						}
						else{
							LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.WARNING, 
									String.format("The attribute mapping between ldap attribute %s and user/person attribute %s could not be used because the ldap attribute could not be found (most likely the attribute is removed in the active directory).", ldapattr, userattr));
						}
					}
					for(String memberOf : tempLDAPObject.getMemberOf() ){
						PersonLDAPGroup personLDAPGroup = new PersonLDAPGroup(context);
						personLDAPGroup.setGroupName(memberOf);
						personLDAPGroup.setPersonLDAPGroup_PersonLDAPInbox(personLDAPInbox);
						try {
							personLDAPGroup.commit();
						}
						catch(Throwable e) {
							if (context.isInTransaction())
								context.rollbackTransAction();
							LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.ERROR, 
							"An error occured during commit of a memberOf to PersonLDAPGroup: " + tempLDAPObject.getDn() + " the error is: " + e.getMessage());
						}
					}
					for(String objectClass : tempLDAPObject.getObjectClass()){
						PersonLDAPObjectClass personLDAPObjectClass = new PersonLDAPObjectClass(context);
						personLDAPObjectClass.setClassName(objectClass);
						personLDAPObjectClass.setPersonLDAPObjectClass_PersonLDAPInbox(personLDAPInbox);
						try {
							personLDAPObjectClass.commit();
						}
						catch(Throwable e) {
							if (context.isInTransaction())
								context.rollbackTransAction();
							LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.ERROR, 
							"An error occured during commit of a ibject class to PersonLDAPObjectClass: " + tempLDAPObject.getDn() + " the error is: " + e.getMessage());
						}
					}					
					try {
						personLDAPInbox.commit();
					}
					catch(Throwable e) {
						if (context.isInTransaction())
							context.rollbackTransAction();
						LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.ERROR, 
						"An error occured during commit of a person to PersonLDAPInbox: " + tempLDAPObject.getDn() + " the error is: " + e.getMessage());
					}
					Iterator<String> memberOfList = tempLDAPObject.getMemberOf().iterator();
					while(memberOfList.hasNext()){
						PersonLDAPGroup personLDAPGroup = new PersonLDAPGroup(context);
						personLDAPGroup.setGroupName((String) memberOfList.next());
						try{
							personLDAPGroup.commit();	
						}
						catch(Throwable e) {
							if (context.isInTransaction())
								context.rollbackTransAction();
							LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.ERROR, 
							"An error occured during commit of memberOf entry to personLDAPGroup: " + tempLDAPObject.getDn() + " the error is: " + e.getMessage());
						}						
					}
					Iterator<String> objectClassList = tempLDAPObject.getObjectClass().iterator();
					while(objectClassList.hasNext()){
						PersonLDAPObjectClass personLDAPObjectClass = new PersonLDAPObjectClass(context);
						personLDAPObjectClass.setClassName((String) objectClassList.next());
						try{
							personLDAPObjectClass.commit();	
						}
						catch(Throwable e) {
							if (context.isInTransaction())
								context.rollbackTransAction();
							LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.ERROR, 
							"An error occured during commit of an object class to personLDAPObjectClass: " + tempLDAPObject.getDn() + " the error is: " + e.getMessage());
						}
					}
				}
				else if(importEntity.equals(LocationLDAPInbox.entityName)){
					LocationLDAPInbox locationLDAPInbox = new LocationLDAPInbox(context);
					locationLDAPInbox.setParentProcessingPart_LDAPInbox(context, processingPart);
					locationLDAPInbox.setLDAPID(key);
					locationLDAPInbox.setLDAPID_OldStyle(getKeyOldModified(keyOld));
					locationLDAPInbox.setAccountActive(accountActive);
					locationLDAPInbox.setLDAPInbox_LDAPImport(context, ldapImport);
					locationLDAPInbox.setLDAPInbox_LDAPPath(context, tempLDAPObject.getLdapPath());
					
					repeatingStructureProcessingAttempt.setRepeatingStructureType(context, RepeatingStructuresType.LDAPPersonInbox);
					repeatingStructureProcessingAttempt.setRepeatingStructureProcessingAttempt_LDAPInbox(context, locationLDAPInbox);
					repeatingStructureProcessingAttempt.setCurrentRepeatingStructureProcessingAttempt_LDAPInbox(context, locationLDAPInbox);
					repeatingStructureProcessingAttempt.commit();
					
					for(IMendixObject mapping: attrmappings) 
					{
						String ldapattr = mapping.getValue(context, LDAPAttributeMapping.MemberNames.LdapAttr.toString());
						String userattr = mapping.getValue(context, LDAPAttributeMapping.MemberNames.ImportAttr.toString());
						LocationAttribute locationAttribute = LocationAttribute.valueOf(userattr);
						String locationAttributeString = getLocationAttribute(locationAttribute);
						if (tempLDAPObject.hasProperty(ldapattr)){
							if(locationAttributeString != null && !locationAttributeString.equals("")){
								locationLDAPInbox.getMendixObject().setValue(context, locationAttributeString, tempLDAPObject.getProperty(ldapattr));
							}
							else{
								LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.WARNING, 
										String.format("The attribute mapping between ldap attribute %s and location attribute %s could not be used because the location attribute could not be found.", ldapattr, userattr));
							}
						}
						else{
							LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.WARNING, 
									String.format("The attribute mapping between ldap attribute %s and location attribute %s could not be used because the ldap attribute could not be found (most likely the attribute is removed in the active directory).", ldapattr, userattr));
						}	
					}
					try {
						locationLDAPInbox.commit();
					}
					catch(Throwable e) {
						if (context.isInTransaction())
							context.rollbackTransAction();
						LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.ERROR, 
						"An error occured during commit of a location to LocationLDAPInbox: " + tempLDAPObject.getDn() + " the error is: " + e.getMessage());
					}				
				}
				else if(importEntity.equals(OrganisationLDAPInbox.entityName)){
					OrganisationLDAPInbox organisationLDAPInbox = new OrganisationLDAPInbox(context);
					organisationLDAPInbox.setParentProcessingPart_LDAPInbox(context, processingPart);
					organisationLDAPInbox.setLDAPID(key);
					organisationLDAPInbox.setLDAPID_OldStyle(getKeyOldModified(keyOld));
					organisationLDAPInbox.setAccountActive(accountActive);
					organisationLDAPInbox.setLDAPInbox_LDAPImport(context, ldapImport);
					organisationLDAPInbox.setLDAPInbox_LDAPPath(context, tempLDAPObject.getLdapPath());
					
					repeatingStructureProcessingAttempt.setRepeatingStructureType(context, RepeatingStructuresType.LDAPPersonInbox);
					repeatingStructureProcessingAttempt.setRepeatingStructureProcessingAttempt_LDAPInbox(context, organisationLDAPInbox);
					repeatingStructureProcessingAttempt.setCurrentRepeatingStructureProcessingAttempt_LDAPInbox(context, organisationLDAPInbox);
					repeatingStructureProcessingAttempt.commit();
					
					for(IMendixObject mapping: attrmappings) 
					{
						String ldapattr = mapping.getValue(context, LDAPAttributeMapping.MemberNames.LdapAttr.toString());
						String userattr = mapping.getValue(context, LDAPAttributeMapping.MemberNames.ImportAttr.toString());					
						OrganisationAttribute organisationAttribute = OrganisationAttribute.valueOf(userattr);
						String organisationAttributeString = getOrganisationAttribute(organisationAttribute);
						if (tempLDAPObject.hasProperty(ldapattr)){
							if(organisationAttributeString != null && !organisationAttributeString.equals("")){
								organisationLDAPInbox.getMendixObject().setValue(context, organisationAttributeString, tempLDAPObject.getProperty(ldapattr));
							}
							else{
								LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.WARNING, 
										String.format("The attribute mapping between ldap attribute %s and organisation attribute %s could not be used because the organisation attribute could not be found.", ldapattr, userattr));
							}
						}
						else{
							LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.WARNING, 
									String.format("The attribute mapping between ldap attribute %s and organisation attribute %s could not be used because the ldap attribute could not be found (most likely the attribute is removed in the active directory).", ldapattr, userattr));
						}	
					}
					try {
						organisationLDAPInbox.commit();
					}
					catch(Throwable e) {
						if (context.isInTransaction())
							context.rollbackTransAction();
						LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.ERROR, 
						"An error occured during commit of an organisation to OrganisationLDAPInbox: " + tempLDAPObject.getDn() + " the error is: " + e.getMessage());
					}
				}
				else if(importEntity.equals(GroupLDAPInbox.entityName)){
					GroupLDAPInbox groupLDAPInbox = new GroupLDAPInbox(context);
					groupLDAPInbox.setParentProcessingPart_LDAPInbox(context, processingPart);
					groupLDAPInbox.setLDAPID(key);
					//Some databases (PostgresSQL for sure) do not support unicode point 0 characters, these are replaced by a space.
					groupLDAPInbox.setLDAPID_OldStyle(getKeyOldModified(keyOld));
					groupLDAPInbox.setLDAPInbox_LDAPImport(context, ldapImport);
					groupLDAPInbox.setName(tempLDAPObject.getCn());
					groupLDAPInbox.setDn(tempLDAPObject.getModifiedDn());
					groupLDAPInbox.setLDAPInbox_LDAPPath(context, tempLDAPObject.getLdapPath());
					
					repeatingStructureProcessingAttempt.setRepeatingStructureType(context, RepeatingStructuresType.LDAPPersonInbox);
					repeatingStructureProcessingAttempt.setRepeatingStructureProcessingAttempt_LDAPInbox(context, groupLDAPInbox);
					repeatingStructureProcessingAttempt.setCurrentRepeatingStructureProcessingAttempt_LDAPInbox(context, groupLDAPInbox);
					repeatingStructureProcessingAttempt.commit();
					
					try {
						groupLDAPInbox.commit();
					}
					catch(Throwable ce) {
						if (context.isInTransaction()){
							context.rollbackTransAction();
						}
						LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.ERROR, 
						"An error occured during commit of a group to GroupLDAPInbox: " + tempLDAPObject.getDn() + " the error is: " + ce.getMessage());
					}			
				}
				else{
					LDAPModule.addLogging(context, repeatingStructureProcessingPart, ldapInterfaceConfiguration, Level.ERROR,"Incorrect entity, must be either \"Ldap_Interface.PersonLDAPInbox\", \"Ldap_Interface.LocationLDAPInbox\" or \"Ldap_Interface.OrganisationLDAPInbox, bit is: ");
				}
				context.endTransaction();
			}
		}
	}

	protected static List<TempLDAPObject> getObjectsFromServer(IContext context,
			LDAPImportType ldapImportType, ProcessingPart processingPart, LDAPInterfaceConfiguration ldapInterfaceConfiguration, boolean valueCheckChanged, String valueCheckCode) throws CoreException, Exception{
		try{
			LdapTemplate ldapTemplate = LDAPModule.getInstance().getLdapTemplate(ldapInterfaceConfiguration, valueCheckChanged, valueCheckCode);
			List<IMendixObject> ldapPaths = LDAPModule.query(context, LDAPPath.getType(), LDAPPath.MemberNames.LDAPPath_LDAPImportType, ldapImportType.getMendixObject().getId().toLong(), processingPart, ldapInterfaceConfiguration);

			if (ldapPaths.size() == 0){
				LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "Locations from which to import have not been defined");
				return null;
			}
			List<TempLDAPObject> tempLDAPObjects = new ArrayList<TempLDAPObject>();
			
			// retrieve all objects from the ldapPaths
			String filter;
			XPath<LDAPFilterClass> filterClassXPath = XPath.create(context, LDAPFilterClass.class).eq(LDAPFilterClass.MemberNames.LDAPFilterClass_LDAPImportType, ldapImportType);
			List<LDAPFilterClass> ldapFilterClassList = filterClassXPath.all();
			AndFilter andFilter = new AndFilter();
			if(!ldapFilterClassList.isEmpty()){
				for(LDAPFilterClass ldapFilterClass : ldapFilterClassList){
					andFilter.and(new EqualsFilter("objectclass", ldapFilterClass.getClassName()));
				}
				
			}
			else{
				andFilter.and(new WhitespaceWildcardsFilter("objectclass", " "));
			}
			XPath<LDAPGroup> filterGroupXPath = XPath.create(context, LDAPGroup.class).eq(LDAPImportType.MemberNames.LDAPImportType_LDAPFilterGroup, ldapImportType);
			List<LDAPGroup> ldapFilterGroupList = filterGroupXPath.all();
			if(!ldapFilterGroupList.isEmpty()){			
				for(LDAPGroup ldapGroup : ldapFilterGroupList){
					andFilter.and(new EqualsFilter("memberOf", LDAPModule.prepareDN(ldapGroup.getDn())));
				}
			}
			else{
				andFilter.and(new OrFilter().or(new WhitespaceWildcardsFilter("memberOf", " ")).or(new NotFilter(new WhitespaceWildcardsFilter("memberOf", " "))));
			}			
			filter = andFilter.encode();
			for (IMendixObject ldapPathObj : ldapPaths) {
				LDAPPath ldapPath = LDAPPath.initialize(context, ldapPathObj);
				String baseDN = ldapPath.getLocation();
				
				LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "LDAP: retrieving directory "+baseDN);
				tempLDAPObjects.addAll(LDAPModule.getInstance().getObjectChildren(String.valueOf(baseDN),filter, ldapTemplate, processingPart, context, ldapInterfaceConfiguration, ldapPath));
			}
			return tempLDAPObjects;
		}
		catch(Exception e){
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.ERROR, "An error occured during objects retrieval, error: " +e.getMessage());
			return null;
		}
	}
	
	private static String getKeyOldModified(String keyOld){
		String keyOldModified = "";
		for(int i = 0; i < keyOld.length(); i++){
			if(keyOld.codePointAt(i) == 0){
				keyOldModified = keyOldModified + " ";
			}
			else{
				keyOldModified = keyOldModified + keyOld.charAt(i);
			}
		}
		return keyOldModified;
	}
	
	
	private static Boolean getAccountActive(IContext context, ProcessingPart processingPart, LDAPInterfaceConfiguration ldapInterfaceConfiguration, TempLDAPObject tempLDAPObject){
		try {
			return new Boolean(tempLDAPObject.getProperty("userAccountControl"));
		}
		catch(Exception e) {
			LDAPModule.addLogging(context, processingPart, ldapInterfaceConfiguration, Level.DEBUG, "No userAccountControl attribute for node: " + tempLDAPObject.getModifiedDn());
			return new Boolean(true);
		}
	}
	
	private static String getPersonAttribute(PersonAttribute personAttribute){
		switch(personAttribute){
			case E_mail: return PersonLDAPInbox.MemberNames.Email.toString();
			case Fax_number: return PersonLDAPInbox.MemberNames.FaxNumber.toString();
			case First_name: return PersonLDAPInbox.MemberNames.FirstName.toString();
			case Full_name: return PersonLDAPInbox.MemberNames.FullName.toString();
			case Join: return PersonLDAPInbox.MemberNames.Join.toString();
			case User_name: return PersonLDAPInbox.MemberNames.UserName.toString();
			case Language: return PersonLDAPInbox.MemberNames.Language.toString();
			case Last_name: return PersonLDAPInbox.MemberNames.LastName.toString();
			case Location_name: return PersonLDAPInbox.MemberNames.LocationName.toString();
			case Mobile_phone_number: return PersonLDAPInbox.MemberNames.MobileNumber.toString();
			case Organisation_name: return PersonLDAPInbox.MemberNames.OrganisationName.toString();
			case Telephone_number: return PersonLDAPInbox.MemberNames.TelephoneNumber.toString();
			default: return null;
		}
	}
	
	private static String getOrganisationAttribute(OrganisationAttribute organisationAttribute){
		switch(organisationAttribute){
			case Is_customer: return OrganisationLDAPInbox.MemberNames.isCustomer.toString();
			case Location_name: return OrganisationLDAPInbox.MemberNames.LocationName.toString();
			case Organisation_name: return OrganisationLDAPInbox.MemberNames.OrganisationName.toString();
			default: return null;
		}
	}
	
	private static String getLocationAttribute(LocationAttribute locationAttribute){
		switch(locationAttribute){
			case Address: return LocationLDAPInbox.MemberNames.Address.toString();
			case City: return LocationLDAPInbox.MemberNames.City.toString();
			case Country: return LocationLDAPInbox.MemberNames.Country.toString();
			case Location_name: return LocationLDAPInbox.MemberNames.LocationName.toString();
			case Zip_code: return LocationLDAPInbox.MemberNames.Zipcode.toString();
			default: return null;
		}
	}
}