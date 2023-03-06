package Javaedgedriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hrmlogin  {
	
	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
	

	        driver.findElement(By.xpath("//*[@name=\"userName\"]")).sendKeys("Mohammadsajid015");
	        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("S@jid#8686");
	        driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
	        boolean Text = driver.findElement(By.xpath("//*[text()=\"Login Successfully\"]")).isDisplayed();
	        System.out.println("selected element"+":-"+ Text);
//		driver.close();
		
	}

	
		
	}

