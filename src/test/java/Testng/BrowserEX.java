package Testng;


import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserEX {
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
	
	@Test (description = "BrowserEX_WDM_nill", groups = {"Smoke Test"})
	//( priority = 3, invocationCount = 9, enabled = true, groups = {"smoke"})
	public void browserEX() {
//	    public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
//	    WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6)); 
		
		System.out.println("-------------------------->Get Position<--------------------------");
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		
		
		System.out.println("-------------------------->Get Size<------------------------------");
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
		//<---------------->set browser position <------------------>
		
		Point p= new Point(500,500);
		driver.manage().window().setPosition(p);		
		
	    Dimension d= new Dimension(150,100);
		driver.manage().window().setSize(d);
		
		
//		driver.quit();
		

	}

	}


