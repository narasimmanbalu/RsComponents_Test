package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductReedRelaysPage;
import pageObjects.ProductRelaysMainPage;
import pageObjects.ShoppingCartPage;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	private ProductRelaysMainPage productRelaysMainPage;
	private ProductReedRelaysPage productReedRelaysPage;
	private ShoppingCartPage shoppingCartPage;
	private CheckOutPage checkOutPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public ProductRelaysMainPage getProductRelaysMainPage() {
		return (productRelaysMainPage == null) ? productRelaysMainPage = new ProductRelaysMainPage(driver)
				: productRelaysMainPage;
	}

	public ProductReedRelaysPage getProductReedRelaysPage() {
		return (productReedRelaysPage == null) ? productReedRelaysPage = new ProductReedRelaysPage(driver)
				: productReedRelaysPage;
	}

	public ShoppingCartPage getShoppingCartPage() {
		return (shoppingCartPage == null) ? shoppingCartPage = new ShoppingCartPage(driver) : shoppingCartPage;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}

	public CheckOutPage getCheckOutPage() {
		return (checkOutPage == null) ? checkOutPage = new CheckOutPage(driver) : checkOutPage;
	}

}
