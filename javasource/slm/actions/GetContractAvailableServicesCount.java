// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package slm.actions;

import java.util.Iterator;
import slm.proxies.Service;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.XPath;

public class GetContractAvailableServicesCount extends CustomJavaAction<java.lang.Long>
{
	private IMendixObject __ContractParameter1;
	private slm.proxies.Contract ContractParameter1;

	public GetContractAvailableServicesCount(IContext context, IMendixObject ContractParameter1)
	{
		super(context);
		this.__ContractParameter1 = ContractParameter1;
	}

	@Override
	public java.lang.Long executeAction() throws Exception
	{
		this.ContractParameter1 = __ContractParameter1 == null ? null : slm.proxies.Contract.initialize(getContext(), __ContractParameter1);

		// BEGIN USER CODE
		XPath<Service> serviceXPath = XPath.create(Core.createSystemContext(), Service.class);
		//Exclude all ConfigurationItem entries which are already related to the contract (from the user context)
		for(Iterator<Service> contractParameter1Iterator = ContractParameter1.getContract_Service().iterator(); contractParameter1Iterator.hasNext(); ){
			Service service = contractParameter1Iterator.next();
			serviceXPath.notEq(XPath.ID,service.getMendixObject().getId().toLong());
		}
		//Add search field content
		if(ContractParameter1.getSearchAvailableServiceName() != null && !ContractParameter1.getSearchAvailableServiceName().equals("")){
			serviceXPath.contains(Service.MemberNames.ServiceName, ContractParameter1.getSearchAvailableServiceName());
		}
		if(ContractParameter1.getSearchAvailableServiceDescription() != null && !ContractParameter1.getSearchAvailableServiceDescription().equals("")){
			serviceXPath.contains(Service.MemberNames.Description, ContractParameter1.getSearchAvailableServiceDescription());
		}
		return serviceXPath.count();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetContractAvailableServicesCount";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
