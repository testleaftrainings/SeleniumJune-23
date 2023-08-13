package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ViewLeadsPage extends BaseClass{
	
	
	
	
	public ViewLeadsPage verifyViewLeads(String cName) {
		String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;

	}

}
