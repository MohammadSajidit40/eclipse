package Testng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginData2 {
	
	WebDriver driver;
	

//@BeforeMethod
//public void lanuchbrowser() {
//	
////	WebDriverManager.edgedriver().setup();
////	driver = new EdgeDriver();
////	driver.get("https://demo.guru99.com/test/newtours/");
////	driver.manage().window().maximize();
//////	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
//}
//
//@AfterMethod
//public void closeBrowser() {
//	driver.close();
//}

//@Test(dataProvider="Data")
//
//public void login(String s) {
//	System.out.println(s);
//	
//}
//
//@DataProvider()
//   public String[] Data() {
//	String[] data = new String[] {
//			"abc", 
//			"def",
//			"xyz"
//	
//	};
//  return data;
  
  
//  @Test(dataProvider="Data")
//
//  public void login(Integer s) {
//  	System.out.println(s);
//  	
//  }
//
//  @DataProvider()
//     public Integer[] Data() {
//  	Integer[] data = new Integer[] {
//  			123, 
//  			456,
//  			789,
//  	
//  	};
//    return data;
	
//	 @Test(dataProvider="Data")
//	 
//	   public void login(Object s) {
//	   	System.out.println(s);
//	   	
//	   }
//	 
//	   @DataProvider()
//	      public Object[] Data() {
//	   	Object[] data = new Object[] {
//	   			123, 
//	   			"abc",
//	   			789,
//	   	
//	   	};
//	     return data;
	
	
  // two dimension array
//	 @Test(dataProvider="Data")
//	 
//	   public void login(String[] s) {
//	   	System.out.println(s[0]+"<<"+s[1]);
//	   	
//	   }
//	 
//	   @DataProvider()
//	      public String[][] Data() {
//	   	String[][] data = new String[][] {
//	   			{"123", "abc"},
//	   			{"789","stuv"},
//	   			{"456", "def"},
//	   	
//	   	};
//	     return data;
	
	 // jag array
//	 @Test(dataProvider="Data")
//	 
//	   public void login(String[] s) {
//		 for (int i = 0; i < s.length; i++) {
//	   	System.out.println(s[i]);
//	 }
//	   }
//
//	   @DataProvider()
//	      public String[][] Data() {
//	   	String[][] data = new String[][] {
//	   			{"123", "abc","ykx"},
//	   			{"789","stuv"},
//	   			{"456", "def","ldirm", "bfenfe" },
//	   	
//	   	};
//	     return data;
//	// object array
//	 @Test(dataProvider="Data")
//	 
//	   public void login(Object[] s) {
//		 for (int i = 0; i < s.length; i++) {
//	   	System.out.println(s[i]);
//	 }
//	   }
//
//	   @DataProvider()
//	      public Object[][] Data() {
//	   	Object[][] data = new Object[][] {
//	   			{123, "abc", "ykx"},
//	   			{789,"stuv" },
//	   			{456, "def", "ldirm", "bfenfe"},
//	   	
//	   	};
//	     return data;
	
	// object array
	 @Test(dataProvider="Data")
	   public void login(String s) {
	   	System.out.println(s);  }

	   @DataProvider()
	      public Iterator<String> Data() {
	   	List<String> data = new ArrayList<>();
	   	data.add("i am the king");
	   	data.add("always king");
	   				
	     return data.iterator();
	 
}

}


