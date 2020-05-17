package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

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
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " failed"); // getName will get the test method name
		
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
