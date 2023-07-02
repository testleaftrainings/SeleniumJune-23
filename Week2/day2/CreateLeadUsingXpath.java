package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLeadUsingXpath {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser(Chrome browser)
		ChromeDriver driver = new ChromeDriver();

		//Load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");

		//maximize the window
		driver.manage().window().maximize();
		
		//apply wait:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//enter password
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		//click login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//click crmsfa link
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();

		
		//click Leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//click Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//enter companyname
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TestLeaf");
		
		//enter firstname
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Subraja");
		
		//enter lastname
		driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("S");
		
		
		//click source dropdown
		WebElement sourceDD = driver.findElement(By.xpath("//select[contains(@id,'dataSourceId')]"));
		
		//Create an object for Select class
		Select sec = new Select(sourceDD);
		
		//select by index(Direct Mail)
		//sec.selectByIndex(3);
		
		//select by value(Partner)
		//sec.selectByValue("LEAD_PARTNER");
		
		//select by text (Word of Mouth)
		//Thread.sleep(4000);
		sec.selectByVisibleText("Word of Mouth");
		
		//click Createlead button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//close the browser
		//driver.close();

	}

}
