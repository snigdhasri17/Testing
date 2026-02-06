package Maven_sample;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class rel_xpath {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		WebElement r1= driver.findElement(By.xpath(("//a[@data-pid='2']")));
		r1.click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
