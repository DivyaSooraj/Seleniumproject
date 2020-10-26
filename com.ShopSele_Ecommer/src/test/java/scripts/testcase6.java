package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import generlib.Utilities;
import pages.BookaslotPage;
import pages.Homepage;
import pages.Signinpage;
import pages.TypeofdeliveryPage;
import pages.cartpage;
import pages.grocerypage;

public class testcase6 extends BaseTest{
	
	@Test
	
	public void tescase6()
	{
		Homepage h=new Homepage(driver);
		h.searchtb(Propertyfile.getpropertyfiledata("searchhomepage"));
		
		grocerypage g= new grocerypage(driver);
		Utilities.dropdown(g.getSortby(), (Propertyfile.getpropertyfiledata("Sort")));
		g.grocery();
		
		
		Signinpage s=new Signinpage(driver);
		s.sigin(Propertyfile.getpropertyfiledata("Username"), Propertyfile.getpropertyfiledata("Password"));
		
		cartpage c=new cartpage(driver);
		c.bookaslotbtn();
		
		TypeofdeliveryPage t=new TypeofdeliveryPage(driver);
		t.Typeofdelivery();
		
	
		
	}

}
