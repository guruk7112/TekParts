package Ecommerce.OnlineShopping.ObjectrepositeryAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginTitle {

	WebDriver driver;
	public AdminLoginTitle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='span12' and @id='inputEmail']")
	private WebElement adminUserName;
	
	public WebElement getAdminUserName() {
		return adminUserName;
	}
	@FindBy(xpath="//input[@placeholder='Password' and @id='inputPassword']")
	private WebElement adminPassword;
	
	public WebElement getAdminPassword() {
		return adminPassword;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void adminLogin(String un,String pwd) {
		adminUserName.sendKeys(un);
		adminPassword.sendKeys(pwd);
		loginBtn.click();
	}
	
	
	
}
