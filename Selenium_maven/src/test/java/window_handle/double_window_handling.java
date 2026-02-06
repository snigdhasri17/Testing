package window_handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class double_window_handling {
public static void main(String[] args) throws InterruptedException{
	WebDriver Driver =new ChromeDriver();
	Driver.navigate().to("https://www.google.com/");
	Driver.manage().window().maximize();
	Thread.sleep(3000);
	Driver.getTitle();
	//string window = Driver.switchTo().newWindow("https://www.google.com/imghp?hl=en&tab=ri&ogbl");
	
	String window = Driver.getWindowHandle();
	//open new tab and navigate to another url.
	Driver.switchTo().newWindow(WindowType.TAB);
	Driver.get("https://www.google.com/imghp?hl=en&tab=ri&ogbl");
	Thread.sleep(4000);
	//ensure that they are two windows open(main window +new tab
	System.out.println(Driver.getWindowHandles().size());
	//Switch back to the original window (main window)
	
	Driver.switchTo().window(window);
	Driver.close();
	Thread.sleep(3000);
	System.out.println(Driver.getWindowHandles().size());
	Driver.quit();
	
	
}
}
