package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	@Test(groups = {"Smoke"})
	public void demoT1() {
		System.out.println("DemoT1MethodTest2");
	}
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void demoT2(String url, String user) {
		System.out.println("URL+UserName == " + url + user);
	}
	
	@BeforeTest
	public void prerequest() {
		System.out.println("BeforeTest");
	}
	
	@AfterClass
	public void last() {
		System.out.println("AfterClass");
	}
}
