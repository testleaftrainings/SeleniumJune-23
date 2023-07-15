package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnNestedFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the parent frame by using index
		WebElement iframe = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following::iframe"));
		driver.switchTo().frame(iframe);
		//switch to the nested frame  using webelement / id / name
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		
		
	}

}
