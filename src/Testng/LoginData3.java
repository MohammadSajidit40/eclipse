package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginData3 {
	
//single dimensional array
	
@Test (dataProvider = "first")
public void logindata (String s) {
	System.out.println(s);
}
	
	@DataProvider(name = "first")
	public String[] data() {
		String[] one= new String[] {
		 "asd",
		 "fgh",
		 "qwe",
		};
		
		return one;
	}
@Test (dataProvider = "second")
public void logindata(Integer i) {
	System.out.println(i);
}
@DataProvider (name="second")
public Integer[] data01() {
	Integer[] sec =new Integer[] {
			123,
			456,
			789,
	};
	return sec;
			
	}
@Test (dataProvider = "third")
public void logindata(Object z) {
	System.out.println(z);
}
@DataProvider (name="third")
public Object[] data02() {
	Object[] thr =new Object[] {
			123,
			"sajid",
			789,
	};
	return thr;
}

}
	


	
	







