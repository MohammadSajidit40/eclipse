package Javaedgedriver;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrolingupdownEX {
	
	
	@Test(description = "ActionEX_WDM_nill",groups = {"Regresstion Test"})
	//( priority = 3, invocationCount = 9, enabled = true,groups = {"Smoke/Regresstion/Sanitory Test"})
	public void actionEX() throws InterruptedException { 

	//public static void main(String[] args) throws InterruptedException {
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); 
		
		
		for(int i=1; i<=20; i++) {
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
		}
			
			
		for(int i=1;i<=20;i++) {
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200)");
			Thread.sleep(2000);
		}
			
			
			
		}
		
		}
		
	


