package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage
{
	public LogoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="///div[text()='A']")
	private WebElement Settingsicon;
	
	@FindBy(xpath="(//li[@role='menuitem'])[7]")
	private WebElement logout;

	public WebElement getSettingsicon() {
		return Settingsicon;
	}

	public WebElement getLogout() {
		return logout;
	}
}
