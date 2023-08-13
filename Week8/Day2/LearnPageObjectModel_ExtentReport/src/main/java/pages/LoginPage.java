package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{


	public LoginPage(RemoteWebDriver driver) {
       this.driver=driver;
	}

	public LoginPage enterUsername(String uName) throws IOException {

		try {
			driver.findElement(By.id("username")).sendKeys(uName);
            reportStep("Username is entered successfully", "pass");	
		} catch (Exception e) {
			reportStep("Username is not entered successfully", "fail");
			
		}
		return this;

	}
	public LoginPage enterPassword(String pWord) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(pWord);
			 reportStep("Password is entered successfully", "pass");	
		} catch (Exception e) {
			 reportStep("Password is not entered successfully", "pass");	
		}
		return this;

	}
	public WelcomePage clickLoginButton() throws IOException {

		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			 reportStep("Login button is clicked successfully", "pass");	
		} catch (Exception e) {
			reportStep("Login button is not clicked", "pass");	
		}
		return new WelcomePage(driver);

	}

}
