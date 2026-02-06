package Css_sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Drop_down {
	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		Driver.manage().window().maximize();
		System.out.println(Driver.getTitle());
		
		WebElement Drdn = Driver.findElement(By.name("country"));
		
		Select sc = new Select(Drdn);
		sc.selectByVisibleText("ALBANIA");
		
		Thread.sleep(2000);
	boolean dis = Drdn.isDisplayed();		//isDisplayed :- To check whether an element is visible on UI(user-interface)
	boolean en = Drdn.isEnabled();	//isenabled :-To check Whether an element is enabled(clickable / editable)
		sc.selectByIndex(1);
		Thread.sleep(3000);
		//sc.selectByValue("INDIA");
		System.out.println(dis);
		System.out.println(en);
		Driver.quit();
		
	}

}
