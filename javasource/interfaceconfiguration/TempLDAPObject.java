package interfaceconfiguration;

import interfaceconfiguration.proxies.LDAPPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.mendix.systemwideinterfaces.MendixException;

public class TempLDAPObject {

	private String dn;
	private String cn;
		
	private HashMap<String, String> properties;
	private List<TempLDAPObject> children;
	private HashSet<String> memberOf;
	private HashSet<String> objectClass;
	private LDAPPath ldapPath; 
	
	public TempLDAPObject(String dn) {
    	this.properties = new HashMap<String, String>();
    	this.objectClass = new HashSet<String>();
    	this.dn = dn;
    	this.children = new ArrayList<TempLDAPObject>();
    	this.memberOf = new HashSet<String>();
    }
	
	/**
	 * Address in the ldap server of this entry
	 * @return
	 */
    public String getDn() {
        return dn;
    }
    
    public String getModifiedDn() {
        return dn.replace("\\\\","\\");
    }

    public void setDn(String dn) {
        this.dn = dn;
    }


    public void setProperty(String property, String value) {
    	properties.put(property, value);
    }
    
    
    public Set<String> getPropertyNames() {
    	return properties.keySet();
    }
    @Override
	public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
	public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    
    public String getProperty(String fieldName) throws MendixException {
    	String property = properties.get(fieldName);
    	if (property == null) 
    		throw new MendixException("Field '"+fieldName+"' not found in ldap directory '"+getModifiedDn()+"'");
    	return property;
    }
    
    /**
     * Checks to see if the specified field is present in this directory entry
     * @param fieldname
     * @return
     */
    public boolean hasProperty(String fieldname) {
    	if (properties.get(fieldname)!=null) return true;
    	return false;
    }
    
    /**
     * 
     * @return the children of this directory entry, or an empty list if no children exist
     */
    public List<TempLDAPObject> getChildren() {
    	return children;
    }
    
    public void setChildren(List<TempLDAPObject> kids) {
    	children = kids;
    }
    
    public void addChild(TempLDAPObject kid) {
    	children.add(kid);
    }
    
    /**
     * Add a member group that this user belongs to
     * @param member
     */
	public void addMemberOf(String member) {
		memberOf.add(member);
	}
	
	/**
	 * 
	 * @return all groups that this entry is a member of (see ldap specifications: "memberOf")
	 */
	public HashSet<String> getMemberOf() {
		return memberOf;
	}
    
	public boolean isMemberOf(String member) {
		return memberOf.contains(member);
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}
	
	public void addObjectClass(String member) {
		objectClass.add(member);
	}
	
	public HashSet<String> getObjectClass() {
		return objectClass;
	}

	public LDAPPath getLdapPath() {
		return ldapPath;
	}

	public void setLdapPath(LDAPPath ldapPath) {
		this.ldapPath = ldapPath;
	}
    
}
