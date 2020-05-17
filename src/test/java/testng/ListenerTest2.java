package testng;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerTest2 extends TestListenerAdapter{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println(arg0.getName() + " failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println(arg0.getName() + " skipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println(arg0.getName() + " started");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println(arg0.getName() + " passed");
		
	}

}
