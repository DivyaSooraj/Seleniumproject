package generlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
public static void dropdown(WebElement ele,String Text)
	
	{
		Select s=new Select(ele);
		s.selectByVisibleText(Text);
				
	}
	
	public static void mousehover(WebDriver driver, WebElement ele)
	{
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
			
	}
	
	public static void draganddrop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}

	public static void scrollbar(WebDriver driver,int x,int y)
	{
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.ScrollBy("+x+","+y+")");
	 
	}
	
}


