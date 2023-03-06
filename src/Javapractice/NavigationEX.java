package Javapractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.navigate().to("https://www.bus.irctc.co.in/home");
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.close();
		
		
		
		
		
		
		
	}

}
