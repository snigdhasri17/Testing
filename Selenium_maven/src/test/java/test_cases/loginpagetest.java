package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginpage;
public class loginpagetest {
public static void main(String[] args) {
	WebDriver driver;
	loginpage loginpage;
	
	
	driver = new ChromeDriver();
	loginpage = new loginpage(driver);
	driver.manage().window().maximize();
	
	//loginpage.navigateto();
	//loginpage.login("standard_user", "secret_sauce");
	
	loginpage.navigateto();
	loginpage.login("invalid_user", "Wrong_password");
	
	//driver.navigate().back();
	//driver.quit();
	
	
}
}
