package jobs.worker;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaPrimitive;

public class TransformationWorker implements Callable<Boolean> {
	private IContext context;
	private Integer limit;
	private String entity;
	private String constraint;
	private Integer offset;
	private Random random;
	private String[] attributes;
	private Boolean randomText;
	
	public TransformationWorker(Boolean randomText, String entity, String constraint ,Integer limit, Integer offset, String[] attributes){
		this.entity = entity;
		this.constraint = constraint;
		this.limit = limit;
		this.offset = offset;
		this.attributes = attributes;
		this.random = new Random((new Date()).getTime());
		this.context = Core.createSystemContext();
		this.randomText = randomText;
	}

	@Override
	public Boolean call() {
		log("Worker started");
		String xpath = (constraint == null) ? "//"+entity: "//"+entity+"["+constraint+"]";
		log("Using ["+limit+"'"+offset+"'"+xpath+"']");
		HashMap<String, String> sortOptions =  new HashMap<String, String>();
		sortOptions.put("id", "asc");
		try{
			List<IMendixObject> objList = Core.retrieveXPathQuery(context, xpath, limit, offset, sortOptions);
			if(objList != null && objList.size() > 0){
				HashMap<String, Integer> validAttributes = checkAttributes(objList.get(0));
				int index = 0;
				for(IMendixObject mxObj: objList){
					for (Map.Entry<String, Integer> entry : validAttributes.entrySet()) {
						int maxLength = (entry.getValue() > 0) ? entry.getValue(): 100;
						int randomLength = (int) (Math.random() * (maxLength/2 - maxLength/4)) + maxLength/4;
						String valueToSet = "";
						if(randomText){
							String prefix = entity.charAt(0)+""+(offset+index)+"-";
							valueToSet = (randomLength-prefix.length() > 0) ? prefix+randomString(randomLength-prefix.length()):randomString(randomLength);
						}else valueToSet = randomSampleText(randomLength);
						
						String orgValue = mxObj.getValue(context, entry.getKey());
						try{
							log("Value set to attribute ["+entry.getKey()+"] : ["+valueToSet+"]");
							mxObj.setValue(context, entry.getKey(), valueToSet);
						}catch(Exception e){
							error("Exception occured ["+e.getMessage()+"]:"+getFullStackTrace(e,0));
							error("Failed to set attribute ["+entry.getKey()+"] to value ["+valueToSet+"]("+valueToSet.length()+" characters) for object ["+entity+"] with guid ["+mxObj.getId().toLong()+"]");
							mxObj.setValue(context, entry.getKey(), orgValue);
							log("Setting value back to previous value");
						}
					}
					index++;
				}
				log("Committing batch");
				try{
					List<IMendixObject> committedList = Core.commitWithoutEvents(context, objList);
					if(committedList == null){
						String guids = getGuidStringFromList(objList);
						error("Failed to commit full object list of entity ["+entity+"] with GUIDs ["+guids+"]");						
					}else if(committedList.size() < objList.size()){	
						String guids = getGuidStringFromList(objList, committedList);						
						error("Not all objects have been committed ["+(objList.size()-committedList.size())+" of "+objList.size()+"]");
						error("Failed to commit objects of entity ["+entity+"] with GUIDs ["+guids+"]");
					}
				}catch(Exception e){
					String guids = getGuidStringFromList(objList);
					error("Exception while saving objects >> ["+e.getMessage()+"]: "+getFullStackTrace(e,0));
					error("Failed to commit objects of entity ["+entity+"] with GUIDs ["+guids+"]");
				}
			}
			log("Worker finished");
			return true;
		}catch(CoreException e){
			error("Exception while retrieving data >> ["+e.getMessage()+"]: "+getFullStackTrace(e,0));
			return false;
		}
	}
	private HashMap<String, Integer> checkAttributes(IMendixObject mxObj){
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		for(int i=0;i<attributes.length;i++){
			IMetaPrimitive currPrimitive = mxObj.getMetaObject().getMetaPrimitive(attributes[i]);
			if(currPrimitive == null ||	currPrimitive.getType() != IMetaPrimitive.PrimitiveType.String) continue;
			list.put(attributes[i], currPrimitive.getLength());
		}
		return list;
	}
	private String randomString(int length) {
		// credits to user Jameskittu from stackoverflow.com
		char[] values = {' ','a','b','c','d','e','f','g','h','i','j',
				'k','l','m','n','o','p','q','r','s','t',' ',
				'u','v','w','x','y','z',' ','a','b','c','d',
				'e','f','g','h','i','j','k','l','m','n','o',
				'p','q','r','s','t',' ','u','v','w','x','y',
				'z','0','1','2','3','4','5','6','7','8','9'};
		String out = "";
		for (int i=0;i<length;i++) {
			int idx = random.nextInt(values.length);
	        out += (random.nextInt(values.length) % 2 == 0) ? values[idx]+"".toUpperCase(): values[idx];
		}
	    return out;
	}
	private String randomSampleText(int length){
		String out = "";
		String lorum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas lacus urna, posuere nec gravida vel, finibus vel magna. Pellentesque lacinia orci at congue tincidunt. Donec nisl arcu, maximus vel diam molestie, vehicula scelerisque nunc. Duis ut turpis nec diam feugiat imperdiet. Proin scelerisque auctor facilisis. Etiam non facilisis massa. Aliquam erat volutpat. ";
		lorum += "Morbi felis sapien, molestie auctor diam vitae, condimentum volutpat ex. Donec finibus odio eget fringilla imperdiet. Cras a mattis ante. In vel velit malesuada, imperdiet lectus at, egestas risus. Fusce consequat nibh id dignissim hendrerit. Suspendisse sed diam sit amet orci laoreet blandit nec ut massa. In sed consectetur enim. Vivamus ultricies sapien et auctor maximus. Mauris urna purus, malesuada vel magna id, dapibus tincidunt turpis. Integer scelerisque sapien in euismod vestibulum. ";
		lorum += "Fusce ultricies sem sapien, aliquam iaculis est faucibus eget. Sed ullamcorper, magna eu gravida consectetur, risus nulla tempus nibh, quis elementum magna arcu sit amet felis. Suspendisse hendrerit ante id neque laoreet efficitur. Nam at eros elit. Vivamus bibendum magna id nisl tempus varius. Maecenas lobortis porttitor neque, id tincidunt leo pulvinar nec. Cras porttitor nisi vel justo dapibus, imperdiet condimentum ante viverra. Duis vel commodo nisl. In tempor tincidunt faucibus. Ut eget dictum tortor, sit amet tempor odio. Donec a auctor mauris. Phasellus venenatis iaculis risus commodo sodales. Nulla pulvinar accumsan euismod. Aenean in iaculis tortor. In elementum libero velit, ac aliquet neque finibus ut. ";
		lorum += "Ut in enim scelerisque, euismod mi at, bibendum velit. Nam tellus metus, pellentesque a velit quis, tincidunt consectetur justo. Suspendisse ornare tempor ullamcorper. In vitae mi a neque iaculis dictum sit amet a nibh. Aliquam erat volutpat. In hac habitasse platea dictumst. Quisque rhoncus arcu quis porta congue. Nunc pretium a dolor auctor commodo. Vestibulum at venenatis ante. Phasellus et mauris eu purus congue egestas. Morbi a imperdiet felis. Nulla lacinia faucibus lorem eu molestie. Nullam ac mi sed est maximus rhoncus in maximus diam. Maecenas rhoncus suscipit dolor eu venenatis. Integer sagittis, mi sit amet accumsan euismod, augue metus rutrum neque, venenatis commodo nisi mauris ut nibh. ";
		lorum += "Curabitur at auctor libero. Aenean quis magna cursus, porta justo sed, suscipit odio. Nunc quis bibendum velit. Sed at blandit mi. Phasellus pulvinar nulla sapien, a malesuada ex dictum at. Praesent auctor sagittis leo at sollicitudin. In bibendum est eu leo lacinia, sit amet posuere diam finibus. Phasellus et urna eu elit dapibus interdum. Donec bibendum risus at aliquam bibendum. Proin suscipit elementum metus ac accumsan. Donec a massa sed odio hendrerit luctus. Quisque consectetur sodales augue eu varius.";
		
		int startPos = lorum.indexOf(" ", (int) Math.random() * (lorum.length()-50));
		int endPos = lorum.indexOf(" ",(startPos+length-20)) == -1 ? lorum.length(): lorum.indexOf(" ",startPos+length-20); 
		out = lorum.substring(startPos, endPos);
		return out;
	}
	private String getGuidStringFromList(List<IMendixObject> objList){
		return getGuidStringFromList(objList, null);
	}
	private String getGuidStringFromList(List<IMendixObject> objList, List<IMendixObject> exclusionList){
		String guids = "";
		for(IMendixObject mxObj: objList) 		guids += mxObj.getId().toLong()+", ";						
		if(exclusionList != null){
			for(IMendixObject mxObj: exclusionList)	guids.replace(mxObj.getId().toLong()+", ", "");
		}
		if(guids.length() > 2) guids = guids.substring(0, guids.length() - 2);		
		return guids;
	}
	public static StringBuilder getFullStackTrace(Throwable e, int level) {
		StackTraceElement[] stes = e.getStackTrace();
		StringBuilder stackTrace = new StringBuilder(1000); 
		stackTrace.append(e.getClass().getName()).append(":");
		if (e.getMessage()!=null) stackTrace.append(e.getMessage());
		stackTrace.append("\n\n");
		if (stes!=null) {
			for(StackTraceElement ste:stes) {
				stackTrace.append("\n  ").append(ste.getClassName()).append(".").append(ste.getMethodName()).append(" (").append(ste.getFileName()).append(":").append(ste.getLineNumber()).append( ")");
			}
		}
		if (e.getCause()!=null) {
			if (level<20)
				stackTrace.append(getFullStackTrace(e.getCause(), level+1));
		}
		return stackTrace;
	}
	
	@Override
	public String toString(){
		return "TransformationWorker";
	}
	private void log(String input){
		Core.getLogger("ExpertDesk").trace("[job."+this.toString()+"."+Thread.currentThread().getName()+"] " + input);
	}
	private void error(String input){
		Core.getLogger("ExpertDesk").error("[job."+this.toString()+"."+Thread.currentThread().getName()+"] " + input);
	}
}
