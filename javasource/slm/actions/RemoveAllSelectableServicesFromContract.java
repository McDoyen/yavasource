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
import java.util.LinkedList;
import java.util.List;
import slm.proxies.Contract.MemberNames;
import slm.proxies.Service;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.connectionbus.data.IDataRow;
import com.mendix.systemwideinterfaces.connectionbus.data.IDataTable;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import communitycommons.XPath;

public class RemoveAllSelectableServicesFromContract extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __ContractParameter1;
	private slm.proxies.Contract ContractParameter1;

	public RemoveAllSelectableServicesFromContract(IContext context, IMendixObject ContractParameter1)
	{
		super(context);
		this.__ContractParameter1 = ContractParameter1;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.ContractParameter1 = __ContractParameter1 == null ? null : slm.proxies.Contract.initialize(getContext(), __ContractParameter1);

		// BEGIN USER CODE
		String oqlQuery = "SELECT " + XPath.ID + 
				 " FROM " + Service.getType() +
	             " WHERE ";
		
		//Retrieve all service entries which are already related to the contract (from the user context)
		//The retrieval of the identifiers is done using the getValue method so no database search is invoked (which would be the case if the ContractParameter1.getContract_Service() was used.
		Object valueObject = ContractParameter1.getMendixObject().getValue(this.getContext(), MemberNames.Contract_Service.toString());
		//When there are no related services exit
	    Core.getLogger("removeAllSelectableServices").info("valueObj [" + valueObject+"]");
		if (valueObject != null){
			@SuppressWarnings("unchecked")
			List<IMendixIdentifier> addedServicesList = (List<IMendixIdentifier>) valueObject;
			//When there are no related services continue
			if(addedServicesList.size() != 0){
				String OQLAddedPart = "";
				int OQLAddedCounter = 0;
				boolean firstAdded = true;
				for(Iterator<IMendixIdentifier> addedServicesIterator = addedServicesList.iterator(); addedServicesIterator.hasNext(); ){
					String mainIDQueryPart = Service.getType() + "/" + XPath.ID + " = " + addedServicesIterator.next().toLong();
					if(firstAdded){
						OQLAddedPart = OQLAddedPart	+ mainIDQueryPart;
						firstAdded = false;
						OQLAddedCounter++;
					}
					OQLAddedPart = OQLAddedPart	+ " OR " + mainIDQueryPart;
					OQLAddedCounter++;
				}
				if(OQLAddedCounter > 1){
					oqlQuery = oqlQuery + "(" + OQLAddedPart + ")";
				}
				else{
					oqlQuery = oqlQuery + OQLAddedPart;
				}
				
				//Add search field content
				boolean firstFilter = true;
				String OQLFilterPart = "";
				int OQLFilterPartCounter = 0;
				if(ContractParameter1.getSearchAddedServiceName() != null && !ContractParameter1.getSearchAddedServiceName().equals("")){
					String mainSearchAddedServiceNameQueryPart = Service.getType() + "/" + Service.MemberNames.ServiceName + " LIKE '%" + ContractParameter1.getSearchAddedServiceName() + "%'"; 
					OQLFilterPart = mainSearchAddedServiceNameQueryPart;
					firstFilter = false;
					OQLFilterPartCounter++;
				}
				if(ContractParameter1.getSearchAddedServiceDescription() != null && !ContractParameter1.getSearchAddedServiceDescription().equals("")){
					String mainSearchAddedServiceDescriptionQueryPart = Service.getType() + "/" + Service.MemberNames.Description + " 'LIKE %" + ContractParameter1.getSearchAddedServiceDescription() + "%'"; 
					if(!firstFilter){
						OQLFilterPart = OQLFilterPart + " AND ";
					}
					OQLFilterPart = OQLFilterPart + mainSearchAddedServiceDescriptionQueryPart;
					firstFilter = false;
					OQLFilterPartCounter++;
				}
				// 3049 Only add the AND keyword, if a filter part is set. Removed the else, as it does nothing
				if(!OQLFilterPart.equals("")){
					oqlQuery = oqlQuery	+ " AND ";
					if(OQLFilterPartCounter > 1){
						oqlQuery = oqlQuery + "(" + OQLFilterPart + ")";
					}
				}
			    Core.getLogger("removeAllSelectableServices").info("OQL string");
			    Core.getLogger("removeAllSelectableServices").info(oqlQuery);
				IDataTable result = Core.retrieveOQLDataTable(this.getContext(), oqlQuery);
				LinkedList<IMendixIdentifier> servicesMendixIdentifierList = new LinkedList<IMendixIdentifier>();
				//Exit on empty result list
			    Core.getLogger("removeAllSelectableServices").info("Results has ["+result.getRowCount()+"] results");
				if(result.getRowCount() != 0){
					for(Iterator<IDataRow> iDataRowIterator = result.iterator(); iDataRowIterator.hasNext(); ){
						servicesMendixIdentifierList.add((IMendixIdentifier) iDataRowIterator.next().getValue(this.getContext(), 0));
					}
					LinkedList<IMendixIdentifier> resultList = new LinkedList<IMendixIdentifier>();
					//When the selectable list is < than the added list, remove the selectable entries from the added list, otherwise add the empty list (which empties the relation).
					if(servicesMendixIdentifierList.size() < addedServicesList.size()){
						//Add all entries from the added services list which are not in the selectable list to the result list
						for(Iterator<IMendixIdentifier> addedServicesIterator = addedServicesList.iterator(); addedServicesIterator.hasNext(); ){
							IMendixIdentifier addedServiceIMendixIdentifier = addedServicesIterator.next();
							if(!servicesMendixIdentifierList.contains(addedServiceIMendixIdentifier)){
								resultList.add(addedServiceIMendixIdentifier);
							}
						}
					}
					ContractParameter1.getMendixObject().setValue(getContext(), MemberNames.Contract_Service.toString(), resultList);
				}
			}
		}
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "RemoveAllSelectableServicesFromContract";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
