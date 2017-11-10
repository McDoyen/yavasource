// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mendix.actions;

import java.util.Calendar;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class GetYearWeekString extends CustomJavaAction<java.lang.String>
{
	private java.util.Date InputDate;

	public GetYearWeekString(IContext context, java.util.Date InputDate)
	{
		super(context);
		this.InputDate = InputDate;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(InputDate);
	    cal.setFirstDayOfWeek(Calendar.MONDAY);
	    cal.setMinimalDaysInFirstWeek(4);
	    int week = cal.get(Calendar.WEEK_OF_YEAR);
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH)+1;
	    String weekString = (week<10?"0"+week:""+week);
	    Core.getLogger("ExpertDesk").trace("Year " + year + " month " + month + " week" + week + "\nDate:" + cal.toString());
	    if (month==12 && week==1) {
	    	year=year+1;
	    	Core.getLogger("ExpertDesk").trace("Year++ = " + year);
	    }
	    if (month==1 && week >=52) {
	    	year=year-1;
	    	Core.getLogger("ExpertDesk").trace("Year-- = " + year);
	    }
	    Core.getLogger("ExpertDesk").trace("After Year = " + year);
	    return ""+year+"-"+weekString;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetYearWeekString";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}