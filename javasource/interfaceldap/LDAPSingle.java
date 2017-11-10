package interfaceldap;


public class LDAPSingle {
	static LDAPSingle self = null;
	String value = "";
	String user = "";
	String ldapRole = "";

	public static LDAPSingle getInstance() {
		if (self == null)
			self = new LDAPSingle();
		return self;
	}
	
	public LDAPSingle(){
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getLdapRole() {
		return ldapRole;
	}

	public void setLdapRole(String ldapRole) {
		this.ldapRole = ldapRole;
	}	
}
