package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {
	
	@FindBy(xpath="(//span[@class=\"icon-cart\"])[2]")
	private WebElement Cart;
	
	@FindBy(xpath="(//span[.=\"Book a slot\"])[1]")
	private WebElement bookaslotbtn;
	
	public cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Homeandofficecart()
	 {
		 Cart.click();
	 }
	
	public void bookaslotbtn()
	{
		bookaslotbtn.click();
	}
}
