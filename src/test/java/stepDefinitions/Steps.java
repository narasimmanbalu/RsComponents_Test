package stepDefinitions;

import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductReedRelaysPage;
import pageObjects.ProductRelaysMainPage;
import pageObjects.ShoppingCartPage;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	WebDriverManager webDriverManager;
	PageObjectManager pageObjectManager;
	HomePage homePage;
	LoginPage loginPage;
	ProductRelaysMainPage productRelaysMainPage;
	ProductReedRelaysPage productReedRelaysPage;
	ShoppingCartPage shoppingCartPage;
	CheckOutPage checkOutPage;

	@Given("^User is in Home Page and click login link$")
	public void user_is_in_Home_Page_and_click_login_link() throws Throwable {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateToHomePage();
		homePage.clickLoginLink();
	}

	@When("^user enters \"([^\"]*)\"  and \"([^\"]*)\" and click login button$")
	public void user_enters_and_and_click_login_button(String username, String pwd) throws Throwable {
		loginPage = pageObjectManager.getLoginPage();
		loginPage.login(username, pwd);
	}

	@And("^user click on the All Product link and select Relay as main product type$")
	public void user_click_on_the_All_Product_link_and_select_Relay_as_main_product_type() throws Throwable {
		homePage = pageObjectManager.getHomePage();
		homePage.isAlertPresent();
		homePage.clickAllProductLink();
		homePage.selectRelaysProduct();
	}

	@When("^select on Reed Relay as sub product$")
	public void select_on_Reed_Relay_as_sub_product() throws Throwable {
		productRelaysMainPage = pageObjectManager.getProductRelaysMainPage();
		productRelaysMainPage.isAlertPresent();
		productRelaysMainPage.selectReedRelaysProduct();
	}

	@When("^add spdt Reed Relay product to shoppig cart$")
	public void add_spdt_Reed_Relay_product_to_shoppig_cart() throws Throwable {
		productReedRelaysPage = pageObjectManager.getProductReedRelaysPage();
		productReedRelaysPage.isAlertPresent();
		productReedRelaysPage.addProductReedRelaysToCart();
	}

	@Then("^click checkout link on Cart page$")
	public void click_checkout_link_on_Cart_page() throws Throwable {
		homePage = pageObjectManager.getHomePage();
		homePage.isAlertPresent();
		homePage.clickShoppingCart();
		shoppingCartPage = pageObjectManager.getShoppingCartPage();
		shoppingCartPage.isAlertPresent();
		shoppingCartPage.clickCheckout();
		checkOutPage = pageObjectManager.getCheckOutPage();
		checkOutPage.isAlertPresent();
		checkOutPage.clickHeaderLogo();
	}

	@Then("^logout from application$")
	public void logout_from_application() throws Throwable {
		homePage = pageObjectManager.getHomePage();
		homePage.isAlertPresent();
		homePage.clickLogout();
	}

	@When("^click on shopping cart$")
	public void click_on_shopping_cart() throws Throwable {
		homePage = pageObjectManager.getHomePage();
		homePage.isAlertPresent();
		homePage.clickShoppingCart();
	}

	@When("^click removelink on added item$")
	public void click_removelink_on_added_item() throws Throwable {
		shoppingCartPage = pageObjectManager.getShoppingCartPage();
		shoppingCartPage.isAlertPresent();
		shoppingCartPage.removeItemfromCart();
		shoppingCartPage.isAlertPresent();
		shoppingCartPage.clickHeaderLogo();
	}

	@When("^user search the item with \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_search_the_item_with_as(String searchby, String value) throws Throwable {
		homePage.isAlertPresent();
		homePage.seachItem(value);
	}

	@When("^filter by first Categories$")
	public void filter_by_first_Categories() throws Throwable {
		homePage.isAlertPresent();
		homePage.categoryFilter();
	}

	@When("^filter by Brand$")
	public void filter_by_Brand() throws Throwable {
		homePage.isAlertPresent();
		homePage.brandFilter();
	}

	@When("^apply filters for the search results$")
	public void apply_filters_for_the_search_results() throws Throwable {
		homePage.isAlertPresent();
		homePage.applyFilter();
	}

	@When("^click on New Product link$")
	public void click_on_New_Product_link() throws Throwable {
		homePage.isAlertPresent();
		homePage.clickNewProduct();
	}

	@When("^click Batteries from Categories$")
	public void click_Batteries_from_Categories() throws Throwable {
		homePage.isAlertPresent();
		homePage.clickNewProductBatteries();
	}

}
