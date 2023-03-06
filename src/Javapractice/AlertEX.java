package Javapractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
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
