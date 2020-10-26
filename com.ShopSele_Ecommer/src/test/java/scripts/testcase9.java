package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import pages.Dietaryneedspage;
import pages.Homepage;
import pages.Homewarepage;
import pages.MyAccountPage;
import pages.Signinpage;

public class testcase9 extends BaseTest {
	

	@Test
	
	public void tescase9()
	
	
	{
		
		Homepage h=new Homepage(driver);
		h.signintb();
		
		Signinpage s= new Signinpage(driver);
		s.sigin(Propertyfile.getpropertyfiledata("Username"), Propertyfile.getpropertyfiledata("Password"));
		
		Homewarepage hw=new Homewarepage(driver);
		hw.Myaccount();
		
		
		MyAccountPage a=new MyAccountPage(driver);
		a.diet();
		
		Dietaryneedspage d= new Dietaryneedspage(driver);
		d.Dietaryneeds();
		

}
}
