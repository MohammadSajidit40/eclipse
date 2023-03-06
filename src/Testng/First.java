package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testclass.class)


public class First {

	
	

	@BeforeSuite
	public void Beforesuite() {
		System.out.println(" Report Initialization");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("close Suite");
	}
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println(" Excell Connection");
		System.out.println("datebase connection ");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("Close Excell Connection");
		System.out.println("Close Data Connection");
	}
	
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("Prerequisite");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Clear");
	}
	
	
	@Test (description = " First" ,priority = -2,invocationCount = 03,enabled = true, groups = {"Smoke Test"} )
	public void cfirsts() {
		System.out.println("The first Testng Program");
	}
	
	@Test (description = "second" ,priority = 1, invocationCount = 06,enabled = true, groups = {"Regresstion Test"})
	public void bseconds() {
		System.out.println("The second Testng Program");
	}
	
	@Test (description = "third",priority = 3, invocationCount = 9, enabled = true, groups = {"Sanitory Test"})
	public void athirds() {
		System.out.println("The third Testng Program");
	}
	@Test (description = "fourth",priority = 3, invocationCount = 9, enabled = true, groups = {"Smoke Test"})
	public void dfourth() {
		System.out.println("The fourth Testng Program");
	}
	
}
