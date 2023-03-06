package Testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationEX {
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();	  
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}

	@Test 
	(description = "Navigation_WDM_nill", groups = {"Smoke Test"})
	//( priority = 3, invocationCount = 9, enabled = true, groups = {"smoke"})
	public void Navigation() {
//      public static void main(String[] args) {
		// TODO Auto-generated method stub
//  	System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
//      WebDriverManager.chromedriver().setup();	  
//		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.navigate().to("https://www.bus.irctc.co.in/home");
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
//		org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(100, 100);
//		driver.manage().window().setSize(d);
//		driver.close();
		
		
		
		
		
		
		
	}

}
