package Testng;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Testngprogram {
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
	
	
	@Test(description = "Testngprogram_WDM_nill", groups = {"Smoke Test"})
//	    (priority = 3, invocationCount = 9, enabled = true, groups = {"smoke"})
	    public void testngprogram() {
//	    WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
	    driver.get("https://jqueryui.com/selectable/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6)); 
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		
		WebElement multi= driver.findElement(By.id("selectable"));
		List<WebElement> multiElements = multi.findElements(By.tagName("li"));
		
		Actions a= new Actions(driver);
		a.clickAndHold(multiElements.get(2)).moveToElement(multiElements.get(4)).release().build().perform();
		
		driver.switchTo().defaultContent();
		
//		driver.quit();
	}
	
	
	@Test (description = "ActionEX_WDM_nill")
//      (priority = 3, invocationCount = 9, enabled = true, groups = {"smoke"})
   	    public void Scroling() throws InterruptedException {
//	    WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
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
		Assert.assertTrue(true);

//		org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(100, 100);
//		driver.manage().window().setSize(d);	
//	  driver.quit();
	}
}
