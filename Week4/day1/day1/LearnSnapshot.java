package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnSnapshot {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		//to take screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/buythevalue.png");
		FileUtils.copyFile(source, dest);
		
	}

}
