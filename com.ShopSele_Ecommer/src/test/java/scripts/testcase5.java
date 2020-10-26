package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import generlib.Utilities;
import pages.CreateyourphotoPage;
import pages.Homepage;
import pages.Homewarepage;
import pages.Signinpage;
import pages.TescoonlinephotoprintPage;
import pages.UploadphotoPage;

public class testcase5 extends BaseTest{
	
	@Test
	public void tescase5()
	{
		Homepage h=new Homepage(driver);
		h.signintb();
		
		Signinpage s= new Signinpage(driver);
		s.sigin(Propertyfile.getpropertyfiledata("Username"), Propertyfile.getpropertyfiledata("Password"));
		
		Homewarepage hw=new Homewarepage(driver);
		hw.tescopic();
		
		TescoonlinephotoprintPage p=new TescoonlinephotoprintPage(driver);
		p.createyourphoto();
		
		CreateyourphotoPage c=new CreateyourphotoPage(driver);
		Utilities.dropdown(c.getPrintsizedd(), Propertyfile.getpropertyfiledata("photosize"));
		c.choosephotbtn();
		
		UploadphotoPage u=new UploadphotoPage(driver);
		u.uploadpicc(Propertyfile.getpropertyfiledata("photo"));
		
		
		
	}
	
	
	
	

}
