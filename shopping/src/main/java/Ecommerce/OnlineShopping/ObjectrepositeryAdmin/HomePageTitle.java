package Ecommerce.OnlineShopping.ObjectrepositeryAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageTitle extends BaseClass{

	WebDriver driver;
	public HomePageTitle(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[contains(text(),'Featured Products')]")
	private WebElement featuredProducts;
	
	public WebElement getFeaturedProducts() {
		wLib.scrollToElement(driver, featuredProducts);
		return featuredProducts;
	}
	@FindBy(xpath="//a[@href='category.php?cid=160' and contains(text(),'luxurynormal luxury products')]")
	private WebElement verifycat;
	
	public WebElement getVerifycat() {
		return verifycat;
	}
	
	
}
