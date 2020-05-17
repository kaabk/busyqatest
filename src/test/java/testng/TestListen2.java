package testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestListen2 {

	
	@Test
	public void passTest() {
		Assert.assertTrue(true); // true
	}
	
	@Test
	public void failTest() {
		Assert.assertTrue(false); // false
	}
}
