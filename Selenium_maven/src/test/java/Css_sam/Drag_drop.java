package Css_sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class Drag_drop {
	
public static void main(String[] args) throws InterruptedException{
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://demo.guru99.com/test/drag_drop");
	Driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println(Driver.getTitle());
	WebElement From = Driver.findElement(By.xpath("//*[@id='credit4']/a"));// "*" represents any anchor tag 
	WebElement to = Driver.findElement(By.xpath("//*[@id='loan']/li"));
	
	Actions act = new Actions(Driver);
	Thread.sleep(4000);
	act.dragAndDrop(From,to).build().perform();
	Thread.sleep(3000);
	//Driver.quit();
	
}
}
