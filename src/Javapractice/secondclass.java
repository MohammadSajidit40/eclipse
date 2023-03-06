package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondclass {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//*[text()=\"Sortable Data Tables\"]")).click();
		
		//row data in list webelement
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr"));
		
		//cols data in list webelement
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr[1]/td"));
		
		//outer for loop & inner for loop 
		for(int row=1; row<=rows.size();row++) {
			for(int col=1; col<=cols.size();col++) {
		//	String text = driver.findElement(By.xpath("//table[@id=\\\"table1\\\"]/tbody/tr["+ row +"]/td["+ col +"]")).getText();
		//string text 
				String text = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+ row +"]/td["+ col +"]")).getText();	
				System.out.println( "row is  "+ row +"cols is"+ col +"and data is"+ text);
			}
		}

	}

}
