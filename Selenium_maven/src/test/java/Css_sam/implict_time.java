package Css_sam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implict_time {
public static void main(String[] args) {
	WebDriver Driver = new ChromeDriver();
	Driver .navigate().to("https://demoqa.com/dynamic-properties");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	System.out.println(Driver.findElement(By.id("visibleAfter")).getText());
	Driver.navigate().back();
}
}
