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


public class ActionEX {
	
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
//	public void launchBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
	}
	
	
	@AfterMethod
	public void closeBrowser() {
	driver.quit();
	}
	
	
	@Test(priority = 1, description = "ActionEX_WDM_nill",groups = {"Smoke Test"})
	//( priority = 3, invocationCount = 9, enabled = true,)
	     public void actionEX() {
//	     public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
//	    driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/menu/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		WebElement frames=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frames);
		WebElement elect= driver.findElement(By.id("ui-id-4"));
		WebElement utility= driver.findElement(By.id("ui-id-7"));
		
		Actions a= new Actions(driver);
		a.moveToElement(elect).pause(3000).moveToElement(utility).pause(3000).click().build().perform();
		
//		org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(100, 100);
//		driver.manage().window().setSize(d);
		
//		driver.quit();
	
	}
	
	@Test(priority = 2, description = "ActionEX2_WDM_nill",groups = {"Regression Test"})
	public void actionEX2() {
//		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
//		    WebDriverManager.edgedriver().setup();
//		    driver = new ChromeDriver();
		    driver.get("https://jqueryui.com/menu/");
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); 
			
			WebElement frames=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
			driver.switchTo().frame(frames);
			WebElement elect= driver.findElement(By.id("ui-id-4"));
			WebElement utility= driver.findElement(By.id("ui-id-7"));
			
			Actions a= new Actions(driver);
			a.moveToElement(elect).pause(3000).moveToElement(utility).pause(3000).click().build().perform();
			
//			org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(100, 100);
//			driver.manage().window().setSize(d);
			
//			driver.quit();
	}
	
	@Test(priority = 3, description = "ActionEX2_WDM_nill",groups = {"Regression Test"})
	public void actionEX3() {
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
	
	
	}
}
