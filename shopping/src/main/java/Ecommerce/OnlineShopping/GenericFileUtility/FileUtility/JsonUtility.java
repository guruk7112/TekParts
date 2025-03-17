package Ecommerce.OnlineShopping.GenericFileUtility.FileUtility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {

	public String getDataFromJsonFile(String key) throws IOException, ParseException {
		FileReader fileR=new FileReader("C:\\Users\\Gurup\\git\\GiTBASH-REP1\\TekPyramidOSAFramework\\configAppData\\sales.json");
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(fileR);
		
		//convert java object into json object using down casting 
		JSONObject map=(JSONObject)obj;
		String  data=(String)map.get(key);
		return data;
		
	}
}
