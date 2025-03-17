package Ecommerce.OnlineShopping.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.OnlineShoppin.GenericUtility.baseTest.BaseClass;

public class SignInTitle extends BaseClass{

	WebDriver driver;
	public SignInTitle(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="email")
	private WebElement signemail;
	
	@FindBy(name="password")
	private WebElement signpassword;
	
	@FindBy(name="login")
	private WebElement signInButton;
	
	public WebElement getSEmail() {
		return signemail;	
		}
	public WebElement getSpassword() {
		return signpassword;
	}
	public WebElement getSignInButton() {
		return signInButton;
	}
	public void lignToApp(String email,String password) {
		signemail.sendKeys(email);
		signpassword.sendKeys(password);
		wLib.scrollByAmt(driver, 200, 200);
		signInButton.click();
	}
	@FindBy(xpath="//a[@href=\"logout.php\"]")
	private WebElement logout;
	
	public WebElement getlogout() {
		return logout;
	}
	@FindBy(xpath="//a[text()='Forgot your Password?']/parent::div//a")
	private WebElement forgotPassword;
	
	public WebElement getForgotPassword() {
		wLib.scrollByAmt(driver, 0, 300);
		return forgotPassword;
	}
	
}
