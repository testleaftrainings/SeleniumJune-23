package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnALertandFrame {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the frame
		driver.switchTo().frame("iframeResult");
		//click try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch control to the alert
		Alert alert = driver.switchTo().alert();
		//read alert text
		String text = alert.getText();
		System.out.println("Alert Message: "+text);
		//accept the alert
		alert.accept();
		//verify
		String text2 = driver.findElement(By.id("demo")).getText();
		if (text2.contains("OK")) {
			System.out.println("Alert accepted");
		}
		
		
	}

}
