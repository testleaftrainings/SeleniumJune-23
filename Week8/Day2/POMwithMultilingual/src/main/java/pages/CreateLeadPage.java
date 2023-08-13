package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	
	
	public CreateLeadPage enterCompanyName(String cName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;

	}
	
	
	public CreateLeadPage enterFirstName(String fName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;

	}
	
	
	public CreateLeadPage enterLastName(String lName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;

	}
	
	
	public ViewLeadsPage clickCreateLeadButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();

	}
}
