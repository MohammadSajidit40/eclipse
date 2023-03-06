package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesEX {
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
	
	
	@Test
	(description = "FramesEX_WDM_nill",groups = {"Regression Test"})
	//( priority = 3, invocationCount = 9, enabled = true, groups = {"smoke"})
	public void framesEX() {
//	    public static void main(String[] args) {
//		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
//	    WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		////*[text()="Frames"]
		driver.findElement(By.xpath("//*[text()=\"Frames\"]")).click();
		
		////*[text()="iFrame"]
		driver.findElement(By.xpath("//*[text()=\"iFrame\"]")).click();
		
		//frame
		driver.switchTo().frame("mce_0_ifr");
		
		//webelement by use d.fe
		WebElement text= driver.findElement(By.id("tinymce"));
		
		//string use webelement to gettext
		String toptext= text.getText();
		
		//sysout
		System.out.println(" text"+ toptext);
		
//		org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(100, 100);
//		driver.manage().window().setSize(d);
//		
//		driver.quit();

	}

}
