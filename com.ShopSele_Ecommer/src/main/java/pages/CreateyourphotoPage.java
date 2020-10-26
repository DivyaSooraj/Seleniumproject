package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateyourphotoPage {

	
	@FindBy(id="groupedoptions")
	private WebElement printsizedd;

	public WebElement getPrintsizedd() {
		return printsizedd;
	}
	
	@FindBy(xpath="//span[.=\"Choose your photos\"]")
	private WebElement chooseyourphotos;
	
	public CreateyourphotoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void choosephotbtn()
	{
		chooseyourphotos.click();
	}
	
	
}
