package Ecommerce.OnlineShopping.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodTitle {

	WebDriver driver;
	public PaymentMethodTitle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//form[@name='payment']//input[contains(@value,'Debit / Credit card')]")
	private WebElement cdCard;
	
	public WebElement getCDCard() {
		return cdCard;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement paySubmit;
	
	public WebElement getPaySubmit() {
		return paySubmit;
	}
	
	
}
