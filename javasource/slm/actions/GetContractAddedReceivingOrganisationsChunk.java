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
import nap.proxies.Organisation;
import cmdb.proxies.ConfigurationItem;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import communitycommons.XPath;

public class GetContractAddedReceivingOrganisationsChunk extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __ContractParameter1;
	private slm.proxies.Contract ContractParameter1;
	private java.lang.Long Amount;
	private java.lang.Long Offset;

	public GetContractAddedReceivingOrganisationsChunk(IContext context, IMendixObject ContractParameter1, java.lang.Long Amount, java.lang.Long Offset)
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
		XPath<Organisation> receivingOrganisationXPath = XPath.create(Core.createSystemContext(), Organisation.class);
		//Include all ConfigurationItem entries which are already related to the contract (from the user context), if none, return empty list
		List<IMendixObject> AddedReceivingOrganisations= Core.retrieveByPath(getContext(), ContractParameter1.getMendixObject(), Organisation.MemberNames.ReceivingOrganisation_Contracts.toString());
		
		//When there are no related configuration items return an empty list
		if(AddedReceivingOrganisations.size() == 0){
			return new LinkedList<IMendixObject>();
		}		
		boolean first = true;
		for(Iterator<IMendixObject> addedReceivingOrganisationsIterator = AddedReceivingOrganisations.iterator(); addedReceivingOrganisationsIterator.hasNext(); ){
			if(first){
				receivingOrganisationXPath.subconstraint().eq(XPath.ID,addedReceivingOrganisationsIterator.next().getId().toLong());
				first = false;
			}
			else{
				receivingOrganisationXPath.or().eq(XPath.ID,addedReceivingOrganisationsIterator.next().getId().toLong());
			}
		}
		if(!first){
			receivingOrganisationXPath.close();
		}
		//Add search field content
		if(ContractParameter1.getSearchAddedOrganisation() != null && !ContractParameter1.getSearchAddedOrganisation().equals("")){
			receivingOrganisationXPath.contains(Organisation.MemberNames.OrganisationName, ContractParameter1.getSearchAddedOrganisation());
		}
		//Set chunk size and offset
		receivingOrganisationXPath.offset(Offset.intValue()).limit(Amount.intValue());
		//Add sorting
		if(ContractParameter1.getSortOrderAdded() != null && ContractParameter1.getSortAttributeOrganisationAdded() != null){
			if(ContractParameter1.getSortOrderAdded() == SortOrder.Ascending){
				switch(ContractParameter1.getSortAttributeOrganisationAdded()){
					case Organisation:
						receivingOrganisationXPath.addSortingAsc(Organisation.MemberNames.OrganisationName);
						break;
					default:
						receivingOrganisationXPath.addSortingAsc(Organisation.MemberNames.OrganisationName);
						break;
				}
			}
			else{
				switch(ContractParameter1.getSortAttributeOrganisationAdded()){
					case Organisation:
						receivingOrganisationXPath.addSortingDesc(Organisation.MemberNames.OrganisationName);
						break;
					default:
						receivingOrganisationXPath.addSortingDesc(Organisation.MemberNames.OrganisationName);
						break;
				}
			}
		}
		else{
			receivingOrganisationXPath.addSortingAsc(ConfigurationItem.MemberNames.Name);
		}
		List<Organisation> list = receivingOrganisationXPath.all();
		List<IMendixObject> returnList = new LinkedList<IMendixObject>();
		for(Iterator<Organisation> listIterator = list.iterator(); listIterator.hasNext(); ){
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
		return "GetContractAddedReceivingOrganisationsChunk";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}