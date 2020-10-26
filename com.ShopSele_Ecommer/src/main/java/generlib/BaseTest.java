package generlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconstant {
	
	public WebDriver driver;

	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get(Propertyfile.getpropertyfiledata("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void CloseApp(ITestResult r)
	{
		int status=r.getStatus();
		String name=r.getName();
		if(status==2)
		{
			Screenshots.getphoto(driver,name);
		}
		
	 //driver.close();
	}

}
