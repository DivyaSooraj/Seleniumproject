package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import pages.Homepage;
import pages.Homewarepage;
import pages.Signinpage;

public class testcase10 extends BaseTest {
	
	@Test
	
	public void tescase10()
	{
	
	Homepage h=new Homepage(driver);
	h.signintb();
	
	Signinpage s= new Signinpage(driver);
	s.sigin(Propertyfile.getpropertyfiledata("Username"), Propertyfile.getpropertyfiledata("Password"));
	
	Homewarepage hw=new Homewarepage(driver);
	hw.signout();
	

}
}
