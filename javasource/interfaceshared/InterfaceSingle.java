package interfaceshared;

import system.proxies.UserRole;


public class InterfaceSingle {
	static InterfaceSingle self = null;
	String value = "";
	String user = "";
	UserRole SA_LDAPAdminRole;
	UserRole SA_InterfaceAdminRole;
	UserRole ED_SystemAdminRole;
	UserRole MxAdministratorRole;
	UserRole ED_AccountAdmin;
	java.util.List<UserRole> RolesNeedingPersonUserRoleList;

	public static InterfaceSingle getInstance() {
		if (self == null)
			self = new InterfaceSingle();
		return self;
	}
	
	public InterfaceSingle(){
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

	public UserRole getSA_LDAPAdminRole() {
		return SA_LDAPAdminRole;
	}

	public void setSA_LDAPAdminRole(UserRole SA_LDAPAdminRole) {
		this.SA_LDAPAdminRole = SA_LDAPAdminRole;
	}

	//public UserRole getSA_InterfaceAdminRole() {
	//	return SA_InterfaceAdminRole;
	//}

	//public void setSA_InterfaceAdminRole(UserRole SA_InterfaceAdminRole) {
	//	this.SA_InterfaceAdminRole = SA_InterfaceAdminRole;
	//}

	//public UserRole getED_SystemAdminRole() {
	//	return ED_SystemAdminRole;
	//}

	//public void setED_SystemAdminRole(UserRole ED_SystemAdminRole) {
	//	this.ED_SystemAdminRole = ED_SystemAdminRole;
	//}

	//public UserRole getMxAdministratorRole() {
	//	return MxAdministratorRole;
	//}

	//public void setMxAdministratorRole(UserRole mxAdministratorRole) {
	//	this.MxAdministratorRole = mxAdministratorRole;
	//}

	//public UserRole getED_AccountAdmin() {
	//	return ED_AccountAdmin;
	//}

	//public void setED_AccountAdmin(UserRole ED_AccountAdmin) {
	//	this.ED_AccountAdmin = ED_AccountAdmin;
	//}

	//public java.util.List<UserRole> getRolesNeedingPersonUserRoleList() {
	//	return RolesNeedingPersonUserRoleList;
	//}

	//public void setRolesNeedingPersonUserRoleList(
	//		java.util.List<UserRole> rolesNeedingPersonUserRoleList) {
	//	RolesNeedingPersonUserRoleList = rolesNeedingPersonUserRoleList;
	//}	
}
