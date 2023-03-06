package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginData {
	
	private static final boolean True = false;
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

@Test(dataProvider="Data", timeOut = 10000)

public void login(String username, String password) {
	driver.findElement(By.name("userName")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("submit")).click();
	boolean text= driver.findElement(By.xpath("//*[text()=\"Login Successfully\"]")).isDisplayed();
	System.out.println(" print the longin note" + " :-"+text);
	Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Login Successfully\"]")).isDisplayed());

	
//	System.out.println("count" +Thread.currentThread().getId());

}


@DataProvider(parallel = True)
   public Object[][] Data() {
	Object[][] data = new Object[6][2];
	
	data [0][0] = "Admin";
	data [0][1] = "admin123";
	
	data [1][0] = "sajid";
	data [1][1] = "admin";
	
	data [2][0] = "sajid";
	data [2][1] = "admin";
	
	data [3][0] = "sajid";
	data [3][1] = "admin";
	
	data [4][0] = "sajid";
	data [4][1] = "admin";
	
	data [5][0] = "sajid";
	data [5][1] = "admin";
  return data;
  
}

}


