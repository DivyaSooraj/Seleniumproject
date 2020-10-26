package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finalcartpage {
	
	@FindBy(xpath="//span[@class=\"icon-delete-item\"]")
	private WebElement deleteitem;
	
	
	public Finalcartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void finalcart()
	{
	
		deleteitem.click();
}
}