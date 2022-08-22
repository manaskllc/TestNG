package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	@Test(groups = {"Smoke"})
	public void demo() {
		System.out.println("DemoMethodTest1");
	}
	
	@Test
	public void demo2() {
		System.out.println("Personal Loan 2");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

}
