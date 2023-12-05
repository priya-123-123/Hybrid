package practice.HybridPractice.tests;

import org.testng.annotations.DataProvider;

import practice.HybridPractice.pages.BaseClass;
import practice.HybridPractice.utility.ExcelDataReader;

public class TestDataProviderClass  {
		
		@DataProvider(name = "DataForRegister")
		public static Object[][] dataforRegister() {
			 
			//String current = System.getProperty("home.dir");
			String excelPath= "C:\\Users\\BSR\\git\\SeleniumTest\\HybridPractice\\TestData\\RegisterData.xlsx";
			ExcelDataReader er=new ExcelDataReader(excelPath, "Sheet1");
			int rowcount = er.getRowCount();
			int colcount = er.getcolumnCount();
			System.out.println("rowcount:"+rowcount);
			System.out.println("colcount:"+colcount);
			Object[][] data = new Object[rowcount-1][colcount];
			for(int i=1;i<rowcount;i++) {
				for(int j=0;j<colcount;j++) {
					data[i-1][j]=er.getcellData(i, j);
					//System.out.println(data[i-1][j]);
				}
			}
			
			
			return data;
			
		}
		
		public static void main(String[] args) {
			dataforRegister();
		}
		
		

}
