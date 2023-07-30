package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
    public RemoteWebDriver driver;
    public String excelFileName;
    
    @Parameters({"browser","URL","USERNAME","password"})
	@BeforeMethod
	public void preCondition(String browser,String url,String uName,String pWord) {
    	if (browser.equalsIgnoreCase("chrome")) {
    		driver= new ChromeDriver();
		}
    	else if(browser.equalsIgnoreCase("edge")) {
    		driver = new EdgeDriver();
    	}else if(browser.equalsIgnoreCase("firefox")) {
    		driver = new FirefoxDriver();
    	}
		
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}
    
    @DataProvider(indices= 1)
	public String[][] sendData() throws IOException {
		
		return ReadExcel.readExcelData(excelFileName);

	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
	@AfterSuite
	public void stopReport() {
		System.out.println("Stop the report");

	}

}
