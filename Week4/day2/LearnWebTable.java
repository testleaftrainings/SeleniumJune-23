package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LearnWebTable {

	public static void main(String[] args) {
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver(opt);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("Cape",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();

		//Method 1:
		//find table
		WebElement table = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList ')]"));
		//find the number of rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		//find row size
		System.out.println("Total number of rows :"+rows.size());
		//get data from the 1st row
		WebElement firstRow = rows.get(1);
		List<WebElement> allDataofFirstRow = firstRow.findElements(By.tagName("td"));
		//Iterate through the data and print all the datas in the firstrow
		List<String> list = new ArrayList<>();
		for (WebElement eachData : allDataofFirstRow) {
			String text = eachData.getText();
			//list.add(text);
		}
		//System.out.println(list);

		//Method 2:
		//print all datas in the second column(train names)
		List<WebElement> secondColumnData = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
		for (WebElement eachTrainNames : secondColumnData) {
			//System.out.println(eachTrainNames.getText());
		}
		
		//Method 4:
		for (int i = 1; i < rows.size(); i++) {
			WebElement allRows = rows.get(i);
			List<WebElement> rowData = allRows.findElements(By.tagName("td"));
			String text = rowData.get(1).getText();
			System.out.println(text);
		}

		//Method 3:
		// to get all the datas from the table
		for (int i = 0; i < rows.size(); i++) {
			WebElement allRows = rows.get(i);
			List<WebElement> allData = allRows.findElements(By.tagName("td"));
			for (int j = 0; j < allData.size(); j++) {
				String text = allData.get(j).getText();
				list.add(text);
			}

		}
		System.out.println(list);
	}

}
