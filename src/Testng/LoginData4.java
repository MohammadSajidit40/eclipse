package Testng;
//indices is used	
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginData4 {
	
//single dimensional array
	
@Test(dataProvider="first")
public void logindata(String[] s) throws Exception{
	System.out.println(s[0]+ "<<"+ s[1]);
}
@DataProvider (name = "first",indices = {0,2})
public String[][] dsp(){
	String[][] one= new String [][] {
		{"1234", "qwer"},
		{"0987", "poiuy"},
		{"djfkdf", "jsbjc"},
	};
		return one;
	}

@Test(dataProvider="second")
public void logindata(Object[] s) throws Exception{
	System.out.println(s[0]+ "<<"+ s[1]);
}
@DataProvider (name = "second",indices = {1})
public Object[][] dsp01(){
	Object[][] sec= new Object [][] {
		{123, "qwer"},
		{598, "poiuy"},
		{456, "jsbjc"},
	};
		return sec;
	}
@Test(dataProvider="Third")
public void logindata01(Object[] s) throws Exception{
	for (int i = 0; i < s.length; i++) {
		System.out.println(s);	
	}
}
@DataProvider (name = "Third",indices = {2})
public Object[][] dsp02(){
	Object[][] sec= new Object [][] {
		{123, "qwer", 456},
		{598, "poiuy", 896, "asdf"},
		{456, "jsbjc", "qwer", 123, "qwer"},
	};
		return sec;
}
@Test (dataProvider = "four")
public void loging(Object[] s) {
	System.out.println(s);
}
@DataProvider(name = "four",indices = {1})
public Iterator<String> logdata() {
	List<String> asd= new ArrayList<String>();
	 asd.add("qwer");
	 asd.add("lkjj");
	return asd.iterator();
}


}


	


	
	







