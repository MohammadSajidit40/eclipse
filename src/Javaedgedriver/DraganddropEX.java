package Javaedgedriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DraganddropEX {

	@Test(description = "ActionEX_WDM_nill",groups = {"Smoke Test"})
	//( priority = 3, invocationCount = 9, enabled = true,groups = {"Smoke/Regresstion/Sanitory Test"})
	public void actionEX() { 
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); 
		
		WebElement frames=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frames);
		
//		Actions b= new Actions(driver);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions b= new Actions(driver);
		
		b.dragAndDrop(draggable, droppable).build().perform();
		
		

	}

}
