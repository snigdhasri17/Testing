package stepsdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver Driver;
	@Given("browser is on open")
	public void browser_is_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		Driver = new ChromeDriver();
		Driver.navigate().to("https://www.saucedemo.com/");
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("^enters login details (.*) and (.*)")
	public void enter_username_and_password(String username,String password ) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(3000);
		Driver.findElement(By.id("password")).sendKeys(password);
		
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("page navigate to website")
	public void page_navigate_to_website() {
	    // Write code here that turns the phrase above into concrete actions
		Driver.findElement(By.id("login-button")).click();
	    //throw new io.cucumber.java.PendingException();
	}

}
