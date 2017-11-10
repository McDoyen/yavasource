package interfaceldap;

import com.mendix.systemwideinterfaces.MendixException;

public class LDAPException extends MendixException {


	private static final long serialVersionUID = 1468946376108926089L;

	public LDAPException() {
		super();
	}
	
	public LDAPException(String errMsg) 
	{
		super(errMsg);
	}
	
	public LDAPException(String errMsg, Throwable cause) 
	{
		super(errMsg, cause);
	}
	
	public LDAPException(Throwable cause) 
	{
		super(cause);
	}


}
