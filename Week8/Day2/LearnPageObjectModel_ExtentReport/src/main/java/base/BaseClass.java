package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.ReadExcel;

public class BaseClass {

	public   RemoteWebDriver driver;
	public String excelFileName,sheetName;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName,testDescription,testCategory,testAuthor;

	@BeforeSuite
	public void startReport() {

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);

	}

	@BeforeClass
	public void testcaseDetails() {
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);	

	}
    
	
	public int takeSnap() throws IOException {
		int ranNum = (int) (Math.random()*9999999+1000000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img"+ranNum+".png");
		FileUtils.copyFile(source, dest);
		return ranNum;

	}
	
	

	public void reportStep(String msg,String status) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail"))
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
	}

	@Parameters("browser")
	@BeforeMethod
	public void preCondition(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

	@DataProvider(indices=0)
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcelData(excelFileName,sheetName);

	}

	@AfterSuite
	public void stopReport() {
		extent.flush();

	}

}
