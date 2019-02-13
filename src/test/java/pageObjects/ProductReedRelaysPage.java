package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductReedRelaysPage {
	WebDriver driver;

	public ProductReedRelaysPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = ".recAddToBasket [data-recsku='2919704']")
	private WebElement addProductSPDTReedRelays;

	public void addProductReedRelaysToCart() {
		addProductSPDTReedRelays.click();
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
