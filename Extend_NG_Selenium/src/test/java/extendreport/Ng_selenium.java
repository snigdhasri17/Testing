package extendreport;

public class Ng_selenium {
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeClass
	public void starttest()
	{
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		
	}
	@Test
	public void extenttest() {
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("ReportDemo");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Login Test").assignAuthor("Sowmya").
				
	}
	
}
