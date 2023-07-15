package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click show button
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following::span[1]")).click();
		//switch control to the alert
		Alert alert = driver.switchTo().alert();
		//read alert text
		String alertMessage = alert.getText();
		System.out.println("Alert Message: "+alertMessage);
		//pass input to the alert box
		Thread.sleep(5000);
		alert.sendKeys("Subraja");
		//dismiss the alert
		
		alert.accept();
		//verify
		String text = driver.findElement(By.id("confirm_result")).getText();
		if (text.contains("Subraja")) {
			System.out.println("Input passed into the alert box ");
		}

	}

}
