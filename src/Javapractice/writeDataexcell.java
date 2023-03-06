package Javapractice;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataexcell {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
//		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("s.no");
		sheet.getRow(0).createCell(1).setCellValue("Descrition");
		sheet.getRow(0).createCell(2).setCellValue(" start time");
		sheet.getRow(0).createCell(3).setCellValue("stop time");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("01");
		sheet.getRow(1).createCell(1).setCellValue("manual testing");
		sheet.getRow(1).createCell(2).setCellValue("morning");
		sheet.getRow(1).createCell(3).setCellValue("moring");
		
		File Excell01=new File ("C:\\Users\\SAJID\\eclipse-workspace\\JAVA\\src\\Excellfiles\\test.xlsx");
		FileOutputStream foS= new FileOutputStream(Excell01);
		workbook.write(foS);
		workbook.close();
	}

}
