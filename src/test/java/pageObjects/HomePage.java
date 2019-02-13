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

	@FindBy(how = How.ID, using = "js-cookie-accept")
	private WebElement cookieAccept;

	@FindBy(how = How.CSS, using = ".menu.product-menu")
	private WebElement allProductLink;

	@FindBy(how = How.CSS, using = ".icon-cart")
	private WebElement clickShoppingCart;

	@FindBy(how = How.LINK_TEXT, using = "Relays")
	private WebElement relays;

	@FindBy(how = How.ID, using = "js-logInOut")
	private WebElement logoutLink;

	@FindBy(how = How.ID, using = "searchTerm")
	private WebElement searchField;

	@FindBy(how = How.ID, using = "btnSearch")
	private WebElement searchButton;

	@FindBy(how = How.XPATH, using = ".//*[@id='sidebar']/section/div[1]/div/ul/li/a/div")
	private WebElement catrgoryFilter;

	@FindBy(how = How.XPATH, using = ".//*[@id='filters']/div/div/rs-facets/a[1]")
	private WebElement brandFilter;

	@FindBy(how = How.CSS, using = ".filterCheckboxLabel")
	private WebElement selectBrand;

	@FindBy(how = How.CSS, using = ".btn.btn-primary.matches-btn.active")
	private WebElement applyFilter;

	@FindBy(how = How.CSS, using = ".fsrInvite")
	private WebElement popUpWindow;

	@FindBy(how = How.CSS, using = ".fsrButton.fsrButton__inviteClose.fsrAbandonButton")
	private WebElement popUpClose;

	public void clickAllProductLink() {
		allProductLink.click();
	}

	public void acceptCookie() {
		cookieAccept.click();
	}

	public void clickLoginLink() throws InterruptedException {
		cookieAccept.click();
		Thread.sleep(500);
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

	public void seachItem(String searchby) {
		searchField.click();
		searchField.sendKeys(searchby);
		searchButton.click();
	}

	public void navigateToHomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void categoryFilter() throws InterruptedException {
		catrgoryFilter.click();
		Thread.sleep(1000);
	}

	public void brandFilter() throws InterruptedException {
		brandFilter.click();
		selectBrand.click();
		Thread.sleep(1000);
	}

	public void applyFilter() throws InterruptedException {
		applyFilter.click();
		Thread.sleep(1000);
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} // try
		catch (Exception e) {
			return false;
		} // catch
	}
}
