package nap.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class SortIMendixObjectList {

	
	public static void sortIMendixObjectList(IContext iContext, List<IMendixObject> iMendixObjectList, String attribute ){
		List<IMendixObjectCompare> sortList = new ArrayList<IMendixObjectCompare>();
		Iterator<IMendixObject> iterator = iMendixObjectList.iterator();
		while(iterator.hasNext()){
			IMendixObjectCompare iMendixObjectCompare = new IMendixObjectCompare(iContext,iterator.next(), attribute);
			sortList.add(iMendixObjectCompare);
		}
		Collections.sort(sortList);
		iMendixObjectList.clear();
		Iterator<IMendixObjectCompare> sortListIterator = sortList.iterator();
		while(sortListIterator.hasNext()){
			iMendixObjectList.add(((IMendixObjectCompare) sortListIterator.next()).getIMendixObject());
		}
		
	}
}
