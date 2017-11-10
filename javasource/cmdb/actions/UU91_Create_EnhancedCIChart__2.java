// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package cmdb.actions;

import cmdb.proxies.CMDBRelation;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 
 */
public class UU91_Create_EnhancedCIChart__2 extends UserAction<String>
{
	private java.util.List<IMendixObject> __CIList;
	private java.util.List<cmdb.proxies.ConfigurationItem> CIList;
	private java.util.List<IMendixObject> __CIRelationList;
	private java.util.List<cmdb.proxies.CMDBRelation> CIRelationList;
	@SuppressWarnings("unused")
	private String ServerPath;
	private IMendixObject __ConfigurationItemStart;
	@SuppressWarnings("unused")
	private cmdb.proxies.ConfigurationItem ConfigurationItemStart;
	private IMendixObject __RelatedChartXML;
	@SuppressWarnings("unused")
	private fusionchartsplus.proxies.ChartXML RelatedChartXML;

	public UU91_Create_EnhancedCIChart__2(IContext context, java.util.List<IMendixObject> CIList, java.util.List<IMendixObject> CIRelationList, String ServerPath, IMendixObject ConfigurationItemStart, IMendixObject RelatedChartXML)
	{
		super(context);
		this.__CIList = CIList;
		this.__CIRelationList = CIRelationList;
		this.ServerPath = ServerPath;
		this.__ConfigurationItemStart = ConfigurationItemStart;
		this.__RelatedChartXML = RelatedChartXML;
	}

	@Override
	public String executeAction() throws Exception
	{
		this.CIList = new java.util.ArrayList<cmdb.proxies.ConfigurationItem>();
		if (__CIList != null)
			for (IMendixObject __CIListElement : __CIList)
				this.CIList.add(cmdb.proxies.ConfigurationItem.initialize(getContext(), __CIListElement));

		this.CIRelationList = new java.util.ArrayList<cmdb.proxies.CMDBRelation>();
		if (__CIRelationList != null)
			for (IMendixObject __CIRelationListElement : __CIRelationList)
				this.CIRelationList.add(cmdb.proxies.CMDBRelation.initialize(getContext(), __CIRelationListElement));

		this.ConfigurationItemStart = __ConfigurationItemStart == null ? null : cmdb.proxies.ConfigurationItem.initialize(getContext(), __ConfigurationItemStart);

		this.RelatedChartXML = __RelatedChartXML == null ? null : fusionchartsplus.proxies.ChartXML.initialize(getContext(), __RelatedChartXML);

		// BEGIN USER CODE
		CreateRelationProcessing(CIRelationList);
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "UU91_Create_EnhancedCIChart__2";
	}

	// BEGIN EXTRA CODE
	public class RelationProcessing {
		Long parentGUID;
		Long childGUID;
		String parentName;
		String childName;
		String parentType;
		String childType;
		
		public RelationProcessing(Long parentGUID,Long childGUID, String parentName, String childName, String parentType, String childType){
			this.parentGUID = parentGUID;
			this.childGUID = childGUID;
			this.parentName = parentName;
			this.childName = childName;
			this.childType = childType;
			this.parentType = parentType;
			
		}
	}
	
	private void CreateRelationProcessing (List<CMDBRelation> ciRelations)throws Exception{
		List<CMDBRelation> ciRelationList = ciRelations;
		List<RelationProcessing> relationList = new ArrayList<RelationProcessing>();
		for(int i =0; i < ciRelationList.size(); ++i){
			CMDBRelation relation = ciRelationList.get(i);
			RelationProcessing relationObjectChild = new RelationProcessing(relation.getParent().getMendixObject().getId().toLong(), relation.getChild().getMendixObject().getId().toLong(), relation.getParent().getName(), relation.getChild().getName(), relation.getParent().getConfigurationItem_CMDBType().getName(), relation.getChild().getConfigurationItem_CMDBType().getName());
			relationList.add(relationObjectChild);
		}
		ListIterator<RelationProcessing> RelationProcessingIterator= relationList.listIterator();
			
		while(RelationProcessingIterator.hasNext()){
			RelationProcessing relationProcessingTemp = RelationProcessingIterator.next();
			Core.getLogger("ProcessRelations").info("Parent Type: "+relationProcessingTemp.parentType+
															" Parent Name: " + relationProcessingTemp.parentName+
															" Parent ID: "+ relationProcessingTemp.parentGUID +
															" Child Type: "+ relationProcessingTemp.childType +
															" Child Name: "+ relationProcessingTemp.childName+
															" Child ID: " + relationProcessingTemp.childGUID);
		}
		
		
	}
	// END EXTRA CODE
}