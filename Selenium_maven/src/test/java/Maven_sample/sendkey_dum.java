package Maven_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey_dum {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.saucedemo.com/");
		Thread.sleep(5000);
		/*WebElement urs = Driver.findElement(By.id("user-name"));
		urs.sendKeys("standard_user");
		Thread.sleep(3000);
		WebElement password = Driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		WebElement login = Driver.findElement(By.id("login-button"));
		login.click();	
		Thread.sleep(5000);*/
		Driver.quit();
		
		
	}
}
