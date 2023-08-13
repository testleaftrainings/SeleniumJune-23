package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import config.ConfigurationManager;

public class MyLeadsPage extends BaseClass{
	
	
	
	public CreateLeadPage clickCreateLeadLink() {
		String createLeadValue = ConfigurationManager.configuration().getCreateLeadLink();
		getDriver().findElement(By.partialLinkText(createLeadValue)).click();
		return new CreateLeadPage();

	}

}
