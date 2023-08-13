package week8.day2;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		// Common for all the test cases (Step1 to Step3)
		// Step1: Set up physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		// to keep the report history
		//reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();
		
		// Step3: attach the data with physical file
		extent.attachReporter(reporter);
		
						
		// Step4: Create a test cases and assign test details
											// testName 	//testDescription
		ExtentTest test1 = extent.createTest("VerifyLogin", "Login with valid credential");
		test1.assignCategory("smoke");
		test1.assignAuthor("Subraja");	
		
		ExtentTest test2 = extent.createTest("RunCreateLead","CreateLead with single data");
		test2.assignCategory("regression");
		test2.assignAuthor("Vidhya");
		
		test2.pass("enter firstname",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/buythevalue.png").build());
		test2.pass("enter lastname");
		test2.fail("compnayname is not entered");
		
																					//.. -> used to come out of reports	
		// Step5: Step level status
		test1.pass("username is entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/amazon.png").build()); //test step1
		test1.pass("username is entered successfully"); //test step2
		test1.pass("Login button is clicked sucessfully"); // test step3
		

		
		// step6: Mandatory step
		extent.flush();
		System.out.println("Done");

	}

}