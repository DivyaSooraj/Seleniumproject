package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class changepasswordpage {
	
	@FindBy(id="current-password")
	private WebElement currentpassword;
	
	@FindBy(id="new-password")
	private WebElement newpassword;
	
	@FindBy(id="confirm-password")
	private WebElement confirmpassword;
	
	
	@FindBy(xpath="//span[.=\"Save changes\"]")
	private WebElement savechanges;

	public changepasswordpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void chngpssword(String currentpasword,String newpasword,String confirmpasword )
	{
		currentpassword.sendKeys(currentpasword);
		newpassword.sendKeys(newpasword);
		confirmpassword.sendKeys(confirmpasword);
		savechanges.click();
	}
	

}
