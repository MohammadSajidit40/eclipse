package Testng;

import org.testng.annotations.Test;

public class LoginDataseparet {

// indices is used	
//single dimensional array
	
@Test(dataProvider="first", dataProviderClass = LoginDatasupport.class)
public void logindata(String[] s) throws Exception{
	System.out.println(s[0]+ "<<"+ s[1]);
}


@Test(dataProvider="second",dataProviderClass = LoginDatasupport.class)
public void logindata(Object[] s) throws Exception{
	System.out.println(s[0]+ "<<"+ s[1]);
}

@Test(dataProvider="Third", dataProviderClass = LoginDatasupport.class)
public void logindata01(Object[] s) throws Exception{
	for (int i = 0; i < s.length; i++) {
		System.out.println(s);	
	}
}


@Test (dataProvider = "four", dataProviderClass = LoginDatasupport.class)
public void loging(Object[] s) {
	System.out.println(s);
}



}


	


	
	







