package testng;

import org.testng.annotations.Test;

public class InvocationCount {

	
	@Test(invocationCount=5)
	public void test6() {
		System.out.println("This will print 5 times");
	}
}
