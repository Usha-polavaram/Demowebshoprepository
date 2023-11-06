package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Usha
 *
 */
public class PropertyUtility implements IAutoConstants{
	/**
	 * This method is developed to get the data from property file.
	 * This method accepts key as a parameter to fetch the data
	 * @param key
	 * @return
	 */
	public String getDataFromPropertyFile(String key)
	{
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream(Property_File_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return property.getProperty(key);
	}
}
