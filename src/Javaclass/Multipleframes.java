package Javaclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/frames");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame("frame1");

	    WebElement topframe = driver.findElement(By.id("sampleHeading"));
	    String toptext= topframe.getText();
	     System.out.println("topframe text"+toptext);
	     
	     driver.switchTo().defaultContent();
	  
	    driver.switchTo().frame("frame2");
	    WebElement secondElement= driver.findElement(By.id("sampleHeading"));
	    
	    String bottomtext=secondElement.getText();
	    System.out.println(" second text"+bottomtext);
	    

	}

}
