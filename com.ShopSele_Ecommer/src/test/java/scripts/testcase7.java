package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import pages.Homepage;
import pages.Homewarepage;
import pages.Signinpage;
import pages.StorelocatorPage;

public class testcase7 extends BaseTest{
	
	@Test
	
	public void tescase7()
	
	{
		
		Homepage h=new Homepage(driver);
		h.signintb();

		Signinpage s=new Signinpage(driver);
		s.sigin(Propertyfile.getpropertyfiledata("Username"), Propertyfile.getpropertyfiledata("Password"));
		
		Homewarepage hw=new Homewarepage(driver);
		hw.storelocatortb(Propertyfile.getpropertyfiledata("postcode"));
		
		StorelocatorPage sl=new StorelocatorPage(driver);
		sl.Storelocator();
		
	}

}
