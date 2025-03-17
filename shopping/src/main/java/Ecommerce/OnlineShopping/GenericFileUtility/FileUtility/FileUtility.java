package Ecommerce.OnlineShopping.GenericFileUtility.FileUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropertiesFile(String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Gurup\\eclipse-workspace\\shopping\\src\\main\\resources\\data.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String data = pObj.getProperty(key);   //key means key value in property file
		
		return data;
	}

}
