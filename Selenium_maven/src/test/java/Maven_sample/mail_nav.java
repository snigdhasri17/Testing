package Maven_sample;
import org.openqa.selenium.*;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mail_nav {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		System.out.println(Driver.getTitle());
		Driver.findElement(By.linkText("Gmail ")).click();
		Thread.sleep(3000);
		Driver.navigate().back();
		
		Driver.quit();
	}

}
