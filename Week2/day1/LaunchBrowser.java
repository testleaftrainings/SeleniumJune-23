package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LaunchBrowser {

	public static void main(String[] args) {

		//Launch the browser(Chrome browser)
		ChromeDriver driver = new ChromeDriver();

		//Load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");

		//maximize the window
		driver.manage().window().maximize();

		//enter the username
		WebElement eleUsername = driver.findElement(By.id("username"));
		//do the neccessary action
		eleUsername.sendKeys("Demosalesmanager");

		//enter password
		//       method      class  
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crmsfa link
		driver.findElement(By.partialLinkText("SFA")).click();

		
		//click Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		
		//click source dropdown
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Create an object for Select class
		Select sec = new Select(sourceDD);
		
		//select by index(Direct Mail)
		//sec.selectByIndex(3);
		
		//select by value(Partner)
		//sec.selectByValue("LEAD_PARTNER");
		
		//select by text (Word of Mouth)
		sec.selectByVisibleText("Word of Mouth");
		
		
		//close the browser
		//driver.close();

	}

}
