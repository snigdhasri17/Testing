package stepsdefination;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlesrch {
	WebDriver Driver;

	@Given("browser is open")
	public void browser_is_open() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
	   //throw new io.cucumber.java.PendingException();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		Driver.navigate().to("https://www.google.com/");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user enters atest in search page")
	public void user_enters_atest_in_search_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Driver.findElement(By.name("q")).sendKeys("Types of Dogs");
		Driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	   //throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		//Driver.getPageSource();
		Driver.navigate().back();
		//Driver.wait();
		Driver.quit();
	   //throw new io.cucumber.java.PendingException();
	}

}
