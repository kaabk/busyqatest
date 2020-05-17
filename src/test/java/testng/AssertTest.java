package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	

	
	@Test
	public void test() {
		
		System.out.println("Test Case Assertion Started");
		
		// Assert.assertEquals(12, 13);  // (actual/observed,expected)
         // Assert.assertEquals(12,13, "Didn't match"); // third parameter will be displayed only in case assertion if failing
		//  Assert.assertEquals("Simran", "simran");
		Boolean condition = "test".equals("test");
		// Assert.assertTrue(condition);
		// Assert.assertFalse(condition); // we want to assert a false condition (negative test case)
		
		System.out.println("Test Case Assertion Completed");
		
		if(condition)
		Assert.fail("Condition failed");
	}

}
