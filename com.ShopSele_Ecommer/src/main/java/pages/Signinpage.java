package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
	
	@FindBy(id="username")
	private WebElement username;
	
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//span[.=\"Sign in\"]")
	private WebElement signinbtn;
	
	
	public Signinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sigin(String Username,String Password)
	{
		username.sendKeys(Username);
		password.sendKeys(Password);
		signinbtn.click();
		
	}
	

}
