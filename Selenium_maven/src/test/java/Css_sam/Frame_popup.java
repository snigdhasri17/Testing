package Css_sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_popup {
	public static void main(String[] args) {
WebDriver Driver=new ChromeDriver();
Driver.manage().window().maximize();
Driver.navigate().to("https://the-internet.herokuapp.com/frames");
Driver.switchTo().frame("frame-buttom");
WebElement obj=Driver.findElement(By.cssSelector("body"));
System.out.println(obj.getText());
Driver.switchTo().parentFrame();
Driver.switchTo().frame("frame-top");
Driver.switchTo().frame(1);
WebElement obj1 = Driver.findElement(By.id("content"));
System.out.println(obj1.getText());
Driver.quit();
}
}