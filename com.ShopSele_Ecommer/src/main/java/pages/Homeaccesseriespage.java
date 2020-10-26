package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeaccesseriespage {
	
	@FindBy(xpath="//input[@id=\"id_259523301_5\"]")
	private WebElement quantity;
	
	@FindBy(xpath="(//button[@class=\"button small add-control button-secondary\"])[6]")
	private WebElement Addbuttn;
	
	
	public Homeaccesseriespage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void homeaccesories(String Quantity)
	{
	
		quantity.clear();
		quantity.sendKeys(Quantity);
		Addbuttn.click();

}
}