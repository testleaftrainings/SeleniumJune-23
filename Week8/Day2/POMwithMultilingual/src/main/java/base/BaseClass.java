package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import config.ConfigurationManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;

public class BaseClass extends AbstractTestNGCucumberTests{

	private static final ThreadLocal<RemoteWebDriver>  rd = new ThreadLocal<>();
	public String excelFileName,sheetName;

	public void setDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			rd.set(new ChromeDriver() );
		}
		else if(browser.equalsIgnoreCase("edge")){
			rd.set(new EdgeDriver());
		}
		

	}

	public RemoteWebDriver getDriver() {
		return rd.get();

	}


	@BeforeMethod
	public void preCondition() {
		String url = ConfigurationManager.configuration().getUrl();
		System.out.println(url);
		String browser = ConfigurationManager.configuration().getBrowser();
		setDriver(browser);
		getDriver().get(url);
		getDriver().manage().window().maximize();
		int time = ConfigurationManager.configuration().getTimeout();
		System.out.println(time);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}

	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}

	@DataProvider(indices=1)
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcelData(excelFileName,sheetName);

	}

}
