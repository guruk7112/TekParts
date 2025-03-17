package Ecommerce.OnlineShopping.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.OnlineShoppin.GenericUtility.baseTest.BaseClass;

public class MyAccountTitle extends BaseClass {

	WebDriver driver;
	public MyAccountTitle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindAll( { @FindBy(name="name"),@FindBy(xpath="//input[@type='text']" )} )
	private WebElement profileName;
	
	@FindBy(id="exampleInputEmail1")
	private WebElement profileEmail;
	
	@FindBy(id="contactno")
	private WebElement profileContactNumber;
	
	@FindBy(name="update")
	private WebElement ProfileUpdateButton;
	

	
	public WebElement getProfileName() {
		return profileName;
	}

	public WebElement getProfileEmail() {
		return profileEmail;
	}

	public WebElement getProfileContactNumber() {
		wLib.scrollByAmt(driver, 200,200);;
		return profileContactNumber;
	}

	public WebElement getProfileUpdateButton() {
		return ProfileUpdateButton;
	}
	
	public void createNewAccount(String name,String email,String  contactNumber) {
		profileName.clear();
		profileName.sendKeys(name);
		wLib.scrollByAmt(driver, 200, 200);
		profileEmail.sendKeys(email);
		profileContactNumber.sendKeys(contactNumber);
		ProfileUpdateButton.click();		
	}
	
	@FindBy(xpath="//a[contains(text(),'Welcome -Dielan Sequence')]")
	private WebElement userIcon;
	
	public WebElement getuserIcon() {
		return userIcon;
	}
	
}
