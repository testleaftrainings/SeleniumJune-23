package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass{
	
	public MyLeadsPage(RemoteWebDriver driver) {
	       this.driver=driver;
		}
	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}

}
