package testng;

import org.testng.annotations.Test;

public class TestNGTest {

	
	@Test(priority = 0)
	public void test2() {
		
		System.out.println("This is the main test");
	}
	
	@Test(priority = 2, enabled = false)
	public void test1() {
		
		System.out.println("This is the secondary test");
	}
	
	@Test(dependsOnMethods= {"test2"})
	public void test3() {
		System.out.println("This is dependant test on Test2");
	}
}
