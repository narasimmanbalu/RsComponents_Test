package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductRelaysMainPage {
	WebDriver driver;

	public ProductRelaysMainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = ".card.js-tile [href='/web/c/relays/reed-relays/reed-relays/']")
	private WebElement productReedRelays;

	public void selectReedRelaysProduct() throws InterruptedException {
		productReedRelays.click();
		Thread.sleep(500);
	}

}
