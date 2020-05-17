package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrioritySequence {

	
	@Test(priority=0)
	public void test1() {
		System.out.println("This is first test");
	}
	@Test(priority=1)
	public void test3() {
		System.out.println("This is second test");
	}
	
	@Test(enabled=true)
	public void test2() {
		System.out.println("This is third test");
	}
	
	@Test(dependsOnMethods= {"test2"})
	public void test4() {
		Assert.assertTrue(false); // assertion failed
		System.out.println("This is fourth dependant test");
	}
	
	@Test(dependsOnMethods= {"test4"} , alwaysRun = true )
	public void test5() {
		System.out.println("This is fifth test that always run");
	}
	
}
