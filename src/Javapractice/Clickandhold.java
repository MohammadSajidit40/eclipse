package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/selectable/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); 
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		
		WebElement multi= driver.findElement(By.id("selectable"));
		List<WebElement> multiElements = multi.findElements(By.tagName("li"));
		
		Actions a= new Actions(driver);
		a.clickAndHold(multiElements.get(2)).moveToElement(multiElements.get(4)).release().build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.quit();

	}

}
