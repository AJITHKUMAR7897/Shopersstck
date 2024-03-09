package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage
{

	public Homepage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//[*name()='svg' and @data-testid='SettingsIcon']")
	private WebElement settingsIcon;
	
	@FindBy(xpath="//ul[@role='menu']/li[1]")
	private WebElement myProfile;

	public WebElement getSettingsIcon() {
		return settingsIcon;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

}
