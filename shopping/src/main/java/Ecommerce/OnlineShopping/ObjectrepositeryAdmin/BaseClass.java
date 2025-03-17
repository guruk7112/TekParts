package Ecommerce.OnlineShopping.ObjectrepositeryAdmin;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.comcast.crm.generic.databaseutility.DataBaseUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import Ecommerce.OnlineShopping.GenericFileUtility.FileUtility.ExcelUtility;
import Ecommerce.OnlineShopping.GenericFileUtility.FileUtility.FileUtility;
import Ecommerce.OnlineShopping.GenericFileUtility.FileUtility.JsonUtility;

public class BaseClass {

	/* Create object */

	public DataBaseUtility dbLib = new DataBaseUtility();
	public FileUtility fLib = new FileUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JsonUtility jlib = new JsonUtility();
	public WebDriver driver ; // driver object created grobally

	@BeforeSuite(groups= { " smoke","integration","end to end"})
	public void configBS() throws SQLException {
		System.out.println("===Connect to DB , Report Config===");
		dbLib.getDbconnection();
	}

	@BeforeClass(groups= { " smoke","integration","end to end"})

	public void configBC() throws Throwable {
		System.out.println("===Launch the BROWSER===");

		String BROWSER = fLib.getDataFromPropertiesFile("browser");

		if (BROWSER.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("FireFox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		wLib.waitForPageToLoad(driver);

		String URL = fLib.getDataFromPropertiesFile("url");
		driver.get(URL);
	}

	@BeforeMethod(groups= { " smoke","integration","end to end"})
	public void configBM() throws Throwable {
		wLib.maximizeWindow(driver);
		ProductCategoryTitle category=new ProductCategoryTitle(driver);
		category.getAdminLogin().click();
		
	String username=	fLib.getDataFromPropertiesFile("un");
		String password=fLib.getDataFromPropertiesFile("pwd");
		AdminLoginTitle admin=new AdminLoginTitle(driver);
		admin.adminLogin(username, password);
		
	}

	@AfterMethod(groups= { " smoke","integration","end to end"})
	public void configAM() throws Throwable {
		System.out.println("===Logout to Application");
		insertProductPage insert=new insertProductPage(driver);
		//insert.AdminLogout();
		//String back=fLib.getDataFromPropertiesFile("home");
	//	driver.navigate().to(back);
    
	}

	@AfterClass(groups= { " smoke","integration","end to end"})
	public void configAC() {
		System.out.println("===Close the BROWSER===");
   // driver.close();
	}

	@AfterSuite(groups= { " smoke","integration","end to end"})
	public void configAS() throws SQLException {
		System.out.println("====Close DB , Report BackUp====");
		dbLib.closeDbconnection();
	}

}
