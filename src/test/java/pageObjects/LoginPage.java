package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "username")
	private WebElement userName;

	@FindBy(how = How.NAME, using = "j_password")
	private WebElement password;

	@FindBy(how = How.NAME, using = "loginBtn")
	private WebElement loginButton;

	public void login(String username, String pwd) {
		userName.sendKeys(username);
		password.sendKeys(pwd);
		loginButton.click();
	}
}
