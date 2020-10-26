package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath="//a[@title=\"Groceries\"]")
	private WebElement Groceriestab;
	
	
	@FindBy(xpath="(//span[.=\"Shop homeware\"])[1]")
	private WebElement Shophomewaretab;
	
	@FindBy(xpath="(//input[@name=\"searchKey\"])[2]")
	private WebElement searchtab;
	
	@FindBy(xpath="(//span[@class=\"ui-icon\"])[2]")
	private WebElement searchbtn;

	@FindBy(xpath="(//span[.=\"Sign in\"])[1]")
	private WebElement signintab;
	
	
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void homeware()
	{
		Groceriestab.click();
		Shophomewaretab.click();
		
	}
	
	public void searchtb(String searchhomepage)
	{
		searchtab.sendKeys(searchhomepage);
		searchbtn.click();
		
		
	}
	
	public void signintb()
	
	{
		signintab.click();
	}
	
	

}
