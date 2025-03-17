package Ecommerce.OnlineShopping.ObjectrepositeryAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminCategoryTitle {

	WebDriver driver;
	public AdminCategoryTitle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='menu-icon icon-tasks']/parent::a[@href='category.php']")
	private WebElement createCategory;
	
	public WebElement getCreateCategory() {
		return createCategory;
	}
	@FindBy(name="category")
	private WebElement categoryName;
	
	public WebElement getCategoryName() {
		return categoryName;
	}
	@FindBy(className="span8")
	private WebElement categoryDescription;
	
	public WebElement getCategoryDescription() {
		return categoryDescription;
	}
	@FindBy(name="submit")
	private WebElement createButton;
	
	public WebElement getCreateButton() {
		return createButton;
	}
	public void createCategoryBL(String category,String description) {
		categoryName.sendKeys(category);
		categoryDescription.sendKeys(description);
		createButton.click();
	}
	@FindBy(xpath="//a[@href='logout.php']//i")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(xpath="//i[@class='menu-icon icon-paste']/parent::a[@href='insert-product.php']")
	private WebElement insertProduct;
	
	public WebElement getInsertProduct() {
		return insertProduct;
	}
	
	
	
	

}
