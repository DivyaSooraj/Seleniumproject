package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	@FindBy(xpath="//span[.=\"Change password\"]")
	private WebElement changepassword;
	
	@FindBy(xpath="//span[.=\"Dietary needs\"]")
	private WebElement dietaryneedslnk;
	
	
	
	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
 public void myaccnt()
 
 {
	 changepassword.click();
 }
public void diet()
{
	dietaryneedslnk.click();
}
 
 
}
