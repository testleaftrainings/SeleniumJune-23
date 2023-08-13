package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import config.ConfigurationManager;

public class LoginPage extends BaseClass{

	
	public LoginPage enterUsername() {
        String uname = ConfigurationManager.configuration().getUsername();
        System.out.println(uname);
		getDriver().findElement(By.id("username")).sendKeys(uname);
		return this;

	}
	
	
	public LoginPage enterPassword() {
		String pword = ConfigurationManager.configuration().getPassword();
		System.out.println(pword);
		getDriver().findElement(By.id("password")).sendKeys(pword);
		return this;

	}
	
	
	public WelcomePage clickLoginButton() {

		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();

	}

}
