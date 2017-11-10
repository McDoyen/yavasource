package interfaceconfiguration;

import interfaceconfiguration.proxies.LDAPInterfaceConfiguration;
import interfaceconfiguration.proxies.LDAPPath;
import interfaceshared.proxies.ProcessingPart;
import java.util.List;
import javax.naming.NameClassPair;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchResult;
import org.springframework.ldap.core.NameClassPairCallbackHandler;
import com.mendix.systemwideinterfaces.core.IContext;

public class CustomNameClassPairCallbackHandler implements NameClassPairCallbackHandler {
	
	private List<TempLDAPObject> tempLDAPObjectList; 
	private FullObjectAttributesMapper fullObjectAttributesMapper;
		
	public CustomNameClassPairCallbackHandler(List<TempLDAPObject> tempLDAPObjectList, IContext context, ProcessingPart processingPart, LDAPInterfaceConfiguration ldapInterfaceConfiguration, LDAPPath ldapPath){
		this.tempLDAPObjectList = tempLDAPObjectList;
		fullObjectAttributesMapper = new FullObjectAttributesMapper(context, processingPart, ldapInterfaceConfiguration, ldapPath);
	}
	
	@Override
	public void handleNameClassPair(NameClassPair nameClassPair) {
		SearchResult searchResult = (SearchResult) nameClassPair;
		Attributes attributes = searchResult.getAttributes();
		TempLDAPObject tempLDAPObject = (TempLDAPObject)fullObjectAttributesMapper.mapFromAttributes(attributes, searchResult.getName());
		if(tempLDAPObject != null){
			tempLDAPObjectList.add(tempLDAPObject);
		}
	}
}
