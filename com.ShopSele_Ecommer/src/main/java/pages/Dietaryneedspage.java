package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dietaryneedspage {
	
	@FindBy(xpath="(//span[.=\"Vegetarian\"])[1]")
	private WebElement vegetariancheckbox;
	
	@FindBy(xpath="(//span[.=\"Save changes\"])[1]")
	private WebElement savechangesbtn;
	
	
	public Dietaryneedspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
public void Dietaryneeds()
{
	vegetariancheckbox.click();
	savechangesbtn.click();
}
}
