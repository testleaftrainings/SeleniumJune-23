package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		//enter mobiles
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		//find all mobile prices
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		List<Integer> list = new ArrayList<Integer>();
		//iterate through for each loop to get all the prices
		for (WebElement each : prices) {
			String text = each.getText();//5,999
			String replaceAll = text.replaceAll(",", "");//5999
			if (!replaceAll.isEmpty()) {
				int parseInt = Integer.parseInt(replaceAll);//5999
				list.add(parseInt);
			}
			
			
		}
		Collections.sort(list);
		System.out.println(list);

		System.out.println(list.get(0));
		
		//to get unique mobile price
		Set<Integer> set = new TreeSet<>(list);
		System.out.println(set.size());
		System.out.println(set);
		if (list.size()!=set.size()) {
			System.out.println("Duplicates Present");
		}
		else {
			System.out.println("No Duplicates");
		}
		
		
		
	}

}
