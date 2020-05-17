package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGTest3 {

	
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("This is After Suite");
	}
	

	
	@AfterTest
	public void testAfterTest() {
		System.out.println("This is After Test");
	}
	
	
	@AfterClass
	public void testAfterClass() {
		System.out.println("This is After Class");
	}
	
	@AfterMethod
	public void testAfterMethod() {
		System.out.println("This is After Method");
	}
	
	@Test
	public void test() {
		System.out.println("This is third test");
	}
}
