package Ecommerce.OnlineShopping.ObjectrepositeryAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class insertProductPage extends BaseClass{

	WebDriver driver;
	public insertProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@name='category']")
	private WebElement categoryDD;
	
	public WebElement getCategoryDD() {
		return categoryDD;
	}
@FindBy(name="productName")
private WebElement productName;

@FindBy(name="productCompany")
private WebElement productComapyName;

@FindBy(name="productpricebd")
private WebElement $Bdiscount;

@FindBy(name="productprice")
private WebElement $Adiscount;

public WebElement getProductName() {
	return productName;
}

public WebElement getProductComapyName() {
	return productComapyName;
}

public WebElement get$Bdiscount() {
	return $Bdiscount;
}

public WebElement get$Adiscount() {
	return $Adiscount;
}
	public void insertProductDetails(String product,String company , String beforeDiscount , String afterDiscount) {
	productName.sendKeys(product);
	productComapyName.sendKeys(company);
	$Bdiscount.sendKeys(beforeDiscount);
	$Adiscount.sendKeys(afterDiscount);
	
	}
	@FindBy(xpath="//div[contains(@class,' nicEdit-main')]")
	private WebElement workTxt;
	
	public WebElement getworkTxt() {
		wLib.scrollByAmt(driver, 400, 400);
		return workTxt;
	}
	@FindBy(xpath="//div[contains(@class, 'nicEdit-selectContain')]//div[starts-with(@style,'overflow: hidden;')]/parent::div[@unselectable='on']//div[@class=' nicEdit-selectControl']//parent::div[1]")
	private WebElement fontSize;
	
	public WebElement getfontSize() {
		return fontSize;
	}
	@FindBy(xpath="//font[@size='5']/parent::div")
	private WebElement size5;
	
	public WebElement getsize5() {
		return size5;
	}
	@FindBy(name="productShippingcharge")
	private WebElement shipCaharge;
	
	public WebElement getShipCaharge() {
		return shipCaharge;
	}
	@FindBy(id="productAvailability")
			private WebElement pAvailablity;
	
	public WebElement getpAvailablity() {
		return pAvailablity;
	}

	@FindBy(name="submit")
	private WebElement insertBtn;
	
	public WebElement getinsertBtn() {
		return insertBtn;
	}
	@FindBy(className="nav-avatar")
	private WebElement avatar;
	
	public WebElement getAvatar() {
		return avatar;
	}
	@FindBy(xpath="//a[@href='logout.php' and text()='Logout']")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}
	
	public void AdminLogout() {
		avatar.click();
		logout.click();
	}
	
	}
	
	

