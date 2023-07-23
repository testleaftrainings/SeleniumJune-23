package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    public  ChromeDriver driver ;
    
//    @BeforeSuite
//    public void startReport() {
//		System.out.println("Start the report");
//
//	}
//    
//    @BeforeClass
//    public void testcaseDetails() {
//		System.out.println("Assign testcase details");
//
//	}
    
    
    
	@BeforeClass
	public void preCondition() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}

	@AfterClass
	public void postCondition() {
		//driver.close();

	}
	
	@AfterSuite
	public void stopReport() {
		System.out.println("Stop the report");

	}

}
