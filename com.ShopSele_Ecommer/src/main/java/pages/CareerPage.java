package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {
	
	@FindBy(id="type")
	private WebElement jobareadd;

	public WebElement getJobareadd() {
		return jobareadd;
	}
	
	
	@FindBy(id="jobfunction")
	private WebElement jobfunctiondd;

	public WebElement getJobfunctiondd() {
		return jobfunctiondd;
	}
	
	@FindBy(xpath="(//span[.=\"Search and Apply\"])[3]")
	private WebElement filtersubmitbtn;
	
	public CareerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void careerfilter()
	{
		filtersubmitbtn.click();
	}
	

}
