package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
	 
public class HomePage {
	 WebDriver driver;
	 
	 	public HomePage(WebDriver driver) {
	 	this.driver = driver;
	 	PageFactory.initElements(driver, this);
	 	}
	 
	 	@FindBy(how = How.ID, using = "js-logInOut") 
	 	private WebElement loginLink;
	 	
	 	@FindBy(how = How.CSS, using = ".menu.product-menu") 
	 	private WebElement allProductLink;
	 	
	 	@FindBy(how = How.CSS, using = ".icon-cart") 
	 	private WebElement clickShoppingCart;
	 	 	
	 	@FindBy(how = How.LINK_TEXT, using = "Relays") 
	 	private WebElement relays;
	 	
	 	@FindBy(how = How.ID, using = "js-logInOut") 
	 	private WebElement logoutLink;
	 	
	 	public void clickAllProductLink() {
	 	allProductLink.click();
	 	}
	 	 	
	 	public void clickLoginLink() {
	 	loginLink.click();
		}
	 	public void selectRelaysProduct() {
	 	relays.click();
		 }
	 	
	 	public void clickShoppingCart() {
	 	clickShoppingCart.click();
		}
	 	
	 	public void clickLogout() {
	 	logoutLink.click();
	 	driver.quit();
		}
	 	
	 	public void navigateToHomePage() {
	 	driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	 	}

}
