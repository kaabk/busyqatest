package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest1 {

	
	
	
	
	@BeforeTest
	public void testBeforeTest() {
		System.out.println("This is Before Test");
	}
	
	
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("This is Before Class");
	}
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("This is Before Suite");
	}
	
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("This is Before Method");
	}
	
	@Test
	public void test() {
		System.out.println("This is main test");
	}
}
