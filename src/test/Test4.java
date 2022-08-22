package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
	

	@Test
	public void webLoginHome() {
		System.out.println("Web Login Home");
	}
	
	@Test
	public void webLoginHomePage() {
		System.out.println("Web Login Home Page");
		System.out.println("Hello World");
		System.out.println("Hello");

	}
	@Test
	public void LoginHomePage() {
		System.out.println(" Login Home Page");
	}
	
	@Test
	void mobileLoginHome() {
		System.out.println("Mobile Login Home");
	}
	
	@Test(dataProvider = "getData")
	void loginAPIHome(String user, String psw) {
		System.out.println("API Login Home");
		System.out.println("username===="+user);
		System.out.println("psw===="+psw);
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st username psw good credit history
		//2nd username psw no history
		//3rd username psw fraud
		
		Object[][] data = new Object[3][2];
		data[0][0] = "1stSetData";
		data[0][1] = "1stPsw";
		data[1][0] = "2ndSetData";
		data[1][1] = "2ndPsw";
		data[2][0] = "3rdSetData";
		data[2][1] = "3rdPsw";
		return data;
		
	}

}
