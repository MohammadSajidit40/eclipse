package Javapractice;

import java.time.Duration;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.bouncycastle.cms.bc.BcEdDSASignerInfoVerifierBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEX001 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
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
