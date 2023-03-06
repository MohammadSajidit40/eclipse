package Testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickandholdEX {
	WebDriver driver;
	
	
	@BeforeMethod
	@Parameters (value ={"Browser"})
	public void launchbrowser(String brName){
	if (brName.equalsIgnoreCase("chrome")){
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();}
	else if (brName.equalsIgnoreCase("edge")){
	  WebDriverManager.edgedriver().setup();
	  driver =new EdgeDriver();}
	else if (brName.equalsIgnoreCase("firefox")){
	  WebDriverManager.firefoxdriver().setup();
	  driver =new FirefoxDriver();
	}
//	public void launchbrowser() {
//	    WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
	

	@Test
	(description = "ClickandholdEX_WDM_nill",groups = {"Smoke Test"})
	//( priority = 3, invocationCount = 9, enabled = true, groups = {"smoke"})
	public void clickandholdEX() {
//      public static void main(String[] args) {
//      System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
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
		
//		org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(100, 100);
//		driver.manage().window().setSize(d);
//		
//		
//		driver.quit();
	

	}

}
