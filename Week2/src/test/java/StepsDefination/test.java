package StepsDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {
	
	static WebDriver Driver;
	@Test(description = "The Times of India")
	@Given("Get the URL of Browser")
	public void get_the_url_of_browser() {
		
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.getTitle();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Test(dependsOnMethods="get_the_url_of_browser")
	
	@Given("open the Browser")
	public void open_the_browser() throws InterruptedException {
		Driver.navigate().to("https://timesofindia.indiatimes.com/");
		
		Thread.sleep(200);
		//Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//System.out.println(Driver.findElement(By.id("visibleAfter")).getText());
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Test(dependsOnMethods="open_the_browser",alwaysRun = true)
	
	@When("navigate to drop down")
	public void navigate_to_drop_down() {
		WebElement Dr_Dwn =
				Driver.findElement(By.xpath("//*[@class='z89UZ undefined xGzbZ']"));
		Dr_Dwn.click();
		Select sc = new Select(Dr_Dwn);
		//sc.selectByVisibleText("English");
		sc.deselectByIndex(1);
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Selct the Text")
	public void selct_the_text() {
		
		Driver.navigate().back();
		Driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}



}
