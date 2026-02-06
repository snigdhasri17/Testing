package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.page_factor;
public class page_factor_test {

	
	static WebDriver Driver;
	public void webtest() {
		Driver=new ChromeDriver();
		Driver.navigate().to("https://www.saucedemo.com/");
		Driver.manage().window().maximize();
		page_factor login= new page_factor(Driver);
		login.Login("standard_user", "secret_sauce");
		
	}
	
}
