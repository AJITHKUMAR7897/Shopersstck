package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatePage extends BasePage
{
	public UpdatePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="Home")
	private WebElement homeIcon;
	
	@FindBy(id="Name")
	private WebElement name;
	
	@FindBy(id="House/Office Info")
	private WebElement houseInfoAdd;
	
	@FindBy(id="Update Address")
	private WebElement updateAddress;
	
	
	
	public WebElement getName() {
		return name;
	}
	public WebElement getHomeIcon() {
		return homeIcon;
	}

	public WebElement getHouseInfoAdd() {
		return houseInfoAdd;
	}
	public WebElement getUpdateAddress() {
		return updateAddress;
	}
}

