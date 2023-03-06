package Javaedgedriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotupfileEX {
	

	@Test(description = "ActionEX_WDM_nill",groups = {"Regresstion Test"})
	//( priority = 3, invocationCount = 9, enabled = true,groups = {"Smoke/Regresstion/Sanitory Test"})
	public void actionEX() throws InterruptedException, AWTException { 
	//public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://easyupload.io/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.findElement(By.xpath("//*[@class=\"dz-button\"]")).click();
		Thread.sleep(3000);
		
		//control + c
		String path = "Downloads\\pexels-fauxels-3184458.jpg";
		StringSelection setpa= new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(setpa, null);
		
		
		Robot robot = new Robot(); 
		//keypress control+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		// keyrelease control+V
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//keypress/release enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
