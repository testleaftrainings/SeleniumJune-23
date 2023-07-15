package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleALert {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//switch control to the alert
		Alert simpleAlert = driver.switchTo().alert();
		//read the text of the Alert
		String text = simpleAlert.getText();
		System.out.println("Alert message: "+text);
		//accept the alert
		Thread.sleep(3000);
		simpleAlert.accept();
		//verify
		String message = driver.findElement(By.id("simple_result")).getText();
		if (message.contains("successfully clicked")) {
			System.out.println("Alert accepted");
		}
		
	}

}
