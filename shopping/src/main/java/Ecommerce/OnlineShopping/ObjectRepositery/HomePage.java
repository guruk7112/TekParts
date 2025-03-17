package Ecommerce.OnlineShopping.ObjectRepositery;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 WebDriver driver;
 public HomePage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 @FindBys({ @FindBy(xpath="//i[contains(@class,'icon fa fa-desktop fa-fw')]"),@FindBy(xpath="//a[@href='category.php?cid=3']" )})
 private WebElement subCategory;
 
public WebElement getSubCategory() {
	return subCategory;
}
 
 
}
