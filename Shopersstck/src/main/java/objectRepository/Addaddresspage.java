package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addaddresspage extends BasePage
{
	public Addaddresspage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement addingaddress;
	
	@FindBy(id="Home")
	private WebElement home;
	
	@FindBy(id="Name")
	private WebElement name;
	
	@FindBy(id="House/Office Info")
	private WebElement houseinfo;
	
	@FindBy(id="Street Info")
	private WebElement streetInfo;
	
	@FindBy(id="Landmark")
	private WebElement landmark;
	
	@FindBy(id="Country")
	private WebElement country;
	
	@FindBy(id="State")
	private WebElement state;
	
	@FindBy(id="City")
	private WebElement city;
	
	@FindBy(id="Pincode")
	private WebElement pincode;
	
	@FindBy(id="Phone Number")
	private WebElement phonenumber;
	
	@FindBy(id="btnDisabled")
	private WebElement addaddress1;

	public WebElement getAddingaddress() {
		return addingaddress;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getHouseinfo() {
		return houseinfo;
	}

	public WebElement getStreetInfo() {
		return streetInfo;
	}

	public WebElement getLandmark() {
		return landmark;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getAddaddress1() {
		return addaddress1;
	}
}
