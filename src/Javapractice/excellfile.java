package Javapractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class excellfile {

	@DataProvider (name="logindata")
	public Object[][] logindata() throws Exception {
//	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//excell connection
	  File excell= new File("C:\\Users\\SAJID\\eclipse-workspace\\JAVA\\src\\demo99.xlsx");
	  System.out.println(excell.exists());
	  FileInputStream fis= new FileInputStream(excell);
	  XSSFWorkbook workbook= new XSSFWorkbook(fis);
	  XSSFSheet sheet= workbook.getSheetAt(0);
	  
//int use get row & last cell num()
	  int rows = sheet.getLastRowNum();
	  int cols= sheet.getRow(0).getLastCellNum();
	  
	  System.out.println( " row count "+rows+"<------>"+"cols count"+cols);
	  
//string array object
	  String[][] data= new String[rows][cols];
//outer for-loop & inner for-loop
	  for (int i = 0; i < rows; i++) {
		  for (int j = 0; j < cols; j++) {
//dataformatter object
			  DataFormatter df= new DataFormatter();
			  data[i][j]=(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
			
		}
	}
	  
	  return data;
	  
//	  workbook.close();
//	  fis.close();
// for each -loop
//	  for (String[] dataArr : data) {
//		  System.out.println(Arrays.toString(dataArr));
//	}
//	
	}

}
