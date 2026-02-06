package Maven_sample;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		WebElement sb = driver.findElement(By.name("q"));
		sb.sendKeys("hyderabad");
		sb.sendKeys(Keys.ENTER);
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Thread.sleep(3000);
		driver.quit();
	}
}
		
		
	
	


