package Ecommerce.OnlineShopping.module;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Ecommerce.OnlineShopping.ObjectrepositeryAdmin.AdminCategoryTitle;
import Ecommerce.OnlineShopping.ObjectrepositeryAdmin.BaseClass;
import Ecommerce.OnlineShopping.ObjectrepositeryAdmin.HomePageTitle;
import Ecommerce.OnlineShopping.ObjectrepositeryAdmin.SubCategoryPage;
import Ecommerce.OnlineShopping.ObjectrepositeryAdmin.insertProductPage;
import junit.framework.Assert;
public class AdminModulesTest extends BaseClass {

	@Test
	public void createCategoryTest() throws Throwable {
		AdminCategoryTitle create = new AdminCategoryTitle(driver);
		HomePageTitle ho = new HomePageTitle(driver);
		create.getCreateCategory().click();
		String catName = eLib.getDataFromExcel("MyAcount", 1, 6);
		String catDsc = eLib.getDataFromExcel("MyAcount", 1, 7);

		create.createCategoryBL(catName, catDsc);
		create.getLogout().click();
		String backToPage = eLib.getDataFromExcel("MyAcount", 1, 8);
		driver.navigate().to(backToPage);
		ho.getFeaturedProducts();
		String added = ho.getVerifycat().getText();

		Assert.assertEquals(added, "jndf");

	}

	@Test(groups="smoke")
	public void createSubCategory() throws Throwable {
		SubCategoryPage scategory = new SubCategoryPage(driver);
		scategory.getSubCategory().click();
		WebElement scat = scategory.getDdscat();
		wLib.select(scat, 5);
		scategory.getenterScat().click();
		String scatEnter = eLib.getDataFromExcel("MyAcount", 4, 0);
		scategory.getenterScat().sendKeys(scatEnter);
		scategory.getCreateButton().click();

	}

	@Test(groups="smoke")
	public void insertProductTest() throws Throwable {
		AdminCategoryTitle insert = new AdminCategoryTitle(driver);
		insertProductPage product = new insertProductPage(driver);

		String name = eLib.getDataFromExcel("MyAcount", 4, 1);
		String comapyName = eLib.getDataFromExcel("MyAcount", 4, 2);
		String Adiscount = eLib.getDataFromExcel("MyAcount", 4, 3);
		String Bdiscont = eLib.getDataFromExcel("MyAcount", 4, 4);

		insert.getInsertProduct().click();
		WebElement select = product.getCategoryDD();
		wLib.select(select, 162);
		product.insertProductDetails(name, comapyName, Adiscount, Bdiscont);
		product.getworkTxt().click();
		product.getfontSize().click();
		product.getsize5().click();
		String type = eLib.getDataFromExcel("MyAcount", 4, 5);
		product.getworkTxt().sendKeys(type);
		String shippingCharge = eLib.getDataFromExcel("MyAcount", 4, 6);

		product.getShipCaharge().click();

		product.getShipCaharge().sendKeys(shippingCharge);

		WebElement pavail = product.getpAvailablity();
		wLib.select(pavail, 1);
		product.getinsertBtn().click();
	}

	
	

}
