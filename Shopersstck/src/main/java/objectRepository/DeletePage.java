package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePage extends BasePage
{
	public DeletePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="(//*[name()='svg' and @data-testid='DeleteIcon'])[1]")
	private WebElement deleteIcon;
	

	@FindBy(xpath="(//button[text()='Yes'])[1]")
	private WebElement clickYes;

	public WebElement getDeleteIcon() {
		return deleteIcon;
	}

	public WebElement getClickYes() {
		return clickYes;
	}
}
