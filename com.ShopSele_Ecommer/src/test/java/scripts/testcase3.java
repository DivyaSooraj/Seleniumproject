package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import generlib.Utilities;
import pages.Finalcartpage;
import pages.Homepage;
import pages.Signinpage;
import pages.cartpage;
import pages.grocerypage;

public class testcase3 extends BaseTest {
	
	@Test
	
	public void tescase3()
	{
		
		Homepage h=new Homepage(driver);
		h.searchtb(Propertyfile.getpropertyfiledata("searchhomepage"));
		
		grocerypage g= new grocerypage(driver);
		Utilities.dropdown(g.getSortby(), (Propertyfile.getpropertyfiledata("Sort")));
		g.grocery();
		
		
		Signinpage s=new Signinpage(driver);
		s.sigin(Propertyfile.getpropertyfiledata("Username"), Propertyfile.getpropertyfiledata("Password"));
		
		cartpage c=new cartpage(driver);
		c.Homeandofficecart();
		
		
		Finalcartpage f=new Finalcartpage(driver);
		f.finalcart();
		
		
	}

}
