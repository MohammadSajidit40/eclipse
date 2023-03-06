package Javaedgedriver;


import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserEX {
	
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
		
		System.out.println("-------------------------->Get Position<--------------------------");
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		
		
		System.out.println("-------------------------->Get Size<------------------------------");
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
		//<---------------->set browser position <------------------>
		
		Point p= new Point(500,500);
		driver.manage().window().setPosition(p);		
		
	    Dimension d= new Dimension(250,240);
		driver.manage().window().setSize(d);
		

	}

	}


