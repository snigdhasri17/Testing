package window_handle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FullPageScreenshot;

public class window_ScreenShot {
public static void main(String[] args) throws InterruptedException, IOException{
	WebDriver Driver = new ChromeDriver();
	Driver.navigate().to("https://www.google.com/");
	
	Driver.manage().window().maximize();
	 
	File src = ((TakesScreenshot) Driver). getScreenshotAs (OutputType.FILE);
	FileUtils.copyFile(src, new File("/home/labuser/Pictures/tap.png"));
	Driver.navigate().back();
	Driver.quit();
}
}
