package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {

	@FindBy(xpath="//a[@data-ltc=\"careers\"]")
	private WebElement careersbtn;
	
	
	public HelpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void careerlnk()
	{
		careersbtn.click();
	}
	
}
