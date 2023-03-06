package Javaedgedriver;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstclassEX {

	@Test(description = "ActionEX_WDM_nill",groups = {"Smoke Test"})
	//( priority = 3, invocationCount = 9, enabled = true,groups = {"Smoke/Regresstion/Sanitory Test"})
	public void actionEX() throws InterruptedException { 
	
	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://demo.guru99.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//To Open New Tours link;
		driver.findElement(By.xpath("//*[text()=\"New Tours\"] ")).click();
		Thread.sleep(1000);
		
		////*[text()="REGISTER"]
		driver.findElement(By.xpath("//*[text()=\"REGISTER\"] ")).click();
		Thread.sleep(1000);
		
		//firstName
		driver.findElement(By.name("firstName")).sendKeys("Mohammad");
		Thread.sleep(1000);
		
		//lastName
		driver.findElement(By.name("lastName")).sendKeys("sajid");
		
		//phone
		driver.findElement(By.name("phone")).sendKeys("8686150755");
		Thread.sleep(1000);
		
		//Email(userName)
		driver.findElement(By.id("userName")).sendKeys("Mohammadsajid015@gmail.com");
		Thread.sleep(1000);
		
		//address1
		driver.findElement(By.name("address1")).sendKeys("Parawada");
		Thread.sleep(1000);
		
		//city
		driver.findElement(By.name("city")).sendKeys("visakhapatnam");
		Thread.sleep(1000);
		
		//state
		driver.findElement(By.name("state")).sendKeys("Andhra Pradhes");
		Thread.sleep(1000);
		
		//postalCode
		driver.findElement(By.name("postalCode")).sendKeys("531021");
		Thread.sleep(1000);
		
		//dropdown of selection
		WebElement countrylistElement= driver.findElement(By.name("country"));
		Select countrysel= new Select(countrylistElement);
		List<WebElement> options= countrysel.getOptions();
		
		countrysel.selectByIndex(30);
		
		//User Name email
		driver.findElement(By.id("email")).sendKeys("Mohammadsajid015");
		Thread.sleep(1000);
		
		//password
		driver.findElement(By.name("password")).sendKeys("S@jid#8686");
		Thread.sleep(1000);
		
		//confirmPassword
		driver.findElement(By.name("confirmPassword")).sendKeys("S@jid#8686");
		Thread.sleep(1000);
	
		//submit
		driver.findElement(By.name("submit"));
		
		driver.close();
		
		System.out.println("demo.Guru99");
	}	
	

}
