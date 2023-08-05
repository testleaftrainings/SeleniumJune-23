package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public ChromeDriver driver ;

	@Given("Open the Chrome browser")
	public void openBrowser() {
		driver= new ChromeDriver();
	}

	@And("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@And("Enter the username as {string}")
	public void enterUsername(String uName) {

		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@And("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);

	}

	@When("Click on the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Login not successfull");
		}

	}

	@But("ErrorMessage should be displayed")
	public void verifyErrorMessage() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if (text.contains("Errors")) {
			System.out.println("Error message is verified");
		}

	}


	@When("Click on crmsfaLink")
	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	@And("Click Leads Button")
	public void clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();

	}

	@And("Click CreateLead link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();

	}
	
	@Given("Enter the companyname as (.*)$")
	public void enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

	}
	
	@And("Enter the firstname as (.*)$")
	public void enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}
	
	@And("Enter the lastname as (.*)$")
	public void enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

	}
	
	@When("Click on createLead button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();

	}

     @Then("ViewLeadsPage should be displayed as (.*)$")
     public void verifyViewLeads(String cName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}

	}

























}
