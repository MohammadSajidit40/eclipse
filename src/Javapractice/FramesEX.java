package Javapractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEX {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		////*[text()="Frames"]
		driver.findElement(By.xpath("//*[text()=\"Frames\"]")).click();
		
		////*[text()="iFrame"]
		driver.findElement(By.xpath("//*[text()=\"iFrame\"]")).click();
		
		//frame
		driver.switchTo().frame("mce_0_ifr");
		
		//webelement by use d.fe
		WebElement text= driver.findElement(By.id("tinymce"));
		
		//string use webelement to gettext
		String toptext= text.getText();
		
		//sysout
		System.out.println(" text"+ toptext);
		
		

	}

}
