package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaslotPage {

	@FindBy(xpath="(//span[.=\"Wednesday 28th October, Between 22:00 - 23:00.\"])[2]")
	private WebElement dateslot;
	

	
	public BookaslotPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void bookslot()
	{
		
		dateslot.click();
	}
	
}
