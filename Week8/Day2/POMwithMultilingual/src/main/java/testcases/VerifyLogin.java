package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{

//	@BeforeTest
//	public void setValues() {
//		excelFileName="Login";
//		sheetName="Sheet1";
//
//	}

	@Test//(dataProvider = "sendData")
	public void runLogin() {	
		LoginPage lp = new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage();	
	}


}
