package Ecommerce.OnlineShopping.ObjectrepositeryAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubCategoryPage {
	WebDriver driver;
	public SubCategoryPage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='subcategory.php']")
	private WebElement subCategory;
	
	public WebElement getSubCategory() {
		return subCategory;
	}
	@FindBy(xpath="//select[@name='category']")
	private WebElement ddscat;
	
	public WebElement getDdscat() {
		return ddscat;
	}
	@FindBy(xpath="//div[@class='controls']//input[@name='subcategory']")
	private WebElement enterScat;
	
	public WebElement getenterScat() throws InterruptedException {
		Thread.sleep(1000);
		return enterScat;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement createButton;
	
	public WebElement getCreateButton() {
		return createButton;
	}
	

	
	
	

}
