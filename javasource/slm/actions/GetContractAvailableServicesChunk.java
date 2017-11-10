// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package slm.actions;

import interfaceconfiguration.proxies.SortOrder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import slm.proxies.Contract.MemberNames;
import slm.proxies.Service;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import communitycommons.XPath;

public class GetContractAvailableServicesChunk extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __ContractParameter1;
	private slm.proxies.Contract ContractParameter1;
	private java.lang.Long Amount;
	private java.lang.Long Offset;

	public GetContractAvailableServicesChunk(IContext context, IMendixObject ContractParameter1, java.lang.Long Amount, java.lang.Long Offset)
	{
		super(context);
		this.__ContractParameter1 = ContractParameter1;
		this.Amount = Amount;
		this.Offset = Offset;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.ContractParameter1 = __ContractParameter1 == null ? null : slm.proxies.Contract.initialize(getContext(), __ContractParameter1);

		// BEGIN USER CODE
		XPath<Service> serviceXPath = XPath.create(Core.createSystemContext(), Service.class);
		//Exclude all Service entries which are already related to the contract (from the user context)
		//The retrieval of the identifiers is done using the getValue method so no database search is invoked (which would be the case if the ContractParameter1.getContract_Service() was used.
		Object valueObject = ContractParameter1.getMendixObject().getValue(this.getContext(), MemberNames.Contract_Service.toString());
		//When there are no related configuration items continue
		if (valueObject != null){
			@SuppressWarnings("unchecked")
			List<IMendixIdentifier> addedServiceList = (List<IMendixIdentifier>) valueObject;
			//When there are no related services continue
			if(addedServiceList.size() != 0){
	
				for(Iterator<IMendixIdentifier> addedServiceIterator = addedServiceList.iterator(); addedServiceIterator.hasNext(); ){
					serviceXPath.notEq(XPath.ID,addedServiceIterator.next().toLong());
				}
			}
		}
		//Add search field content
		if(ContractParameter1.getSearchAvailableServiceName() != null && !ContractParameter1.getSearchAvailableServiceName().equals("")){
			serviceXPath.contains(Service.MemberNames.ServiceName, ContractParameter1.getSearchAvailableServiceName());
		}
		if(ContractParameter1.getSearchAvailableServiceDescription() != null && !ContractParameter1.getSearchAvailableServiceDescription().equals("")){
			serviceXPath.contains(Service.MemberNames.Description, ContractParameter1.getSearchAvailableServiceDescription());
		}
		//Set chunk size and offset
		serviceXPath.offset(Offset.intValue()).limit(Amount.intValue());
		//Add sorting
		if(ContractParameter1.getSortOrderAvailable() != null && ContractParameter1.getSortAttributeServiceAvailable() != null){
			if(ContractParameter1.getSortOrderAvailable() == SortOrder.Ascending){
				switch(ContractParameter1.getSortAttributeServiceAvailable()){
					case Service_Name:
						serviceXPath.addSortingAsc(Service.MemberNames.ServiceName);
						break;
					case Description:
						serviceXPath.addSortingAsc(Service.MemberNames.Description);
						break;
					default:
						serviceXPath.addSortingAsc(Service.MemberNames.ServiceName);
						break;
				}
			}
			else{
				switch(ContractParameter1.getSortAttributeServiceAvailable()){
					case Service_Name:
						serviceXPath.addSortingDesc(Service.MemberNames.ServiceName);
						break;
					case Description:
						serviceXPath.addSortingDesc(Service.MemberNames.Description);
						break;
					default:
						serviceXPath.addSortingDesc(Service.MemberNames.ServiceName);
						break;
				}
			}
		}
		else{
			serviceXPath.addSortingAsc(Service.MemberNames.ServiceName);
		}
		List<Service> list = serviceXPath.all();
		List<IMendixObject> returnList = new LinkedList<IMendixObject>();
		for(Iterator<Service> listIterator = list.iterator(); listIterator.hasNext(); ){
			returnList.add(listIterator.next().getMendixObject());
		}
		return returnList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetContractAvailableServicesChunk";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}