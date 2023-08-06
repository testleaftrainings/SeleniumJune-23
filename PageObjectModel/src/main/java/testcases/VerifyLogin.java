package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{
	
	@Test
	public void runLogin() {
		
	   LoginPage lp = new LoginPage();
	   lp.enterUsername()
	   .enterPassword()
	   .clickLoginButton()
	   .verifyHomePage();
		
		
	}
//	LoginPage lp = new LoginPage();
//	lp.enterUsername();
//	lp.enterPassword();
//	lp.clickLoginButton();
//	
//	WelcomePage wp = new WelcomePage();
//	wp.verifyHomePage();

}
