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

public class GetContractAvailableDeliveringOrgansationsChunk extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __ContractParameter1;
	private slm.proxies.Contract ContractParameter1;
	private java.lang.Long Amount;
	private java.lang.Long Offset;

	public GetContractAvailableDeliveringOrgansationsChunk(IContext context, IMendixObject ContractParameter1, java.lang.Long Amount, java.lang.Long Offset)
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
		XPath<Organisation> deliveringOrganisationXPath = XPath.create(Core.createSystemContext(), Organisation.class);
		//Exclude all organisation entries which are already related to the contract (from the user context)
		//The retrieval of the identifiers is done using the getValue method so no database search is invoked (which would be the case if the ContractParameter1.getContract_ConfigurationItem() was used.
		Object valueObject = ContractParameter1.getMendixObject().getValue(this.getContext(), MemberNames.Contract_DeliveringOrganisation.toString());
		//When there are no related organisations continue
		if (valueObject != null){
			@SuppressWarnings("unchecked")
			List<IMendixIdentifier> addedDeliveringOrganisationList = (List<IMendixIdentifier>) valueObject;
			//When there are no related organisations continue
			if(addedDeliveringOrganisationList.size() != 0){
	
				for(Iterator<IMendixIdentifier> addedDeliveringOrganisationIterator = addedDeliveringOrganisationList.iterator(); addedDeliveringOrganisationIterator.hasNext(); ){
					deliveringOrganisationXPath.notEq(XPath.ID,addedDeliveringOrganisationIterator.next().toLong());
				}
			}
		}
		//Add search field content
		if(ContractParameter1.getSearchAvailableOrganisation() != null && !ContractParameter1.getSearchAvailableOrganisation().equals("")){
			deliveringOrganisationXPath.contains(Organisation.MemberNames.OrganisationName, ContractParameter1.getSearchAvailableOrganisation());
		}
		//Set chunk size and offset
		deliveringOrganisationXPath.offset(Offset.intValue()).limit(Amount.intValue());
		//Add sorting
		if(ContractParameter1.getSortOrderAvailable() != null && ContractParameter1.getSortAttributeCIAvailable() != null){
			if(ContractParameter1.getSortOrderAvailable() == SortOrder.Ascending){
				switch(ContractParameter1.getSortAttributeOrganisationAvailable()){
					case Organisation:
						deliveringOrganisationXPath.addSortingAsc(Organisation.MemberNames.OrganisationName);
						break;
					default:
						deliveringOrganisationXPath.addSortingAsc(Organisation.MemberNames.OrganisationName);
						break;
				}
			}
			else{
				switch(ContractParameter1.getSortAttributeOrganisationAvailable()){
					case Organisation:
						deliveringOrganisationXPath.addSortingDesc(Organisation.MemberNames.OrganisationName);
						break;
					default:
						deliveringOrganisationXPath.addSortingDesc(Organisation.MemberNames.OrganisationName);
						break;
				}
			}
		}
		else{
			deliveringOrganisationXPath.addSortingAsc(Organisation.MemberNames.OrganisationName);
		}
		List<Organisation> list = deliveringOrganisationXPath.all();
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
		return "GetContractAvailableDeliveringOrgansationsChunk";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
