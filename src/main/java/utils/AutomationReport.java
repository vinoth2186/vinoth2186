package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {

	public static void main(String[] args) {
		// Blank HTML creation
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html");
		//Report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		//Test Case creation - Manually just for exmaple
		ExtentTest test =extent.createTest("TC001 - Search Product");
		test.assignAuthor("Vinoth");
		test.assignCategory("Smoke");
		test.pass("Search the Product");
		test.pass("Product is listed in the search result");
		test.pass("Add to the Cart");
		//Creating the Failed Test Case Manually and adding the screenshot in extent report
		ExtentTest test1 = extent.createTest("TC002 - Payment");
		test1.pass("Navigate to the Payment page");
		test1.fail("Payment Failed", MediaEntityBuilder.createScreenCaptureFromPath("TestVinoth.png").build());
	//To save the report to the HTML report
		extent.flush();
		;
	}
}
