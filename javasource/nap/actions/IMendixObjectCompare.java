package nap.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class IMendixObjectCompare implements Comparable<IMendixObjectCompare>{
	IMendixObject iMendixObject;
	IContext iContext;
	String attribute;
	
	public IMendixObjectCompare(IContext iContext, IMendixObject iMendixObject, String attribute){
		this.iContext = iContext;
		this.attribute = attribute;
		this.iMendixObject = iMendixObject;
	}
		
	public int compareTo(IMendixObjectCompare iMendixObjectCompare){
		return iMendixObject.getValue(iContext, attribute).toString().toUpperCase().compareTo(iMendixObjectCompare.getIMendixObject().getValue(iContext, attribute).toString().toUpperCase());
	}
	
	public IMendixObject getIMendixObject(){
		return iMendixObject;
	}
}