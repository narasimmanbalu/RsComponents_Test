package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	WebDriver driver;

	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "checkoutSecurelyAndPuchBtn")
	private WebElement clickCheckout;

	@FindBy(how = How.XPATH, using = "//*[@id='shoppingBasketForm:WebBasketLineWidgetActionVALIDATION_ERROR_EVENT']/table/tbody/tr[3]/td[3]/div[2]/a")
	private WebElement removeItem;

	@FindBy(how = How.ID, using = "confirmDeleteContinue")
	private WebElement continueButton;

	@FindBy(how = How.ID, using = "js-logInOut")
	private WebElement logoutLink;

	@FindBy(how = How.CSS, using = ".rslogo")
	private WebElement headerLogo;

	public void clickHeaderLogo() {
		headerLogo.click();
	}

	public void clickCheckout() {
		clickCheckout.click();
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

	public void removeItemfromCart() throws InterruptedException {
		removeItem.click();
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		continueButton.click();
		Thread.sleep(1000);
	}

}
