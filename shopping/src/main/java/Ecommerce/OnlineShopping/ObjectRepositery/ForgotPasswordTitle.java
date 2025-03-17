package Ecommerce.OnlineShopping.ObjectRepositery;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordTitle {

	WebDriver driver;
	public ForgotPasswordTitle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="exampleInputEmail1")
	private WebElement forgotEmail;
	
	public WebElement getForgotEmail() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argumetns[0].scrollIntoView(true);",forgotEmail);
		return forgotEmail;
	}
	@FindBy(name="contact")
	private WebElement forgotContact;
	
	public WebElement getForgotContact() {
		return forgotContact;
	}
	@FindBy(id="password")
	private WebElement forgotPassword;
	
	public WebElement getForgotPassword() {
		return forgotPassword;
	}
	@FindBy(id="confirmpassword")
	private WebElement confirmPassword;
	
	public WebElement getconfirmPassword() {
		return confirmPassword;
	}
	@FindBy(name="change")
	private WebElement changeBtn;
	
	public WebElement getChangeBtn() {
		return changeBtn;
	}
	public void fillForgotPassword(String fgEmail, String contact , String fgPassword,String cPassword) {
		forgotEmail.sendKeys(fgEmail);
		forgotContact.sendKeys(contact);
		forgotPassword.sendKeys(fgPassword);
		confirmPassword.sendKeys(cPassword);
		changeBtn.click();
	}
	@FindBy(xpath="//span[@style='color:red;']")
	private WebElement warningFg;
	
	public WebElement getWarningFg() {
		return warningFg;
	}
}
