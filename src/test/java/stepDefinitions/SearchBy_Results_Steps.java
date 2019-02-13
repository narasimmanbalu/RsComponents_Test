package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductReedRelaysPage;
import pageObjects.ProductRelaysMainPage;
import pageObjects.ShoppingCartPage;

public class SearchBy_Results_Steps{

	WebDriver driver;
	WebDriverManager webDriverManager;
	PageObjectManager pageObjectManager;
	HomePage homePage;
	LoginPage loginPage;
	ProductRelaysMainPage productRelaysMainPage;
	ProductReedRelaysPage productReedRelaysPage;
	ShoppingCartPage shoppingCartPage;
	CheckOutPage checkOutPage;
	
}
