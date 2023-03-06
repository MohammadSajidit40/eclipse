package Testng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDatasupport {
// indices is used	
//single dimensional array
	


@DataProvider (name = "first")
public String[][] dsp(){
	String[][] one= new String [][] {
		{"1234", "qwer"},
		{"0987", "poiuy"},
		{"djfkdf", "jsbjc"},
	};
		return one;
	}

@DataProvider (name = "second")
public Object[][] dsp01(){
	Object[][] sec= new Object [][] {
		{123, "qwer"},
		{598, "poiuy"},
		{456, "jsbjc"},
	};
		return sec;
	}

@DataProvider (name = "Third")
public Object[][] dsp02(){
	Object[][] sec= new Object [][] {
		{123, "qwer", 456},
		{598, "poiuy", 896, "asdf"},
		{456, "jsbjc", "qwer", 123, "qwer"},
	};
		return sec;
}

@DataProvider(name = "four")
public Iterator<String> logdata() {
	List<String> asd= new ArrayList<String>();
	 asd.add("qwer");
	 asd.add("lkjj");
	return asd.iterator();
}

}


	


	
	







