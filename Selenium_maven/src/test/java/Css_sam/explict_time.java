package Css_sam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explict_time {
public static void main(String[] args) {
	WebDriver Driver = new ChromeDriver();
	Driver.navigate().to("https://demoqa.com/dynamic-properties");
	Driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
	Driver.findElement(By.id("visibleAfter")).click();
	
}
}
