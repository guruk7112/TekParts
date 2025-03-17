package Ecommerce.OnlineShopping.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.OnlineShoppin.GenericUtility.baseTest.BaseClass;

public class ProductCategoryTitle extends BaseClass {

	WebDriver driver;

	public ProductCategoryTitle(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='list-unstyled']//li[last()-1]")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}

	@FindBy(className = "search-field")
	private WebElement searchTF;

	public WebElement getsearchTF() {
		return searchTF;
	}

	@FindBy(className = "search-button")
	private WebElement searchButton;

	public WebElement getsearchButton() {
		return searchButton;
	}

	public void insertSearchTF(String product) {
		searchTF.sendKeys(product);
		searchButton.click();
	}
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	private WebElement addToCart;
	
	public WebElement getAddTOCart() {
	wLib.scrollByAmt(driver,500,500);
		return addToCart;
	}
	
	@FindBy(xpath="//a[@href='category.php?pid=41&&action=wishlist']")
	private WebElement wishlistButton;
	
	public WebElement getwishlistButton() {
		wLib.scrollByAmt(driver, 500, 500);
		return wishlistButton;
	}
	@FindBy(xpath="//a[@href='product-details.php?pid=26']")
	private WebElement jeweleryProduct;
	
	public WebElement getjeweleryProduct() {
		wLib.scrollByAmt(driver, 200, 200);
		return jeweleryProduct;
	}
	@FindBy(xpath="//a[@href='product-details.php?pid=24']/parent::div")
	private WebElement chandlier;
	
	public WebElement getchandlier() {
		return chandlier;
	}
	@FindBy(xpath="//a[@href='category.php?page=product&action=add&id=25']/button[@type='button']")
	private WebElement addToCartBook;
	
	public WebElement getAddToCartBook() {
		wLib.scrollByAmt(driver, 400, 400);
		return addToCartBook;
	}
}
