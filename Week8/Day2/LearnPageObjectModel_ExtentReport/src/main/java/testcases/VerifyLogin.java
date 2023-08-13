package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{

	@BeforeTest
	public void setValues() {
		excelFileName="Login";
		sheetName="Sheet1";
		testName="Login functionality";
		testDescription="Login with valid credentials";
		testCategory="smoke";
		testAuthor="Subraja";

	}

	@Test(dataProvider = "sendData")
	public void runLogin(String uName,String pWord) throws IOException {	
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.verifyHomePage();	
	}


}
