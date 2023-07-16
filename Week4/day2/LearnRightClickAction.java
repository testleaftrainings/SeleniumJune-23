package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClickAction {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		//right click on an element
		Actions builder = new Actions(driver);
		builder.contextClick(ele).perform();
		driver.findElement(By.xpath("//span[text()='Quit']")).click();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	}

}
