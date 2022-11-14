package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains generic methods to read data from property file
 * @author Deepa
 *
 */
public class PropertyFileUtility {

	/**
	 * This method will read the specific key value from the property file 
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public Properties readDataFromPropertyFile(String key) throws Throwable
	{
		Properties pObj = new Properties();
		try {
		//Step 1: load the file to file input stream
		FileInputStream fis = new FileInputStream(IConstantsUtility.PropertyFilePath);
		
		//Step 2: create object of properties from java
		
		
		//Step 3: load the file to properties object
		pObj.load(fis);
		
		//step 4: read data thru the key
		String value = pObj.getProperty(key);
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return pObj;
	}
}
