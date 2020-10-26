package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class grocerypage {
	
	@FindBy(xpath="(//span[@class=\"filter-select--label specific-filter-label\"])[1]")
	private WebElement freshvegdd;
	
	
	@FindBy(xpath="//label[@title=\"Fresh Vegetables\"]")
	private WebElement freshvegcheckbox;
	

	@FindBy(xpath="//span[.=\"Potatoes & Sweet\"]")
	private WebElement potatonswtchckbx;
	

	@FindBy(id="sort-by")
	private WebElement sortby;
	

	public WebElement getSortby() {
		return sortby;
	}


	@FindBy(xpath="(//button[@type=\"submit\"])[4]")
	private WebElement addtocart;


	public grocerypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void grocery()
	{
		
		freshvegdd.click();
		freshvegcheckbox.click();
		potatonswtchckbx.click();
		addtocart.click();
	}
	

}
