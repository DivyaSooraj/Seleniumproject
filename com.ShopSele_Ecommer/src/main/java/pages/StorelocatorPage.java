package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorelocatorPage {
	
	
	
	@FindBy(xpath="//label[.=\"Grocery Click+Collect\"]")
	private WebElement filter;
	
	
	
	@FindBy(xpath="(//i[@class=\"ddl-icon ddl-icon--xs toggle_icon ddl-icon--fat\"])[1]")
	private WebElement locationbtn;
	
	public StorelocatorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Storelocator()
	{
		filter.click();
		locationbtn.click();
	}
	

}
