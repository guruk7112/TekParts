package Ecommerce.OnlineShopping.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.OnlineShoppin.GenericUtility.baseTest.BaseClass;

public class ProductDetailsTitle extends BaseClass {

	WebDriver driver;
public 	ProductDetailsTitle(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='REVIEW']")
private WebElement reviewLink;

public WebElement getReviewlink() {
	wLib.scrollByAmt(driver, 800, 800);
	return reviewLink;
}
@FindBy(xpath="//input[@class='radio' and @value='5']")
private WebElement qualityRadio5;

public WebElement getqualityRadio5() {
	return qualityRadio5;
}
@FindBy(xpath="//td[text()='Price']/following-sibling::td[4]")
private WebElement priceRadio4;

public WebElement getpriceRadio4() {
	return priceRadio4;
}
@FindBy(xpath="//td[text()='Value']/following-sibling::td[3]")
private WebElement valueRadio3;

public WebElement getvalueRadio3() {
	wLib.scrollByAmt(driver, 200, 200);
	return valueRadio3;
}
@FindBy(id="exampleInputName")
private WebElement reviewName;

public WebElement getreviewName() {
	return reviewName;
}
@FindBy(id="exampleInputReview")
private WebElement reviewInfo;

public WebElement getreviewIngo() {
	return reviewInfo;
}
@FindBy(name="submit")
private WebElement reviewSubmitButton;

public WebElement getreviewSubmitButton() {
	return reviewSubmitButton;
}
@FindBy(name="summary")
private WebElement summary;

public WebElement getsummary() {
	return summary;
}
@FindBy(xpath="//a[@class='btn btn-primary'] ")
private WebElement chandlierWishBtn;

public WebElement getchandlierWishBtn() {
	return chandlierWishBtn;
}
@FindBy(xpath="//a[contains(@class,'btn btn-primary')]/i[contains(@class,'fa fa-shopping-cart inner-right-vs')]")
private WebElement sportCart;

public WebElement getSportCart() {
	wLib.scrollByAmt(driver, 0, 300);
	return sportCart;
}


}
