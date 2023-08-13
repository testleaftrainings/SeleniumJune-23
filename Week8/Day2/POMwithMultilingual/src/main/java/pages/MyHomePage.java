package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import config.ConfigurationManager;

public class MyHomePage extends BaseClass{
	

	
	public MyLeadsPage clickLeadsLink() {
		String leadsValue = ConfigurationManager.configuration().getLeadsLink();
		getDriver().findElement(By.xpath(leadsValue)).click();
		return new MyLeadsPage();

	}

}
