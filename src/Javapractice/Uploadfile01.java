package Javapractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/upload");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		WebElement upfile= driver.findElement(By.id("file-upload"));
		upfile.sendKeys("C:\\Users\\SAJID\\Downloads\\pexels-fauxels-3184458.jpg");
		driver.findElement(By.id("file-submit")).click();
		
		driver.close();
		
		

	}

}
