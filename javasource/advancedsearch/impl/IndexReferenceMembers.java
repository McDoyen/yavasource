package advancedsearch.impl;

import java.util.HashMap;
import java.util.Map;

import nap.proxies.Location;
import nap.proxies.Organisation;
import nap.proxies.Person;
import categories.proxies.Category;
import categories_cmdb.proxies.CICategory;
import cmdb.proxies.AffectedCI;
import cmdb.proxies.ConfigurationItem;
import emailplus.proxies.Message;
import process.proxies.Request;
import servicecatalogue.proxies.Product;
import servicecatalogue.proxies.ProductCategory;
import slm.proxies.Priority;
import slm.proxies.Service;
import statetransition.proxies.Phase;
import statetransition.proxies.State;

public class IndexReferenceMembers {

	private static Map<String, String[][]> REF_MEMBERS;
	
	static {
		REF_MEMBERS = new HashMap<String, String[][]>();
		
		REF_MEMBERS.put(cmdb.proxies.ConfigurationItem.getType(),
				new String[][] {
						new String[] { Request.getType(), Request.MemberNames.Request_ConfigurationItem.toString() },
						new String[] {
								Request.getType(),
								AffectedCI.MemberNames.AffectedCI_Request.toString() + "/" + AffectedCI.getType() + "/"
										+ AffectedCI.MemberNames.AffectedCI_ConfigurationItem.toString() } });

		REF_MEMBERS.put(Person.getType(), new String[][] {
				new String[] { Request.getType(), Request.MemberNames.Request_Person.toString() },
				new String[] { Request.getType(), Request.MemberNames.Request_AssignedPerson.toString() } });
		REF_MEMBERS.put(Organisation.getType(), new String[][] {
				new String[] { Request.getType(), Request.MemberNames.Receiving_Organisation.toString() },
				new String[] { Request.getType(), Request.MemberNames.Delivering_Organisation.toString() } });
		REF_MEMBERS.put(Location.getType(),
				new String[][] { new String[] { Request.getType(), Request.MemberNames.Request_Location.toString() } });
		REF_MEMBERS.put(Service.getType(),
				new String[][] { new String[] { Request.getType(), Request.MemberNames.Request_Service.toString() } });
		REF_MEMBERS.put(Priority.getType(),
				new String[][] { new String[] { Request.getType(), Request.MemberNames.Request_Priority.toString() } });
		REF_MEMBERS.put(State.getType(), 
				new String[][] { new String[] { Request.getType(), Request.MemberNames.Request_State.toString() } });
		REF_MEMBERS.put(Phase.getType(), 
				new String[][] { new String[] { Request.getType(), Request.MemberNames.Request_Phase.toString() } });
		REF_MEMBERS.put(CICategory.getType(), 
				new String[][] { new String[] { Request.getType(),
				ConfigurationItem.MemberNames.ConfigurationItem_Category.toString() } });
		REF_MEMBERS.put(ProductCategory.getType(), 
				new String[][] { new String[] { Product.getType(),
				Product.MemberNames.Product_ProductCategory.toString() } });
		REF_MEMBERS.put(Category.getType(),
				new String[][] { new String[] { Request.getType(), Request.MemberNames.Request_Category_Opening.toString() } });
		REF_MEMBERS.put(Category.getType(),
				new String[][] { new String[] { Request.getType(), Request.MemberNames.Request_Category_Opening.toString() } });
		REF_MEMBERS.put(emailplus.proxies.Message.getType(), new String[][] { new String[] { Request.getType(),
				Message.MemberNames.Message_Request.toString() } });
	};
	
	public IndexReferenceMembers() {
		
	}

	public String[][] getRefMembers(String objectType) {
		if (REF_MEMBERS != null) {
			System.out.println("test");
		}
		
		return REF_MEMBERS.get(objectType);
	}

}
