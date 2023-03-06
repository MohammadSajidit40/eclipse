package Testng;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrolingupdownEX {
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
	    WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	@AfterMethod
	public void closebrower() {
		driver.quit();
	}
	

	@Test (description = "ScrolingupdownEX_WDM_nill", groups = {"Sanitory Test"})
	//( priority = 3, invocationCount = 9, enabled = true, groups = {"smoke"})
	    public void scrolingupdownEX() throws InterruptedException {
//  	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
//	    WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6)); 
		
		
		for(int i=1; i<=20; i++) {
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
		}
			
			
		for(int i=1;i<=20;i++) {
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200)");
			Thread.sleep(2000);
		}
	
//		org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(100, 100);
//		driver.manage().window().setSize(d);
//		driver.close();
			
		}
		
		}
		
	


