package Css_sam;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class keyboard_mouse_action {
	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		System.out.println(Driver.getTitle());
		WebElement r = Driver.findElement(By.xpath("//textarea[@title='Search']"));
		Actions a = new Actions(Driver);
		a.moveToElement(r);
		a.keyDown(Keys.SHIFT);
		a.sendKeys("hey gpt").keyUp(Keys.SHIFT).build().perform();
		a.contextClick().perform();		// it uses to right-click on display
		Thread.sleep(3000);
		Driver.quit();
		
		
	}
}
