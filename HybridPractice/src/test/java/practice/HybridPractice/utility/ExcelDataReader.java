package practice.HybridPractice.utility;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	//Contructor which initialises workbook and sheet of given excel sheet
public ExcelDataReader(String excelpath, String sheetname) {
	try {
		workbook=new XSSFWorkbook(excelpath);
		sheet=workbook.getSheet(sheetname);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
	
}

public static int  getRowCount() {
	int rows=0;
	
	rows=sheet.getPhysicalNumberOfRows();
	
	return rows;
	
}

public static int  getcolumnCount() {
	
	
	
	return sheet.getRow(0).getPhysicalNumberOfCells();
	
}

public static Object getcellData(int rownum, int colnum) {
	DataFormatter formatter= new DataFormatter();
	Object value= formatter.formatCellValue(sheet.getRow(rownum).getCell(colnum));
	return value;
}


	
}
