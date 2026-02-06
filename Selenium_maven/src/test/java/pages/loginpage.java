package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
public WebDriver driver;

public final String url = "https://www.saucedemo.com/";

private By usernameField = By.id("user-name");
private By passwordField = By.id("password");
private By loginButton = By.id("login-button");
//private By errormess = By.cssSelector("")


public loginpage(WebDriver Driver) {
	this.driver=Driver;
}
//constructor
public void navigateto() {
	if(!driver.getCurrentUrl().equals(url)) {
		driver.get(url);
	}
	
}


//platform login action
public void login(String username, String password) {
	driver.findElement(usernameField).sendKeys(username);
	driver.findElement(passwordField).sendKeys(password);
	driver.findElement(loginButton).click();	
}

//public void geterrormess() {
//	return 
//}

}
