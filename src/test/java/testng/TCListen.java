package testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng.ListenerTest.class)
public class TCListen {

	
	@Test
	public void test1() {
		Assert.fail(); // failure
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(10,10, "Match failed"); // true
	}
}
