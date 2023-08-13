package testcases;

import java.io.IOException;

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
	public void runCreateLead(String uName,String pWord,String cName,String fName,String lName) throws IOException {
		System.out.println(driver);
	   LoginPage lp = new LoginPage(driver);
	   lp.enterUsername(uName)
	   .enterPassword(pWord)
	   .clickLoginButton()
	   .verifyHomePage()
	   .clickCrmsfaLink()
	   .clickLeadsLink()
	   .clickCreateLeadLink()
	   .enterCompanyName(cName)
	   .enterFirstName(fName)
	   .enterLastName(lName)
	   .clickCreateLeadButton()
	   .verifyViewLeads();
		
		
	}


}
