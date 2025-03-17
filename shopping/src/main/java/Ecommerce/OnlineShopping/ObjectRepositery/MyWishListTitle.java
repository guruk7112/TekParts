package Ecommerce.OnlineShopping.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishListTitle {

	WebDriver driver;
	public MyWishListTitle(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='R&J']")
	private WebElement productInWishList;
	
	public WebElement getproductInWishList() {
		return productInWishList;
	}
	@FindBy(xpath="//i[contains(@class,'fa fa-times')]")
	private WebElement xremove;
	
	public WebElement getxRemove() {
		return xremove;
	}
}
