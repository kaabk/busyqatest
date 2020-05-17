package testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng.ListenerTest.class)
public class TestListen1 {

	
	@Test
	public void passTest() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void failTest() {
		Assert.assertTrue(false);
	}
}
