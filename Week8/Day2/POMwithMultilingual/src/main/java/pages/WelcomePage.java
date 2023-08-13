package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class WelcomePage extends BaseClass{
	
	
	public WelcomePage verifyHomePage() {
		String title = getDriver().getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Login not successfull");
		}
		return this;

	}
	
	
	public MyHomePage clickCrmsfaLink() {
		
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}
	
	
	
	
}
