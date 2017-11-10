// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package reporting.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import nl.mansystems.mendiximportexport.SharedFunctions;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.DateFormatConverter;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.connectionbus.data.IDataRow;
import com.mendix.systemwideinterfaces.connectionbus.data.IDataTable;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class GetIndividualCIsFromOQLJava extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String OQLString;
	private java.lang.Boolean GenerateExcel;
	private IMendixObject __ReportSelectParameter;
	private reporting.proxies.ReportSelect ReportSelectParameter;
	private java.lang.String EmptyString;

	public GetIndividualCIsFromOQLJava(IContext context, java.lang.String OQLString, java.lang.Boolean GenerateExcel, IMendixObject ReportSelectParameter, java.lang.String EmptyString)
	{
		super(context);
		this.OQLString = OQLString;
		this.GenerateExcel = GenerateExcel;
		this.__ReportSelectParameter = ReportSelectParameter;
		this.EmptyString = EmptyString;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.ReportSelectParameter = __ReportSelectParameter == null ? null : reporting.proxies.ReportSelect.initialize(getContext(), __ReportSelectParameter);

		// BEGIN USER CODE
		IContext context = this.getContext();
		Core.getLogger("DynamicOQL").debug("Retrieving data");
		Core.getLogger("DynamicOQL").trace("OQL:" + OQLString);
		IDataTable iDataTable = Core.retrieveOQLDataTable(context,OQLString);
		
		Workbook wb = null;
		Sheet sheet = null;
		Row headerRow = null;
		CellStyle csString = null;
		CellStyle csDate = null;

		if (GenerateExcel) {
			wb = new SXSSFWorkbook();
			CellStyle csHeader = wb.createCellStyle();
			csString = wb.createCellStyle();
			csDate = wb.createCellStyle();
			Font fontHeader = wb.createFont();
			Font fontBody = wb.createFont();
			fontHeader.setFontHeightInPoints((short) 11);
			//fontHeader.setColor( IndexedColors.RED.getIndex() );
			fontHeader.setBoldweight(Font.BOLDWEIGHT_BOLD);
			fontBody.setFontHeightInPoints((short) 11);
			csString.setFont(fontBody);
			csDate.setFont(fontBody);
			csHeader.setFont(fontHeader);

			Locale locale = Locale.getDefault();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
			String javaDateFormatPattern = ((SimpleDateFormat)dateFormat).toPattern();
		    String excelFormatPattern = DateFormatConverter.convert(locale, javaDateFormatPattern);
			DataFormat dfDate = wb.createDataFormat();
			csDate.setDataFormat(dfDate.getFormat(excelFormatPattern));

			sheet = wb.createSheet("Results");
			headerRow = sheet.createRow(0);
			for(int i=1;i<iDataTable.getSchema().getColumnCount();i++) { // ID column is assumed the first!!!
				String columnName = iDataTable.getSchema().getColumnSchema(i).getName();
				Cell cell = headerRow.createCell(i-1); 
				cell.setCellValue(columnName);
				cell.setCellStyle(csHeader);
			}
		}


		int excelRowNumber=1;
		List<IMendixIdentifier> iMendixIdentifierList = new ArrayList<IMendixIdentifier>();
		int i=1;
		Core.getLogger("DynamicOQL").debug("Creating Mendix identifiers for rows");
		for (IDataRow dataRow:iDataTable.getRows()) {
			//Core.getLogger("DynamicOQL").info("Type of ID is " + dataRow.getValue(context, "ID").getClass().getName());
			String id = dataRow.getValue(context, "ID");
			if (i%100==0) {
				Core.getLogger("DynamicOQL").debug("Row " + i + " of " + iDataTable.getRowCount());
			}
			//List<IMendixObject> iMendixObjectList = Core.retrieveXPathQuery(context, "//" + Request.entityName + "[ID='"+id+"']" );
			IMendixIdentifier iMendixIdentifier = Core.createMendixIdentifier(id);
			iMendixIdentifierList.add(iMendixIdentifier);
			
			if (GenerateExcel) {
				Row row = sheet.createRow(excelRowNumber);
				excelRowNumber++;
				for(int j=1;j<iDataTable.getSchema().getColumnCount();j++) { // ID column is assumed the first!!!
					Object value = dataRow.getValue(context, j);
					Cell cell = row.createCell(j-1);
					if( value==null) {
						cell.setCellValue(EmptyString);
						cell.setCellStyle(csString);
					} else if(value instanceof String) {
						cell.setCellValue((String)value);
						cell.setCellStyle(csString);
					} else if( value instanceof Date) {
						cell.setCellValue((Date)value);
						cell.setCellStyle(csDate);
					} else if( value instanceof Integer) {
						cell.setCellValue((Integer)value);
						cell.setCellStyle(csString);
					} else if( value instanceof Long) {
						cell.setCellValue((Long)value);
						cell.setCellStyle(csString);
					} else if( value instanceof Boolean) {
						cell.setCellValue((Boolean)value);
						cell.setCellStyle(csString);
					} else if( value instanceof Float) {
						cell.setCellValue((Float)value);
						cell.setCellStyle(csString);
					} else {
						cell.setCellValue(value.toString());
						cell.setCellStyle(csString);
					}
				}
			}
			
			i++;
		}
		Core.getLogger("DynamicOQL").debug("Retrieving id list");
		List<IMendixObject> iMendixObjectList = Core.retrieveIdList(context, iMendixIdentifierList);
		Core.getLogger("DynamicOQL").debug("Retrieving data/rows done");
		
		if (GenerateExcel) {
			for(int j=headerRow.getFirstCellNum();j<=headerRow.getLastCellNum();j++) {
				sheet.autoSizeColumn(j);
			}
			try {
				File tempFile = File.createTempFile("temp-report-excel", ".xlsx");
			    OutputStream out=new FileOutputStream(tempFile);
			    wb.write(out);
			    out.close();
			    InputStream in = new FileInputStream(tempFile);
				Core.storeFileDocumentContent(context, ReportSelectParameter.getMendixObject(), in);
				ReportSelectParameter.setName("report-excel.xlsx");
			} catch (IOException e){
				Core.getLogger(this.toString()).error("IO Exception " + SharedFunctions.getStackTrace(e));				    	
		    }
		}
		
		return iMendixObjectList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetIndividualCIsFromOQLJava";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
