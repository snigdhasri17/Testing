package Css_sam;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class User_pass_css {
	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		System.out.println("Hello iam loggined");
		Driver.get("https://www.saucedemo.com/");
		System.out.println(Driver.getTitle());
		Driver.manage().window().maximize();
		//here we create webelement class and object also, instead of .sendKeys in same we make it, in 
		//happen with web element username .
		//WebElement obj = Driver.findElement(By.cssSelector("")
		//obj.sendKeys("")
		Driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");	
		Thread.sleep(600);
		Driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(600);
		Driver.findElement(By.cssSelector("input#login-button")).click();
		//Driver.findElement(By.cssSelector("input.submit-button btn_action")).click();

		Thread.sleep(8000);
		Driver.quit();

}
}
