package generlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class Propertyfile implements Autoconstant{
	

	public static String getpropertyfiledata(String keyvalue)
	{
		Properties p=new Properties();
		try
		{
		p.load(new FileInputStream(PropertyfilePath));
		}
		catch(Exception e)
		{
			Reporter.log("Data not taken from the PropertyFile",true);
		}
		
		return p.getProperty(keyvalue);

}
}
