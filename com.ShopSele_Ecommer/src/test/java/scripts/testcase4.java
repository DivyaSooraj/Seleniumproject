package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import pages.Homepage;
import pages.Homewarepage;
import pages.MyAccountPage;
import pages.Signinpage;
import pages.changepasswordpage;

public class testcase4 extends BaseTest {
	
	@Test
	
	public void tescase4()
	
	
	{
		
		Homepage h=new Homepage(driver);
		h.signintb();
		
		Signinpage s= new Signinpage(driver);
		s.sigin(Propertyfile.getpropertyfiledata("Username"), Propertyfile.getpropertyfiledata("Password"));
		
		Homewarepage hw=new Homewarepage(driver);
		hw.Myaccount();
		
		
		MyAccountPage a=new MyAccountPage(driver);
		a.myaccnt();
		
		
		changepasswordpage c=new changepasswordpage(driver);
		c.chngpssword(Propertyfile.getpropertyfiledata("currentpasword"),Propertyfile.getpropertyfiledata("newpasword"),Propertyfile.getpropertyfiledata("confirmpasword"));
		
		
	}

}
