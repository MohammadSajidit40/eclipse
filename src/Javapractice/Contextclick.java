package Javapractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/context_menu");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); 
		
		WebElement rightclick= driver.findElement(By.id("hot-spot"));
		Actions a= new Actions(driver);
		a.contextClick(rightclick).build().perform();
		
		String text= driver.switchTo().alert().getText();
		System.out.println("Text is "+" :- "+text);
		driver.switchTo().alert().accept();
		
		driver.quit();

	}

}
