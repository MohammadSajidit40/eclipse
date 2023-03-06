package Javaclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/nestedframes");
	  
	    driver.manage().window().maximize();
//	    driver.findElement(By.xpath("//*[text()=\"Nested Frames\"]")).click();
	    
	    driver.switchTo().frame("frame1");
	    
	    WebElement parenttextElement =driver.findElement(By.xpath("//*[text()=\"Parent frame\"]"));
	    String parentString= parenttextElement.getText();
	    System.out.println(" parent text"+" "+parentString);

	
	    @SuppressWarnings("unused")
		WebElement nestElement= driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]"));
	    driver.switchTo().frame("nestElement");
	    WebElement childtextElement =driver.findElement(By.xpath("//*[text()=\"Child Iframe\"]"));
	    String childString= childtextElement.getText();
	    System.out.println(" child text"+" "+childString);
	    
	    
	}	
	    }

	


