package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class ViewLeadsPage extends BaseClass{
	
	public ViewLeadsPage(RemoteWebDriver driver) {
	       this.driver=driver;
		}
	public ViewLeadsPage verifyViewLeads() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;

	}

}
