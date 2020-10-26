package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homewarepage {
	
	@FindBy(xpath="//p[.=\"Home and office\"]")
	private WebElement Homeandoffice;
	
	
	@FindBy(xpath="(//span[.=\"My account\"])[1]")
	private WebElement Myaccounttab;
	
	@FindBy(xpath="//a[@title=\"Tesco photo\"]")
	private WebElement tescophoto;
	
	@FindBy(xpath="//span[.=\"Online photo printing\"]")
	private WebElement Onlinephotoprint;
	
	@FindBy(xpath="(//span[.=\"Store locator\"])[1]")
	private WebElement storelocatortab;
	
	@FindBy(xpath="(//input[@name=\"address\"])[1]")
	private WebElement postcodetb;
	
	@FindBy(xpath="(//span[.=\"Find store\"])[1]")
	private WebElement postcodegobtn;
	
	
	@FindBy(xpath="(//span[.=\"Help\"])[1]")
	private WebElement helptab;
	
	
	@FindBy(xpath="//span[.=\"Sign Out\"]")
	private WebElement signouttab;
	
	public Homewarepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
 public void Homeandoffice()
 {
	 Homeandoffice.click();
 }
 
 public void Myaccount()
 {
	 Myaccounttab.click();
 }
 
 public void tescopic()
 {
	 tescophoto.click();
	 Onlinephotoprint.click();
 }
 
 public void storelocatortb(String postcode)
 {
	 storelocatortab.click();
	 postcodetb.sendKeys(postcode);
	 postcodegobtn.click();
 }
 
 public void helptab()
 {
	 helptab.click();
 }
 
 public void signout()
 {
	 signouttab.click();
 }

}
