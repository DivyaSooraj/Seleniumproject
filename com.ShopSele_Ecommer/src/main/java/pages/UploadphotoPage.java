package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadphotoPage {
	
	@FindBy(id="upload")
	private WebElement uploadpic;
	
public UploadphotoPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void uploadpicc(String photo)
{
	uploadpic.sendKeys(photo);
}

}
