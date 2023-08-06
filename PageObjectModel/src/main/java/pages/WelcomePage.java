package pages;

import base.BaseClass;

public class WelcomePage extends BaseClass{
	public WelcomePage verifyHomePage() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Login not successfull");
		}
		return this;

	}
	
	
}
