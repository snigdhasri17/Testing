package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page_factor {
private WebDriver Driver;

private final String url = "https://www.saucedemo.com/"  ;
@FindBy(id="user-name")
	private WebElement usernameField;
@FindBy(id="password" )
private WebElement passwrdField;
@FindBy(id="login-button")
private WebElement loginbutton;
@FindBy(css="h3[data-test='error']")
private WebElement errormess;
//constructor

public page_factor(WebDriver Driver) {
	this.Driver=Driver;
	PageFactory.initElements(Driver,this);
	
}

public void Login(String user,String pass) {
	usernameField.sendKeys(user);
	passwrdField.sendKeys(pass);
	loginbutton.click();
}

}
