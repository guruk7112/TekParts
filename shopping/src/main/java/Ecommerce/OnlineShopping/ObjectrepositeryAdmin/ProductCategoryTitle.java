package Ecommerce.OnlineShopping.ObjectrepositeryAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCategoryTitle {

	WebDriver driver;
	public ProductCategoryTitle(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='admin']//i[contains(@class,'icon fa fa-sign-in')]")
	private WebElement adminLogin;
	
	public WebElement getAdminLogin() {
		return adminLogin;
	}
}
