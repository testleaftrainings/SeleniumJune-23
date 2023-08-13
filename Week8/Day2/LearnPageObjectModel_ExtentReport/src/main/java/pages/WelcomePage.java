package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass{
	
	public WelcomePage(RemoteWebDriver driver) {
	       this.driver=driver;
		}
	
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
	
	public MyHomePage clickCrmsfaLink() {
		System.out.println(driver);
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);

	}
	
	
	
	
}
