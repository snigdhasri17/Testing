package test_cases;
import pages.page_googlesearch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletest {
static WebDriver Driver;
public static void main(String[] args) {
	
	googlesearch();
	//Driver.quit();
}
public static void googlesearch() {
	Driver = new ChromeDriver();
	Driver.get("https://www.google.com/");
	Driver.manage().window().maximize();
	
	page_googlesearch.txtbxsrch(Driver).sendKeys("INDIA");
	page_googlesearch.txtbxsrch(Driver).sendKeys(Keys.ENTER);
	
}
}
