package Javapractice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrolingupdownEX {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
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
		
	


