package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Javapractice.excellfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDatawithexcell {
	
	WebDriver driver;
	

@BeforeMethod
public void lanuchbrowser() {
	
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
}

@AfterMethod
public void closeBrowser() {
	driver.close();
}

@Test(dataProvider="logindata", dataProviderClass = excellfile.class)

public void login(String username, String password) {
	driver.findElement(By.name("userName")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("submit")).click();
	boolean text= driver.findElement(By.xpath("//*[text()=\"Login Successfully\"]")).isDisplayed();
	System.out.println(" print the longin note" + " :-"+text);
	Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Login Successfully\"]")).isDisplayed());
}

//@DataProvider()
//   public Object[][] Data() {
//	Object[][] data = new Object[2][2];
//	data [0][0] = "Admin";
//	data [0][1] = "admin123";
//	
//	data [1][0] = "sajid";
//	data [1][1] = "admin";
//  return data;
//  
//}

//@DataProvider (name="logindata")
//public Object[][] logindata() throws Exception {
////public static void main(String[] args) throws IOException {
//	// TODO Auto-generated method stub
//  File excell= new File("C:\\Users\\SAJID\\eclipse-workspace\\JAVA\\src\\demo99.xlsx");
//  System.out.println(excell.exists());
//  FileInputStream fis= new FileInputStream(excell);
//  XSSFWorkbook workbook= new XSSFWorkbook(fis);
//  XSSFSheet sheet= workbook.getSheetAt(0);
//  
//  int rows = sheet.getLastRowNum();
//  int cols= sheet.getRow(0).getLastCellNum();
//  
//  System.out.println( " row count "+rows+"<------>"+"cols count"+cols);
//  
//  String[][] data= new String[rows][cols];
//  for (int i = 0; i < rows; i++) {
//	  for (int j = 0; j < cols; j++) {
//		  DataFormatter df= new DataFormatter();
//		  data[i][j]=(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
//}
//  }
//return data;
 

}

