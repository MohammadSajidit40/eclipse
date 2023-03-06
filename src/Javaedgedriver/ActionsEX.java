package Javaedgedriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEX {

	
	@Test(description = "ActionEX_WDM_nill",groups = {"Sanitory Test"})
	//( priority = 3, invocationCount = 9, enabled = true,)
	public void actionEX() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://the-internet.herokuapp.com/jqueryui/menu");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); 
		
		WebElement enable=driver.findElement(By.xpath("//*[text()=\"Enabled\"]"));
		WebElement download=driver.findElement(By.xpath("//*[text()=\"Downloads\"]"));
		WebElement pdf=driver.findElement(By.xpath("//*[text()=\"PDF\"]"));
		WebElement csv=driver.findElement(By.xpath("//*[text()=\"CSV\"]"));
		WebElement excel=driver.findElement(By.xpath("//*[text()=\"Excel\"]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(enable).pause(2000).moveToElement(download).pause(2000).moveToElement(pdf).click().build().perform();
		
		driver.close();
	

	}

}
