package extent_report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NG_selenium {

	static ExtentReports extent;
	static ExtentSparkReporter spark;
	@BeforeClass
	public void starttest() {
		extent = new ExtentReports();//think this is where test cases runs
		spark = new ExtentSparkReporter("target/softSpark.html");// think it is tamplet.
	}
	
	@Test
	public void extentest() {
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation_Report");
		spark.config().setReportName("ReportDemo");
		extent.attachReporter(spark);
		
		//create a test node in the report
		
ExtentTest test = extent.createTest("Login test").assignAuthor("SOWMYA POKURI").
										assignCategory("Smoke").assignDevice("Web Driver");
	test.pass("Login Test Sucessfull");
	test.info("url loaded");
	test.pass("login test complied succesfully");
	
	//create test node in the report
	/*ExtentTest test1 = extent.createTest("homepage test").assignAuthor("Sowmya Pokuri").assignCategory("Recersion").assignDevice("Web Driver");
	test1.pass("Homepage Succesfull");
	test1.info("value entered");
	test1.fail("Homepage test fails");
	*/
	WebDriver Driver = new ChromeDriver();
	Driver.navigate().to("https://www.google.com/");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(Driver.getTitle(), "Google");
	test.info("Soft Assert excuted for title");
//	System.out.println("it will continous if test fails");
	/*try {
		boolean loginStatus = false;
		Assert.assertTrue(loginStatus,"login failed");
	test.pass("login status");
	}catch(AssertionError e){
		String Ss = ((Object) ScreenshotUtil).takeScreenshot(Driver,"Login Failuer");
		test.fail("hard assert: ss fail").addScreenCaptureFromPath(Ss);
		throw e;
	}*/
	sa.assertAll();
	
	

	/*if(Driver.getTitle().equals(Driver)) {
		test.log(Status.PASS ,"Navigated to the Specified url");
			
	}
	else
	{
		test.log(Status.FAIL,"Test Failed");
	}*/
	Driver.quit();
	
	}
	
	@AfterMethod
	public void teardown() {
		extent.flush();
	}
	
	
}
