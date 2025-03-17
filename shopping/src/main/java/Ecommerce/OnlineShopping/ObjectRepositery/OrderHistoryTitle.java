package Ecommerce.OnlineShopping.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.OnlineShoppin.GenericUtility.baseTest.BaseClass;

public class OrderHistoryTitle extends BaseClass {

	WebDriver driver;
	public OrderHistoryTitle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Track')]/ancestor::tbody//tr//td[last()]")
	private WebElement track;
	
	public WebElement getTrack() {
		return track;
	}
	@FindBy(xpath="//b")
	private WebElement tracked;
	
	public WebElement getTracked() {
	wLib.switchToTabOnURL(driver, "track-order.php?oid=4");
		return tracked;
	}
}
