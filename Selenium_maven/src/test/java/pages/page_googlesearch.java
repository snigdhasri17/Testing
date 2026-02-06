package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page_googlesearch {
	static WebElement elem = null;
	public static WebElement txtbxsrch(WebDriver Driver) {
		elem = Driver.findElement(By.name("q"));
		return elem;
	}
	/*public static WebElement butt_srch(WebDriver Driver) {
		elem = Driver.findElement(By.xpath(""))
	}
	*/
	
}
