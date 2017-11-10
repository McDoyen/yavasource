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
import slm.proxies.Contract.MemberNames;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import communitycommons.XPath;

public class GetContractAddedDeliveringOrganisationsChunk extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __ContractParameter1;
	private slm.proxies.Contract ContractParameter1;
	private java.lang.Long Amount;
	private java.lang.Long Offset;

	public GetContractAddedDeliveringOrganisationsChunk(IContext context, IMendixObject ContractParameter1, java.lang.Long Amount, java.lang.Long Offset)
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
		XPath<Organisation> deliveringOrganisationItemXPath = XPath.create(Core.createSystemContext(), Organisation.class);
		//Include all organisations entries which are already related to the contract (from the user context), if none, return empty list
		//The retrieval of the identifiers is done using the getValue method so no database search is invoked (which would be the case if the ContractParameter1.getContract_ConfigurationItem() was used.
		Object valueObject = ContractParameter1.getMendixObject().getValue(this.getContext(), MemberNames.Contract_DeliveringOrganisation.toString());
		if (valueObject == null){
			return new LinkedList<IMendixObject>();
		}		
		@SuppressWarnings("unchecked")
		List<IMendixIdentifier> addedDeliveringOrganisationItemList = (List<IMendixIdentifier>) valueObject;
		//When there are no related organisations return an empty list
		if(addedDeliveringOrganisationItemList.size() == 0){
			return new LinkedList<IMendixObject>();
		}
		boolean first = true;
		for(Iterator<IMendixIdentifier> addedDeliveringOrganisationIterator = addedDeliveringOrganisationItemList.iterator(); addedDeliveringOrganisationIterator.hasNext(); ){
			if(first){
				deliveringOrganisationItemXPath.subconstraint().eq(XPath.ID,addedDeliveringOrganisationIterator.next().toLong());
				first = false;
			}
			else{
				deliveringOrganisationItemXPath.or().eq(XPath.ID,addedDeliveringOrganisationIterator.next().toLong());
			}
		}
		deliveringOrganisationItemXPath.close();
		//Add search field content
		if(ContractParameter1.getSearchAddedOrganisation() != null && !ContractParameter1.getSearchAddedOrganisation().equals("")){
			deliveringOrganisationItemXPath.contains(Organisation.MemberNames.OrganisationName, ContractParameter1.getSearchAddedOrganisation());
		}
		//Set chunk size and offset
		deliveringOrganisationItemXPath.offset(Offset.intValue()).limit(Amount.intValue());
		//Add sorting
		if(ContractParameter1.getSortOrderAdded() != null && ContractParameter1.getSortAttributeOrganisationAdded() != null){
			if(ContractParameter1.getSortOrderAdded() == SortOrder.Ascending){
				switch(ContractParameter1.getSortAttributeOrganisationAdded()){
					case Organisation:
						deliveringOrganisationItemXPath.addSortingAsc(Organisation.MemberNames.OrganisationName);
						break;
					default:
						deliveringOrganisationItemXPath.addSortingAsc(Organisation.MemberNames.OrganisationName);
						break;
				}
			}
			else{
				switch(ContractParameter1.getSortAttributeOrganisationAdded()){
					case Organisation:
						deliveringOrganisationItemXPath.addSortingDesc(Organisation.MemberNames.OrganisationName);
						break;
					default:
						deliveringOrganisationItemXPath.addSortingDesc(Organisation.MemberNames.OrganisationName);
						break;
				}
			}
		}
		else{
			deliveringOrganisationItemXPath.addSortingAsc(Organisation.MemberNames.OrganisationName);
		}
		List<Organisation> list = deliveringOrganisationItemXPath.all();
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
		return "GetContractAddedDeliveringOrganisationsChunk";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
