package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestAnnotationsKK {

	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("This is Before Suite");
	}
	
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("This is Before Class");
	}
	
	@BeforeTest
	public void testBeforeTest() {
		System.out.println("This is Before Test");
	}
	
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("This is Before Method");
	}
	
	@Test (priority=0)
	public void test1() {
		System.out.println("This is test1");
	}
	@Test  (priority=1)
	public void test2() {
		System.out.println("This is test2");
	}
	
	@AfterMethod
	public void testAfterMethod() {
		System.out.println("This is After Method");
	}
	@AfterTest
	public void testAfterTest() {
		System.out.println("This is After Test");
	}
	
	@AfterClass
	public void testAfterClass() {
		System.out.println("This is After Class");
	}
	
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("This is After Suite");
	}
}
