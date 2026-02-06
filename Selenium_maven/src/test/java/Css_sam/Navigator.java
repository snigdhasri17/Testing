package Css_sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigator {
public static void main(String[] args) {
	WebDriver Driver = new ChromeDriver();

	Driver.navigate().to("https://www.google.com/");
	Driver.manage().window().maximize();
	Driver.navigate().refresh();
	Driver.navigate().forward();
	Driver.navigate().back();
	
}
}
