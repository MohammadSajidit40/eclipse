package Javaedgedriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertEX {

	
	@Test(description = "ActionEX_WDM_nill",groups = {"Sanitory Test"})
	//( priority = 3, invocationCount = 9, enabled = true,groups = {"Smoke/Regresstion/Sanitory Test"})
	public void actionEX() throws InterruptedException { 
//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//JavaScript Alerts
		driver.findElement(By.xpath("//*[text()=\"JavaScript Alerts\"]")).click();
		Thread.sleep(2500);
		//1.alert with signel option
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(2500);
		driver.switchTo().alert().accept();
		//2.alert with double option
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		//3.alert with sendkeys
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("MohammadSajid");
		Thread.sleep(2500);
		driver.switchTo().alert().accept();
		

	}

}
