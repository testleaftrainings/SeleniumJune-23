package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//get the title
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		//to get the window handle
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window handle: "+parentWindowHandle);
		//to get set of window handles
		Set<String> windowHandles = driver.getWindowHandles();
		//iterate 
		for (String each : windowHandles) {
			System.out.println(each);
			
		}
		//to get the size of windows opened
		int size = windowHandles.size();
		System.out.println("The number of windows are : "+size);
		//convert Set to list to switch to a particular window handle
		List<String> listofHandles = new ArrayList<>(windowHandles);
		//switch to the child window
		driver.switchTo().window(listofHandles.get(1));
		//get the title of the child window
		String childTitle = driver.getTitle();
		if (!parentTitle.equals(childTitle)) {
			System.out.println("Control switched to the new window");
		}
		else {
			System.out.println("Control stays in the same page");
		}
		
		driver.quit();
//		driver.switchTo().window(listofHandles.get(0));
//		String title = driver.getTitle();
//		System.out.println(title);
		
		
		
		
		
	}

}
