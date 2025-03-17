package Ecommerce.OnlineShopping.module;

/**
 * @author GuruKiran
 * 
 */

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Ecommerce.OnlineShoppin.GenericUtility.baseTest.BaseClass;
import Ecommerce.OnlineShopping.ObjectRepositery.ForgotPasswordTitle;
import Ecommerce.OnlineShopping.ObjectRepositery.HomePage;
import Ecommerce.OnlineShopping.ObjectRepositery.MyAccountTitle;
import Ecommerce.OnlineShopping.ObjectRepositery.MyCartTitle;
import Ecommerce.OnlineShopping.ObjectRepositery.MyWishListTitle;
import Ecommerce.OnlineShopping.ObjectRepositery.OrderHistoryTitle;
import Ecommerce.OnlineShopping.ObjectRepositery.PaymentMethodTitle;
import Ecommerce.OnlineShopping.ObjectRepositery.ProductCategoryTitle;
import Ecommerce.OnlineShopping.ObjectRepositery.ProductDetailsTitle;
import Ecommerce.OnlineShopping.ObjectRepositery.SignInTitle;

public class ShoppingTest extends BaseClass {

	@Test(groups = "smoke")
	/* Creating new Account */
	public void MyAcountTest() throws Throwable {

		MyCartTitle cart = new MyCartTitle(driver);
		cart.getmyAccountLink().click();

		String name = eLib.getDataFromExcel("MyAcount", 1, 0);
		String email = eLib.getDataFromExcel("MyAcount", 1, 1);
		String contactNumber = eLib.getDataFromExcel("MyAcount", 1, 2);

		MyAccountTitle account = new MyAccountTitle(driver);
		account.createNewAccount(name, email, contactNumber);
		Thread.sleep(1000);
		wLib.alertHandling(driver);

	}

	@Test(groups = "end to end")
	/* adding product to cart */
	public void AddToCartTest() throws Throwable {
		MyCartTitle cart = new MyCartTitle(driver);
		ProductCategoryTitle category = new ProductCategoryTitle(driver);
		cart.getelectronicsLink().click();

		String product = eLib.getDataFromExcel("MyAcount", 1, 3).trim();
		category.insertSearchTF(product);

		category.getAddTOCart().click();

		wLib.alertHandling(driver);

	}

	@Test(groups = "end to end")
	/* adding product to wishlist and verifying */
	public void WishListTest() throws Throwable {
		ProductCategoryTitle category = new ProductCategoryTitle(driver);
		MyWishListTitle wish = new MyWishListTitle(driver);

		String product = eLib.getDataFromExcel("MyAcount", 2, 3).trim();
		category.insertSearchTF(product);

		category.getwishlistButton().click();

		String wishproduct = wish.getproductInWishList().getText();
		Assert.assertEquals(wishproduct, product);
	}

	@Test(groups = "end to end")
	public void fillReviewTest() throws Throwable {
		MyCartTitle cart = new MyCartTitle(driver);
		ProductCategoryTitle category = new ProductCategoryTitle(driver);
		ProductDetailsTitle details = new ProductDetailsTitle(driver);

		cart.getjeweleryCategory().click();
		category.getjeweleryProduct().click();
		Thread.sleep(2000);
		details.getReviewlink().click();
		details.getqualityRadio5().click();
		details.getpriceRadio4().click();
		details.getvalueRadio3().click();

		String reviewName = eLib.getDataFromExcel("MyAcount", 2, 0);
		details.getreviewName().sendKeys(reviewName);

		String reviewInfo = eLib.getDataFromExcel("MyAcount", 2, 4);
		details.getreviewIngo().sendKeys(reviewInfo);
		String summary = eLib.getDataFromExcel("MyAcount", 1, 5);
		details.getsummary().sendKeys(summary);

		details.getreviewSubmitButton().click();
	}

	@Test(groups = "integration")
	public void removeFromWishListTest() {
		MyCartTitle cart = new MyCartTitle(driver);
		ProductCategoryTitle category = new ProductCategoryTitle(driver);
		ProductDetailsTitle details = new ProductDetailsTitle(driver);
		MyWishListTitle wish = new MyWishListTitle(driver);

		cart.gethomeDecorLink().click();
		category.getchandlier().click();
		details.getchandlierWishBtn().click();
		wish.getxRemove().click();
		wLib.alertHandling(driver);

	}

	@Test(groups = "integration")
	public void QuantityVerificationTest() throws Exception {
		MyCartTitle cart = new MyCartTitle(driver);
		ProductCategoryTitle category = new ProductCategoryTitle(driver);

		cart.getelectronicsLink().click();
		HomePage subCategory = new HomePage(driver);
		subCategory.getSubCategory().click();
		category.getAddToCartBook().click();
		wLib.alertHandling(driver);
		cart.getQuantityUp();
		cart.getUpdateShoppingCart().click();
		Thread.sleep(1000);
		wLib.alertHandling(driver);
	}

	@Test(groups = "end to end")
	public void forgotPasswordInvlidTest() throws Throwable {
		SignInTitle sign = new SignInTitle(driver);
		String pemial = fLib.getDataFromPropertiesFile("fgEmail");
		String pContact = fLib.getDataFromPropertiesFile("fgContact");
		String pPassword = fLib.getDataFromPropertiesFile("fgPassword");
		String pCpassword = fLib.getDataFromPropertiesFile("fgConfirmPassword");

		sign.getlogout().click();
		ProductCategoryTitle category = new ProductCategoryTitle(driver);
		category.getLoginLink().click();

		sign.getForgotPassword().click();
		ForgotPasswordTitle fp = new ForgotPasswordTitle(driver);
		fp.fillForgotPassword(pemial, pContact, pPassword, pCpassword);
		WebElement warning = fp.getWarningFg();
		Assert.assertTrue(warning.isDisplayed());
	}

	@Test(groups="end to end")
	public void trackOrderTest() throws Throwable {
		MyCartTitle category = new MyCartTitle(driver);
		ProductCategoryTitle cat = new ProductCategoryTitle(driver);
		ProductDetailsTitle add = new ProductDetailsTitle(driver);
		PaymentMethodTitle pay = new PaymentMethodTitle(driver);
		OrderHistoryTitle track = new OrderHistoryTitle(driver);

		category.getSportsLink().click();
		String bat = eLib.getDataFromExcel("MyAcount", 6, 3);
		WebElement product = driver.findElement(By.xpath("//a[text()='" + bat + "']"));
		wLib.scrollByAmt(driver, 0, 400);
		product.click();
		add.getSportCart().click();
		wLib.alertHandling(driver);
		category.getCheckout().click();
		WebElement cdradio = pay.getCDCard();
		cdradio.click();
		Assert.assertTrue(cdradio.isDisplayed());
		pay.getPaySubmit().click();

		track.getTrack().click();
	   
		String dis = eLib.getDataFromExcel("MyAcount", 6, 0);
		Assert.assertFalse(dis.isBlank());


	}
}
