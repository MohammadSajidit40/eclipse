package Javaclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()=\"✕\"]")).click();

		driver.findElement(By.xpath("//*[text()=\"Fashion\"]"));
		driver.close();

	    
	    
		

	}

}
