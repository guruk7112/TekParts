package Ecommerce.OnlineShopping.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.OnlineShoppin.GenericUtility.baseTest.BaseClass;

public class MyCartTitle extends BaseClass {

	WebDriver driver;
	public MyCartTitle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement myAccountLink;
	
	public WebElement getmyAccountLink() {
		return myAccountLink;
	}
	
	@FindBy(xpath="//a[contains(text(),' Electronics')]")
	private WebElement electronicsLink;
	
	public WebElement getelectronicsLink() {
		return electronicsLink;
	}
	@FindBy(xpath="//h4[@class='cart-product-description']")
	private WebElement productName;
	
	public WebElement getproductName() {
	return productName;
	}
	@FindBy(xpath="//a[@href='category.php?cid=8']")
	private WebElement jeweleryCategory;
	
	public WebElement getjeweleryCategory(){
		return jeweleryCategory;
	}
	@FindBy(xpath="//a[contains(text(),' Home Decor')]")
	private WebElement homeDecorLink;
	
	public WebElement gethomeDecorLink() {
		return homeDecorLink;
	}
	@FindBy(xpath="//span[@class='ir']")
	private WebElement quantityUp;
	
	public WebElement getQuantityUp() throws Exception {
		
			for(int i=1;i<40;i++) {
                quantityUp.click();			}
				return quantityUp;
	}
	@FindBy(name="submit")
	private WebElement updateShoppingCart;
	
	public WebElement getUpdateShoppingCart() throws Exception {

		wLib.scrollByAmt(driver, 0, 400);
		return updateShoppingCart;
	}
	@FindBy(xpath="//a[contains(text(),' sports')][last()]")
	private WebElement sportsLink;
	
	public WebElement getSportsLink() {
		return sportsLink;
	}
	@FindBy(name="ordersubmit")
	private WebElement checkOut;
	
	public WebElement getCheckout() {
		wLib.scrollByAmt(driver, 0, 500);
		return checkOut;
	}
		
}