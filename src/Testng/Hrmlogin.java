package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Hrmlogin  {
	WebDriver driver;
	
	
//@BeforeMethod
//public void launchbrowser() {
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	driver.get("https://demo.guru99.com/test/newtours/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
//}
//
//@AfterMethod
//public void closebrowser() {
//		driver.close();
//	}
	
@Test(dataProvider="logindata")
	
	public void Login(String username, String password)throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
	        driver.findElement(By.xpath("//*[@name=\"userName\"]")).sendKeys(username);
	        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(password);
	        driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
	        boolean Text = driver.findElement(By.xpath("//*[text()=\"Login Successfully\"]")).isDisplayed();
	        System.out.println("selected element"+":-"+ Text);
	}


@DataProvider(name="logindata")
public Object[][] data() {
	Object[][] data = new Object[2][2];
	data [0][0]="Mohammadsajid";
	data [0][1]="S@jid#8686";
	
	data [1][0]= "Mohammadsajid015";
	data [1][1]= "S@jid#8686";

	return null;
	
}
	
		
	}

