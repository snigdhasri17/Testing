package Maven_sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class max_selenium {
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Hello and excute!!!");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		driver.quit();
	}
}
