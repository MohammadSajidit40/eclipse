package Javaclass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Fistclass {




	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SAJID\\Downloads\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
//	    Thread.sleep(3000);
//	    driver.navigate().to("https://www.irctc.co.in/nget/train-search");
//	    driver.findElement(By.xpath(" //*[text()=' BUSES ']")).isDisplayed();
//	    driver.navigate().back();
//	    Thread.sleep(3000);
//	    driver.navigate().to("https://www.air.irctc.co.in/");
//	    Thread.sleep(3000);
////	    driver.navigate().forward();
//	    driver.navigate().to("https://www.air.irctc.co.in/");
	    
	    //scrolldown
	   for(int i=0; i<=5;i++) {
//		((JavascriptExecutor)driver).executeScript("Window.scrollBy(0,200)");
		((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
	   }
	   
		//scrollup
		for (int i=0; i<=5;i++) {
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,-200)");
			Thread.sleep(1000);
	   }
	}

}
