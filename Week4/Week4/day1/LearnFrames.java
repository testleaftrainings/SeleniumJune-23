package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch control to the frame
		driver.switchTo().frame(1);
		//click chat widget
		driver.findElement(By.id("dummy-chat-button")).click();
		driver.switchTo().frame("ShopifyChat");
		driver.findElement(By.xpath("//div[@class='composer-bar__box']/textarea")).sendKeys("Hai");
		driver.findElement(By.xpath("//button[contains(@class,'chat-app')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='product-content']/following::a")).click();
		
	}

}
