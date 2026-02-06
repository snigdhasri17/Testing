package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class mylister implements ITestListener {
public void onTestFailure(ITestResult result) {
	System.out.println("failed --error msg");
	System.out.println(result.getName());
	System.out.println(result.getStatus());
}

public void onTestSuccess(ITestResult result) {
	System.out.println("--test case pass");
}
}
