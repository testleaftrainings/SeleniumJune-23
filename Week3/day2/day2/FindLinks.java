package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		//to find the number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//to find the size of the list
		int size = links.size();
		System.out.println("The total number of links in this page is: "+size);
		
		//to get the 2nd link of this page
		System.out.println(links.get(1).getText());
		
		//Declare a list
		List<String> allLinks = new ArrayList<>();
		System.out.println(allLinks);
	
 		
		//to print all the links
		//   datatype   variable: data
		for (WebElement each : links) {
		     String text = each.getText();
		    allLinks.add(text);
		}
		//to sort a list
		Collections.sort(allLinks);
		System.out.println(allLinks);
	}

}
