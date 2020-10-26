package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import pages.Homeaccesseriespage;
import pages.Homepage;
import pages.Homewarepage;
import pages.Signinpage;
import pages.cartpage;

public class testcase1 extends BaseTest{

	@Test
	
	public void tescase1()
	{
		Homepage h=new Homepage(driver);
		h.homeware();
		
		Homewarepage hw=new Homewarepage(driver);
		hw.Homeandoffice();
		
		Homeaccesseriespage ha=new Homeaccesseriespage(driver);
		ha.homeaccesories(Propertyfile.getpropertyfiledata("Quantity"));
		
		Signinpage s=new Signinpage(driver);
		s.sigin(Propertyfile.getpropertyfiledata("Username"), Propertyfile.getpropertyfiledata("Password"));
		
		cartpage c=new cartpage(driver);
		c.Homeandofficecart();
				
		
	}
	
}
