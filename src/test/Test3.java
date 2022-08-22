package test;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void webLoginCar() {
		System.out.println("Web Login Car");
	}
	
	@Test
	void mobileLoginCar() {
		System.out.println("MobileLoginCar");
	}
	
	@Test(groups = {"Smoke"})
	void mobileCar() {
		System.out.println("MobileCarTest3");
	}
	
	@Test
	void mobileCellCar() {
		System.out.println("MobileCellCar");
	}
	
	@Test
	void loginAPICar() {
		System.out.println("API Login Car");
	}

}
