package Javaedgedriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesEX1 {

	@Test(description = "ActionEX_WDM_nill",groups = {"Regresstion Test"})
	//( priority = 3, invocationCount = 9, enabled = true,groups = {"Smoke/Regresstion/Sanitory Test"})
	public void actionEX() { 
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	    ////*[text()="Frames"]
	    driver.findElement(By.xpath("//*[text()=\"Frames\"]")).click();
			
	    ////*[text()="iFrame"]
	    driver.findElement(By.xpath("//*[text()=\"Nested Frames\"]")).click();
	    
	   // // TOP FRAME
	    driver.switchTo().frame("frame-top");
	    
	   //child frame :- left
	   driver.switchTo().frame("frame-left");
	   //WebElement create to d.fe
	   WebElement topleft = driver.findElement(By.xpath("/html/body"));
	   //string use to get text
	   String tltext= topleft.getText();
	   //sysout
	   System.out.println("1.Top left"+" :- "+ tltext);
	   
	   //switch to parentframe
	   driver.switchTo().parentFrame();
	   
	   // child frame :- middle
	   driver.switchTo().frame("frame-middle");
	   //webelement create to d.fe
	   WebElement topmiddl= driver.findElement(By.xpath("//div[@id=\"content\"]"));
	   //string use to get text
	   String middletext =topmiddl.getText();
	 //sysout
	   System.out.println( "2.Top middle Text"+" :- "+middletext );
	   
	  //switch to parentframe
	   driver.switchTo().parentFrame();
	   
	   // child frame :- right
	   driver.switchTo().frame("frame-right");
	   //webelement create to d.fe
	   WebElement righttext = driver.findElement(By.xpath("(/html/body)"));
	   //string use to get text
	   String rtext= righttext.getText();
	 //sysout
	   System.out.println("3.Top right text"+ " :- "+rtext);
	   
	   //switch to parentframe
	   driver.switchTo().defaultContent();
	   
	////bottom frame
	   driver.switchTo().frame("frame-bottom");
	   //webelement create to d.fe
	   WebElement bottomtext= driver.findElement(By.xpath("/html/body"));
	   //string use to get text
	   String btext= bottomtext.getText();
	 //sysout
	   System.out.println("4.Bottom Text"+" :-"+btext);
	   
	   driver.quit();
	   
	   
	   
	   
	   
	    
	    
		

	}

}
