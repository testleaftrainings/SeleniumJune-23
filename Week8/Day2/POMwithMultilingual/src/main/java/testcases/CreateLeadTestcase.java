package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLeadTestcase extends BaseClass{
	
	
	@BeforeTest
	public void setValues() {
		excelFileName="Login";
		sheetName="Sheet2";

	}
	
	@Test(dataProvider="sendData")
	public void runCreateLead(String cName,String fName,String lName) {
		System.out.println();
	   LoginPage lp = new LoginPage();
	   lp.enterUsername()
	   .enterPassword()
	   .clickLoginButton()
	   .verifyHomePage()
	   .clickCrmsfaLink()
	   .clickLeadsLink()
	   .clickCreateLeadLink()
	   .enterCompanyName(cName)
	   .enterFirstName(fName)
	   .enterLastName(lName)
	   .clickCreateLeadButton()
	   .verifyViewLeads(cName);
		
		
	}


}
