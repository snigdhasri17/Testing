package Css_sam;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_alert {
public static void main(String[] args) {
	WebDriver Driver = new ChromeDriver();
	Driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
	Driver.manage().window().maximize();
	Driver.findElement(By.name("cusid")).sendKeys("949394");
	Driver.findElement(By.name("submit")).click();
	
	Alert alert = Driver.switchTo().alert();
	String almes = Driver.switchTo().alert().getText();
	System.out.println(almes);
	//Driver.quit();

}
}
