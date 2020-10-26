package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TescoonlinephotoprintPage {

	@FindBy(xpath="//div[.=\"Create yours now\"]")
	private WebElement createyourphoto;
	
	
	public TescoonlinephotoprintPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createyourphoto()
	{
		createyourphoto.click();
	}
	
}
