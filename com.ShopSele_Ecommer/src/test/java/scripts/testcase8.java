package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import generlib.Utilities;
import pages.CareerPage;
import pages.HelpPage;
import pages.Homepage;
import pages.Homewarepage;
import pages.Signinpage;

public class testcase8 extends BaseTest {
	
	@Test
	public void tescase8()
	{
	
	
	Homepage h=new Homepage(driver);
	h.signintb();

	Signinpage s=new Signinpage(driver);
	s.sigin(Propertyfile.getpropertyfiledata("Username"), Propertyfile.getpropertyfiledata("Password"));
	
	Homewarepage hw=new Homewarepage(driver);
	hw.helptab();
	
	HelpPage hp=new HelpPage(driver);
	hp.careerlnk();
	
	CareerPage cr=new CareerPage(driver);
	Utilities.dropdown(cr.getJobareadd(), Propertyfile.getpropertyfiledata("jobarea"));
	Utilities.dropdown(cr.getJobfunctiondd(),  Propertyfile.getpropertyfiledata("jobfunction"));
	cr.careerfilter();

}
}
