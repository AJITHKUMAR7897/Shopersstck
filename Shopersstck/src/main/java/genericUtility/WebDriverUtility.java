package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility
{
	public WebElement element;
	public void clickOnElement(WebElement element) 
	{
		element.click();
	}
	public String sendText(WebElement element ,String text)
	{
		element.sendKeys(text);
		return text;
	}
	public String fetchTitle(WebDriver driver) {
		return driver.getTitle();
	}	
	public String fetchUrl(WebDriver driver) 
	{
		return driver.getCurrentUrl();
	}
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void dismissalert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public String fetchAlertText(WebDriver driver)
	{
		String alertText=driver.switchTo().alert().getText();
		return alertText;
	}
	public void selectByIndex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectByValue(WebElement element,String value) 
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void selectByVisibleText(WebElement element,String visibleText)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}

}
