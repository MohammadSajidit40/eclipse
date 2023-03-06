package Javapractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/menu/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); 
		
		WebElement frames=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frames);
		WebElement elect= driver.findElement(By.id("ui-id-4"));
		WebElement utility= driver.findElement(By.id("ui-id-7"));
		
		Actions a= new Actions(driver);
		a.moveToElement(elect).pause(3000).moveToElement(utility).pause(3000).click().build().perform();
		
		
		

	}

}
